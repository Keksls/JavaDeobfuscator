/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cUe
 */
public class cue_0
extends cSS
implements afy_0 {
    private int a;
    private aff_1 m;

    public cue_0() {
    }

    public cue_0(int n) {
        this.a = n;
    }

    public cue_0 a() {
        return new cue_0(this.a);
    }

    @Override
    public String r() {
        return "followMonster";
    }

    @Override
    public boolean c() {
        if (azu_0.j().k().ak()) {
            return false;
        }
        return !bvz_2.a.a();
    }

    @Override
    public void o() {
        if (!this.c()) {
            b.error((Object)("Tentative de lancement de l'action '" + this.n().e() + "' alors que isRunnable retourne que l'action est impossible"));
            return;
        }
        bmv_1 bmv_12 = (bmv_1)this.l;
        this.m = bmv_12.P_();
        bmr_1 bmr_12 = azu_0.j().k();
        if (!bmr_12.a(false, true)) {
            return;
        }
        bmr_12.bv().b(this);
        if (!azu_0.j().k().b(this.m, true, true)) {
            azu_0.j().k().bv().c(this);
            if (Math.abs(bmr_12.bv().ap().d() - this.m.d()) <= 1 && Math.abs(bmr_12.bv().ap().e() - this.m.e()) <= 1) {
                clb_1 clb_12 = new clb_1();
                clb_12.b(this.a);
                azu_0.j().K().c(clb_12);
            }
        }
    }

    @Override
    public cSY n() {
        return cSY.x;
    }

    @Override
    public void pathEnded(afe_0 afe_02, int n, int n2, short s2) {
        afe_02.c(this);
        clb_1 clb_12 = new clb_1();
        clb_12.b(this.a);
        azu_0.j().K().c(clb_12);
    }

    @Override
    protected int t() {
        return cUL.L.aH;
    }

    public void a(int n) {
        this.a = n;
    }

    @Override
    public /* synthetic */ cSS v() {
        return this.a();
    }
}

