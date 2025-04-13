/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cfg
 */
public class cfg_1
implements ahr_1 {
    public static final cfg_1 a = new cfg_1();

    private cfg_1() {
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 13189: {
                return this.a((cst_0)adt_12);
            }
            case 12719: {
                return this.a((csu_0)adt_12);
            }
        }
        return true;
    }

    private boolean a(cst_0 cst_02) {
        long l = cst_02.c();
        bnh_1 bnh_12 = (bnh_1)euw_2.a.d(l);
        if (bnh_12 == null) {
            return false;
        }
        fv_2 fv_22 = cst_02.e();
        bol_1.a(bnh_12.R(), bnh_12.a_(), cst_02.d(), fv_22);
        if (cst_02.d().equals((Object)ft_1.b) || cst_02.d().equals((Object)ft_1.a)) {
            dbU.a().f();
        }
        if (cst_02.d().equals((Object)ft_1.g)) {
            fis_1.a().a((ajf_1)bnh_12, "currentTitleId", "currentTitle", "currentTitleObject");
        }
        if (azu_0.j().c(cxy_0.a())) {
            int n = fv_22.d() == 0 ? 0 : fv_22.a(0).c();
            cxy_0.a().a((blx_1)bnh_12, cst_02.d(), n);
        }
        if (!(bnh_12 instanceof bmr_1)) {
            return false;
        }
        fis_1.a().a((ajf_1)((bHi)bnh_12.dS()), "currentInventoryView");
        return false;
    }

    private boolean a(csu_0 csu_02) {
        bol_1.a(csu_02.c(), csu_02.b());
        bmr_1 bmr_12 = bjb_1.a.g();
        if (bmr_12 == null) {
            return false;
        }
        if (csu_02.c().equals((Object)ft_1.g)) {
            fis_1.a().a((ajf_1)bmr_12, "availableTitles");
        } else if (csu_02.c().equals((Object)ft_1.o)) {
            if (azu_0.j().c(cxi_0.a())) {
                cxi_0.a().e();
            }
            aUh.b("chat.notify.dimensionalBagViewUnlocked", new Object[0]);
        }
        bhs_0 bhs_02 = bmr_12.da().f();
        if (!bhs_02.equals(bhs_0.d)) {
            return false;
        }
        fis_1.a().a((ajf_1)bmr_12.da(), "currentInventoryView");
        return false;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

