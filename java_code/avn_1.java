/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from avN
 */
public abstract class avn_1 {
    private boolean a = true;

    protected avn_1() {
    }

    public Particle a(ParticleSystem particleSystem) {
        Particle particle = (Particle)Particle.a.d();
        particle.J = this;
        return particle;
    }

    public abstract void a(Particle var1);

    public boolean a() {
        return this.a;
    }

    public void a(boolean bl) {
        this.a = bl;
    }

    public abstract boolean b();

    public abstract int c();
}

