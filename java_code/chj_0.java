/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cHJ
 */
@fpw_0
public class chj_0 {
    public static final String PACKAGE = "wakfu.mimiSymbic";
    private static exk_2 a;
    private static exk_2 b;

    public static void onValidate(fzs fzs2) {
        dfc.d((short)19929);
    }

    public static void clean() {
        b = null;
        a = null;
    }

    public static void onDragStatItem(fcp_1 fcp_12) {
        a = (exk_2)fcp_12.l();
    }

    public static void onDragSkinItem(fcp_1 fcp_12) {
        b = (exk_2)fcp_12.l();
    }

    public static boolean checkDragItemDropped(exk_2 exk_22) {
        if (!azu_0.j().c(daJ.a)) {
            return false;
        }
        if (a == null && b == null || exk_22 == null) {
            return false;
        }
        if (a != null && a.a() == exk_22.a()) {
            chj_0.onDropOutStatItem(null, exk_22);
            return true;
        }
        if (b != null && b.a() == exk_22.a()) {
            chj_0.onDropOutSkinItem(null, exk_22);
            return true;
        }
        return false;
    }

    public static boolean checkEquipItemDropped(exk_2 exk_22) {
        if (!azu_0.j().c(daJ.a)) {
            return false;
        }
        if (exk_22 == null) {
            return false;
        }
        exk_2 exk_23 = daJ.a.a().b();
        if (exk_23 != null && exk_23.a() == exk_22.a()) {
            chj_0.onDropOutStatItem(null, exk_22);
            return true;
        }
        exk_2 exk_24 = daJ.a.a().b();
        if (exk_24 != null && exk_24.a() == exk_22.a()) {
            chj_0.onDropOutSkinItem(null, exk_22);
            return true;
        }
        return false;
    }

    public static void onDropInStatItem(fcv_2 fcv_22) {
        exk_2 exk_22;
        Object object = fcv_22.n();
        if (!(object instanceof exk_2)) {
            if (!(object instanceof bja_1)) {
                return;
            }
            exk_22 = ((bja_1)object).h();
        } else {
            exk_22 = (exk_2)object;
        }
        a = null;
        cgo_0.onDropItem();
        dgL dgL2 = new dgL();
        dgL2.a(exk_22);
        dgL2.a_(16310);
        add_2.b().a(dgL2);
    }

    public static void onDropInSkinItem(fcv_2 fcv_22) {
        exk_2 exk_22;
        Object object = fcv_22.n();
        if (!(object instanceof exk_2)) {
            if (!(object instanceof bja_1)) {
                return;
            }
            exk_22 = ((bja_1)object).h();
        } else {
            exk_22 = (exk_2)object;
        }
        b = null;
        cgo_0.onDropItem();
        dgL dgL2 = new dgL();
        dgL2.a(exk_22);
        dgL2.a_(16195);
        add_2.b().a(dgL2);
    }

    public static void onDropOutStatItem(fcx_1 fcx_12) {
        chj_0.onDropOutStatItem(fcx_12, fcx_12.l());
    }

    public static void onDropOutStatItem(fcb_2 fcb_22) {
        if (fcb_22.f() != frd_0.k) {
            return;
        }
        chj_0.onDropOutStatItem(fcb_22, fcb_22.j());
    }

    public static void onDropOutStatItem(fzs fzs2, Object object) {
        if (!(object instanceof exk_2)) {
            return;
        }
        a = null;
        dgL dgL2 = new dgL();
        dgL2.a((exk_2)null);
        dgL2.a_(16310);
        add_2.b().a(dgL2);
    }

    public static void onDropOutSkinItem(fcx_1 fcx_12) {
        chj_0.onDropOutSkinItem(fcx_12, fcx_12.l());
    }

    public static void onDropOutSkinItem(fcb_2 fcb_22) {
        if (fcb_22.f() != frd_0.k) {
            return;
        }
        chj_0.onDropOutSkinItem(fcb_22, fcb_22.j());
    }

    public static void onDropOutSkinItem(fzs fzs2, Object object) {
        if (!(object instanceof exk_2)) {
            return;
        }
        b = null;
        dgL dgL2 = new dgL();
        dgL2.a((exk_2)null);
        dgL2.a_(16195);
        add_2.b().a(dgL2);
    }
}

