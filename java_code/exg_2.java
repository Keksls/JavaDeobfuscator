/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eXg
 */
public abstract class exg_2
implements gq_1<tc_2>,
Iterable<exk_2> {
    public static final int a = 2175;
    public static final int b = 5;
    private static final int i = 2;
    private static final Logger j = Logger.getLogger(exg_2.class);
    protected long c;
    protected int d;
    protected final TK<exk_2, vf_2> e;
    protected byte f;
    protected final tt_0<exk_2> g;
    protected final List<exc_1> h = new ArrayList<exc_1>();

    protected exg_2(long l, int n, tt_0 tt_02, short s2) {
        this.c = l;
        this.e = new TK<exk_2, vf_2>(eyo_1.g(), tt_02, s2, true);
        this.e.a(Ui.a);
        this.f = 0;
        this.d = n;
        this.g = tt_02;
        this.c();
    }

    public void c() {
        int[] nArray = exd_1.a.a(this.d);
        if (nArray != null) {
            this.a(new eyq_1(nArray, this.g));
        } else {
            this.a(this.g);
        }
    }

    public void a(tt_0<exk_2> tt_02) {
        this.e.a(tt_02);
    }

    public int d() {
        return this.d;
    }

    public byte e() {
        return this.f;
    }

    public void a(byte by) {
        this.b(by);
    }

    public long f() {
        return this.c;
    }

    public TK<exk_2, vf_2> g() {
        return this.e;
    }

    public short h() {
        return this.e.k();
    }

    public int i() {
        return this.e.b();
    }

    public boolean a(exk_2 exk_22, short s2) {
        return this.e.c(exk_22, s2);
    }

    public boolean a(long l, short s2) {
        return this.e.c(l, s2);
    }

    @Override
    public boolean a(exk_2 exk_22) {
        return this.e.h(exk_22);
    }

    public boolean b(exk_2 exk_22, short s2) {
        return this.e.b(exk_22, s2);
    }

    @Override
    public boolean b(exk_2 exk_22) {
        return this.e.j(exk_22);
    }

    public void j() {
        this.e.i();
    }

    public void a(Uo uo) {
        if (uo == null) {
            return;
        }
        this.e.b(uo);
    }

    public void b(Uo uo) {
        this.e.a(uo);
    }

    @Override
    @NotNull
    public Iterator<exk_2> iterator() {
        return this.e.iterator();
    }

    public exk_2 a(short s2) {
        return this.e.e(s2);
    }

    @Override
    public boolean a(tc_2 tc_22) {
        tc_22.a = this.c;
        tc_22.b = this.d;
        tc_22.d = this.e.k();
        tc_22.c = this.f;
        for (exk_2 exk_22 : this.e) {
            if (!exk_22.j()) continue;
            wc_2 wc_22 = new wc_2();
            wc_22.a = this.e.b(exk_22.a());
            boolean bl = exk_22.a(wc_22.b);
            if (bl) {
                tc_22.e.a.add(wc_22);
                continue;
            }
            j.error((Object)("Impossible de convertir l'item \u00e0 la position " + wc_22.a + " sous forme d\u00e9s\u00e9rialis\u00e9e brute"));
            return false;
        }
        return true;
    }

    @Override
    public boolean b(tc_2 tc_22) {
        this.c = tc_22.a;
        this.d = tc_22.b;
        this.b(tc_22.c);
        this.e.a(tc_22.d);
        this.a(exb_1.o);
        if (!exg_2.a(this.r(), this.f)) {
            j.error((Object)("La position (" + this.f + ") du sac " + this.c + " refId=" + this.d + " est incorrecte"));
        }
        boolean bl = true;
        for (wc_2 wc_22 : tc_22.e.a) {
            exk_2 exk_22 = this.e.f().a(wc_22.b);
            if (exk_22 == null) continue;
            try {
                if (this.c(exk_22, wc_22.a)) continue;
                bl = false;
            }
            catch (uz_0 uz_02) {
                bl = false;
                j.error((Object)uz_02);
            }
            catch (Uy uy) {
                bl = false;
                j.error((Object)uy);
            }
            catch (uc_0 uc_02) {
                bl = false;
                j.error((Object)uc_02);
            }
        }
        this.c();
        return bl;
    }

    public int k() {
        return this.e.aO_();
    }

    public void a(tw_0<exk_2> tw_02) {
        this.e.a(tw_02);
    }

    public short l() {
        return this.e.a();
    }

    public short c(exk_2 exk_22) {
        return this.e.f(exk_22);
    }

    public boolean c(exk_2 exk_22, short s2) {
        return this.a(exk_22, s2, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(exk_2 exk_22, short s2, @Nullable ug_0 ug_02) {
        if (ug_02 != null) {
            this.e.a(ug_02);
        }
        try {
            boolean bl = this.e.a(exk_22, s2);
            return bl;
        }
        finally {
            if (ug_02 != null) {
                this.e.b(ug_02);
            }
        }
    }

    public short d(exk_2 exk_22) {
        return this.e.d(exk_22);
    }

    public short a(long l) {
        return this.e.b(l);
    }

    public int m() {
        return this.e.c();
    }

    public exk_2 b(short s2) {
        return this.e.b(s2);
    }

    public boolean e(exk_2 exk_22) {
        return this.e.b(exk_22);
    }

    public boolean n() {
        return this.e.m();
    }

    @Override
    public boolean a(int n) {
        return this.e.b(n);
    }

    @Override
    public boolean b(long l) {
        return this.e.d(l);
    }

    public boolean b(long l, short s2) {
        return this.a(l, s2, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(long l, short s2, @Nullable ug_0 ug_02) {
        if (ug_02 != null) {
            this.e.a(ug_02);
        }
        try {
            boolean bl = this.e.a(l, s2);
            return bl;
        }
        finally {
            if (ug_02 != null) {
                this.e.b(ug_02);
            }
        }
    }

    public exk_2 c(long l) {
        return this.e.e(l);
    }

    public exk_2 b(int n) {
        for (exk_2 exk_22 : this.e) {
            if (n != exk_22.T().F().d()) continue;
            return exk_22;
        }
        return null;
    }

    public exk_2 a(exq_1 exq_12) {
        for (exk_2 exk_22 : this.e) {
            if (!exk_22.T().F().c(exq_12)) continue;
            return exk_22;
        }
        return null;
    }

    public exk_2 a(ext_1 ext_12) {
        for (exk_2 exk_22 : this.e) {
            if (!exk_22.T().b(ext_12)) continue;
            return exk_22;
        }
        return null;
    }

    public tt_0<exk_2> o() {
        return this.e.e();
    }

    public boolean f(exk_2 exk_22) {
        return this.e.a(exk_22);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(exk_2 exk_22, @Nullable Uo uo) {
        if (uo != null) {
            this.e.a(uo);
        }
        try {
            boolean bl = this.e.a(exk_22);
            return bl;
        }
        finally {
            if (uo != null) {
                this.e.b(uo);
            }
        }
    }

    public boolean g(exk_2 exk_22) {
        return this.e.e(exk_22);
    }

    public exk_2 c(int n) {
        return this.e.c(n);
    }

    public exk_2 a(int n, tw_0<exk_2> tw_02) {
        return this.e.a(n, tw_02);
    }

    public exk_2 d(long l) {
        return this.e.c(l);
    }

    public int p() {
        short s2 = this.e.k();
        int n = 0;
        for (short s3 = 0; s3 < s2; s3 = (short)(s3 + 1)) {
            if (!this.e.d(s3)) continue;
            ++n;
        }
        return n;
    }

    public ArrayList<exk_2> d(int n) {
        return this.e.d(n);
    }

    public ArrayList<exk_2> b(int n, tw_0<exk_2> tw_02) {
        return this.e.b(n, tw_02);
    }

    public ArrayList<exk_2> b(tw_0<exk_2> tw_02) {
        return this.e.b(tw_02);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName()).append(" ").append(this.f()).append("{\n");
        stringBuilder.append("\t").append("RefId ").append(this.d()).append("\n");
        for (short s2 = 0; s2 < this.e.k(); s2 = (short)(s2 + 1)) {
            exk_2 exk_22 = this.e.e(s2);
            stringBuilder.append("\t");
            if (exk_22 != null) {
                stringBuilder.append(s2).append(" : ").append(exk_22.e()).append("x").append(exk_22.aT_()).append("; ");
            } else {
                stringBuilder.append(s2).append(" : ").append("null").append("; ");
            }
            if (s2 != this.e.k() / 2 - 1) continue;
            stringBuilder.append("\n");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean q() {
        return this.d() == 2175;
    }

    public boolean r() {
        return exd_1.a.b(this.d);
    }

    public static boolean a(exk_2 exk_22, epq_2 epq_22) {
        short s2 = epq_22.dt();
        if (exk_22.c() > s2) {
            return false;
        }
        apc_2 apc_22 = exk_22.T().a(exz_1.c);
        if (apc_22 != null) {
            return apc_22.b(epq_22, exk_22, null, epq_22.ge());
        }
        return true;
    }

    public static boolean a(boolean bl, byte by) {
        if (bl && by <= 3) {
            return false;
        }
        byte by2 = bl ? (byte)5 : 3;
        return by >= 0 && by <= by2;
    }

    @Override
    public boolean a(TObjectProcedure<exk_2> tObjectProcedure) {
        return this.e.a(tObjectProcedure);
    }

    public short h(exk_2 exk_22) {
        return this.e.k(exk_22);
    }

    public abstract exg_2 a();

    public void e(int n) {
        this.d = n;
    }

    public void e(long l) {
        this.c = l;
    }

    protected void b(byte by) {
        byte by2 = this.f;
        this.f = by;
        for (exc_1 exc_12 : this.h) {
            exc_12.onPositionChanged(by2, by);
        }
    }

    public void c(short s2) {
        this.e.a(s2);
    }

    public void a(exc_1 exc_12) {
        this.h.add(exc_12);
    }

    public void b(exc_1 exc_12) {
        this.h.remove(exc_12);
    }
}

