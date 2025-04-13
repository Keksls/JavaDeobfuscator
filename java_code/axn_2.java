/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from axn
 */
public enum axn_2 {
    a(0),
    b(1),
    c(768),
    d(769),
    e(770),
    f(771),
    g(774),
    h(775),
    i(772),
    j(773),
    k(776);

    public final int l;

    private axn_2(int n2) {
        this.l = n2;
    }

    public static axn_2 a(int n) {
        for (axn_2 axn_22 : axn_2.values()) {
            if (axn_22.l != n) continue;
            return axn_22;
        }
        return a;
    }
}

