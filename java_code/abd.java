/*
 * Decompiled with CFR 0.152.
 */
class abd
extends aas_0 {
    private adw_0 c;
    private String d;
    private ahq_0 e;

    abd(abc abc2) {
        super(abc2);
    }

    @Override
    public final void a() {
        String string = this.a[0].b();
        if (!string.equals(this.d)) {
            this.c.a(string);
            this.d = string;
        }
        float f2 = this.a[1].a();
        float f3 = this.a[2].a();
        float f4 = this.a[3].a();
        float f5 = this.a[4].a();
        float f6 = this.a[5].a();
        this.c.a(f2, f3);
        this.c.a(f4);
        this.c.b(f5);
        this.c.c(f6);
    }

    @Override
    public final void b() {
        aed.a.b(this.c);
        this.c = null;
        this.d = null;
    }

    @Override
    public final void c() {
        this.c = new adw_0();
        this.c.a(this.e);
        aed.a.a(this.c);
    }

    @Override
    public void a(acb_0 acb_02) {
        super.a(acb_02);
        this.e = acb_02.b();
    }
}

