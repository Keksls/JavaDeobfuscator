/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.EnumMap;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bpd
 */
final class bpd_1 {
    private static final Logger a = Logger.getLogger(bpd_1.class);

    bpd_1() {
    }

    public bpb_1 a(ase_0 ase_02) {
        short s2 = (short)ase_02.c();
        bpb_1 bpb_12 = bpd_1.a(ase_02, s2);
        bpd_1.a(ase_02, s2, bpb_12);
        bpd_1.a(ase_02, bpb_12);
        bpd_1.d(ase_02);
        bpd_1.e(ase_02);
        return bpb_12;
    }

    private static bpb_1 a(ase_0 ase_02, short s2) {
        int n = ase_02.aP() != 0 ? ase_02.aP() : 30000;
        EnumMap<eps_0, abo_2<Integer, Float>> enumMap = bpd_1.c(ase_02);
        UL uL = UL.a(ase_02.aC());
        UL uL2 = UL.a(ase_02.aD());
        bpb_1 bpb_12 = new bpb_1(s2, ase_02.d(), ase_02.as(), ase_02.e(), ase_02.f(), enumMap, ase_02.aU(), ase_02.aV(), ase_02.ay(), ase_02.ax(), ase_02.aQ(), ase_02.aO(), ase_02.az(), ase_02.au(), ase_02.av(), (byte)ase_02.aw(), ase_02.aB(), n, uL, uL2, ase_02.aE(), ase_02.aF(), fjQ.a(ase_02.aM()), ase_02.h());
        bpb_12.b(ase_02.aK());
        bpb_12.a(bpd_1.b(ase_02));
        bpb_12.d(ase_02.aN());
        bpb_12.a(ase_02.aW());
        for (aSM aSM2 : ase_02.aA()) {
            bpb_12.a(aSM2.a(), aSM2.b());
        }
        return bpb_12;
    }

    private static EnumMap<eps_0, abo_2<Integer, Float>> c(ase_0 ase_02) {
        EnumMap<eps_0, abo_2<Integer, Float>> enumMap = new EnumMap<eps_0, abo_2<Integer, Float>>(eps_0.class);
        enumMap.put(eps_0.b, new abo_2<Integer, Float>(ase_02.i(), Float.valueOf(ase_02.w())));
        enumMap.put(eps_0.c, new abo_2<Integer, Float>(ase_02.k(), Float.valueOf(ase_02.y())));
        enumMap.put(eps_0.d, new abo_2<Integer, Float>(ase_02.l(), Float.valueOf(ase_02.z())));
        enumMap.put(eps_0.e, new abo_2<Integer, Float>(ase_02.j(), Float.valueOf(ase_02.x())));
        enumMap.put(eps_0.j, new abo_2<Integer, Float>(ase_02.m(), Float.valueOf(ase_02.A())));
        enumMap.put(eps_0.B, new abo_2<Integer, Float>(ase_02.n(), Float.valueOf(ase_02.B())));
        enumMap.put(eps_0.P, new abo_2<Integer, Float>(ase_02.q(), Float.valueOf(ase_02.E())));
        enumMap.put(eps_0.h, new abo_2<Integer, Float>(ase_02.r(), Float.valueOf(ase_02.F())));
        enumMap.put(eps_0.i, new abo_2<Integer, Float>(ase_02.u(), Float.valueOf(ase_02.I())));
        enumMap.put(eps_0.f, new abo_2<Integer, Float>(ase_02.M(), Float.valueOf(ase_02.ad())));
        enumMap.put(eps_0.g, new abo_2<Integer, Float>(ase_02.V(), Float.valueOf(ase_02.am())));
        enumMap.put(eps_0.Q, new abo_2<Integer, Float>(ase_02.p(), Float.valueOf(ase_02.D())));
        enumMap.put(eps_0.v, new abo_2<Integer, Float>(ase_02.R(), Float.valueOf(ase_02.ai())));
        enumMap.put(eps_0.w, new abo_2<Integer, Float>(ase_02.S(), Float.valueOf(ase_02.aj())));
        enumMap.put(eps_0.x, new abo_2<Integer, Float>(ase_02.T(), Float.valueOf(ase_02.ak())));
        enumMap.put(eps_0.y, new abo_2<Integer, Float>(ase_02.U(), Float.valueOf(ase_02.al())));
        enumMap.put(eps_0.s, new abo_2<Integer, Float>(ase_02.P(), Float.valueOf(ase_02.ag())));
        enumMap.put(eps_0.t, new abo_2<Integer, Float>(ase_02.Q(), Float.valueOf(ase_02.ah())));
        enumMap.put(eps_0.q, new abo_2<Integer, Float>(ase_02.N(), Float.valueOf(ase_02.ae())));
        enumMap.put(eps_0.r, new abo_2<Integer, Float>(ase_02.O(), Float.valueOf(ase_02.af())));
        enumMap.put(eps_0.l, new abo_2<Integer, Float>(ase_02.v(), Float.valueOf(0.0f)));
        return enumMap;
    }

