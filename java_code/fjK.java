/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.procedure.TIntObjectProcedure;

class fjK
implements TIntObjectProcedure<aeo_2> {
    final /* synthetic */ TIntIntHashMap a;
    final /* synthetic */ fjJ b;

    fjK(fjJ fjJ2, TIntIntHashMap tIntIntHashMap) {
        this.b = fjJ2;
        this.a = tIntIntHashMap;
    }

    public boolean a(int n, aeo_2 aeo_22) {
        int n2 = this.a.get(n);
        if (aeo_22.c(n2)) {
            fjJ.c.a(1);
        }
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (aeo_2)object);
    }
}

