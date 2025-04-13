/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class Cp {
    private static final int a = 32;
    private static final int b = 126;
    private long c;

    public Cp() {
    }

    public Cp(long l) {
        this.c = l;
    }

    public void a(long l) {
        this.c = l;
    }

    private long f() {
        this.c ^= this.c << 13;
        this.c ^= this.c >> 7;
        this.c ^= this.c << 17;
        return this.c < 0L ? this.c - Long.MIN_VALUE : this.c;
    }

    public long a() {
        return this.a(0L, Long.MAX_VALUE);
    }

    public long b(long l) {
        return this.a(0L, l);
    }

    public long a(long l, long l2) {
        if (l >= l2) {
            return l;
        }
        return this.f() % (l2 - l) + l;
    }

    public int b() {
        return this.a(0, Integer.MAX_VALUE);
    }

    public int a(int n) {
        return this.a(0, n);
    }

    public int a(int n, int n2) {
        return (int)this.a((long)n, (long)n2);
    }

    public short c() {
        return this.a((short)0, (short)Short.MAX_VALUE);
    }

    public short a(short s2) {
        return this.a((short)0, s2);
    }

    public short a(short s2, short s3) {
        return (short)this.a((long)s2, (long)s3);
    }

    public byte d() {
        return this.a((byte)0, (byte)127);
    }

    public byte a(byte by) {
        return this.a((byte)0, by);
    }

    public byte a(byte by, byte by2) {
        return (byte)this.a((long)by, (long)by2);
    }

    public boolean e() {
        return this.f() % 2L == 0L;
    }

    public String b(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Random String length cannot be < 0: " + n);
        }
        char[] cArray = new char[n];
        for (int k = 0; k < n; ++k) {
            cArray[k] = (char)this.a(32, 127);
        }
        return new String(cArray);
    }

    public <T> T a(T[] TArray) {
        return TArray[this.a(TArray.length)];
    }

    public <T> T a(List<T> list) {
        return list.get(this.a(list.size()));
    }
}

