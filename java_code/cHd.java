/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

@fpw_0
public class cHd {
    public static final String PACKAGE = "wakfu.furniture";

    public static void startFurnitureDeploy(fzs fzs2, bxb_1 bxb_12) {
        if (!bxb_12.b().booleanValue()) {
            return;
        }
        bjw_1 bjw_12 = bxb_12.a();
        int n = bjw_12.n();
        if (!eum_1.a().b(n)) {
            return;
        }
        if (!cHd.a(n)) {
            return;
        }
        long l2 = eum_1.a().a(n);
        bgp_1.a(l2, (l, bgv_12) -> {
            cpY cpY2 = new cpY(n, (long)l, bgv_12.c(), bgv_12.d(), bgv_12.e(), bgv_12.b().a());
            azu_0.j().K().c(cpY2);
        });
    }

    public static void clickCategory(fck_2 fck_22, bxx_2 bxx_22) {
        bxx_22.ak_();
    }

    private static boolean a(int n) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return true;
        }
        long l = bmr_12.U_();
        Optional optional = ena_0.a().b(l, end_0.k);
        if (optional.isEmpty()) {
            return true;
        }
        ffd ffd2 = (ffd)optional.get();
        return ffd2.c(n);
    }
}

