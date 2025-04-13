/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TByteLongProcedure
 */
import gnu.trove.procedure.TByteLongProcedure;

/*
 * Renamed from feK
 */
class fek_0
implements TByteLongProcedure {
    private final wp_2 a;

    fek_0(wp_2 wp_22) {
        this.a = wp_22;
    }

    public boolean execute(byte by, long l) {
        wq_1 wq_12 = new wq_1();
        wq_12.a = by;
        wq_12.b = Hw.e(l);
        this.a.b.add(wq_12);
        return true;
    }

    public String toString() {
        return "SetProfit{m_raw=" + this.a + "}";
    }
}

