/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.util.texture.TextureCoords
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import com.jogamp.opengl.util.texture.TextureCoords;

/*
 * Renamed from awX
 */
public class awx_1
extends avn_1 {
    public final mp_2 a;
    private final mt_1 c;
    private float d;

    public awx_1(mt_1 mt_12, mp_2 mp_22) {
        this.c = mt_12;
        this.a = mp_22;
    }

    @Override
    public Particle a(ParticleSystem particleSystem) {
        if (particleSystem.ab() && !this.b(particleSystem)) {
            return null;
        }
        return super.a(particleSystem);
    }

    @Override
    public boolean b() {
        return true;
    }

    public boolean b(ParticleSystem particleSystem) {
        assert (this.a()) : "Texture is already up to date";
        assert (particleSystem.ab());
        aza_1 aza_12 = particleSystem.au().a(this.c.a());
        if (aza_12 == null) {
            return false;
        }
        this.a(false);
        return true;
    }

    public final TextureCoords a(int n) {
        assert (n >= 0);
        this.d += this.c.B() * (float)n;
        int n2 = this.a.f();
        if (this.d >= (float)n2) {
            this.d -= (float)n2;
            if (this.c.C() > 0) {
                this.c.b(this.c.C() - 1);
            }
        }
        float f2 = Hw.e(this.a.c());
        float f3 = (float)Hw.e(this.a.c()) - 0.5f;
        float f4 = (float)this.a.a() / f2;
        float f5 = (float)this.a.b() / f3;
        short[] sArray = this.a.e();
        TextureCoords[] textureCoordsArray = new TextureCoords[sArray.length / 2];
        for (int k = 0; k < textureCoordsArray.length; ++k) {
            float f6 = ((float)sArray[k * 2] + 0.5f) / f2;
            float f7 = ((float)sArray[k * 2 + 1] + 0.5f) / f3;
            textureCoordsArray[k] = new TextureCoords(f6, f5 + f7, f4 + f6, f7);
        }
        short[] sArray2 = this.a.g();
        int n3 = ((int)(this.c.C() == 0 ? (float)n2 : this.d) & 0xFFFF) % this.a.f();
        for (int k = 0; k < sArray2.length; ++k) {
            if ((n3 -= sArray2[k]) >= 0) continue;
            return textureCoordsArray[k];
        }
        return textureCoordsArray[0];
    }

    @Override
    public void a(Particle particle) {
        float f2 = this.c.d();
        float f3 = this.c.e();
        float f4 = this.c.i();
        if (this.c.h()) {
            float f5 = Hw.d() * this.c.f();
            f2 += f5;
            f3 += f5;
        } else {
            if (this.c.f() != 0.0f) {
                f2 += Hw.d() * this.c.f();
            }
            if (this.c.g() != 0.0f) {
                f3 += Hw.d() * this.c.g();
            }
        }
        if (this.c.j() != 0.0f) {
            f4 += (Hw.d() - 0.5f) * this.c.j();
        }
        particle.C = this.c.b();
        particle.D = this.c.c();
        particle.z = this.c.n() + Hw.d() * this.c.r();
        particle.w = this.c.k() + Hw.d() * this.c.o();
        particle.x = this.c.l() + Hw.d() * this.c.p();
        particle.y = this.c.m() + Hw.d() * this.c.q();
        particle.u = f2;
        particle.v = f3;
        particle.t = f4 * ((float)Math.PI / 180);
        particle.A = this.c.z();
        particle.B = this.c.A();
        particle.E = this.c.v();
        particle.F = this.c.w();
        particle.G = this.c.x();
        particle.H = this.c.y();
        particle.n = particle.k = this.c.s() * ((float)Math.PI / 180);
        particle.o = particle.l = this.c.t() * ((float)Math.PI / 180);
        particle.p = particle.m = this.c.u() * ((float)Math.PI / 180);
    }

    public mt_1 d() {
        return this.c;
    }

    @Override
    public int c() {
        return this.c.a();
    }
}

