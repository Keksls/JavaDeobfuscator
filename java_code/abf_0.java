/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

/*
 * Renamed from abF
 */
public class abf_0
implements atz_1<fa_1> {
    @Override
    public boolean a(aty_1 aty_12, fa_1 fa_12) {
        FreeParticleSystem freeParticleSystem = aij_0.a().a(fa_12.c());
        freeParticleSystem.a(aty_12.az());
        aik_0.a().b(freeParticleSystem);
        if (aty_12 instanceof abu) {
            abu abu2 = (abu)aty_12;
            freeParticleSystem.a(abu2.J() + (float)fa_12.d(), abu2.K() + (float)fa_12.e(), (float)(abu2.I() + fa_12.f()));
            aiI.a(freeParticleSystem);
        }
        return false;
    }
}

