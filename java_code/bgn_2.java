/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
import java.util.ArrayList;
import java.util.BitSet;
import org.apache.commons.lang3.StringUtils;

/*
 * Renamed from bgN
 */
public final class bgn_2
extends eke_0
implements YO,
bhr_2 {
    private int I;
    private final bhn_2 J;

    private bgn_2() {
        this.J = new bhq_2(this).a();
    }

    public bgn_2(int n, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, int n4, float[] fArray, String string, String string2, String string3, String string4, float[] fArray2, boolean bl, boolean bl2, int n5) {
        super(n, bitSet, bitSet2, n2, n4, fArray, fArray2, bl, bl2, n5);
        this.I = n3;
        bhq_2 bhq_22 = new bhq_2(this);
        bhq_22.c(string3).d(string4).b(string2).a("");
        this.J = bhq_22.a();
    }

    @Override
    public sr_0 y() {
        return new bgn_2();
    }

    public bgn_2 a(elb_0 elb_02) {
        bgn_2 bgn_22 = (bgn_2)super.b(elb_02);
        bgn_22.I = this.I;
        bgn_22.J.a(this.J);
        bgn_22.ar();
        return bgn_22;
    }

    @Override
    public void a(int n, int n2, short s2, sd_0 sd_02) {
    }

    public int ao() {
        return this.I;
    }

    @Override
    public int f() {
        return 0;
    }

    @Override
    public azj_2 h() {
        return azf_2.e;
    }

    @Override
    public String g() {
        ani_2 ani_22 = new ani_2();
        String string = bae.h().a(6, (long)((int)this.A()), new Object[0]);
        if (StringUtils.isNotBlank((CharSequence)string)) {
            ani_22.a().a((CharSequence)string).b();
        }
        ArrayList<String> arrayList = eDi.a(new eDt(this, this.E, 0));
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            ani_22.m().a((CharSequence)arrayList.get(k));
        }
        return ani_22.r();
    }

    @Override
    public bhn_2 aq() {
        return this.J;
    }

    @Override
    public void z() {
        super.z();
        cyp_0.g().a(this);
    }

    @Override
    public boolean a(String string) {
        return false;
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

