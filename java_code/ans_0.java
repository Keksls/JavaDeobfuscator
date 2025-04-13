/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 *  com.jogamp.opengl.GLAutoDrawable
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.wakfu.client.WakfuClient;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.awt.GraphicsDevice;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aNs
 */
public class ans_0
extends YK<bvx_0> {
    static final Logger i = Logger.getLogger(ans_0.class);
    private static final ans_0 j = new ans_0();
    private static final int k = 11;
    private static final int l = 80;
    private static final long m = 1000L;
    private static final long n = 4000L;
    private static final Pattern o = Pattern.compile(":");
    private final ann_0 p = new ann_0();
    private final ArrayList<acE> q = new ArrayList();
    private boolean r = false;
    private boolean s = false;
    private boolean t = false;

    private ans_0() {
    }

    @Override
    public ajh_0 a() {
        return this.p;
    }

    public static ans_0 D() {
        return j;
    }

    public static Logger E() {
        return i;
    }

    public static azu_0 F() {
        return azu_0.j();
    }

    @Override
    protected void f() {
        ajg_1.a().a(fis_1.a());
    }

    protected bvx_0 G() {
        return new bvx_0();
    }

    @Override
    public void j() {
        super.j();
        ajg_1.a().a("uiScale", bvw_0.a());
        ((bvx_0)this.h()).h().a(true);
        bWe bWe2 = bWe.B;
        azu_2.c = ((bvx_0)this.h()).a(bWe2);
    }

    @Override
    @Nullable
    protected String t() {
        try {
            return azs_0.a().a("gfxPath");
        }
        catch (gm_0 gm_02) {
            i.error((Object)"", (Throwable)gm_02);
            return null;
        }
    }

    protected boolean H() {
        if (cdw_0.n().g()) {
            cdw_0.n().start();
            return true;
        }
        i.error((Object)"Probl\u00e8me d'initialisation du SoundManager.");
        return false;
    }

    @Override
    public void k() {
        super.k();
        Gy.a().a(ccp_0.class).a();
        bvx_0 bvx_02 = (bvx_0)this.h();
        String string = azs_0.z("gfxConfigFile");
        ath_2 ath_22 = abl_1.b().a(string);
        auc_1.a().a(ath_22);
        cdw_0.n();
        aij_0.a(new aPj());
        wn_0.a.a(wc_0.p());
        this.Q();
        this.R();
        aiy_0 aiy_02 = aiy_0.a(bvx_02.f(agq_0.b));
        boolean bl = bvx_02.a(bWe.D);
        this.a(aiy_02, bl);
        adq_1.a(add_2.b(), (GLAutoDrawable)this.p.f());
        this.p.j();
        this.a(this.e(), new ant_0(this));
        aws_2.a(new aPk());
        axd_2.a("wci", 4, 11);
        ZI.a.a(aob_0.c(), this.g);
        this.c(((bvx_0)j.h()).a(bWe.ai));
        emj.a();
        eAQ.a().b();
    }

    private void Q() {
        aNu aNu2 = new aNu(this);
        wc_0.p().a(aNu2);
    }

    private void R() {
        String string = "Current almanach entry (%s) is missing (Possible cause are : Almanach keys has been used before calendar start, or Almanax API isn't available)";
        String string2 = "Current almanach entry is missing because almanach keys has been used before calendar start";
        Cr.a(() -> {
            if (!wc_0.p().l()) {
                throw new IllegalStateException("Current almanach entry is missing because almanach keys has been used before calendar start");
            }
            if (!bkg_1.a.c()) {
                throw new IllegalStateException(String.format("Current almanach entry (%s) is missing (Possible cause are : Almanach keys has been used before calendar start, or Almanax API isn't available)", wc_0.p().a()));
            }
            return bkg_1.a.a().map(bkf_0::b).orElse("Unknown");
        });
        Cr.b(() -> {
            if (!wc_0.p().l()) {
                throw new IllegalStateException("Current almanach entry is missing because almanach keys has been used before calendar start");
            }
            if (!bkg_1.a.c()) {
                throw new IllegalStateException(String.format("Current almanach entry (%s) is missing (Possible cause are : Almanach keys has been used before calendar start, or Almanax API isn't available)", wc_0.p().a()));
            }
            return bkg_1.a.a().map(bkf_0::a).orElse("Unknown");
        });
        Cr.c(() -> {
            if (!wc_0.p().l()) {
                throw new IllegalStateException("Current almanach entry is missing because almanach keys has been used before calendar start");
            }
            return bkg_1.a.b().map(bkg_1.a::a).orElse("Unknown");
        });
    }

    public void I() {
        adw_1.a.a(bqy_0.c);
        bae.h();
        azs_0 azs_02 = azs_0.a();
        aia_2.a.a(azs_02.y(".cache"));
        aia_2.a.a();
        fpm_0.b().z = azs_0.a().a("ANMGUIPath");
        fpm_0.b().A = azs_0.a().a("particlePath");
        fpm_0.b().B = azs_0.a().a("shadersPath");
        ahy.a = bli_1.a;
        fvT.setParticlePath(azs_0.a().a("worldPositionMarkerApsPath"));
        this.a(() -> {
            try {
                this.S();
                this.T();
            }
            catch (Exception exception) {
                i.fatal((Object)"Error when loading game managers", (Throwable)exception);
                JOptionPane.showMessageDialog(null, exception, "Error", 0);
                System.exit(0);
            }
        });
    }

    private void S() {
        boolean bl;
        URL uRL = azs_0.a().p();
        azs_0 azs_02 = azs_0.a();
        String string = azs_02.y("news");
        atc_1.a.a(uRL, string);
        new bgi().a((Oy)bae.h(), anl_2.a);
        asw_2.a().a(azs_0.a().a("binaryDataFile"));
        String string2 = azs_02.a("shadersPath");
        ans_0.b(string2);
        bvx_0 bvx_02 = (bvx_0)this.h();
        asa_1.i().a(azs_0.a().a("contentStaticDataStorageDirectory"));
        asa_1.i().e();
        aed.a.a();
        this.e().d(bvx_02.a(bWe.D));
        cbt_1.a.b(bvx_02.a(bWe.q));
        abu.n(bvx_02.a(bWe.E));
        ace_0 ace_02 = j.c();
        ccs_1.c();
        ccs_1.a().a(azs_0.z("worldInfoFile"));
        String string3 = azs_0.z("mapsGfxCoord");
        YX.a(azs_0.z("mapsTplgCoord"), string3);
        aev.a().a(azs_0.z("mapsLightPath"));
        yz_0.a();
        yz_0.b();
        yz_0.a(azs_0.z("mapsTopologyPath"));
        aew_0 aew_02 = aew_0.a();
        aew_02.a(azs_0.z("mapsEnvironmentPath"));
        String string4 = azs_0.z("mapsGfxPath");
        acs_0.b().a(string4);
        aPh.a(azs_0.a().a("patchMiniImagePath"), azs_0.a().a("buildingMiniImagePath"));
        this.M();
        this.c(bvx_02.d(agq_0.c));
        this.d(2);
        int n = this.f.length;
        for (int k = 0; k < n; ++k) {
            this.f[k].n().a(string4);
        }
        aew_02.a(aoc_0::new);
        String string5 = azs_02.a("ANMDynamicElementPath");
        ahp.a(new aNw(string5));
        aew_02.a(azs_0.a().h("activateMapParticles") ? aik_0.a() : null);
        aew_02.a(cdw_0.n());
        afg.a().a(azs_02.a("mapsAmbienceDataPath"));
        aes_0.a().a(azs_02.a("ambienceBankFile"));
        cbt_1.a.a();
        cbt_1.a.b();
        bMy.a.a(new bMr());
        faX.a(new anv_0());
        fjq_0.a(new bra_1(), new bqy_1(), new bqv_0(), new bqz_0());
        bwy_2.h().a();
        fgV.a.a(bwo_2.a);
        ans_0.W();
        this.a(azs_02, bvx_02, ace_02);
        this.V();
        String string6 = azs_0.z("dayLightFile");
        String string7 = azs_0.z("defaultDayLightFile");
        i.info((Object)"Loading embedded DayLight file.");
        try {
            try {
                ael_0.a.a(string6);
            }
            catch (Exception exception) {
                i.error((Object)"Le dayLight file n'est pas trouvable, on utilise celui par d\u00e9faut");
                ael_0.a.a(string7);
            }
        }
        catch (Exception exception) {
            i.error((Object)"Exception : ", (Throwable)exception);
            throw new Exception("Impossible de charger les d\u00e9finitions de couleur de Jour/Nuit embarqu\u00e9s depuis le fichier " + string6 + " !");
        }
        this.U();
        exk_2.S().a(bHK.a(), new bhv_1(), bjm_2.a());
        bkt_1.a().b();
        erA.a(new bgh());
        abd_1.a(0);
        fih_0.a().a(new bfj_1());
        asz_2<aqw_0> asz_22 = new asz_2<aqw_0>(new aqw_0());
        elg_0.a(new bhe_2(asz_22));
        eyo_1.a(new bhb_0());
        erd_2.a(new bOI());
        erg_2.a(new bok_0());
        eqz_1.a(new bOG());
        erf_2.a(new bOJ());
        eLu.a(bvy_1.a());
        afz_0.d().a(bld_2.a);
        afz_0.d().a(bld_2.a);
        bNT.f().a(bld_2.a);
        bNT.f().a(bld_2.a);
        ahs.d().a(bld_2.a, bld_2.a.c());
        ahs.d().a(bld_2.a, bld_2.a.c());
        euw_2.a.a(bzh_1.a);
        ena_0.a().a(bdg_1.a);
        ena_0.a().a(bnt_0.a);
        ena_0.a().a(brq_2.a);
        ena_0.a().a(btt_1.a);
        ena_0.a().a(bhi_1.a);
        ena_0.a().a(bgf.a);
        eZe.a.a(bjf_1.a);
        sd_0.a(new ejj_0());
        atf_2.a().a(azs_0.z("ANMIndexFile"), azs_0.z("ANMPreloadFilePattern"));
        boolean bl2 = bl = !atc_1.a.a(1000L);
        if (bl) {
            i.info((Object)"News pas chargees dans le temps imparti. On continue.");
        }
        bqz_1.a.a();
        atc_1.a.a(4000L);
        atc_1.a.b();
        cbf_2.a(this.e().c());
    }

    private void T() {
        boolean bl = azs_0.a().a("onStartupClientBenchmark", true);
        boolean bl2 = azs_0.a().a("onStartupClientHardwareTest", true);
        this.a(bl2, bl);
    }

    private void U() {
        akl_1.a.a(ccn_0.b());
        aks_1.a().a(azs_0.a().a("useLuaCache", true));
        aks_1.a().d(azs_0.a().a("scriptPath"));
        this.s = aks_1.a().b();
        cbf_2.a("has_anim_scripts", this.s);
        ajI.e().a(this.g);
        ajJ.d().a(this.g);
    }

    private void V() {
        aZG aZG2 = aZG.e();
        String string = aZG.g();
        String string2 = azs_0.z("defaultShortcutsFile");
        try {
            try {
                aZG2.c(string2, false);
                if (gi_0.d(aZG.h().getFile())) {
                    aZG2.c(string, true);
                }
            }
            catch (Exception exception) {
                i.debug((Object)"Exception \u00e0 la lecture des shortcuts : ", (Throwable)exception);
            }
            aZG2.a("debug", true);
            aZG2.a("admin", true);
            aZG2.a("default", true);
            this.p.i().a(aZG2, false);
        }
        catch (RuntimeException runtimeException) {
            i.error((Object)"Exception : ", (Throwable)runtimeException);
            throw new Exception("Impossible de charger les raccourcis clavier depuis le fichier " + string + " !");
        }
    }

    private static void W() {
        aed.a.a(acs_0.b());
        aed.a.a(afz_0.d());
        aed.a.a(bNT.f());
        aed.a.a(ahs.d());
        aed.a.a(abe_0.d());
        for (int k = 0; k < j.d().length; ++k) {
            aed.a.b(j.d()[k]);
        }
        aed.a.a(aik_0.a());
        aed.a.a(ael_0.a);
        aed.a.a(aof_0.a);
        aed.a.a(aof_0.a);
        ael_0.a.a(true);
    }

    private void a(gl_0 gl_02, agk_0 agk_02, ahg_0 ahg_02) {
        boolean bl = gl_02.h("soundEnable");
        try {
            cdw_0.n().b(azs_0.a().a("soundSourceFlavor"));
        }
        catch (gm_0 | RuntimeException exception) {
            i.error((Object)"Unable to initialize WakfuSoundManager.SOUND_SOURCE_FLAVOR", (Throwable)exception);
        }
        if (bl && this.H()) {
            String string;
            cdw_0.n().a(ahg_02.s());
            cdw_0.n().c(agk_02.c(ago_0.b));
            cdw_0.n().k(agk_02.a(ago_0.e));
            cdw_0.n().b(agk_02.c(ago_0.c));
            cdw_0.n().j(agk_02.a(ago_0.f));
            cdw_0.n().a(agk_02.c(ago_0.a));
            cdw_0.n().i(agk_02.a(ago_0.d));
            cdw_0.n().d(agk_02.a(ago_0.g));
            ago_0.b.a(agk_02, (ajz_1 ajz_12) -> cdw_0.n().c(ajz_12.n()));
            ago_0.e.a(agk_02, (ajz_1 ajz_12) -> cdw_0.n().k(ajz_12.l()));
            ago_0.c.a(agk_02, (ajz_1 ajz_12) -> cdw_0.n().b(ajz_12.n()));
            ago_0.f.a(agk_02, (ajz_1 ajz_12) -> cdw_0.n().j(ajz_12.l()));
            ago_0.a.a(agk_02, (ajz_1 ajz_12) -> cdw_0.n().a(ajz_12.n()));
            ago_0.d.a(agk_02, (ajz_1 ajz_12) -> cdw_0.n().i(ajz_12.l()));
            ago_0.g.a(agk_02, (ajz_1 ajz_12) -> cdw_0.n().d(ajz_12.l()));
            try {
                string = azs_0.z("lowPassPresetFile");
                cdw_0.n().d(string);
            }
            catch (Exception exception) {
                i.error((Object)"Unable to initialize WakfuSoundManager.LOWPASS_PRESET_FILE", (Throwable)exception);
            }
            try {
                string = azs_0.z("reverbPresetFile");
                cdw_0.n().c(string);
            }
            catch (Exception exception) {
                i.error((Object)"Unable to initialize WakfuSoundManager.REVERB_PRESET", (Throwable)exception);
            }
            try {
                string = azs_0.z("rollOffPresetFile");
                cdw_0.n().e(string);
            }
            catch (Exception exception) {
                i.error((Object)"Unable to initialize WakfuSoundManager.ROLLOFF_PRESET_FILE", (Throwable)exception);
            }
            try {
                string = azs_0.z("barksFile");
                cdw_0.n().f(string);
            }
            catch (Exception exception) {
                i.error((Object)"Unable to initialize WakfuSoundManager.BARKS_FILE", (Throwable)exception);
            }
            try {
                string = azs_0.z("groundsFile");
                cdw_0.n().g(string);
            }
            catch (Exception exception) {
                i.error((Object)"Unable to initialize WakfuSoundManager.GROUNDS_FILE", (Throwable)exception);
            }
            try {
                string = azs_0.z("mountsFile");
                cdw_0.n().h(string);
            }
            catch (Exception exception) {
                i.error((Object)"Unable to initialize WakfuSoundManager.MOUNTS_FILE", (Throwable)exception);
            }
            if (!this.l()) {
                Object object;
                try {
                    string = azs_0.z("particlesAudioFile");
                    object = (amY)alf_1.b();
                    ((amY)object).a(string);
                }
                catch (gm_0 | IOException | RuntimeException exception) {
                    i.error((Object)"Unable to initialize ParticleSoundManager", (Throwable)exception);
                }
                try {
                    string = azs_0.z("animatedElementsAudioFile");
                    object = (amX)amU.a();
                    ((amX)object).a(string);
                }
                catch (gm_0 | IOException | RuntimeException exception) {
                    i.error((Object)"Unable to initialize AnmActionRunScriptManager", (Throwable)exception);
                }
            }
        }
    }

    protected void J() {
        Object object;
        Object object2;
        if (!axy_2.b.a(axx_2.j) || this.t) {
            int n;
            int n2;
            Object[] objectArray;
            boolean bl;
            String string = azs_0.a().q();
            boolean bl2 = string != null;
            GL2 gL2 = auj_1.a.a().e();
            String string2 = gL2.glGetString(7936);
            String string3 = gL2.glGetString(7937);
            String string4 = gL2.glGetString(7938);
            String string5 = ans_0.a(string2, string3, string4);
            boolean bl3 = bl = string5 != null;
            if (bl2 && bl) {
                objectArray = new Object[]{bae.h().a("download.driver", new Object[0]), bae.h().a("learnMore", new Object[0]), bae.h().a("ok", new Object[0])};
                n2 = 1;
                n = 0;
            } else if (bl2) {
                objectArray = new Object[]{bae.h().a("learnMore", new Object[0]), bae.h().a("ok", new Object[0])};
                n2 = 0;
                n = -1;
            } else if (bl) {
                objectArray = new Object[]{bae.h().a("download.driver", new Object[0]), bae.h().a("ok", new Object[0])};
                n2 = -1;
                n = 0;
            } else {
                objectArray = new Object[]{bae.h().a("ok", new Object[0])};
                n2 = -1;
                n = -1;
            }
            SwingUtilities.invokeLater(() -> {
                int n3 = JOptionPane.showOptionDialog(this.p.v(), bae.h().a(azq_0.UW, string, string5, string3, string2, string4), bae.h().a("configuration.gl.incompatible", new Object[0]), -1, 0, null, objectArray, 0);
                if (bl2 && n3 == n2) {
                    aii_1.a(string);
                }
                if (bl && n3 == n) {
                    aii_1.a(string5);
                }
                System.exit(-1);
            });
            return;
        }
        if (axy_2.b.a(axx_2.k)) {
            object2 = ans_0.a(ava_2.a);
            object = auj_1.a.a().e();
            String string = object.glGetString(7936);
            String string6 = object.glGetString(7937);
            String string7 = object.glGetString(7938);
            fzn_0 fzn_02 = new fzn_0(101, 0, bae.h().a("configuration.warning.amd.adrenalin.artefactTearing", object2, string6, string, string7), 16480L);
            ArrayList<String> arrayList = new ArrayList<String>();
            arrayList.add(bae.h().a("update", new Object[0]));
            arrayList.add(bae.h().a("ignore", new Object[0]));
            fzn_02.a(arrayList);
            fzm_0 fzm_02 = fpm_0.b().b(fzn_02);
            fzm_02.a((arg_0, arg_1) -> ans_0.a((String)object2, arg_0, arg_1));
        }
        object2 = (bvx_0)this.h();
        aui_1.a().a(axy_2.b.a() && ((agk_0)object2).a(bWe.p));
        object = this.g.D();
        aui_1.a().a(((aad_2)object).c(), ((aad_2)object).d());
    }

    public static String a(ava_2 ava_22) {
        return bae.h().a("drivers.download.page." + ava_22.name().toLowerCase(), new Object[0]);
    }

    @Nullable
    public static String a(String string, String string2, String string3) {
        for (ava_2 ava_22 : ava_2.values()) {
            if (!ava_22.a(string, string2, string3)) continue;
            return ans_0.a(ava_22);
        }
        i.error((Object)String.format("Unknown %s from gl values : {glVendor : \"%s\" glRenderer : \"%s\" glVersion : \"%s\"}", ava_2.class, string, string2, string3));
        return null;
    }

    @Override
    protected void q() {
        axa_2.b.a(new axp_1());
        axa_2.b.a(new axq_1());
        axa_2.b.a(new axr_1());
        axa_2.b.a(new axn_1());
        axa_2.b.a(new axo_1());
        axa_2.b.a(new axm_1());
        axa_2.b.a(new axs_1());
        axa_2.b.a(new axl_1());
        axa_2.b.a(new axi_1());
        axa_2.b.a(new axj_1());
        axa_2.b.a(new axk_1());
        axa_2.b.a(new axb_1());
        axa_2.b.a(new axc_1());
        axa_2.b.a();
        axa_2.b.b();
        axa_2.b.c();
        this.J();
    }

    @Override
    protected void r() {
    }

    @Override
    protected void u() {
        this.a(bgc_2.a);
        this.a(new bdz_2());
        this.a(bdv_1.a());
        this.a(bdk_1.a());
        this.a(new bef_1());
        this.a(new bdz_1());
        this.a(new bfh_1());
        this.a(bed_2.a());
        this.a(bdt_1.a);
        this.a(bdv_2.a);
        this.a(bfr_1.a());
        this.a(new bdw_2());
        this.a(bex_2.a());
        this.a(new bfc_2());
        this.a(bfp_1.a());
        this.a(bel_1.a());
        this.a(new bfx_2());
        this.a(new bet_2());
        this.a(bet_1.a());
        this.a(bev_1.a());
        this.a(new bdi_1());
        this.a(bdf_2.a());
        this.a(new bfv_2());
        this.a(new bfd_1());
        this.a(new bec_2());
        this.a(new bff_2());
        this.a(new bfj_2());
        this.a(new bfh_2());
        this.a(new bfm_2());
        this.a(bdl_1.a());
        this.a(bfp_2.a());
        this.a(new bdo_2());
        this.a(new bfw_2());
        this.a(bft_1.a);
        this.a(bfl_1.a);
        this.a(bfm_1.a);
        this.a(bfu_1.a);
        this.a(bdn_1.b);
        this.a(bga_2.b);
        this.a(bdk_2.b);
        this.a(bdr_2.a);
        this.a(bdp_1.a);
        this.a(bdb_2.a);
        this.a(bdg_2.a);
        this.a(new bfn_1());
        this.a(new bem_2());
        this.a(new bep_1());
        this.a(new beq_2());
        this.a(new ber_1());
        this.a(new bdn_2());
        this.a(bgt.a);
        this.a(btf_2.a);
        this.a(new beh_2());
        this.a(new bej_1());
        this.a(new bfe_2());
        this.a(new bfb_2());
        this.a(new bdr_1());
        this.a(new ber_2());
        this.a(new bdt_2());
        this.a(new bdd_2());
        this.a(new beb_1());
        this.a(new beq_1());
        this.a(new bfo_2());
        this.a(new beo_1());
        this.a(new bfg_1());
        this.a(bfy_1.a);
    }

    @Override
    public void w() {
        super.w();
        fis_1 fis_12 = fis_1.a();
        String string = ((bvx_0)this.h()).f(bWe.e);
        fis_12.a("account.name", (Object)(string == null ? "" : string));
        fis_12.a("account.remember", ((bvx_0)this.h()).a(bWe.d));
        aZH.a().b();
        fis_1.a().a("shortcutsList", aZH.a());
        boolean bl = azs_0.a().a("autopassword", false);
        if (bl) {
            fis_12.a("account.password", (Object)"pass");
        }
        fis_1.a().a("isAdmin", false);
        fis_1.a().a("hasDebugRights", false);
        fis_1.a().a("isInAdministratorGroup", false);
        fis_1.a().a("isInGame", false);
        fis_1.a().a("useXmlTheme", azs_0.a().a("useXmlTheme", false));
        fis_1.a().a("characteristicIcons", bop_2.a);
    }

    @Override
    public void x() {
        azu_0.j().p();
        super.x();
        this.X();
        azr_0.a().a(-1L);
        ((bvx_0)this.h()).a((bvp_0)null);
        ((bvx_0)this.h()).i();
        azr_0.a().c(null);
    }

    @Override
    public void y() {
        try {
            azu_0.j().q();
        }
        catch (RuntimeException runtimeException) {
            i.error((Object)"Exception lors du cleanUp de la GameEntity", (Throwable)runtimeException);
        }
        super.y();
        this.X();
        try {
            azr_0.a().b(null);
            azr_0.a().a(null);
        }
        catch (RuntimeException runtimeException) {
            i.error((Object)"Exception lors de la sauvegarde des pr\u00e9f\u00e9rences du compte", (Throwable)runtimeException);
        }
    }

    private void X() {
        der.a();
        bUW.a().j();
        byp_2.a().x();
        aUf.a(false);
        bVt.a.a();
        bkk_1.a();
        cZl.a().c();
        fje_0.a.a();
        WakfuClient.c().setApiKey(null);
        WakfuClient.d().setApiKey(null);
        WakfuClient.e().setBearerToken((String)null);
        if (WakfuClient.a.n().q()) {
            i.info((Object)"[WEB-TOKEN-DEBUG] All tokens cleared");
        }
        try {
            aZG.e().a(true);
            aZG.e().a();
            aZG.e().a("world", false);
            aZG.e().a("fight", false);
            aZG.e().a("common", false);
            aZG.e().a("binding", false);
        }
        catch (RuntimeException runtimeException) {
            i.error((Object)"Exception lors du nettoyage des racourcis", (Throwable)runtimeException);
        }
        try {
            cSY.a(true);
        }
        catch (RuntimeException runtimeException) {
            i.error((Object)"Exception lors du nettoyage du MRU", (Throwable)runtimeException);
        }
        cuo_0.e().b();
        try {
            fpm_0.b().u();
        }
        catch (RuntimeException runtimeException) {
            i.error((Object)"Exception lors du nettoyage de Xulor", (Throwable)runtimeException);
        }
        try {
            fpm_0.b().n();
        }
        catch (RuntimeException runtimeException) {
            i.error((Object)"Exception lors du retrait des ActionClass", (Throwable)runtimeException);
        }
        try {
            fyt_0.a().c();
            fzd_0.a().d();
            fpm_0.b().p();
            ans_0.Y();
        }
        catch (RuntimeException runtimeException) {
            i.error((Object)"Exception lors du nettoyage des \u00e9l\u00e9ments flottants Xulor", (Throwable)runtimeException);
        }
        try {
            aUxx.a().l();
            aUxx.a().j();
        }
        catch (RuntimeException runtimeException) {
            i.error((Object)"Exception lors du nettoyage du chat.", (Throwable)runtimeException);
        }
        this.N();
        try {
            aul_0.a().c();
        }
        catch (RuntimeException runtimeException) {
            i.error((Object)"Exception lors du nettoyage des listes de contacts priv\u00e9s", (Throwable)runtimeException);
        }
        bqg_2.a().e();
        YX.b();
        aNF aNF2 = (aNF)this.c();
        aNF2.l(false);
        aNF2.o(false);
        this.M();
    }

    @Override
    protected void m() {
        fym_0 fym_02;
        this.a(fpm_0.b());
        anl_0.a().a(fpm_0.b());
        super.m();
        fzn_0.a(cfn_0.a(7));
        fpm_0.b().a("craftDialog");
        fpm_0.b().a("craftTableDialog");
        fpm_0.b().a("characterSheetDialog");
        fpm_0.b().a("inventoryDialog");
        fza_0.a().a(cdw_0.n().w());
        fpm_0.b().a(bae.h());
        fpm_0.b().a(aZG.e());
        fpm_0.b().a(cff_0.b());
        ans_0.Y();
        try {
            this.r = fyu.a().a(WakfuClient.a.a(), WakfuClient.a.m(), bae.h().f().a());
        }
        catch (IOException iOException) {
            i.error((Object)"[THEME] Error while creating the auto generated theme folder", (Throwable)iOException);
        }
        boolean bl = azs_0.a().a("useXmlTheme", false);
        if (bl) {
            fpm_0.b().a(azs_0.z("themeDescriptionFolder"), azs_0.a().a("themeDirectory"));
        } else {
            fym_02 = (fym_0)Class.forName("elU").getConstructor(new Class[0]).newInstance(new Object[0]);
            fyo_0 fyo_02 = (fyo_0)Class.forName("elV").getConstructor(new Class[0]).newInstance(new Object[0]);
            fpm_0.b().a(fym_02, fyo_02, azs_0.a().a("themeDirectory"));
        }
        fym_02 = new TIntObjectHashMap();
        fym_02.put(0, cfi_0.a("messageBoxDialog"));
        fpm_0.b().a((TIntObjectHashMap<String>)fym_02);
        fpm_0.b().i(cfi_0.a("popupDialog"));
        fpm_0.b().j(cfi_0.a("mruDialog"));
        fis_1.a().a("buildVersion", (Object)epj.f);
        fis_1.a().a("wakfu.config", azs_0.a());
        fpm_0.b().a(new bWf());
        fpm_0.b().a(new azf_2(0.02f, 0.08f, 0.1f, 0.75f));
    }

    @Override
    public void n() {
        super.n();
        cfm_2.a();
    }

    protected fyX K() {
        return new fyX();
    }

    @Override
    protected void a(ano_1 ano_12) {
    }

    @Override
    protected ahq p() {
        return new aNF(this);
    }

    @Override
    protected void a(acb_0 acb_02) {
        super.a(acb_02);
        azs_0 azs_02 = azs_0.a();
        try {
            agE.a(azs_0.z("elementsFile"));
            YY.a().a(azs_02.a("groupsFile"));
            acb_02.a(azs_02.a("gfxPath"));
            acb_02.b(azs_02.a("soundBankFile"));
            ccv_1.a.a();
            String string = azs_02.a("particlePath");
            aij_0.a().d(string);
            bWe bWe2 = bWe.A;
            boolean bl = ((bvx_0)this.h()).a(bWe2);
            acb_02.b().c(bl);
        }
        catch (gm_0 gm_02) {
            i.error((Object)"Erreur \u00e0 l'initialisation de la worldScene", (Throwable)gm_02);
        }
    }

    @Override
    public void B() {
        try {
            String string = azs_0.z("highLightGfxDefaultFile");
            aii_0.a().a(string);
        }
        catch (gm_0 gm_02) {
            i.error((Object)"Erreur \u00e0 l'initialisation du HighLightManager", (Throwable)gm_02);
        }
        catch (RuntimeException runtimeException) {
            i.error((Object)"Erreur \u00e0 l'initialisation du HighLightManager", (Throwable)runtimeException);
        }
    }

    private static void Y() {
        fpm_0.b().a("wakfu", cfq_0.class);
        fpm_0.b().a("wakfu.adminConsole", cgn_0.class);
    }

    @Override
    protected void a(int n) {
        cuo_0.e().a(true, true).a(bae.h().a("loading", new Object[0]), n);
    }

    @Override
    protected void b(int n) {
        cuo_0.e().b();
        if (this.r) {
            fpm_0.b().a(bae.h().a("theme.autoGenerated.info", bae.h().a("theme.auto.generated.name", new Object[0])), cfn_0.a(7), 2L, 102, 1);
            this.r = false;
        }
    }

    @Override
    protected void c(agw_0 agw_02) {
        cuo_0.e().a(true, true).b(agw_02.m_());
    }

    @Override
    protected void a(agw_0 agw_02, Exception exception) {
        fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("error.loading", new Object[0]) + agw_02.m_(), cfn_0.a(1), 1026L, 4, 2);
        fzm_02.a((int n, String string) -> System.exit(-1));
        i.error((Object)("Erreur au chargement sur le loader " + agw_02.getClass().getSimpleName()), (Throwable)exception);
    }

    @Override
    protected void a(agw_0 agw_02, int n) {
        cuo_0.e().a(true, true).a(n);
        cuo_0.e().a(true, true).b(" ");
    }

    @Override
    public void z() {
        super.z();
        try {
            aUf.e();
        }
        catch (Exception exception) {
            i.error((Object)"Echec de la tentative de sauvegarde des param\u00e8tres de chat: ", (Throwable)exception);
        }
        cdw_0.n().d();
        fjm_1.a().b();
        azu_0.j().a("UI Closed");
        Gy.a().a(ccp_0.class).b();
    }

    @Override
    public void b(aiy_0 aiy_02) {
        super.b(aiy_02);
    }

    @Override
    public void a(aiy_0 aiy_02) {
        super.a(aiy_02);
    }

    @NotNull
    public GraphicsDevice L() {
        return this.p.v().getGraphicsConfiguration().getDevice();
    }

    public void c(int n) {
        this.p.a(n, this.L());
    }

    public void d(int n) {
        acs_0.b().a(n);
        for (acG acG2 : this.f) {
            acG2.n().a(n);
            if (!acG2.u()) continue;
            this.g.b(acG2);
            this.g.a(acG2);
        }
        int n2 = this.q.size();
        for (int k = 0; k < n2; ++k) {
            this.q.get(k).onLODChange(n);
        }
    }

    @Override
    public void a(acE acE2) {
        if (!this.q.contains(acE2)) {
            this.q.add(acE2);
        }
    }

    public void M() {
        this.q.clear();
        j.a(new aNy());
    }

    public static void b(String string) {
        aui_1.a().a(new anx_0());
        auc_1.a().b(string);
    }

    @Override
    protected void a(ahi ahi2) {
        super.a(ahi2);
        ahi2.a(cda_2.class);
        ahi2.a(cdr_2.class);
        ahi2.a(cdv_1.class);
        ahi2.a(cdy_2.class);
        ahi2.a(cdd_2.class);
    }

    @Override
    protected boolean l() {
        try {
            boolean bl = azs_0.a().h("useLuaAudio");
            if (bl) {
                i.info((Object)"Lua script are used for audio.");
            }
            return bl;
        }
        catch (gm_0 gm_02) {
            return false;
        }
    }

    public void N() {
        cbt_1.a.c();
        brh_0.a().a((brf_0)null);
        cci_2.a.c();
        aun_0.a();
        try {
            this.c().b(false);
        }
        catch (RuntimeException runtimeException) {
            i.error((Object)"Exception lors du nettoyage de la world scene", (Throwable)runtimeException);
        }
        int n = this.f.length;
        for (int k = 0; k < n; ++k) {
            this.f[k].t();
        }
        try {
            aks_1.a().i();
            aln_2.a().b();
            akg_0.a().b();
            anl_0.a().b();
        }
        catch (RuntimeException runtimeException) {
            i.error((Object)"Exception lors du nettoyage du moteur de scripts", (Throwable)runtimeException);
        }
        try {
            dir_0.e().d();
            diq.d().e();
        }
        catch (RuntimeException runtimeException) {
            i.error((Object)"Exception lors du nettoyage des bulles de texte", (Throwable)runtimeException);
        }
    }

    public void O() {
        bWe bWe2 = bWe.A;
        boolean bl = ((bvx_0)j.h()).a(bWe2);
        abY abY2 = j.c().b();
        if (abY2 == null) {
            return;
        }
        abY2.d(1.0f);
        abY2.c(bl);
    }

    public boolean P() {
        return this.s;
    }

    public void d(boolean bl) {
        this.t = bl;
    }

    @Override
    protected /* synthetic */ ano_1 o() {
        return this.K();
    }

    @Override
    protected /* synthetic */ agk_0 i() {
        return this.G();
    }

    private static /* synthetic */ void a(String string, int n, String string2) {
        switch (n) {
            case 32: {
                aii_1.a(string);
                return;
            }
        }
    }
}

