/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;

/*
 * Renamed from awO
 */
public class awo_2
extends avk_1 {
    public final me_1 a;

    public awo_2(me_1 me_12) {
        this.a = me_12;
    }

    public Particle f() {
        Particle particle = (Particle)Particle.a.d();
        particle.w = this.a.a();
        particle.x = this.a.b();
        particle.y = this.a.c();
        particle.z = this.a.d();
        particle.A = this.a.e();
        particle.B = this.a.e();
        particle.u = 1.0f;
        return particle;
    }
}

