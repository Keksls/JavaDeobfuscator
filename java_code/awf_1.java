/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TObjectFloatHashMap
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import gnu.trove.map.hash.TObjectFloatHashMap;

/*
 * Renamed from awf
 */
public class awf_1
extends avh_1 {
    private static final float b = 1.0f;
    private static final float c = 0.5f;
    private static final float d = 0.116279066f;
    private final TObjectFloatHashMap<Particle> e = new TObjectFloatHashMap();

    @Override
    public void a(float f2, float f3, Particle particle, Particle particle2, ParticleSystem particleSystem) {
        if (!particle2.M) {
            return;
        }
        float f4 = particle2.b + particle.e();
        float f5 = particle2.c + particle.f();
        float f6 = particle2.d + particle.g();
        f4 += particleSystem.e();
        f5 += particleSystem.f();
        f6 += particleSystem.g();
        if (!Float.isNaN(particle2.e)) {
            float f7 = f4 - particle2.e;
            float f8 = f5 - particle2.f;
            float f9 = f6 - particle2.g;
            if (f7 == 0.0f && f8 == 0.0f && f9 == 0.0f) {
                return;
            }
            float f10 = (f7 - f8) / 4.0f;
            float f11 = (f7 + f8) * 0.5f + f9 * 0.116279066f;
            if (Math.abs(f10) > 1.0E-5f) {
                float f12 = (float)Math.atan(f11 / f10);
                float f13 = this.e.get((Object)particle2);
                particle2.t += f12 - f13;
                this.e.put((Object)particle2, f12);
            }
        }
        particle2.e = f4;
        particle2.f = f5;
        particle2.g = f6;
    }
}

