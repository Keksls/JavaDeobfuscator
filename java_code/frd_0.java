/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from frd
 */
public enum frd_0 {
    a,
    b,
    c,
    d,
    e,
    f,
    g,
    h,
    i,
    j,
    k,
    l,
    m,
    n,
    o,
    p,
    q,
    r,
    s,
    t,
    u,
    v,
    w,
    x,
    y,
    z,
    A,
    B,
    C,
    D,
    E,
    F,
    G,
    H,
    I,
    J,
    K,
    L,
    M,
    N,
    O,
    P,
    Q,
    R,
    S,
    T;

    private static final frd_0[] U;

    public static frd_0 a(String string) {
        frd_0[] frd_0Array;
        for (frd_0 frd_02 : frd_0Array = frd_0.values()) {
            if (!frd_02.name().equals(string.toUpperCase())) continue;
            return frd_02;
        }
        return frd_0Array[0];
    }

    public static frd_0 a(int n) {
        return U[n];
    }

    static {
        U = frd_0.values();
    }
}

