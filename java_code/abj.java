/*
 * Decompiled with CFR 0.152.
 */
class abj
extends aas_0 {
    private adD c;
    private String d = "<unknow>";

    abj(abi abi2) {
        super(abi2);
    }

    @Override
    public final void a() {
    }

    @Override
    public final void b() {
        this.c.i();
        this.c.a();
        aui_1.a().b(this.c);
        this.c = null;
    }

    @Override
    public final void c() {
        this.c = new adD();
        this.d = "<unknow>";
        this.c.c(2000);
        this.c.a(this.b);
        this.c.a(new aeh_2(-18.0f, 18.0f, -18.0f, 18.0f, -18.0f, 18.0f));
        this.c.a(true);
        aui_1.a().a(this.c);
    }
}

