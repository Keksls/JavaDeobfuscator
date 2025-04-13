/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from awh
 */
public class awh_1
extends avh_1 {
    private final mf_1 b;

    public awh_1(mf_1 mf_12) {
        this.b = mf_12;
    }

    public mf_1 b() {
        return this.b;
    }

    @Override
    public void a(float f2, float f3, Particle particle, Particle particle2, ParticleSystem particleSystem) {
        particle2.u += this.b.a() * (float)((int)(33333.0f * f2)) / 1000.0f;
    }
}

