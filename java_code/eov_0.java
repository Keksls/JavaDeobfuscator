/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eov
 */
public abstract class eov_0 {
    public static final short a = 0;
    public static final int b = 3;
    private static final xj_0 c = new xj_0(18, 18, 0);
    private static final xj_0 d = new xj_0(9, 9, 0);

    public static xj_0 a() {
        return c;
    }

    public static xj_0 b() {
        return d;
    }

    public static int a(int n, int n2) {
        return (n /= 3) + 6 * (n2 /= 3);
    }

    private eov_0() {
    }
}

