/*
 * Decompiled with CFR 0.152.
 */
public final class fdd {
    private final faV a;

    public fdd(faV faV2) {
        this.a = faV2;
    }

    public long a(long l) {
        long l2 = Hw.a(l, 0L, Integer.MAX_VALUE);
        this.a.a(l2);
        return this.a.z();
    }

    public long a(int n) {
        return this.a(this.a.z() + (long)n);
    }

    public long b(int n) {
        return this.a(this.a.z() - (long)n);
    }
}

