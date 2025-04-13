/*
 * Decompiled with CFR 0.152.
 */
public class dct
implements ahr_1 {
    private static final dct a = new dct();
    private ans_1 b;
    private boh_0 c;

    public static dct a() {
        return a;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 19752: {
                bvk_1 bvk_12 = (bvk_1)((anw_1)adt_12).j();
                brk_1 brk_12 = bvk_12.g();
                String string = brk_12.f().p();
                String string2 = brk_12.g().l();
                long l = azu_0.j().k().a_();
                cqx cqx2 = new cqx(string, string2, l);
                azu_0.j().K().c(cqx2);
                return false;
            }
            case 19357: {
                boi_0 boi_02 = this.c.a();
                boj_0 boj_02 = this.c.b();
                cqw cqw2 = new cqw(azu_0.j().k().a_());
                if (boj_02.a() != null) {
                    cqw2.a(bq_0.b(boj_02.a().a()));
                }
                if (boi_02.a() != null) {
                    cqw2.a(bj_0.b(boi_02.a().a()));
                }
                azu_0.j().K().c(cqw2);
                return false;
            }
            case 16810: {
                dfc dfc2 = (dfc)adt_12;
                boj_0 boj_03 = (boj_0)dfc2.j();
                this.c.a(boj_03);
                return false;
            }
            case 19018: {
                dfc dfc3 = (dfc)adt_12;
                boi_0 boi_03 = (boi_0)dfc3.j();
                this.c.a(boi_03);
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            azu_0.j().K().c(new cqy(azu_0.j().k().a_()));
            this.c = new boh_0();
            this.c.c();
            fis_1.a().a("rewardsView", this.c);
            this.b = new dcu(this);
            fpm_0.b().a(this.b);
            fpm_0.b().a("wakfu.rewards", cjr_0.class);
            if (!fpm_0.b().d("wakfu.exchangeMachine")) {
                fpm_0.b().a("wakfu.exchangeMachine", cGU.class);
            }
            fpm_0.b().a("rewardsDialog", cfi_0.a("rewardsDialog"), 32769L, (short)10000);
            cdw_0.n().c(600012L);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().o("rewardsDialog");
            fpm_0.b().b(this.b);
            fpm_0.b().e("wakfu.rewards");
            if (!(azu_0.j().c(cYF.a()) || azu_0.j().c(cxq_0.a) || fpm_0.b().q("ladderRewardsDialog"))) {
                fpm_0.b().e("wakfu.exchangeMachine");
            }
            cdw_0.n().c(600013L);
            fis_1.a().a("rewardsView");
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

