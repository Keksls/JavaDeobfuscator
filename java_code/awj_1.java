/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from awJ
 */
public class awj_1
implements avj_1 {
    public final mh_1 a;

    public awj_1(mh_1 mh_12) {
        this.a = mh_12;
    }

    @Override
    public boolean a(Particle particle, Particle particle2, float f2, ParticleSystem particleSystem) {
        switch (this.a.b()) {
            case a: {
                return particle2.b >= (float)this.a.a() + (this.a.c() ? particleSystem.f : particle.b);
            }
            case b: {
                return particle2.b <= (float)this.a.a() + (this.a.c() ? particleSystem.f : particle.b);
            }
            case c: {
                return particle2.c >= (float)this.a.a() + (this.a.c() ? particleSystem.g : particle.c);
            }
            case d: {
                return particle2.c <= (float)this.a.a() + (this.a.c() ? particleSystem.g : particle.c);
            }
            case e: {
                return particle2.d >= (float)this.a.a() + (this.a.c() ? particleSystem.h : particle.d);
            }
            case f: {
                return particle2.d <= (float)this.a.a() + (this.a.c() ? particleSystem.h : particle.d);
            }
        }
        return true;
    }
}

