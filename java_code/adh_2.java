/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aDH
 */
public class adh_2
extends adt_1 {
    public static final int a = Integer.MIN_VALUE;
    private long b;
    private int c = 0;
    private long d;

    public long b() {
        return this.b;
    }

    public void a(long l) {
        this.b = l;
    }

    public void b(int n) {
        this.c = n;
    }

    public int c() {
        return this.c;
    }

    @Override
    public int a() {
        return Integer.MIN_VALUE;
    }

    public long d() {
        return this.d;
    }

    public void b(long l) {
        this.d = l;
    }

    @Override
    public String toString() {
        return "ClockMessage clockId=" + this.b + ", subClockId=" + this.c + ", timestamp=" + this.d;
    }
}

