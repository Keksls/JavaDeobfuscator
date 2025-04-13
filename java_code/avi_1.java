/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from avI
 */
class avi_1
implements avu_1 {
    avi_1() {
    }

    @Override
    public boolean a(avh_1 avh_12, Particle particle, Particle particle2, float f2, ParticleSystem particleSystem) {
        float f3 = particle2.r;
        float f4 = particle2.s;
        float f5 = f3 / f4;
        avh_12.a(f2, f5, particle, particle2, particleSystem);
        return false;
    }
}

