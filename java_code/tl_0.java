/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.list.array.TLongArrayList;

/*
 * Renamed from Tl
 */
final class tl_0 {
    private final acp_2<TLongArrayList> a = new acp_2(2);

    tl_0() {
    }

    TLongArrayList a(byte by) {
        TLongArrayList tLongArrayList = this.a.e(by);
        if (tLongArrayList == null) {
            tLongArrayList = new TLongArrayList();
            this.a.a(by, tLongArrayList);
        }
        return tLongArrayList;
    }

    void a(byte by, int n, int n2) {
        TLongArrayList tLongArrayList = this.a(by);
        tLongArrayList.add(Hw.c(n, n2));
    }
}

