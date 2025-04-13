/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aHS
 */
public class ahs_2 {
    private final long a;
    private final long b;
    private final byte c;
    private final byte d;
    private final int e;

    public ahs_2(long l) {
        this.a = l;
        this.e = (int)(this.a % 1000L);
        long l2 = this.a / 1000L;
        this.d = (byte)(l2 % 60L);
        long l3 = this.a / 1000L / 60L;
        this.c = (byte)(l3 % 60L);
        this.b = this.a / 1000L / 60L / 60L;
    }

    public long a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    public byte c() {
        return this.c;
    }

    public byte d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.b != 0L) {
            stringBuilder.append(this.b).append("h ");
        }
        if (this.c != 0) {
            stringBuilder.append(this.c).append("min ");
        }
        if (this.d != 0) {
            stringBuilder.append(this.d).append("sec ");
        }
        stringBuilder.append(this.e).append("ms");
        return stringBuilder.toString();
    }
}

