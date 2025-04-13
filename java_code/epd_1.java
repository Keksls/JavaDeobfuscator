/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from ePd
 */
class epd_1
implements TObjectProcedure<epa_1> {
    final /* synthetic */ epc_0 a;

    epd_1(epc_0 epc_02) {
        this.a = epc_02;
    }

    public boolean a(epa_1 epa_12) {
        epa_12.g();
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((epa_1)object);
    }
}

