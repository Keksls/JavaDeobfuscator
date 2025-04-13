/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bip
 */
public class bip_2
extends bil_2 {
    private final bhx_2 k;
    private final bhr_1 l;

    public bip_2(long l, bhx_2 bhx_22) {
        this.l = bhl_1.a.b(l);
        this.k = bhx_22;
    }

    @Override
    protected long b() {
        try {
            bic_1[] bic_1Array = this.k.g();
            if (bic_1Array == null) {
                return -1L;
            }
            if (bic_1Array.length == 1) {
                int n = bic_1Array[0].a();
                return this.l.r(n) ? Long.valueOf(this.l.k(n)) : null;
            }
            long l = 0L;
            for (bic_1 bic_12 : bic_1Array) {
                if (!this.l.r(bic_12.a())) continue;
                l += this.l.k(bic_12.a());
            }
            return l;
        }
        catch (Exception exception) {
            return -1L;
        }
    }

    public int j() {
        return this.k.c();
    }

    @Override
    protected String a() {
        return bae.h().a(64, (long)this.k.c(), new Object[0]);
    }

    @Override
    protected boolean c() {
        int n = this.k.c();
        return !this.l.a(n) || this.l.b(n);
    }

    @Override
    protected boolean f() {
        return false;
    }

    @Override
    protected boolean e() {
        return biz_2.a.a(this.k.c());
    }

    @Override
    protected boolean g() {
        return this.k.j();
    }

    @Override
    protected boolean h() {
        return this.k.a(azu_0.j().k().T_());
    }

    public void k() {
        fis_1.a().a((ajf_1)this, "isCompleted");
    }

    public void l() {
        fis_1.a().a((ajf_1)this, "progressionText");
    }
}

