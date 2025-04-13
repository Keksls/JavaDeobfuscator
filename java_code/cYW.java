/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class cYW
implements ahr_1 {
    private static final Logger a = Logger.getLogger(cYW.class);
    private static final cYW b = new cYW();
    private final ut_0 c = new ut_0();
    private final abv_0 d = new abv_0("fightPlacement", new float[]{1.0f, 1.0f, 1.0f, 1.0f});
    private epq_2 e;
    private apo_0 f = new apo_0();

    public static cYW a() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        bmr_1 bmr_12 = azu_0.j().k();
        switch (adt_12.a()) {
            case 18331: {
                bvx_2 bvx_22 = bmr_12.bz();
                bvx_2 bvx_23 = bmr_12.dm();
                if (bvx_23 != null) {
                    return false;
                }
                if (bvx_22 == null) {
                    a.error((Object)"Receiving ready status message without being in a fight");
                    return false;
                }
                if (bvx_22.e() != elp_0.b) {
                    return false;
                }
                cnd cnd2 = new cnd();
                biI biI2 = bmr_12.bv();
                if (!bvx_22.j(bmr_12)) {
                    this.e = null;
                    this.d();
                    cnd2.a(true);
                    bvx_22.h(bmr_12);
                    if (!bvx_22.k(bmr_12)) {
                        cYW.a(bvx_22);
                    } else {
                        bwa_0.a(biI2, biI2.bQ());
                    }
                } else {
                    cnd2.a(false);
                    cYW.b(bvx_22);
                    bvx_22.i(bmr_12);
                }
                azu_0.j().K().c(cnd2);
                return false;
            }
            case 16836: {
                cna cna2 = new cna();
                if (this.e == null) {
                    cna2.a(azu_0.j().k().a_());
                } else {
                    cna2.a(this.e.a_());
                }
                cna2.a(aej_2.h);
                azu_0.j().K().c(cna2);
                return false;
            }
            case 19266: {
                cna cna3 = new cna();
                if (this.e == null) {
                    cna3.a(azu_0.j().k().a_());
                } else {
                    cna3.a(this.e.a_());
                }
                cna3.a(aej_2.b);
                azu_0.j().K().c(cna3);
                return false;
            }
            case 19380: {
                cna cna4 = new cna();
                if (this.e == null) {
                    cna4.a(azu_0.j().k().a_());
                } else {
                    cna4.a(this.e.a_());
                }
                cna4.a(aej_2.d);
                azu_0.j().K().c(cna4);
                return false;
            }
            case 18819: {
                cna cna5 = new cna();
                if (this.e == null) {
                    cna5.a(azu_0.j().k().a_());
                } else {
                    cna5.a(this.e.a_());
                }
                cna5.a(aej_2.f);
                azu_0.j().K().c(cna5);
                return false;
            }
            case 17645: {
                if (bmr_12.a(erl_2.af)) {
                    return false;
                }
                bvx_2 bvx_24 = bmr_12.bz();
                if (bvx_24 == null) {
                    a.error((Object)"The current fight for the local player has not been found");
                    return false;
                }
                boolean bl = !bvx_24.d(bmr_12.Y());
                bvx_24.a(bmr_12.Y(), bl);
                fis_1.a().a("currentFightRequestHelp", bl);
                cmo_0 cmo_02 = new cmo_0();
                cmo_02.a(bl);
                azu_0.j().K().c(cmo_02);
                aUh.c("fight.callForHelp", bmr_12.dp());
                return false;
            }
            case 18455: {
                if (cyp_0.g().n() != null) {
                    if (bmr_12.a(erl_2.ag)) {
                        return false;
                    }
                    cni_0 cni_02 = new cni_0();
                    boolean bl = ((dfc)adt_12).i();
                    cni_02.a(bl);
                    azu_0.j().K().c(cni_02);
                }
                return false;
            }
            case 18907: 
            case 19751: {
                if (!cyp_0.g().i()) {
                    return true;
                }
                this.f.c();
                dhL dhL2 = (dhL)adt_12;
                bmr_1 bmr_13 = azu_0.j().k();
                bvx_2 bvx_25 = bmr_13.bz();
                if (bvx_25 == null) {
                    return true;
                }
                if (bvx_25.j(bmr_13)) {
                    return true;
                }
                tg_0 tg_02 = bvx_25.g();
                ArrayList<DisplayedScreenElement> arrayList = ans_0.D().c().a((float)dhL2.r(), (float)dhL2.s(), (float)bmr_13.I(), acj.b);
                boolean bl = this.b(dhL2.r(), dhL2.s()) != null;
                epq_2 epq_22 = this.e == null ? bmr_13 : this.e;
                aff_1 aff_12 = this.a(bmr_13, tg_02, arrayList);
                this.d.a();
                if (aff_12 != null && !bl && !aff_12.equals(epq_22.P_())) {
                    this.d.a(aff_12.d(), aff_12.e(), aff_12.f());
                }
                return true;
            }
            case 16119: {
                if (!cyp_0.g().i()) {
                    return true;
                }
                dhL dhL3 = (dhL)adt_12;
                bmr_1 bmr_14 = azu_0.j().k();
                bvx_2 bvx_26 = bmr_14.cP();
                if (bvx_26.j(bmr_14)) {
                    return true;
                }
                tg_0 tg_03 = bvx_26.g();
                ArrayList<DisplayedScreenElement> arrayList = ans_0.D().c().a((float)dhL3.r(), (float)dhL3.s(), (float)bmr_14.I(), acj.b);
                if (dhL3.o()) {
                    epq_2 epq_23;
                    aff_1 aff_13 = this.a(bmr_14, tg_03, arrayList);
                    boolean bl = this.a(dhL3.r(), dhL3.s());
                    epq_2 epq_24 = epq_23 = this.e == null ? bmr_14 : this.e;
                    if (!bl && aff_13 != null && !aff_13.equals(epq_23.P_())) {
                        cdw_0.n().c(600071L);
                        cmq_0 cmq_02 = new cmq_0();
                        cmq_02.a(this.e == null ? bmr_14.a_() : this.e.a_());
                        cmq_02.a(aff_13);
                        azu_0.j().K().c(cmq_02);
                    }
                } else {
                    if (dhL3.q()) {
                        this.e = null;
                        fzd_0.a().d();
                        return true;
                    }
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    private boolean a(int n, int n2) {
        epq_2 epq_22 = this.e;
        epq_2 epq_23 = this.b(n, n2);
        if (epq_23 != null) {
            this.e = epq_23;
        }
        this.d();
        return this.e != epq_22;
    }

    public void a(epq_2 epq_22) {
        this.e = epq_22;
    }

    public epq_2 c() {
        return this.e;
    }

    public void d() {
        epq_2 epq_22;
        bmr_1 bmr_12 = azu_0.j().k();
        epq_2 epq_23 = epq_22 = this.e == null ? bmr_12 : this.e;
        if (epq_22 instanceof bmv_1) {
            bmv_1 bmv_12 = (bmv_1)epq_22;
            if (bmv_12.f(erl_2.aq)) {
                try {
                    String string = String.format(azs_0.a().a("companionIconsPath"), bmv_12.gO());
                    this.a(string);
                }
                catch (gm_0 gm_02) {
                    a.error((Object)"PropertyException during handleCharacterIconDisplay", (Throwable)gm_02);
                }
            }
        } else if (epq_22 != null && bmr_12.dE().d() && !bmr_12.dE().a().d(bmr_12.R()).isEmpty()) {
            try {
                String string = String.format(azs_0.a().a("breedPortraitIllustrationPath"), epq_22.gO() + String.valueOf(epq_22.gX()));
                this.a(string);
            }
            catch (gm_0 gm_03) {
                a.error((Object)"PropertyException during handleCharacterIconDisplay", (Throwable)gm_03);
            }
        } else {
            fzd_0.a().d();
        }
    }

    private void a(String string) {
        fzd_0.a().a(string, null, 42, -10, frs_0.e);
    }

    @Nullable
    private epq_2 b(int n, int n2) {
        bmr_1 bmr_12 = azu_0.j().k();
        ArrayList<afv> arrayList = ans_0.D().c().b(n, n2);
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        for (afv afv2 : arrayList) {
            if (!(afv2 instanceof biI)) continue;
            biI biI2 = (biI)afv2;
            blx_1 blx_12 = biI2.bI();
            this.f.a(blx_12);
            if (euv_2.a.a(bmr_12.R(), blx_12)) {
                return blx_12;
            }
            if (!blx_12.bp()) continue;
            return blx_12;
        }
        return null;
    }

    private aff_1 a(bmr_1 bmr_12, tg_0 tg_02, ArrayList<DisplayedScreenElement> arrayList) {
        aff_1 aff_12 = new aff_1();
        byte by = bmr_12.Y();
        for (int k = 0; k < arrayList.size(); ++k) {
            DisplayedScreenElement displayedScreenElement = arrayList.get(k);
            aff_12.g(displayedScreenElement.d().g());
            byte by2 = tg_02.j(aff_12.d(), aff_12.e());
            if (by != by2 || tg_02.i(aff_12.d(), aff_12.e()) != aff_12.f()) continue;
            return aff_12;
        }
        return null;
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
            fis_1.a().a("isInFightPlacement", true);
            cxu_0.a().a(true);
            fpm_0.b().a("wakfu.fightAction", cGV.class);
            this.e = null;
            this.d();
            if (azu_0.j().c(cYL.a())) {
                azu_0.j().b(cYL.a());
            }
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fis_1.a().a("isInFightPlacement", false);
            cxu_0.a().a(false);
            this.b("worldAndFightBarDialog");
            fpm_0.b().e("wakfu.fightCreationOrPlacement");
            this.d.a();
            this.e = null;
            this.f.c();
            fzd_0.a().d();
        }
    }

    private void b(String string) {
        fvE fvE2;
        fyy_0 fyy_02 = fpm_0.b().h().d(string);
        if (fyy_02 != null && (fvE2 = (fvE)fyy_02.a("apsContainer")) != null) {
            fvE2.setVisible(false);
        }
    }

    private static void a(bvx_2 bvx_22) {
        for (blx_1 blx_12 : bvx_22.j()) {
            if (!blx_12.bp()) continue;
            blx_12.bv().bR();
        }
    }

    private static void b(bvx_2 bvx_22) {
        for (blx_1 blx_12 : bvx_22.j()) {
            if (!blx_12.bp()) continue;
            blx_12.bv().bS();
        }
    }
}

