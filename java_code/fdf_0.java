/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fdf
 */
public enum fdf_0 {
    a,
    b,
    c;

    public final int d = 1 << this.ordinal();

    public static int a(Iterable<fdf_0> iterable) {
        int n = 0;
        for (fdf_0 fdf_02 : iterable) {
            n |= fdf_02.d;
        }
        return n;
    }
}

