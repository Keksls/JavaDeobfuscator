/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntShortProcedure
 */
import gnu.trove.procedure.TIntShortProcedure;

/*
 * Renamed from bvN
 */
class bvn_1
implements TIntShortProcedure {
    final /* synthetic */ bmr_1 a;
    final /* synthetic */ bvk_1 b;

    bvn_1(bvk_1 bvk_12, bmr_1 bmr_12) {
        this.b = bvk_12;
        this.a = bmr_12;
    }

    public boolean execute(int n, short s2) {
        if (this.a.da().h(n) >= s2) {
            return true;
        }
        ewx_2 ewx_22 = (ewx_2)this.a.a(ewl_1.a);
        ewz_2 ewz_22 = ewx_22.a(n);
        return ewz_22 != null && ewz_22.b() >= s2;
    }
}

