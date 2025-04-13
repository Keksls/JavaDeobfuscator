/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

public final class bbV
extends bbt_0 {
    public bbV(int n, int n2, int n3, int n4, long l, aff_1 aff_12) {
        super(n, n2, n3, n4, l, aff_12, "AnimSort-Portail-Saut-Debut", "AnimSort-Portail-Saut-Fin");
    }

    void a(ahh_0 ahh_02) {
        FreeParticleSystem freeParticleSystem = aij_0.a().a(1018808);
        freeParticleSystem.b(ahh_02.J(), ahh_02.K(), ahh_02.L());
        freeParticleSystem.a(this.p());
        aik_0.a().b(freeParticleSystem);
    }

    @Override
    protected void a(biI biI2) {
        ado_1.a().a(new bbw_0(this, biI2), 500L, 1);
    }

    @Override
    protected void a(blx_1 blx_12) {
        this.a((ahh_0)blx_12.Z);
    }
}

