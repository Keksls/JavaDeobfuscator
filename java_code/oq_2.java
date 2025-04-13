/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Oq
 */
public class oq_2 {
    private final long a;
    private final long b;
    private final byte[] c;
    private final long d;

    public oq_2(long l, long l2, byte[] byArray, long l3) {
        this.a = l;
        this.b = l2;
        this.c = new byte[byArray.length];
        System.arraycopy(byArray, 0, this.c, 0, byArray.length);
        this.d = l3;
    }

    public long a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    public byte[] c() {
        return this.c;
    }

    public long d() {
        return this.d;
    }
}

