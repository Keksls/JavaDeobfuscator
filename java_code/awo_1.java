/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from awo
 */
public class awo_1
extends avh_1 {
    private final mm_1 b;

    public awo_1(mm_1 mm_12) {
        this.b = mm_12;
    }

    public mm_1 b() {
        return this.b;
    }

    @Override
    public void a(float f2, float f3, Particle particle, Particle particle2, ParticleSystem particleSystem) {
        float f4 = this.b.a() * f2;
        Particle particle3 = particle.K == null ? particle : particle.K;
        particle2.b += (particle2.c - particle3.f()) * f4;
        particle2.c -= (particle2.b - particle3.e()) * f4;
    }
}

