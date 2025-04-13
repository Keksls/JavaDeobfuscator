/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from awc
 */
public class awc_1
extends avh_1 {
    public static final long b = 1000000L;
    private final afj_2 c;

    public awc_1(mx_1 mx_12) {
        this.c = awc_1.a(mx_12);
    }

    public awc_1(afj_2 afj_22) {
        this.c = afj_22;
    }

    @Override
    public void a(float f2, float f3, Particle particle, Particle particle2, ParticleSystem particleSystem) {
        long l = (long)(1000000.0f * (particle2.r / particle2.s));
        afr_2 afr_22 = this.c.a(l);
        if (particle.M) {
            particle2.b = afr_22.a + particleSystem.e();
            particle2.c = afr_22.b + particleSystem.f();
            particle2.d = afr_22.c + particleSystem.g();
        } else {
            particle2.b = afr_22.a + particle.b;
            particle2.c = afr_22.b + particle.c;
            particle2.d = afr_22.c + particle.d;
        }
    }

    public afr_2 b() {
        return this.c.a();
    }

    public afr_2 c() {
        return this.c.e();
    }

    public afr_2 d() {
        return this.c.b();
    }

    public afr_2 e() {
        return this.c.f();
    }

    private static afj_2 a(mx_1 mx_12) {
        switch (mx_12.a()) {
            case a: {
                return new afe_2();
            }
            case b: {
                return new afc_2();
            }
            case c: {
                return new afb_2();
            }
        }
        throw new IllegalArgumentException("Unable to fin trajectory " + mx_12.a());
    }
}

