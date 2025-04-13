/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from avZ
 */
public class avz_1
extends avh_1 {
    private final mu_1 b;

    public avz_1(mu_1 mu_12) {
        this.b = mu_12;
    }

    public mu_1 b() {
        return this.b;
    }

    @Override
    public void a(float f2, float f3, Particle particle, Particle particle2, ParticleSystem particleSystem) {
        particle2.h += this.b.a();
        particle2.i += this.b.b();
        particle2.j += this.b.c();
    }
}

