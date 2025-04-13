/*
 * Decompiled with CFR 0.152.
 */
public class cTj
extends cSS {
    private final aff_1 a;
    private boolean m = false;
    private int n = 2;
    private boolean o = true;
    private byte p = elx_0.d.a();
    private aff_1 q = null;
    private aff_1 r = null;
    private aff_1 s = null;
    private int[] t = null;

    public cTj() {
        this.a = new aff_1();
    }

    public cTj(aff_1 aff_12, boolean bl, int n, boolean bl2, byte by, aff_1 aff_13, int[] nArray, aff_1 aff_14, aff_1 aff_15) {
        this.a = aff_12;
        this.m = bl;
        this.n = n;
        this.o = bl2;
        this.p = by;
        this.q = aff_13;
        this.t = nArray;
        this.r = aff_14;
        this.s = aff_15;
    }

    @Override
    public cSS v() {
        return new cTj(this.a, this.m, this.n, this.o, this.p, this.q, this.t, this.r, this.s);
    }

    public void a(aff_1 aff_12) {
        this.q = aff_12;
    }

    public void a(byte by) {
        this.p = by;
    }

    public void a(int[] nArray) {
        this.t = nArray;
    }

    public void a(int n) {
        this.n = n;
    }

    public void a(boolean bl) {
        this.m = bl;
    }

    public void d(boolean bl) {
        this.o = bl;
    }

    public void b(aff_1 aff_12) {
        this.r = aff_12;
    }

    public void c(aff_1 aff_12) {
        this.s = aff_12;
    }

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
        biI biI2 = azu_0.j().k().bv();
        biI biI3 = ((blx_1)this.l).bv();
        int n = biI3.be();
        int n2 = biI3.bf();
        short s2 = (short)biI3.L();
        int n3 = biI2.G();
        int n4 = biI2.H();
        if (Math.abs(n - n3) <= 10 && Math.abs(n2 - n4) <= 10) {
            cnj_0 cnj_02 = new cnj_0();
            cnj_02.a(((blx_1)this.l).a_());
            cnj_02.a(n, n2, s2);
            cnj_02.a(this.q);
            cnj_02.a(this.p);
            cnj_02.a(this.t);
            cnj_02.b(this.n);
            cnj_02.a(this.m);
            cnj_02.b(this.o);
            cnj_02.b(this.r);
            cnj_02.c(this.s);
            azu_0.j().K().c(cnj_02);
        }
    }

    @Override
    public boolean c() {
        if (!(this.l instanceof blx_1)) {
            return false;
        }
        if (((blx_1)this.l).ak()) {
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
        return !((blx_1)this.l).a(erl_2.i);
    }

    @Override
    public String r() {
        return "trainingFightStart";
    }

    @Override
    protected int t() {
        return cSY.a.b();
    }
}

