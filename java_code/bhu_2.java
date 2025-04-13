/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from bhU
 */
class bhu_2
implements TIntObjectProcedure<bhj_1> {
    final /* synthetic */ bhr_1 a;

    bhu_2(bhr_1 bhr_12) {
        this.a = bhr_12;
    }

    public boolean a(int n, bhj_1 bhj_12) {
        if (bhj_12.l()) {
            ArrayList<bhx_2> arrayList = bhj_12.r();
            int n2 = arrayList.size();
            for (int k = 0; k < n2; ++k) {
                bhx_2 bhx_22 = arrayList.get(k);
                bhx_22.a(true);
            }
        }
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (bhj_1)object);
    }
}

