/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.procedure.TIntObjectProcedure;

/*
 * Renamed from fgs
 */
class fgs_0
implements TIntObjectProcedure<aeo_2> {
    final /* synthetic */ TIntIntHashMap a;
    final /* synthetic */ fgr_0 b;

    fgs_0(fgr_0 fgr_02, TIntIntHashMap tIntIntHashMap) {
        this.b = fgr_02;
        this.a = tIntIntHashMap;
    }

    public boolean a(int n, aeo_2 aeo_22) {
        int n2 = this.a.get(n);
        if (aeo_22.c(n2)) {
            fgr_0.h.a(1);
        }
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (aeo_2)object);
    }
}

