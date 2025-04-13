/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cGE
 */
@fpw_0
public class cge_0 {
    public static final String PACKAGE = "wakfu.dragoMap";
    private static final Logger f = Logger.getLogger(cge_0.class);
    private static buo_0 g = null;
    private static cgf_0 h = null;
    private static fww i;
    private static fjg_1 j;
    private static boolean k;
    private static boolean l;
    private static boolean m;
    private static frs_0 n;
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static int e;
    private static String o;
    private static fjg_1 p;
    static long q;
    private static buj_0 r;

    public static void switchToAddNote(fzs fzs2) {
        e = 1;
        fyt_0.a().a(frb_0.s, true);
    }

    public static void switchToAddPositionMarker(fzs fzs2) {
        e = 2;
        fyt_0.a().a(frb_0.s, true);
    }

    public static void mapZoomIn(fzs fzs2) {
        ble_1.E().o();
    }

    public static void mapZoomOut(fzs fzs2) {
        if (ble_1.E().e() instanceof blb_1) {
            return;
        }
        ble_1.E().p();
    }

    public static void adminTP(fcg_2 fcg_22) {
        if (!(fcg_22.r() || fcg_22.q() || fcg_22.t() || fcg_22.u() || !emp_0.b(azu_0.j().k().N_().a(), emq_0.e))) {
            new ayi_0(0, (int)fcg_22.k(), (int)fcg_22.l()).b();
        }
    }

    public static void onMapClick(fcg_2 fcg_22, fsY fsY2) {
        if (!(fcg_22.r() || fcg_22.q() || fcg_22.t() || fcg_22.u())) {
            switch (e) {
                case 1: {
                    if (fcg_22.x() == 1 && r != null) {
                        buo_0 buo_02 = ble_1.E().z().a((int)fcg_22.k(), (int)fcg_22.l(), r.a());
                        cge_0.setCurrentNote(buo_02);
                        cdw_0.n().c(600119L);
                    }
                    r = null;
                    e = 0;
                    fzd_0.a().d();
                    fyt_0.a().c();
                    break;
                }
                case 2: {
                    if (r != null) {
                        cgf_0 cgf_02 = new cgf_0();
                        String string = bae.h().a("map.worldPositionMarker.destination", (int)fcg_22.k(), (int)fcg_22.l());
                        ble_1.E().a(cgf_02.a, 2, fcg_22.k(), fcg_22.l(), 0.0f, ble_1.E().u(), string, (Object)cgf_02, bLs.g, anr_0.G, false);
                        cdw_0.n().c(600119L);
                        fzd_0.a().d();
                        fyt_0.a().c();
                    }
                    e = 0;
                    break;
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
        g = buo_02;
        fis_1.a().a("landMark.currentNote", buo_02);
        fis_1.a().a("landMark.currentNote.text", (Object)(buo_02 != null ? buo_02.e() : null));
    }

    public static void setCurrentWorldPositionMarker(cgf_0 cgf_02) {
        h = cgf_02;
        fis_1.a().a("landMark.currentWorldPositionMarker", cgf_02);
    }

    public static void onMapMove(fcg_2 fcg_22) {
        ble_1.E().a((int)(fcg_22.k() / 18.0f), (int)(fcg_22.l() / 18.0f));
        fsS fsS2 = (fsS)fcg_22.e();
        int n = fsS2.getWidth();
        int n2 = fsS2.getHeight();
        int n3 = fcg_22.a(fsS2);
        int n4 = fcg_22.b(fsS2);
        cge_0.n = n3 < n / 2 ? (n4 < n2 / 2 ? frs_0.g : frs_0.a) : (n4 < n2 / 2 ? frs_0.i : frs_0.c);
        fsY fsY2 = (fsY)fcg_22.e();
        i = fsY2.getSelectedMapZone();
        cge_0.a();
    }

    public static void onMousePress(fzs fzs2) {
        if (j != null && j.o()) {
            k = true;
            cge_0.a();
        }
    }

    public static void onMouseRelease(fzs fzs2) {
        k = false;
        cge_0.a();
    }

    public static void onMouseExit(fzs fzs2) {
        i = null;
        j = null;
        l = false;
        cge_0.a();
    }

    public static void onMouseEnter(fzs fzs2) {
        l = true;
        cge_0.a();
    }

    private static void a() {
        fyt_0.a().c();
    }

    public static void onMapItemClick(fci_2 fci_22) {
        cXX.a().c();
        fjg_1 fjg_12 = fci_22.o();
        if (!(fjg_12.j() instanceof afc)) {
            return;
        }
        afc afc2 = (afc)fjg_12.j();
        if (afc2.b == 47) {
            dfc dfc2 = new dfc();
            dfc2.a_(17770);
            dfc2.a(afc2.a);
            add_2.b().a(dfc2);
        }
    }

    public static void onMapItemOver(fci_2 fci_22) {
        cXX.a().a(fci_22);
        if (ble_1.E().e() instanceof blb_1) {
            return;
        }
        j = fci_22.o();
        cge_0.a();
    }

    public static void onMapItemOut(fci_2 fci_22) {
        cXX.a().c();
        j = null;
        cge_0.a();
    }

    public static void setDisplayTerritories(fcp_2 fcp_22) {
        ((bvx_0)ans_0.D().h()).a((agp_0)bWe.T, fcp_22.j());
        ble_1.E().a(fcp_22.j());
    }

    public static void openNoteContainer(fzs fzs2, fso fso2) {
        fso2.setVisible(true);
        cge_0.reset();
    }

    private static void a(int n, int n2, buo_0 buo_02) {
        buo_02.b(n);
        buo_02.c(n2);
        ble_1.E().z().a(buo_02);
        g = null;
        e = 0;
    }

    public static void onLandMarkItemOver(fcb_2 fcb_22) {
        Object object = fcb_22.j();
        if (object != null) {
            m = true;
            cge_0.a();
        }
    }

    public static void onLandMarkItemOut(fcb_2 fcb_22) {
        m = false;
        cge_0.a();
    }

    public static void reset() {
        e = 0;
        fzd_0.a().d();
        if (p != null) {
            p.c(false);
        }
        j = null;
        i = null;
        l = false;
        k = false;
        m = false;
        fyt_0.a().c();
    }

    static {
        e = 0;
        q = 0L;
        r = null;
    }
}

