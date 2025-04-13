/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongProcedure
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TLongProcedure;
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from aig
 */
class aig_0
implements TLongProcedure {
    final /* synthetic */ TObjectProcedure a;
    final /* synthetic */ aif_0 b;

    aig_0(aif_0 aif_02, TObjectProcedure tObjectProcedure) {
        this.b = aif_02;
        this.a = tObjectProcedure;
    }

    public boolean execute(long l) {
        return this.a.execute((Object)aii_0.a(l));
    }
}

