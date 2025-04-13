/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class bFN
extends bFZ {
    static final Logger s = Logger.getLogger(bFN.class);
    protected fjv q;

    @Override
    public boolean b(Tv tv, TF tF) {
        Object Provider2 = fjq_0.a(this.q);
        this.a(tv);
        switch (tv) {
            case a: {
                ((fju)Provider2).b(this, (epq_2)((Object)tF));
                return true;
            }
            case y: {
                ((fju)Provider2).a(this, (epq_2)((Object)tF));
                this.a((bnh_1)tF);
                return true;
            }
        }
        s.error((Object)("Impossible d'effectuer une action " + tv + " sur une machine de transport de type " + this.q), (Throwable)new IllegalArgumentException());
        return false;
    }

    @Override
    public Tv ap_() {
        ay_0 ay_02;
        if (this.q == fjv.d) {
            return Tv.a;
        }
        long l = azu_0.j().n().u();
        switch (this.q) {
            case a: {
                ay_02 = ay_0.a;
                break;
            }
            case b: {
                ay_02 = ay_0.b;
                break;
            }
            default: {
                return Tv.a;
            }
        }
        return fjq_0.a(l, ay_02, (int)this.d) ? Tv.a : Tv.y;
    }

    @Override
    public byte W() {
        return 8;
    }

    @Override
    public Tv[] r() {
        if (this.q == fjv.d) {
            return new Tv[]{Tv.a};
        }
        return new Tv[]{Tv.a, Tv.y};
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.b(true);
        this.g(true);
        this.i(true);
        assert (this.q == null);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.q = null;
    }

    @Override
    public cSS[] az_() {
        cto_0 cto_02;
        Object Info = fjs.a.a(this.q, this.d);
        fii fii2 = fij.a().a(((fjB)Info).f());
        long l = azu_0.j().n().u();
        if (fjq_0.a(l, this.q, (int)this.d)) {
            cto_02 = (cto_0)cSY.M.a();
            cto_02.d("desc.mru." + fii2.d());
        } else {
            cto_02 = (cto_0)cSY.v.a();
            cto_02.d("zaap.discover");
        }
        cto_02.a(fii2.c());
        return new cSS[]{cto_02};
    }

    @Override
    public String al_() {
        bqw_0 bqw_02 = (bqw_0)fjq_0.a(this.q);
        return bqw_02.a(this);
    }

    public fjv ao() {
        return this.q;
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    private void a(bnh_1 bnh_12) {
        FreeParticleSystem freeParticleSystem = aij_0.a().a(800110);
        if (freeParticleSystem != null) {
            freeParticleSystem.a(bnh_12.bv());
            aik_0.a().b(freeParticleSystem);
        }
    }

    @Nullable
    public String ap() {
        bqw_0 bqw_02 = (bqw_0)fjq_0.a(this.q);
        return bqw_02.b(this);
    }

    public boolean a(bmr_1 bmr_12) {
        bqw_0 bqw_02 = (bqw_0)fjq_0.a(this.q);
        return bqw_02.a(bmr_12, this);
    }

    static /* synthetic */ void a(bFN bFN2, abm_1 abm_12) {
        bFN2.a(abm_12);
    }
}

