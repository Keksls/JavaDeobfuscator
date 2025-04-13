/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

class cGl
implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ frO b;

    cGl(int n, frO frO2) {
        this.a = n;
        this.b = frO2;
    }

    @Override
    public void run() {
        FreeParticleSystem freeParticleSystem = aij_0.a().a(this.a);
        freeParticleSystem.a(this.b.getAnimatedElement());
        aik_0.a().b(freeParticleSystem);
    }
}

