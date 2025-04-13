/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class dbA
implements ahr_1 {
    private static final Logger a = Logger.getLogger(dbA.class);
    private static final dbA b = new dbA();
    private static final int c = 366366;
    private ans_1 d;
    private fzi e;
    private dbh_0 f;
    private final TIntObjectHashMap<any_1> g = new TIntObjectHashMap();
    private dhm_0 h;

    public static dbA a() {
        return b;
    }

    public dhm_0 c() {
        return this.h;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 17806: {
                azu_0.j().b(this);
                return false;
            }
            case 16755: {
                dhd_0 dhd_02 = (dhd_0)adt_12;
                if (aZH.a().e() != null) {
                    return false;
                }
                fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("question.confirmBindedTest", dhd_02.k().e().m()), cfn_0.a(0), 2073L, 102, 1);
                fzm_02.a((int n, String string) -> {
                    if (n == 8) {
                        any_1 any_12 = dhd_02.k().e();
                        try {
                            aZG.e().a(any_12, "binding", dbA.i());
                        }
                        catch (Exception exception) {
                            a.error((Object)"Exception during onMessage for CREATE_SHORTCUT_REQUEST", (Throwable)exception);
                        }
                        aZH.a().c();
                        aZF aZF2 = aZH.a().c(Hw.c(any_12.b(), any_12.l()));
                        if (aZF2 != null) {
                            cIi.bindKey(aZF2, 17401);
                        }
                    }
                });
                return false;
            }
            case 19924: {
                aZF aZF2 = aZH.a().e();
                if (aZF2 == null) {
                    return false;
                }
                try {
                    aZG.e().b(aZF2.e(), dbA.i());
                }
                catch (Exception exception) {
                    a.error((Object)"Exception during onMessage for DELETE_CURRENT_BIND_SHORTCUT_REQUEST", (Throwable)exception);
                }
                aZH.a().c();
                return false;
            }
            case 17401: {
                dhd_0 dhd_03 = (dhd_0)adt_12;
                String string2 = "<u>" + dhd_03.k().g() + "</u>\n" + bae.h().a("options.enterKeysCombining", new Object[0]);
                fis_1.a().a("waitingForKeyTypedDescription", (Object)string2);
                fis_1.a().a("waitingForKeyTyped", true);
                this.f = new dbh_0(this, dhd_03.k());
                ans_0.D().e().a(this.f, true);
                return false;
            }
            case 16777: {
                dhd_0 dhd_04 = (dhd_0)adt_12;
                any_1 any_12 = dhd_04.k().e();
                this.a(any_12);
                this.a(any_12, dhd_04.h());
                aZH.a().c();
                return false;
            }
            case 18525: {
                fzm_0 fzm_03 = fpm_0.b().a(bae.h().a("question.restoreOptions", new Object[0]), cfn_0.a(0), 2073L, 102, 1);
                fzm_03.a(new dbB(this));
                return false;
            }
            case 17835: {
                bmr_1 bmr_12 = azu_0.j().k();
                if (bmr_12 == null) {
                    fpm_0.b().g().c();
                    azu_0.j().b(this);
                    return false;
                }
                if (!this.f()) {
                    aUh.a("error.localPlayerBusy", new Object[0]);
                    return false;
                }
                aUh.b("notification.theme.reloaded", new Object[0]);
                return false;
            }
            case 17667: {
                fyu.a().c();
                return false;
            }
            case 16339: {
                dbA.g();
                return false;
            }
        }
        return true;
    }

    public void d() {
        ((bvx_0)ans_0.D().h()).e();
        aZG aZG2 = aZG.e();
        try {
            String string = azs_0.z("defaultShortcutsFile");
            aZG2.c(string, false);
            String string2 = dbA.i();
            gi_0.e(string2);
        }
        catch (Exception exception) {
            a.error((Object)"impossible de recharger le fichier de raccourcis par d\u00e9faut");
        }
        aZH.a().b();
        fis_1.a().a((ajf_1)aZH.a(), aZH.a().d());
        fis_1.a().a((ajf_1)ans_0.D().h(), ((bvx_0)ans_0.D().h()).d());
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
            this.e = new dbC(this);
            cff_0.b().a(this.e);
            this.d = new dbd_0(this);
            fpm_0.b().a(this.d);
            this.h = new dhm_0(ans_0.D().a());
            fis_1.a().a("resolutionsManager", this.h);
            fis_1.a().a("waitingForKeyTyped", false);
            fis_1.a().a("shortcutOver", (Object)null);
            fis_1.a().a("options.numLOD", 3);
            fis_1.a().a("options.numFightLOD", 3);
            fis_1.a().a("options.graphicalPresets", bWd.values());
            fpm_0.b().a("optionsDialog", cfi_0.a("optionsDialog"), 256L, (short)26000);
            fpm_0.b().a("wakfu.options", cIi.class);
            btn_0.a().a(btr_0.k, "optionsDialog");
            cIi.clearOptionActions();
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.g.clear();
            fpm_0.b().b(this.d);
            cff_0.b().b(this.e);
            fis_1.a().a("waitingForKeyTyped");
            fis_1.a().a("shortcutOver");
            fis_1.a().a("options.numLOD");
            fis_1.a().a("resolutionsManager");
            this.h = null;
            ans_0.D().e().a(this.f);
            fpm_0.b().o("optionsDialog");
            fpm_0.b().e("wakfu.options");
            cIi.setSelectedTabIndex(0);
            cIi.clearOptionActions();
        }
    }

    public TIntObjectIterator<any_1> e() {
        return this.g.iterator();
    }

    void a(any_1 any_12) {
        String string = any_12.g();
        if (string == null) {
            a.error((Object)"On tente de modifier un raccourci sans id !");
            return;
        }
        any_1 any_13 = any_12.o();
        int n = string.hashCode();
        if (!this.g.containsKey(n)) {
            this.g.put(n, (Object)any_13);
        }
    }

    public void a(any_1 any_12, String string) {
        if (string == null) {
            return;
        }
        try {
            aZG.e().b(any_12, string, aZG.f());
        }
        catch (Exception exception) {
            a.error((Object)"Exception during changeBindText", (Throwable)exception);
        }
    }

    private static String i() {
        return aZG.h().getFile();
    }

    public void a(String string, int n, int n2) {
        try {
            aZG.e().a(string, n, null, n2, dbA.i());
        }
        catch (Exception exception) {
            a.error((Object)"Exception during changeShortcut", (Throwable)exception);
        }
    }

    void j() {
        ans_0.D().e().a(this.f);
        fis_1.a().a("waitingForKeyTyped", false);
    }

    public boolean f() {
        azu_0 azu_02 = azu_0.j();
        bmr_1 bmr_12 = azu_02.k();
        if (bmr_12 == null || bmr_12.ak() || bmr_12.ab_()) {
            return false;
        }
        if (cZJ.a.c()) {
            return false;
        }
        if (bmr_12.dm() != null) {
            return false;
        }
        fpm_0.b().g().c();
        cgu_2 cgu_22 = cgu_2.a();
        fjm_1.a().b();
        aUxx.a().s();
        bmr_12.n(false);
        fta_0.getInstance().setVisible(false);
        byte by = ddp.a().d().c();
        long l = System.currentTimeMillis();
        dbe_0 dbe_02 = new dbe_0(this, azu_02, cgu_22, bmr_12, l, by);
        auy_2.a().a(dbe_02);
        aND.f().g();
        return true;
    }

    public static void g() {
        aUf.d();
        ArrayList<Ow> arrayList = ((bvx_0)ans_0.D().h()).k();
        List<Ow> list = ((bvx_0)ans_0.D().h()).l();
        for (aUr aUr2 : aUxx.a().n()) {
            fis_1.a().a((ajf_1)aUr2, "channelsList");
            if (!aUr2.e().i()) {
                aUr2.a(aUr2.e().j(), true);
                fis_1.a().a((ajf_1)aUr2, "currentChannel", "currentChannelName");
            }
            for (Ow ow : list) {
                cFS.toggleFilter(aUr2, aup_0.a(ow), false);
                cFS.toggleFilter(aUr2, aup_0.b(ow), false);
            }
            for (Ow ow : arrayList) {
                cFS.toggleFilter(aUr2, aup_0.a(ow), true);
                cFS.toggleFilter(aUr2, aup_0.b(ow), true);
            }
        }
        aUr aUr3 = aUxx.a().f().h();
        fis_1.a().a((ajf_1)aUr3, "allFiltersList", "channelsList");
        dbA.h();
    }

    public static void h() {
        cow_0 cow_02 = new cow_0();
        cow_02.a(((bvx_0)ans_0.D().h()).k());
        cow_02.a(bah_0.c());
        azu_0.j().K().c(cow_02);
    }
}

