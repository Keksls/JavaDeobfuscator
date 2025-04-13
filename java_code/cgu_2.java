/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ApiCallback$Callback
 *  com.ankama.haapi.client.okhttp.ApiCallback$Request
 *  com.ankama.haapi.client.okhttp.ankama.api.CmsPollInGameApi
 *  com.ankama.haapi.client.okhttp.ankama.api.CmsPollInGameApi$getCallback
 *  com.ankama.haapi.client.okhttp.ankama.api.CmsPollInGameApi$getRequest
 *  com.google.protobuf.InvalidProtocolBufferException
 *  gnu.trove.iterator.TIntObjectIterator
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.log4j.Level
 *  org.apache.log4j.Logger
 */
import com.ankama.haapi.client.okhttp.ApiCallback;
import com.ankama.haapi.client.okhttp.ankama.api.CmsPollInGameApi;
import com.ankamagames.wakfu.client.WakfuClient;
import com.ankamagames.wakfu.client.chat.console.command.AwayCommand;
import com.google.protobuf.InvalidProtocolBufferException;
import gnu.trove.iterator.TIntObjectIterator;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/*
 * Renamed from cgu
 */
public class cgu_2
implements ahr_1 {
    static final Logger b = Logger.getLogger(cgu_2.class);
    private static final cgu_2 c = new cgu_2();
    private static final int d = 59;
    private static final int e = 977;
    public static final String a = "WAKFU";
    private long f;
    private long g;
    private boolean h;
    private ahr_1[] i;
    private ahr_1[] j;
    private ArrayList<ahr_1> k;
    private cga_2 l;

    public static cgu_2 a() {
        return c;
    }

    public long c() {
        return this.f;
    }

    public long d() {
        return this.g;
    }

    public static void a(blx_1 blx_12, long l, bmr_1 bmr_12) {
        biI biI2 = bmr_12.bv();
        biI2.c(true);
        biI2.E();
        biI2.c(ccm_1.g());
        bmr_12.a(blx_12.P_());
        ((afv)biI2).a(ccm_1.g());
        biI2.cn();
        bmr_12.a(blx_12.F());
        ((afv)biI2).a(cbw_1.a);
        biI2.r(true);
        biI2.g(bmr_12);
        bmr_12.k(l);
        biI2.cj();
        afz_0.d().a(biI2);
        ace_0 ace_02 = ans_0.D().c();
        ace_02.a((ahh_0)biI2);
        ace_02.j();
    }

    public static void a(bmr_1 bmr_12) {
        cgu_2.c(bmr_12);
        bmr_12.n(true);
        bmr_12.y();
        bmr_12.z();
        bmr_12.B();
    }

    private static void c(bmr_1 bmr_12) {
        Object object;
        Object object2;
        Optional<exk_2> optional = bmr_12.dC().b(bmr_12.cG().a(exh_2.w));
        if (optional.isPresent() && optional.get().aQ_()) {
            object2 = (ffa_0)optional.get().f();
            object = bol_1.a(bmr_12.R(), bmr_12.a_(), ft_1.b);
            int n = ((ffa_0)object2).a().b();
            int n2 = bol_1.a((ffa_0)object2, (fk_2)object) ? ((fk_2)object).g() : ((fk_2)object).c();
            bmr_12.a(n, ((fk_2)object).d() ? ((fk_2)object).e() : 0, n2, ((ffa_0)object2).m(), ((ffa_0)object2).f());
        }
        if (((Optional)(object2 = bmr_12.dC().b(bmr_12.cG().a(exh_2.y)))).isPresent() && ((exk_2)((Optional)object2).get()).aQ_()) {
            fga fga2;
            object = ((exk_2)((Optional)object2).get()).f();
            fk_2 fk_22 = bol_1.a(bmr_12.R(), bmr_12.a_(), ft_1.a);
            fga fga3 = fk_22.c() == 0 ? (fga)object.a() : ((fga2 = (fga)fgh.a.b(fk_22.c())) == null ? (fga)object.a() : fga2);
            bmr_12.b(object.a().b(), fk_22.d() ? fk_22.e() : fga3.n(), fk_22.c(), object.m(), object.f());
        }
    }

    private static void a(azu_0 azu_02) {
        biI biI2;
        bmr_1 bmr_12 = azu_02.k();
        long l = bmr_12.T_();
        cgu_2.i();
        bua_0.a.a(new bum_2(l));
        long l2 = YX.a();
        b.info((Object)("on quitte le monde " + l2));
        aND.f().a(l2);
        bmr_12.ep();
        bmr_12.eq();
        biI biI3 = biI2 = bmr_12 == null ? null : bmr_12.bv();
        if (biI2 != null) {
            afz_0.d().c(biI2);
            biI2.bH();
        }
        ccm_1.g().c();
        dct_0.a().c();
        ans_0.D().N();
    }

    private static void d(bmr_1 bmr_12) {
        if (bmr_12.be()) {
            if (fpm_0.b().q("furnitureListDialog")) {
                fpm_0.b().o("furnitureListDialog");
            }
            if (fpm_0.b().q("havenWorldResourcesCollectorDialog")) {
                fpm_0.b().o("havenWorldResourcesCollectorDialog");
            }
        }
        czu_0 czu_02 = bgp_1.c();
        if (azu_0.j().c(czu_02)) {
            azu_0.j().b(czu_02);
        }
    }

    private static void i() {
        bmr_1 bmr_12 = azu_0.j().k();
        long l = bmr_12.U_();
        TIntObjectIterator<bwh_0> tIntObjectIterator = bwj_1.a().b();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            bwh_0 bwh_02 = (bwh_0)tIntObjectIterator.value();
            List<blx_1> list = bwh_02.j().stream().filter(Objects::nonNull).filter(blx_12 -> blx_12.U_() != l).collect(Collectors.toList());
            list.forEach(blx_12 -> bmf_2.a().e((blx_1)blx_12));
        }
    }

    private static void a(ahr_1 ... ahr_1Array) {
        azu_0 azu_02 = azu_0.j();
        for (ahr_1 ahr_12 : ahr_1Array) {
            if (azu_02.c(ahr_12)) continue;
            azu_02.a(ahr_12);
        }
    }

    public static void b(bmr_1 bmr_12) {
        azr_0.a().c(bmr_12.dp());
        bvx_0 bvx_02 = (bvx_0)ans_0.D().h();
        bua_0.a.b();
        bvp_0 bvp_02 = (bvp_0)bvx_02.b(bmr_12.a_());
        if (bvp_02 == null) {
            bvp_0 bvp_03 = new bvp_0(bmr_12);
            bvx_02.a(bvp_03);
            try {
                bvp_03.i();
            }
            catch (IOException iOException) {
                b.warn((Object)"Error occurred on load of AccountPreferenceStore", (Throwable)iOException);
            }
        } else {
            bvp_0 bvp_04 = (bvp_0)bvx_02.f();
            bvx_02.a(bvp_04.o(), bvp_04);
            bvx_02.a(bvp_02);
        }
        buc_0.a();
        bmr_12.cd().a();
        bhy_2.a.a();
        if (!azr_0.a().i((byte)3, "displayAllCharacteristics")) {
            azr_0.a().a((byte)3, "displayAllCharacteristics", false);
        }
    }

    private static void j() {
        Qy qy = new Qy();
        azu_0.j().K().c(qy);
    }

    private void e(bmr_1 bmr_12) {
        if (eoe_0.j.contains(bmr_12.T_())) {
            return;
        }
        CmsPollInGameApi.getRequest getRequest2 = CmsPollInGameApi.getRequest().site(a).lang(bae.h().f().h()).page(Long.valueOf(1L)).count(Long.valueOf(10L));
        CmsPollInGameApi.getCallback getCallback2 = CmsPollInGameApi.getCallback().on200(apiResponse -> dcb_0.a((List)apiResponse.getData())).onDefault(apiResponse -> b.error((Object)("Error when consulting Polls " + (String)apiResponse.getData()))).onException(throwable -> b.error((Object)"Error when consulting Polls ", throwable));
        WakfuClient.c().sendAsync((ApiCallback.Request)getRequest2, (ApiCallback.Callback)getCallback2);
    }

    private void k() {
        bhw_2.a.f();
        bim_2 bim_22 = (bim_2)fis_1.a().d("displayedAchievement", "questDialog");
        if (bim_22 != null) {
            bim_22.s();
        }
    }

    private void l() {
        this.i = new ahr_1[]{dab_0.a(), ddB.a(), dei.a(), dan.a(), daa_0.a(), dcj_0.a(), cWF.a(), cww_0.c(), dbm_0.a(), czi_0.a(), dbo_0.a, dcd_0.a(), ddb_0.a(), ddg_0.d(), cyn_0.d(), cVh.e(), ddp.a(), dbp.a(), dbU.a(), cZk.a(), cxu_0.a()};
        this.k = new ArrayList<ahr_1>(Arrays.asList(this.i));
    }

    private void m() {
        this.j = new ahr_1[]{cef_0.a(), cgq_2.b, cee_0.b, cfe_1.b, cfp_2.b, cgl_1.b, cgt_1.b, cfd_2.b, cfu_1.a(), cha_2.a(), cfo_1.a(), cfv_1.a(), cfl_1.a(), cgh_2.b, cft_1.a(), cfm_1.a(), bde.a, cfh_1.b, cgf_1.a, cfj_2.a, cff_1.a, cfg_1.a, cjp_2.b, cfv_2.b, cgo_2.b, ceM.b, cjv_2.a, ckd_0.a, cgc_2.a, cgl_2.a, bPQ.a};
    }

    public void e() {
        this.m();
        cgu_2.a(this.j);
    }

    public void f() {
        this.l();
        cgu_2.a(this.i);
    }

    public void g() {
        this.l();
        azu_0 azu_02 = azu_0.j();
        for (ahr_1 ahr_12 : this.i) {
            if (azu_02.c(ahr_12)) {
                azu_02.b(ahr_12);
                continue;
            }
            this.k.remove(ahr_12);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean a(adt_1 adt_12) {
        azu_0 azu_02 = azu_0.j();
        ans_0 ans_02 = ans_0.D();
        switch (adt_12.a()) {
            case 12273: {
                crd crd2 = (crd)adt_12;
                byte[] byArray = crd2.c();
                bHK.a().b();
                for (int k = 0; k < crd2.e().length; ++k) {
                    bHK.a().a(crd2.e()[k]);
                }
                cdw_0.n().f(false);
                fis_1.a().a("isAlive", true);
                bmr_1 bmr_12 = new bmr_1(false);
                bmr_12.aO();
                bmr_12.a(ezl_1.a(crd2.b()));
                bmr_12.a(ezl_2.b(crd2.d()));
                bmr_12.b(byArray);
                cdw_0.n().f(true);
                bvt_2.a().a(bvs_2.a());
                cgu_2.b(bmr_12);
                azu_02.a(bmr_12);
                euw_2.a.a(bmr_12.R(), bmr_12);
                fis_1.a().a("heroesPartyIsFull", false);
                bmp_1.a().a((blx_1)bmr_12);
                int n2 = bmr_12.a_(eps_0.b).b();
                bmr_12.cw();
                Object object = fbc_0.a.a();
                while (object.hasNext()) {
                    object.advance();
                    ((faX)object.value()).a(new bUz((faX)object.value()));
                    ((faX)object.value()).a(buw_0.a);
                }
                eam_0.a.a(bmr_12.a_());
                adw_1.a.b(bqy_0.c);
                bmr_12.o(n2);
                cdw_0.n().p();
                brd_0.k.e();
                bti.a.a();
                fje_0.a.a(cbl_2.a);
                cJz.a = true;
                this.f = adi_2.a().a(new cgv_2(this, bmr_12), 300000L, 159159160, -1L);
                this.g = adi_2.a().a(new cgw_2(this, azu_02), 4000L, 159159161);
                fis_1.a().a("isInDimensionalBag", false);
                fis_1.a().a("isInOwnDimensionalBag", false);
                fis_1.a().a("hasOccupation", false);
                fis_1.a().a("inventory.occupation.allows.interaction", true);
                object = (bvx_0)ans_02.h();
                try {
                    if (((agk_0)object).a(bWe.b)) {
                        aUxx.a().q();
                        ((agk_0)object).a((agp_0)bWe.b, false);
                    }
                    bdk_1.b();
                }
                catch (Exception exception) {
                    b.error((Object)("Erreur \u00e0 l'initialisation du chat, impossible de le charger : " + exception.getMessage()));
                }
                bmr_12.aP();
                euv_2.a.a(bmr_12.R(), bmr_12.a_());
                fis_1.a().a("heroesParty", List.of(bmr_12));
                euw_2.a.a(bmr_12.R(), bmr_12.a_());
                boolean bl = euu_2.a();
                fis_1.a().a("heroesEnabled", bl);
                fis_1.a().a("hideDownscaling", eag_0.a(bmr_12.U_()));
                brm brm2 = new brm(bmr_12);
                ArrayList<brm> arrayList = new ArrayList<brm>();
                arrayList.add(0, brm2);
                fis_1.a().a("mainCharacterViewForTemplate", arrayList);
                if (bl || euu_2.b()) {
                    cxq_0.a.f();
                }
                bPJ.a(bmr_12.dz(), bmr_12.aZ(), bmr_12.cg());
                if (azu_02.c(cfp_1.a())) {
                    azu_02.b(cfp_1.a());
                }
                fis_1.a().a("exchange.itemTrade", (Object)null);
                emS emS2 = emS.a(azu_0.j().n().v());
                if ((emS2 == emS.e || emS2 == emS.c || emS2 == emS.b) && enp_2.a.d(ens_2.bm)) {
                    aUh.b("moderationPanel.invisibleNotif", new Object[0]);
                }
                this.e(bmr_12);
                azu_0.j().K().c(new cqy(azu_0.j().k().a_()));
                azu_0.j().K().c(new cot_0());
                return false;
            }
            case 12431: {
                bvx_2 bvx_22;
                bmr_1 bmr_13 = azu_0.j().k();
                if (bmr_13 == null) {
                    // empty if block
                }
                if ((bvx_22 = bmr_13.dm()) != null) {
                    baa_0.a().b(bvx_22.c());
                    bxj_2 bxj_22 = new bxj_2();
                    bxj_22.a();
                }
                cgu_2.d(bmr_13);
                cgu_2.a(azu_02);
                return false;
            }
            case 12985: {
                Object object;
                boolean bl;
                void dateFormat;
                Object string8;
                crb crb2 = (crb)adt_12;
                long l = YX.a();
                fpm_0.b().q();
                ans_0.D().M();
                ccm_1.g().c();
                if (azu_0.j().c(das_0.a())) {
                    azu_0.j().b(das_0.a());
                }
                if (azu_02.c(cfp_1.a())) {
                    azu_02.b(cfp_1.a());
                }
                YX.b();
                bmm_2 bmm_22 = new bmm_2();
                ((epq_2)bmm_22).cr().a(((epq_2)bmm_22).cr().d(), crb2.b());
                ((epq_2)bmm_22).cr().a(((epq_2)bmm_22).cr().c(), crb2.b());
                ((epq_2)bmm_22).cr().a(((epq_2)bmm_22).cr().g(), crb2.b());
                long l2 = bmm_22.T_();
                eet_0 eet_02 = eeu_0.a(crb2.e());
                cdn_1.a.a(l2, eet_02);
                fis_1.a().a("currentInstanceMaxLevel", eet_02.a());
                euw_2.a.b(azu_02.n().u(), epq_22 -> {
                    ccm_1.g().b((aha_0)((Object)epq_22));
                    return true;
                });
                azr_0.a().a(l2);
                cct_1 cct_12 = ccs_1.a().a(l2);
                boolean bl3 = cci_2.a.g();
                if (bl3) {
                    cci_2.a.a();
                } else {
                    YX.a(l2, YV.a());
                }
                fis_1.a().a("isInHavenWorld", bl3);
                fis_1.a().a("isInOwnHavenWorld", bgp_1.a(l2));
                cco_2.a().a(l2);
                aff_1 aff_12 = bmm_22.P_();
                bwa_2.X.a(-1);
                bMs.a.b();
                ArrayList<byte[]> arrayList = crb2.c();
                for (byte[] byArray : arrayList) {
                    string8 = (bMn)bMy.a.a(ByteBuffer.wrap(byArray));
                    bMs.a.a((bMn)string8);
                }
                ArrayList<fem_0> arrayList2 = crb2.d();
                int bl2 = arrayList2.size() - 1;
                while (dateFormat >= 0) {
                    string8 = (fem_0)arrayList2.get((int)dateFormat);
                    if (((fem_0)string8).b() != null) {
                        if (((fem_0)string8).b().E().a(((fem_0)string8).a())) {
                            feo_0.a(((fem_0)string8).a(), ((fem_0)string8).d());
                            feo_0.a(((fem_0)string8).a(), ((fem_0)string8).g());
                        } else {
                            feo_0.a((fem_0)string8);
                        }
                    }
                    --dateFormat;
                }
                bme_0.a.a(l2);
                if (l != l2) {
                    blo_1.e().a(eod_0.d);
                    blo_1.e().i();
                }
                ael_0.a.a();
                wc_0.p().b(ael_0.a);
                wc_0.p().b(aol_0.d());
                aol_0.d().a(false);
                boolean bl4 = cct_12.j;
                if (bl4) {
                    ael_0.a.a(wc_0.p());
                    wc_0.p().a(ael_0.a);
                    wc_0.p().a(aol_0.d());
                    aol_0.d().a(true);
                }
                wc_0.p().a(cdq_0.a);
                fis_1.a().a("wakfuEcosystemEnabled", false);
                fis_1.a().a("isInExterior", bl4);
                fis_1.a().a("isInWakfuStasisInstance", cct_12.n);
                fis_1.a().a("player.displayStates", true);
                fis_1.a().a("osamodasSymbiotCreatureCapturedState", false);
                fis_1.a().a("havenWorld", (Object)null);
                fis_1.a().a("basicHavenWorld", (Object)null);
                fis_1.a().a("exchange.itemTrade", (Object)null);
                fis_1.a().a("equipment.can.transfer.bag", false);
                fis_1.a().a("isInDungeon", cgu_2.a(cct_12));
                fis_1.a().a("isInBattleground", cct_12.a());
                long l3 = enp_2.a.c(ens_2.v);
                fis_1.a().a("max.character.level", (Object)String.valueOf(l3));
                fis_1.a().a("spellsRestatManager", (Object)null);
                fis_1.a().a("stasisDungeonInfoView", cgu_2.a(cct_12) ? btg.a : null);
                try {
                    bl = azs_0.a().h("activateStuffPreview");
                }
                catch (gm_0 gm_02) {
                    bl = false;
                }
                fis_1.a().a("stuffPreviewActivated", bl);
                this.f();
                this.e();
                aZG.e().a(true);
                ace_0 ace_02 = ans_02.c();
                ace_02.b().b(false);
                if (bl4) {
                    aed.a.a(ael_0.a);
                    aed.a.a(aof_0.a);
                }
                bmr_1 bmr_12 = azu_0.j().k();
                biI biI2 = bmr_12.bv();
                biI2.al();
                bup_0.a().b();
                blq_0.c().b();
                cco_2.a().c();
                cdr_1.a.a();
                cdw_0.n().H();
                aiI.a(biI2);
                YX.a(ace_02, aff_12.d(), aff_12.e(), aff_12.f());
                ccm_1.g().a(bmm_22.G(), bmm_22.H(), true);
                cco_2.a().a(ccm_1.g().j(), ccm_1.g().k());
                bRA.e().a(cct_12);
                bVv.b.a();
                bmr_12.aO();
                if (bmf_2.a().c(bmr_12.a_()) == null) {
                    bmf_2.a().a(bmr_12);
                }
                cgu_2.a(bmm_22, l2, bmr_12);
                ble_1.E().b();
                afg.a().a(l2);
                this.k();
                cdw_0.n().I();
                int n2 = bmr_12.a_(eps_0.b).b();
                bmr_12.b(bmr_12.ge());
                bmr_12.a_(eps_0.b).b(n2);
                if (l2 == 9L) {
                    object = bmr_12.di();
                    acs_0.b().a((act)object);
                    acs_0.b().a((acF)object);
                    ((bsx_2)object).e();
                    bsj_1.c().a((bsx_2)object);
                }
                bsj_1.c().a(biI2);
                ace_02.a(true);
                object = new cgx_2(this, ace_02, bmr_12, l2, cct_12, ans_02, biI2, aff_12);
                if (auy_2.a().b()) {
                    auy_2.a().a((auxx_2)object);
                } else {
                    object.c();
                    object.b();
                    object.d();
                }
                ace_02.j(true);
                cgu_2.a(bmr_12);
                btn_0.a().a(true);
                fpm_0.b().a("wakfu.windowStick", cKg.class);
                bua_0.a.a(new bub_0(l, l2));
                cnp_0 cnp_02 = new cnp_0();
                cnp_02.a(bae.h().f().i());
                azu_0.j().K().c(cnp_02);
                bmr_12.aP();
                AwayCommand.b();
                dbA.h();
                if (this.h) {
                    this.h = false;
                    cgu_2.j();
                }
                bdk_1.a().c();
                bjo_1.a().c();
                boolean bl5 = emp_0.a(bmr_12.N_().a(), emS.c);
                fis_1.a().a("isInAdministratorGroup", bl5);
                ceu_2.a().a(bl5);
                if (cZI.A()) {
                    cZI.a().g();
                }
                return false;
            }
            case 12783: {
                String string2 = bae.h().a("player.unstuck", new Object[0]);
                cgu_2.a(string2);
                return false;
            }
            case 12046: {
                cvs_2 cvs_22 = (cvs_2)adt_12;
                bmr_1 bmr_15 = azu_02.k();
                bsx_2 bsx_22 = bmr_15.di();
                if (bsx_22 == null) {
                    return false;
                }
                bso_1 bso_12 = bsx_22.v();
                bso_12.a(cvs_22.b());
                bso_12.d(cvs_22.c());
                if (bmr_15.dj() == bsx_22) {
                    dal.a().d();
                }
                bsx_22.D();
                return false;
            }
            case 12097: {
                cwu_1 cwu_12 = (cwu_1)adt_12;
                b.debug((Object)("PERSONAL_SPACE_ENTER_RESULT_MESSAGE (success=" + cwu_12.b() + ")"));
                bmr_1 bmr_16 = azu_02.k();
                if (cwu_12.b()) {
                    bsx_2 bsx_23;
                    if (cwu_12.e()) {
                        cgu_2.f(bmr_16);
                        bsx_23 = bmr_16.dj();
                        bsx_23.a(cwu_12.g());
                        bsx_23.b(cwu_12.f());
                        bsx_23.b(cwu_12.d());
                    } else {
                        bsx_23 = new bsx_2();
                        bsx_23.b(cwu_12.c());
                    }
                    bsx_23.D();
                    bst_2.a.a(bmr_16.T_());
                    fis_1.a().a("isInOwnDimensionalBag", cwu_12.e());
                    fis_1.a().a("isInDimensionalBag", true);
                    bmr_16.a(bsx_23);
                    azu_02.a(cfk_2.a());
                    azu_02.b(dcq_0.a());
                    if (cwu_12.e()) {
                        btn_0.a().a(btr_0.a, null);
                    }
                } else {
                    bmr_16.bv().e("AnimStatique");
                    if (cwu_12.e()) {
                        ccm_1.g().b(0L);
                    }
                    azu_02.k().m(false);
                }
                return false;
            }
            case 13664: {
                b.debug((Object)"PERSONAL_SPACE_LEAVE_RESULT_MESSAGE");
                bmr_1 bmr_17 = azu_02.k();
                bsx_2 bsx_24 = bmr_17.di();
                bsx_24.z();
                acs_0.b().b(bsx_24);
                acs_0.b().b(bsx_24);
                azu_02.b(cXQ.d());
                azu_02.b(cxm_0.a());
                azu_02.b(dao.d());
                azu_02.b(cWw.e());
                azu_02.b(cXO.a());
                azu_02.b(cXL.a());
                azu_02.b(cXC.a());
                if (fpm_0.b().q("exchangeDialog")) {
                    azu_02.b(cyc_0.d());
                }
                if (azu_02.c(cye_0.a())) {
                    azu_02.b(cye_0.a());
                }
                dan.a().d();
                if (fpm_0.b().q("dimensionalBagFleaHistoryDialog")) {
                    fpm_0.b().o("dimensionalBagFleaHistoryDialog");
                }
                if (fpm_0.b().q("furnitureListDialog")) {
                    fpm_0.b().o("furnitureListDialog");
                }
                bsj_1.c().d();
                fis_1.a().a("isInDimensionalBag", false);
                fis_1.a().a("isInOwnDimensionalBag", false);
                azu_02.b(cfk_2.a());
                return false;
            }
            case 13912: {
                cyw_2 cyw_22 = (cyw_2)adt_12;
                int n4 = cyw_22.c();
                ejh_0 ejh_02 = (ejh_0)efc_0.a().b(n4);
                if (ejh_02 != null) {
                    sd_0 sd_02 = ejh_02.x();
                    sd_02.a(azu_0.j().k().ax());
                    sd_02.b(cyw_22.d());
                    blx_1 blx_12 = bzf_1.a(cyw_22.b());
                    blx_12.bv().b((ejh_0)sd_02, false);
                    blx_12.dR().a(sd_02);
                }
                return false;
            }
            case 13001: {
                cyx_2 cyx_22 = (cyx_2)adt_12;
                long l = cyx_22.b();
                long l4 = cyx_22.c();
                blx_1 blx_13 = bzf_1.a(l);
                if (blx_13 != null) {
                    sd_0 sd_03 = blx_13.dR().g_(l4);
                    if (sd_03 != null) {
                        blx_13.b(sd_03);
                    } else {
                        b.error((Object)("R\u00e9ception d'un RunningEffectWorldUnapplicationMessage pour un runningEffect d'uid=" + l4 + " que le characterInfo=[" + blx_13 + "] ne poss\u00e9de pas"));
                    }
                } else {
                    b.error((Object)("R\u00e9ception d'un RunningEffectWorldUnapplicationMessage pour un characterinfo inconnu d'id=" + l));
                }
                return false;
            }
            case 12957: {
                cyv_2 cyv_22 = (cyv_2)adt_12;
                byte by = cyv_22.c().a();
                si_0 si_02 = (si_0)efc_0.a().b(cyv_22.f());
                if (si_02 == null) {
                    b.error((Object)("Impossible d'instancier un runningEffect :" + cyv_22.f() + " inconnu"));
                    return false;
                }
                ejh_0 ejh_03 = (ejh_0)si_02.a(bgg_0.k(), bgh_0.a());
                ejh_03.b(cyv_22.h());
                if (cyv_22.g() != null) {
                    for (abp_2<Integer, Integer, Long> abp_22 : cyv_22.g()) {
                        blx_1 blx_14 = bzf_1.a(abp_22.c());
                        bck_0 bck_02 = new bck_0(cyv_22.d(), by, abp_22.a(), ejh_03, cyv_22.j());
                        bck_02.d(abp_22.b());
                        bck_02.a(new alb_1(bck_02.i()));
                        if (blx_14 == null || !blx_14.ak()) {
                            bce_0.a().a(bck_02);
                            continue;
                        }
                        baa_0.a().a(blx_14.bA(), (aku_1)bck_02);
                    }
                } else {
                    bck_0 bck_03 = new bck_0(cyv_22.d(), by, cyv_22.b(), ejh_03, cyv_22.j());
                    bck_03.d(cyv_22.e());
                    bce_0.a().a(bck_03);
                    bck_03.a(new alb_1(bck_03.i()));
                }
                bce_0.a().b();
                return false;
            }
            case 13034: {
                bce_0.a().b();
                return false;
            }
            case 13531: {
                cwg_2 cwg_22 = (cwg_2)adt_12;
                String string3 = bae.h().a("offlineFlea.transactionSummary", cwg_22.c(), cwg_22.b());
                cgu_2.a(string3);
                return false;
            }
            case 13532: {
                cwb_2 cwb_22 = (cwb_2)adt_12;
                Object r2 = eyo_1.g().d(cwb_22.b());
                String string4 = ((ezr_0)r2).e();
                String string5 = bae.h().a("onlineFlea.transaction", cwb_22.c(), string4, cwb_22.d());
                cgu_2.a(string5);
                return false;
            }
            case 22274: {
                cbc_0 cbc_02 = (cbc_0)adt_12;
                long l = cbc_02.b();
                short s2 = (short)(l / 31536000000L);
                short s3 = (short)((l -= (long)s2 * 31536000000L) / 2678400000L);
                short s4 = (short)((l -= (long)s3 * 2678400000L) / 86400000L);
                short s5 = (short)((l -= (long)s4 * 86400000L) / 3600000L);
                short s6 = (short)((l -= (long)s5 * 3600000L) / 60000L);
                short s7 = (short)((l -= (long)s6 * 60000L) / 1000L);
                bae bae2 = bae.h();
                aUh.b("dateFormat.yearMonthDayHourMinuteSecond.playedTime", s2, s3, s4, s5, s6, s7);
                return false;
            }
            case 22283: {
                String string6;
                cbu_0 cbu_02 = (cbu_0)adt_12;
                switch (cbu_02.c()) {
                    case 0: {
                        string6 = cbu_02.b();
                        break;
                    }
                    case 1: {
                        string6 = bae.h().a("error.chat.userNotFound", "");
                        break;
                    }
                    default: {
                        return false;
                    }
                }
                cgu_2.a(string6);
                b.info((Object)("Whois : " + string6));
                return false;
            }
            case 12553: {
                bbQ[] bbQArray;
                ctc_1 ctc_12 = (ctc_1)adt_12;
                if (azu_0.j().c(cgz_1.a()) && ctc_12.d()) {
                    return true;
                }
                bbe_0 bbe_02 = bbe_0.a(ctc_12);
                bce_0.a().a(bbe_02);
                for (bbQ bbQ2 : bbQArray = bbQ.a(ctc_12)) {
                    bce_0.a().a(bbQ2);
                }
                bce_0.a().b();
                return false;
            }
            case 12959: {
                crp_0 crp_02 = (crp_0)adt_12;
                wt_0 wt_02 = crp_02.b();
                int n5 = wt_02.j();
                int n6 = wt_02.m();
                String string7 = String.valueOf(wt_02.o());
                boolean bl = crp_02.c();
                float f2 = crp_02.d();
                StringBuilder stringBuilder = new StringBuilder();
                Locale locale = bae.h().f().a();
                DateFormat dateFormat = DateFormat.getTimeInstance(3, locale);
                dateFormat.setTimeZone(wt_0.a);
                String string2 = dateFormat.format(wt_02.i());
                if (f2 < 10.0f) {
                    stringBuilder.append(bae.h().a(bl ? "calendar.day.starting" : "calendar.night.starting", new Object[0]));
                } else if (f2 > 90.0f) {
                    stringBuilder.append(bae.h().a(bl ? "calendar.day.ending" : "calendar.night.ending", new Object[0]));
                } else {
                    stringBuilder.append(bae.h().a(bl ? "calendar.day.during" : "calendar.night.during", new Object[0]));
                }
                stringBuilder.append(", ");
                stringBuilder.append(bae.h().a("calendar.timeNotice", n5, bae.h().a("calendar.month." + n6, new Object[0]), 977, n5 < 10 ? "0" + n5 : Integer.valueOf(n5), n6 < 10 ? "0" + n6 : Integer.valueOf(n6), StringUtils.substring((String)string7, (int)2, (int)string7.length()), string2));
                cgu_2.a(stringBuilder.toString());
                return false;
            }
            case 12824: {
                crk_0 crk_02 = (crk_0)adt_12;
                byte by = crk_02.b();
                short s8 = crk_02.c();
                List<Short> list = crk_02.d();
                String string9 = crk_02.e();
                int n7 = list.stream().mapToInt(Short::intValue).sum();
                String string10 = list.stream().map(Object::toString).collect(Collectors.joining(" + "));
                aUh.b("chat.random.result", string9, by, s8, n7, string10);
                return false;
            }
            case 12208: {
                cse_0 cse_02 = (cse_0)adt_12;
                fgv_0 fgv_02 = fgT.a.a(cse_02.b());
                if (fgv_02 == null) {
                    b.warn((Object)"On re\u00e9oit un update de chaos de territoire pour un territoire non charg\u00e9.");
                    return false;
                }
                if (cse_02.c()) {
                    ((fgR)fgv_02.g()).a();
                } else {
                    ((fgR)fgv_02.g()).b();
                }
                return false;
            }
            case 13381: {
                csb csb2 = (csb)adt_12;
                Object object = "";
                Object object3 = csb2.b().iterator();
                while (object3.hasNext()) {
                    object3.advance();
                    short s9 = object3.key();
                    object = (String)object + bae.h().a(103, (long)s9, new Object[0]);
                    object = (String)object + bae.h().a("colon", new Object[0]) + object3.value();
                    if (object3.hasNext()) {
                        object = (String)object + ", ";
                        continue;
                    }
                    object = (String)object + ".";
                }
                object3 = new dhc(bae.h().a("notification.IEDestroyedTitle", new Object[0]), bae.h().a("notification.IEDestroyedText", object), blr_1.h);
                add_2.b().a((adt_1)object3);
                return false;
            }
            case 15686: {
                bmr_1 bmr_18;
                cwp_2 cwp_22 = (cwp_2)adt_12;
                long l = cwp_22.b();
                byte[] byArray = cwp_22.c();
                bmr_1 bmr_19 = azu_0.j().k();
                bmr_1 bmr_13 = bmr_18 = bmr_19 != null && l == bmr_19.a_() ? bmr_19 : (bmr_1)euw_2.a.c(azu_0.j().n().u(), l);
                if (bmr_18 == null) {
                    eam_0.a.a(l, new cgy_2(this, l, byArray));
                } else {
                    int n8 = bmr_18.bM();
                    bmr_18.b(byArray);
                    int n9 = bmr_18.bM();
                    if (n9 != n8) {
                        bua_0.a.a(new buq_1(n8, n9));
                    }
                }
                return false;
            }
            case 13560: {
                cwm_1 cwm_12 = (cwm_1)adt_12;
                long l = cwm_12.b();
                blx_1 blx_15 = bmf_2.a().c(l);
                String string11 = blx_15.dp();
                String string12 = bae.h().a(cwm_12.c(), new Object[0]);
                aUm aUm2 = new aUm(string11, l, string12);
                aUm2.a(aup_0.b);
                aul_0.a().a(aUm2);
                return false;
            }
            case 13653: {
                fjC fjC2;
                crq_0 crq_02 = (crq_0)adt_12;
                fjv fjv2 = crq_02.b();
                long l = crq_02.c();
                long l5 = crq_02.d();
                switch (fjv2) {
                    case d: {
                        fjx fjx2 = fjs.a.a(l5);
                        fjC2 = fjx2.f();
                        break;
                    }
                    case c: {
                        fjy fjy2 = (fjy)fjs.a.a(fjv2, l);
                        fjz fjz2 = fjy2.a((int)l5);
                        fjC2 = fjz2.h();
                        break;
                    }
                    case a: {
                        fjE fjE2 = (fjE)fjs.a.a(fjv2, l);
                        fjC2 = fjE2.i();
                        break;
                    }
                    case b: {
                        fjA fjA2 = (fjA)fjs.a.a(fjv2, l);
                        fjC2 = fjA2.d();
                        break;
                    }
                    default: {
                        b.error((Object)("Impossible de r\u00e9cup\u00e9rer le LOADING correspondant au travel " + fjv2));
                        return false;
                    }
                }
                cgu_2.a(fjC2);
                return false;
            }
            case 12702: {
                cro_0 cro_02 = (cro_0)adt_12;
                int n10 = cro_02.b();
                int n11 = cro_02.c();
                evs_1 evs_12 = (evs_1)evl_1.a.a(evg_1.j, n10);
                evt_1 evt_12 = evs_12.a(n11);
                fjC fjC3 = evt_12.q();
                cgu_2.a(fjC3);
                return false;
            }
            case 12951: {
                cvv_1 cvv_12 = (cvv_1)adt_12;
                ((bmr_1)euw_2.a.d(cvv_12.c())).dM().a(cvv_12.b());
                return false;
            }
            case 13511: {
                cxu_2 cxu_22 = (cxu_2)adt_12;
                short s10 = cxu_22.b();
                if (s10 != 127) {
                    cuo_0.e().a(true).a(bae.h().a("recustom.enterTheDressingRoom", new Object[0]), 0);
                } else {
                    cuo_0.e().a(true).a(bae.h().a("charactersLoading.progress", new Object[0]), 0);
                }
                return false;
            }
            case 22799: {
                cxt_2 cxt_22 = (cxt_2)adt_12;
                bmr_1 bmr_111 = azu_0.j().k();
                bnh_1 bnh_12 = bmr_111.fj();
                ans_0.D().x();
                azu_0.j().a(cgs_2.a());
                azu_0.j().a(ddp.a());
                azu_0.j().a(cfb_0.a());
                ceZ.a().b(cxt_22.b());
                ceZ.a().a(cxt_22.c());
                ceZ.a().a(cfa_1.b);
                ceZ.a().a(cxt_22.d());
                ceZ.a().a(cxt_22.e());
                ceZ.a().a(bnh_12);
                ceZ.a().a(false);
                azu_0.j().a(ceZ.a());
                return false;
            }
            case 13075: {
                cbs_0 cbs_02 = (cbs_0)adt_12;
                boolean bl = cbs_02.d();
                boolean bl5 = cbs_02.e();
                String string13 = bl5 ? bae.h().a(cbs_02.b(), new Object[0]) : cbs_02.b();
                fzm_0 fzm_02 = fpm_0.b().a(string13, "ModerationPopup", cfn_0.a(1), 17411L, 102, 2);
                fzm_02.a((int n, String string) -> {
                    if (!bl) {
                        return;
                    }
                    dfc dfc2 = new dfc();
                    dfc2.a_(17113);
                    dfc2.a(cbs_02.c());
                    add_2.b().a(dfc2);
                });
                aul_0.a().b(string13);
                return false;
            }
            case 12644: {
                crg_0 crg_02 = (crg_0)adt_12;
                long l = crg_02.b();
                boolean bl = crg_02.c();
                blx_1 blx_16 = bmf_2.a().c(l);
                blx_16.a_(bl);
                return false;
            }
            case 13062: {
                csa csa2 = (csa)adt_12;
                long l = csa2.b();
                byte by = csa2.c();
                ezn_1 ezn_12 = new ezn_1();
                ezn_12.a(l, by);
                return false;
            }
            case 13958: {
                BG bG;
                cya_2 cya_22 = (cya_2)adt_12;
                byte[] byArray = cya_22.b();
                try {
                    bG = BG.a(byArray);
                }
                catch (InvalidProtocolBufferException invalidProtocolBufferException) {
                    b.error((Object)"Error parsing rewards info", (Throwable)invalidProtocolBufferException);
                    return false;
                }
                azu_0.j().n().a(bG);
                if (azu_0.j().c(dct.a())) {
                    return false;
                }
                if (bG.b().isEmpty()) {
                    return false;
                }
                if (bG.b().stream().mapToInt(bl_02 -> bl_02.i() + bl_02.n()).sum() <= 0) {
                    return false;
                }
                aUh.b("pending.rewards.notification", new Object[0]);
                blt_0.b(bae.h().a("pending.rewards.notification", new Object[0])).a(true).a(() -> {
                    if (!azu_0.j().c(dct.a())) {
                        azu_0.j().a(dct.a());
                    }
                }).c("pending.rewards.button").d(9).b();
                return false;
            }
            case 13124: {
                csc csc2 = (csc)adt_12;
                long l = csc2.c();
                boolean bl = csc2.b();
                long l6 = azu_0.j().k().T_();
                if (l6 != l) {
                    return false;
                }
                aNL.a.a();
                aNL.a.b(bl ? 42 : -1);
                return false;
            }
            case 12197: {
                cys_1 cys_12 = (cys_1)adt_12;
                boolean bl = cys_12.b();
                boolean bl6 = cys_12.c();
                azu_0.j().n().a(bl);
                StringBuilder stringBuilder = new StringBuilder();
                if (bl) {
                    stringBuilder.append(bae.h().a("security.account.locked", new Object[0]));
                } else if (bl6) {
                    stringBuilder.append(bae.h().a("security.account.locked.offline", new Object[0]));
                } else {
                    stringBuilder.append(bae.h().a("security.account.unlocked", new Object[0]));
                }
                cgu_2.a(stringBuilder.toString());
                cbx_2.a(stringBuilder.toString());
                return false;
            }
            case 13781: {
                cbx_2.a();
                return false;
            }
            case 13372: {
                cbx_2.b();
                return false;
            }
            case 12501: {
                cbx_2.c();
                return false;
            }
            case 12851: {
                cgu_2.a(bae.h().a("security.returned.loot.text", new Object[0]));
                cbx_2.d();
                return false;
            }
            case 12283: {
                cef_0.a().a(((cqy_0)adt_12).b());
                return false;
            }
            case 13947: {
                ctp_1 ctp_12 = (ctp_1)adt_12;
                long l = ctp_12.b();
                blx_1 blx_17 = bmf_2.a().c(l);
                if (blx_17 == null) {
                    return false;
                }
                String string14 = bae.h().a("fight.join.request", blx_17.dp());
                blt_0.a(string14).d(5).a(true).a(() -> azu_0.j().K().c(new cmm_0(l, true))).b(true).b(() -> azu_0.j().K().c(new cmm_0(l, false))).c(() -> azu_0.j().K().c(new cmm_0(l, false))).b();
                return false;
            }
        }
        return true;
    }

    private static boolean a(cct_1 cct_12) {
        if (!cct_12.c()) {
            return false;
        }
        return ezd_2.a.a(cct_12.a).isPresent();
    }

    private static void a(String string) {
        aul_0.a().c(string);
    }

    private static void a(fjC fjC2) {
        aeM aeM2 = aeM.a();
        aeM2.a(fjC2.a());
        aeM2.c(fjC2.b());
        aeM2.a(fjC2.c());
        aeM2.b(fjC2.d());
    }

    public static void a(acG[] acGArray, cct_1 cct_12) {
        int n = cct_12 == null ? 0 : cct_12.h();
        ace_0 ace_02 = ans_0.D().c();
        ace_02.t();
        if (n == 0) {
            return;
        }
        if (n > acGArray.length) {
            b.warn((Object)"trop de parallax");
        }
        for (int k = 0; k < n; ++k) {
            oo_0 oo_02 = cct_12.c(k);
            acGArray[k].a(oo_02);
            ace_02.a(acGArray[k]);
        }
    }

    private static void f(bmr_1 bmr_12) {
        bcf_1 bcf_12 = (bcf_1)bfv_0.b().d(59L);
        if (bcf_12 == null) {
            b.error((Object)"[ItemAction] Impossible de spawn visuellement le havre-sac");
            return;
        }
        if (bmr_12.di() != null) {
            return;
        }
        bcf_12.b(0L);
        bcf_12.a(bmr_12.bv().ap());
        bcf_12.c(bmr_12.T_());
        bcf_12.c((short)1);
        bcf_12.a((short)2);
        bcf_12.f(true);
        bcf_12.j(false);
        bcf_12.aI_();
        for (ph_0 ph_02 : bcf_12.av_()) {
            if (!(ph_02 instanceof ahv)) continue;
            ahv ahv2 = (ahv)ph_02;
            ahs.d().a(ahv2);
            ahv2.g(ahi_0.f.a());
            aiI.a(ahv2);
        }
        ccm_1.g().a(bcf_12);
    }

    @Override
    public long a_() {
        return 1L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        azu_0.j().a(cfl_2.a());
        azu_0.j().a(cgm_2.a());
        azu_0.j().a(cfs_1.b);
        azu_0.j().a(deh_0.a());
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        fis_1.a().a("player.displayStates");
        fis_1.a().a("isInExterior");
        fis_1.a().a("isInWakfuStasisInstance");
        azu_0.j().b(cfl_2.a());
        azu_0.j().b(cgm_2.a());
        azu_0.j().b(deh_0.a());
    }

    public void a(boolean bl) {
        this.h = bl;
    }

    public void a(cga_2 cga_22) {
        this.l = cga_22;
    }

    public void a(ahr_1 ahr_12) {
        if (this.k == null) {
            return;
        }
        if (!this.k.contains(ahr_12)) {
            this.k.add(ahr_12);
        }
        if (this.l != null && this.k.size() == this.i.length) {
            this.l.b();
        }
    }

    public void b(ahr_1 ahr_12) {
        if (this.k == null) {
            return;
        }
        this.k.remove(ahr_12);
        if (this.l != null && this.k.isEmpty()) {
            this.l.a();
        }
    }

    public void h() {
        this.l = null;
        this.k = null;
    }

    static {
        b.setLevel(Level.TRACE);
    }
}

