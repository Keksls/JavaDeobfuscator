/*
 * Decompiled with CFR 0.152.
 */
class ftR {
    Runnable b;
    final fsQ c;
    final int d;
    final ftR e;
    final byte f;
    short g;
    byte h;
    final /* synthetic */ ftQ a;

    ftR(ftQ ftQ2, fsQ fsQ2, int n, ftR ftR2, byte by) {
        this.a = ftQ2;
        this.c = fsQ2;
        this.d = n;
        this.e = ftR2;
        this.f = by;
    }

    private ftR(ftQ ftQ2, fsQ fsQ2, int n, byte by) {
        this(ftQ2, fsQ2, n, null, by);
    }

    private void a(short s2, boolean bl, int n, float f2) {
        this.a.i = false;
        int n2 = n;
        float f3 = this.c.getOffset();
        if (this.b != null) {
            return;
        }
        this.b = new ftS(this, bl, f2, s2, f3, n2);
        ado_1.a().a(this.b, 25L);
    }

    public void a() {
        float f2 = (float)this.f / ((float)this.a.l / 25.0f);
        int n = ftQ.d.length;
        this.a(this.f, true, this.f, f2);
    }

    public void b() {
        int n = ftQ.d.length;
        float f2 = (float)n / ((float)this.a.l / 25.0f);
        this.a((short)n, true, n, f2);
    }

    void a(float f2) {
        this.c.setListOffset(f2);
    }

    public Byte c() {
        return this.h;
    }

    public byte d() {
        return this.f;
    }

    public int e() {
        return this.d;
    }

    public void f() {
        ado_1.a().b(this.b);
    }

    public fsQ g() {
        return this.c;
    }
}

