/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eza
 */
public enum eza_1 {
    a(1, 0, 1.0f, new int[0]),
    b(2, 3600, 1.0f, 97862),
    c(3, 7200, 1.0f, 119163),
    d(4, 10800, 0.5f, 119172),
    e(5, 12600, 0.5f, 119173),
    f(6, 14400, 0.5f, 119174),
    g(7, 16200, 0.5f, 119175),
    h(8, 18000, 0.0f, 119176),
    i(9, 30000000, 0.0f, new int[0]);

    public static final wx_0 j;
    private static final eza_1[] k;
    private final byte l;
    private final wx_0 m;
    private float n;
    private final int[] o;
    private static final ww_0 p;

    private eza_1(int n2, int n3, float f2, int ... nArray) {
        this.l = Hw.b((long)n2);
        this.m = ww_0.a(n3);
        this.n = f2;
        this.o = (int[])nArray.clone();
    }

    @Nullable
    public static eza_1 a(byte by) {
        for (eza_1 eza_12 : eza_1.values()) {
            if (eza_12.l != by) continue;
            return eza_12;
        }
        return null;
    }

    public wx_0 a() {
        return this.m;
    }

    public byte b() {
        return this.l;
    }

    public int[] c() {
        return (int[])this.o.clone();
    }

    public static eza_1 a(int n) {
        p.a(n, 0, 0, 0);
        for (int k = eza_1.k.length - 1; k >= 0; --k) {
            eza_1 eza_12 = eza_1.k[k];
            if (!eza_12.m.c(p)) continue;
            return eza_12;
        }
        return a;
    }

    @Nullable
    public static eza_1 b(int n) {
        if (n <= 0) {
            return null;
        }
        for (eza_1 eza_12 : k) {
            if (!ArrayUtils.contains((int[])eza_12.o, (int)n)) continue;
            return eza_12;
        }
        return null;
    }

    public float d() {
        return this.n;
    }

    static {
        j = new ww_0(0, 0, 5, 0);
        k = eza_1.values();
        p = new ww_0(0L);
    }
}

