/*
 * Decompiled with CFR 0.152.
 */
public class bMf
extends bMk {
    public bMf(bnh_1 bnh_12, ffu_0 ffu_02) {
        super(bnh_12, ffu_02);
    }

    @Override
    protected void b() {
        biI biI2 = this.a.bv();
        this.c = new bMg(this.b, biI2);
        int n = this.b.e();
        this.c.m(bMj.a(this.b));
        this.c.a(biI2.aC());
        this.c.e("AnimStatique");
        this.c.a(agm.a());
        this.c.g(ahi_0.j.a());
        this.c.b((byte)8);
        this.c.c(true);
        this.c.a(this.b.d());
        Object r2 = eyo_1.g().d(n);
        if (r2 != null) {
            this.c.c(((ezr_0)r2).C());
        }
        this.c.E();
    }

    @Override
    public void c() {
        afv afv2 = this.c.aK();
        if (afv2 != null) {
            afv2.e(this.c);
        }
        afz_0.d().a(this.c.a());
        this.c.R();
        this.c = null;
        if (this.a.bm()) {
            biI biI2 = this.a.bv();
            biI2.b(this.d);
            biI2.c(this.d);
        }
        this.d = null;
    }
}

