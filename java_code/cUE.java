/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.Nullable;

public class cUE
extends cSR
implements afy_0 {
    protected aff_1 a;
    private boolean m;

    @Override
    public cSY n() {
        return cSY.G;
    }

    @Override
    public void o() {
        if (!this.c()) {
            return;
        }
        bmv_1 bmv_12 = (bmv_1)this.l;
        bMn bMn2 = bmv_12.cB();
        if (bMn2 != null) {
            bmr_1 bmr_12 = azu_0.j().k();
            if (!bmr_12.a(false, true)) {
                return;
            }
            fis_1.a().a("voteList", false);
            azu_0.j().a(ddH.a());
        }
    }

    @Override
    public boolean c() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.ak()) {
            return false;
        }
        if (bvz_2.a.a()) {
            return false;
        }
        if (!(this.l instanceof bmv_1)) {
            return false;
        }
        bMn bMn2 = ((bmv_1)this.l).cB();
        if (bMn2 == null) {
            return false;
        }
        faV faV2 = bmr_12.fE();
        if (bMn2.F() != faV2.n()) {
            return false;
        }
        if (bMn2.F() == 34) {
            return false;
        }
        faX faX2 = bMn2.D();
        if (faX2 == null) {
            return false;
        }
        return faX2.v();
    }

    @Override
    public String q() {
        if (this.d()) {
            return super.q();
        }
        ani_2 ani_22 = new ani_2();
        ani_22.a().a((CharSequence)bae.h().a("desc.mru." + this.r(), new Object[0])).b().a((CharSequence)"\n");
        ani_22.i().a(h);
        if (!this.m) {
            ani_22.a((CharSequence)bae.h().a("error.playerNotSubscriptionRight", new Object[0])).j();
        }
        return ani_22.r();
    }

    @Override
    public String r() {
        return "vote";
    }

    @Override
    public cSS v() {
        return new cUE();
    }

    @Override
    public void pathEnded(afe_0 afe_02, int n, int n2, short s2) {
        afe_02.c(this);
        azu_0.j().a(ddH.a());
    }

    @Override
    protected int t() {
        return cUL.l.aH;
    }

    @Override
    public boolean d() {
        boolean bl = super.d();
        if (!bl) {
            return false;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.a(enw_0.d)) {
            return true;
        }
        this.m = false;
        return false;
    }

    @Override
    @Nullable
    public List<fde> k() {
        return null;
    }

    @Override
    @Nullable
    public List<fde> l() {
        if (cUE.j() != fbl_0.b) {
            return null;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        feF feF2 = new feF(bmr_12);
        List<fde> list = feF2.b();
        feh_0 feh_02 = new feh_0(bmr_12, -1L);
        list.addAll(feh_02.b());
        faX faX2 = bmr_12.fE().m();
        fcq_0 fcq_02 = faX2.D().c();
        if (fcq_02 != null) {
            feh_0 feh_03 = new feh_0(bmr_12, fcq_02.a());
            list.addAll(feh_03.b());
        }
        return list;
    }

    public String toString() {
        return "MRUVoteAction{m_pathDestination=" + this.a + "}";
    }
}

