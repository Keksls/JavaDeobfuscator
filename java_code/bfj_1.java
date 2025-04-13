/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bfJ
 */
public class bfj_1
implements fig_0 {
    private static final Logger a = Logger.getLogger(bfj_1.class);
    private final asy_2<aTD> b;

    public bfj_1() {
        this(new asz_2<aTD>(new aTD()));
    }

    public bfj_1(asy_2<aTD> asy_22) {
        this.b = asy_22;
    }

    @Override
    @Nullable
    public fie_0 a(int n) {
        if (n <= 0) {
            return null;
        }
        bpe_0 bpe_02 = this.a();
        aTD aTD2 = this.b.a(n);
        if (aTD2 == null) {
            a.error((Object)("Impossible de charger l'\u00e9tat " + n));
            return null;
        }
        bfj_1.a(bpe_02, aTD2);
        return bpe_02;
    }

    protected bpe_0 a() {
        return new bpe_0();
    }

    static void a(bpe_0 bpe_02, aTD aTD2) {
        bpg_0 bpg_02 = new bpg_0(bpe_02);
        bpg_02.a(aTD2.C());
        bpg_02.a(aTD2.D());
        bpg_02.b(aTD2.B());
        bpg_02.b((short)aTD2.c());
        bpg_02.a(aTD2.d());
        bpg_02.c(aTD2.h());
        bpg_02.a(aTD2.j());
        bpg_02.c(aTD2.l());
        bpg_02.b(aTD2.i());
        bpg_02.c(aTD2.k());
        bpg_02.d(aTD2.o());
        bpg_02.e(aTD2.m());
        bpg_02.f(aTD2.n());
        bpg_02.g(aTD2.r());
        bpg_02.a(aTD2.v());
        bpg_02.b(aTD2.q());
        bpg_02.b(aTD2.e());
        bpg_02.c(aTD2.p());
        bpg_02.h(aTD2.s());
        bpg_02.j(aTD2.w());
        bpg_02.i(aTD2.x());
        bpg_02.a(aTD2.y());
        bpg_02.b(aTD2.z());
        bpg_02.k(aTD2.A());
        bpg_02.l(aTD2.t());
        bpg_02.c(aTD2.p());
        bfj_1.b(bpe_02, aTD2);
    }

    private static void b(bpe_0 bpe_02, aTD aTD2) {
        int[] nArray = aTD2.u();
        if (nArray == null || nArray.length == 0) {
            return;
        }
        for (int n : nArray) {
            efh_0 efh_02 = bgh_0.a().c(n);
            if (efh_02 != null) {
                bpe_02.a(efh_02);
                continue;
            }
            a.error((Object)("Probl\u00e8me de chargmeent de State " + aTD2.c()));
        }
    }

    public static TIntObjectHashMap<fie_0> b() {
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        try {
            asw_2.a().a(new aTD(), new bfk_1(tIntObjectHashMap));
        }
        catch (Exception exception) {
            a.error((Object)"", (Throwable)exception);
        }
        return tIntObjectHashMap;
    }
}

