/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;

/*
 * Renamed from blJ
 */
public class blj_2 {
    public static final blj_2 a = new blj_2();
    private final TIntObjectHashMap<bll_2> b = new TIntObjectHashMap();
    private final TLongObjectHashMap<blb_2> c = new TLongObjectHashMap();
    private final TIntObjectHashMap<blf_2> d = new TIntObjectHashMap();

    private blj_2() {
    }

    public blf_2 a(int n, blg_2 blg_22) {
        blf_2 blf_22 = (blf_2)this.d.get(n);
        if (blf_22 != null) {
            return blf_22;
        }
        blf_2 blf_23 = new blf_2(blg_22);
        this.d.put(blf_23.h(), (Object)blf_23);
        return blf_23;
    }

    public bll_2 a(int n) {
        bll_2 bll_22 = (bll_2)this.b.get(n);
        if (bll_22 != null) {
            return bll_22;
        }
        bll_22 = new bli_2(n);
        this.b.put(n, (Object)bll_22);
        return bll_22;
    }

    public blb_2 a(int n, int n2) {
        long l = Hw.c(n, n2);
        blb_2 blb_22 = (blb_2)this.c.get(l);
        if (blb_22 != null) {
            return blb_22;
        }
        blb_22 = new blb_2(n, n2);
        this.c.put(l, (Object)blb_22);
        return blb_22;
    }

    public void b(int n) {
        this.b.remove(n);
    }

    public void c(int n) {
        this.c.remove((long)n);
    }
}

