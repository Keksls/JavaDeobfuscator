/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bic
 */
public final class bic_1
implements rn_0 {
    private final int a;
    private final String b;
    private long c;
    private final boolean d;

    bic_1(bic_1 bic_12) {
        this.a = bic_12.a;
        this.b = bic_12.b;
        this.d = bic_12.d;
    }

    bic_1(int n, String string, boolean bl) {
        this.a = n;
        this.b = string != null ? string.intern() : null;
        this.d = bl;
    }

    @Override
    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public long c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    void a(long l) {
        this.c = l;
    }
}

