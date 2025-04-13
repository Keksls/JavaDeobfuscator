/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from fgC
 */
public class fgc_0 {
    public static final fgc_0 a = new fgc_0();
    private final TIntObjectHashMap<fgb_0> b = new TIntObjectHashMap();

    public void a(int n, fgb_0 fgb_02) {
        this.b.put(n, (Object)fgb_02);
    }

    public fgb_0 a(int n) {
        fgb_0 fgb_02 = (fgb_0)this.b.get(n);
        if (fgb_02 == null) {
            fgb_02 = new fgb_0();
            this.a(n, fgb_02);
        }
        return fgb_02;
    }
}

