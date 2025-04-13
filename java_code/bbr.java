/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

public class bbr
extends ban {
    private static final bwi_0 f = new bwi_0();
    private static final long g = 1000L;
    private final long[] h;
    private final aff_1 i;

    public bbr(int n, int n2, int n3, int n4, long[] lArray, aff_1 aff_12) {
        super(n, n2, n3, n4);
        this.h = lArray;
        this.i = aff_12;
    }

    @Override
    public long o() {
        blx_1 blx_12 = this.d(this.h());
        if (blx_12 != null) {
            if (this.r()) {
                Object object;
                if (blx_12 != azu_0.j().k()) {
                    object = new StringBuilder(bae.h().a("fight.invisible.detected.by", blx_12.gd()));
                    for (int n = 0; n < this.h.length; n = (int)((byte)(n + 1))) {
                        blx_1 blx_13 = this.d(this.h[n]);
                        if (blx_13 == null) continue;
                        if (n > 0) {
                            ((StringBuilder)object).append(',');
                        }
                        ((StringBuilder)object).append(blx_13.gd());
                    }
                    f.a(((StringBuilder)object).toString());
                } else {
                    object = bae.h().a("fight.invisible.detected", blx_12.gd());
                    f.a(object);
                }
                object = aij_0.a().a(78900);
                ((ParticleSystem)object).a(this.i.d(), (float)this.i.e(), (float)this.i.f());
                ((ParticleSystem)object).j(2000);
                ((FreeParticleSystem)object).a(this.p());
                aik_0.a().b((IsoParticleSystem)object);
            }
            return 1000L;
        }
        return 0L;
    }
}

