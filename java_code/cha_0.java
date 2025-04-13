/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cHA
 */
@fpw_0
public class cha_0 {
    public static final String PACKAGE = "wakfu.map";
    private static final Logger g = Logger.getLogger(cha_0.class);
    private static buo_0 h = null;
    private static cHC i = null;
    private static fww j;
    private static fjg_1 k;
    private static boolean l;
    private static boolean m;
    private static boolean n;
    private static frs_0 o;
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static int f;
    private static String p;
    private static fjg_1 q;
    static long r;
    private static buj_0 s;

    public static void switchToAddNote(fzs fzs2) {
        f = 1;
        fyt_0.a().a(frb_0.s, true);
    }

    public static void switchToAddPositionMarker(fzs fzs2) {
        f = 2;
        fyt_0.a().a(frb_0.s, true);
    }

    public static void radarZoom(fzs fzs2) {
    }

    public static void radarZoomIn(fzs fzs2) {
        dfc.d((short)18892);
    }

    public static void radarZoomOut(fzs fzs2) {
        dfc.d((short)17135);
    }

    public static void mapZoom(fzs fzs2) {
        if (fzs2.f() == frd_0.E) {
            if (((fck_2)fzs2).z() > 0) {
                cha_0.mapZoomOut(fzs2);
            } else {
                cha_0.a();
            }
            cha_0.cancelNoteModification(fzs2);
        }
    }

    public static void mapZoomIn(fzs fzs2) {
        ble_1.E().o();
    }

    private static void a() {
        ble_1.E().J();
        ble_1.E().H();
    }

    public static void mapZoomOut(fzs fzs2) {
        ble_1.E().p();
        ble_1.E().H();
    }

    private static void a(short s2) {
        bLP bLP2 = blf_1.a((long)s2, true);
        if (bLP2 == null) {
            return;
        }
        ble_1.E().a(bLP2);
        ble_1.E().H();
    }

    public static void adminTP(fcg_2 fcg_22) {
        if (!(fcg_22.r() || fcg_22.q() || fcg_22.u() || fcg_22.t() || fcg_22.x() != 1 || !emp_0.b(azu_0.j().k().N_().a(), emq_0.e))) {
            new ayi_0(2, (int)fcg_22.k(), (int)fcg_22.l(), ble_1.E().u()).b();
        }
    }

    public static void onMapClick(fcg_2 fcg_22, fsY fsY2) {
        if (!(fcg_22.r() || fcg_22.q() || fcg_22.u() || fcg_22.t())) {
            switch (f) {
                case 1: {
                    if (fcg_22.x() == 1 && s != null) {
                        buo_0 buo_02 = ble_1.E().z().a((int)fcg_22.k(), (int)fcg_22.l(), s.a());
                        cha_0.setCurrentNote(buo_02);
                        cdw_0.n().c(600119L);
                    }
                    s = null;
                    f = 0;
                    fzd_0.a().d();
                    fyt_0.a().c();
                    break;
                }
                case 2: {
                    if (s != null) {
                        cHC cHC2 = new cHC();
                        String string = bae.h().a("map.worldPositionMarker.destination", (int)fcg_22.k(), (int)fcg_22.l());
                        ble_1.E().a(cHC2.a, 2, fcg_22.k(), fcg_22.l(), 0.0f, ble_1.E().u(), string, (Object)cHC2, bLs.g, anr_0.G, false);
                        cdw_0.n().c(600119L);
                        fzd_0.a().d();
                        fyt_0.a().c();
                    }
                    f = 0;
                    break;
                }
                case 3: {
                    if (fcg_22.x() == 1) {
                        cha_0.a((int)fcg_22.k(), (int)fcg_22.l(), h);
                    } else {
                        cha_0.deleteNote(h);
                    }
                    fzd_0.a().d();
                    fyt_0.a().c();
                    break;
                }
                case 0: {
                    if (fcg_22.m() instanceof buo_0 && fcg_22.x() == 3) {
                        return;
                    }
                    if (fcg_22.m() instanceof afd && fcg_22.x() == 1) {
                        afd afd2 = (afd)fcg_22.m();
                        if (!afd2.a()) {
                            return;
                        }
                        cha_0.a(afd2.m);
                        k = null;
                        cha_0.d();
                        return;
                    }
                    if (fcg_22.x() == 3) {
                        cha_0.mapZoomOut(fcg_22);
                    } else if (fcg_22.x() == 1) {
                        cha_0.a();
                    }
                    cha_0.cancelNoteModification(fcg_22);
                }
            }
        }
    }

