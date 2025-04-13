/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from awb
 */
public class awb_1
extends avh_1 {
    private final mw_1 b;

    public awb_1(mw_1 mw_12) {
        this.b = mw_12;
    }

    public mw_1 b() {
        return this.b;
    }

    @Override
    public void a(float f2, float f3, Particle particle, Particle particle2, ParticleSystem particleSystem) {
        float f4 = this.b.e() * f2;
        particle2.w -= (particle2.w - this.b.a()) * f4;
        particle2.x -= (particle2.x - this.b.b()) * f4;
        particle2.y -= (particle2.y - this.b.c()) * f4;
        particle2.z -= (particle2.z - this.b.d()) * f4;
    }
}

