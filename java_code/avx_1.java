/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from avX
 */
public class avx_1
extends avh_1 {
    private final mq_2 c;

    public avx_1(mq_2 mq_22) {
        this.c = mq_22;
    }

    public mq_2 b() {
        return this.c;
    }

    @Override
    public void a(float f2, float f3, Particle particle, Particle particle2, ParticleSystem particleSystem) {
        float f4 = this.c.a() * f2;
        float f5 = this.c.c() - particle2.b;
        float f6 = this.c.d() - particle2.c;
        float f7 = this.c.e() - particle2.d;
        if (!particle.M) {
            f5 += particle.e();
            f6 += particle.f();
            f7 += particle.g();
        }
        float f8 = (float)Math.sqrt(f5 * f5 + f6 * f6 + f7 * f7);
        f5 /= f8;
        f6 /= f8;
        f7 /= f8;
        switch (this.c.b()) {
            case a: {
                particle2.c += f6 * f4;
                particle2.d += f7 * f4;
                break;
            }
            case b: {
                particle2.b += f5 * f4;
                particle2.d += f7 * f4;
                break;
            }
            case c: {
                particle2.b += f5 * f4;
                particle2.c += f6 * f4;
                break;
            }
            case d: {
                particle2.b += f5 * f4;
                particle2.c += f6 * f4;
                particle2.d += f7 * f4;
                break;
            }
            default: {
                assert (false) : "Unknown attractor axis";
                break;
            }
        }
    }

    @Override
    public boolean a() {
        return true;
    }
}

