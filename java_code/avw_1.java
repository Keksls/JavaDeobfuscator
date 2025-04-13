/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from avW
 */
public class avw_1
implements avu_1 {
    protected final float a;
    protected final float b;

    public avw_1(float f2, float f3) {
        this.a = f2;
        this.b = f3;
    }

    @Override
    public final boolean a(avh_1 avh_12, Particle particle, Particle particle2, float f2, ParticleSystem particleSystem) {
        float f3 = particle2.r;
        if (f3 < this.a) {
            return false;
        }
        float f4 = this.b - f3;
        if (f4 < 0.0f) {
            return true;
        }
        float f5 = f2 - this.a;
        float f6 = this.b - this.a;
        float f7 = Math.max(0.0f, f5 / f6);
        avh_12.a(f4 < f2 ? f4 : f2, f7, particle, particle2, particleSystem);
        return false;
    }
}

