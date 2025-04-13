/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.BitSet;

/*
 * Renamed from bha
 */
public final class bha_2
extends ekn_0
implements YO,
bhr_2,
bhs_2 {
    private int y;
    private final bhn_2 I;

    private bha_2() {
        this.I = new bhq_2(this).a();
    }

    public bha_2(int n, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, int n4, float[] fArray, String string, String string2, String string3, String string4, float[] fArray2, boolean bl, boolean bl2, int n5) {
        super(n, aqd_12, bitSet, bitSet2, n2, n4, fArray, fArray2, bl, bl2, n5);
        this.y = n3;
        bhq_2 bhq_22 = new bhq_2(this).c(string3).d(string4).b(string2).a(string);
        this.I = bhq_22.a();
    }

    @Override
    public sr_0 y() {
        return new bha_2();
    }

    public bha_2 a(elb_0 elb_02) {
        bha_2 bha_22 = (bha_2)super.c(elb_02);
        bha_22.y = this.y;
        bha_22.I.a(this.I);
        bha_22.ar();
        return bha_22;
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
    public azj_2 h() {
        return azf_2.e;
    }

    @Override
    public /* synthetic */ ekn_0 c(elb_0 elb_02) {
        return this.a(elb_02);
    }

    @Override
    public /* synthetic */ ekk_0 b(elb_0 elb_02) {
        return this.a(elb_02);
    }
}