    private static void a(ase_0 ase_02, short s2, bpb_1 bpb_12) {
        for (ask_0 ask_02 : ase_02.aH()) {
            int n = ask_02.a();
            boolean bl = true;
            boolean bl2 = false;
            boolean bl3 = false;
            apc_2 apc_22 = null;
            try {
                apc_22 = eyS.c(ask_02.e());
            }
            catch (Exception exception) {
                a.error((Object)("Erreur de compilation du crit\u00e8rre sur l'action de collect " + ask_02.d() + " du monstre " + bpb_12.s()));
            }
            bru_1 bru_12 = new bru_1(0, 0);
            brw_1 brw_12 = new brw_1(n, s2, ask_02.b(), ask_02.c(), 1, ask_02.h(), ask_02.i(), ask_02.d(), apc_22, false, -1, 0, bru_12, ask_02.k(), ask_02.j(), ask_02.f());
            bpb_12.a(brw_12);
        }
    }

    private static void a(ase_0 ase_02, bpb_1 bpb_12) {
        for (asi_0 asi_02 : ase_02.aG()) {
            int n = asi_02.a();
            byte by = asi_02.b();
            eao_0 eao_02 = eao_0.a(by);
            if (eao_02 == null) {
                a.error((Object)("Impossible de trouver l'action de monstre " + by));
                continue;
            }
            apc_2 apc_22 = null;
            try {
                apc_22 = eyS.c(asi_02.c());
            }
            catch (Exception exception) {
                a.error((Object)("Probl\u00e8me de compilation d'un crit\u00e8re sur l'action " + n + " du monstre " + bpb_12));
            }
            fii fii2 = fij.a().a(asi_02.h());
            bpp_1 bpp_12 = bpt_1.a(n, by, apc_22, asi_02.d(), fii2, asi_02.i(), asi_02.f(), asi_02.g(), asi_02.e());
            bpb_12.a(bpp_12);
        }
    }

    private static void d(ase_0 ase_02) {
        for (asj_0 asj_02 : ase_02.aI()) {
            int n = asj_02.a();
            int n2 = asj_02.b();
            int n3 = asj_02.c();
            boolean bl = asj_02.d();
            bpa_2.a().a(ase_02.c(), new boz_2(n, n2, n3, bl));
        }
    }

    private static void e(ase_0 ase_02) {
        for (aSL aSL2 : ase_02.aJ()) {
            int n = aSL2.a();
            int n2 = aSL2.c();
            short s2 = (short)aSL2.b();
            bpe_1 bpe_12 = new bpe_1(n, s2, n2);
            bpf_1.a().a(bpe_12);
        }
    }

    @Nullable
    public static bpg_1 b(ase_0 ase_02) {
        bpi_1[] bpi_1Array = bpd_1.a(ase_02.aT());
        bpj_1[] bpj_1Array = bpd_1.a(ase_02.aS());
        bpk_1[] bpk_1Array = bpd_1.a(ase_02.aR());
        if (bpk_1Array != null || bpj_1Array != null || bpi_1Array != null) {
            bpg_1 bpg_12 = new bpg_1();
            bpg_12.a(bpi_1Array);
            bpg_12.a(bpj_1Array);
            bpg_12.a(bpk_1Array);
            return bpg_12;
        }
        return null;
    }

    @Nullable
    private static bpi_1[] a(asf_0[] asf_0Array) {
        if (asf_0Array == null || asf_0Array.length == 0) {
            return null;
        }
        bpi_1[] bpi_1Array = new bpi_1[asf_0Array.length];
        for (int k = 0; k < asf_0Array.length; ++k) {
            bpi_1Array[k] = new bpi_1(asf_0Array[k].a(), asf_0Array[k].b());
        }
        return bpi_1Array;
    }

    @Nullable
    private static bpj_1[] a(aSG[] aSGArray) {
        if (aSGArray == null || aSGArray.length == 0) {
            return null;
        }
        bpj_1[] bpj_1Array = new bpj_1[aSGArray.length];
        for (int k = 0; k < aSGArray.length; ++k) {
            bpj_1Array[k] = new bpj_1(aSGArray[k].a(), (azj_2)new azf_2(aSGArray[k].b()));
        }
        return bpj_1Array;
    }

    @Nullable
    private static bpk_1[] a(aSH[] aSHArray) {
        if (aSHArray == null || aSHArray.length == 0) {
            return null;
        }
        bpk_1[] bpk_1Array = new bpk_1[aSHArray.length];
        for (int k = 0; k < aSHArray.length; ++k) {
            bpk_1Array[k] = new bpk_1(aSHArray[k].a(), aSHArray[k].b());
        }
        return bpk_1Array;
    }
}

