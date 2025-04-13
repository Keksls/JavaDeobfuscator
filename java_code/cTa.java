/*
 * Decompiled with CFR 0.152.
 */
public class cTa
extends cSS
implements afy_0 {
    private fii a;

    public cTa() {
    }

    public cTa(fii fii2) {
        this.a = fii2;
    }

    public cTa a() {
        return new cTa(this.a);
    }

    public void a(fii fii2) {
        this.a = fii2;
    }

    @Override
    public String r() {
        return this.a.d();
    }

    @Override
    public String q() {
        ani_2 ani_22 = new ani_2();
        ani_22.a().a((CharSequence)bae.h().a("desc.mru." + this.r(), new Object[0]));
        return ani_22.r();
    }

    @Override
    public boolean c() {
        bmr_1 bmr_12 = azu_0.j().k();
        bsx_2 bsx_22 = bmr_12.di();
        if (bsx_22 != null) {
            return false;
        }
        this.c(true);
        return true;
    }

    @Override
    public void o() {
        if (!this.c()) {
            b.error((Object)("Trying to run '" + this.n().e() + "' but isRunnable returns false!"));
            return;
        }
        bFZ bFZ2 = (bFZ)this.l;
        bmr_1 bmr_12 = azu_0.j().k();
        if (!bmr_12.a(false, true)) {
            return;
        }
        bmr_12.bv().b(this);
        if (bmr_12.a(false, true, bFZ2.aK_())) {
            return;
        }
        bmr_12.bv().c(this);
        if (!bmr_12.bv().ba() && bFZ2.c(bmr_12.bv().ap())) {
            this.b();
            return;
        }
        aUh.a("too.far.to.interact", new Object[0]);
    }

    @Override
    public cSY n() {
        return cSY.p;
    }

    @Override
    public void pathEnded(afe_0 afe_02, int n, int n2, short s2) {
        afe_02.c(this);
        bFZ bFZ2 = (bFZ)this.l;
        bmr_1 bmr_12 = azu_0.j().k();
        if (!bFZ2.c(bmr_12.bv().ap())) {
            return;
        }
        this.b();
    }

    @Override
    protected int t() {
        return this.a.c();
    }

    protected void b() {
        bmr_1 bmr_12 = azu_0.j().k();
        bar_1 bar_12 = (bar_1)this.l;
        bmr_12.bv().a(bmr_12.P_().a(bar_12.G(), bar_12.H(), (short)0));
        cVS.b.a((bFZ)bar_12);
    }

    @Override
    public /* synthetic */ cSS v() {
        return this.a();
    }
}

