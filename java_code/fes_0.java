/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TByteIntProcedure
 */
import gnu.trove.procedure.TByteIntProcedure;

/*
 * Renamed from feS
 */
class fes_0
implements TByteIntProcedure {
    private final wx_1 a;

    fes_0(wx_1 wx_12) {
        this.a = wx_12;
    }

    public boolean execute(byte by, int n) {
        wy_1 wy_12 = new wy_1();
        wy_12.a = by;
        wy_12.b = n;
        this.a.a.add(wy_12);
        return true;
    }

    public String toString() {
        return "SetOpinion{m_raw=" + this.a + "}";
    }
}

