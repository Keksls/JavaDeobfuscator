/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from bfK
 */
class bfk_1
implements asb_2<aTD> {
    final /* synthetic */ TIntObjectHashMap a;

    bfk_1(TIntObjectHashMap tIntObjectHashMap) {
        this.a = tIntObjectHashMap;
    }

    public void a(aTD aTD2) {
        bpe_0 bpe_02 = new bpe_0();
        bfj_1.a(bpe_02, aTD2);
        this.a.put((int)bpe_02.p(), (Object)bpe_02);
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((aTD)asu_22);
    }
}

