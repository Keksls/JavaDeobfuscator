/*
 * Decompiled with CFR 0.152.
 */
public class eHn
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Valeur du modificateur", new eFu("Modificateur", eFx.b)), new eFv("M\u00e9tier concern\u00e9", new eFu("Modificateur", eFx.b), new eFu("Id du m\u00e9tier", eFx.c)));
    private eAE w;
    private int x;
    private int y;

    @Override
    public aqr_2 c_() {
        return v;
    }

    private eHn() {
    }

    public eHn(eAE eAE2, int n) {
        this.w = eAE2;
        this.x = n;
    }

    public eHn aD() {
        eHn eHn2 = new eHn();
        eHn2.w = this.w;
        eHn2.y = this.y;
        eHn2.x = this.x;
        return eHn2;
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.c == null) {
            return;
        }
        this.m = ((efh_0)this.c).a(0, this.aZ(), eFb.a);
        if (((efh_0)this.c).F() > 1) {
            this.y = ((efh_0)this.c).a(1, this.aZ(), eFb.a);
        }
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (!(this.f instanceof epq_2)) {
            a.warn((Object)"Target has to be a character");
            return;
        }
        epq_2 epq_22 = (epq_2)this.f;
        eAG eAG2 = epq_22.cv();
        if (this.y == 0) {
            eAG2.b(this.w, this.x, this.m);
        } else {
            eAG2.a(this.w, this.y, this.x, this.m);
        }
    }

    @Override
    public void al() {
        if (!(this.f instanceof epq_2)) {
            a.warn((Object)"Target has to be a character");
            return;
        }
        epq_2 epq_22 = (epq_2)this.f;
        eAG eAG2 = epq_22.cv();
        if (this.y == 0) {
            eAG2.b(this.w, this.x, -this.m);
        } else {
            eAG2.a(this.w, this.y, this.x, -this.m);
        }
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
        this.y = 0;
        this.x = 0;
    }

    @Override
    protected void b(iQ iQ2) {
        super.b(iQ2);
        iQ2.a(iQ2.r().aj().f(this.y));
    }

    @Override
    protected void c(iO iO2) {
        super.c(iO2);
        this.y = iO2.r().x();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

