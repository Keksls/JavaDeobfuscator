/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from ePe
 */
class epe_1
implements TObjectProcedure<epa_1> {
    final /* synthetic */ epc_0 a;
    final /* synthetic */ epc_0 b;

    epe_1(epc_0 epc_02, epc_0 epc_03) {
        this.b = epc_02;
        this.a = epc_03;
    }

    public boolean a(epa_1 epa_12) {
        epa_1 epa_13 = this.a.e(epa_12.t());
        epa_12.b(epa_13);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((epa_1)object);
    }
}

