/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TByteIntHashMap
 *  gnu.trove.map.hash.TLongIntHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TByteIntHashMap;
import gnu.trove.map.hash.TLongIntHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eXh
 */
public abstract class exh_1 {
    private static final Logger a = Logger.getLogger(exh_1.class);
    public static final Comparator<exg_2> c = new exi_1();
    public static final Comparator<exg_2> i = (exg_22, exg_23) -> {
        boolean bl = exg_22.r();
        boolean bl2 = exg_23.r();
        if (bl && !bl2) {
            return -1;
        }
        if (!bl && bl2) {
            return 1;
        }
        return c.compare((exg_2)exg_22, (exg_2)exg_23);
    };
    protected final TLongObjectHashMap<exg_2> j = new TLongObjectHashMap();
    protected final ArrayList<exa_1> k = new ArrayList();

    public boolean c(long l) {
        return this.j.containsKey(l);
    }

    public exg_2 d(long l) {
        return (exg_2)this.j.get(l);
    }

    public exg_2 e(long l) {
        TLongObjectIterator tLongObjectIterator = this.j.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            exg_2 exg_22 = (exg_2)tLongObjectIterator.value();
            if (exg_22.f() != l) continue;
            return exg_22;
        }
        return null;
    }

    public TLongObjectIterator<exg_2> i() {
        return this.j.iterator();
    }

    public <T extends exg_2> Collection<T> j() {
        return this.j.valueCollection();
    }

    public exg_2 a(exk_2 exk_22) {
        for (exg_2 exg_22 : this.a(i)) {
            if (exg_22.e.e().a(exg_22.e, exk_22) < 0) continue;
            return exg_22;
        }
        return null;
    }

    public exg_2 b(exk_2 exk_22) {
        for (exg_2 exg_22 : this.a(i)) {
            if (exg_22.e.e().a(exg_22.e, exk_22) != 0) continue;
            return exg_22;
        }
        return null;
    }

    public Cm<exg_2, Short> a(exk_2 exk_22, long l) {
        for (exg_2 exg_22 : this.a(i)) {
            if (exg_22.f() == l || exg_22.e.e().a(exg_22.e, exk_22) < 0) continue;
            return new Cm<exg_2, Short>(exg_22, exg_22.e.g(exk_22));
        }
        return null;
    }

    public exg_2 f(long l) {
        for (exg_2 exg_22 : this.a(c)) {
            if (!exg_22.e.d(l)) continue;
            return exg_22;
        }
        return null;
    }

    public exg_2 c(exk_2 exk_22) {
        return this.a(exk_22, (ug_0)null);
    }

    public exg_2 a(exk_2 exk_22, ug_0 ug_02) {
        return this.a(exk_22, false, (Uo)ug_02);
    }

    public exg_2 a(exk_2 exk_22, boolean bl) {
        return this.a(exk_22, bl, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public exg_2 a(exk_2 exk_22, boolean bl, @Nullable Uo uo) {
        exg_2 exg_22 = null;
        if (exk_22.aR_() > 1) {
            exg_22 = this.e(exk_22);
        }
        if (exg_22 == null) {
            exg_22 = this.a(exk_22);
        }
        if (exg_22 == null) {
            return null;
        }
        TK<exk_2, vf_2> tK = exg_22.e;
        try {
            if (uo != null) {
                tK.a(uo);
            }
            if (tK.a(exk_22)) {
                if (bl && !tK.e(exk_22)) {
                    exk_22.release();
                }
                exg_2 exg_23 = exg_22;
                return exg_23;
            }
        }
        catch (uz_0 uz_02) {
            a.error((Object)"Capacit\u00e9 de l'inventaire cible atteinte. Erreur, on a r\u00e9cup\u00e9r\u00e9 ce sac comme disponible pour cet objet !", (Throwable)uz_02);
        }
        catch (Uy uy) {
            a.error((Object)"L'item \u00e9tait d\u00e9ja pr\u00e9sent dans le sac de destination. ID Dupliqu\u00e9 ?", (Throwable)uy);
        }
        finally {
            if (uo != null) {
                tK.b(uo);
            }
        }
        return null;
    }

    public exg_2 d(exk_2 exk_22) {
        return this.a(exk_22, null);
    }

    public exg_2 a(exk_2 exk_22, @Nullable ezn_0 ezn_02) {
        TLongObjectIterator tLongObjectIterator = this.j.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            exg_2 exg_22 = (exg_2)tLongObjectIterator.value();
            if (ezn_02 != null) {
                exg_22.g().a(ezn_02);
            }
            boolean bl = exg_22.e.b(exk_22);
            if (ezn_02 != null) {
                exg_22.g().b(ezn_02);
            }
            if (!bl) continue;
            return exg_22;
        }
        return null;
    }

    public void a(tw_0<exk_2> tw_02) {
        this.j.forEachValue((TObjectProcedure)new exj_1(this, tw_02));
    }

    public int c(int n) {
        int n2 = 0;
        TLongObjectIterator tLongObjectIterator = this.j.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            exg_2 exg_22 = (exg_2)tLongObjectIterator.value();
            n2 += exg_22.e.a(n);
        }
        return n2;
    }

    public int a(int n, int n2) {
        return this.a(n, n2, null);
    }

    public int a(int n, int n2, ezn_0 ezn_02) {
        int n3 = 0;
        TLongObjectIterator tLongObjectIterator = this.j.iterator();
        while (tLongObjectIterator.hasNext() && n2 > 0) {
            tLongObjectIterator.advance();
            exg_2 exg_22 = (exg_2)tLongObjectIterator.value();
            exg_22.b(ezn_02);
            n3 += exg_22.e.a(n, n2 - n3);
            exg_22.a(ezn_02);
            if (n3 < n2) continue;
            return n3;
        }
        return n3;
    }

    public void k() {
        TLongObjectIterator tLongObjectIterator = this.j.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ((exg_2)tLongObjectIterator.value()).e.j();
        }
    }

    public exk_2 g(long l) {
        return this.a(l, null);
    }

    public exk_2 a(long l, @Nullable ezn_0 ezn_02) {
        TLongObjectIterator tLongObjectIterator = this.j.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            exg_2 exg_22 = (exg_2)tLongObjectIterator.value();
            if (ezn_02 != null) {
                exg_22.g().a(ezn_02);
            }
            exk_2 exk_22 = exg_22.e.c(l);
            if (ezn_02 != null) {
                exg_22.g().b(ezn_02);
            }
            if (exk_22 == null) continue;
            return exk_22;
        }
        return null;
    }

    public short h(long l) {
        TLongObjectIterator tLongObjectIterator = this.j.iterator();
        short s2 = 0;
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            s2 = (short)(s2 + ((exg_2)tLongObjectIterator.value()).e.a(l));
        }
        return s2;
    }

    public boolean a(long l, short s2) {
        return this.a(l, s2, null);
    }

    public boolean a(long l, short s2, @Nullable ug_0 ug_02) {
        boolean bl = false;
        TLongObjectIterator tLongObjectIterator = this.j.iterator();
        while (tLongObjectIterator.hasNext() && !bl) {
            tLongObjectIterator.advance();
            bl = ((exg_2)tLongObjectIterator.value()).a(l, s2, ug_02);
        }
        return bl;
    }

    public ts_0 d(int n) {
        for (exg_2 exg_22 : this.a(c)) {
            exk_2 exk_22 = exg_22.e.c(n);
            if (exk_22 == null) continue;
            return exk_22;
        }
        return null;
    }

    public exk_2 a(exq_1 exq_12) {
        for (exg_2 exg_22 : this.a(c)) {
            exk_2 exk_22 = exg_22.a(exq_12);
            if (exk_22 == null) continue;
            return exk_22;
        }
        return null;
    }

    public exk_2 a(ext_1 ext_12) {
        for (exg_2 exg_22 : this.a(c)) {
            exk_2 exk_22 = exg_22.a(ext_12);
            if (exk_22 == null) continue;
            return exk_22;
        }
        return null;
    }

    public exk_2 e(int n) {
        for (exg_2 exg_22 : this.a(c)) {
            exk_2 exk_22 = exg_22.c(n);
            if (exk_22 == null) continue;
            return exk_22;
        }
        return null;
    }

    public exk_2 a(int n, tw_0<exk_2> tw_02) {
        for (exg_2 exg_22 : this.a(c)) {
            exk_2 exk_22 = exg_22.a(n, tw_02);
            if (exk_22 == null) continue;
            return exk_22;
        }
        return null;
    }

    public exk_2 l() {
        for (exg_2 exg_22 : this.a(c)) {
            for (exk_2 exk_22 : exg_22.e) {
                if (exk_22 == null) continue;
                return exk_22;
            }
        }
        return null;
    }

    public exg_2 f(int n) {
        for (exg_2 exg_22 : this.a(c)) {
            exk_2 exk_22 = exg_22.e.c(n);
            if (exk_22 == null) continue;
            return exg_22;
        }
        return null;
    }

    public exk_2 i(long l) {
        for (exg_2 exg_22 : this.j.valueCollection()) {
            exk_2 exk_22 = exg_22.e.e(l);
            if (exk_22 == null) continue;
            return exk_22;
        }
        return null;
    }

    public ArrayList<exk_2> g(int n) {
        ArrayList<exk_2> arrayList = null;
        TLongObjectIterator tLongObjectIterator = this.j.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ArrayList<exk_2> arrayList2 = ((exg_2)tLongObjectIterator.value()).e.d(n);
            if (arrayList == null) {
                arrayList = arrayList2;
                continue;
            }
            int n2 = arrayList2.size();
            for (int k = 0; k < n2; ++k) {
                arrayList.add(arrayList2.get(k));
            }
        }
        return arrayList;
    }

    public exg_2 b(exk_2 exk_22, boolean bl) {
        for (exg_2 exg_22 : this.a(i)) {
            ArrayList<exk_2> arrayList = exg_22.e.d(exk_22.aT_());
            for (ts_0 ts_02 : arrayList) {
                boolean bl2;
                boolean bl3 = ts_02.a(exk_22);
                boolean bl4 = bl2 = bl || ts_02.e() + exk_22.e() <= exk_22.aR_();
                if (!bl3 || ts_02.e() >= exk_22.aR_() || !bl2) continue;
                return exg_22;
            }
        }
        return null;
    }

    public exg_2 e(exk_2 exk_22) {
        return this.b(exk_22, false);
    }

    public Optional<Cm<exg_2, Short>> f(exk_2 exk_22) {
        TLongObjectIterator tLongObjectIterator = this.j.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            exg_2 exg_22 = (exg_2)tLongObjectIterator.value();
            short s2 = exg_22.l();
            if (s2 < 0 || !exg_22.a(exk_22)) continue;
            return Optional.of(new Cm<exg_2, Short>(exg_22, s2));
        }
        return Optional.empty();
    }

    protected final ArrayList<exg_2> a(Comparator<exg_2> comparator) {
        ArrayList<exg_2> arrayList = new ArrayList<exg_2>();
        this.j.forEachValue((TObjectProcedure)new exk_1(this, arrayList));
        arrayList.sort(comparator);
        return arrayList;
    }

    public boolean g(exk_2 exk_22) {
        TLongObjectIterator tLongObjectIterator = this.j.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            tt_0<exk_2> tt_02 = ((exg_2)tLongObjectIterator.value()).e.e();
            if (tt_02 == null || tt_02.a(((exg_2)tLongObjectIterator.value()).e, exk_22) < 0) continue;
            return true;
        }
        return false;
    }

    public exg_2 a(ts_0 ts_02) {
        TLongObjectIterator tLongObjectIterator = this.j.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            if (!((exg_2)tLongObjectIterator.value()).e.d(ts_02.a())) continue;
            return (exg_2)tLongObjectIterator.value();
        }
        return null;
    }

    public boolean j(long l) {
        TLongObjectIterator tLongObjectIterator = this.j.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            if (!((exg_2)tLongObjectIterator.value()).e.d(l)) continue;
            return true;
        }
        return false;
    }

    public boolean a(exa_1 exa_12) {
        return !this.k.contains(exa_12) && this.k.add(exa_12);
    }

    public boolean b(exa_1 exa_12) {
        return this.k.remove(exa_12);
    }

    public void c(exg_2 exg_22) {
        this.j.put(exg_22.f(), (Object)exg_22);
        this.a(exg_22);
        for (int k = 0; k < this.k.size(); ++k) {
            this.k.get(k).a(exg_22);
        }
    }

    public exg_2 k(long l) {
        exg_2 exg_22 = (exg_2)this.j.remove(l);
        this.b(exg_22);
        for (int k = 0; k < this.k.size(); ++k) {
            this.k.get(k).b(exg_22);
        }
        return exg_22;
    }

    protected abstract void a(exg_2 var1);

    protected abstract void b(exg_2 var1);

    public void m() {
        this.n();
        this.k.clear();
    }

    public void n() {
        TLongObjectIterator tLongObjectIterator = this.j.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            for (int k = 0; k < this.k.size(); ++k) {
                this.k.get(k).b((exg_2)tLongObjectIterator.value());
            }
        }
        this.j.clear();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public TLongIntHashMap a(int n, int n2, @Nullable Uo uo) {
        TLongIntHashMap tLongIntHashMap = new TLongIntHashMap();
        int n3 = 0;
        TLongObjectIterator tLongObjectIterator = this.j.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            exg_2 exg_22 = (exg_2)tLongObjectIterator.value();
            if (uo != null) {
                exg_22.e.a(uo);
            }
            try {
                ArrayList<exk_2> arrayList = exg_22.d(n);
                if (arrayList.isEmpty()) continue;
                for (int k = arrayList.size() - 1; k >= 0; --k) {
                    exk_2 exk_22 = arrayList.get(k);
                    short s2 = (short)Math.min(n2 - n3, exk_22.e());
                    tLongIntHashMap.put(exk_22.a(), (int)(-s2));
                    exg_22.e.a(exk_22.a(), -s2);
                    if ((n3 += s2) != n2) continue;
                    TLongIntHashMap tLongIntHashMap2 = tLongIntHashMap;
                    return tLongIntHashMap2;
                }
            }
            finally {
                if (uo == null) continue;
                exg_22.e.b(uo);
            }
        }
        return tLongIntHashMap;
    }

    public int h(int n) {
        int n2 = 0;
        TLongObjectIterator tLongObjectIterator = this.j.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            exg_2 exg_22 = (exg_2)tLongObjectIterator.value();
            ArrayList<exk_2> arrayList = exg_22.e.d(n);
            if (arrayList.isEmpty()) continue;
            for (int k = arrayList.size() - 1; k >= 0; --k) {
                exk_2 exk_22 = arrayList.get(k);
                n2 += exk_22.e();
            }
        }
        return n2;
    }

    public int a(TLongObjectIterator<exk_2> tLongObjectIterator) {
        int n = 0;
        TByteIntHashMap tByteIntHashMap = new TByteIntHashMap();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            exk_2 exk_22 = (exk_2)tLongObjectIterator.value();
            for (exg_2 exg_22 : this.a(i)) {
                tt_0<exk_2> tt_02 = exg_22.o();
                if (tt_02 != null && tt_02.a(exg_22.e, exk_22) != 0) continue;
                byte by = exg_22.e();
                if (tByteIntHashMap.containsKey(by)) {
                    int n2 = tByteIntHashMap.get(by);
                    if (n2 == 0) continue;
                    tByteIntHashMap.put(by, n2 - 1);
                } else {
                    tByteIntHashMap.put(by, exg_22.p() - 1);
                }
                ++n;
            }
        }
        return n;
    }

    public ArrayList<Long> h(exk_2 exk_22) {
        ArrayList<Long> arrayList = new ArrayList<Long>();
        for (exg_2 exg_22 : this.a(i)) {
            tt_0<exk_2> tt_02 = exg_22.o();
            if (tt_02 != null && tt_02.a(exg_22.e, exk_22) == -3) continue;
            arrayList.add(exg_22.f());
        }
        return arrayList;
    }

    public int o() {
        TLongObjectIterator tLongObjectIterator = this.j.iterator();
        int n = 0;
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            exg_2 exg_22 = (exg_2)tLongObjectIterator.value();
            if (exg_22.o() instanceof eyq_1) continue;
            n += exg_22.p();
        }
        return n;
    }

    public short i(exk_2 exk_22) {
        short s2 = 0;
        for (exg_2 exg_22 : this.a(i)) {
            try {
                if (!exg_22.b(exk_22)) continue;
                s2 = (short)(s2 + 1);
            }
            catch (uz_0 uz_02) {
                a.warn((Object)"L'inventaire de destination est plein, erreur de simulateAdd", (Throwable)uz_02);
            }
            catch (Uy uy) {
                a.error((Object)"l'item test\u00e9 est d\u00e9ja pr\u00e9sent dans l'inventaire cible. Erreur, ID Dupliqu\u00e9 ? ", (Throwable)uy);
            }
        }
        return s2;
    }

    public ArrayList<exk_2> i(int n) {
        ArrayList<exk_2> arrayList = new ArrayList<exk_2>();
        TLongObjectIterator<exg_2> tLongObjectIterator = this.i();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            arrayList.addAll(((exg_2)tLongObjectIterator.value()).d(n));
        }
        return arrayList;
    }

    public ArrayList<exk_2> b(int n, tw_0 tw_02) {
        ArrayList<exk_2> arrayList = new ArrayList<exk_2>();
        TLongObjectIterator<exg_2> tLongObjectIterator = this.i();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            arrayList.addAll(((exg_2)tLongObjectIterator.value()).b(n, tw_02));
        }
        return arrayList;
    }

    public ArrayList<exk_2> b(tw_0 tw_02) {
        ArrayList<exk_2> arrayList = new ArrayList<exk_2>();
        TLongObjectIterator<exg_2> tLongObjectIterator = this.i();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            arrayList.addAll(((exg_2)tLongObjectIterator.value()).b(tw_02));
        }
        return arrayList;
    }

    public exg_2 a(byte by) {
        TLongObjectIterator tLongObjectIterator = this.j.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            exg_2 exg_22 = (exg_2)tLongObjectIterator.value();
            if (exg_22.e() != by) continue;
            return exg_22;
        }
        return null;
    }

    public exg_2 l(long l) {
        TLongObjectIterator tLongObjectIterator = this.j.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            exg_2 exg_22 = (exg_2)tLongObjectIterator.value();
            if (exg_22.f() != l) continue;
            return exg_22;
        }
        return null;
    }

    public Optional<exg_2> m(long l) {
        TLongObjectIterator tLongObjectIterator = this.j.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            exg_2 exg_22 = (exg_2)tLongObjectIterator.value();
            if (!exg_22.b(l)) continue;
            return Optional.of(exg_22);
        }
        return Optional.empty();
    }

    public boolean a(TObjectProcedure<exk_2> tObjectProcedure) {
        TLongObjectIterator tLongObjectIterator = this.j.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            if (((exg_2)tLongObjectIterator.value()).a(tObjectProcedure)) continue;
            return false;
        }
        return true;
    }
}

