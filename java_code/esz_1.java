/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eSZ
 */
public enum esz_1 {
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
    M;


    public static esz_1 a(int n) {
        esz_1[] esz_1Array = esz_1.values();
        if (n < 0 || n >= esz_1Array.length) {
            throw new etp_2("[HAVEN_WORLD] Erreur " + n + " inconnue");
        }
        return esz_1Array[n];
    }
}

