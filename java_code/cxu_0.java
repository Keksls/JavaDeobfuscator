/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.console.command.display.EnableMiniMapCommand;

/*
 * Renamed from cXu
 */
public class cxu_0
implements ahr_1 {
    private static final cxu_0 a = new cxu_0();
    private fvk_0 b;
    private static final byte c = 0;
    private fil_1 d;
    private final fjx_1 e = new fjx_1();

    public static cxu_0 a() {
        return a;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        if (adt_12 instanceof adh_2) {
            int n = ((adh_2)adt_12).c();
            switch (n) {
                case 0: {
                    blj_1.D().f();
                }
            }
            return false;
        }
        switch (adt_12.a()) {
            case 16893: {
                dfc dfc2 = (dfc)adt_12;
                this.a(dfc2.i(), false);
                return false;
            }
            case 16573: {
                boolean bl = fis_1.a().c("player.displayStates");
                fis_1.a().a("player.displayStates", !bl);
                return false;
            }
            case 17946: {
                azu_0.j().a(dbA.a());
                return false;
            }
        }
        return true;
    }

    public void a(int n, int n2) {
        if (n2 == 0) {
            return;
        }
        fyy_0 fyy_02 = this.i();
        if (fyy_02 == null) {
            return;
        }
        fsk_0 fsk_02 = (fsk_0)fyy_02.a("citizenContainer");
        fbx_1 fbx_12 = new fbx_1();
        fbx_12.onCheckOut();
        fbx_12.setAlignment(frs_0.e);
        fbx_12.setLevel(1);
        fbx_12.setFile(n2 > 0 ? "800195.xps" : "800196.xps");
        fbx_12.setX((int)fbx_12.getPosition().a());
        fbx_12.setY((int)fbx_12.getPosition().b() - 5);
        fbx_12.setTimeToLive(1000);
        ((fvE)fsk_02).getAppearance().add(fbx_12);
    }

    public void a(boolean bl) {
        fyy_0 fyy_02 = this.i();
        if (fyy_02 != null) {
            fvE fvE2 = (fvE)fyy_02.a("nwButton");
            if (fvE2 != null) {
                fvE2.setEnabled(bl);
            }
            if ((fvE2 = (fvE)fyy_02.a("neButton")) != null) {
                fvE2.setEnabled(bl);
            }
            if ((fvE2 = (fvE)fyy_02.a("swButton")) != null) {
                fvE2.setEnabled(bl);
            }
            if ((fvE2 = (fvE)fyy_02.a("seButton")) != null) {
                fvE2.setEnabled(bl);
            }
        }
    }

    @Override
    public long a_() {
        return 10L;
    }

    @Override
    public void a(long l) {
    }

    private fyy_0 i() {
        return fpm_0.b().h().d("worldAndFightBarDialog");
    }

    public fvk_0 c() {
        return this.b;
    }

    public void d() {
        fvE fvE2 = (fvE)this.i().a("fightInfoBtn");
        if (fvE2 == null) {
            return;
        }
        deu.a(fvE2);
    }

    public void e() {
        fvE fvE2 = (fvE)this.i().a("symbiotBtn");
        if (fvE2 == null) {
            return;
        }
        deu.a(fvE2);
    }

    public void f() {
        fvE fvE2 = (fvE)this.i().a("communityButton");
        if (fvE2 == null) {
            return;
        }
        deu.a(fvE2);
    }

    public void g() {
        fvE fvE2 = (fvE)this.i().a("spellButton");
        if (fvE2 == null) {
            return;
        }
        deu.a(fvE2);
    }

    public void a(fid fid2, short s2) {
        String string = null;
        switch (fid2) {
            case b: {
                string = "spellsShortcutList";
                break;
            }
            case a: {
                string = "itemsShortcutList";
            }
        }
        if (string == null) {
            return;
        }
        fsQ fsQ2 = (fsQ)this.i().a(string);
        if (fsQ2 == null) {
            return;
        }
        ftj_0 ftj_02 = fsQ2.getRenderableByOffset(s2);
        if (ftj_02 == null) {
            return;
        }
        fvE fvE2 = (fvE)ftj_02.getInnerElementMap().a("borderContainer");
        if (fvE2 == null) {
            return;
        }
        azf_2 azf_22 = new azf_2(0.531f, 0.812f, 0.835f, 1.0f);
        azf_2 azf_23 = new azf_2(azf_2.e.i());
        fjp_2 fjp_22 = new fjp_2(azf_23, azf_22, fvE2.getAppearance(), 0, 500, 6, fjw_2.b);
        fvE2.getAppearance().addTween(fjp_22);
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fis_1.a().a("isInFight", false);
            fis_1.a().a("isFightSpectator", false);
            bmr_1 bmr_12 = azu_0.j().k();
            bmr_12.cg().w();
            fis_1.a().a("challengeDetailsVisible", false);
            fis_1.a().a("chat.enable.interactions", !bmr_12.f(erl_2.aa));
            fis_1.a().a("aptitude.enable.interactions", !bmr_12.f(erl_2.aP));
            fis_1.a().a("fighter.enable.interactions", !bmr_12.f(erl_2.aQ));
            fis_1.a().a("quests.enable.interactions", !bmr_12.f(erl_2.aT));
            fis_1.a().a("spells.enable.interactions", !bmr_12.f(erl_2.aU));
            fis_1.a().a("inventory.enable.interactions", !bmr_12.f(erl_2.aS));
            fis_1.a().a("character.sheet.enable.interactions", !bmr_12.f(erl_2.aV));
            fis_1.a().a("followed.achievements.enable.interactions", !bmr_12.f(erl_2.ab));
            dem.a();
            this.j();
            this.l();
            azu_0.j().a(dcc.a());
            azu_0.j().a(ddd.a());
            this.b = (fvk_0)fpm_0.b().a("worldAndFightBarDialog", cfi_0.a("worldAndFightBarDialog"), 270336L, (short)10005);
            fpm_0.b().a("wakfu.controlCenter", cgq_0.class);
            fis_1.a().a("controlCenter.forcePopup", true);
            cgu_2.a().a(this);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.h();
            this.k();
            fpm_0.b().o("worldAndFightBarDialog");
            this.b = null;
            fpm_0.b().e("wakfu.controlCenter");
            azu_0.j().b(dcc.a());
            azu_0.j().b(ddd.a());
            cgu_2.a().b(this);
        }
    }

    private void j() {
        blj_1.D().b();
        fpm_0.b().a("minimapPopup", cfi_0.a("minimapPopup"), 8200L, (short)10000);
        fyy_0 fyy_02 = fpm_0.b().h().d("minimapPopup");
        if (fyy_02 != null) {
            this.d = (fil_1)fyy_02.a("popup");
        }
        fyb_0 fyb_02 = fpm_0.b().a("minimapDialog", cfi_0.a("minimapDialog"), 9216L, (short)10000);
        this.e.a(fyb_02.getElementMap());
        fsS fsS2 = (fsS)fyb_02.getElementMap().a("navigator");
        blj_1.D().a(fsS2);
        blj_1.D().z().g();
        adi_2.a().a(this, 200L, 0, -1L);
        bvx_0 bvx_02 = (bvx_0)ans_0.D().h();
        boolean bl = bvx_02.a(bWe.af);
        EnableMiniMapCommand.a(bl);
    }

    private void k() {
        adi_2.a().a(this, 0);
        fpm_0.b().o("minimapDialog");
        fpm_0.b().o("minimapPopup");
        this.e.a(null);
        this.d = null;
        blj_1.D().a((fsR)null);
    }

    public final void a(fci_2 fci_22) {
        String string = fci_22.o().e();
        if (string == null || string.length() == 0) {
            return;
        }
        fis_1.a().a("minimapPopupDescription", (Object)string);
        fsS fsS2 = (fsS)fci_22.e();
        this.e.a(fci_22.k() + fsS2.getScreenX() - fci_22.m() / 2);
        this.e.b(fci_22.l() + fsS2.getScreenY() - fci_22.n() / 2);
        this.e.c(fci_22.m());
        this.e.d(fci_22.n());
        this.d.b(this.e);
    }

    public void a(boolean bl, boolean bl2) {
        fvE fvE2;
        if (!bl2 && bl != EnableMiniMapCommand.b()) {
            return;
        }
        fyy_0 fyy_02 = fpm_0.b().h().d("minimapDialog");
        if (fyy_02 != null && (fvE2 = (fvE)fyy_02.a("window")) != null) {
            fvE2.setVisible(bl);
            blj_1.D().a((fsR)fyy_02.a("navigator"));
        }
    }

    public void b(boolean bl) {
        fyy_0 fyy_02 = this.i();
        if (fyy_02 == null) {
            return;
        }
        fyb_0 fyb_02 = fyy_02.a("emoteButton");
        if (fyb_02 == null) {
            return;
        }
        ((fup_0)fyb_02).setSelected(bl);
    }

    private void l() {
        if (!fpm_0.b().q("sundialDialog")) {
            fpm_0.b().a("sundialDialog", cfi_0.a("sundialDialog"), 8320L, (short)10000);
        }
    }

    public void h() {
        fpm_0.b().o("sundialDialog");
    }

    public void c(boolean bl) {
        fyy_0 fyy_02 = fpm_0.b().h().d("sundialDialog");
        if (fyy_02 == null) {
            return;
        }
        fvE fvE2 = (fvE)fyy_02.a("mainContainer");
        if (fvE2 == null) {
            return;
        }
        fvE2.setVisible(bl);
    }
}

