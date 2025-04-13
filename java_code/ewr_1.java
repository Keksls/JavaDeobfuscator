/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eWr
 */
class ewr_1
implements TObjectProcedure<ewz_2> {
    private final yd_1 a;

    ewr_1(yd_1 yd_12) {
        this.a = yd_12;
    }

    public boolean a(ewz_2 ewz_22) {
        ye_1 ye_12 = ewq_2.a(ewz_22);
        this.a.a.add(ye_12);
        return true;
    }

    public String toString() {
        return "BuildRawProcedure{m_raw=" + this.a + "}";
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((ewz_2)object);
    }
}

