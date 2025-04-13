/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eHE
 */
public class ehe_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Min, Max", new eFu("Min", eFx.b), new eFu("Max", eFx.b)));
    private efa_0 w;

    @Override
    public aqr_2 c_() {
        return v;
    }

    private ehe_0() {
    }

    public ehe_0(efa_0 efa_02) {
        this.w = efa_02;
    }

    public ehe_0 aD() {
        ehe_0 ehe_02 = new ehe_0();
        ehe_02.w = this.w;
        return ehe_02;
    }

    @Override
    public void M() {
        super.M();
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        ehj_0 ehj_02 = ehj_0.a(this.h, this.w, eKg.a, this.m, this.f);
        int n = efc_0.ci.a();
        switch (this.w) {
            case e: {
                n = efc_0.cm.a();
                break;
            }
            case d: {
                n = efc_0.ck.a();
                break;
            }
            case b: {
                n = efc_0.cj.a();
                break;
            }
            case c: {
                n = efc_0.cl.a();
            }
        }
        ehj_02.a(n);
        ehj_02.a((efi_0)this.d);
        ehj_02.a((efh_0)this.c);
        ehj_02.a(this.g.d(), this.g.e(), this.g.f());
        ehj_02.b(this.f);
        ehj_02.a(this.e);
        ehj_02.a((byte)1);
        ehj_02.aF();
        ehj_02.af();
        ehj_02.ad();
        this.j(true);
    }

    @Override
    public void j(sd_0 sd_02) {
        int n = ((efh_0)this.c).a(0, this.aZ(), eFb.a);
        int n2 = ((efh_0)this.c).a(1, this.aZ(), eFb.a);
        if (this.e.a(eoz_1.aZ)) {
            this.m = n;
            return;
        }
        if (this.e.a(eoz_1.ba)) {
            this.m = n2;
            return;
        }
        this.m = Hw.b(n, n2);
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
    protected boolean aA() {
        return true;
    }

    @Override
    public efa_0 br_() {
        return this.w;
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

