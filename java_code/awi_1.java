/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from awI
 */
public class awi_1
implements avj_1 {
    public final md_1 a;

    public awi_1(md_1 md_12) {
        this.a = md_12;
    }

    @Override
    public boolean a(Particle particle, Particle particle2, float f2, ParticleSystem particleSystem) {
        float f3 = particle2.r;
        if (f3 > this.a.b() && f3 - f2 < this.a.a()) {
            return true;
        }
        return f3 >= this.a.a() && f3 <= this.a.b();
    }
}

