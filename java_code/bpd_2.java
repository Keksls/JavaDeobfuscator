/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

/*
 * Renamed from bpD
 */
public abstract class bpd_2
extends cSR
implements bqf_2 {
    private FreeParticleSystem m;
    protected aft_0 a;

    @Override
    public void a() {
        aby_0 aby_02 = this.f();
        aby_02.a(this);
        this.m = aij_0.a().a(800255, 0);
        this.m.a(aby_02, 1.0f, 2);
        aik_0.a().b(this.m);
    }

    @Override
    public void b() {
        aby_0 aby_02 = this.f();
        aby_02.b(this);
        aik_0.a().b(this.m.ac());
    }

    @Override
    public void a(boolean bl, YU yU) {
        this.m.b(bl);
    }
}

