/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class cXO
implements ahr_1 {
    private static final Logger a = Logger.getLogger(cXO.class);
    private static final cXO b = new cXO();
    private bsm_1 c;
    private ans_1 d;

    public static cXO a() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 18075: {
                dfq_0 dfq_02 = (dfq_0)adt_12;
                ffl ffl2 = this.c.c().a(ffp.b);
                if (ffl2 == null) {
                    ffl2 = new ffl(ffp.b);
                    this.c.a(ffl2);
                }
                if (dfq_02.i()) {
                    ffl2.b(ffk.a(dfq_02.c()));
                } else {
                    ffl2.c(ffk.a(dfq_02.c()));
                }
                fis_1.a().a((ajf_1)dfq_02.k(), "guildPerms");
                return false;
            }
            case 19014: {
                dfq_0 dfq_03 = (dfq_0)adt_12;
                ffl ffl3 = this.c.c().a(ffp.a);
                if (ffl3 == null) {
                    ffl3 = new ffl(ffp.a);
                    this.c.a(ffl3);
                }
                if (dfq_03.i()) {
                    ffl3.b(ffk.a(dfq_03.c()));
                } else {
                    ffl3.c(ffk.a(dfq_03.c()));
                }
                fis_1.a().a((ajf_1)dfq_03.k(), "anonymousPerms");
                return false;
            }
            case 19814: {
                dfc dfc2 = (dfc)adt_12;
                String string = dfc2.h();
                blx_1 blx_12 = bmf_2.a().a(string);
                if (blx_12 == null) {
                    aUh.a("error.playerUnknownInDimensionalBag", new Object[]{string});
                    return false;
                }
                this.c.a(new ffm(blx_12.a_(), string));
                return false;
            }
            case 17908: {
                dfc dfc3 = (dfc)adt_12;
                this.c.a(dfc3.d());
                return false;
            }
            case 17542: {
                dfq_0 dfq_04 = (dfq_0)adt_12;
                ffm ffm2 = this.c.c().a(dfq_04.d());
                ffk ffk2 = ffk.a(dfq_04.c());
                if (dfq_04.i()) {
                    ffm2.b(ffk2);
                } else {
                    ffm2.c(ffk2);
                }
                dfq_04.k().e();
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
            this.d = new cxp_0(this);
            fpm_0.b().a(this.d);
            ffn ffn2 = azu_0.j().k().di().x();
            if (ffn2 != null) {
                this.c = new bsm_1(ffn2);
                fis_1.a().a("roomPermissions", this.c);
            }
            fis_1.a().a("roomViewDisplayed", (Object)null);
            fpm_0.b().a("dimensionalBagRoomAdministrationDialog", cfi_0.a("dimensionalBagRoomAdministrationDialog"), 32769L, (short)10000);
            fpm_0.b().a("wakfu.roomAdministration", cjs_0.class);
            cdw_0.n().z();
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().o("dimensionalBagRoomAdministrationDialog");
            fpm_0.b().o("dimensionalBagRoomIndividualRightsDialog");
            bmr_1 bmr_12 = azu_0.j().k();
            bsx_2 bsx_22 = bmr_12.di();
            if (bsx_22 != null) {
                bsx_22.a(this.c.c());
            }
            this.c = null;
            fpm_0.b().b(this.d);
            fis_1.a().a("roomPermissions");
            fis_1.a().a("roomViewDisplayed");
            fpm_0.b().e("wakfu.roomAdministration");
            cdw_0.n().A();
        }
    }

    public String toString() {
        return "UIDimensionalBagRoomAdministrationFrame{m_dimBagRightsView=" + this.c + ", m_dialogUnloadListener=" + this.d + "}";
    }
}

