/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bRa
 */
public class bra_1
extends bqw_0 {
    @Override
    public void a(TG tG, epq_2 epq_22) {
        int n = (int)tG.a_();
        long l = epq_22.U_();
        if (fjq_0.a(l, fjv.a, n)) {
            return;
        }
        ((bFZ)tG).b(Tv.y);
    }

    @Override
    public void b(TG tG, epq_2 epq_22) {
        del_0.a().a((bFN)tG);
        ((Tw)((Object)tG)).b(Tv.a);
    }

    @Override
    public fjp_0 a(epq_2 epq_22, TG tG, long l) {
        fjE fjE2 = (fjE)fjs.a.a(fjv.a, l);
        if (!fjE2.a(epq_22)) {
            return fjp_0.d;
        }
        if (bra_1.a((bmr_1)epq_22) && euu_2.a((long)fjE2.c(), (long)fjE2.c()) != enX.a) {
            return fjp_0.j;
        }
        return fjp_0.a;
    }

    private static boolean a(bmr_1 bmr_12) {
        if (euw_2.a.h(bmr_12.U_()) > 1) {
            return true;
        }
        return bmr_12.dE().a() != null && !bmr_12.dE().a().c(bmr_12.U_()).isEmpty();
    }

    @Override
    protected void b(epq_2 epq_22, TG tG, long l) {
        this.b();
        del_0.a().c();
        ado_1.a().a(new brb_1(this, tG, l), 500L, 1);
    }

    private void b() {
        FreeParticleSystem freeParticleSystem = aij_0.a().a(800102);
        if (freeParticleSystem != null) {
            freeParticleSystem.a(azu_0.j().k().e());
            aik_0.a().b(freeParticleSystem);
        }
    }

    @Override
    public boolean a(bmr_1 bmr_12, bFN bFN2) {
        return !bmr_12.a(erl_2.aW);
    }

    @Override
    public fjv a() {
        return fjv.a;
    }

    @Override
    public String a(bFN bFN2) {
        return bae.h().a(36, (long)((int)bFN2.a_()), new Object[0]);
    }

    @Override
    @Nullable
    public String b(bFN bFN2) {
        return null;
    }
}

