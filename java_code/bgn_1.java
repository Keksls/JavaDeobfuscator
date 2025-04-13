/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteIntHashMap
 */
import gnu.trove.map.hash.TByteIntHashMap;

/*
 * Renamed from bGN
 */
public abstract class bgn_1 {
    private final bbg_1 a;
    private final String b;
    private final TByteIntHashMap c = new TByteIntHashMap();

    public bgn_1(bbg_1 bbg_12, String string) {
        this.a = bbg_12;
        this.b = string;
    }

    public int a(byte by, int n) {
        return this.c.put(by, n);
    }

    public void a() {
        this.c.clear();
    }

    public bbg_1 b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public TByteIntHashMap d() {
        return this.c;
    }

    public abstract eaa_0 e();

    public abstract fo_1 f();
}

