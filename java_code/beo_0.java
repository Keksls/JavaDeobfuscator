/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.apache.log4j.Logger;

/*
 * Renamed from bEO
 */
public class beo_0
extends bFZ {
    static final Logger q = Logger.getLogger(beo_0.class);

    @Override
    public Tv ap_() {
        return Tv.a;
    }

    @Override
    public Tv[] r() {
        return new Tv[]{Tv.a};
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.b(true);
        this.g(true);
        this.i(true);
    }

    @Override
    public cSS[] az_() {
        cto_0 cto_02 = (cto_0)cSY.P.a();
        cto_02.a(cUL.aA.aH);
        cto_02.d("desc.mru.attachPhoenix");
        cSS[] cSSArray = new cSS[]{cto_02};
        return cSSArray;
    }

    @Override
    public String al_() {
        return bae.h().a("desc.phoenix", new Object[0]);
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        switch (tv) {
            case a: {
                this.a(tv);
                azu_0.j().k().cV().b((int)this.a_());
                this.b(tv);
                beo_0.a((blx_1)tF);
                aUh.b("soulLinked", new Object[0]);
                cdw_0.n().c(600064L);
                return true;
            }
        }
        q.error((Object)("Impossible d'effectuer une action " + tv + " sur un phoenix"), (Throwable)new IllegalArgumentException());
        return false;
    }

    private static void a(blx_1 blx_12) {
        FreeParticleSystem freeParticleSystem = aij_0.a().a(800110);
        if (freeParticleSystem != null) {
            freeParticleSystem.a(blx_12.bv());
            aik_0.a().b(freeParticleSystem);
        }
    }

    static /* synthetic */ void a(beo_0 beo_02, abm_1 abm_12) {
        beo_02.a(abm_12);
    }
}

