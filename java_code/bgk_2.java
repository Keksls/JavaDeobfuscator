/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

/*
 * Renamed from bgK
 */
public final class bgk_2
extends ekc_0
implements bhr_2,
bhs_2 {
    private long x;
    private int y;
    private final bhn_2 I;

    private bgk_2() {
        this.I = new bhq_2(this).a();
    }

    public bgk_2(int n, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, int n4, float[] fArray, String string, String string2, String string3, String string4, float[] fArray2, boolean bl, boolean bl2, int n5) {
        super(n, aqd_12, bitSet, bitSet2, n2, n4, fArray, fArray2, bl, bl2, n5);
        this.y = n3;
        bhq_2 bhq_22 = new bhq_2(this).c(string3).d(string4).b(string2).a(string);
        this.I = bhq_22.a();
    }

    @Override
    public sr_0 y() {
        return new bgk_2();
    }

    public bgk_2 a(elb_0 elb_02) {
        bgk_2 bgk_22 = (bgk_2)super.b(elb_02);
        bgk_22.y = this.y;
        bgk_22.I.a(this.I);
        bgk_22.x = elb_02.g();
        bgk_22.ar();
        return bgk_22;
    }

    @Override
    public void ar() {
        super.ar();
        if (this.l != null && this.l.J_() == 20) {
            this.I.a((ahh_0)((blx_1)this.l).bv());
        }
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

    public long as() {
        return this.x;
    }

    @Override
    public /* synthetic */ ekk_0 b(elb_0 elb_02) {
        return this.a(elb_02);
    }
}

