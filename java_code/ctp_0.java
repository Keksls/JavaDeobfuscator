/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cTp
 */
public class ctp_0
extends cSS {
    @Override
    public cSS v() {
        return new ctp_0();
    }

    @Override
    public boolean c() {
        if (!(this.l instanceof bnh_1)) {
            return false;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.cW()) {
            return false;
        }
        if (bmr_12.a(erl_2.U)) {
            return false;
        }
        bnh_1 bnh_12 = (bnh_1)this.l;
        if (bnh_12.a(erl_2.U)) {
            return false;
        }
        return !cSW.a(bnh_12);
    }

    @Override
    public void o() {
        if (!this.c()) {
            b.error((Object)("Tentative de lancement de l'action '" + this.n().e() + "' alors que isRunnable retourne que l'action est impossible"));
            return;
        }
        bnh_1 bnh_12 = (bnh_1)this.l;
        dfc dfc2 = new dfc();
        dfc2.a_(17113);
        dfc2.a(bnh_12.dp());
        add_2.b().a(dfc2);
    }

    @Override
    public cSY n() {
        return cSY.y;
    }

    @Override
    public String r() {
        return "createPrivateChat";
    }

    @Override
    public String q() {
        if (!(this.l instanceof bnh_1)) {
            return null;
        }
        ani_2 ani_22 = new ani_2();
        ani_22.a().a((CharSequence)bae.h().a("desc.mru." + this.r(), ((bnh_1)this.l).dp())).b();
        return ani_22.r();
    }

    @Override
    protected int t() {
        return cUL.f.aH;
    }
}

