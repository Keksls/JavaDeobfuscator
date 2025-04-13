/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from ddy
 */
public class ddy_0
implements ahr_1,
ans_1 {
    private static final ddy_0 a = new ddy_0();
    private static final String b = "watcherContainer";
    private final ArrayList<String> c = new ArrayList();
    private final ArrayList<String> d = new ArrayList();
    private bxo_2 e;

    public static ddy_0 a() {
        return a;
    }

    public void c() {
    }

    public void a(blx_1 blx_12) {
        if (box_2.a(blx_12)) {
            return;
        }
        String string = "fighterDescriptionDialog" + blx_12.a_();
        if (this.d.contains(string)) {
            this.a(string);
        } else {
            this.a(blx_12, string);
        }
    }

    public void b(blx_1 blx_12) {
        String string = "fighterDescriptionDialog" + blx_12.a_();
        this.a(blx_12, string);
    }

    public void c(blx_1 blx_12) {
        String string = "fighterDescriptionDialog" + blx_12.a_();
        this.a(string);
    }

    private void a(blx_1 blx_12, String string) {
        if (blx_12.f(eoz_1.at)) {
            return;
        }
        if (!this.d.contains(string)) {
            this.d.add(string);
            fvE fvE2 = (fvE)fpm_0.b().a(string, cfi_0.a("fighterDescriptionDialog"), 1L, (short)10000);
            fis_1.a().a("fighter", (Object)blx_12, string);
            fvE2.setSizeToPrefSize();
        }
    }

    private void a(String string) {
        if (this.d.remove(string)) {
            fpm_0.b().o(string);
        }
    }

    @Override
    public void dialogUnloaded(String string) {
        this.d.remove(string);
    }

    private void a(ekk_0 ekk_02, erb_2 erb_22, boolean bl) {
        epa_1 epa_12 = (epa_1)ekk_02.av();
        if (epa_12 == null) {
            return;
        }
        String string = "timelineCellDialog2" + ekk_02.a_();
        if (bl) {
            abz_0 abz_02;
            Object object;
            bhr_2 bhr_22 = (bhr_2)((Object)ekk_02);
            bhn_2 bhn_22 = bhr_22.aq();
            if (bhn_22 == null) {
                return;
            }
            if (erb_22 != null) {
                object = (blx_1)erb_22;
                abz_02 = ((blx_1)object).bv();
            } else {
                abz_02 = bhn_22.q();
            }
            if (fpm_0.b().q(string)) {
                fyy_0 fyy_02 = fpm_0.b().h().d(string);
                object = (fvc_0)fyy_02.a(b);
            } else {
                object = (fvc_0)fpm_0.b().a(string, cfi_0.a("timelineCellDialog2"), 8192L, (short)10000);
            }
            fis_1.a().a("timeline.fighter", (Object)new cut_0(epa_12, ekk_02.v() instanceof blx_1 ? (blx_1)ekk_02.v() : null), string);
            ((fvc_0)object).setTarget(abz_02);
            if (!this.c.contains(string)) {
                this.c.add(string);
            }
        } else if (this.c.remove(string)) {
            fpm_0.b().o(string);
        }
    }

    private void a(csa_1 csa_12, boolean bl) {
        String string = "timelineCellDialog" + csa_12.a_();
        if (bl) {
            if (!this.c.contains(string)) {
                fvc_0 fvc_02 = (fvc_0)fpm_0.b().a(string, cfi_0.a("timelineCellDialog"), 8192L, (short)10000);
                fis_1.a().a("timeline.fighter", (Object)csa_12, fvc_02.getElementMap());
                fvc_02.setTarget(csa_12.cm());
                this.c.add(string);
            }
        } else if (this.c.remove(string)) {
            fpm_0.b().o(string);
        }
    }

    private void a(String string, boolean bl) {
    }

    public void a(int n) {
        fyy_0 fyy_02 = fpm_0.b().h().d("timePointBarDialog");
        if (fyy_02 == null) {
            return;
        }
        if (n == 3) {
            this.a((fvE)fyy_02.a("extraTurnScoreImage" + (n - 2)));
            this.a((fvE)fyy_02.a("extraTurnScoreImage" + (n - 1)), 250);
            this.a((fvE)fyy_02.a("extraTurnScoreImage" + n), 500);
        } else {
            this.a((fvE)fyy_02.a("extraTurnScoreImage" + n));
        }
    }

    private void a(fvE fvE2) {
        this.a(fvE2, 0);
    }

    private void a(fvE fvE2, int n) {
        if (fvE2 == null) {
            return;
        }
        fqj fqj2 = fvE2.getAppearance();
        azf_2 azf_22 = azf_2.e;
        azf_2 azf_23 = azf_2.b;
        fqj2.removeTweensOfType(fjp_2.class);
        fqj2.addTween(new fjp_2(azf_22, azf_23, fqj2, n, 250, 3, true, fjw_2.b));
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 18668: {
                dfp dfp2 = (dfp)adt_12;
                this.a((csa_1)dfp2.k(), dfp2.i());
                return false;
            }
            case 17998: {
                dfu_0 dfu_02 = (dfu_0)adt_12;
                this.a(dfu_02.o(), dfu_02.k(), dfu_02.i());
                return false;
            }
            case 18578: {
                boolean bl = fis_1.a().c("displaySecondTimeline");
                fis_1.a().a("displaySecondTimeline", !bl);
                return false;
            }
            case 16538: {
                boolean bl = fis_1.a().c("timeline.displayStates");
                fis_1.a().a("timeline.displayStates", !bl);
                return false;
            }
            case 17127: {
                dhK dhK2 = (dhK)adt_12;
                switch (dhK2.k().getKeyCode()) {
                    default: 
                }
                return false;
            }
            case 19672: {
                dhK dhK3 = (dhK)adt_12;
                switch (dhK3.k().getKeyCode()) {
                    default: 
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
            ajf_1 ajf_12;
            aNF aNF2 = (aNF)ans_0.D().c();
            aNF2.m(true);
            aNF2.n(true);
            fpm_0.b().a(this);
            fis_1.a().a("displaySecondTimeline", false);
            fis_1.a().a("timeline.displayStates", true);
            this.e = (bxo_2)fis_1.a().e("fight.timeline");
            if (this.e != null) {
                ajf_12 = (bvx_2)this.e.T();
                for (csa_1 csa_12 : ((els_0)((Object)ajf_12)).aA().b(new enw_2[0])) {
                    this.a(csa_12, true);
                }
                this.e.O();
            }
            if ((ajf_12 = azu_0.j().k()) == null) {
                azu_0.j().b(this);
                return;
            }
            fpm_0.b().a("timePointBarDialog", cfi_0.a("timePointBarDialog"), 270336L, (short)10000);
            fpm_0.b().a("wakfu.timeline", cJU.class);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            int n;
            aNF aNF2 = (aNF)ans_0.D().c();
            aNF2.m(false);
            aNF2.n(false);
            fpm_0.b().b(this);
            fpm_0.b().o("timePointBarDialog");
            fpm_0.b().o("timePointBonusSelectionDialog");
            for (n = this.c.size() - 1; n >= 0; --n) {
                fpm_0.b().o(this.c.get(n));
            }
            this.c.clear();
            for (n = this.d.size() - 1; n >= 0; --n) {
                fpm_0.b().o(this.d.get(n));
            }
            this.d.clear();
            fpm_0.b().e("wakfu.timeline");
        }
    }

    public void b(int n) {
        fyy_0 fyy_02 = null;
        if (fyy_02 == null) {
            return;
        }
        this.a(n, (fvE)fyy_02.a("numBonusLabel"));
    }

    private void a(int n, fvE fvE2) {
        ArrayList<fyb_0> arrayList = fvE2.getAppearance().getChildren();
        int n2 = arrayList.size();
        for (int k = 0; k < n2; ++k) {
            fyb_0 fyb_02 = arrayList.get(k);
            if (!(fyb_02 instanceof fbx_1)) continue;
            ((fbx_1)fyb_02).setLevel(n);
        }
    }

    public bxo_2 d() {
        return this.e;
    }
}

