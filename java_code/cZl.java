/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class cZl
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(cZl.class);
    private static final cZl b = new cZl();
    private bDn c;
    bye_1 d;
    private ans_1 e;

    public static cZl a() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 16552: {
                dgt_0 dgt_02 = (dgt_0)adt_12;
                switch (this.d.e()) {
                    case 1: {
                        this.d.b(dgt_02.k());
                        break;
                    }
                    case 0: {
                        this.d.a(dgt_02.k());
                    }
                }
                return false;
            }
            case 17018: {
                if (this.d.g() == byi_1.c) {
                    return false;
                }
                dfc dfc2 = (dfc)adt_12;
                short s2 = (short)dfc2.c();
                this.d.a(s2);
                return false;
            }
            case 19289: {
                if (this.d.g() == byi_1.c) {
                    return false;
                }
                dfc dfc3 = (dfc)adt_12;
                short s3 = (short)dfc3.c();
                this.d.b(s3);
                return false;
            }
            case 19611: {
                dgv_0 dgv_02 = (dgv_0)adt_12;
                String string = eai_0.a(dgv_02.k());
                fit_1 fit_12 = fis_1.a().f("guildCreation.hasItem");
                if (fit_12 == null || !fit_12.h()) {
                    return false;
                }
                eak_0 eak_02 = eai_0.d(string);
                eaj_0 eaj_02 = eak_02.b();
                if (eaj_02 != eaj_0.a) {
                    String string2 = this.a(eaj_02);
                    fpm_0.b().a(string2, cfn_0.a(1), 2L, 102, 3);
                    return false;
                }
                String string3 = bae.h().a("guild.creation.validate", string);
                fzm_0 fzm_02 = fpm_0.b().a(string3, cfn_0.a(4), 6L, 102, 3);
                fzm_02.a(new czm_0(this, string));
                return false;
            }
            case 18040: {
                fit_1 fit_13 = fis_1.a().f("guildBlazonChange.hasItem");
                if (fit_13 == null || !fit_13.h()) {
                    return false;
                }
                bmr_1 bmr_12 = azu_0.j().k();
                long l = bmr_12.eV().b();
                long l2 = this.d.f().e();
                if (l2 == l) {
                    fpm_0.b().a(bae.h().a("guild.error.same.blazon", new Object[0]), cfn_0.a(1), 2L, 102, 3);
                    return false;
                }
                String string = bae.h().a("guild.change.blazon.validate", new Object[0]);
                fzm_0 fzm_03 = fpm_0.b().a(string, cfn_0.a(4), 6L, 102, 3);
                fzm_03.a(new cZn(this));
                return false;
            }
            case 16703: {
                fit_1 fit_14 = fis_1.a().f("guildNameChange.hasItem");
                bmr_1 bmr_13 = azu_0.j().k();
                String string = bmr_13.eV().a();
                boolean bl = era_1.e.matcher(string).find();
                if (!(fit_14 != null && fit_14.h() || bl)) {
                    return false;
                }
                dfc dfc4 = (dfc)adt_12;
                String string4 = eai_0.a(dfc4.h());
                eak_0 eak_03 = eai_0.d(string4);
                eaj_0 eaj_03 = eak_03.b();
                if (eaj_03 != eaj_0.a) {
                    String string5 = this.a(eaj_03);
                    fpm_0.b().a(string5, cfn_0.a(1), 2L, 102, 3);
                    return false;
                }
                if (string4.equalsIgnoreCase(string)) {
                    fpm_0.b().a(bae.h().a("guild.error.same.name", new Object[0]), cfn_0.a(1), 2L, 102, 3);
                    return false;
                }
                String string6 = bae.h().a("guild.change.name.validate", string4);
                fzm_0 fzm_04 = fpm_0.b().a(string6, cfn_0.a(4), 6L, 102, 3);
                fzm_04.a(new cZo(this, string4));
                return false;
            }
            case 16395: {
                dfc dfc5 = (dfc)adt_12;
                byh_1 byh_12 = (byh_1)dfc5.j();
                this.d.a(byh_12);
                return false;
            }
            case 19041: {
                dfc dfc6 = (dfc)adt_12;
                int n = dfc6.c();
                this.d.a(n);
                return false;
            }
            case 16029: {
                azu_0.j().b(b);
                return false;
            }
            case 18066: {
                this.d.a();
                return false;
            }
            case 16041: {
                dfc dfc7 = (dfc)adt_12;
                this.d.a(dfc7.h());
                return false;
            }
        }
        return true;
    }

    private String a(eaj_0 eaj_02) {
        String string;
        switch (eaj_02) {
            case m: {
                string = bae.h().a("error.guild.creation.forbiddenName", new Object[0]);
                break;
            }
            case n: {
                string = bae.h().a("error.guild.creation.invalidDashPosition", new Object[0]);
                break;
            }
            case e: {
                string = bae.h().a("error.characterCreation.tooManyConsonant", new Object[0]);
                break;
            }
            case f: {
                string = bae.h().a("error.characterCreation.tooManyVowel", new Object[0]);
                break;
            }
            case c: {
                string = bae.h().a("error.characterCreation.nameTooLong", new Object[0]);
                break;
            }
            case b: {
                string = bae.h().a("error.characterCreation.nameTooShort", new Object[0]);
                break;
            }
            case d: {
                string = bae.h().a("error.characterCreation.badChar", new Object[0]);
                break;
            }
            case g: {
                string = bae.h().a("error.characterCreation.tooManyConsecutiveIdentical", new Object[0]);
                break;
            }
            case h: {
                string = bae.h().a("error.characterCreation.tooFewVowelInPart", new Object[0]);
                break;
            }
            case i: {
                string = bae.h().a("error.characterCreation.tooFewConsonantInPart", new Object[0]);
                break;
            }
            case j: {
                string = bae.h().a("error.characterCreation.tooManySpecialInPart", new Object[0]);
                break;
            }
            case k: {
                string = bae.h().a("error.characterCreation.parTooLong", new Object[0]);
                break;
            }
            case l: {
                string = bae.h().a("error.characterCreation.tooManySpecial", new Object[0]);
                break;
            }
            case o: {
                string = bae.h().a("error.guild.creation.nameWithBadCase", new Object[0]);
                break;
            }
            default: {
                string = bae.h().a("error.guild.creation.invalidName", new Object[0]);
            }
        }
        return string;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    private void d() {
        bmr_1 bmr_12 = azu_0.j().k();
        long l = bmr_12.dK().a();
        int n = eqn_2.a.b();
        int n2 = eqn_2.a.a();
        int n3 = eqn_2.a.c();
        int n4 = eqn_2.a.d();
        exk_2 exk_22 = bmr_12.da().e(n);
        exk_2 exk_23 = bmr_12.da().e(n3);
        exk_2 exk_24 = bmr_12.da().e(n4);
        fis_1.a().a("guildCreation.hasItem", exk_22 != null);
        fis_1.a().a("guildCreation.itemDescription", eyo_1.g().d(n));
        fis_1.a().a("guildBlazonChange.hasItem", exk_23 != null);
        fis_1.a().a("guildBlazonChange.itemDescription", eyo_1.g().d(n3));
        fis_1.a().a("guildNameChange.hasItem", exk_24 != null);
        fis_1.a().a("guildNameChange.itemDescription", eyo_1.g().d(n4));
        fis_1.a().a("guildCreation.hasMoney", l >= (long)n2);
        fis_1.a().a("guildCreation.feeDescription", n2);
        fis_1.a().a("guildBannerColors", bxm_1.a().c());
        fis_1.a().a("guildCreationView", this.d);
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.e = new czp_0(this);
            this.c.aI_();
            this.d();
            fpm_0.b().a(this.e);
            fpm_0.b().a("guildCreatorDialog", cfi_0.a("guildCreatorDialog"), 33024L, (short)10000);
            fpm_0.b().a("wakfu.guildBannerCreator", cHh.class);
        }
    }

    @NotNull
    private bye_1 e() {
        if (this.d == null) {
            this.d = new bye_1();
            this.d.a("");
        }
        return this.d;
    }

    public void a(bDn bDn2, byi_1 byi_12) {
        if (!azu_0.j().c(this)) {
            this.c = bDn2;
            bye_1 bye_12 = this.e();
            bye_12.a(byi_12);
            bye_12.a(0);
            if (byi_12 == byi_1.a) {
                if (bye_12.h() == null) {
                    bye_12.a(bxp_1.a().b());
                }
            } else {
                bmr_1 bmr_12 = azu_0.j().k();
                eqd_2 eqd_22 = new eqd_2(bmr_12.eV().b());
                if (byi_12 == byi_1.c || bye_12.h() == null) {
                    bye_12.a(new bxo_1(eqd_22));
                }
                bye_12.b(new bxo_1(eqd_22));
                if (byi_12 == byi_1.b || Cz.f(bye_12.c())) {
                    bye_12.a(bmr_12.eV().a());
                }
            }
            azu_0.j().a(this);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.c.aI_();
            fpm_0.b().b(this.e);
            fpm_0.b().o("guildCreatorDialog");
            fpm_0.b().e("wakfu.guildBannerCreator");
            fis_1.a().a("guildBannerColors");
        }
    }

    public void c() {
        if (this.d != null) {
            this.d.b();
            this.d.a("");
        }
    }

    public void a(bDn bDn2) {
        this.c = bDn2;
    }
}