    public static void setTypeFilter(fcp_2 fcp_22, Byte by) {
        dfc dfc2 = new dfc();
        dfc2.a_(17212);
        dfc2.a(fcp_22.j());
        dfc2.a(by);
        add_2.b().a(dfc2);
    }

    public static void setCurrentNote(buo_0 buo_02) {
        h = buo_02;
    }

    public static void setCurrentWorldPositionMarker(cHC cHC2) {
        i = cHC2;
        fis_1.a().a("landMark.currentWorldPositionMarker", cHC2);
    }

    public static void onMapMove(fcg_2 fcg_22) {
        ble_1.E().a((int)(fcg_22.k() / 18.0f), (int)(fcg_22.l() / 18.0f));
        fsS fsS2 = (fsS)fcg_22.e();
        int n = fsS2.getWidth();
        int n2 = fsS2.getHeight();
        int n3 = fcg_22.a(fsS2);
        int n4 = fcg_22.b(fsS2);
        o = n3 < n / 2 ? (n4 < n2 / 2 ? frs_0.g : frs_0.a) : (n4 < n2 / 2 ? frs_0.i : frs_0.c);
        fsY fsY2 = (fsY)fcg_22.e();
        j = fsY2.getSelectedMapZone();
        das_0.a().a(fcg_22);
        cha_0.d();
    }

    public static void onMousePress(fzs fzs2) {
        if (k != null && k.o()) {
            l = true;
            cha_0.d();
        }
    }

    public static void onMouseRelease(fzs fzs2) {
        l = false;
        cha_0.d();
    }

    public static void onMouseExit(fzs fzs2) {
        j = null;
        k = null;
        m = false;
        cha_0.d();
    }

    public static void onMouseEnter(fzs fzs2) {
        m = true;
        cha_0.d();
    }

    private static boolean b() {
        return !cha_0.c() && ble_1.E().v();
    }

    private static boolean c() {
        return ble_1.E().m();
    }

    private static void d() {
        boolean bl = cha_0.c();
        boolean bl2 = cha_0.b();
        frb_0 frb_02 = null;
        if (l || f == 1 || f == 3 || f == 4) {
            frb_02 = !bl2 || !m ? frb_0.v : frb_0.u;
        } else if (n || k != null && bl2 && k.o()) {
            frb_02 = frb_0.t;
        } else if (cha_0.a(k)) {
            frb_02 = frb_0.s;
        } else if (j != null) {
            fws fws2 = (fws)j.w();
            if (ble_1.E().e() instanceof bLN && fws2 instanceof bmg_0) {
                bmg_0 bmg_02 = (bmg_0)fws2;
                long l = bmg_02.h().e();
                if (l != (long)ble_1.E().I()) {
                    switch (o) {
                        case a: {
                            frb_02 = frb_0.w;
                            break;
                        }
                        case c: {
                            frb_02 = frb_0.x;
                            break;
                        }
                        case g: {
                            frb_02 = frb_0.y;
                            break;
                        }
                        case i: {
                            frb_02 = frb_0.z;
                        }
                    }
                }
            } else if (fws2.c()) {
                frb_02 = frb_0.f;
            } else if (j.w() instanceof bll_0) {
                bll_0 bll_02 = (bll_0)j.w();
            }
        }
        if (frb_02 != null) {
            fyt_0.a().a(frb_02, true);
        } else {
            fyt_0.a().c();
        }
    }

