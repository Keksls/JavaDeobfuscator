/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cTT
 */
public class ctt_0
extends cSS {
    @Override
    public cSS v() {
        return new ctt_0();
    }

    @Override
    public boolean c() {
        if (!(this.l instanceof bnh_1)) {
            return false;
        }
        bsx_2 bsx_22 = azu_0.j().k().di();
        bmr_1 bmr_12 = azu_0.j().k();
        if (bsx_22 == null) {
            return false;
        }
        if (bsx_22.q() != azu_0.j().k().a_()) {
            return false;
        }
        if (bmr_12.cW()) {
            return false;
        }
        return !bmr_12.ak();
    }

    @Override
    public void o() {
        bnh_1 bnh_12 = (bnh_1)this.l;
        cpH cpH2 = new cpH();
        cpH2.a(bnh_12.a_());
        azu_0.j().K().c(cpH2);
    }

    @Override
    public cSY n() {
        return cSY.d;
    }

    @Override
    public String r() {
        return "kick";
    }

    @Override
    protected int t() {
        return cUL.o.aH;
    }
}

