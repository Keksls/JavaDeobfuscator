/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class cTF
extends cSR
implements afy_0 {
    protected String a;
    protected int m;
    private Tv n;

    public cTF() {
    }

    private cTF(String string, int n) {
        this.a = string;
        this.m = n;
    }

    public cTF a() {
        return new cTF(this.a, this.m);
    }

    @Override
    public String r() {
        return this.a;
    }

    @Override
    public List<fde> k() {
        if (cTF.j() != fbl_0.b) {
            return null;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        feG feG2 = new feG(bmr_12);
        feG2.a(((TH)this.l).a_());
        return feG2.b();
    }

    @Override
    public List<fde> l() {
        return null;
    }

    @Override
    public boolean c() {
        return !azu_0.j().k().ak() && !bvz_2.a.a();
    }

    @Override
    public void o() {
        if (!this.c()) {
            b.error((Object)("Tentative de lancement de l'action '" + this.n().e() + "' alors que isRunnable retourne que l'action est impossible"));
            return;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (!bmr_12.a(false, true)) {
            return;
        }
        bmr_12.bv().b(this);
        pj_0 pj_02 = (pj_0)this.l;
        if (!bmr_12.a(false, true, pj_02.aK_())) {
            bmr_12.bv().c(this);
            this.e();
        }
    }

    private void e() {
        this.a(this.n);
    }

    @Override
    public cSY n() {
        return cSY.w;
    }

    @Override
    public void pathEnded(afe_0 afe_02, int n, int n2, short s2) {
        afe_02.c(this);
        this.e();
    }

    @Override
    protected int t() {
        return this.m;
    }

    @Override
    public boolean d() {
        return super.d() && this.b();
    }

    public boolean b() {
        return ((bFZ)this.l).aF_();
    }

    @Override
    public String q() {
        ani_2 ani_22 = new ani_2().a().a(this.d() ? f : h);
        String string = this.b() ? this.a : "error.playerNotSubscribed";
        ani_22.a((CharSequence)bae.h().a(string, new Object[0])).b();
        return ani_22.r();
    }

    public void a(String string) {
        this.a = string;
    }

    public void a(int n) {
        this.m = n;
    }

    public void b(Tv tv) {
        this.n = tv;
    }

    public String toString() {
        return "MRUGenericInteractiveAction{m_name='" + this.a + "', m_gfxId=" + this.m + ", m_actionToExecute=" + this.n + "}";
    }

    @Override
    public /* synthetic */ cSS v() {
        return this.a();
    }
}

