/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

/*
 * Renamed from eGF
 */
public class egf_0
extends ejh_0 {
    private static final aqr_2 x = new eFw(new eFv("Debuff de Charac", new eFu("valeur (-1 valeur du trigger, -2 vole la totalit\u00e9)", eFx.b)), new eFv("Debuff de Charac avec proba d'application", new eFu("valeur (-1 valeur du trigger, -2 vole la totalit\u00e9) ", eFx.b), new eFu("Proba d'application en % (-1 = application forc\u00e9e)", eFx.c)), new eFv("Debuff de charac param\u00e9tr\u00e9", new eFu("Valeur (-1 valeur du trigger, -2 vole la totalit\u00e9) ", eFx.b), new eFu("Proba d'application en % (-1 = application forc\u00e9e)", eFx.c), new eFu("Augmente la valeur courante \u00e0 la d\u00e9sapplication (0 non / 1 oui (default))", eFx.c)), new eFv("Diminue la valeur lors de l'application", new eFu("Valeur (-1 valeur du trigger, -2 vole la totalit\u00e9) ", eFx.b), new eFu("Proba d'application en % (-1 = application forc\u00e9e)", eFx.c), new eFu("Augmente la valeur courante \u00e0 la d\u00e9sapplication (0 non / 1 oui (default))", eFx.c), new eFu("Diminue la valeur courante \u00e0 l'application (0 non  / 1 oui (default))", eFx.c)));
    protected ru_0 v;
    protected boolean w = true;
    private boolean y = true;
    private final BitSet z = new BitSet();

    @Override
    public aqr_2 c_() {
        return x;
    }

    protected egf_0() {
    }

    public egf_0(ru_0 ru_02) {
        this.v = ru_02;
        this.M();
    }

    public egf_0 aD() {
        egf_0 egf_02 = new egf_0();
        egf_02.v = this.v;
        egf_02.w = this.w;
        egf_02.y = this.y;
        egf_02.z.clear();
        egf_02.z.or(super.L());
        return egf_02;
    }

    @Override
    public BitSet L() {
        return this.z;
    }

    public ru_0 aE() {
        return this.v;
    }

    @Override
    public void M() {
        super.M();
        if (this.v == null) {
            return;
        }
        switch (this.v.b()) {
            case 0: {
                eps_0 eps_02 = (eps_0)this.v;
                if (!eps_02.s()) break;
                this.c(eps_02.o());
                break;
            }
            case 1: {
                switch ((exn_2)this.v) {
                    case b: {
                        this.c(4);
                    }
                }
            }
        }
    }

    @Override
    public boolean ab() {
        int n;
        int n2;
        if (this.D() && (n2 = this.aF()) < 100 && n2 < (n = xc_0.a(100))) {
            this.m = 0;
            return false;
        }
        return super.ab();
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.bk() > 0) {
            return;
        }
        if (this.f != null && this.f.a(this.v)) {
            byte by = this.v.a();
            if (this.m == -1 && sd_02 != null) {
                this.m = sd_02.n();
            }
            this.c(by);
            this.aG();
        } else {
            this.j(true);
        }
    }

    private int aF() {
        int n = this.c != null && ((efh_0)this.c).F() >= 2 ? ((efh_0)this.c).a(1, this.aZ(), eFb.a) : 100;
        if (n < 0) {
            return 100;
        }
        return Hw.a(n, 0, 100);
    }

    private void c(byte by) {
        rs_0 rs_02;
        int n;
        if (this.D() && by == eps_0.b.a() && this.f() != null && ((efh_0)this.f()).h() != 2 && (n = (rs_02 = this.f.b(this.v)).c() - this.m) <= 0) {
            this.m += n - 1;
        }
    }

    private void aG() {
        rs_0 rs_02 = this.f.b(this.v);
        int n = rs_02.a();
        if (rs_02.c() != Integer.MAX_VALUE) {
            rs_02.f(-this.m);
            rs_02.e(-this.m);
        }
        int n2 = rs_02.a();
        if (this.y) {
            int n3 = this.m - (n - n2);
            rs_02.d(n3);
            n2 = rs_02.a();
        }
        if (this.v.b() == 0) {
            eps_0 eps_02 = (eps_0)this.v;
            if (n2 != n && eps_02.u()) {
                this.z.set(eps_02.q());
            }
            if (eps_02.s()) {
                if (this.m != 0) {
                    this.z.set(eps_02.o());
                } else {
                    this.d(eps_02.o());
                }
            }
        }
        if (this.v == eps_0.B && this.h != null && this.h.d() != null) {
            this.h.d().t();
        }
    }

    @Override
    public void j(sd_0 sd_02) {
        short s2 = this.aZ();
        if (this.c == null) {
            return;
        }
        this.y = true;
        this.w = true;
        this.m = ((efh_0)this.c).a(0, s2, eFb.a);
        if (((efh_0)this.c).F() > 2) {
            boolean bl = this.w = ((efh_0)this.c).a(2, s2, eFb.a) == 1;
        }
        if (((efh_0)this.c).F() > 3) {
            boolean bl = this.y = ((efh_0)this.c).a(3, this.aZ(), eFb.a) == 1;
        }
        if (this.m == -1 && sd_02 != null) {
            this.m = sd_02.n();
        } else if (this.m == -2 && this.f != null && this.f.a(this.v)) {
            this.m = this.f.c(this.v);
        }
    }

    @Override
    public void a(int n, float f2, boolean bl) {
        switch (n) {
            case 0: {
                if (bl) break;
                this.m += xh_0.a((float)this.m * f2 / 100.0f);
                break;
            }
            case 1: {
                if (bl) {
                    this.m = xh_0.a(f2);
                    break;
                }
                this.m = (int)((float)this.m + f2);
                break;
            }
        }
        if (this.m == 0) {
            this.ba();
        }
    }

    @Override
    public void al() {
        if (this.P && this.f != null && this.f.a(this.v)) {
            this.f.b(this.v).e(this.m);
            this.f.b(this.v).f(this.m);
            if (this.w) {
                this.f.b(this.v).c(this.m);
            }
            if (this.v == eps_0.B && this.h != null && this.h.d() != null) {
                this.h.d().t();
            }
        }
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
    protected void b(iQ iQ2) {
        iQ2.a(iq_0.ai().g(this.w).h(this.y));
    }

    @Override
    protected void c(iO iO2) {
        if (iO2.q()) {
            iq_0 iq_02 = iO2.r();
            this.w = iq_02.U();
            this.y = iq_02.W();
        }
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

