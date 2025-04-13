/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.commons.lang3.ArrayUtils
 */
import gnu.trove.procedure.TIntProcedure;
import gnu.trove.procedure.TObjectProcedure;
import org.apache.commons.lang3.ArrayUtils;

/*
 * Renamed from fsO
 */
class fso_0
implements TIntProcedure {
    final /* synthetic */ int[] a;
    final /* synthetic */ TObjectProcedure b;
    final /* synthetic */ fsn_0 c;

    fso_0(fsn_0 fsn_02, int[] nArray, TObjectProcedure tObjectProcedure) {
        this.c = fsn_02;
        this.a = nArray;
        this.b = tObjectProcedure;
    }

    public boolean execute(int n) {
        if (!ArrayUtils.contains((int[])this.a, (int)n)) {
            this.b.execute((Object)this.c.getContainerFromLayer(n));
        }
        return true;
    }
}

