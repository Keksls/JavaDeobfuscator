/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.Optional;
import org.apache.log4j.Logger;

public class dbU
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(dbU.class);
    private static final dbU c = new dbU();
    private ans_1 d;
    String e = null;
    private final TLongObjectHashMap<dbZ> f = new TLongObjectHashMap();
    final Runnable b = new dbV(this);

    void h() {
        Object object = fis_1.a().d("pet", "petDialog");
        if (object == null) {
            return;
        }
        fis_1.a().a((ajf_1)((bMi)object), ((bMi)object).d());
    }

    private int a(ffu_0 ffu_02) {
        ww_0 ww_02 = ffu_02.l().g(wc_0.p().a());
        return ww_02.d(ffu_02.a().f());
    }

    public static dbU a() {
        return c;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 18765: {
                bMi bMi2;
                dgO dgO2 = (dgO)adt_12;
                fit_1 fit_12 = fis_1.a().e("pet", "petDialog");
                long l = -1L;
                if (fit_12 != null && fit_12.f() instanceof bMi) {
                    l = ((bMi)fit_12.f()).j().a();
                }
                if ((bMi2 = (bMi)dgO2.k()) == null) {
                    a.error((Object)"Impossible de r\u00e9cup\u00e9rer le familier \u00e0 d\u00e9crire");
                    return false;
                }
                if (l != -1L && l != bMi2.j().a()) {
                    fis_1.a().a("pet", (Object)bMi2, "petDialog");
                } else {
                    String string = dgO2.o();
                    fpm_0.b().o(this.e);
                    if (!fpm_0.b().q("petDialog")) {
                        String string2 = "petDialog";
                        if (string == null) {
                            fvk_0 fvk_02 = (fvk_0)fpm_0.b().a("petDialog", cfi_0.a("petDialog"), 129L, (short)10000);
                            fvk_02.a(new dbW(this, fvk_02, dgO2));
                        } else {
                            fpm_0.b().a("petDialog", cfi_0.a("petDialog"), this.e == null ? string : this.e, string, "petDialog", 129L, (short)10000);
                        }
                        fis_1.a().a("pet", (Object)bMi2, "petDialog");
                        this.e = "petDialog";
                        dbU.a().c();
                    } else {
                        fpm_0.b().o("petDialog");
                    }
                }
                return false;
            }
            case 19934: {
                short s2;
                dhi_0 dhi_02 = (dhi_0)adt_12;
                exk_2 exk_22 = dhi_02.o();
                if (exk_22 == null) {
                    return false;
                }
                bMi bMi3 = dhi_02.k();
                if (bMi3 == null) {
                    return false;
                }
                ffu_0 ffu_02 = bMi3.f();
                fge fge2 = ffu_02.a();
                int n = exk_22.aT_();
                boolean bl = fge2.f(n);
                boolean bl2 = fge2.a(n);
                boolean bl3 = fge2.b(n);
                if (!(bl || bl2 || bl3)) {
                    aUh.a("pet.chat.feedWithBadItem", new Object[]{bMi3.e()});
                    return false;
                }
                if (this.a(exk_22, bMi3)) {
                    aUA.a(erl_2.aA.b());
                    return false;
                }
                boolean bl4 = ffy.a(ffu_02, n);
                if (ffy.a(ffu_02) && bl4) {
                    aUh.a("error.feedFullHealPet", new Object[0]);
                    return false;
                }
                bmr_1 bmr_12 = (bmr_1)euu_2.c(azu_0.j().k().U_(), exk_22.a());
                if (bmr_12 == null) {
                    aUh.a("pet.feedUnauthorizedNotFromInventory", new Object[0]);
                    return false;
                }
                apc_2 apc_22 = exk_22.T().a(exz_1.h);
                if (exk_22.T().p() instanceof biu_1 || exk_22.aQ_() || apc_22 != null && !apc_22.b(bmr_12, exk_22, exk_22, bmr_12.eK())) {
                    aUh.a("pet.feedUnauthorized", new Object[0]);
                    return false;
                }
                eyw_1 eyw_12 = exk_22.T().p();
                if (eyw_12 != null && eyw_12.f() == eyx_1.G && ffy.b(ffu_02)) {
                    aUh.a("pet.xpItem.alreadyMaxLevel", new Object[0]);
                    return false;
                }
                short s3 = dhi_02.u();
                if (bl4) {
                    bio_1 bio_12;
                    int n2 = eyw_12 != null && eyw_12.f() == eyx_1.H ? ((bio_12 = (bio_1)eyw_12).g() < 0 ? fge2.d() : bio_12.g()) : fge2.c(n);
                    s2 = fge2.d() < ffu_02.f() + n2 * s3 ? dbU.a(fge2.d(), ffu_02.f(), n2) : s3;
                } else {
                    s2 = s3;
                }
                fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("question.feedPet", exk_22.N()), cfn_0.a(0), 2073L, 102, 1);
                fzm_02.a(new dbx_0(this, exk_22, bMi3, s2));
                return false;
            }
            case 16494: {
                dhj_0 dhj_02 = (dhj_0)adt_12;
                String string = dhj_02.h();
                bMi bMi4 = dhj_02.k();
                if (cby_2.a().a(string) && string.length() > 0 && !string.equals(bMi4.e())) {
                    cqh_0 cqh_02 = new cqh_0();
                    cqh_02.a(bMi4.j().a());
                    cqh_02.a(string);
                    azu_0.j().K().c(cqh_02);
                } else {
                    aUh.a("error.chat.operationNotPermited", new Object[0]);
                }
                return false;
            }
            case 18542: {
                anw_1 anw_12 = (anw_1)adt_12;
                int n = anw_12.c();
                bMi bMi5 = (bMi)fis_1.a().d("pet", "petDialog");
                this.a(bMi5, n);
                bMi bMi6 = (bMi)fis_1.a().d("pet", "petDialog");
                if (bMi6 == null) {
                    return false;
                }
                bMi6.b(n);
                return false;
            }
            case 19322: {
                int n;
                dgL dgL2 = (dgL)adt_12;
                bmr_1 bmr_13 = azu_0.j().k();
                exk_2 exk_23 = bmr_13.g(dgL2.d());
                if (exk_23 == null) {
                    return false;
                }
                bMi bMi7 = (bMi)fis_1.a().d("pet", "petDialog");
                if (bMi7 == null) {
                    return false;
                }
                fge fge3 = bMi7.b();
                if (fge3 == null) {
                    return false;
                }
                exk_2 exk_24 = dgL2.o();
                int n3 = n = exk_24 != null ? exk_24.aT_() : fge3.n();
                if (!fge3.e(n)) {
                    return false;
                }
                cqg_0 cqg_02 = new cqg_0();
                cqg_02.b(n);
                cqg_02.a(((dfc)adt_12).d());
                azu_0.j().K().c(cqg_02);
                return false;
            }
        }
        return true;
    }

    private static short a(double d2, double d3, double d4) {
        return (short)Math.ceil((d2 - d3) / d4);
    }

    private boolean a(exk_2 exk_22, bMi bMi2) {
        return azu_0.j().k().a(erl_2.aA) && (!ffy.b(bMi2.j().f(), exk_22.aT_()) || ffy.a(bMi2.j().f(), wc_0.p().a())) && !ffy.a(bMi2.j().f(), exk_22.aT_());
    }

    void a(bMi bMi2, exk_2 exk_22, short s2) {
        String string;
        ffu_0 ffu_02 = bMi2.j().f();
        wu_0 wu_02 = wc_0.p().a();
        biE biE2 = bMi2.l();
        eyw_1 eyw_12 = exk_22.T().p();
        if (ffu_02.a().f(exk_22.aT_())) {
            biE2.e("AnimEmote-Effrayee");
            biE2.E();
            string = bae.h().a("pet.chat.sleeping", wa_0.c(ffu_02.a().g(exk_22.aT_())));
        } else if (ffy.a(ffu_02, exk_22.aT_())) {
            bio_1 bio_12;
            biE2.e("AnimEmote-Rire");
            biE2.E();
            int n = eyw_12 != null && eyw_12.f() == eyx_1.H ? ((bio_12 = (bio_1)eyw_12).g() < 0 ? ffu_02.a().d() : bio_12.g() * s2) : ffu_02.a().c(exk_22.aT_()) * s2;
            string = bae.h().a("pet.chat.healing", n);
        } else if (!ffy.b(ffu_02, exk_22.aT_())) {
            biE2.e("AnimEmote-Effrayee");
            biE2.E();
            string = bae.h().a("pet.chat.feedWithBadItem", bMi2.e());
        } else if (ffy.a(ffu_02, wu_02)) {
            if (eyw_12 != null && eyw_12.f() == eyx_1.G) {
                return;
            }
            biE2.e("AnimEmote-Effrayee");
            biE2.E();
            boolean bl = azu_0.j().k().N_().a(enw_0.r);
            string = bl ? bae.h().a("pet.chat.feedNotHungry", new Object[0]) : bae.h().a("pet.chat.feedNotHungry", ffu_02.a().a(ffz_0.b));
        } else if (eyw_12 != null && eyw_12.f() == eyx_1.G) {
            biE2.e("AnimEmote-Rire");
            biE2.E();
            bip_1 bip_12 = (bip_1)eyw_12;
            int n = bip_12.g() * ffu_02.a().h();
            string = bae.h().a("pet.chat.feedGood", n);
        } else {
            biE2.e("AnimEmote-Rire");
            biE2.E();
            string = bae.h().a("pet.chat.feedGood", ffu_02.a().g());
        }
        aul_0.a().c(string);
    }

    private String h(exk_2 exk_22) {
        return "petDialog_" + exk_22.a();
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
            this.d = new dbY(this);
            fpm_0.b().a(this.d);
            fpm_0.b().a("wakfu.pet", cJh.class);
            ado_1.a().a(this.b, 1000L, -1);
            this.a(false);
            cgu_2.a().a(this);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.j();
            ado_1.a().b(this.b);
            this.e = null;
            fpm_0.b().b(this.d);
            fpm_0.b().e("wakfu.pet");
            cgu_2.a().b(this);
        }
    }

    public void a(exk_2 exk_22) {
        if (this.f.contains(exk_22.a())) {
            return;
        }
        dbZ dbZ2 = new dbZ(this, exk_22);
        this.f.put(exk_22.a(), (Object)dbZ2);
    }

    public void b(exk_2 exk_22) {
        if (!this.f.contains(exk_22.a())) {
            return;
        }
        exk_22.f().b((ffb_0)this.f.get(exk_22.a()));
        this.f.remove(exk_22.a());
    }

    public void c() {
        ado_1.a().b(this.b);
        ado_1.a().a(this.b, 1000L, -1);
    }

    public boolean d() {
        if (this.e != null) {
            return false;
        }
        return fis_1.a().d("pet", "inventoryDialog") == null;
    }

    public void e() {
        if (!this.d()) {
            return;
        }
        ado_1.a().b(this.b);
    }

    public boolean a(bMi bMi2) {
        return this.c(bMi2.j());
    }

    public boolean c(exk_2 exk_22) {
        if (this.e == null) {
            return false;
        }
        return this.e.contains(this.h(exk_22));
    }

    public void f() {
        if (this.e == null) {
            return;
        }
        bMi bMi2 = (bMi)fis_1.a().d("pet", this.e);
        bMi2.a();
        bMi2.k();
        this.i();
    }

    private void i() {
        bMi bMi2 = (bMi)fis_1.a().d("pet", "inventoryDialog");
        if (bMi2 == null) {
            return;
        }
        exk_2 exk_22 = bMi2.j();
        if (exk_22 == null) {
            return;
        }
        if (exk_22.T() == null) {
            return;
        }
        bMi2.a();
        bMi2.k();
    }

    public void d(exk_2 exk_22) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return;
        }
        if (this.c(exk_22)) {
            fpm_0.b().o(this.h(exk_22));
        }
        this.f();
        this.a(true);
    }

    private void a(boolean bl) {
        this.j();
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return;
        }
        bHi bHi2 = bmr_12.da();
        if (bHi2 != null) {
            for (exk_2 exk_23 : bHi2.e()) {
                this.a(exk_23, bl);
            }
        }
        Optional<exk_2> optional = bmr_12.dC().b(bmr_12.cG().a(exh_2.w));
        optional.ifPresent(exk_22 -> this.a((exk_2)exk_22, bl));
        Optional<exk_2> optional2 = bmr_12.dC().b(bmr_12.cG().a(exh_2.y));
        optional2.ifPresent(exk_22 -> this.a((exk_2)exk_22, bl));
    }

    private void a(exk_2 exk_22, boolean bl) {
        if (!exk_22.aQ_()) {
            return;
        }
        this.a(exk_22);
        if (bl) {
            return;
        }
        ffu_0 ffu_02 = exk_22.f();
        if (ffu_02.l().b(ffu_02.k())) {
            return;
        }
        if (ffu_02.f() == 0) {
            this.e(exk_22);
        } else if (this.a(ffu_02) > 0) {
            this.f(exk_22);
        }
    }

    public void a(bMi bMi2, int n) {
        bmr_1 bmr_12 = bjb_1.a.g();
        if (bmr_12 == null) {
            return;
        }
        fk_2 fk_22 = bol_1.a(bmr_12.R(), bmr_12.a_(), ft_1.b);
        if (fk_22.f() && fk_22.g() == n) {
            return;
        }
        fm_2 fm_22 = fk_2.i().a(fk_22);
        if (n == 0) {
            fm_22.o();
        } else {
            fm_22.c(n);
        }
        cmn cmn2 = new cmn(bmr_12.a_(), ft_1.b, true, fm_22.j());
        azu_0.j().K().c(cmn2);
    }

    private void j() {
        this.f.forEachValue(dbZ2 -> {
            dbZ2.b.f().b((ffb_0)dbZ2);
            return true;
        });
        this.f.clear();
    }

    public void e(exk_2 exk_22) {
        ffu_0 ffu_02 = exk_22.f();
        String string = ffu_02.b() != null && ffu_02.b().length() > 0 ? ffu_02.b() : exk_22.N();
        aUh.b("pet.chat.weak", string);
    }

    public void f(exk_2 exk_22) {
        ffu_0 ffu_02 = exk_22.f();
        if (ffu_02.f() == 0) {
            return;
        }
        boolean bl = azu_0.j().k().N_().a(enw_0.r);
        if (bl) {
            return;
        }
        int n = ffu_02.a().a(ffz_0.a);
        String string = ffu_02.b() != null && ffu_02.b().length() > 0 ? ffu_02.b() : exk_22.N();
        aUh.b("pet.chat.hungry", string, n);
    }

    public void g(exk_2 exk_22) {
        if (this.e == null) {
            return;
        }
        int n = exk_22.aT_();
        bMi bMi2 = (bMi)fis_1.a().d("pet", this.e);
        fyy_0 fyy_02 = fpm_0.b().h().d(this.e);
        ffu_0 ffu_02 = bMi2.j().f();
        if (ffu_02.a().e(n)) {
            fsk_0 fsk_02 = (fsk_0)fyy_02.a("colorImageContainer");
            this.a(fsk_02);
        } else if (ffu_02.a().d(n)) {
            fsk_0 fsk_03 = (fsk_0)fyy_02.a("equipmentImageContainer");
            this.a(fsk_03);
        } else if (ffy.b(ffu_02, n) || ffy.a(ffu_02, n) || ffu_02.a().f(n)) {
            fsk_0 fsk_04 = (fsk_0)fyy_02.a("petPortrait");
            this.a(fsk_04);
        }
    }

    private void a(fsk_0 fsk_02) {
        fqp fqp2 = fsk_02.getAppearance();
        azf_2 azf_22 = new azf_2(azf_2.e.i());
        azf_2 azf_23 = new azf_2(azf_2.d.i());
        fqp2.removeTweensOfType(fjp_2.class);
        ((fqj)fqp2).setModulationColor(azf_22);
        fjp_2 fjp_22 = new fjp_2(azf_22, azf_23, fqp2, 0, 300, -1, fjw_2.b);
        fqp2.addTween(fjp_22);
    }

    public void g() {
        if (this.e == null) {
            return;
        }
        fyy_0 fyy_02 = fpm_0.b().h().d(this.e);
        this.a(fyy_02, "colorImageContainer");
        this.a(fyy_02, "equipmentImageContainer");
        this.a(fyy_02, "petPortrait");
    }

    private void a(fyy_0 fyy_02, String string) {
        try {
            fsk_0 fsk_02 = (fsk_0)fyy_02.a(string);
            if (fsk_02 == null || fsk_02.isUnloading()) {
                return;
            }
            fsk_02.getAppearance().removeTweensOfType(fjp_2.class);
        }
        catch (Exception exception) {
            a.error((Object)"", (Throwable)exception);
        }
    }
}

