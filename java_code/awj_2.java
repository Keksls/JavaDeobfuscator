/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from awj
 */
public class awj_2
extends awi_2 {
    awj_2(mg_1 mg_12) {
        super(mg_12);
    }

    @Override
    public void a(float f2, float f3, Particle particle, Particle particle2, ParticleSystem particleSystem) {
        particle2.b += this.b.a() * f2;
        particle2.c += this.b.b() * f2;
        particle2.d += this.b.c() * f2;
    }
}

