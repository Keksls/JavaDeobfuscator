/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from ePh
 */
class eph_1
implements TObjectProcedure<epa_1> {
    final /* synthetic */ rv_0 a;
    final /* synthetic */ epc_0 b;

    eph_1(epc_0 epc_02, rv_0 rv_02) {
        this.b = epc_02;
        this.a = rv_02;
    }

    public boolean a(epa_1 epa_12) {
        epa_12.b(this.a);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((epa_1)object);
    }
}

