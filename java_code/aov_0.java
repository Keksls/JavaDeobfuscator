/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Shorts
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.google.common.primitives.Shorts;
import java.awt.Point;

/*
 * Renamed from aOV
 */
public class aov_0
extends abz_0
implements cUM {
    private static final String ac = "AnimStatique";
    private static final String ad = "AnimApparition";
    private static final String ae = "AnimEpee-Join";
    private static final String af = "AnimEpee-Victoire";
    private static final String ag = "AnimEpee-Defaite";
    private static final String ah = "Mob";
    private static final float ai = 0.7f;
    private final bvw_2 aj;
    private final byte ak;
    private final String al;
    private boolean am;
    private int an = -1;
    private boolean ao;
    private int ap = -1;
    private int aq = -1;

    aov_0(long l, int n, int n2, short s2, bvw_2 bvw_22, byte by) {
        super(l, n, n2, s2);
        this.aj = bvw_22;
        this.ak = by;
        this.al = this.aN();
        this.ao = bvw_22.b(by);
        this.am = bvw_22.c(by);
    }

    private String aN() {
        blx_1 blx_12 = this.aH();
        if (blx_12 == null) {
            return String.valueOf(0);
        }
        if (blx_12 instanceof bmv_1) {
            return ah;
        }
        fjv_0 fjv_02 = ((fjw_0)fjw_0.e()).c(blx_12.T_());
        if (fjv_02 != null && fjv_02.a() || this.aj.af_() == emr_2.v) {
            return String.valueOf(blx_12.fE().n());
        }
        return String.valueOf(0);
    }

    void b() {
        this.a("EpeeCombat");
        this.a(this.ak == 0 ? aej_2.e : aej_2.a);
        this.a((short)6);
        this.a(azs_0.a().a("ANMGUIPath") + "EpeeCombat.anm", true);
        this.g(String.format("%s-%s", ac, this.al));
        this.e(String.format("%s-%s", ad, this.al));
        if (this.aR()) {
            this.aO();
        }
        if (this.ao) {
            this.aP();
        }
        if (this.am) {
            this.aQ();
        }
    }

    void c() {
        this.e(String.format("%s-%s", ae, this.al));
    }

    void d() {
        blx_1 blx_12 = this.aH();
        String string = blx_12 != null && this.aj.b(blx_12.a_()) ? String.format("%s-%s", af, this.al) : String.format("%s-%s", ag, this.al);
        this.a(new aow_0(this));
        this.e(string);
        this.e();
    }

    public void e() {
        if (this.aR()) {
            aik_0.a().b(this.aq);
        }
        this.aG();
    }

    public void aG() {
        if (this.ao) {
            aik_0.a().b(this.ap);
        }
        if (this.am) {
            aik_0.a().b(this.an);
        }
    }

    public final blx_1 aH() {
        boolean bl;
        if (this.aj.y() == null || this.aj.af_() == emr_2.k) {
            boolean bl2 = this.aj.af_() == emr_2.v == (this.aj.f() != this.ak);
            return bl2 ? this.aj.x() : this.aj.y();
        }
        boolean bl3 = bl = this.aj.y().Y() == this.ak;
        if (this.aj.af_().x().a()) {
            return bl ? this.aj.x() : this.aj.y();
        }
        return bl ? this.aj.y() : this.aj.x();
    }

    @Override
    public cSS[] aI() {
        blx_1 blx_12 = this.aH();
        if (blx_12 == null) {
            return cSS.k;
        }
        return blx_12.aI();
    }

    @Override
    public boolean aJ() {
        return true;
    }

    @Override
    public Point aK() {
        ace_0 ace_02 = ans_0.D().c();
        afd_1 afd_12 = aht_0.c(ace_02, this.J(), this.K(), this.L() + (float)this.ag());
        return new Point(Math.round(afd_12.a), Math.round(afd_12.b));
    }

    @Override
    public short aL() {
        int n = Math.round((float)this.ag() * 10.0f);
        return Shorts.saturatedCast((long)n);
    }

    @Override
    public boolean at() {
        bmr_1 bmr_12 = azu_0.j().k();
        return bmr_12 != null && bmr_12.cP() == null;
    }

    private void aO() {
        this.aq = this.a(800742);
    }

    private void aP() {
        int n = this.ak == 0 ? 800755 : 800747;
        this.ap = this.a(n, true);
    }

    private void aQ() {
        this.an = this.a(800748, true);
    }

    public int a(int n) {
        return this.a(n, false);
    }

    private int a(int n, boolean bl) {
        FreeParticleSystem freeParticleSystem = aij_0.a().a(n);
        int n2 = freeParticleSystem.ac();
        float f2 = 0.0f;
        if (bl) {
            f2 = this.ak == 0 ? -0.7f : 0.7f;
        }
        freeParticleSystem.a(this.C + f2, this.D - f2, this.E);
        aik_0.a().b(freeParticleSystem);
        return n2;
    }

    private boolean aR() {
        if (this.aj == null) {
            return false;
        }
        if (this.ak > 0) {
            return false;
        }
        return this.aj.af_() == emr_2.k;
    }

    public bvw_2 aM() {
        return this.aj;
    }

    public void a(boolean bl) {
        if (bl == this.ao) {
            return;
        }
        this.ao = bl;
        if (this.ao) {
            this.aP();
        } else {
            aik_0.a().b(this.ap);
            this.ap = -1;
        }
    }

    public void o(boolean bl) {
        if (bl == this.am) {
            return;
        }
        this.am = bl;
        if (this.am) {
            this.aQ();
        } else {
            aik_0.a().b(this.an);
            this.an = -1;
        }
    }
}

