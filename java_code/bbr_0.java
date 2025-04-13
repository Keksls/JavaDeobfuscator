/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

/*
 * Renamed from bbR
 */
public class bbr_0
extends ban {
    private static final bwi_0 f = new bwi_0();

    public bbr_0(int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4);
    }

    @Override
    public long o() {
        String string;
        blx_1 blx_12 = this.d(this.h());
        if (blx_12 == null) {
            return 0L;
        }
        biI biI2 = blx_12.bv();
        biI2.bZ();
        if (this.r()) {
            string = bae.h().a("fight.tackled", blx_12.gd());
            f.a(string);
        }
        string = biI2.bQ().d();
        biI2.e(string);
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.bz() == null || bmr_12.bA() == this.p()) {
            FreeParticleSystem freeParticleSystem = aij_0.a().a(800021);
            if (freeParticleSystem != null) {
                freeParticleSystem.a(biI2);
                freeParticleSystem.a(this.p());
                aik_0.a().b(freeParticleSystem);
            }
            if (bmr_12 == blx_12) {
                bua_0.a.a(new buz_2());
            }
        }
        if (blx_12.a((ru_0)eps_0.d)) {
            blx_12.a_(eps_0.d).o();
        }
        return biI2.j(string);
    }
}

