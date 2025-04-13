/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

/*
 * Renamed from cbH
 */
public class cbh_1
extends adn_0 {
    private FreeParticleSystem a;
    private int f = Integer.MAX_VALUE;

    @Override
    public void b(int n) {
        super.b(n);
        this.b();
    }

    @Override
    public void a() {
        this.b();
    }

    @Override
    public void i() {
        super.i();
        this.b();
    }

    private void b() {
        if (this.a != null) {
            aik_0.a().b(this.a.ac());
            this.a = null;
        }
        this.f = Integer.MAX_VALUE;
    }

    @Override
    public void a(int n) {
        super.a(n);
        int n2 = Hw.a((int)this.g() * 100, 0, 100);
        if (this.f != n2) {
            this.b();
            this.f = n2;
            this.c(n2);
        }
        if (this.a != null) {
            this.a.a(azu_0.j().k().cQ());
            this.a.b(cbw_1.a.b());
        }
    }

    private void c(int n) {
        FreeParticleSystem freeParticleSystem = aPj.a().a(7000074, n);
        ahm_0 ahm_02 = ans_0.D().c().z();
        freeParticleSystem.a(ahm_02.q());
        aik_0.a().b(freeParticleSystem);
        this.a = freeParticleSystem;
    }

    @Override
    public void a(aui_2 aui_22) {
    }
}

