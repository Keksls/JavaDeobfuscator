/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eFZ
 */
public class efz_0
extends eGX {
    private static final aqr_2 v = new eFw(new eFv("Interdit", new eFu[0]));
    private boolean w = false;
    private boolean x = false;

    public efz_0() {
        this.M();
    }

    public efz_0 aC() {
        efz_0 efz_02 = new efz_0();
        return efz_02;
    }

    public static efz_0 a(So<efh_0> so, fiy fiy2, Su su) {
        efz_0 efz_02 = new efz_0();
        efz_02.i = efc_0.a.a();
        efz_02.l = ((ejh_0)efc_0.a.b()).e();
        byte by = Hw.b((long)fiy2.a(eps_0.c));
        byte by2 = Hw.b((long)fiy2.a(eps_0.d));
        byte by3 = Hw.b((long)fiy2.a(eps_0.e));
        byte by4 = Hw.b((long)fiy2.a(eps_0.J));
        efz_02.a(by, by2, by3, by4);
        efz_02.M();
        efz_02.f = su;
        efz_02.n = -1;
        efz_02.h = so;
        return efz_02;
    }

    @Override
    public aqr_2 c_() {
        return v;
    }

    private void a(byte by, byte by2, byte by3, byte by4) {
        this.m = by4 << 24 | by3 << 16 | by2 << 8 | by;
    }

    public byte aD() {
        return (byte)((this.m & 0xFF0000) >> 16);
    }

    public byte aE() {
        return (byte)((this.m & 0xFF00) >> 8);
    }

    public byte aF() {
        return (byte)(this.m & 0xFF);
    }

    public byte aG() {
        return (byte)((this.m & 0xFF000000) >> 24);
    }

    @Override
    public void M() {
        super.M();
        if (this.aF() > 0) {
            this.c(55);
        }
        if (this.aE() > 0) {
            this.c(65);
        }
        if (this.aD() > 0) {
            this.c(60);
        }
        if (this.aG() > 0) {
            this.c(73);
        }
        if (this.w) {
            this.c(74);
        }
        if (this.x) {
            if (this.aE() > 0) {
                this.c(2188);
            }
            if (this.aF() > 0) {
                this.c(2234);
            }
            if (this.aD() > 0) {
                this.c(2263);
            }
        }
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        byte by = this.a(this.aF(), eps_0.c);
        byte by2 = this.a(this.aE(), eps_0.d);
        byte by3 = this.a(this.aD(), eps_0.e);
        byte by4 = this.a(this.aG(), eps_0.J);
        this.a(by, by2, by3, by4);
        if (by2 == 0 && by == 0 && by3 == 0) {
            this.j(true);
        }
    }

    private byte a(byte by, ru_0 ru_02) {
        if (this.f != null && by > 0 && this.f.a(ru_02)) {
            byte by2 = (byte)this.f.c(ru_02);
            this.f.b(ru_02).d(by);
            return (byte)(by2 - this.f.c(ru_02));
        }
        return 0;
    }

    @Override
    public void j(sd_0 sd_02) {
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
    public boolean as() {
        return false;
    }

    @Override
    public void z() {
        super.z();
        this.w = false;
        this.x = false;
    }

    public void d(boolean bl) {
        this.w = bl;
    }

    public void e(boolean bl) {
        this.x = bl;
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aC();
    }
}

