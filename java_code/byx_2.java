/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from byx
 */
class byx_2
implements TObjectProcedure<erl_1> {
    final /* synthetic */ byp_2 a;

    byx_2(byp_2 byp_22) {
        this.a = byp_22;
    }

    public boolean a(erl_1 erl_12) {
        this.a.S.add(new byo_2(erl_12));
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((erl_1)object);
    }
}

