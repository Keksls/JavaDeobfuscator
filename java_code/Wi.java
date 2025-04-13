/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.List;

class Wi
implements TObjectProcedure<List<vl_0>> {
    final /* synthetic */ vl_0 a;
    final /* synthetic */ Wg b;

    Wi(Wg wg, vl_0 vl_02) {
        this.b = wg;
        this.a = vl_02;
    }

    public boolean a(List<vl_0> list) {
        list.remove(this.a);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((List)object);
    }
}

