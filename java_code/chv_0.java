/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cHV
 */
class chv_0
implements fzp_0 {
    final /* synthetic */ int a;
    final /* synthetic */ fug_0 b;
    final /* synthetic */ fcu_0 c;
    final /* synthetic */ bUM d;

    chv_0(int n, fug_0 fug_02, fcu_0 fcu_02, bUM bUM2) {
        this.a = n;
        this.b = fug_02;
        this.c = fcu_02;
        this.d = bUM2;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            dfc dfc2 = new dfc();
            dfc2.a_(this.a);
            dfc2.a(this.b.getText());
            dfc2.a(this.c.a());
            add_2.b().a(dfc2);
            bUW.a().a((String)null);
            this.d.a(this.b.getText());
            bUW.a().a(this.d);
        }
    }
}

