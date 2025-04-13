/*
 * Decompiled with CFR 0.152.
 */
public abstract class fkx
extends fkg_0<fkc_0> {
    public fkx(fkc_0 fkc_02) {
        super(fkc_02);
    }

    public boolean a(esy_2 esy_22) {
        if (esy_22.b()) {
            this.d(esy_22);
            this.c(esy_22);
            this.b(esy_22);
        }
        this.e(esy_22);
        this.f(esy_22);
        return !this.b();
    }

    protected abstract void b(esy_2 var1);

    private void c(esy_2 esy_22) {
        int n = fkb_0.b(esy_22, (fkc_0)this.a);
        if (n > 0) {
            this.a(new fkR(new fkr_0(esy_22), n));
        }
    }

    private void d(esy_2 esy_22) {
        long l = fkb_0.a(esy_22, (fkc_0)this.a);
        if (l > 0L) {
            this.a(new fkQ(new fkr_0(esy_22), l));
        }
    }

    private void e(esy_2 esy_22) {
        int n = fkb_0.c(esy_22, (fkc_0)this.a);
        if (n > 0) {
            this.a(new fkS(new fkr_0(esy_22), n));
        }
    }

    private void f(esy_2 esy_22) {
        eub_2 eub_22 = fkb_0.d(esy_22, (fkc_0)this.a);
        eub_22.a(new fky(this, esy_22));
    }
}

