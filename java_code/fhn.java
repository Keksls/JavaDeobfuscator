/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 */
import gnu.trove.procedure.TIntProcedure;

class fhn
implements TIntProcedure {
    final /* synthetic */ oa_1 a;

    fhn(oa_1 oa_12) {
        this.a = oa_12;
    }

    public boolean execute(int n) {
        this.a.b(n);
        return true;
    }
}

