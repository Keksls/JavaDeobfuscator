/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public enum faO {
    a(0, 604800000L, 0.3333333333333333),
    b(1, 1209600000L, 0.5),
    c(2, 2419200000L, 1.0);

    private static final faO[] d;
    private static final long[] e;
    private final byte f;
    private final long g;
    private final wx_0 h;
    private final double i;

    private faO(byte by, long l, double d2) {
        this.f = by;
        this.g = l;
        this.h = new ww_0(l / 1000L);
        this.i = d2;
    }

    public byte a() {
        return this.f;
    }

    public long b() {
        return this.g;
    }

    public wx_0 c() {
        return this.h;
    }

    public double d() {
        return this.i;
    }

    public static Optional<faO> a(byte by) {
        for (faO faO2 : d) {
            if (faO2.f != by) continue;
            return Optional.of(faO2);
        }
        return Optional.empty();
    }

    public static Optional<faO> a(long l) {
        for (faO faO2 : d) {
            if (faO2.g != l) continue;
            return Optional.of(faO2);
        }
        return Optional.empty();
    }

    public static faO a(int n) {
        return d[n];
    }

    public static long b(byte by) {
        return e[by];
    }

    public static long b(int n) {
        return e[n];
    }

    static {
        d = faO.values();
        e = new long[d.length];
        for (faO faO2 : d) {
            faO.e[faO2.f] = faO2.g;
        }
    }
}

