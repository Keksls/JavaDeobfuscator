/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;

/*
 * Renamed from ePv
 */
class epv_0
implements TIntObjectProcedure<epa_1> {
    final /* synthetic */ tw_2 a;
    final /* synthetic */ ept_0 b;

    epv_0(ept_0 ept_02, tw_2 tw_22) {
        this.b = ept_02;
        this.a = tw_22;
    }

    public boolean a(int n, epa_1 epa_12) {
        tx_1 tx_12 = new tx_1();
        tx_12.a = (byte)n;
        tx_12.b = epa_12.c;
        tx_12.c = epa_12.e;
        tx_12.d = epa_12.d;
        tx_12.e = epa_12.h;
        this.a.a.add(tx_12);
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (epa_1)object);
    }
}

