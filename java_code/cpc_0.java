/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntIntProcedure
 */
import gnu.trove.procedure.TIntIntProcedure;

/*
 * Renamed from cpC
 */
class cpc_0
implements TIntIntProcedure {
    final /* synthetic */ cpb_0 a;

    cpc_0(cpb_0 cpb_02) {
        this.a = cpb_02;
    }

    public boolean execute(int n, int n2) {
        if (this.a.c.put(n, n2) != 0) {
            throw new UnsupportedOperationException("Impossible d'ajouter plusieurs fois un m\u00eame item");
        }
        return true;
    }
}

