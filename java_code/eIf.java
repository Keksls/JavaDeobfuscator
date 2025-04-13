/*
 * Decompiled with CFR 0.152.
 */
public class eIf
extends eHV {
    private static final aqr_2 v = new eFw(new eFv("Polynome 1er degr\u00e9 : a0 + a1*lvl", new eFu("a0", eFx.c), new eFu("a1", eFx.c)), new eFv("Polynome 2nd degr\u00e9 : a0 + a1*lvl + a2*lvl^2", new eFu("a0", eFx.c), new eFu("a1", eFx.c), new eFu("a2", eFx.c)), new eFv("Polynome 3\u00e8me degr\u00e9 : a0 + a1*lvl + a2*lvl^2 + a3*lvl^3", new eFu("a0", eFx.c), new eFu("a1", eFx.c), new eFu("a2", eFx.c), new eFu("a3", eFx.c)), new eFv("Polynome 4\u00e8me degr\u00e9 : a0 + a1*lvl + a2*lvl^2 + ... + a4*lvl^4", new eFu("a0", eFx.c), new eFu("a1", eFx.c), new eFu("a2", eFx.c), new eFu("a3", eFx.c), new eFu("a4", eFx.c)), new eFv("Polynome 5\u00e8me degr\u00e9 : a0 + a1*lvl + a2*lvl^2 + ... + a5*lvl^5", new eFu("a0", eFx.c), new eFu("a1", eFx.c), new eFu("a2", eFx.c), new eFu("a3", eFx.c), new eFu("a4", eFx.c), new eFu("a5", eFx.c)), new eFv("Polynome 6\u00e8me degr\u00e9 : a0 + a1*lvl + a2*lvl^2 + ... + a6*lvl^6", new eFu("a0", eFx.c), new eFu("a1", eFx.c), new eFu("a2", eFx.c), new eFu("a3", eFx.c), new eFu("a4", eFx.c), new eFu("a5", eFx.c), new eFu("a6", eFx.c)), new eFv("Polynome 7\u00e8me degr\u00e9 : a0 + a1*lvl + a2*lvl^2 + ... + a7*lvl^7", new eFu("a0", eFx.c), new eFu("a1", eFx.c), new eFu("a2", eFx.c), new eFu("a3", eFx.c), new eFu("a4", eFx.c), new eFu("a5", eFx.c), new eFu("a6", eFx.c), new eFu("a7", eFx.c)));

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eIf() {
        this.M();
    }

    public eIf aD() {
        return new eIf();
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.c == null) {
            return;
        }
        short s2 = this.aZ();
        fil_0 fil_02 = fim_0.a().a(((efh_0)this.c).i());
        if (fil_02 != null) {
            this.B = fil_02.b(s2);
        }
        float f2 = 0.0f;
        for (int k = 0; k < ((efh_0)this.c).F(); ++k) {
            f2 += ((efh_0)this.c).a(k, s2) * (float)Hw.e(s2, k);
        }
        this.m = Math.round(f2);
    }

    @Override
    public efn_0 a(ejh_0 ejh_02, boolean bl) {
        efn_0 efn_02 = super.a(ejh_02, bl);
        efn_02.a(this.m);
        return efn_02;
    }

    @Override
    public boolean Q() {
        return true;
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
        this.m = 0;
    }

    @Override
    public /* synthetic */ eHV aE() {
        return this.aD();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

