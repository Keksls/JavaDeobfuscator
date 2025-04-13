/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bfA
 */
class bfa_2
extends emi {
    final /* synthetic */ bfz_1 a;

    bfa_2(bfz_1 bfz_12) {
        this.a = bfz_12;
    }

    @Override
    public void b(String string) {
        bfy_1.c.info((Object)"Token obtained from Zaap. Starting autologin");
        ado_1.a().b(this.a.b.e);
        this.a.b.d.b(this.a.a);
        emj.a(string);
    }

    @Override
    public void a(String string) {
        bfy_1.c.error((Object)("Error during zaap connection(" + string + ")"));
        emj.b(string);
        emj.c();
    }
}

