/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from boK
 */
public final class bok_1 {
    private static final Logger a = Logger.getLogger(bok_1.class);

    private bok_1() {
    }

    public static void a(bnh_1 bnh_12) {
        bok_1.a(bnh_12, bnh_12.en());
        bok_1.a(bnh_12, bnh_12.fg());
        bnh_12.fh().forEach(n -> bok_1.a(bnh_12, (int)n));
        bok_1.a(bnh_12, bnh_12.fi());
    }

    private static void a(bnh_1 bnh_12, int n) {
        if (n == 0) {
            return;
        }
        exk_2 exk_22 = eyo_1.g().g(n);
        if (exk_22 == null) {
            return;
        }
        bnh_12.dR().b(exk_22);
    }

    public static void b(bnh_1 bnh_12) {
        bok_1.b(bnh_12, bnh_12.en());
        if (bnh_12.bz() == null) {
            bok_1.b(bnh_12, bnh_12.fg());
        }
        bnh_12.fh().forEach(n -> bok_1.b(bnh_12, (int)n));
        bok_1.b(bnh_12, bnh_12.fi());
        bok_1.f(bnh_12);
        bok_1.e(bnh_12);
        bok_1.d(bnh_12);
    }

    private static void d(bnh_1 bnh_12) {
        if (!(bnh_12 instanceof bmr_1)) {
            return;
        }
        if (!azu_0.j().c(ddn.a())) {
            return;
        }
        ddn.a().c().a();
    }

    private static void e(bnh_1 bnh_12) {
        if (!(bnh_12 instanceof bmr_1)) {
            return;
        }
        if (!azu_0.j().c(ddo_0.b)) {
            return;
        }
        ddo_0.b.a().a();
    }

    private static void f(bnh_1 bnh_12) {
        int n;
        int n2;
        if (!(bnh_12 instanceof bmr_1)) {
            return;
        }
        if (!azu_0.j().c(cyt_0.a())) {
            return;
        }
        fit_1 fit_12 = fis_1.a().e("previewDialogActor", cyt_0.a().f());
        if (fit_12 == null || fit_12.n()) {
            return;
        }
        bqv_1 bqv_12 = (bqv_1)fit_12.f();
        if (bqv_12.c().a_() != bnh_12.a_()) {
            return;
        }
        blx_1 blx_12 = bqv_12.e().bI();
        if (blx_12 instanceof bnh_1) {
            ((bnh_1)blx_12).s(bnh_12.W_());
        }
        if ((n2 = bnh_12.fi()) != 0) {
            bok_1.a(bqv_12, n2, true);
        }
        if ((n = bnh_12.fg()) != 0) {
            bok_1.a(bqv_12, n, true);
        }
        bqv_12.a();
        fis_1.a().a((ajf_1)bqv_12, "actorDescriptorLibrary");
    }

    public static void c(bnh_1 bnh_12) {
        bok_1.a(bnh_12);
        bok_1.b(bnh_12);
    }

    private static void b(bnh_1 bnh_12, int n) {
        exk_2 exk_22 = eyo_1.g().g(n);
        if (exk_22 == null) {
            return;
        }
        for (efh_0 efh_02 : exk_22) {
            try {
                efh_02.a(exk_22, bnh_12, bnh_12.Q_(), efc_0.a(), bnh_12.G(), bnh_12.H(), bnh_12.I(), bnh_12, null, false);
            }
            catch (Exception exception) {
                a.error((Object)"Failed to apply cosmetic effects on PC", (Throwable)exception);
            }
        }
    }

    public static void a(bqv_1 bqv_12, int n, boolean bl) {
        exk_2 exk_22 = eyo_1.g().g(n);
        if (exk_22 == null) {
            return;
        }
        for (efh_0 efh_02 : exk_22) {
            bqv_12.a(efh_02, bl);
        }
    }
}

