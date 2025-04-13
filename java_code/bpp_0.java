/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bPp
 */
public class bpp_0
extends fip_0<bph_0> {
    private final asy_2<aTz> f = new asz_2<aTz>(new aTz());

    @Nullable
    public bph_0 a(int n) {
        if (n == 0) {
            return null;
        }
        bph_0 bph_02 = (bph_0)this.d.get(n);
        if (bph_02 == null && !this.d.contains(n)) {
            aTz aTz2 = this.f.a(n);
            if (aTz2 == null) {
                return null;
            }
            bph_02 = this.c(aTz2);
            if (bph_02 != null) {
                this.a(bph_02);
            }
        }
        return bph_02;
    }

    public static bpp_0 a() {
        if (b == null) {
            b = new bpp_0();
        }
        return (bpp_0)b;
    }

    private bpp_0() {
    }

    public bpl_0 a(int n, short s2) {
        long l = fio_0.a(n, s2);
        bpl_0 bpl_02 = (bpl_0)this.e.get(l);
        if (bpl_02 == null) {
            bpl_02 = new bpl_0(this.a(n), s2, l, new bmm_2());
            this.e.put(l, (Object)bpl_02);
        }
        return bpl_02;
    }

    @Override
    public void a(aTz aTz2) {
        assert (aTz2 != null);
        bph_0 bph_02 = this.c(aTz2);
        this.a(bph_02);
    }

    private bph_0 c(aTz aTz2) {
        bks_1 bks_12;
        assert (aTz2 != null);
        bph_0 bph_02 = new bph_0(bpp_0.b(aTz2));
        short s2 = aTz2.g();
        if (s2 == epn_2.a.s()) {
            for (bks_1 bks_13 : bkt_1.a().d()) {
                bks_13.a(bph_02);
            }
        } else if (s2 != 0 && s2 != epn_2.b.s() && (bks_12 = bkt_1.a().a(s2)) != null) {
            bks_12.a(bph_02);
        }
        bpp_0.a(bph_02, aTz2.Y(), bgh_0.a());
        return bph_02;
    }

    public static fib_0 b(aTz aTz2) {
        Object object;
        fib_0 fib_02 = new fib_0();
        fib_02.a(aTz2.c());
        fib_02.d(aTz2.d());
        fib_02.e(aTz2.e());
        fib_02.b(aTz2.f());
        fib_02.b((int)aTz2.g());
        fib_02.a((byte)aTz2.h());
        fib_02.a(aTz2.i());
        fib_02.b((byte)aTz2.k());
        fib_02.d(aTz2.l());
        fib_02.a(aTz2.m());
        fib_02.c(aTz2.o());
        fib_02.e(aTz2.p());
        fib_02.g(aTz2.q());
        fib_02.f(aTz2.r());
        fib_02.c(aTz2.s());
        apc_2 apc_22 = null;
        try {
            object = aTz2.t();
            apc_22 = eyS.c((String)object);
        }
        catch (Exception exception) {
            c.error((Object)("Erreur lors de la compilation des crit\u00e8res du sort " + aTz2.c()), (Throwable)exception);
        }
        fib_02.c(apc_22);
        fib_02.a(aTz2.u());
        bpp_0.a(aTz2, fib_02);
        fib_02.b(aTz2.D());
        fib_02.c(aTz2.E());
        fib_02.d(aTz2.B());
        fib_02.e(aTz2.C());
        fib_02.d((byte)aTz2.F());
        fib_02.c((byte)aTz2.G());
        fib_02.c(aTz2.H());
        fib_02.g((byte)aTz2.I());
        fib_02.d(aTz2.J());
        object = null;
        try {
            object = eyS.c(aTz2.K());
        }
        catch (Exception exception) {
            c.error((Object)("Erreur lors de la compilation des crit\u00e8res d'apprentissage du sort " + aTz2.c()), (Throwable)exception);
        }
        apc_2 apc_23 = null;
        try {
            apc_23 = eyS.c(aTz2.L());
        }
        catch (Exception exception) {
            c.error((Object)("Erreur lors de la compilation des crit\u00e8res d'apprentissage du sort " + aTz2.c()), (Throwable)exception);
        }
        fib_02.a((apc_2)object);
        fib_02.b(apc_23);
        fib_02.f(aTz2.M());
        fib_02.m(aTz2.N());
        fib_02.n(aTz2.O());
        fib_02.i(aTz2.P());
        fib_02.j(aTz2.R());
        fib_02.k(aTz2.S());
        fib_02.l(aTz2.T());
        fib_02.o(aTz2.U());
        fib_02.p(aTz2.V());
        fib_02.f(aTz2.j());
        HashMap<String, aTA> hashMap = aTz2.ab();
        if (hashMap != null && !hashMap.isEmpty()) {
            for (Map.Entry<String, aTA> entry : hashMap.entrySet()) {
                try {
                    String string = entry.getKey();
                    aTA aTA2 = entry.getValue();
                    apc_2 apc_24 = eyS.c(string);
                    fib_02.a(apc_24, bpp_0.a(aTA2));
                }
                catch (Exception exception) {
                    c.error((Object)("Erreur lors de la compilation des crit\u00e8res d'apprentissage du sort " + aTz2.c()), (Throwable)exception);
                }
            }
        }
        fib_02.a(aTz2.X());
        return fib_02;
    }

    private static fix a(aTA aTA2) {
        fix fix2 = new fix(aTA2.c(), aTA2.d(), aTA2.g(), aTA2.h(), aTA2.e(), aTA2.f());
        fix2.a(aTA2.m());
        fix2.b(aTA2.n());
        fix2.c(aTA2.o());
        fix2.d(aTA2.p());
        fix2.b(aTA2.k(), aTA2.l());
        fix2.a(aTA2.i(), aTA2.j());
        fix2.a(aTA2.q());
        fix2.b(aTA2.r());
        fix2.c(aTA2.s());
        fix2.d(aTA2.t());
        fix2.e(aTA2.u());
        fix2.f(aTA2.v());
        fix2.g(aTA2.w());
        fix2.h(aTA2.x());
        HashMap<Integer, atb_0> hashMap = aTA2.b();
        if (hashMap != null && !hashMap.isEmpty()) {
            for (Map.Entry<Integer, atb_0> entry : hashMap.entrySet()) {
                atb_0 atb_02 = entry.getValue();
                Integer n = entry.getKey();
                fix2.a(eps_0.a(Hw.b((long)n.intValue())), atb_02.a(), atb_02.b());
            }
        }
        return fix2;
    }

    private static void a(aTz aTz2, fib_0 fib_02) {
        HashMap<Byte, atb_0> hashMap = aTz2.Z();
        fib_02.a(eps_0.c, aTz2.v(), aTz2.w());
        fib_02.a(eps_0.d, aTz2.x(), aTz2.y());
        fib_02.a(eps_0.e, aTz2.z(), aTz2.A());
        if (hashMap != null && !hashMap.isEmpty()) {
            for (Map.Entry<Byte, atb_0> entry : hashMap.entrySet()) {
                Byte by = entry.getKey();
                atb_0 atb_02 = entry.getValue();
                fib_02.a(eps_0.a(by), atb_02.a(), atb_02.b());
            }
        }
    }

    public static void a(fin_0 fin_02, int[] nArray, bgh_0 bgh_02) {
        for (int n : nArray) {
            efh_0 efh_02 = bgh_02.c(n);
            if (efh_02 != null) {
                fin_02.a(efh_02);
                continue;
            }
            c.error((Object)("Probl\u00e8me de chargmeent de Spell " + fin_02.i()));
        }
    }

    public TIntObjectHashMap<bph_0> b() {
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        try {
            asw_2.a().a(new aTz(), new bpq_0(this, tIntObjectHashMap));
        }
        catch (Exception exception) {
            c.error((Object)"", (Throwable)exception);
        }
        return tIntObjectHashMap;
    }

    @Override
    public /* synthetic */ fio_0 b(int n, short s2) {
        return this.a(n, s2);
    }

    @Override
    @Nullable
    public /* synthetic */ fin_0 b(int n) {
        return this.a(n);
    }

    static /* synthetic */ Logger c() {
        return c;
    }
}

