/*
 * Decompiled with CFR 0.152.
 */
public class eGw
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Script Id", new eFu("Script Id", eFx.b)));

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eGw aD() {
        eGw eGw2 = new eGw();
        return eGw2;
    }

    @Override
    public void M() {
        super.M();
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.f == null) {
            this.ba();
            return;
        }
        if (!(this.f instanceof epq_2)) {
            return;
        }
        epq_2 epq_22 = (epq_2)this.f;
        epq_22.p(this.m);
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.c == null) {
            return;
        }
        this.m = ((efh_0)this.c).a(0, this.aZ(), eFb.a);
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
    public void al() {
        if (this.f == null) {
            return;
        }
        if (!(this.f instanceof epq_2)) {
            return;
        }
        epq_2 epq_22 = (epq_2)this.f;
        epq_22.p(-1);
    }

    @Override
    public boolean aA() {
        return true;
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

