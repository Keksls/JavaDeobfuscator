/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Emitter;
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from avL
 */
public class avl_1 {
    public static final int a = 100;
    private final avk_2 c = avo_2.a.a();

    public avl_1(awo_2 awo_22) {
        this.c.b(false);
        this.a(awo_22.a.a() * awo_22.a.d(), awo_22.a.b() * awo_22.a.d(), awo_22.a.c() * awo_22.a.d());
        this.a(awo_22.a.e());
        assert (this.c != null);
    }

    public void a(float f2, Emitter emitter, ParticleSystem particleSystem) {
        Particle particle = emitter.l;
        particle.K = emitter.i;
        float f3 = particle.r - emitter.j.a.a();
        this.c.b(f3 > 0.0f);
        particle.a(particleSystem, f2);
        this.c.c().a(particle.e() + particleSystem.e(), particle.f() + particleSystem.f(), particle.g() + particleSystem.g());
        float f4 = particle.z;
        this.c.b(particle.w * f4, particle.x * f4, particle.y * f4);
        this.c.c(particle.w * f4, particle.x * f4, particle.y * f4);
        this.c.a(Hw.b(particle.A * particle.u, 0.0f, 5.0f));
        if (f3 >= particle.s && particle.s != Float.MAX_VALUE) {
            this.b();
        }
    }

    public void a(float f2, float f3, float f4) {
        this.c.c(f2, f3, f4);
    }

    public void a(float f2) {
        this.c.a(f2);
    }

    public void a() {
        avo_2.a.a(this.c);
    }

    public void b() {
        this.c.b(100);
    }
}

