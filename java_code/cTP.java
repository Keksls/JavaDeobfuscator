/*
 * Decompiled with CFR 0.152.
 */
public class cTP
extends cSS {
    private String a;

    @Override
    public cSY n() {
        return cSY.u;
    }

    @Override
    public void o() {
        bnh_1 bnh_12 = (bnh_1)this.l;
        azu_0.j().k().dE().a(bnh_12.dp());
    }

    @Override
    public boolean d() {
        if (!super.d()) {
            return false;
        }
        if (!(this.l instanceof bnh_1)) {
            return false;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        return bmr_12 != null;
    }

    @Override
    public boolean c() {
        eQb eQb2;
        if (!(this.l instanceof bnh_1)) {
            return false;
        }
        bnh_1 bnh_12 = (bnh_1)this.l;
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.a(erl_2.T)) {
            return false;
        }
        if (bnh_12.a(erl_2.T)) {
            return false;
        }
        if (bnh_12.ak()) {
            return false;
        }
        if (bmr_12.dE().d() && (eQb2 = bmr_12.dE().a()).f(bnh_12.a_())) {
            return false;
        }
        return !cSW.a(bnh_12);
    }

    @Override
    public String r() {
        return "invitToJoinGroup";
    }

    @Override
    public String q() {
        ani_2 ani_22 = new ani_2();
        if (!(this.l instanceof bnh_1)) {
            return null;
        }
        ani_22.a().a(f);
        ani_22.a((CharSequence)bae.h().a("desc.mru." + this.r(), ((epq_2)this.l).dp())).b();
        if (!this.d()) {
            ani_22.m().a(this.d() ? f : h);
            ani_22.a((CharSequence)bae.h().a(this.a, new Object[0]));
        }
        return ani_22.r();
    }

    @Override
    public cSS v() {
        return new cTP();
    }

    @Override
    protected int t() {
        return cUL.q.aH;
    }
}

