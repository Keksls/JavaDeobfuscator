/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from awW
 */
public class aww_1
extends avn_1 {
    private final ms_1 b;

    public aww_1(ms_1 ms_12) {
        this.b = ms_12;
    }

    @Override
    public Particle a(ParticleSystem particleSystem) {
        if (particleSystem.ab() && this.a() && !this.b(particleSystem)) {
            return null;
        }
        return super.a(particleSystem);
    }

    @Override
    public boolean b() {
        return false;
    }

    public boolean b(ParticleSystem particleSystem) {
        assert (this.a()) : "Texture is already up to date";
        assert (particleSystem.ab());
        aza_1 aza_12 = particleSystem.au().a(this.d().a());
        if (aza_12 == null) {
            return false;
        }
        int n = aza_12.d();
        int n2 = aza_12.c();
        int n3 = Hw.e(n);
        int n4 = Hw.e(n2);
        ms_1 ms_12 = this.d();
        ms_12.x((float)n * 0.5f);
        ms_12.y((float)n2 * 0.5f);
        ms_12.v((float)n2 / (float)n4);
        ms_12.w((float)n / (float)n3);
        this.a(false);
        return true;
    }

    @Override
    public void a(Particle particle) {
        float f2 = this.b.d();
        float f3 = this.b.e();
        float f4 = this.b.i();
        if (this.b.h()) {
            float f5 = Hw.d() * this.b.f();
            f2 += f5;
            f3 += f5;
        } else {
            if (this.b.f() != 0.0f) {
                f2 += Hw.d() * this.b.f();
            }
            if (this.b.g() != 0.0f) {
                f3 += Hw.d() * this.b.g();
            }
        }
        if (this.b.j() != 0.0f) {
            f4 += (Hw.d() - 0.5f) * this.b.j();
        }
        particle.C = this.b.b();
        particle.D = this.b.c();
        particle.z = this.b.n() + Hw.d() * this.b.r();
        particle.w = this.b.k() + Hw.d() * this.b.o();
        particle.x = this.b.l() + Hw.d() * this.b.p();
        particle.y = this.b.m() + Hw.d() * this.b.q();
        particle.u = f2;
        particle.v = f3;
        particle.t = f4 * ((float)Math.PI / 180);
        particle.A = this.b.z();
        particle.B = this.b.A();
        particle.E = this.b.v();
        particle.F = this.b.w();
        particle.G = this.b.x();
        particle.H = this.b.y();
        particle.n = particle.k = this.b.s() * ((float)Math.PI / 180);
        particle.o = particle.l = this.b.t() * ((float)Math.PI / 180);
        particle.p = particle.m = this.b.u() * ((float)Math.PI / 180);
    }

    public ms_1 d() {
        return this.b;
    }

    @Override
    public int c() {
        return this.b.a();
    }
}

