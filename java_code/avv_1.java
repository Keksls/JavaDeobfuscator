/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from avV
 */
public class avv_1
implements avu_1 {
    protected final float a;
    protected final float b;
    private final awj_1[] c;

    public avv_1(float f2, float f3, awj_1 ... awj_1Array) {
        this.a = f2;
        this.b = f3;
        this.c = awj_1Array;
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
        for (int k = 0; k < this.c.length; ++k) {
            if (this.c[k].a(particle, particle2, f2, particleSystem)) continue;
            return false;
        }
        float f5 = f2 - this.a;
        float f6 = this.b - this.a;
        float f7 = Math.max(0.0f, f5 / f6);
        avh_12.a(f4 < f2 ? f4 : f2, f7, particle, particle2, particleSystem);
        return false;
    }
}

