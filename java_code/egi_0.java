/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eGI
 */
public class egi_0
extends eGN {
    private static final int v = 200;
    private eKe z;

    public egi_0() {
    }

    public egi_0(ru_0 ru_02) {
        super(ru_02);
    }

    public egi_0(ru_0 ru_02, eKe eKe2) {
        super(ru_02);
        this.z = eKe2;
    }

    public egi_0(ru_0 ru_02, boolean bl) {
        super(ru_02, bl);
    }

    public egi_0 aF() {
        egi_0 egi_02 = new egi_0();
        egi_02.w = this.w;
        egi_02.y = this.y;
        egi_02.z = this.z;
        return egi_02;
    }

    @Override
    public void M() {
        super.M();
        if (this.w == null) {
            return;
        }
        if (this.w.b() == 0) {
            eps_0 eps_02 = (eps_0)this.w;
            if (eps_02.u()) {
                this.c(eps_02.q());
            }
            if (eps_02 == eps_0.J) {
                this.c(2140);
            }
        }
    }

    @Override
    public void j(sd_0 sd_02) {
        super.j(sd_02);
        if (this.z == eKe.b && this.f != null) {
            int n = this.m;
            se_0 se_02 = this.f.x_();
            for (sd_0 sd_03 : se_02) {
                if (sd_03.bt_() != this.bt_() || ((egi_0)sd_03).bk() != 0) continue;
                n += sd_03.n();
            }
            if (n >= 200) {
                int n2 = this.m;
                this.m = Math.max(0, n2 - (n - 200));
            }
        }
    }

    @Override
    boolean aD() {
        if (super.aD()) {
            return true;
        }
        return this.w == eps_0.d && this.aM().a(eoz_1.e);
    }

    @Override
    void a(rs_0 rs_02) {
        this.m = rs_02.d(this.m);
        this.b((byte)0);
        if (this.m == 0 && this.aE()) {
            this.ba();
        }
    }

    @Override
    public boolean ab() {
        int n;
        int n2;
        if (this.D() && (n2 = this.aG()) < 100 && n2 < (n = xc_0.a(100))) {
            this.m = 0;
            return false;
        }
        return super.ab();
    }

    protected int aG() {
        int n = this.c != null && ((efh_0)this.c).F() >= 4 ? ((efh_0)this.c).a(3, this.aZ(), eFb.a) : -1;
        if (n < 0) {
            return 100;
        }
        return Hw.a(n, 0, 100);
    }

    @Override
    void aI() {
        rs_0 rs_02 = this.aM().b(this.w);
        rs_02.c(this.m);
        if (this.z != eKe.b) {
            return;
        }
        this.a(rs_02, 200);
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aF();
    }
}

