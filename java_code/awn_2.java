/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import java.util.ArrayList;

/*
 * Renamed from awN
 */
public class awn_2
extends avk_1 {
    public final mb_1 a;
    public int b;
    public final ArrayList<avn_1> c = new ArrayList(1);
    public ArrayList<awn_2> d;
    public awo_2 e;

    public awn_2(mb_1 mb_12) {
        this.a = mb_12;
    }

    public void f() {
        this.c.clear();
        this.e();
        this.e = null;
        this.a.a(false);
    }

    public void a(avn_1 avn_12) {
        this.c.add(avn_12);
    }

    public void a(ParticleSystem particleSystem, Particle particle, Particle particle2) {
        this.a(particle, particle2);
        if (!particle.M) {
            particle2.b += particle.e();
            particle2.c += particle.f();
            particle2.d += particle.g();
        }
        if (this.d != null) {
            particle2.a(particleSystem, this.d);
        }
    }

    public void a(Particle particle, Particle particle2) {
        float f2 = this.a.i();
        float f3 = this.a.j();
        float f4 = this.a.k();
        float f5 = this.a.o();
        float f6 = this.a.p();
        float f7 = this.a.q();
        if (this.a.l() != 0.0f) {
            f2 += (Hw.d() - 0.5f) * this.a.l();
        }
        if (this.a.m() != 0.0f) {
            f3 += (Hw.d() - 0.5f) * this.a.m();
        }
        if (this.a.n() != 0.0f) {
            f4 += (Hw.d() - 0.5f) * this.a.n();
        }
        if (this.a.r() != 0.0f) {
            f5 += (Hw.d() - 0.5f) * this.a.r();
        }
        if (this.a.s() != 0.0f) {
            f6 += (Hw.d() - 0.5f) * this.a.s();
        }
        if (this.a.t() != 0.0f) {
            f7 += (Hw.d() - 0.5f) * this.a.t();
        }
        particle2.b = f2;
        particle2.c = f3;
        particle2.d = f4;
        particle2.h = f5;
        particle2.i = f6;
        particle2.j = f7;
        particle2.s = this.a.g() + Hw.d() * this.a.h();
        particle2.r = 0.0f;
        particle2.M = this.a.u();
        particle2.K = particle;
    }

    public void a(awn_2 awn_22) {
        if (awn_22 == null) {
            return;
        }
        if (this.d == null) {
            this.d = new ArrayList(1);
        }
        this.d.add(awn_22);
    }

    public int g() {
        int n = this.c.size();
        if (n == 0) {
            return -1;
        }
        return Hw.a(n);
    }

    public void a(awo_2 awo_22) {
        this.e = awo_22;
    }
}

