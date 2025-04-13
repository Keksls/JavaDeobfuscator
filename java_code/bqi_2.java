/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.apache.log4j.Logger;

/*
 * Renamed from bqi
 */
public class bqi_2
extends bpc_2 {
    private static final Logger a = Logger.getLogger(bqi_2.class);
    private final blx_1 b;
    private ffu_0 c;
    private bqj_2 e;

    public bqi_2(blx_1 blx_12) {
        this.b = blx_12;
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public short ac_() {
        return 14;
    }

    @Override
    public boolean g() {
        bnh_1 bnh_12 = (bnh_1)this.b;
        if (this.b.f(erl_2.bh)) {
            return false;
        }
        biI biI2 = bnh_12.bv();
        if (biI2.bb() != null) {
            return false;
        }
        if (bnh_12.ab_()) {
            return false;
        }
        long l = this.b.U_();
        long l2 = this.d.U_();
        long l3 = euv_2.a.b(l);
        long l4 = this.b.a_();
        if (l == l2 && l3 != l4) {
            return false;
        }
        bMk bMk2 = bnh_12.es();
        if (bMk2 == null) {
            return false;
        }
        ffu_0 ffu_02 = bMk2.f();
        if (!ffu_02.p()) {
            return false;
        }
        if (biI2.bs()) {
            aUh.a("error.action.impossible.swimming", new Object[0]);
            return false;
        }
        biS biS2 = biI2.cg();
        return !biS2.m() && !biS2.n();
    }

    @Override
    public void a() {
        if (this.b.a_() == this.d.a_()) {
            dan.a().d();
            bqi_2.k();
        }
        this.b.a(this);
        this.h();
        this.i();
    }

    public void h() {
        FreeParticleSystem freeParticleSystem = aij_0.a().a(800450);
        if (freeParticleSystem == null) {
            a.warn((Object)"le system de particule 800450 n'exsite pas");
            return;
        }
        freeParticleSystem.a(this.b.bv());
        aik_0.a().b(freeParticleSystem);
    }

    private static void k() {
        acb_0 acb_02 = ajI.e().d();
        if (acb_02 != null) {
            acb_02.i(1.0f);
        }
    }

    @Override
    public boolean a(boolean bl, boolean bl2) {
        this.a(this.b.bv());
        if (this.b.a_() == this.d.a_()) {
            bqi_2.a((byte)3);
        }
        return true;
    }

    @Override
    public boolean b() {
        return this.c_(true);
    }

    @Override
    public boolean c_(boolean bl) {
        biI biI2 = this.b.bv();
        this.a(biI2);
        if (bl && this.b.a_() == this.d.a_()) {
            bqi_2.a((byte)2);
        }
        return true;
    }

    private void a(biI biI2) {
        this.b(biI2);
        this.h();
    }

    public void i() {
        bnh_1 bnh_12 = (bnh_1)this.b;
        biI biI2 = bnh_12.bv();
        biI2.aW();
        bMk bMk2 = bnh_12.es();
        this.c = bMk2.f();
        if (this.e != null) {
            this.e.a(biI2);
        }
        this.e = new bqj_2(bqi_2.a(this.c), ((fga)this.c.a()).j(), biI2);
        this.e.a();
    }

    private static fgb a(ffu_0 ffu_02) {
        int n = ffu_02.e();
        fgb fgb2 = fgd.a.b(n);
        if (fgb2 != null) {
            return fgb2;
        }
        return fgd.a.a((Integer)ffu_02.a().c());
    }

    public void j() {
        this.e.b();
    }

    private static void a(byte by) {
        cpz_0 cpz_02 = new cpz_0();
        cpz_02.a(by);
        cpz_02.a((short)14);
        azu_0.j().K().c(cpz_02);
    }

    private void b(biI biI2) {
        if (this.e != null) {
            this.e.a(biI2);
        }
    }

    public String toString() {
        return "RideOccupation{m_user=" + this.b + ", m_mount=" + this.c + ", m_ride=" + this.e + "}";
    }
}

