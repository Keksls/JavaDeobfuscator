/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

public final class cCJ
implements adx_1<cym_2> {
    @Override
    public boolean a(cym_2 cym_22) {
        long l = cym_22.b();
        int n = cym_22.c();
        int n2 = cym_22.d();
        blx_1 blx_12 = bmf_2.a().c(l);
        if (blx_12 != null && n != 0 && n2 != 0) {
            FreeParticleSystem freeParticleSystem = aij_0.a().a(n);
            int n3 = freeParticleSystem.ac();
            if (cym_22.e()) {
                freeParticleSystem.a(blx_12.bv());
            } else {
                freeParticleSystem.b(blx_12.G(), blx_12.H(), blx_12.I());
            }
            aik_0.a().b(freeParticleSystem);
            ado_1.a().a(() -> aik_0.a().b(n3), n2 * 1000, 1);
        }
        return false;
    }

    @Override
    public int a() {
        return 12388;
    }
}

