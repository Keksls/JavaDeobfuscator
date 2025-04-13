/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

/*
 * Renamed from bhj
 */
public final class bhj_2
extends ekt_0
implements bhr_2,
bhs_2 {
    private int J;
    private bhn_2 K;

    private bhj_2() {
    }

    public bhj_2(int n, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, int n4, float[] fArray, String string, String string2, String string3, String string4, float[] fArray2, boolean bl, boolean bl2, int n5) {
        super(n, aqd_12, bitSet, bitSet2, n2, n4, fArray, fArray2, bl, bl2, n5);
        this.J = n3;
        bhq_2 bhq_22 = new bhq_2(this).c(string3).d(string4).b(string2).a(string);
        this.K = bhq_22.a();
    }

    protected bhj_2 as() {
        return new bhj_2();
    }

    public bhj_2 a(elb_0 elb_02) {
        bhj_2 bhj_22 = (bhj_2)super.b(elb_02);
        bhj_22.J = this.J;
        bhj_22.K = new bhq_2(bhj_22).a();
        bhj_22.K.a(this.K);
        bhj_22.ar();
        return bhj_22;
    }

    @Override
    public void a(aej_2 aej_22) {
        super.a(aej_22);
        if (this.K.q() != null) {
            this.K.q().a(this.F());
        }
    }

    @Override
    public bhn_2 aq() {
        return this.K;
    }

    @Override
    public void a(int n, int n2, short s2, sd_0 sd_02) {
    }

    @Override
    public int ao() {
        return this.J;
    }

    @Override
    public boolean a(String string) {
        return false;
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

