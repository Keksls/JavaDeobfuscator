/*
 * Decompiled with CFR 0.152.
 */
class abl
extends aas_0 {
    private adh_0 c;
    private String d = "<unknow>";

    abl(abk abk2) {
        super(abk2);
    }

    @Override
    public final void a() {
    }

    @Override
    public final void b() {
        aui_1.a().b(this.c);
        this.c.i();
        this.c.a();
    }

    @Override
    public final void c() {
        this.c = new adh_0();
        this.d = "<unknow>";
        this.c.c(2000);
        this.c.a(this.b);
        this.c.a(true);
        this.c.a(new aeh_2(-18.0f, 18.0f, -18.0f, 18.0f, -18.0f, 18.0f));
        aui_1.a().a(this.c);
    }
}

