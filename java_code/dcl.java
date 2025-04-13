/*
 * Decompiled with CFR 0.152.
 */
class dcl
implements fzp_0 {
    final /* synthetic */ boolean a;
    final /* synthetic */ bMn b;
    final /* synthetic */ dfc c;
    final /* synthetic */ dce d;

    dcl(dce dce2, boolean bl, bMn bMn2, dfc dfc2) {
        this.d = dce2;
        this.a = bl;
        this.b = bMn2;
        this.c = dfc2;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            if (this.a) {
                this.b.y().a(this.c.c());
            } else {
                this.b.y().b(this.c.c());
            }
            fzw_0.a.a("protectorEcosystemLock", false);
        }
    }
}

