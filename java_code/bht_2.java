/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from bhT
 */
class bht_2
implements TIntObjectProcedure<bhj_1> {
    final /* synthetic */ bhr_1 a;

    bht_2(bhr_1 bhr_12) {
        this.a = bhr_12;
    }

    public boolean a(int n, bhj_1 bhj_12) {
        Object object;
        bhj_1 bhj_13 = new bhj_1(bhj_12);
        this.a.f.put(n, (Object)bhj_13);
        ArrayList<bhx_2> arrayList = bhj_12.r();
        int n2 = arrayList.size();
        for (int k = 0; k < n2; ++k) {
            bhx_2 bhx_22 = arrayList.get(k);
            object = bhx_22.g();
            bic_1[] bic_1Array = new bic_1[object != null ? ((bic_1[])object).length : 0];
            if (object != null) {
                for (int i2 = 0; i2 < ((bic_1[])object).length; ++i2) {
                    bic_1 bic_12 = object[i2];
                    bic_1Array[i2] = new bic_1(bic_12);
                    TIntArrayList tIntArrayList = (TIntArrayList)this.a.h.get(bic_12.a());
                    if (tIntArrayList == null) {
                        tIntArrayList = new TIntArrayList();
                        this.a.h.put(bic_12.a(), (Object)tIntArrayList);
                    }
                    tIntArrayList.add(bhx_22.c());
                }
            }
            bhx_2 bhx_23 = new bhx_2(bhx_22, bhj_13, (bic_1[])(object != null ? bic_1Array : null));
            bhx_23.a(bhx_22.k());
            bhx_23.b(bhx_22.l());
            bhj_13.a(bhx_23);
            this.a.g.put(bhx_23.c(), (Object)bhx_23);
        }
        ArrayList<bib_2> arrayList2 = bhj_12.s();
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int n3 = arrayList2.size();
            for (n2 = 0; n2 < n3; ++n2) {
                object = arrayList2.get(n2);
                bhj_13.a((bib_2)object);
            }
        }
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (bhj_1)object);
    }
}

