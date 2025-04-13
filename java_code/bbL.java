/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.apache.log4j.Logger;

public class bbL
extends bal_0 {
    protected static final Logger o = Logger.getLogger(bbL.class);
    private short p;
    private final yt_2 q;
    private final enx_1 r = new enx_1();

    public bbL(int n, int n2, int n3, int n4, yt_2 yt_22, boolean bl, boolean bl2, long l, int n5, int n6, short s2) {
        super(n, n2, n3, n4, bl, bl2, l, n5, n6, s2);
        this.q = yt_22;
    }

    @Override
    public long o() {
        bpl_0 bpl_02;
        blx_1 blx_12 = this.d(this.f());
        if (blx_12 == null) {
            return 0L;
        }
        biI biI2 = blx_12.bv();
        biI2.bZ();
        if (biI2.bQ() == null || biI2.bQ().a() != 2) {
            biI2.b(new bwz_0(blx_12));
        }
        if ((bpl_02 = bbL.a(blx_12, this.q)) == null) {
            return 0L;
        }
        bph_0 bph_02 = (bph_0)bpl_02.r();
        this.p = bpl_02.c();
        if (!bph_02.y() && !biI2.bI().a(erl_2.av)) {
            this.e(bph_02.a());
        }
        boolean bl = true;
        aff_1 aff_12 = new aff_1(this.t(), this.u(), this.v());
        if (this.D()) {
            bvx_2 bvx_22 = blx_12.bz();
            if (bvx_22 != null) {
                bvx_22.a(bpl_02, (epq_2)blx_12);
                bvx_22.a((epq_2)blx_12, bph_02, aff_12);
                fir_0 fir_02 = bvx_22.b(blx_12, bpl_02, aff_12, false);
                if (fir_02 == fir_0.a) {
                    bl = false;
                }
            }
            if (this.r()) {
                this.a(blx_12);
                this.F();
            }
        }
        this.r.a(this.B(), blx_12, bpl_02, bpl_02.q(), bpl_02.p(), aff_12);
        if (bl) {
            this.r.a();
        }
        if (azu_0.j().k() == blx_12) {
            bua_0.a.a(new buu_1(bph_02.i()));
        }
        if (!blx_12.bV()) {
            return super.o();
        }
        this.j();
        return -1L;
    }

    public static bpl_0 a(blx_1 blx_12, yt_2 yt_22) {
        bpl_0 bpl_02;
        fiz<bpl_0> fiz2 = blx_12.aZ();
        if (fiz2 != null && fiz2.a() != null) {
            bpl_02 = (bpl_0)fiz2.a().a(yt_22);
        } else {
            bpn_0 bpn_02 = new bpn_0(blx_12);
            bpl_02 = bpn_02.a(yt_22);
        }
        return bpl_02;
    }

    private void a(blx_1 blx_12) {
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

    @Override
    public short w() {
        return this.p;
    }

    @Override
    public boolean x() {
        blx_1 blx_12 = this.d(this.f());
        if (blx_12 == null) {
            return false;
        }
        bpl_0 bpl_02 = bbL.a(blx_12, this.q);
        int n = bpl_02.q();
        int n2 = bpl_02.p();
        int n3 = this.t();
        int n4 = this.u();
        boolean bl = ((bph_0)bpl_02.r()).l(bpl_02, blx_12, new aff_1(n3, n4, this.v()), blx_12.Q_());
        emb_1<bpl_0, blx_1> emb_12 = new emb_1<bpl_0, blx_1>(null);
        return emb_12.a(blx_12, bpl_02, n, n2, bl, n3, n4);
    }

    @Override
    public sr_0 y() {
        blx_1 blx_12 = this.d(this.f());
        if (blx_12 == null) {
            return null;
        }
        return this.r.g();
    }

    @Override
    public sr_0 z() {
        blx_1 blx_12 = this.d(this.f());
        if (blx_12 == null) {
            return null;
        }
        return this.r.f();
    }
}

