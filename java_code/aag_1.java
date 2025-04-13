/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 */
import gnu.trove.procedure.TIntProcedure;

/*
 * Renamed from aAG
 */
class aag_1
implements TIntProcedure {
    final /* synthetic */ aad_1 a;

    aag_1(aad_1 aad_12) {
        this.a = aad_12;
    }

    public boolean execute(int n) {
        this.a.f(this.a.i.get(n));
        return true;
    }
}

