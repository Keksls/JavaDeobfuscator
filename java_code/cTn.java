/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class cTn
extends cSS
implements afy_0 {
    private final boolean a;
    private fii m;
    private bre_1 n = bre_1.a;

    public cTn(boolean bl) {
        this.a = bl;
    }

    public cTn(fii fii2, boolean bl) {
        this.m = fii2;
        this.a = bl;
    }

    public cTn a() {
        return new cTn(this.m, this.a);
    }

    public void a(fii fii2) {
        this.m = fii2;
    }

    @Override
    public String r() {
        return this.m.d();
    }

    @Override
    public String q() {
        ani_2 ani_22 = new ani_2();
        ani_22.a().a((CharSequence)bae.h().a("desc.mru." + this.r(), new Object[0]));
        if (this.a) {
            ani_22.a((CharSequence)" (").a((CharSequence)bae.h().a("craft.improvise", new Object[0])).a((CharSequence)")");
        }
        ani_22.b();
        if (!this.d() && this.n != bre_1.a) {
            ani_22.a((CharSequence)"\n").i().a(h);
            switch (this.n) {
                case b: {
                    ani_22.a((CharSequence)bae.h().a("craft.unknown", new Object[0])).j();
                    break;
                }
                case c: {
                    ani_22.a((CharSequence)bae.h().a("error.playerNotSubscribed", new Object[0])).j();
                    break;
                }
                case g: {
                    ani_22.a((CharSequence)bae.h().a("craft.error.kamaCraftingNotAllowed", new Object[0])).j();
                }
            }
        }
        return ani_22.r();
    }

    @Override
    public boolean c() {
        bmr_1 bmr_12 = azu_0.j().k();
        bsx_2 bsx_22 = bmr_12.di();
        if (bsx_22 != null && bsx_22.q() != bmr_12.a_()) {
            return false;
        }
        if (this.a && bmr_12.gR()) {
            return false;
        }
        this.c(true);
        return true;
    }

    @Override
    public boolean d() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (!emj_0.b.a(new emh_0[]{bmr_12})) {
            this.n = bre_1.c;
            return false;
        }
        if (this.a && bmr_12.gR()) {
            this.n = bre_1.f;
            return false;
        }
        int n = ((bgq_1)this.l).Z();
        Optional<ece_0> optional = bmr_12.eW();
        if (optional.isEmpty()) {
            this.n = bre_1.e;
            return false;
        }
        if (!optional.get().e(n)) {
            this.n = bre_1.b;
            return false;
        }
        boolean bl = enp_2.a.d(ens_2.aE);
        bgl_1 bgl_12 = ((bgq_1)this.l).aa();
        if (bgl_12 != null && !bl && eoq_0.c.contains((short)bgl_12.m())) {
            this.n = bre_1.g;
            return false;
        }
        this.n = bre_1.a;
        return true;
    }

    @Override
    public void o() {
        if (!this.c()) {
            b.error((Object)("Tentative de lancement de l'action '" + this.n().e() + "' alors que isRunnable retourne que l'action est impossible"));
            return;
        }
        bFZ bFZ2 = (bFZ)this.l;
        bmr_1 bmr_12 = azu_0.j().k();
        if (!bmr_12.a(false, true)) {
            return;
        }
        bmr_12.bv().b(this);
        if (!bmr_12.a(false, true, bFZ2.aK_())) {
            bmr_12.bv().c(this);
            if (!bmr_12.bv().ba() && bFZ2.c(bmr_12.bv().ap())) {
                this.b();
            } else {
                aUh.a("too.far.to.interact", new Object[0]);
            }
        }
    }

    @Override
    public cSY n() {
        return this.a ? cSY.O : cSY.o;
    }

    @Override
    public void pathEnded(afe_0 afe_02, int n, int n2, short s2) {
        afe_02.c(this);
        bFZ bFZ2 = (bFZ)this.l;
        bmr_1 bmr_12 = azu_0.j().k();
        if (bFZ2.c(bmr_12.bv().ap())) {
            this.b();
        }
    }

    @Override
    protected int t() {
        return this.a ? cUL.an.aH : this.m.c();
    }

    protected void b() {
        bmr_1 bmr_12 = azu_0.j().k();
        bgq_1 bgq_12 = (bgq_1)this.l;
        bmr_12.bv().a(bmr_12.P_().a(bgq_12.G(), bgq_12.H(), (short)0));
        cXC.a().a((bgq_1)this.l, this.a);
    }

    @Override
    public /* synthetic */ cSS v() {
        return this.a();
    }
}

