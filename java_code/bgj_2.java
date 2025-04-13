/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.BitSet;

/*
 * Renamed from bgJ
 */
public class bgj_2
extends ekb_0
implements YO,
bhr_2,
bhs_2 {
    private int x;
    private final bhn_2 y;

    public bgj_2() {
        this.y = new bhq_2(this).a();
    }

    public bgj_2(int n, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, int n4, float[] fArray, String string, String string2, String string3, String string4, float[] fArray2, boolean bl, boolean bl2, int n5) {
        super(n, aqd_12, bitSet, bitSet2, n2, n4, fArray, fArray2, bl, bl2, n5);
        this.x = n3;
        bhq_2 bhq_22 = new bhq_2(this).c(string3).d(string4).b(string2).a(string);
        this.y = bhq_22.a();
    }

    @Override
    protected sr_0 y() {
        return new bgj_2();
    }

    public bgj_2 a(elb_0 elb_02) {
        bgj_2 bgj_22 = (bgj_2)super.b(elb_02);
        bgj_22.x = this.x;
        bgj_22.y.a(this.y);
        bgj_22.ar();
        return bgj_22;
    }

    @Override
    public void a(int n, int n2, short s2, sd_0 sd_02) {
    }

    @Override
    public int ao() {
        return this.x;
    }

    @Override
    public void a(aej_2 aej_22) {
        super.a(aej_22);
        if (this.y.q() != null) {
            this.y.q().a(this.F());
        }
    }

    @Override
    public int f() {
        return 0;
    }

    @Override
    public String g() {
        ani_2 ani_22 = new ani_2();
        ani_22.a((CharSequence)this.ap());
        ArrayList<String> arrayList = eDi.a(new eDt(this, this.E, 0));
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            ani_22.m().a((CharSequence)arrayList.get(k));
        }
        return ani_22.r();
    }

    @Override
    public String ap() {
        if (this.y != null) {
            return this.y.u();
        }
        return "";
    }

    @Override
    public azj_2 h() {
        return azf_2.e;
    }

    @Override
    public bhn_2 aq() {
        return this.y;
    }

    @Override
    public boolean a(String string) {
        return false;
    }

    @Override
    public /* synthetic */ ekk_0 b(elb_0 elb_02) {
        return this.a(elb_02);
    }
}

