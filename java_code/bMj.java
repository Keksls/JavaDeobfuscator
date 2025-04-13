/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public final class bMj {
    private bMj() {
    }

    static String a(ffu_0 ffu_02) {
        fge fge3 = ffu_02.a();
        int n = ffu_02.e();
        if (!ffu_02.a().k()) {
            fgj fgj2 = fgl.a.b((Integer)n);
            if (fgj2 != null) {
                return fgj2.c();
            }
            Optional<fge> optional = fgh.a.e(n);
            return optional.map(fge2 -> String.valueOf(fge2.c())).orElseGet(() -> String.valueOf(fge3.c()));
        }
        fgb fgb2 = fgd.a.b(n);
        if (fgb2 != null) {
            return fgb2.d();
        }
        int n2 = fge3.c();
        fgb fgb3 = fgd.a.a((Integer)n2);
        return fgb3.d();
    }

    public static String a(fge fge3, int n) {
        if (!fge3.k()) {
            fgj fgj2 = fgl.a.b((Integer)n);
            if (fgj2 != null) {
                return fgj2.c();
            }
            Optional<fge> optional = fgh.a.e(n);
            return optional.map(fge2 -> String.valueOf(fge2.c())).orElseGet(() -> String.valueOf(fge3.c()));
        }
        fgb fgb2 = fgd.a.b(n);
        if (fgb2 != null) {
            return fgb2.d();
        }
        int n2 = fge3.c();
        fgb fgb3 = fgd.a.a((Integer)n2);
        return fgb3.d();
    }

    public static void a(ffu_0 ffu_02, bMg bMg2, int n, bnh_1 bnh_12) {
        Object r2;
        if (bMg2 == null) {
            return;
        }
        if (n <= 0) {
            bMg2.m(bMj.a(ffu_02));
            bMg2.bx();
            bMj.a(bMg2, bnh_12);
            bMg2.E();
            return;
        }
        boolean bl = fgh.a.d(n);
        bMg2.m(bMj.a(ffu_02));
        bMg2.bx();
        if (bl && (r2 = eyo_1.g().d(n)) != null) {
            bMg2.c(((ezr_0)r2).C());
        }
        bMj.a(bMg2, bnh_12);
        bMg2.E();
    }

    public static void a(bMg bMg2, bnh_1 bnh_12) {
        if (bnh_12 == null || bMg2 == null) {
            return;
        }
        bnh_12.a(bMg2, false);
        aoe_0.a((abu)bMg2, bnh_12.eV().b(), "blason", null);
    }
}

