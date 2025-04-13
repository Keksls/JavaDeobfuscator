/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;

/*
 * Renamed from bgb
 */
class bgb_2
implements asb_2<aTV> {
    final /* synthetic */ bga_2 a;

    bgb_2(bga_2 bga_22) {
        this.a = bga_22;
    }

    public void a(aTV aTV2) {
        int n = aTV2.c();
        atw_0[] atw_0Array = aTV2.d();
        TIntArrayList tIntArrayList = new TIntArrayList();
        for (atw_0 atw_02 : atw_0Array) {
            tIntArrayList.add(atw_02.a());
        }
        brh_2.a.a(n, tIntArrayList.toArray());
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((aTV)asu_22);
    }
}

