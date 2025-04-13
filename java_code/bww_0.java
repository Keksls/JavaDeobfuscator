/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

/*
 * Renamed from bww
 */
public final class bww_0 {
    private bww_0() {
    }

    public static void a(bvx_2 bvx_22) {
        Collection collection = bvx_22.j();
        for (blx_1 blx_12 : collection) {
            blx_12.bv().a(() -> bww_0.a(blx_12, bvx_22));
        }
    }

    public static void a(blx_1 blx_12, bvx_2 bvx_22) {
        biS biS2 = blx_12.bv().cg();
        bwx_0 bwx_02 = new bwx_0(biS2);
        ado_1.a().a(() -> {
            boolean bl = false;
            if (bvx_22.F(blx_12)) {
                bl = blx_12.a(bwx_02);
            } else if (bvx_22.G(blx_12)) {
                bar_0.a(blx_12, true);
            } else if (bvx_22.H(blx_12)) {
                bar_0.a(blx_12, bvx_22.c());
            }
            if (!bl) {
                bww_0.a(biS2);
            }
        }, 0L, 1);
    }

    private static void a(biS biS2) {
        boolean bl = biS2.k();
        if (bl) {
            biS2.h();
        }
    }
}

