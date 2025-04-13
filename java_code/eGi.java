/*
 * Decompiled with CFR 0.152.
 */
public final class eGi
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Default", new eFu[0]));
    private eGj w;

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eGi() {
        this.M();
    }

    public eGi aC() {
        eGi eGi2 = new eGi();
        return eGi2;
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.f == null || !this.f.a(eps_0.c) || !this.f.a(eps_0.d)) {
            return;
        }
        rs_0 rs_02 = this.f.b(eps_0.c);
        this.m = rs_02.c();
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.f == null || !this.f.a(eps_0.c) || !this.f.a(eps_0.d)) {
            this.ba();
            return;
        }
        rs_0 rs_02 = this.f.b(eps_0.c);
        rs_0 rs_03 = this.f.b(eps_0.d);
        int n = rs_02.a();
        rs_03.g(rs_03.d() + this.m);
        rs_03.c(n);
        this.w = new eGj();
        this.w.a = rs_02.c();
        this.w.b = rs_02.a();
        this.w.d = this.f;
        rs_02.a(this.w);
        this.f.c(eoz_1.X);
    }

    @Override
    public void al() {
        if (this.f == null || !this.f.a(eps_0.c) || !this.f.a(eps_0.d)) {
            return;
        }
        rs_0 rs_02 = this.f.b(eps_0.c);
        rs_0 rs_03 = this.f.b(eps_0.d);
        rs_02.b(this.w);
        int n = this.w == null ? 0 : this.w.c;
        rs_03.g(rs_03.d() - this.m - n);
        rs_03.n();
        this.f.e(eoz_1.X);
        super.al();
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public boolean R() {
        return true;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public void z() {
        super.z();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aC();
    }
}

