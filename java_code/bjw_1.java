/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bJW
 */
public class bjw_1
extends ezr_0<bhg_0>
implements ajh_1,
bHS,
bhx_1,
fwo {
    private final bht_1 d = new bht_1(this);
    private big_0 e;
    private bHL f;

    bjw_1() {
    }

    void a(big_0 big_02) {
        this.e = big_02;
    }

    void a(bHL bHL2) {
        this.f = bHL2;
    }

    public big_0 c() {
        return this.e;
    }

    @Override
    public String e() {
        return bae.h().a(15, (long)this.n(), new Object[0]);
    }

    public boolean f() {
        return bae.h().a(15, (long)this.n());
    }

    public static String a(int n) {
        return bae.h().a(15, (long)n, new Object[0]);
    }

    @Override
    public String g() {
        if (!bae.h().a(16, (long)this.n())) {
            return "";
        }
        return bae.h().a(16, (long)this.n(), new Object[0]);
    }

    @Override
    public String[] d() {
        return this.d.d();
    }

    @Override
    public Object b(String string) {
        return this.d.b(string);
    }

    @Override
    public bht_1 b() {
        return this.d;
    }

    @Override
    public bjw_1 a() {
        return this;
    }

    public boolean h() {
        return azu_0.j().c(cXC.a()) && cXC.a().b(this.n());
    }

    @Override
    public boolean i() {
        apc_2 apc_22 = this.a(exz_1.f);
        bmr_1 bmr_12 = azu_0.j().k();
        return apc_22 == null || apc_22.b(bmr_12, this, null, bmr_12.ge());
    }

    public bHL j() {
        return this.f;
    }

    public void k() {
        if (!this.l()) {
            return;
        }
        if (this.F().h().length != 0) {
            ddo_0.b.a(this);
            return;
        }
        eyw_1 eyw_12 = this.p();
        if (eyw_12 instanceof bjf_2) {
            bjf_2 bjf_22 = (bjf_2)eyw_12;
            short s2 = bjf_22.g();
            bhd_1 bhd_12 = bhe_0.a().a(s2);
            if (bhd_12 != null) {
                for (int n : bhd_12.k()) {
                    bjw_1 bjw_12 = (bjw_1)eyo_1.g().d(n);
                    ddo_0.b.a(bjw_12);
                }
            }
        }
    }

    @Override
    public boolean l() {
        if (this.F().h().length != 0) {
            return true;
        }
        eyw_1 eyw_12 = this.p();
        return eyw_12 instanceof bjf_2;
    }

    public boolean m() {
        if (this.M() == exw_1.i) {
            return false;
        }
        if (!this.f()) {
            return false;
        }
        if (this.N() != eyh_1.a) {
            return false;
        }
        if (this.b(ext_1.w)) {
            return false;
        }
        if (!azs_0.a().e(this.C())) {
            return false;
        }
        apc_2 apc_22 = this.a(exz_1.e);
        return apc_22 == null || apc_22.b(null, this, this, null);
    }

    @Override
    public String getFilterableStringValue() {
        return this.e();
    }
}

