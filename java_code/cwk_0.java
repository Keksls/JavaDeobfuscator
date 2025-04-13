/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TObjectIntHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.map.hash.TObjectIntHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cWK
 */
public class cwk_0
implements ahr_1 {
    static final Logger c = Logger.getLogger(cwk_0.class);
    private static final cwk_0 d = new cwk_0();
    private static final String e = "characterColorTextEditor";
    private static final String f = "characterSexRadioGroup";
    private boolean g;
    private boolean h;
    ArrayList<blw_1> i;
    private ArrayList<blw_1> j;
    private final ArrayList<bkz_1> k = new ArrayList();
    private int l;
    int m;
    private long n = -1L;
    private String o;
    cfa_1 p = cfa_1.a;
    bnh_1 q;
    private short r;
    private byte s;
    private boolean t;
    private static final long u = TimeUnit.MINUTES.toMillis(1L);
    private long v;
    public static final String[] a = new String[]{"AnimEmote-Victoire", "AnimEmote-Effrayee", "AnimEmote-Bailler", "AnimEmote-Rire", "AnimEmote-Huss-Debut", "AnimEmote-Chercher", "AnimEmote-Huss-Debut", "AnimEmote-DAB"};
    public static final String b = "AnimStatique";
    private fbx_1 w;
    frO x;
    fsQ y;
    private fsk_0 z;
    private fsk_0 A;
    private fsk_0 B;
    private boolean C;
    private static final TObjectIntHashMap<epn_2> D = new TObjectIntHashMap();
    final Collection<ays_2> E = new ArrayList<ays_2>();

    public static cwk_0 a() {
        return d;
    }

    public void b(long l) {
        this.n = l;
    }

    public void a(String string) {
        this.o = string;
    }

    public void a(cfa_1 cfa_12) {
        this.p = cfa_12;
    }

    public void a(short s2) {
        this.r = s2;
    }

    public void a(bnh_1 bnh_12) {
        this.q = bnh_12;
    }

    public void a(byte by) {
        this.s = by;
    }

    public void a(boolean bl) {
        this.t = bl;
    }

    private static void a(bnh_1 bnh_12, boolean bl) {
        bnh_12.aO();
        bnh_12.a((byte)0, false);
        bnh_12.b((byte)0, false);
        bnh_12.aP();
        if (bl) {
            fis_1.a().a("characterCreation.currentDressStyleIndex", bnh_12.bY() + 1);
            fis_1.a().a("characterCreation.currentHairStyleIndex", bnh_12.bZ() + 1);
            fis_1.a().a("characterCreation.totalDressStyleIndex", bkw_1.a().a(bnh_12.gO(), bnh_12.gX()));
            fis_1.a().a("characterCreation.totalHairStyleIndex", bkw_1.a().b(bnh_12.gO(), bnh_12.gX()));
        }
    }

    @NotNull
    public static bnh_1 c() {
        bnh_1 bnh_12 = (bnh_1)fis_1.a().e("characterCreation.editablePlayerInfo");
        if (bnh_12 == null) {
            bnh_12 = new bnh_1();
            fis_1.a().a("characterCreation.editablePlayerInfo", bnh_12);
        }
        return bnh_12;
    }

    private cwk_0() {
    }

    @Override
    public boolean a(adt_1 adt_12) {
        fis_1 fis_12 = fis_1.a();
        bnh_1 bnh_12 = cwk_0.c();
        if (adt_12 instanceof adh_2) {
            adi_2.a().a(this);
            if (!(this.g || bnh_12.F() != aej_2.d && bnh_12.F() != aej_2.b)) {
                biI biI2 = bnh_12.bv();
                String string2 = biI2.F();
                if (string2.equals(biI2.ab())) {
                    String string3 = cwk_0.m();
                    this.x.setAnimName(string3);
                    fis_12.a("characterCreation.editablePlayerInfo", "actorDescriptorLibrary");
                    fis_12.a("characterCreation.editablePlayerInfo", "actorLinkage");
                } else {
                    biI2.e(biI2.ab());
                }
            }
            return false;
        }
        switch (adt_12.a()) {
            case 16865: {
                ceX.a().a(true);
                azu_0.j().a(ceX.a());
                azu_0.j().b(ceZ.a());
                return false;
            }
            case 18325: {
                dfq dfq2 = (dfq)adt_12;
                this.t();
                this.a(bnh_12, dfq2.h());
                return false;
            }
            case 17914: {
                dfr dfr2 = (dfr)adt_12;
                this.t();
                blw_1 blw_12 = dfr2.o();
                boolean bl = dfr2.i();
                if (this.a(bnh_12, blw_12, bl)) {
                    return false;
                }
                cwk_0.a(boh_2.b.a(cwk_0.c()));
                String string4 = boh_2.b.c(cwk_0.c());
                fis_1.a().a("characterCreation.colorizablePartDescription", (Object)string4, "characterCreationDialog");
                if (!bl) {
                    bnh_12.ex();
                }
                return false;
            }
            case 19271: {
                if (this.C) {
                    return false;
                }
                dfc dfc2 = (dfc)adt_12;
                if (this.p != cfa_1.a && !eoy_0.c(this.r)) {
                    return false;
                }
                this.t();
                int n2 = dfc2.c();
                for (bkz_1 bkz_12 : this.k) {
                    if (bkz_12.a() != n2) continue;
                    bkz_1 bkz_13 = (bkz_1)fis_1.a().e("characterCreation.roleFilter");
                    fis_1.a().a("characterCreation.roleFilter", bkz_13 == bkz_12 ? null : bkz_12);
                    this.k();
                }
                return false;
            }
            case 18660: {
                dfq dfq3 = (dfq)adt_12;
                this.t();
                byte by = dfq3.b();
                if (bnh_12.gX() == by) {
                    return false;
                }
                if (this.g) {
                    return false;
                }
                this.f(by);
                this.b(true);
                return false;
            }
            case 19341: {
                dfc dfc3 = (dfc)adt_12;
                Optional<boh_2> optional = boh_2.a(dfc3.h());
                if (optional.isEmpty()) {
                    return false;
                }
                this.t();
                optional.get().a(bnh_12, dfc3.c());
                fis_12.a((ajf_1)bnh_12, "actorDescriptorLibrary");
                return false;
            }
            case 16470: {
                dfc dfc4 = (dfc)adt_12;
                String string5 = dfc4.h();
                Optional<boh_2> optional = boh_2.a(string5);
                if (optional.isEmpty()) {
                    return false;
                }
                optional.get().b(bnh_12);
                fis_12.a((ajf_1)bnh_12, "actorDescriptorLibrary");
                if (string5.equals(cFP.getColorizablePartName())) {
                    cwk_0.a(optional.get().a(bnh_12));
                }
                return false;
            }
            case 16968: {
                fzn_0 fzn_02 = new fzn_0(102, 0, bae.h().a("characterCreation.question.reset", new Object[0]), null, cfn_0.a(0), 24L);
                fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
                fzm_02.a((int n, String string) -> {
                    if (n != 8) {
                        return;
                    }
                    bnh_12.b((byte)0, true);
                    fis_1.a().a("characterCreation.currentHairStyleIndex", 1);
                    bnh_12.a((byte)0, true);
                    fis_1.a().a("characterCreation.currentDressStyleIndex", 1);
                    for (boh_2 boh_23 : boh_2.values()) {
                        boh_23.b(bnh_12);
                    }
                    fis_12.a((ajf_1)bnh_12, "actorDescriptorLibrary", "hairAvailability", "skinAvailability", "pupilAvailability");
                    String string2 = cFP.getColorizablePartName();
                    Optional<boh_2> optional = boh_2.a(string2);
                    optional.ifPresent(boh_22 -> cwk_0.a(boh_22.a(bnh_12)));
                });
                return false;
            }
            case 17721: {
                dfc dfc5 = (dfc)adt_12;
                Optional<boh_2> optional = boh_2.a(dfc5.h());
                if (optional.isEmpty()) {
                    return false;
                }
                this.t();
                int n3 = bkw_1.b();
                optional.get().a(bnh_12, n3);
                fis_12.a((ajf_1)bnh_12, "actorDescriptorLibrary");
                cwk_0.a(n3);
                return false;
            }
            case 16044: {
                this.t();
                int n4 = bkw_1.a().b(bnh_12.gO(), bnh_12.gX());
                byte by = (byte)fis_1.a().d("characterCreation.currentHairStyleIndex");
                by = (byte)(by + 1);
                if (by > n4) {
                    by = 1;
                }
                bnh_12.b((byte)(by - 1), true);
                fis_1.a().a("characterCreation.currentHairStyleIndex", by);
                return false;
            }
            case 17424: {
                this.t();
                int n5 = bkw_1.a().b(bnh_12.gO(), bnh_12.gX());
                byte by = (byte)fis_1.a().d("characterCreation.currentHairStyleIndex");
                by = (byte)(by - 1);
                if (by <= 0) {
                    by = (byte)n5;
                }
                bnh_12.b((byte)(by - 1), true);
                fis_1.a().a("characterCreation.currentHairStyleIndex", by);
                return false;
            }
            case 16089: {
                this.t();
                int n6 = bkw_1.a().a(bnh_12.gO(), bnh_12.gX());
                byte by = (byte)fis_1.a().d("characterCreation.currentDressStyleIndex");
                by = (byte)(by + 1);
                if (by > n6) {
                    by = 1;
                }
                bnh_12.a((byte)(by - 1), true);
                fis_1.a().a("characterCreation.currentDressStyleIndex", by);
                bnh_12.ex();
                fis_1.a().a((ajf_1)bnh_12, "hairAvailability", "skinAvailability", "pupilAvailability");
                return false;
            }
            case 19326: {
                this.t();
                int n7 = bkw_1.a().a(bnh_12.gO(), bnh_12.gX());
                byte by = (byte)fis_1.a().d("characterCreation.currentDressStyleIndex");
                by = (byte)(by - 1);
                if (by <= 0) {
                    by = (byte)n7;
                }
                bnh_12.a((byte)(by - 1), true);
                fis_1.a().a("characterCreation.currentDressStyleIndex", by);
                bnh_12.ex();
                fis_1.a().a((ajf_1)bnh_12, "hairAvailability", "skinAvailability", "pupilAvailability");
                return false;
            }
            case 18968: {
                boolean bl;
                boolean bl2;
                this.t();
                if (this.p == cfa_1.b) {
                    bl2 = eoy_0.e(this.r);
                    bl = eoy_0.d(this.r);
                } else {
                    bl2 = true;
                    bl = true;
                }
                int n8 = bkw_1.a().a(bnh_12.gO(), bnh_12.gX());
                byte by = bl2 ? (byte)Hw.a(n8) : bnh_12.bY();
                int n9 = bkw_1.a().b(bnh_12.gO(), bnh_12.gX());
                byte by2 = bl2 ? (byte)Hw.a(n9) : bnh_12.bZ();
                int n10 = bl ? bkw_1.b() : bnh_12.ew().a();
                int n11 = bl ? bkw_1.b() : bnh_12.ew().b();
                int n12 = bl ? bkw_1.b() : bnh_12.ew().c();
                int n13 = bl ? bkw_1.b() : bnh_12.ew().d();
                int n14 = bl ? bkw_1.b() : bnh_12.ew().e();
                int n15 = bl ? bkw_1.b() : bnh_12.ew().f();
                int n16 = bl ? bkw_1.b() : bnh_12.ew().g();
                int n17 = bl ? bkw_1.b() : bnh_12.ew().h();
                int n18 = bl ? bkw_1.b() : bnh_12.ew().i();
                bnh_12.a(by, true);
                fis_1.a().a("characterCreation.currentDressStyleIndex", by + 1);
                bnh_12.b(by2, true);
                fis_1.a().a("characterCreation.currentHairStyleIndex", by2 + 1);
                bnh_12.a(n10, true);
                bnh_12.b(n11, true);
                bnh_12.c(n12, true);
                bnh_12.a(atm_1.k, n13, true);
                bnh_12.a(atm_1.l, n14, true);
                bnh_12.a(atm_1.m, n15, true);
                bnh_12.a(atm_1.n, n16, true);
                bnh_12.a(atm_1.o, n17, true);
                bnh_12.a(atm_1.p, n18, true);
                fis_12.a((ajf_1)bnh_12, "actorDescriptorLibrary", "hairAvailability", "skinAvailability", "pupilAvailability");
                String string6 = cFP.getColorizablePartName();
                Optional<boh_2> optional = boh_2.a(string6);
                optional.ifPresent(boh_22 -> cwk_0.a(boh_22.a(bnh_12)));
                return false;
            }
            case 23506: {
                ceX.a().a(true);
                azu_0.j().a(ceX.a());
                azu_0.j().b(ceZ.a());
                cuo_0.e().b();
                ceX.a().a(adt_12);
                return false;
            }
        }
        return true;
    }

    public static void a(int n) {
        azf_2 azf_22 = new azf_2(n);
        fis_1.a().a("characterCreation.colorPickerValue", (Object)azf_22, "characterCreationDialog");
        fyy_0 fyy_02 = fpm_0.b().h().d("characterCreationDialog");
        if (fyy_02 == null) {
            return;
        }
        fug_0 fug_02 = (fug_0)fyy_02.a(e);
        if (fug_02 == null) {
            return;
        }
        fug_02.c(azf_22.w().toUpperCase());
    }

    private boolean a(bnh_1 bnh_12, blw_1 blw_12, boolean bl) {
        epn_2 epn_22 = blw_12.c();
        if (bnh_12.ev() == epn_22) {
            return true;
        }
        if (this.g) {
            return true;
        }
        if (!blw_12.a()) {
            return true;
        }
        if (blw_12 instanceof cWS) {
            blw_1 blw_13 = null;
            while (blw_13 == null || blw_13.c() == bnh_12.ev()) {
                blw_13 = this.i.get(this.b(this.p));
                c.error((Object)blw_13.c().name());
            }
            this.a(blw_13, false);
        } else {
            this.a(blw_12, bl);
        }
        this.g();
        return false;
    }

    public cfa_1 d() {
        return this.p;
    }

    private boolean g() {
        fyy_0 fyy_02 = fpm_0.b().h().d("characterCreationDialog");
        if (fyy_02 == null) {
            return true;
        }
        fug_0 fug_02 = (fug_0)fyy_02.a("nameHelpTextEditor");
        fyc_0.a().c(fug_02);
        fso fso2 = (fso)fyy_02.a("mainContainer");
        fsk_0 fsk_02 = (fsk_0)fyy_02.a("bigBackground");
        ArrayList<fyb_0> arrayList = new ArrayList<fyb_0>();
        arrayList.add(fsk_02.getAppearance());
        arrayList.add(this.x);
        fso2.removeTweensOfType(fjq_2.class);
        fso2.removeTweensOfType(fjo_2.class);
        this.x.setModulationColor(azf_2.b);
        fsk_02.setModulationColor(azf_2.b);
        ado_1.a().a(new cwl_0(this, fso2, arrayList), 100L, 1);
        return false;
    }

    void a(bnh_1 bnh_12, byte by) {
        this.h = false;
        if (by == 1 && !fis_1.a().c("characterCreation.femaleEnabled")) {
            by = 0;
            this.h = true;
        }
        if (bnh_12.gX() == by) {
            return;
        }
        this.a(bnh_12, by, false);
        fis_1.a().a("characterCreation.currentDressStyleIndex", bnh_12.bY() + 1);
        fis_1.a().a("characterCreation.currentHairStyleIndex", bnh_12.bZ() + 1);
        fis_1.a().a("characterCreation.totalDressStyleIndex", bkw_1.a().a(bnh_12.gO(), bnh_12.gX()));
        fis_1.a().a("characterCreation.totalHairStyleIndex", bkw_1.a().b(bnh_12.gO(), bnh_12.gX()));
        this.e(by);
        bnh_12.ex();
    }

    private void a(bnh_1 bnh_12, String string) {
        cdw_0.n().c(600003L);
        bnh_12.c(string);
        cuo_0.e().a(true).a(bae.h().a("createCharacter.progress", new Object[0]), 0);
        cBo cBo2 = new cBo();
        cBo2.a(this.n);
        cBo2.a(bnh_12.ev().s());
        boolean bl = bkw_1.a().m(bnh_12.gO(), bnh_12.gX(), bnh_12.bY());
        eb eb2 = eb.I().l(bnh_12.gX()).a(bnh_12.ew().a()).b(bnh_12.ew().b()).c(bl ? bnh_12.ew().c() : -1).j(bnh_12.bY()).k(bnh_12.bZ()).d(bnh_12.ew().d()).e(bnh_12.ew().e()).f(bnh_12.ew().f()).g(bnh_12.ew().g()).h(bnh_12.ew().h()).i(bnh_12.ew().i()).J();
        cBo2.a(eb2);
        cBo2.a(bnh_12.dp());
        cBo2.a(this.p == cfa_1.c);
        azu_0.j().K().c(cBo2);
        bmp_1.a().f(bnh_12);
    }

    private void a(bnh_1 bnh_12, byte by, boolean bl) {
        cwk_0.a(bnh_12, bl);
        bnh_12.g(by);
        bnh_12.eA();
        bnh_12.eD();
        bnh_12.ex();
        cwk_0.b(bnh_12);
    }

    @Override
    public long a_() {
        return this.hashCode();
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            bkt_1.a().c();
            cuo_0.e().a(true);
            this.m = Integer.MIN_VALUE;
            this.s();
            if (this.p != cfa_1.b) {
                this.r = (short)127;
            }
            String string = this.r == 127 ? "create" : "recustom.change";
            fis_1.a().a("characterCreation.buttonText", (Object)bae.h().a(string, new Object[0]));
            this.k();
            this.l();
            this.v = 0L;
            fis_1.a().a("characterCreation.breedOver", (Object)null);
            fis_1.a().a("characterCreation.roleFilter", (Object)null);
            fis_1.a().a("characterCreation.randomNameActivated", cwk_0.h());
            fis_1.a().a("characterCreation.enableCancel", this.t || this.p.a());
            fis_1.a().a("characterCreation.enableNameChange", eoy_0.b(this.r));
            fis_1.a().a("characterCreation.enableSexChange", eoy_0.a(this.r));
            fis_1.a().a("characterCreation.enableAppearanceChange", eoy_0.e(this.r));
            fis_1.a().a("characterCreation.enableColorChange", eoy_0.d(this.r));
            boolean bl2 = emp_0.b(azu_0.j().n().v(), emq_0.ba);
            fis_1.a().a("characterCreation.regex", (Object)(bl2 ? "[\\p{L} '\\-\\u00b7\\[\\]]+" : "[\\p{L} '\\-]+"));
            fis_1.a().a("characterCreation.maxChars", (short)25);
            String string2 = "characterCreationDialog";
            fyb_0 fyb_02 = fpm_0.b().a("characterCreationDialog", cfi_0.a("characterCreationDialog"), 8192L, (short)10000);
            this.a(fyb_02);
            fyy_0 fyy_02 = fyb_02.getElementMap();
            this.A = (fsk_0)fyy_02.a("maleImage");
            this.B = (fsk_0)fyy_02.a("femaleImage");
            this.x = (frO)fyy_02.a("characterAEV");
            if (this.o != null) {
                fug_0 fug_02 = (fug_0)fyy_02.a("nameHelpTextEditor");
                fsM fsM2 = (fsM)fyy_02.a("characterNameEditorText");
                fug_02.c(this.o);
                fsM2.setVisible(false);
                this.o = null;
            } else {
                this.i();
            }
            cFP.setCreateCharacterFlag(false);
            fpm_0.b().a("wakfu.characterCreation", cFP.class);
            cdw_0.n().c(600012L);
            cdw_0.n().r();
            this.u();
            ddp.a().c();
        }
    }

    private static boolean h() {
        return azs_0.a().a("enableRandomCharacterName", bpa_1.c().d());
    }

    private void a(fyb_0 fyb_02) {
        this.y = (fsQ)fyb_02.getElementMap().a("breedList2");
        this.z = (fsk_0)fyb_02.getElementMap().a("breedIllustration");
        this.y.addListContentListener(new cWN(this, fyb_02));
    }

    public void e() {
        fyy_0 fyy_02 = fpm_0.b().h().d("characterCreationDialog");
        fsM fsM2 = (fsM)fyy_02.a("characterNameEditorText");
        fsM2.removeTweensOfType(fjp_2.class);
        fsM2.setVisible(false);
    }

    private void i() {
        fyy_0 fyy_02 = fpm_0.b().h().d("characterCreationDialog");
        fsM fsM2 = (fsM)fyy_02.a("characterNameEditorText");
        azf_2 azf_22 = new azf_2(azf_2.e);
        azf_2 azf_23 = new azf_2(azf_2.b);
        fsM2.removeTweensOfType(fjp_2.class);
        fjp_2 fjp_22 = new fjp_2(azf_22, azf_23, fsM2, 0, 1000, -1, true, fjw_2.b);
        fsM2.addTween(fjp_22);
    }

    private int j() {
        return Hw.a(this.i.size() - 1);
    }

    int a(epn_2 epn_22) {
        int n = this.i.size();
        for (int k = 0; k < n; ++k) {
            blw_1 blw_12 = this.i.get(k);
            if (blw_12.c() != epn_22) continue;
            return k;
        }
        return 0;
    }

    int b(cfa_1 cfa_12) {
        int n;
        int n2 = 0;
        int n3 = this.i.size();
        for (n = 0; n < n3; ++n) {
            if (!this.i.get(n).a()) continue;
            ++n2;
        }
        if (n2 == 0) {
            return 0;
        }
        while (!this.i.get(n = this.j()).a()) {
        }
        return n;
    }

    private void k() {
        int n;
        int n2;
        this.i = new ArrayList();
        bks_1[] bks_1Array = bkt_1.a().d();
        for (n2 = 0; n2 < bks_1Array.length; ++n2) {
            epn_2 epn_22 = bks_1Array[n2].f();
            if (epo_2.c().contains(epn_22)) continue;
            blw_1 blw_12 = new blw_1(epn_22);
            blw_12.a(D.get((Object)epn_22));
            boolean bl = this.b(epn_22);
            blw_12.a(bl);
            this.i.add(blw_12);
        }
        n2 = 0;
        int n3 = this.i.size();
        for (n = 0; n < n3; ++n) {
            if (!this.i.get(n).a()) continue;
            ++n2;
        }
        this.i.sort(new cwo_0(this));
        fis_1.a().a("characterCreation.breedInfoList", this.i);
        fis_1.a().a("characterCreation.breedsAvailableNumber", bks_1Array.length);
        this.j = new ArrayList();
        for (n = 0; n < bks_1Array.length; ++n) {
            epn_2 epn_23 = bks_1Array[n].f();
            if (!epo_2.c().contains(epn_23)) continue;
            blw_1 blw_13 = new blw_1(epn_23);
            blw_13.a(true);
            this.j.add(blw_13);
        }
        fis_1.a().a("characterCreation.debugBreedInfoList", this.j.isEmpty() ? null : this.j);
    }

    private void l() {
        this.k.clear();
        for (eqb_1 eqb_12 : eqb_1.values()) {
            if (eqb_12 == eqb_1.a || eqb_12 == eqb_1.b) continue;
            this.k.add(new bkz_1(eqb_12));
        }
        fis_1.a().a("characterCreation.roleList", this.k);
    }

    private boolean b(epn_2 epn_22) {
        boolean bl = eoy_0.c(this.r) == (this.q != null && this.q.ev() != epn_22);
        boolean bl2 = this.p != cfa_1.b || bl;
        boolean bl3 = epo_2.a(epn_22);
        boolean bl4 = false;
        bkz_1 bkz_12 = (bkz_1)fis_1.a().e("characterCreation.roleFilter");
        if (bkz_12 != null) {
            bl4 = epn_22.a() != bkz_12.b() && epn_22.b() != bkz_12.b() && epn_22.c() != bkz_12.b();
        }
        return bl3 && bl2 && !bl4;
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.n = -1L;
            this.o = null;
            this.p = cfa_1.a;
            this.i.clear();
            for (ays_2 ays_22 : this.E) {
                ays_22.u();
            }
            this.E.clear();
            cwk_0.c().bv().R();
            bnh_1 bnh_12 = (bnh_1)fis_1.a().e("characterCreation.editablePlayerInfo");
            if (bnh_12 != null) {
                bnh_12.cx();
            }
            fis_1.a().a("characterCreation.editablePlayerInfo");
            fis_1.a().a("characterCreation.overBreed");
            fis_1.a().a("characterCreation.breedInfoList");
            fis_1.a().a("characterCreation.debugBreedInfoList");
            fis_1.a().a("characterCreation.breedsAvailableNumber");
            fis_1.a().a("characterCreation.currentHairStyleIndex");
            fis_1.a().a("characterCreation.totalHairStyleIndex");
            fis_1.a().a("characterCreation.currentDressStyleIndex");
            fis_1.a().a("characterCreation.totalDressStyleIndex");
            fis_1.a().a("characterCreation.breedOver");
            fis_1.a().a("characterCreation.randomNameActivated");
            fis_1.a().a("characterCreation.roleFilter");
            fpm_0.b().o("characterCreationDialog");
            fpm_0.b().e("wakfu.characterCreation");
            adi_2.a().a(this);
            this.w = null;
            this.x = null;
            bpa_1.c().b();
        }
    }

    void c(long l) {
        adi_2.a().a(this);
        adi_2.a().a(d, l, 0, 1L);
    }

    private static String m() {
        return a[Hx.d().nextInt(a.length)];
    }

    private void a(blw_1 blw_12, boolean bl) {
        this.o();
        fis_1.a().a("characterCreation.femaleEnabled", true);
        bnh_1 bnh_12 = cwk_0.c();
        if (bl && this.n()) {
            bnh_12.b(this.q.ev());
            bnh_12.ew().a(this.q.ew());
            bnh_12.g(this.q.gX());
            bnh_12.aQ();
            fis_1.a().a("characterCreation.currentHairStyleIndex", this.q.bZ() + 1);
            fis_1.a().a("characterCreation.currentDressStyleIndex", this.q.bY() + 1);
            int n = bkw_1.a().a(bnh_12.gO(), bnh_12.gX());
            fis_1.a().a("characterCreation.totalDressStyleIndex", n);
            int n2 = bkw_1.a().b(bnh_12.gO(), bnh_12.gX());
            fis_1.a().a("characterCreation.totalHairStyleIndex", n2);
        } else {
            cwk_0.a(bnh_12, false);
            bnh_12.b(blw_12.c());
            bnh_12.eD();
            bnh_12.ex();
            this.a(bnh_12, this.h ? (byte)1 : bnh_12.gX());
            cwk_0.a(bnh_12, true);
        }
        bnh_12.a(aej_2.d);
        cwk_0.b(bnh_12);
        this.y.setSelectedValue(blw_12);
        this.b(bnh_12.gX());
        this.p();
    }

    private boolean n() {
        if (this.q == null) {
            return false;
        }
        blw_1 blw_12 = this.i.get(this.a(this.q.ev()));
        return blw_12 != null && blw_12.a();
    }

    private void o() {
        ftj_0 ftj_02 = this.y.getSelected();
        if (ftj_02 == null) {
            return;
        }
        fyy_0 fyy_02 = ftj_02.getInnerElementMap();
        cwk_0.a((fsk_0)fyy_02.a("breedSelectionNW"));
        cwk_0.a((fsk_0)fyy_02.a("breedSelectionSW"));
        cwk_0.a((fsk_0)fyy_02.a("breedSelectionNE"));
        cwk_0.a((fsk_0)fyy_02.a("breedSelectionSE"));
    }

    private static void a(fsk_0 fsk_02) {
        azf_2 azf_22 = new azf_2(azf_2.e);
        fsk_02.removeTweensOfType(fjp_2.class);
        fsk_02.setModulationColor(azf_22);
        fsk_02.removeTweensOfType(fjm_2.class);
        fsk_02.getImageMesh().a(1.0f, 1.0f, 1.0f);
    }

    private void p() {
        ftj_0 ftj_02 = this.y.getSelected();
        if (ftj_02 == null) {
            return;
        }
        fyy_0 fyy_02 = ftj_02.getInnerElementMap();
        cwk_0.b((fsk_0)fyy_02.a("breedSelectionNW"));
        cwk_0.b((fsk_0)fyy_02.a("breedSelectionSW"));
        cwk_0.b((fsk_0)fyy_02.a("breedSelectionNE"));
        cwk_0.b((fsk_0)fyy_02.a("breedSelectionSE"));
    }

    private static void b(fsk_0 fsk_02) {
        fsk_02.removeTweensOfType(fjm_2.class);
        fjm_2 fjm_22 = new fjm_2(Float.valueOf(0.8f), Float.valueOf(1.0f), fsk_02, 0, 300, fjw_2.c, fsk_02.getImageMesh(), -1);
        fsk_02.addTween(fjm_22);
    }

    private static void b(bnh_1 bnh_12) {
        fis_1 fis_12 = fis_1.a();
        fis_12.a((ajf_1)bnh_12, "sex", "actorDescriptorLibrary", "actorAnimationPath", "actorLinkage", "hairDescription", "skinDescription", "pupilDescription", "hairAvailability", "skinAvailability", "pupilAvailability", "breedInfo", "skinColor", "hairColor", "pupilColor", "costume1Color", "costume2Color", "costume3Color", "costume4Color", "costume5Color", "costume6Color");
    }

    void q() {
        fyy_0 fyy_02 = fpm_0.b().h().d("characterCreationDialog");
        if (fyy_02 == null) {
            return;
        }
        fsk_0 fsk_02 = (fsk_0)fyy_02.a("bigBackground");
        if (fsk_02 == null) {
            return;
        }
        if (this.w == null) {
            this.w = new fbx_1();
            this.w.onCheckOut();
            this.w.setAlignment(frs_0.e);
            this.w.setX((int)this.w.getPosition().a());
            this.w.setY((int)(this.w.getPosition().b() + 20.0f));
            this.w.setLevel(1);
        }
        this.w.setFile(bkw_1.a().a(cwk_0.c().ev().s()));
        fsk_02.getAppearance().add(this.w);
    }

    private void b(byte by) {
        cwk_0.a(this.z, azf_2.b, azf_2.e);
        cwk_0.a(this.A, azf_2.b, cwk_0.c(by));
        cwk_0.a(this.B, azf_2.b, cwk_0.d(by));
    }

    private static azj_2 c(byte by) {
        return by == 0 ? azf_2.e : azf_2.b;
    }

    private static azj_2 d(byte by) {
        return by == 1 ? azf_2.e : azf_2.b;
    }

    private void e(byte by) {
        azf_2 azf_22 = by == 1 ? azf_2.e : azf_2.b;
        azf_2 azf_23 = by == 1 ? azf_2.b : azf_2.e;
        cwk_0.a(this.A, azf_22, azf_23);
        cwk_0.a(this.B, azf_23, azf_22);
    }

    private static void a(fsk_0 fsk_02, azj_2 azj_22, azj_2 azj_23) {
        if (fsk_02 == null) {
            return;
        }
        azf_2 azf_22 = new azf_2(azj_22);
        azf_2 azf_23 = new azf_2(azj_23);
        fsk_02.removeTweensOfType(fjp_2.class);
        fjp_2 fjp_22 = new fjp_2(azf_22, azf_23, fsk_02, 0, 300, 1, false, fjw_2.b);
        fsk_02.addTween(fjp_22);
    }

    public boolean f() {
        return this.g;
    }

    private void f(byte by) {
        this.r();
        cWR cWR2 = new cWR(this, by);
        cWR2.a();
    }

    private void b(boolean bl) {
        amj_1 amj_12;
        this.C = true;
        if (bl && (amj_12 = cdw_0.n().c(600158L)) != null) {
            amj_12.c(0.5f);
        }
        this.l = 0;
        ado_1.a().a(() -> {
            ftj_0 ftj_02 = this.y.getRenderables().get(this.l);
            fsd_0 fsd_02 = (fsd_0)ftj_02.getInnerElementMap().a("flippingImage");
            fsd_02.b();
            this.l = (this.l + 1) % this.y.size();
            if (this.l == 0) {
                this.C = false;
            }
        }, 20L, this.y.size());
    }

    private void r() {
        this.g = true;
        fis_1.a().a("characterCreation.controlsLocked", true);
    }

    void s() {
        this.g = false;
        fis_1.a().a("characterCreation.controlsLocked", false);
    }

    private void t() {
        long l = System.currentTimeMillis();
        if (this.v + u > l) {
            return;
        }
        azu_0.j().K().c(new px_0(2, 0));
        this.v = l;
    }

    private void u() {
        anv_1 anv_12 = cuo_0.e().a();
        bks_1[] bks_1Array = bkt_1.a().d();
        anv_12.a(bae.h().a("loading.preLoad", new Object[0]), bks_1Array.length * 2);
        cWP cWP2 = new cWP(this, bks_1Array, anv_12);
        cWP2.start();
    }

    static {
        D.put((Object)epn_2.k, 1);
        D.put((Object)epn_2.h, 2);
        D.put((Object)epn_2.m, 3);
        D.put((Object)epn_2.p, 4);
        D.put((Object)epn_2.f, 5);
        D.put((Object)epn_2.q, 6);
        D.put((Object)epn_2.j, 7);
        D.put((Object)epn_2.i, 8);
        D.put((Object)epn_2.c, 9);
        D.put((Object)epn_2.l, 10);
        D.put((Object)epn_2.e, 11);
        D.put((Object)epn_2.t, 12);
        D.put((Object)epn_2.r, 13);
        D.put((Object)epn_2.u, 14);
        D.put((Object)epn_2.g, 15);
        D.put((Object)epn_2.d, 16);
        D.put((Object)epn_2.n, 17);
        D.put((Object)epn_2.o, 18);
    }
}

