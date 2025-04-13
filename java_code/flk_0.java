/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

/*
 * Renamed from flk
 */
public class flk_0 {
    public static final Supplier<flk_0> a = () -> new flk_0(0L, 0);
    public static final int b = 10;
    private final long c;
    private long d;
    private final short e;

    public flk_0(long l, short s2) {
        this.e = s2;
        this.c = l;
        this.d = l;
    }

    public short a() {
        return this.e;
    }

    public long b() {
        return this.c;
    }

    public long c() {
        return Math.max(0L, this.c);
    }

    public long d() {
        return this.d;
    }

    public void a(long l) {
        this.d = l;
    }

    public boolean e() {
        return this.e > 0;
    }

    public boolean f() {
        return this.e != 0 || this.c != 0L;
    }
}

