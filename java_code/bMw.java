/*
 * Decompiled with CFR 0.152.
 */
public class bMw
extends fgr_0 {
    public bMw(fgy_0 fgy_02) {
        super(fgy_02);
    }

    @Override
    protected void a() {
        fgk_0 fgk_02 = fgk_0.a(this.e + this.d, this.b.size() + this.c.size());
        if (fgk_02 != this.f) {
            this.f = fgk_02;
            bRA.e().f();
        }
    }

    @Override
    public void a(fgk_0 fgk_02) {
        super.a(fgk_02);
        bRA.e().f();
    }

    public aeo_2 a(int n) {
        return (aeo_2)this.b().get(n);
    }

    public aeo_2 b(int n) {
        return (aeo_2)this.c().get(n);
    }
}

