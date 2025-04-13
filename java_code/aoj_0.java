/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntFloatProcedure
 */
import gnu.trove.procedure.TIntFloatProcedure;

/*
 * Renamed from aOJ
 */
class aoj_0
implements TIntFloatProcedure {
    final /* synthetic */ aoi_0 a;

    aoj_0(aoi_0 aoi_02) {
        this.a = aoi_02;
    }

    public boolean execute(int n, float f2) {
        if (f2 < 0.9019608f) {
            this.a.a.put(n, 0.9019608f);
        }
        return true;
    }
}

