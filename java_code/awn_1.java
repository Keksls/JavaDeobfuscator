/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from awn
 */
public class awn_1
extends avh_1 {
    private final ml_1 b;

    public awn_1(ml_1 ml_12) {
        this.b = ml_12;
    }

    public ml_1 b() {
        return this.b;
    }

    @Override
    public void a(float f2, float f3, Particle particle, Particle particle2, ParticleSystem particleSystem) {
        particle2.k = particle2.n + this.b.a() * f3;
        particle2.l = particle2.o + this.b.b() * f3;
        particle2.m = particle2.p + this.b.c() * f3;
    }
}

