/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TByteLongProcedure
 */
import gnu.trove.procedure.TByteLongProcedure;

/*
 * Renamed from feL
 */
class fel_0
implements TByteLongProcedure {
    private final wp_2 a;

    fel_0(wp_2 wp_22) {
        this.a = wp_22;
    }

    public boolean execute(byte by, long l) {
        wr_1 wr_12 = new wr_1();
        wr_12.a = by;
        wr_12.b = Hw.e(l);
        this.a.a.add(wr_12);
        return true;
    }

    public String toString() {
        return "SetSpending{m_raw=" + this.a + "}";
    }
}

