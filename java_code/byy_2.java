/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 */
import gnu.trove.procedure.TIntProcedure;
import java.util.ArrayList;

/*
 * Renamed from byy
 */
class byy_2
implements TIntProcedure {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ byp_2 b;

    byy_2(byp_2 byp_22, ArrayList arrayList) {
        this.b = byp_22;
        this.a = arrayList;
    }

    public boolean execute(int n) {
        this.a.add(biz_2.a.b(azu_0.j().k().a_(), n));
        return true;
    }
}

