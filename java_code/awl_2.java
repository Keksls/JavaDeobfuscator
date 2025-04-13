/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from awl
 */
public class awl_2
extends avh_1 {
    private final mj_1 b;

    public awl_2(mj_1 mj_12) {
        this.b = mj_12;
    }

    public mj_1 b() {
        return this.b;
    }

    @Override
    public void a(float f2, float f3, Particle particle, Particle particle2, ParticleSystem particleSystem) {
        float f4 = particle.e() + this.b.a();
        float f5 = particle.f() + this.b.b();
        float f6 = particle.g() + this.b.c();
        float f7 = particle.e() + this.b.d();
        float f8 = particle.f() + this.b.e();
        float f9 = particle.g() + this.b.f();
        boolean bl = false;
        if (particle2.b < f4 && particle2.e >= f4) {
            bl = true;
            particle2.b = f4;
            particle2.h = -particle2.h;
        }
        if (particle2.b > f7 && particle2.e <= f7) {
            bl = true;
            particle2.b = f7;
            particle2.h = -particle2.h;
        }
        if (particle2.c < f5 && particle2.f >= f5) {
            bl = true;
            particle2.c = f5;
            particle2.i = -particle2.i;
        }
        if (particle2.c > f8 && particle2.f <= f8) {
            bl = true;
            particle2.c = f8;
            particle2.i = -particle2.i;
        }
        if (particle2.d < f6 && particle2.g >= f6) {
            bl = true;
            particle2.d = f6;
            particle2.j = -particle2.j;
        }
        if (particle2.d > f9 && particle2.g <= f9) {
            bl = true;
            particle2.d = f9;
            particle2.j = -particle2.j;
        }
        if (bl) {
            if (this.b.j() != 0.0f || this.b.k() != 0.0f || this.b.l() != 0.0f) {
                particle2.h *= this.b.g() + Hw.d() * this.b.j();
                particle2.i *= this.b.h() + Hw.d() * this.b.k();
                particle2.j *= this.b.i() + Hw.d() * this.b.l();
            } else {
                particle2.h *= this.b.g();
                particle2.i *= this.b.h();
                particle2.j *= this.b.i();
            }
        }
        particle2.e = particle2.b;
        particle2.f = particle2.c;
        particle2.g = particle2.d;
    }
}

