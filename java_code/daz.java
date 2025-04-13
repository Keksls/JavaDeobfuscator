/*
 * Decompiled with CFR 0.152.
 */
public abstract class daz
extends cVb {
    protected exk_2 b;
    protected bHN c;
    protected long d;
    protected short e;
    protected fjb_0 f;

    protected boolean e() {
        if (this.f == null) {
            return false;
        }
        feu_0 feu_02 = this.c.c();
        this.d = this.a(this.c.e(), this.c.q(), feu_02.g, this.c.p());
        if (this.d == -1L) {
            return false;
        }
        fis_1.a().a("stackTax", this.d);
        return true;
    }

    private long a(short s2, fev_0 fev_02, double d2, long l) {
        int n = s2 / fev_02.f;
        long l2 = Math.round((double)(l * (long)n) * d2);
        if (l2 < 0L) {
            return -1L;
        }
        return fje_0.a.a(azu_0.j().k(), this.f, l2);
    }

    protected void a(exk_2 exk_22, short s2) {
        this.a(exk_22, s2, 0L);
    }

    protected void a(exk_2 exk_22, short s2, long l) {
        this.c.a(exk_22);
        this.e = s2;
        this.c.a(this.e);
        this.c.a(fev_0.a);
        this.c.k();
        this.c.a(l);
        this.e();
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        super.a(aav_22, bl);
        this.c = new bHN();
        fis_1.a().a("merchantItem", this.c);
        fpm_0.b().a("wakfu.merchant.tax", cHI.class);
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        super.b(aav_22, bl);
        this.f = null;
        this.c.a((exk_2)null);
        this.c.release();
        this.c = null;
        fis_1.a().a("merchantItem", (Object)null);
        fpm_0.b().e("wakfu.merchant.tax");
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 16863: {
                boolean bl;
                if (this.c.h() == null) {
                    return false;
                }
                dfc dfc2 = (dfc)adt_12;
                long l = dfc2.d();
                long l2 = this.c.p();
                boolean bl2 = bl = (long)this.c.e() / (long)this.c.q().f * l < 0L;
                if (bl) {
                    l = l2;
                }
                this.c.a(l);
                if (!this.e()) {
                    this.c.a(l2);
                }
                fis_1.a().a((ajf_1)this.c, "price");
                return false;
            }
            case 17750: {
                if (this.c.h() == null) {
                    return false;
                }
                dey_0 dey_02 = (dey_0)adt_12;
                feu_0 feu_02 = this.c.c();
                this.c.a(dey_02.k());
                if (!this.e()) {
                    this.c.a(feu_02);
                }
                return false;
            }
            case 17774: {
                if (this.c.h() == null) {
                    return false;
                }
                dez_0 dez_02 = (dez_0)adt_12;
                fev_0 fev_02 = dez_02.k();
                fev_0 fev_03 = this.c.q();
                this.c.a(fev_02);
                short s2 = (short)(this.e / fev_02.f * fev_02.f);
                short s3 = this.c.e();
                this.c.a(s2);
                if (!this.e()) {
                    this.c.a(fev_03);
                    this.c.a(s3);
                }
                return false;
            }
        }
        return true;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public fjb_0 f() {
        return this.f;
    }
}

