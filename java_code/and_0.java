/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from and
 */
public class and_0 {
    private final TIntObjectHashMap<ane_0> i = new TIntObjectHashMap();
    public static final and_0 a = new and_0();
    static final int b = 1;
    static final int c = 2;
    static final int d = 3;
    static final int e = 4;
    static final int f = 5;
    static final int g = 6;
    static final int h = 7;

    public and_0() {
        this.i.put(1, ang_0::new);
        this.i.put(2, anh_0::new);
        this.i.put(3, anm_1::new);
        this.i.put(4, anl_1::new);
        this.i.put(5, anj_0::new);
        this.i.put(6, ani_0::new);
        this.i.put(7, ank_0::new);
    }

    public anc_0 a(int n, arf_1 arf_12) {
        ane_0 ane_02 = (ane_0)this.i.get(n);
        return ane_02.createData(arf_12);
    }
}

