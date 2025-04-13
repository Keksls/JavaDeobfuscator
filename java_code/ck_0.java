/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.map.custom_hash.TObjectIntCustomHashMap
 *  gnu.trove.map.hash.TObjectIntHashMap
 */
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.custom_hash.TObjectIntCustomHashMap;
import gnu.trove.map.hash.TObjectIntHashMap;

/*
 * Renamed from CK
 */
class ck_0 {
    final short a;
    final String b;
    final int c;
    final int d;
    final byte e;
    short[][] f;
    short[][] g;
    TIntArrayList[] h;
    final TObjectIntHashMap<TIntArrayList> i = new TObjectIntHashMap();
    final TObjectIntCustomHashMap<short[]> j = new TObjectIntCustomHashMap(cj_0.c);

    protected ck_0(di_0 di_02) {
        this.a = di_02.a();
        this.e = di_02.e();
        this.b = di_02.b();
        this.c = di_02.c();
        this.d = di_02.d();
    }
}

