/*
 * Decompiled with CFR 0.152.
 */
@fpw_0
public class cJh {
    public static final String PACKAGE = "wakfu.pet";
    private static final int a = 0;
    private static final int b = 7;
    private static abo_2<Long, Long> c = new abo_2();

    public static void pickAccessory(fzs fzs2, bMi bMi2, exk_2 exk_22) {
        dfc dfc2 = new dfc(18542);
        dfc2.b(exk_22.m());
        add_2.b().a(dfc2);
    }

    public static void removeAccessory(fzs fzs2, bMi bMi2) {
        dfc dfc2 = new dfc(18542);
        dfc2.a((Object)0);
        add_2.b().a(dfc2);
    }

    public static void pickColor(fzs fzs2, bMi bMi2, exk_2 exk_22) {
        dgL dgL2 = new dgL();
        dgL2.a_(19322);
        dgL2.a(exk_22);
        dgL2.a(bMi2.j().a());
        add_2.b().a(dgL2);
    }

    public static void buyArticle(fzs fzs2, bss_0<?, ?> bss_02) {
        ddO.a().a(bss_02);
    }

    public static void dragEquipment(fcp_1 fcp_12, bMi bMi2) {
        if (fcp_12.l() != null && fcp_12.l() instanceof exk_2) {
            exk_2 exk_22 = (exk_2)fcp_12.l();
            c.a(bMi2.j().a());
            c.b(exk_22.a());
        }
    }

    public static void setPetName(fzs fzs2, bMi bMi2, fug_0 fug_02) {
        if (fzs2.f() == frd_0.C || fzs2.f() == frd_0.n && ((fcd_2)fzs2).k() == 10) {
            boolean bl = cby_2.a().a(fug_02.getText());
            if (bl) {
                dhj_0 dhj_02 = new dhj_0(bMi2, 16494);
                dhj_02.a(fug_02.getText());
                add_2.b().a(dhj_02);
            } else {
                aUh.a("error.connection.nicknameInvalidContent", new Object[0]);
            }
        }
    }

    public static void changeDirection(fck_2 fck_22, frO frO2) {
        int n = fck_22.x();
        if (n != 1 && n != 3) {
            return;
        }
        int n2 = n == 1 ? -1 : 1;
        int n3 = (frO2.getDirection() + n2) % 8;
        if (n3 < 0) {
            n3 = 7;
        }
        frO2.setDirection(n3);
        frO2.setDirection(n3);
    }

    public static void feedPet(fcv_2 fcv_22) {
        bMi bMi2 = (bMi)fis_1.a().d("pet", fcv_22.j().getElementMap());
        cJh.feedPet(fcv_22, bMi2);
    }

    public static void feedPet(fcv_2 fcv_22, bMi bMi2) {
        int n;
        cgo_0.onDropItem();
        Object object = fcv_22.n();
        if (object == null || !(object instanceof exk_2) || bMi2 == null) {
            return;
        }
        exk_2 exk_22 = (exk_2)object;
        ffu_0 ffu_02 = bMi2.f();
        if (ffy.a(ffu_02, exk_22.aT_()) && (n = ffu_02.a().d() - ffu_02.f()) > 0) {
            dgL dgL2 = new dgL();
            cjk_0.setMessageType((short)19934);
            cjk_0.setItem(exk_22);
            cjk_0.setMaxQuantity(Math.min(exk_22.e(), n));
            dgL2.g((short)fcv_22.v());
            dgL2.h((short)fcv_22.w());
            dgL2.a_(18919);
            add_2.b().a(dgL2);
            return;
        }
        dhi_0 dhi_02 = new dhi_0(bMi2, (exk_2)object);
        dhi_02.f((short)1);
        add_2.b().a(dhi_02);
    }

    public static long getDraggedPetId() {
        Long l = c.a();
        return l == null ? -1L : l;
    }

    public static long getDraggedItemId() {
        Long l = c.b();
        return l == null ? -1L : l;
    }

    public static void resetDraggedItemAndPetId() {
        c = new abo_2();
    }
}

