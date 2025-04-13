/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class dca
implements ahr_1 {
    private static final dca b = new dca();
    protected static Logger a = Logger.getLogger(dca.class);

    public static dca a() {
        return b;
    }

    public void a(boolean bl) {
        fzw_0.a.a("giftLock", bl);
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 18694: {
                if (azu_0.j().k().a(erl_2.aD)) {
                    aUA.a(erl_2.aD.b());
                    return false;
                }
                dhl_0 dhl_02 = (dhl_0)adt_12;
                bxh_2.a().a(dhl_02.k());
                return false;
            }
            case 18005: {
                if (azu_0.j().k().a(erl_2.aD)) {
                    aUA.a(erl_2.aD.b());
                    return false;
                }
                dhk_0 dhk_02 = (dhk_0)adt_12;
                bxg_2 bxg_22 = dhk_02.k();
                boolean bl = dhk_02.i();
                bxh_2.a().a(bxg_22, bl);
                this.a(false);
                cno_0 cno_02 = new cno_0();
                cno_02.a(bxg_22.b());
                azu_0.j().K().c(cno_02);
                return false;
            }
            case 19692: {
                if (azu_0.j().k().a(erl_2.aD)) {
                    aUA.a(erl_2.aD.b());
                    return false;
                }
                if (fpm_0.b().q("playerGiftDialog")) {
                    fpm_0.b().o("playerGiftDialog");
                    fzw_0.a.c("giftLock");
                } else {
                    fzw_0.a.b("giftLock");
                    fpm_0.b().a("playerGiftDialog", cfi_0.a("playerGiftDialog"), 32769L, (short)10000);
                }
                return false;
            }
        }
        return true;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fis_1.a().a("playerGift", bxh_2.a());
            fpm_0.b().a("wakfu.playerGift", cjj_0.class);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fis_1.a().a("playerGift", (Object)null);
            fpm_0.b().o("playerGiftDialog");
            fpm_0.b().e("wakfu.playerGift");
        }
    }
}

