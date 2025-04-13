/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bfz
 */
class bfz_1
extends emi {
    final /* synthetic */ bfy_1 a;
    final /* synthetic */ bfy_1 b;

    bfz_1(bfy_1 bfy_12, bfy_1 bfy_13) {
        this.b = bfy_12;
        this.a = bfy_13;
    }

    @Override
    public void a() {
        bfy_1.c.info((Object)"Connected to Zaap. Starting token fill");
        emj.a.b(new bfa_2(this));
    }

    @Override
    public void a(String string) {
        bfy_1.c.error((Object)("Error during zaap connection(" + string + ")"));
        emj.b(string);
        emj.c();
    }
}

