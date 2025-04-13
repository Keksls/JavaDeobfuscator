/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from ePI
 */
public class epi_1 {
    private static final epi_1 a = new epi_1();
    private final TIntObjectHashMap<epj_1> b = new TIntObjectHashMap();

    public static epi_1 a() {
        return a;
    }

    private epi_1() {
    }

    public void a(epj_1 epj_12) {
        this.b.put(epj_12.a(), (Object)epj_12);
    }

    public epj_1 a(int n) {
        return (epj_1)this.b.get(n);
    }
}