    private static boolean a(fjg_1 fjg_12) {
        if (fjg_12 == null) {
            return false;
        }
        if (!(fjg_12.j() instanceof afd)) {
            return false;
        }
        return ((afd)fjg_12.j()).a();
    }

    public static void onMapItemClick(fci_2 fci_22) {
        if (cha_0.c() || fci_22.x() != 3) {
            das_0.a().d();
            return;
        }
        fjg_1 fjg_12 = fci_22.o();
        if (fjg_12.j() instanceof exk_2) {
            exk_2 exk_22 = (exk_2)fjg_12.j();
            ble_1.E().c(4, exk_22.aT_());
            return;
        }
        if (!fjg_12.n()) {
            return;
        }
        das_0.a().a(fci_22);
        q = fjg_12;
        q.c(true);
        h = (buo_0)fjg_12.j();
        p = fis_1.a().b("mapPopupDescription");
        das_0.a().a(true);
    }

    public static void onMapItemOver(fci_2 fci_22) {
        if (!das_0.a().c()) {
            das_0.a().a(fci_22);
        }
        if (cha_0.c() && !cha_0.a(fci_22.o())) {
            return;
        }
        k = fci_22.o();
        cha_0.d();
    }

    public static void onMapItemOut(fci_2 fci_22) {
        if (!das_0.a().c()) {
            das_0.a().d();
        }
        k = null;
        cha_0.d();
    }

    public static void onKeyPress(fcd_2 fcd_22) {
        if (fcd_22.k() == 127) {
            cha_0.deleteNote(fcd_22);
            cha_0.deleteWorldPositionMarker(fcd_22);
        }
    }

    public static void onTextEditorChange(fcd_2 fcd_22) {
        fug_0 fug_02 = (fug_0)fcd_22.e();
        p = fug_02.getText();
    }

    public static void onTextEditorKeyPress(fcd_2 fcd_22) {
        if (fcd_22.k() == 10) {
            cha_0.applyNote(fcd_22);
        }
    }

    public static void applyNote(fzs fzs2) {
        if (h == null) {
            return;
        }
        String string = cby_2.b(p);
        if (string.length() == 0 && p.length() != 0) {
            fpm_0.b().a(bae.h().a("error.censoredSentence", new Object[0]), cfn_0.a(1), 1027L, 102, 1);
            cha_0.setCurrentNote(null);
            cha_0.e();
            return;
        }
        h.a(string);
        bup_0.a().c();
        ble_1.E().z().c(h);
        cha_0.setCurrentNote(null);
        cha_0.e();
    }

    public static boolean deleteNote(fzs fzs2) {
        if (h == null) {
            return true;
        }
        cha_0.deleteNote(h);
        cha_0.e();
        return true;
    }

    private static void e() {
        if (q != null) {
            q.c(false);
            q = null;
        }
        das_0.a().a(false);
        das_0.a().d();
    }

    public static boolean cancelNoteModification(fzs fzs2) {
        cha_0.e();
        return true;
    }

    public static void deleteNote(buo_0 buo_02) {
        ble_1.E().z().b(buo_02);
        cha_0.setCurrentNote(null);
        f = 0;
    }

    public static void deleteWorldPositionMarker(fzs fzs2) {
        if (i != null) {
            ble_1.E().c(2, cha_0.i.a);
            cha_0.setCurrentWorldPositionMarker(null);
        }
    }

    public static void setDisplayTerritories(fcp_2 fcp_22) {
        ((bvx_0)ans_0.D().h()).a((agp_0)bWe.T, fcp_22.j());
        ble_1.E().a(fcp_22.j());
    }

    public static void openNoteContainer(fzs fzs2, fso fso2) {
        fso2.setVisible(true);
        cha_0.reset();
    }

