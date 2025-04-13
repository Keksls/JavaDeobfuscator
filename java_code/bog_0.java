/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bOg
 */
public enum bog_0 {
    a(bq_0.a, -1, true),
    b(bq_0.b, 24267, true),
    c(bq_0.c, 24844, false),
    d(bq_0.d, 24268, true),
    e(bq_0.e, 24266, true);

    private final int f;
    private final int g;
    private final boolean h;

    private bog_0(bq_0 bq_02, int n2, boolean bl) {
        this.f = bq_02.getNumber();
        this.g = n2;
        this.h = bl;
    }

    public int a() {
        return this.f;
    }

    public int b() {
        return this.g;
    }

    public boolean c() {
        return this.h;
    }

    public static bog_0 a(int n) {
        for (bog_0 bog_02 : bog_0.values()) {
            if (bog_02.f != n) continue;
            return bog_02;
        }
        return null;
    }
}

