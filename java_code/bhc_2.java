/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

/*
 * Renamed from bhc
 */
public final class bhc_2
extends ekp_0
implements bhr_2,
bhs_2 {
    private static final short x = 1;
    private int y;
    private final bhn_2 I;

    private bhc_2() {
        this.I = new bhq_2(this).a();
        this.I.a(new bgs_2());
    }

    public bhc_2(int n, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, int n4, float[] fArray, String string, String string2, String string3, String string4, float[] fArray2, boolean bl, boolean bl2, int n5) {
        super(n, aqd_12, bitSet, bitSet2, n2, n4, fArray, fArray2, bl, bl2, n5);
        this.y = n3;
        bhq_2 bhq_22 = new bhq_2(this).c(string3).d(string4).b(string2).a(string);
        bhq_22.a((short)1);
        this.I = bhq_22.a();
        this.I.a(new bgs_2());
    }

    @Override
    public sr_0 y() {
        return new bhc_2();
    }

    public bhc_2 a(elb_0 elb_02) {
        bhc_2 bhc_22 = (bhc_2)super.b(elb_02);
        bhc_22.y = this.y;
        bhc_22.I.a(this.I);
        bhc_22.ar();
        return bhc_22;
    }

    @Override
    public void a(int n, int n2, short s2, sd_0 sd_02) {
    }

    @Override
    public int ao() {
        return this.y;
    }

    @Override
    public void a(aej_2 aej_22) {
        super.a(aej_22);
        if (this.I.q() != null) {
            this.I.q().a(this.F());
        }
    }

    @Override
    public bhn_2 aq() {
        return this.I;
    }

    @Override
    public boolean a(String string) {
        return false;
    }

    @Override
    public String ap() {
        if (this.I != null) {
            return this.I.u();
        }
        return "";
    }

    @Override
    public /* synthetic */ ekk_0 b(elb_0 elb_02) {
        return this.a(elb_02);
    }
}

