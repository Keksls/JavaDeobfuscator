/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

@Deprecated(forRemoval=true)
public enum faN {
    a(0, 1),
    b(1, 10),
    c(2, 50),
    d(3, 100);

    private static final faN[] f;
    private static final short[] g;
    public static final byte e = -1;
    private final byte h;
    private final short i;

    private faN(byte by, short s2) {
        this.h = by;
        this.i = s2;
    }

    public byte a() {
        return this.h;
    }

    public short b() {
        return this.i;
    }

    public static Optional<faN> a(byte by) {
        for (faN faN2 : f) {
            if (faN2.h != by) continue;
            return Optional.of(faN2);
        }
        return Optional.empty();
    }

    public static Optional<faN> a(short s2) {
        for (faN faN2 : f) {
            if (faN2.i != s2) continue;
            return Optional.of(faN2);
        }
        return Optional.empty();
    }

    public static faN a(int n) {
        return f[n];
    }

    public static short b(byte by) {
        return g[by];
    }

    public static short b(int n) {
        return g[n];
    }

    static {
        f = faN.values();
        g = new short[f.length];
        for (faN faN2 : f) {
            faN.g[faN2.h] = faN2.i;
        }
    }
}

