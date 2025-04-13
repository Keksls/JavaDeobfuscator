/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;

/*
 * Renamed from bdw
 */
class bdw_1
implements asb_2<aQp> {
    final /* synthetic */ bdv_2 a;

    bdw_1(bdv_2 bdv_22) {
        this.a = bdv_22;
    }

    public void a(aQp aQp2) {
        int n = aQp2.c();
        int[] nArray = aQp2.d();
        int[] nArray2 = aQp2.e();
        ezw_2 ezw_22 = new ezw_2(n, new TIntArrayList(nArray));
        for (int k = 0; k < nArray2.length; ++k) {
            int n2 = nArray2[k];
            Object t = ezh_2.a.a(n2);
            ezw_22.a((ezv_2)t);
        }
        ezi_2.a.a(ezw_22);
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((aQp)asu_22);
    }
}

