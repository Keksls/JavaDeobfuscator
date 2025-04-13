/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from ePu
 */
class epu_0
implements TObjectProcedure<epa_1> {
    final /* synthetic */ ept_0 a;

    epu_0(ept_0 ept_02) {
        this.a = ept_02;
    }

    public boolean a(epa_1 epa_12) {
        this.a.e(epa_12.t()).b(epa_12);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((epa_1)object);
    }
}

