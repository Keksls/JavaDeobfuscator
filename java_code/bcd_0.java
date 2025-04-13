/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

/*
 * Renamed from bcd
 */
public class bcd_0
extends bal_0 {
    private final short o;

    public bcd_0(int n, int n2, int n3, int n4, boolean bl, boolean bl2, long l, int n5, int n6, short s2, int n7, short s3, bpl_0 bpl_02) {
        super(n, n2, n3, n4, bl, bl2, l, n5, n6, s2);
        this.o = s3;
        if (bpl_02 != null && bpl_02.r() != null) {
            this.e(((bph_0)bpl_02.r()).a());
            return;
        }
        Object r2 = eyo_1.g().d(n7);
        if (r2 == null) {
            return;
        }
        Integer n8 = eoG.i.get(((ezr_0)r2).F().d());
        if (n8 == null) {
            return;
        }
        this.e(n8);
    }

    @Override
    public short w() {
        return this.o;
    }

    @Override
    public long o() {
        blx_1 blx_12 = this.d(this.f());
        if (blx_12 == null || !this.D()) {
            return super.o();
        }
        if (blx_12.bz() != null) {
            blx_12.bz().a((short)1, (epq_2)blx_12);
        }
        if (this.r()) {
            this.b(blx_12);
            this.F();
        }
        this.a(blx_12);
        return super.o();
    }

    private void a(blx_1 blx_12) {
        ani_2 ani_22 = new ani_2().a((CharSequence)bae.h().a("fight.closeCombat", new ani_2().a(aug_0.f).a((CharSequence)blx_12.gd()).r()));
        if (this.r()) {
            ani_22.a().a(aug_0.g).a((CharSequence)" (").a((CharSequence)bae.h().a("critical", new Object[0])).a((CharSequence)")").b();
        }
        if (this.s()) {
            ani_22.a().a(aug_0.g).a((CharSequence)" (").a((CharSequence)bae.h().a("critical.miss", new Object[0])).a((CharSequence)")").b();
        }
        m.a(ani_22.r());
    }

    private void b(blx_1 blx_12) {
        this.a(blx_12, 800017);
    }

    private void a(blx_1 blx_12, int n) {
        FreeParticleSystem freeParticleSystem;
        if ((azu_0.j().k().bz() == null || azu_0.j().k().bA() == this.B().c()) && (freeParticleSystem = aij_0.a().a(n)) != null) {
            if (this.B() != null) {
                freeParticleSystem.a(this.B().c());
            }
            freeParticleSystem.a(blx_12.bv());
            aik_0.a().b(freeParticleSystem);
        }
    }

    private void F() {
        if (azu_0.j().k().bA() == this.B().c()) {
            cdw_0.n().c(600122L);
        }
    }
}

