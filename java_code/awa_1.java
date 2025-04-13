/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from awa
 */
public class awa_1
extends avh_1 {
    private float b = 180.0f;
    private final mv_1 c;

    public awa_1(mv_1 mv_12) {
        this.c = mv_12;
    }

    public mv_1 b() {
        return this.c;
    }

    @Override
    public void a(float f2, float f3, Particle particle, Particle particle2, ParticleSystem particleSystem) {
        this.b += this.c.a() * f2;
        if (this.b >= 360.0f) {
            this.b -= 360.0f;
        }
        particle2.b = particle.e() + Hw.i(this.b) * particle2.h + 0.4f;
        particle2.c = particle.f() + Hw.h(this.b) * particle2.i - 0.7f;
    }
}

