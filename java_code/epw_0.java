/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from ePw
 */
class epw_0
implements TObjectProcedure<epa_1> {
    final /* synthetic */ rv_0 a;
    final /* synthetic */ ept_0 b;

    epw_0(ept_0 ept_02, rv_0 rv_02) {
        this.b = ept_02;
        this.a = rv_02;
    }

    public boolean a(epa_1 epa_12) {
        epa_12.a(this.a);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((epa_1)object);
    }
}

