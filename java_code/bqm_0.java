/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bQM
 */
class bqm_0
implements TObjectProcedure<fjx> {
    final /* synthetic */ long a;
    final /* synthetic */ bmr_1 b;
    final /* synthetic */ bFN c;
    final /* synthetic */ bql_0 d;

    bqm_0(bql_0 bql_02, long l, bmr_1 bmr_12, bFN bFN2) {
        this.d = bql_02;
        this.a = l;
        this.b = bmr_12;
        this.c = bFN2;
    }

    public boolean a(fjx fjx2) {
        this.d.a(fjx2, this.a, this.b, this.c);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((fjx)object);
    }
}

