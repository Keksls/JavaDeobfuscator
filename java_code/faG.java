/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public enum faG {
    a(false),
    b(false),
    c(false),
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
    w;

    private final boolean x;

    private faG() {
        this(true);
    }

    private faG(boolean bl) {
        this.x = bl;
    }

    public byte a() {
        return (byte)this.ordinal();
    }

    public boolean b() {
        return !this.c();
    }

    public boolean c() {
        return this.x;
    }

    @NotNull
    public static faG a(byte by) {
        for (faG faG2 : faG.values()) {
            if (faG2.a() != by) continue;
            return faG2;
        }
        return d;
    }
}

