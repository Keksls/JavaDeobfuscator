/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bdo
 */
class bdo_1
implements asb_2<aty_0> {
    final /* synthetic */ bdn_2 a;

    bdo_1(bdn_2 bdn_22) {
        this.a = bdn_22;
    }

    public void a(aty_0 aty_02) {
        int n = aty_02.c();
        String string = aty_02.g();
        fii fii2 = new fii(n, string, aty_02.d(), aty_02.e().replace("desc.mru.", ""), aty_02.f());
        fij.a().a(fii2);
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((aty_0)asu_22);
    }
}

