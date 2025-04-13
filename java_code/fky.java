/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntIntProcedure
 */
import gnu.trove.procedure.TIntIntProcedure;

class fky
implements TIntIntProcedure {
    final /* synthetic */ esy_2 a;
    final /* synthetic */ fkx b;

    fky(fkx fkx2, esy_2 esy_22) {
        this.b = fkx2;
        this.a = esy_22;
    }

    public boolean execute(int n, int n2) {
        this.b.a(new fkP(new fkr_0(this.a), n2, n));
        return true;
    }
}

