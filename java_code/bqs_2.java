/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

/*
 * Renamed from bqs
 */
class bqs_2 {
    static final abb_0 a;
    int b;
    static final /* synthetic */ boolean c;

    bqs_2() {
    }

    void a(bnh_1 bnh_12) {
        biI biI2 = bnh_12.bv();
        biI2.a(aej_2.b);
        if (!bnh_12.cX()) {
            biI2.a(a);
        }
        biI2.e("AnimDesincarnation");
        FreeParticleSystem freeParticleSystem = aij_0.a().a(bnh_12.cb());
        this.b = freeParticleSystem.ac();
        freeParticleSystem.a(biI2);
        aik_0.a().b(freeParticleSystem);
    }

    void b(bnh_1 bnh_12) {
        if (!c && this.b == 0) {
            throw new AssertionError();
        }
        aik_0.a().b(this.b);
        bnh_12.bv().b(a);
        this.b = 0;
    }

    static {
        c = !bqp_2.class.desiredAssertionStatus();
        a = new bqt_2();
    }
}

