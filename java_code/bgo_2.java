/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

/*
 * Renamed from bgO
 */
public final class bgo_2
extends ekf_0
implements rv_0,
bhe_1,
bhr_2,
bhs_2 {
    private static final short y = 9;
    private int I;
    private final bhn_2 J;

    private bgo_2() {
        this.J = new bhq_2(this).a();
        this.J.a(new bgs_2());
    }

    public bgo_2(int n, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, int n4, float[] fArray, String string, String string2, String string3, String string4, float[] fArray2, boolean bl, boolean bl2, int n5) {
        super(n, aqd_12, bitSet, bitSet2, n2, n4, fArray, fArray2, bl, bl2, n5);
        this.I = n3;
        bhq_2 bhq_22 = new bhq_2(this).c(string3).d(string4).b(string2).a(string);
        bhq_22.a((short)9);
        this.J = bhq_22.a();
        this.J.a(new bgs_2());
    }

    @Override
    public void ar() {
        super.ar();
        this.w.a(this);
    }

    @Override
    public sr_0 y() {
        return new bgo_2();
    }

    public bgo_2 a(elb_0 elb_02) {
        bgo_2 bgo_22 = (bgo_2)super.b(elb_02);
        bgo_22.I = this.I;
        bgo_22.J.a(this.J);
        bgo_22.ar();
        return bgo_22;
    }

    @Override
    public void a(int n, int n2, short s2, sd_0 sd_02) {
    }

    @Override
    public int ao() {
        return this.I;
    }

    @Override
    public void a(aej_2 aej_22) {
        super.a(aej_22);
        if (this.J.q() != null) {
            this.J.q().a(this.F());
        }
    }

    @Override
    public void T() {
        bhf_1.a().a(this.a_(), this);
    }

    @Override
    public void U() {
        bhf_1.a().b(this.a_());
    }

    @Override
    public bhn_2 aq() {
        return this.J;
    }

    @Override
    public void a(rs_0 rs_02) {
        if (rs_02.p() == eps_0.b && this.a("AnimHit")) {
            this.J.b("AnimHit");
        }
    }

    @Override
    public void a(int n, int n2, short s2) {
        super.a(n, n2, s2);
        if (this.J.q() != null) {
            this.J.q().b(n, (float)n2, (float)s2);
        }
    }

    @Override
    public boolean at() {
        return true;
    }

    @Override
    public float L() {
        return this.I();
    }

    @Override
    public float J() {
        return this.G();
    }

    @Override
    public float K() {
        return this.H();
    }

    @Override
    public float aj() {
        return 0.0f;
    }

    @Override
    public void b(float f2, float f3) {
    }

    @Override
    public void b(float f2, float f3, float f4) {
    }

    @Override
    public void e(boolean bl) {
        if (bl) {
            cyp_0.g();
            cyp_0.a(this);
        } else {
            cyp_0.g();
            cyp_0.a(null);
        }
    }

    @Override
    public boolean a(String string) {
        if ("AnimMort".equals(string)) {
            return true;
        }
        if ("AnimAttaque".equals(string)) {
            return true;
        }
        return "AnimHit".equals(string);
    }

    @Override
    public String ap() {
        if (this.J != null) {
            return this.J.u();
        }
        return "";
    }

    @Override
    public /* synthetic */ ekk_0 b(elb_0 elb_02) {
        return this.a(elb_02);
    }
}

