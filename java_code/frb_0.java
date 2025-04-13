/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from frb
 */
public enum frb_0 {
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
    B;


    public static frb_0 a(String string) {
        frb_0[] frb_0Array;
        for (frb_0 frb_02 : frb_0Array = frb_0.values()) {
            if (!frb_02.name().equals(string.toUpperCase())) continue;
            return frb_02;
        }
        return a;
    }
}

