/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 */
import gnu.trove.procedure.TIntProcedure;

/*
 * Renamed from ezE
 */
class eze_2
implements TIntProcedure {
    final /* synthetic */ ezb_2 a;
    final /* synthetic */ ezd_2 b;

    eze_2(ezd_2 ezd_22, ezb_2 ezb_22) {
        this.b = ezd_22;
        this.a = ezb_22;
    }

    public boolean execute(int n) {
        this.b.c.put(n, this.a.a());
        return true;
    }
}

