/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class cUx
extends cSS
implements afy_0 {
    private bre_1 a = bre_1.a;
    private fii m;

    public cUx() {
    }

    public cUx(fii fii2) {
        this.m = fii2;
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
                this.a();
            } else {
                aUh.a("too.far.to.interact", new Object[0]);
            }
        }
    }

    @Override
    public String q() {
        ani_2 ani_22 = new ani_2();
        ani_22.a().a((CharSequence)bae.h().a("desc.mru." + this.r(), new Object[0])).b();
        String string = azu_0.j().k().di().s();
        ani_22.a('\n').a((CharSequence)bae.h().a("craft.secured.machine.owner", string));
        if (!this.d() && this.a != bre_1.a) {
            ani_22.a((CharSequence)"\n").i().a(h);
            switch (this.a) {
                case b: {
                    ani_22.a((CharSequence)bae.h().a("craft.secured.craft.unknown", new Object[0]));
                    break;
                }
                case c: {
                    ani_22.a((CharSequence)bae.h().a("error.playerNotSubscribed", new Object[0]));
                    break;
                }
                case d: {
                    ani_22.a((CharSequence)bae.h().a("craft.secured.craftsman.absent", new Object[0]));
                    break;
                }
            }
            ani_22.j();
        }
        return ani_22.toString();
    }

    @Override
    public boolean d() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (!emj_0.b.a(new emh_0[]{bmr_12})) {
            this.a = bre_1.c;
            return false;
        }
        bsx_2 bsx_22 = bmr_12.di();
        if (bsx_22 == null) {
            return false;
        }
        long l = bsx_22.q();
        bnh_1 bnh_12 = (bnh_1)bmf_2.a().c(l);
        if (bnh_12 == null) {
            this.a = bre_1.d;
            return false;
        }
        Optional<ece_0> optional = bnh_12.eW();
        if (optional.isEmpty()) {
            this.a = bre_1.e;
            return false;
        }
        int n = ((bgq_1)this.l).Z();
        if (!optional.get().e(n)) {
            this.a = bre_1.b;
            return false;
        }
        return true;
    }

    @Override
    public boolean c() {
        bmr_1 bmr_12 = azu_0.j().k();
        bsx_2 bsx_22 = bmr_12.di();
        if (bsx_22 == null) {
            return false;
        }
        if (bsx_22.q() == bmr_12.a_()) {
            return false;
        }
        this.c(true);
        return true;
    }

    @Override
    public String r() {
        return this.m.d();
    }

    @Override
    public void pathEnded(afe_0 afe_02, int n, int n2, short s2) {
        afe_02.c(this);
        bFZ bFZ2 = (bFZ)this.l;
        bmr_1 bmr_12 = azu_0.j().k();
        if (bFZ2.c(bmr_12.bv().ap())) {
            this.a();
        }
    }

    public void a() {
        bgq_1 bgq_12 = (bgq_1)this.l;
        bmr_1 bmr_12 = azu_0.j().k();
        bmr_12.bv().a(bmr_12.P_().a(bgq_12.G(), bgq_12.H(), (short)0));
        cXC.a().a((bgq_1)this.l, false);
    }

    @Override
    public cSS v() {
        return new cUx(this.m);
    }

    @Override
    public cSY n() {
        return cSY.ai;
    }

    @Override
    protected int t() {
        return this.m.c();
    }

    public fii b() {
        return this.m;
    }

    public void a(fii fii2) {
        this.m = fii2;
    }
}

