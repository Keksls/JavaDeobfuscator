/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cTf
 */
public final class ctf_0
extends cSS {
    @Override
    public cSY n() {
        return cSY.q;
    }

    @Override
    public void o() {
        if (!this.c()) {
            b.error((Object)("Tentative de lancement de l'action '" + this.n().e() + "' alors que isRunnable retourne que l'action est impossible"));
            return;
        }
        b.info((Object)("Demande de lancement de combat d'arene sur le perso " + this.l));
        biI biI2 = azu_0.j().k().bv();
        blx_1 blx_12 = (blx_1)this.l;
        biI biI3 = blx_12.bv();
        int n = biI3.be();
        int n2 = biI3.bf();
        short s2 = (short)biI3.L();
        if (aob_2.c((aoc_2)biI2, biI3) > 25) {
            return;
        }
        if (aUh.a(blx_12.dp(), eAO.a)) {
            return;
        }
        this.a(n, n2, s2);
        this.a();
    }

    private void a() {
        aUh.c("fight.invitation", ((blx_1)this.l).dp());
    }

    private void a(int n, int n2, short s2) {
        cmu_0 cmu_02 = new cmu_0();
        cmu_02.a(((blx_1)this.l).a_());
        cmu_02.a(n, n2, s2);
        cmu_02.a((byte)2);
        cmu_02.a(((bvx_0)ans_0.D().h()).a(bWe.G));
        azu_0.j().K().c(cmu_02);
    }

    @Override
    public boolean c() {
        if (!(this.l instanceof blx_1)) {
            return false;
        }
        blx_1 blx_12 = (blx_1)this.l;
        if (blx_12.ak()) {
            return false;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.ak()) {
            return false;
        }
        if (bmr_12.di() != null) {
            return false;
        }
        if (bmr_12.cW()) {
            return false;
        }
        if (bvz_2.a.a()) {
            return false;
        }
        if (bmr_12.b(erl_2.g) > 0) {
            return false;
        }
        if (blx_12.a(erl_2.i)) {
            return false;
        }
        if (!bmr_12.a(erl_2.aI)) {
            return false;
        }
        return blx_12.a(erl_2.aI);
    }

    @Override
    public String r() {
        return "castArenaFight";
    }

    @Override
    public cSS v() {
        return new ctf_0();
    }

    @Override
    protected int t() {
        return cSY.a.b();
    }
}

