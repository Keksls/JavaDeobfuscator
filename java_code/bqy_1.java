/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bQY
 */
public class bqy_1
extends bqw_0 {
    @Override
    public void a(TG tG, epq_2 epq_22) {
        int n = (int)tG.a_();
        long l = epq_22.U_();
        if (fjq_0.a(l, fjv.b, n)) {
            return;
        }
        ((bFZ)tG).b(Tv.y);
    }

    @Override
    public void b(TG tG, epq_2 epq_22) {
        cXX.a().a((bFN)tG);
        ((Tw)((Object)tG)).b(Tv.a);
    }

    @Override
    public fjp_0 a(epq_2 epq_22, TG tG, long l) {
        if (!emj_0.a.a((emh_0)((Object)epq_22))) {
            return fjp_0.f;
        }
        if (!(epq_22 instanceof bmr_1) || ((bmr_1)epq_22).ba() != fhD.a) {
            return fjp_0.k;
        }
        fjA fjA2 = (fjA)fjs.a.a(this.a(), tG.a_());
        if (!fjA2.a(epq_22)) {
            return fjp_0.d;
        }
        return fjp_0.a;
    }

    @Override
    protected void b(epq_2 epq_22, TG tG, long l) {
        cqT cqT2 = new cqT(tG.a_(), l);
        azu_0.j().K().c(cqT2);
    }

    @Override
    public boolean a(bmr_1 bmr_12, bFN bFN2) {
        return this.a(bmr_12, bFN2, -1L) == fjp_0.a;
    }

    @Override
    public fjv a() {
        return fjv.b;
    }

    @Override
    public String a(bFN bFN2) {
        return bae.h().a(82, (long)((int)bFN2.a_()), new Object[0]);
    }

    @Override
    @Nullable
    public String b(bFN bFN2) {
        bmr_1 bmr_12 = azu_0.j().k();
        ani_2 ani_22 = new ani_2();
        fjp_0 fjp_02 = this.a(bmr_12, bFN2, -1L);
        ani_22.a((fjp_02 == fjp_0.a ? azf_2.j : azf_2.h).w());
        if (fjp_02 == fjp_0.d) {
            ani_22.m().a((CharSequence)bae.h().a("chat.travel.invalidCriterion", new Object[0]));
        }
        return ani_22.r();
    }
}

