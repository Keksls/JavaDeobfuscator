/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from byv
 */
class byv_2
implements TObjectProcedure<ern_1> {
    final /* synthetic */ byp_2 a;

    byv_2(byp_2 byp_22) {
        this.a = byp_22;
    }

    public boolean a(ern_1 ern_12) {
        this.a.T.add(new byj_2(ern_12));
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((ern_1)object);
    }
}

