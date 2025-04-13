/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cUj
 */
public class cuj_0
extends cSS {
    private String a;

    @Override
    public cSY n() {
        return cSY.S;
    }

    @Override
    public void o() {
        bnh_1 bnh_12 = (bnh_1)this.l;
        daX.a.g().f(bnh_12.dp());
        if (!azu_0.j().c(daX.a)) {
            azu_0.j().a(daX.a);
        }
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
        if (bmr_12 == null) {
            return false;
        }
        return !emp_0.a(azu_0.j().n().v(), emp_0.b);
    }

    @Override
    public boolean c() {
        if (!(this.l instanceof bnh_1)) {
            return false;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return false;
        }
        return !emp_0.a(azu_0.j().n().v(), emp_0.b);
    }

    @Override
    public String r() {
        return "openModerationPanel";
    }

    @Override
    public String q() {
        ani_2 ani_22 = new ani_2();
        if (!(this.l instanceof bnh_1)) {
            return null;
        }
        ani_22.a().a(f);
        ani_22.a((CharSequence)bae.h().a("desc.mru." + this.r(), ((bnh_1)this.l).dp())).b();
        if (!this.d()) {
            ani_22.m().a(this.d() ? f : h);
            ani_22.a((CharSequence)bae.h().a(this.a, new Object[0]));
        }
        return ani_22.r();
    }

    @Override
    public cSS v() {
        return new cuj_0();
    }

    @Override
    protected int t() {
        return cUL.o.aH;
    }
}

