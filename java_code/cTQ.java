/*
 * Decompiled with CFR 0.152.
 */
public class cTQ
extends cSS {
    private String a;

    @Override
    public cSY n() {
        return cSY.aw;
    }

    @Override
    public void o() {
        bnh_1 bnh_12 = (bnh_1)this.l;
        dgx_0 dgx_02 = new dgx_0();
        dgx_02.b(bnh_12.dp());
        add_2.b().a(dgx_02);
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
        if (!(this.l instanceof bnh_1)) {
            return false;
        }
        bnh_1 bnh_12 = (bnh_1)this.l;
        return byp_2.a().a(bnh_12);
    }

    @Override
    public String r() {
        return "inviteToJoinGuild";
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
        return new cTQ();
    }

    @Override
    protected int t() {
        return cUL.ab.aH;
    }
}

