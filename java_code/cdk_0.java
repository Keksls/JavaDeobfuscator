/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from cDK
 */
class cdk_0
implements TObjectProcedure<bau_2> {
    final /* synthetic */ acv_1 a;

    cdk_0(acv_1 acv_12) {
        this.a = acv_12;
    }

    public boolean a(bau_2 bau_22) {
        this.a.a(bau_22.p(), this.a.g(bau_22.p()) + 1);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((bau_2)object);
    }
}

