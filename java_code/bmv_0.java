/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;

/*
 * Renamed from bMv
 */
class bmv_0
implements TIntObjectProcedure<aeo_2> {
    final /* synthetic */ xr_1 a;

    bmv_0(xr_1 xr_12) {
        this.a = xr_12;
    }

    public boolean a(int n, aeo_2 aeo_22) {
        xh_1 xh_12 = new xh_1();
        xh_12.a.a = n;
        xh_12.a.b = aeo_22.a();
        xh_12.a.c = aeo_22.b();
        this.a.m.a.add(xh_12);
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (aeo_2)object);
    }
}

