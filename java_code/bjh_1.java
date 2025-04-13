/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bJH
 */
public enum bjh_1 {
    a(exh_2.a),
    b(exh_2.d),
    c(exh_2.e),
    d(exh_2.f),
    e(exh_2.h),
    f(exh_2.i),
    g(exh_2.k),
    h(exh_2.m),
    i(exh_2.n),
    j(exh_2.p),
    k(exh_2.q),
    l(exh_2.r),
    m(exh_2.w),
    n(exh_2.y);

    private final exh_2 o;

    private bjh_1(exh_2 exh_22) {
        this.o = exh_22;
    }

    public static bjh_1 a(exh_2 exh_22) {
        for (bjh_1 bjh_12 : bjh_1.values()) {
            if (bjh_12.o != exh_22) continue;
            return bjh_12;
        }
        return null;
    }

    public exh_2 a() {
        return this.o;
    }
}

