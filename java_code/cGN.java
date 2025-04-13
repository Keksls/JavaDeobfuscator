/*
 * Decompiled with CFR 0.152.
 */
@fpw_0
public class cGN {
    public static final String PACKAGE = "wakfu.equipableDummy";
    private static long a = -1L;

    public static void equipItem(exk_2 exk_22) {
        dgL dgL2 = new dgL();
        dgL2.a(exk_22);
        dgL2.a_(19779);
        add_2.b().a(dgL2);
    }

    public static void unequipItem(int n) {
        dgL dgL2 = new dgL();
        dgL2.b(n);
        dgL2.a_(18870);
        add_2.b().a(dgL2);
    }

    public static void unequip(fcb_2 fcb_22) {
        exk_2 exk_22 = (exk_2)fcb_22.j();
        cGN.unequipItem(exk_22.aT_());
    }

    public static void dropItem(fcv_2 fcv_22) {
        if (!(fcv_22.n() instanceof exk_2)) {
            return;
        }
        exk_2 exk_22 = (exk_2)fcv_22.n();
        if (azu_0.j().k().da().a((ts_0)exk_22) == null) {
            return;
        }
        cgo_0.onDropItem();
        cGN.equipItem(exk_22);
    }

    public static void dragItem(fcp_1 fcp_12) {
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

