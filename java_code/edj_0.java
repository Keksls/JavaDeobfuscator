/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 */
import gnu.trove.procedure.TIntProcedure;

/*
 * Renamed from eDj
 */
class edj_0
implements TIntProcedure {
    final /* synthetic */ edr_0 a;

    edj_0(edr_0 edr_02) {
        this.a = edr_02;
    }

    public boolean execute(int n) {
        if (efe_0.b.contains(n)) {
            return true;
        }
        eDi.aO.put(n, (Object)this.a);
        return true;
    }
}

