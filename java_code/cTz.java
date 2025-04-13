/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class cTz
extends cSR {
    public static final int a = 0;
    public static final int m = 1;
    public static final int n = 2;
    private static final int o = 3;
    private static final int p = 4;
    private static final int q = 5;
    afy_0 r;
    private int s;

    @Override
    public cSY n() {
        return cSY.c;
    }

    @Override
    public cSS v() {
        return new cTz();
    }

    @Override
    public void o() {
        bnh_1 bnh_12;
        if (!this.c()) {
            b.error((Object)("Tentative de lancement de l'action '" + this.n().e() + "' alors que isRunnable retourne que l'action est impossible"));
            return;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        biI biI2 = bmr_12.bv();
        if (this.r != null) {
            biI2.c(this.r);
        }
        if (aUh.a((bnh_12 = (bnh_1)this.l).dp(), eAO.c)) {
            return;
        }
        int n = bnh_12.G() - biI2.G();
        int n2 = bnh_12.H() - biI2.H();
        if (Math.abs(n) <= 1 && Math.abs(n2) <= 1) {
            biI2.a(afs_2.a(n, n2));
            cmg_0 cmg_02 = new cmg_0();
            cmg_02.a(bnh_12.a_());
            azu_0.j().K().c(cmg_02);
            return;
        }
        this.r = new cta_0(this);
        biI2.b(this.r);
        bmr_12.b(((bnh_1)this.l).P_(), true, true);
    }

    @Override
    public boolean d() {
        bmr_1 bmr_12 = azu_0.j().k();
        bnh_1 bnh_12 = (bnh_1)this.l;
        if (!bmr_12.a(enw_0.f)) {
            this.s = 3;
            return false;
        }
        if (!bnh_12.a(enw_0.f)) {
            this.s = 4;
            return false;
        }
        if (bmr_12.eY() || bnh_12.eY()) {
            this.s = 1;
            return false;
        }
        if (azu_0.j().n().f()) {
            this.s = 5;
            return false;
        }
        return true;
    }

    @Override
    public boolean c() {
        if (!(this.l instanceof bnh_1)) {
            return false;
        }
        blx_1 blx_12 = (blx_1)this.l;
        if (blx_12.a_() <= 0L) {
            return false;
        }
        if (blx_12.ak()) {
            return false;
        }
        if (blx_12.a(erl_2.S)) {
            return false;
        }
        if (blx_12.fl() != null && blx_12.fl().ac_() == 4) {
            return false;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.cW()) {
            return false;
        }
        if (bmr_12.a(erl_2.S)) {
            return false;
        }
        if (bmr_12.ak()) {
            return false;
        }
        if (bvz_2.a.a()) {
            return false;
        }
        return !cSW.a(blx_12);
    }

    @Override
    public String r() {
        return "trade";
    }

    @Override
    public String q() {
        if (!this.d()) {
            ani_2 ani_22 = new ani_2();
            ani_22.a().a((CharSequence)bae.h().a("desc.mru." + this.r(), new Object[0])).b().a((CharSequence)"\n");
            ani_22.i().a(h);
            switch (this.s) {
                case 2: {
                    ani_22.a((CharSequence)bae.h().a("error.someoneNotSubscribed", new Object[0])).j();
                    break;
                }
                case 4: {
                    ani_22.a((CharSequence)bae.h().a("error.targetNotSubscriptionRight", new Object[0])).j();
                    break;
                }
                case 3: {
                    ani_22.a((CharSequence)bae.h().a("error.playerNotSubscriptionRight", new Object[0])).j();
                    break;
                }
                case 1: {
                    ani_22.a((CharSequence)bae.h().a("exchange.forbidden.in.prison", new Object[0])).j();
                    break;
                }
                case 5: {
                    ani_22.a((CharSequence)bae.h().a("security.impossible.action.account.locked", new Object[0])).j();
                }
            }
            return ani_22.r();
        }
        if (!(this.l instanceof blx_1)) {
            return this.r();
        }
        ani_2 ani_23 = new ani_2().a().a(f);
        ani_23.a((CharSequence)bae.h().a("exchange.with", ((blx_1)this.l).dp())).b();
        return ani_23.r();
    }

    @Override
    protected int t() {
        return cUL.b.aH;
    }

    @Override
    public List<fde> k() {
        if (cTz.j() != fbl_0.b) {
            return null;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        few_0 few_02 = new few_0(bmr_12, (faU)this.l);
        ArrayList<fde> arrayList = new ArrayList<fde>();
        arrayList.addAll(few_02.b());
        return arrayList;
    }

    @Override
    public List<fde> l() {
        return null;
    }
}

