/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from awm
 */
public class awm_2
extends avh_1 {
    private final mk_1 b;

    public awm_2(mk_1 mk_12) {
        this.b = mk_12;
    }

    public mk_1 b() {
        return this.b;
    }

    @Override
    public void a(float f2, float f3, Particle particle, Particle particle2, ParticleSystem particleSystem) {
        float f4 = (float)((int)(33333.0f * f2)) / 1000.0f;
        particle2.k += this.b.a() * f4;
        particle2.l += this.b.b() * f4;
        particle2.m += this.b.c() * f4;
    }
}

