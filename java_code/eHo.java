/*
 * Decompiled with CFR 0.152.
 */
public class eHo
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Valeur du modificateur", new eFu("Modificateur", eFx.b)), new eFv("M\u00e9tier concern\u00e9", new eFu("Modificateur", eFx.b), new eFu("Id du m\u00e9tier", eFx.c)));
    private int w;

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eHo aD() {
        eHo eHo2 = new eHo();
        eHo2.w = this.w;
        return eHo2;
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.c == null) {
            return;
        }
        this.m = ((efh_0)this.c).a(0, this.aZ(), eFb.a);
        if (((efh_0)this.c).F() > 1) {
            this.w = ((efh_0)this.c).a(1, this.aZ(), eFb.a);
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
        if (this.w == 0) {
            eAG2.b(eAE.a, 2, this.m);
            eAG2.b(eAE.a, 3, this.m);
            eAG2.b(eAE.a, 8, this.m);
        } else {
            eAG2.a(eAE.a, this.w, 2, this.m);
            eAG2.a(eAE.a, this.w, 3, this.m);
            eAG2.a(eAE.a, this.w, 8, this.m);
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
        if (this.w == 0) {
            eAG2.b(eAE.a, 2, -this.m);
            eAG2.b(eAE.a, 3, -this.m);
            eAG2.b(eAE.a, 8, -this.m);
        } else {
            eAG2.a(eAE.a, this.w, 2, -this.m);
            eAG2.a(eAE.a, this.w, 3, -this.m);
            eAG2.a(eAE.a, this.w, 8, -this.m);
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
        this.w = 0;
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

