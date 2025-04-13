/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

/*
 * Renamed from bgL
 */
public final class bgl_2
extends ekd_0
implements afa_0,
bhr_2,
bhs_2 {
    private static final short y = 1;
    private int I;
    private final bhn_2 J;
    private afv K;

    private bgl_2() {
        this.J = new bhq_2(this).a();
        this.J.a(new bgs_2());
    }

    public bgl_2(int n, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, int n4, float[] fArray, String string, String string2, String string3, String string4, float[] fArray2, boolean bl, boolean bl2, int n5) {
        super(n, aqd_12, bitSet, bitSet2, n2, n4, fArray, fArray2, bl, bl2, n5);
        this.I = n3;
        bhq_2 bhq_22 = new bhq_2(this).c(string3).d(string4).b(string2).a(string);
        bhq_22.a((short)1);
        this.J = bhq_22.a();
        this.J.a(new bgs_2());
    }

    protected bgl_2 as() {
        return new bgl_2();
    }

    public bgl_2 a(elb_0 elb_02) {
        bgl_2 bgl_22 = (bgl_2)super.b(elb_02);
        bgl_22.I = this.I;
        bgl_22.J.a(this.J);
        bgl_22.ar();
        return bgl_22;
    }

    @Override
    public void a(int n, int n2, short s2, sd_0 sd_02) {
    }

    @Override
    public int ao() {
        return this.I;
    }

    @Override
    public bhn_2 aq() {
        return this.J;
    }

    @Override
    public afv e() {
        return this.K;
    }

    @Override
    public void a(afv afv2) {
        this.K = afv2;
    }

    @Override
    public void a(erb_2 erb_22) {
        super.a(erb_22);
        dfu_0 dfu_02 = new dfu_0(this);
        dfu_02.a(erb_22);
        dfu_02.a_(17998);
        dfu_02.a(true);
        add_2.b().a(dfu_02);
    }

    @Override
    public void at() {
        bvx_2 bvx_22;
        super.at();
        apw_0.a().c(this);
        if (this.O() instanceof eFr && (bvx_22 = azu_0.j().k().cP()) != null && bvx_22.c() == ((eFr)this.O()).k()) {
            apw_0.a().a((sr_0)this, bvx_22);
        }
        ((aNF)ans_0.D().c()).a(apw_0.a());
    }

    @Override
    public void b(int n, int n2, short s2) {
        super.b(n, n2, s2);
        apw_0.a().b(this);
        ((aNF)ans_0.D().c()).a(apw_0.a());
    }

    @Override
    public void e(boolean bl) {
        if (bl) {
            cyp_0.a(this);
        } else {
            cyp_0.a(null);
        }
    }

    @Override
    public boolean a(String string) {
        return "AnimMort".equals(string);
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

    @Override
    protected /* synthetic */ sr_0 y() {
        return this.as();
    }
}

