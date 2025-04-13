/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eMQ
 */
public enum emq_1 {
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
    H;


    public static byte a(emq_1 emq_12) {
        emq_1[] emq_1Array = emq_1.values();
        for (byte by = 0; by < emq_1Array.length; by = (byte)(by + 1)) {
            emq_1 emq_13 = emq_1Array[by];
            if (emq_12 != emq_13) continue;
            return by;
        }
        return -1;
    }

    public static emq_1 a(byte by) {
        if (by < 0 || by >= emq_1.values().length) {
            return null;
        }
        return emq_1.values()[by];
    }
}