    private static void a(int n, int n2, buo_0 buo_02) {
        buo_02.b(n);
        buo_02.c(n2);
        ble_1.E().z().a(buo_02);
        h = null;
        f = 0;
    }

    public static void onMapDrag(fcp_1 fcp_12) {
        fjg_1 fjg_12 = (fjg_1)fcp_12.l();
        if (fjg_12.j() instanceof buo_0) {
            h = (buo_0)fjg_12.j();
            ble_1.E().z().a(h, true);
            f = 3;
        } else {
            f = 4;
            ble_1.E().G();
        }
    }

    public static void onLandMarkMousePress(fzs fzs2) {
        if (n) {
            l = true;
            cha_0.d();
        }
    }

    public static void onLandMarkMouseRelease(fzs fzs2) {
        l = false;
        cha_0.d();
    }

    public static void onLandMarkDrag(fcp_1 fcp_12) {
        s = (buj_0)fcp_12.l();
        f = 1;
        cha_0.d();
    }

    public static void onLandMarkDropOut(fzs fzs2) {
        f = 0;
        l = false;
        cha_0.d();
    }

    public static void onLandMarkItemOver(fcb_2 fcb_22) {
        Object object = fcb_22.j();
        if (object != null) {
            n = true;
            cha_0.d();
        }
    }

    public static void onCompassMousePress(fzs fzs2) {
        if (n) {
            l = true;
            cha_0.d();
        }
    }

    public static void onCompassMouseRelease(fzs fzs2) {
        l = false;
        cha_0.d();
    }

    public static void onCompassItemOut(fcb_2 fcb_22) {
        n = false;
        cha_0.d();
    }

    public static void onCompassDrag(fcp_1 fcp_12) {
        s = (buj_0)fcp_12.l();
        f = 2;
        cha_0.d();
    }

    public static void onCompassDropOut(fzs fzs2) {
        f = 0;
        l = false;
        cha_0.d();
    }

    public static void onCompassItemOver(fcb_2 fcb_22) {
        Object object = fcb_22.j();
        if (object != null) {
            n = true;
            cha_0.d();
        }
    }

    public static void onLandMarkItemOut(fcb_2 fcb_22) {
        n = false;
        cha_0.d();
    }

    public static void onDropOut(fcx_1 fcx_12) {
        fjg_1 fjg_12 = (fjg_1)fcx_12.l();
        if (fjg_12.j() instanceof buo_0) {
            cha_0.deleteNote((buo_0)fjg_12.j());
        }
        f = 0;
        l = false;
        cha_0.d();
    }

    public static void onDrop(fcv_2 fcv_22) {
        fsS fsS2 = (fsS)fcv_22.k();
        afe_1 afe_12 = fsS2.getIsoMousePosition();
        switch (f) {
            case 1: {
                buo_0 buo_02 = ble_1.E().z().a(afe_12.a(), afe_12.b(), s.a());
                cha_0.setCurrentNote(buo_02);
                cha_0.a();
                break;
            }
            case 3: {
                cha_0.a(afe_12.a(), afe_12.b(), h);
                break;
            }
            case 2: {
                ble_1.E().a(afe_12.a(), afe_12.b(), 0.0f, ble_1.E().u(), null, false);
                break;
            }
            case 4: {
                ble_1.E().a(afe_12.a(), afe_12.b(), 0.0f, ble_1.E().u(), null, false);
            }
        }
        cdw_0.n().c(600119L);
        f = 0;
    }

    public static boolean mapDropValidate(fsv_0 fsv_02, Object object, fsv_0 fsv_03, Object object2, Object object3) {
        return cha_0.b();
    }

    public static void reset() {
        f = 0;
        fzd_0.a().d();
        if (q != null) {
            q.c(false);
        }
        k = null;
        j = null;
        m = false;
        l = false;
        n = false;
        fyt_0.a().c();
    }

    static {
        f = 0;
        r = 0L;
        s = null;
    }
}

