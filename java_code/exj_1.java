/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eXj
 */
class exj_1
implements TObjectProcedure<exg_2> {
    final /* synthetic */ tw_0 a;
    final /* synthetic */ exh_1 b;

    exj_1(exh_1 exh_12, tw_0 tw_02) {
        this.b = exh_12;
        this.a = tw_02;
    }

    public boolean a(exg_2 exg_22) {
        exg_22.a(this.a);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((exg_2)object);
    }
}

