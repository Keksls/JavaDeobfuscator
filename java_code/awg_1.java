/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from awg
 */
public class awg_1
extends avh_1 {
    private final mc_1 b;

    public awg_1(mc_1 mc_12) {
        this.b = mc_12;
    }

    public mc_1 b() {
        return this.b;
    }

    @Override
    public void a(float f2, float f3, Particle particle, Particle particle2, ParticleSystem particleSystem) {
        float f4 = 1.0f - this.b.a() * f2;
        particle2.h *= f4;
        particle2.i *= f4;
        particle2.j *= f4;
    }
}

