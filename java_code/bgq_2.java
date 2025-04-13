/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

/*
 * Renamed from bgQ
 */
public final class bgq_2
extends ekh_0
implements afa_0,
bhr_2,
bhs_2 {
    private static final short I = 1;
    private int J;
    private final bhn_2 K;
    private afv L;

    private bgq_2() {
        this.K = new bhq_2(this).a();
        this.K.a(new bgs_2());
    }

    public bgq_2(int n, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, int n4, float[] fArray, String string, String string2, String string3, String string4, float[] fArray2, boolean bl, boolean bl2, int n5) {
        super(n, aqd_12, bitSet, bitSet2, n2, n4, fArray, fArray2, bl, bl2, n5);
        this.J = n3;
        bhq_2 bhq_22 = new bhq_2(this).c(string3).d(string4).b(string2).a(string);
        bhq_22.a((short)1);
        this.K = bhq_22.a();
        this.K.a(new bgs_2());
    }

    protected bgq_2 as() {
        return new bgq_2();
    }

    public bgq_2 a(elb_0 elb_02) {
        bgq_2 bgq_22 = (bgq_2)super.b(elb_02);
        bgq_22.J = this.J;
        bgq_22.K.a(this.K);
        bgq_22.ar();
        return bgq_22;
    }

    @Override
    public void a(int n, int n2, short s2, sd_0 sd_02) {
    }

    @Override
    public int ao() {
        return this.J;
    }

    @Override
    public bhn_2 aq() {
        return this.K;
    }

    @Override
    public afv e() {
        return this.L;
    }

    @Override
    public void a(afv afv2) {
        this.L = afv2;
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
        super.at();
        apw_0.a().c(this);
        if (this.j.g().d(this)) {
            bvx_2 bvx_22;
            if (this.O() instanceof eFr && (bvx_22 = azu_0.j().k().cP()) != null && bvx_22.c() == ((eFr)this.O()).k()) {
                apw_0.a().a((sr_0)this, bvx_22);
            }
            ((aNF)ans_0.D().c()).a(apw_0.a());
        }
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
        if (this.K != null) {
            return this.K.u();
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

