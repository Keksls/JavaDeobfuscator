/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

/*
 * Renamed from bhg
 */
public final class bhg_2
extends eks_0
implements bhr_2,
bhs_2 {
    private int I;
    private final bhn_2 J;

    private bhg_2() {
        this.J = new bhq_2(this).a();
        this.J.a(new bhh_2());
    }

    public bhg_2(int n, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, int n4, float[] fArray, String string, String string2, String string3, String string4, float[] fArray2, boolean bl, boolean bl2, int n5) {
        super(n, aqd_12, bitSet, bitSet2, n2, n4, fArray, fArray2, bl, bl2, n5);
        this.I = n3;
        bhq_2 bhq_22 = new bhq_2(this).c(string3).d(string4).b(string2).a(string);
        this.J = bhq_22.a();
        this.J.a(new bhh_2());
    }

    public bhg_2 as() {
        return new bhg_2();
    }

    public bhg_2 a(elb_0 elb_02) {
        bhg_2 bhg_22 = (bhg_2)super.b(elb_02);
        bhg_22.I = this.I;
        bhg_22.J.a(this.J);
        bhg_22.ar();
        return bhg_22;
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
    public bhn_2 aq() {
        return this.J;
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
    public /* synthetic */ sr_0 y() {
        return this.as();
    }
}

