/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.procedure.TLongProcedure
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.procedure.TLongProcedure;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eOf
 */
public abstract class eof_2<F extends epq_2>
extends va_0 {
    protected final eoo_2 r;
    private boolean k = false;
    @NotNull
    private final eoh_1 l;
    @NotNull
    protected final emx_1<F> s;
    final Map<Long, eon_2> t = new HashMap<Long, eon_2>();

    protected <TFight extends We & elv_0<F>> eof_2(@NotNull TFight TFight, @NotNull eoh_1 eoh_12, @NotNull eoo_2 eoo_22, @NotNull vd_0 vd_02, @NotNull vg_0 vg_02) {
        super(((elv_0<F>)TFight).c(), vg_02, TFight, vd_02);
        this.l = eoh_12;
        this.s = TFight;
        this.r = eoo_22;
    }

    @Override
    protected TLongArrayList o() {
        return super.o();
    }

    @Override
    public void s() {
        super.s();
        this.H();
    }

    private void H() {
        this.a().a(eos_2.a());
        this.Q();
    }

    protected void Q() {
    }

    public TLongArrayList S() {
        return this.c.j();
    }

    public abstract void K();

    @Override
    protected void D() {
    }

    @NotNull
    public emx_1<F> T() {
        return this.s;
    }

    @Override
    public void a(long l, boolean bl, vw_0 vw_02) {
        if (this.t.containsKey(l)) {
            a.error((Object)this.a("\u00c9chec de l'ajout \u00e0 la Timeline de " + l + " (pr\u00e9sent dans les fighters stock\u00e9s)"));
            this.B(l);
            return;
        }
        super.a(l, bl, vw_02);
    }

    @Override
    public void w(long l) {
        if (!this.c.b(l)) {
            a.error((Object)this.a("\u00c9chec du stockage des \u00e9v\u00e9nements pour " + l + " : fighter absent"));
            return;
        }
        short s2 = this.c.e(l);
        if (this.r(l)) {
            s2 = (short)(s2 + 1);
        }
        int n = this.k(l);
        eon_2 eon_22 = new eon_2(s2, n);
        this.d.a(l);
        this.t.put(l, eon_22);
        super.h(l);
    }

    public void B(long l) {
        if (!this.t.containsKey(l)) {
            a.error((Object)this.a("\u00c9chec de restauration des \u00e9v\u00e9nements pour " + l + " : absent des fighters stock\u00e9s"));
            return;
        }
        this.d.b(l);
        int n = this.t.remove(l).b();
        this.a(l, true, new vw_0(n, Vx.b));
    }

    @Override
    protected void u(long l) {
        int n = this.o().indexOf(l);
        if (n == -1) {
            a.warn((Object)"A onFighterAdded event was triggered but the fighter is not in the turn order");
            return;
        }
        this.t.forEach((l2, eon_22) -> {
            if (l2 == l) {
                return;
            }
            TLongArrayList tLongArrayList = this.c.k();
            if (tLongArrayList == null) {
                eon_22.a(n);
                return;
            }
            int n2 = tLongArrayList.indexOf(l);
            int n3 = tLongArrayList.indexOf(l2.longValue());
            if (n2 != -1 && n3 != -1 && n2 > n3) {
                return;
            }
            eon_22.a(n);
        });
    }

    @Override
    protected void v(long l) {
        int n = this.o().indexOf(l);
        if (n == -1) {
            a.warn((Object)"A onFighterRemoved event was triggered but the fighter is not in the turn order (may be logical)");
            return;
        }
        this.t.forEach((l2, eon_22) -> {
            if (l2 != l) {
                eon_22.b(n);
            }
        });
    }

    @Override
    public boolean h(long l) {
        if (!this.t.containsKey(l)) {
            a.error((Object)this.a("Cannot remove fighter with id " + l + " from the timeline because it's not in it."));
            return false;
        }
        this.t.remove(l);
        return true;
    }

    @Override
    public short a(VW vW) {
        if (this.c.b(vW.c())) {
            return super.a(vW);
        }
        int n = vW.e() - this.e;
        if (vW.d()) {
            ++n;
        }
        if (this.t.containsKey(vW.c()) && !this.t.get(vW.c()).a(this.e)) {
            --n;
        }
        return (short)n;
    }

    @Override
    public int B() {
        int n = super.B() + 1;
        for (long l : this.t.keySet()) {
            n += 8 + this.t.get(l).c();
        }
        int n2 = this.s.j().size();
        return n += 1 + n2 * 12;
    }

    @Override
    protected void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        byteBuffer.put((byte)this.t.size());
        Object object = this.t.keySet().iterator();
        while (object.hasNext()) {
            long l = object.next();
            byteBuffer.putLong(l);
            this.t.get(l).a(byteBuffer);
        }
        object = this.s.j();
        byteBuffer.put((byte)object.size());
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            epq_2 epq_22 = (epq_2)iterator.next();
            byteBuffer.putLong(epq_22.a_());
            byteBuffer.putInt(this.l.a(epq_22.a_()));
        }
    }

    @Override
    protected void C() {
        super.C();
        this.t.clear();
    }

    public void C(long l) {
        this.c.a(l, this.e, true, 1);
    }

    @Override
    protected void a(vz_0 vz_02, ByteBuffer byteBuffer) {
        int n;
        super.a(vz_02, byteBuffer);
        int n2 = byteBuffer.get();
        for (n = 0; n < n2; ++n) {
            long l = byteBuffer.getLong();
            eon_2 eon_22 = eon_2.a(vz_02, l, byteBuffer);
            this.t.put(l, eon_22);
        }
        n = byteBuffer.get();
        for (int k = 0; k < n; ++k) {
            long l = byteBuffer.getLong();
            int n3 = byteBuffer.getInt();
            ((eoi_1)this.l).d(l, n3);
        }
    }

    @Override
    public StringBuilder F() {
        StringBuilder stringBuilder = super.F();
        stringBuilder.append(" S:[");
        if (!this.t.isEmpty()) {
            for (long l : this.t.keySet()) {
                stringBuilder.append(l).append(',');
            }
            stringBuilder.setLength(stringBuilder.length() - 1);
        }
        stringBuilder.append(']');
        stringBuilder.append(" E:[");
        this.o().forEach((TLongProcedure)new eog_2(this, stringBuilder));
        stringBuilder.setLength(stringBuilder.length() - 1);
        stringBuilder.append("]/");
        stringBuilder.append(this.l.a());
        stringBuilder.append(" I:[");
        this.S().forEach((TLongProcedure)new eoh_2(this, stringBuilder));
        stringBuilder.setLength(stringBuilder.length() - 1);
        stringBuilder.append(']');
        return stringBuilder;
    }

    @NotNull
    public eoh_1 a() {
        return this.l;
    }

    public void c(int n) {
        this.k = false;
        this.l.a(n);
        this.Q();
    }

    public long D(long l) {
        epq_2 epq_22 = (epq_2)this.s.i(l);
        if (epq_22 == null) {
            a.error((Object)("Tried to get the turn duration of the fighter with id " + l + " which doesn't exist in the timeline"));
            return -1L;
        }
        if (epq_22.a(erl_2.F) || epq_22.a(erl_2.L)) {
            return enp_2.a.c(ens_2.aT);
        }
        if (this.g() && !epq_22.gk()) {
            return this.k();
        }
        long l2 = this.m();
        if (l2 < 5000L) {
            a.error((Object)("[FIGHT] Turn for fighter [" + epq_22 + "] has a base duration of only " + l2 + " ms, that's a problem ; m_currentTurnEndTimestamp=" + this.f + " ; current time =" + wc_0.p().getTimeInMillis()));
        }
        return l2;
    }

    @Override
    protected long g(long l) {
        int n = this.l.b(l) ? 30000 : 0;
        epq_2 epq_22 = (epq_2)this.s.i(l);
        if (epq_22 == null) {
            return n;
        }
        if (!epq_22.a(eqr_1.d) && !epq_22.a(eqr_1.b)) {
            return n;
        }
        long l2 = enp_2.a.c(ens_2.aU);
        long l3 = enp_2.a.c(ens_2.aV);
        long l4 = enp_2.a.c(ens_2.aW);
        long l5 = enp_2.a.c(ens_2.aX);
        int n2 = epq_22.c(eps_0.c);
        int n3 = epq_22.c(eps_0.d);
        int n4 = epq_22.c(eps_0.e);
        long l6 = epq_22.a(eoz_1.X) ? 0L : l2 * (long)n2;
        long l7 = l3 * (long)n3;
        long l8 = (long)n4 * l4;
        long l9 = l6 + l7 + l8;
        return Hw.a(l9, 0L, l5) + (long)n;
    }
}

