/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import org.apache.log4j.Logger;

/*
 * Renamed from avH
 */
public abstract class avh_1 {
    private static final Logger b = Logger.getLogger(avh_1.class);
    private static final avu_1 c = new avi_1();
    avu_1 a;

    public void a(avu_1 avu_12) {
        this.a = avu_12;
    }

    public void a(avj_1[] avj_1Array) {
        if (avj_1Array == null) {
            this.a = c;
        } else {
            this.a = null;
            float f2 = 0.0f;
            float f3 = Float.POSITIVE_INFINITY;
            awj_1 awj_12 = null;
            for (int k = 0; k < avj_1Array.length; ++k) {
                if (avj_1Array[k] instanceof awj_1) {
                    if (awj_12 != null) {
                        b.error((Object)"pas cool");
                    }
                    awj_12 = (awj_1)avj_1Array[k];
                    continue;
                }
                awi_1 awi_12 = (awi_1)avj_1Array[k];
                f2 = awi_12.a.a();
                f3 = awi_12.a.b();
                if (!(f3 <= f2)) continue;
                f3 = Float.POSITIVE_INFINITY;
            }
            this.a = awj_12 != null ? new avv_1(f2, f3, awj_12) : (f3 != Float.POSITIVE_INFINITY ? new avw_1(f2, f3) : c);
        }
    }

    public final boolean a(float f2, Particle particle, Particle particle2, ParticleSystem particleSystem) {
        return this.a.a(this, particle, particle2, f2, particleSystem);
    }

    public boolean a() {
        return false;
    }

    public abstract void a(float var1, float var2, Particle var3, Particle var4, ParticleSystem var5);
}

