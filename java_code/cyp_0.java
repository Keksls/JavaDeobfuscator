/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import com.ankamagames.wakfu.client.console.command.commonIn.TurnCharacterCommand;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cYP
 */
public class cyp_0
extends cuy_0
implements ahr_1 {
    private static final cyp_0 d = new cyp_0();
    private static final Logger e = Logger.getLogger(cyp_0.class);
    private static final String f = "targetCell";
    private static final float[] g = new float[]{0.9f, 0.9f, 0.9f, 0.5f};
    private fzm_0 h;
    private bvx_2 i;
    private final aff_1 j = new aff_1();
    private int k;
    private int l;
    private bxd_1 m = new bxd_1();
    private DisplayedScreenElement n;
    private final apo_0 o = new apo_0();
    private boolean p;
    private boolean q;

    public void a(bgn_2 bgn_22) {
        if (this.a != null && this.a.b() != null && this.a.b().equals(bgn_22)) {
            dbm_0.a().a(this.a);
        }
    }

    public static cyp_0 g() {
        return d;
    }

    public aff_1 h() {
        return this.j;
    }

    protected aff_1 a(int n, int n2) {
        return this.a(n, n2, !cyp_0.d(), false, this.i);
    }

    @Override
    public boolean a(adt_1 adt_12) {
        ace_0 ace_02 = ans_0.D().c();
        switch (adt_12.a()) {
            case 19751: {
                dhL dhL2 = (dhL)adt_12;
                if (this.m.a()) {
                    return this.a(dhL2);
                }
                if (this.r()) {
                    this.c(dhL2);
                    return false;
                }
                this.k = dhL2.r();
                this.l = dhL2.s();
                aff_1 aff_12 = this.a(this.k, this.l, !cyp_0.d(), false, this.i);
                if (!this.q) {
                    this.a(aff_12);
                }
                assert (this.i != null) : "UIFightFrame uniquement pour les gens en combat. m_fight ne peut \u00eatre null";
                assert (this.i.g() != null) : "UIFightFrame : fight sans fightMap";
                if (aff_12 != null && this.i != null && this.i.d(aff_12) == null) {
                    this.a(ace_02, aff_12, this.i);
                }
                return false;
            }
            case 18724: {
                cyp_0.a(null);
                if (this.i != null && this.i.i() != null) {
                    Iterator<sr_0> iterator = this.i.i().f().iterator();
                    boolean bl = false;
                    boolean bl2 = false;
                    block24: while (iterator.hasNext()) {
                        ele_0 ele_02;
                        sr_0 sr_02 = iterator.next();
                        if (!sr_02.c(this.j.d(), this.j.e(), this.j.f()) || (ele_02 = ele_0.a(sr_02.w())) == null) continue;
                        switch (ele_02) {
                            case c: {
                                cyp_0.a((bgo_2)sr_02);
                                bl = true;
                                continue block24;
                            }
                            case d: {
                                boolean bl3 = this.i.a((bhf_2)sr_02);
                                if (bl3) continue block24;
                                cyp_0.a((bhf_2)sr_02);
                                bl2 = true;
                                continue block24;
                            }
                            case j: {
                                cyp_0.a((ekk_0)sr_02);
                                bl2 = true;
                                continue block24;
                            }
                            case n: {
                                bgx_2 bgx_22 = (bgx_2)sr_02;
                                switch (bgx_22.au()) {
                                    case 4: {
                                        if (!sr_02.P_().a((Object)this.j)) continue block24;
                                        cyp_0.a((ekk_0)sr_02);
                                        bl2 = true;
                                        continue block24;
                                    }
                                }
                                continue block24;
                            }
                        }
                    }
                    if (!bl) {
                        cyp_0.a(null);
                    }
                    if (!bl2) {
                        cyp_0.a(null);
                    }
                }
                return false;
            }
            case 16054: {
                dhc_0 dhc_02 = (dhc_0)adt_12;
                cYZ cYZ2 = cYZ.o();
                boolean bl = azu_0.j().c(cYZ2);
                if (bl) {
                    return false;
                }
                bpl_0 bpl_02 = cYZ2.p();
                bpl_0 bpl_03 = dhc_02.k();
                if (bpl_03 == null || !dhc_02.o() && bpl_02.w() != bpl_03.w()) {
                    cYZ2.a((bpl_0)null);
                    cYZ2.m();
                    return false;
                }
                cYZ2.a(bpl_03);
                cYZ2.a(cZa.a().d());
                cYZ2.e();
                cYZ2.l();
                return false;
            }
            case 16119: {
                Object object;
                Object object2;
                Object object3;
                ArrayList<abz_0> arrayList;
                dhL dhL3 = (dhL)adt_12;
                if (this.m.a()) {
                    if (dhL3.o()) {
                        DisplayedScreenElement displayedScreenElement;
                        arrayList = azu_0.j().k();
                        if (((epq_2)((Object)arrayList)).a(erl_2.ah)) {
                            return false;
                        }
                        ArrayList<DisplayedScreenElement> arrayList2 = ace_02.a((float)dhL3.r(), (float)dhL3.s(), 0.0f, acj.a);
                        DisplayedScreenElement displayedScreenElement2 = displayedScreenElement = arrayList2 != null && !arrayList2.isEmpty() ? arrayList2.get(0) : null;
                        if (displayedScreenElement == null) {
                            return false;
                        }
                        object3 = displayedScreenElement.d();
                        object2 = new aff_1(((ScreenElement)object3).d(), ((ScreenElement)object3).e(), ((ScreenElement)object3).c());
                        if (this.m.c() == bxe_1.b) {
                            object = new cmp_0();
                            ((cmp_0)object).a((aff_1)object2);
                            azu_0.j().K().c(object);
                        } else if (this.m.c() == bxe_1.c) {
                            object = cyp_0.b((aff_1)object2);
                            dan.a().a((cSS[])object);
                        } else if (this.m.c() == bxe_1.d && ((Optional)(object = this.i.b((aff_1)object2))).isPresent()) {
                            cmy_0 cmy_02 = new cmy_0();
                            cmy_02.a((aff_1)object2);
                            cmy_02.a((end_1)((Object)((Optional)object).get()));
                            azu_0.j().K().c(cmy_02);
                        }
                    }
                    if (aii_0.a().d(f) != null) {
                        try {
                            this.c(true);
                        }
                        catch (Exception exception) {
                            e.error((Object)"Exception during onMessage for WORLD_SCENE_MOUSE_RELEASED", (Throwable)exception);
                        }
                    }
                    this.m.d();
                }
                if (this.r()) {
                    this.d(dhL3);
                    return false;
                }
                arrayList = ((aNF)ace_02).e(this.k, this.l);
                if (!arrayList.isEmpty() && dhL3.o()) {
                    int n = arrayList.size();
                    for (int k = 0; k < n; ++k) {
                        object3 = (abz_0)arrayList.get(k);
                        if (!(object3 instanceof biI) || (object = ((biI)(object2 = (biI)object3)).bI()) == null || ((blx_1)object).bA() != this.i.c()) continue;
                        ddy_0.a().d().a((blx_1)object);
                        if (bvu_0.c() != bvu_0.b) break;
                        apw_0.a().a(((epq_2)object).a_());
                        break;
                    }
                    return false;
                }
                if (!arrayList.isEmpty() && dhL3.q()) {
                    cyp_0.a((List<abz_0>)arrayList, this.i.c());
                }
                return false;
            }
            case 17591: {
                this.t();
                return false;
            }
            case 17551: {
                this.a(bxe_1.b);
                return false;
            }
            case 19861: {
                this.a(bxe_1.c);
                return false;
            }
            case 19764: {
                cyp_0.f();
                return false;
            }
            case 16302: {
                return this.s();
            }
            case 16992: {
                cyp_0.a(this.i);
                return false;
            }
            case 16468: {
                cyp_0.b(this.i);
                return false;
            }
        }
        return true;
    }

    public void a(end_1 end_12, aff_1 aff_12) {
        if (aff_12 == null) {
            e.warn((Object)"Trying to add a fight marker but the coordinates are missing");
            return;
        }
        cmx_0 cmx_02 = new cmx_0();
        cmx_02.a(aff_12);
        cmx_02.a(end_12);
        azu_0.j().K().c(cmx_02);
    }

    @NotNull
    private static cSS[] b(aff_1 aff_12) {
        return (cSS[])Arrays.stream(bxf_1.values()).map(bxf_12 -> {
            cTB cTB2 = new cTB();
            cTB2.a((bxf_1)((Object)bxf_12));
            cTB2.a(aff_12);
            return cTB2;
        }).toArray(cSS[]::new);
    }

    private boolean s() {
        if (this.i != null && !this.i.af_().m()) {
            return true;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.a(erl_2.aj)) {
            return true;
        }
        this.h = fpm_0.b().a(bae.h().a("question.giveUpFight", new Object[0]), cfn_0.a(0), 2073L, 102, 1);
        this.h.a(new cYQ(this));
        return false;
    }

    private boolean a(dhL dhL2) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.bz() == null) {
            e.warn((Object)"Ciblage de case hors combat. On d\u00e9senclenche le mode ciblage de case");
            this.v();
            return false;
        }
        this.b(dhL2);
        return false;
    }

    private DisplayedScreenElement b(dhL dhL2) {
        ace_0 ace_02 = ans_0.D().c();
        ArrayList<DisplayedScreenElement> arrayList = ace_02.a((float)dhL2.r(), (float)dhL2.s(), 0.0f, acj.a);
        DisplayedScreenElement displayedScreenElement = arrayList.isEmpty() ? null : (arrayList.size() == 1 ? arrayList.get(0) : this.a(arrayList));
        if (displayedScreenElement != this.n) {
            if (displayedScreenElement != null) {
                this.c(true);
                aii_0.a().a(displayedScreenElement.j(), f);
                aii_0.a().d(f).a(g);
            }
            this.n = displayedScreenElement;
        }
        return displayedScreenElement;
    }

    @Nullable
    private DisplayedScreenElement a(ArrayList<DisplayedScreenElement> arrayList) {
        for (DisplayedScreenElement displayedScreenElement : arrayList) {
            if (!this.i.g().c(displayedScreenElement.G(), displayedScreenElement.H())) continue;
            return displayedScreenElement;
        }
        return null;
    }

    private void t() {
        this.m.b();
        this.u();
    }

    private void a(bxe_1 bxe_12) {
        boolean bl;
        boolean bl2 = bl = this.m.c() != bxe_12;
        if (!bl) {
            return;
        }
        this.m.a(bxe_12);
        this.u();
    }

    private void u() {
        if (this.m.a()) {
            cYT.a().i();
            cyp_0.w();
            if (this.r()) {
                this.z();
            }
        } else {
            this.c(false);
        }
    }

    private void v() {
        this.c(false);
        cYT.a().i();
        this.m.d();
    }

    public boolean i() {
        return !this.j() && !this.r();
    }

    public boolean j() {
        return this.m.a();
    }

    private static void w() {
        cYZ cYZ2 = cYZ.o();
        boolean bl = azu_0.j().c(cYZ2);
        if (!bl) {
            return;
        }
        cYZ2.a((bpl_0)null);
        cYZ2.m();
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
            boolean bl2;
            afz_0.d().a((abz_0)null);
            bNT.f().a((abz_0)null);
            ahs.d().a((abz_0)null);
            dbm_0.a().i();
            if (aii_0.a().d(f) == null) {
                try {
                    aii_0.a().b(f);
                }
                catch (Exception exception) {
                    e.error((Object)"Exception during onFrameAdd", (Throwable)exception);
                }
            }
            this.m.d();
            aZG.e().a("fight", true);
            aZG.e().a("world", false);
            blq_0.c().a(false);
            fis_1.a().a("isInFight", true);
            fis_1.a().a("isInFightPlayerTurn", false);
            cbf_2.a("is_in_fight", true);
            fis_1.a().a("controlCenterDisplayMode", 0);
            fpm_0.b().a("wakfu.fightAction", cGV.class);
            fpm_0.b().a("wakfu.controlCenterFight", cgr_0.class);
            fpm_0.b().a("wakfu.fightCreationOrPlacement", cGW.class);
            bmr_1 bmr_12 = azu_0.j().k();
            if (bmr_12 == null) {
                return;
            }
            bOw bOw2 = azu_0.j().m();
            bOw2.x();
            bvx_0 bvx_02 = (bvx_0)ans_0.D().h();
            if (bvx_02.a(bWe.S) && bOw2.b() == fid.a) {
                bOw2.b(fid.b);
            }
            if (bvx_02.a(bWe.aK)) {
                bOw2.a((byte)fid.b.e(), true);
            }
            this.i = bmr_12.bz();
            boolean bl3 = bl2 = this.i.e() == elp_0.b;
            if (!bl2 || !this.i.af_().k()) {
                cyp_0.b("worldAndFightBarDialog");
            }
            fis_1.a().a("isInFightPlacement", bl2 && this.i.af_().k());
            cxu_0.a().c(false);
            boolean bl4 = this.i.af_().m();
            fis_1.a().a("canGiveUpFight", (Object)bl4, true);
            boolean bl5 = this.i.af_().y();
            fis_1.a().a("fight.velocity.enable", (Object)bl5, true);
            fis_1.a().a("cellReportDisabled", bmr_12.a(erl_2.ah));
            fis_1.a().a("lockFightDisabled", bmr_12.a(erl_2.ag));
            fis_1.a().a("callHelpDisabled", bmr_12.a(erl_2.af));
            fis_1.a().a("hideFightersDisabled", bmr_12.a(erl_2.ai));
            fis_1.a().a("giveUpDisabled", bmr_12.a(erl_2.aj));
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            aNF aNF2 = (aNF)ans_0.D().c();
            aNF2.m(false);
            aNF2.n(false);
            this.b = null;
            this.m();
            this.q = false;
            cZa.a().a((dih_0)null);
            this.e();
            aii_0.a().c(f);
            cyp_0.a(null);
            cyp_0.a(null);
            fis_1.a().a("isInFight", false);
            fis_1.a().a("isInFightPlacement", false);
            cbf_2.a("is_in_fight", false);
            aZG.e().a("fight", false);
            aZG.e().a("world", true);
            bmr_1 bmr_12 = azu_0.j().k();
            blq_0.c().a(true);
            fpm_0.b().e("wakfu.fightAction");
            fpm_0.b().e("wakfu.controlCenterFight");
            cxu_0.a().c(true);
            azu_0.j().a((blx_1)azu_0.j().k());
            this.i = null;
        }
    }

    public static void a(ekk_0 ekk_02) {
        cyp_0.a(ekk_02, null);
    }

    public static void a(ekk_0 ekk_02, aff_1 aff_12) {
        if (ekk_02 != null && !azu_0.j().c(cYZ.o())) {
            Su su = ekk_02.v();
            if (su instanceof blx_1) {
                if (aff_12 == null) {
                    apg_0.a().a(ekk_02, (blx_1)su);
                } else {
                    apg_0.a().a(ekk_02, (blx_1)su, aff_12);
                }
                return;
            }
            e.error(su == null ? "Owner du pi\u00e8ge est null" : "ClassCastException attendu=CharacterInfo : " + su.getClass());
        }
        apg_0.a().c();
    }

    public static void a(bgo_2 bgo_22) {
        if (bgo_22 != null) {
            apc_0.a().a(bgo_22, (blx_1)bgo_22.v());
        } else {
            apc_0.a().d();
            apc_0.a().c();
        }
    }

    public void k() {
        this.a("worldAndFightBarDialog");
    }

    private void a(String string) {
        bmr_1 bmr_12 = azu_0.j().k();
        bvx_2 bvx_22 = bmr_12.bz();
        if (bvx_22 == null) {
            return;
        }
        bxo_2 bxo_22 = bvx_22.A();
        if (bxo_22 == null) {
            return;
        }
        fyy_0 fyy_02 = fpm_0.b().h().d(string);
        if (fyy_02 == null) {
            return;
        }
        fvE fvE2 = null;
        switch (bvx_22.e()) {
            case b: {
                fvE2 = (fvE)fyy_02.a("readyForFightButton");
                break;
            }
            case c: {
                if (bxo_22.H() != bmr_12) break;
                fvE2 = (fvE)fyy_02.a("endTurnButton");
                break;
            }
            default: {
                fvE2 = null;
            }
        }
        if (fvE2 == null || !fvE2.getVisible()) {
            return;
        }
        azf_2 azf_22 = new azf_2(0.531f, 0.812f, 0.835f, 1.0f);
        azf_2 azf_23 = new azf_2(azf_2.e.i());
        fvE2.getAppearance().addTween(new fjp_2(azf_23, azf_22, fvE2.getAppearance(), 0, 500, 12, fjw_2.b));
        fvE fvE3 = (fvE)fyy_02.a("apsContainer");
        fvE3.setVisible(true);
    }

    public boolean l() {
        if (this.i == null) {
            return false;
        }
        this.o.c();
        blx_1 blx_12 = (blx_1)this.i.d(this.j);
        return blx_12 != null && this.o.a(blx_12);
    }

    public void m() {
        this.o.c();
    }

    public void a(aff_1 aff_12) {
        if (azu_0.j().k().bz() == null) {
            e.warn((Object)"message recu par UIFightFrame hors combat");
            return;
        }
        if (this.i == null) {
            return;
        }
        if (this.i.e() != elp_0.c) {
            return;
        }
        if (aff_12 != null && !aff_12.equals(this.j)) {
            this.j.g(aff_12);
            dfc dfc2 = new dfc();
            dfc2.a_(18724);
            add_2.b().a(dfc2);
        }
    }

    public bvx_2 n() {
        return this.i;
    }

    public void b(boolean bl) {
        this.q = bl;
    }

    public void b(blx_1 blx_12, boolean bl) {
        this.i.A().a(blx_12, bl);
    }

    private static void b(String string) {
        fvE fvE2;
        fyy_0 fyy_02 = fpm_0.b().h().d(string);
        if (fyy_02 != null && (fvE2 = (fvE)fyy_02.a("apsContainer")) != null) {
            fvE2.setVisible(false);
        }
    }

    public int o() {
        return this.k;
    }

    public int p() {
        return this.l;
    }

    private Optional<blx_1> x() {
        if (this.i == null) {
            return Optional.empty();
        }
        if (this.i.A() == null) {
            return Optional.empty();
        }
        blx_1 blx_12 = this.i.A().H();
        if (blx_12 == null) {
            return Optional.empty();
        }
        if (!blx_12.bp()) {
            return Optional.empty();
        }
        return Optional.of(blx_12);
    }

    public void q() {
        if (this.r()) {
            this.z();
        } else {
            this.y();
        }
    }

    public boolean r() {
        return this.p;
    }

    private void c(dhL dhL2) {
        Optional<blx_1> optional = this.x();
        if (optional.isEmpty()) {
            this.z();
            return;
        }
        blx_1 blx_12 = optional.get();
        DisplayedScreenElement displayedScreenElement = this.b(dhL2);
        aff_1 aff_12 = new aff_1(displayedScreenElement.G(), displayedScreenElement.H(), displayedScreenElement.I());
        aej_2 aej_22 = aej_2.a(blx_12.P_(), aff_12);
        switch (aej_22) {
            case f: {
                fyt_0.a().a(frb_0.w, true);
                break;
            }
            case h: {
                fyt_0.a().a(frb_0.x, true);
                break;
            }
            case d: {
                fyt_0.a().a(frb_0.y, true);
                break;
            }
            case b: {
                fyt_0.a().a(frb_0.z, true);
            }
        }
    }

    private void d(dhL dhL2) {
        Optional<blx_1> optional = this.x();
        if (optional.isEmpty()) {
            this.z();
            return;
        }
        if (!dhL2.o()) {
            this.z();
            return;
        }
        blx_1 blx_12 = optional.get();
        DisplayedScreenElement displayedScreenElement = this.b(dhL2);
        aff_1 aff_12 = new aff_1(displayedScreenElement.G(), displayedScreenElement.H(), displayedScreenElement.I());
        aej_2 aej_22 = aej_2.a(blx_12.P_(), aff_12);
        if (TurnCharacterCommand.c()) {
            cgr_0.fightSetDirection(this.i, aej_22);
            TurnCharacterCommand.b();
            this.z();
        }
    }

    private void y() {
        cYT.a().i();
        cyp_0.w();
        if (this.m.a()) {
            this.v();
        }
        this.p = true;
    }

    private void z() {
        this.c(true);
        fyt_0.a().c();
        this.p = false;
    }

    private void c(boolean bl) {
        if (!bl && (this.j() || this.r())) {
            return;
        }
        aii_0.a().e(f);
    }
}

