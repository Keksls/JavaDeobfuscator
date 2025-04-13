/*
 * Decompiled with CFR 0.152.
 */
final class bjT {
    private static final int a = 3000;
    final bjV b;
    private Runnable c;
    private boolean d;

    bjT(bjV bjV2) {
        this.b = bjV2;
    }

    public void a() {
        this.d = true;
        this.c = new bju_0(this);
        ado_1.a().a(this.c, 3000L);
    }

    public void b() {
        ado_1.a().b(this.c);
        this.d = false;
    }

    public boolean c() {
        return this.d;
    }
}

