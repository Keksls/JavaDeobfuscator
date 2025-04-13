/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from awe
 */
public class awe_1
extends avh_1 {
    private final mz_1 b;

    public awe_1(mz_1 mz_12) {
        this.b = mz_12;
    }

    public mz_1 b() {
        return this.b;
    }

    @Override
    public void a(float f2, float f3, Particle particle, Particle particle2, ParticleSystem particleSystem) {
        float f4 = (float)((int)(33333.0f * f2)) / 1000.0f;
        particle2.u += (this.b.a() + Hw.d() * this.b.d()) * f4;
        particle2.v += (this.b.b() + Hw.d() * this.b.e()) * f4;
        particle2.t += (this.b.c() + Hw.d() * this.b.f()) * f4;
    }
}

