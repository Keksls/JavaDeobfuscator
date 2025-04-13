/*
 * Decompiled with CFR 0.152.
 */
@fpw_0
public class cFI {
    public static final String PACKAGE = "wakfu.bookcase";
    private static long a = -1L;

    public static void swapPosition(byte by, byte by2) {
        dfc dfc2 = new dfc();
        dfc2.a_(18250);
        dfc2.a(by);
        dfc2.a((short)by2);
        add_2.b().a(dfc2);
    }

    public static void displayBook(fcb_2 fcb_22) {
        exk_2 exk_22 = (exk_2)fcb_22.j();
        dgL dgL2 = new dgL();
        dgL2.a(exk_22);
        dgL2.a_(17057);
        add_2.b().a(dgL2);
    }

    public static void addBook(exk_2 exk_22, short s2) {
        dgL dgL2 = new dgL();
        dgL2.a(exk_22);
        dgL2.a(s2);
        dgL2.a_(17894);
        add_2.b().a(dgL2);
    }

    public static void removeBook(short s2) {
        dgL dgL2 = new dgL();
        dgL2.a(s2);
        dgL2.a_(18730);
        add_2.b().a(dgL2);
    }

    public static void removeBook(fcb_2 fcb_22) {
        ftj_0 ftj_02 = (ftj_0)fcb_22.e();
        short s2 = (short)ftj_02.getCollection().getTableIndex(ftj_02);
        cFI.removeBook(s2);
    }

    public static void dropItem(fcv_2 fcv_22, bkO bkO2) {
        if (!(fcv_22.n() instanceof exk_2)) {
            return;
        }
        exk_2 exk_22 = (exk_2)fcv_22.n();
        if (azu_0.j().k().da().a((ts_0)exk_22) != null) {
            cgo_0.onDropItem();
            ftj_0 ftj_02 = fcv_22.k().getRenderableParent();
            short s2 = (short)ftj_02.getCollection().getTableIndex(ftj_02);
            cFI.addBook(exk_22, s2);
        } else if (bkO2.a().Z().g(exk_22)) {
            ftj_0 ftj_03 = fcv_22.k().getRenderableParent();
            byte by = (byte)ftj_03.getCollection().getTableIndex(ftj_03);
            ftj_0 ftj_04 = fcv_22.j().getRenderableParent();
            byte by2 = (byte)ftj_04.getCollection().getTableIndex(ftj_04);
            cFI.swapPosition(by, by2);
        }
    }

    public static void dragItem(fcp_1 fcp_12, bkO bkO2) {
        exk_2 exk_22 = (exk_2)fcp_12.l();
        a = exk_22.a();
    }

    public static long getDraggedItemId() {
        return a;
    }

    public static void setDraggedItemId(long l) {
        a = l;
    }
}

