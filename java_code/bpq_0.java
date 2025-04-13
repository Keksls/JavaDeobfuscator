/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from bPq
 */
class bpq_0
implements asb_2<aTz> {
    final /* synthetic */ TIntObjectHashMap a;
    final /* synthetic */ bpp_0 b;

    bpq_0(bpp_0 bpp_02, TIntObjectHashMap tIntObjectHashMap) {
        this.b = bpp_02;
        this.a = tIntObjectHashMap;
    }

    public void a(aTz aTz2) {
        try {
            bph_0 bph_02 = new bph_0(bpp_0.b(aTz2));
            this.a.put(bph_02.i(), (Object)bph_02);
        }
        catch (Exception exception) {
            bpp_0.c().error((Object)("Exception levee sur " + aTz2.c()), (Throwable)exception);
        }
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((aTz)asu_22);
    }
}

