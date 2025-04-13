/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.CellParticleSystem;
import java.util.ArrayList;
import java.util.BitSet;

/*
 * Renamed from bgX
 */
public final class bgx_2
extends ekl_0
implements bhe_1,
bhr_2,
bhs_2 {
    private static final short S = 6;
    private int T;
    private final bhn_2 U;
    private CellParticleSystem V;

    private bgx_2() {
        this.U = new bhq_2(this).a((short)6).a();
        this.U.a(new bgy_2());
    }

    public bgx_2(int n, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, int n4, float[] fArray, String string, String string2, String string3, String string4, float[] fArray2, boolean bl, boolean bl2, int n5) {
        super(n, aqd_12, bitSet, bitSet2, n2, n4, fArray, fArray2, bl, bl2, n5);
        this.T = n3;
        bhq_2 bhq_22 = new bhq_2(this).c(string3).d(string4).b(string2).a(string).a((short)6);
        this.U = bhq_22.a();
        this.U.a(new bgy_2());
    }

    @Override
    public void a(int n, int n2, short s2) {
        super.a(n, n2, s2);
        if (this.U.q() != null) {
            this.U.q().b(n, (float)n2, (float)s2);
        }
    }

    @Override
    public sr_0 y() {
        return new bgx_2();
    }

    public bgx_2 a(elb_0 elb_02) {
        bgx_2 bgx_22 = (bgx_2)super.c(elb_02);
        bgx_22.T = this.T;
        bgx_22.U.a(this.U);
        bgx_22.Q = this.Q;
        bgx_22.ar();
        return bgx_22;
    }

    @Override
    public void a(int n, int n2, short s2, sd_0 sd_02) {
    }

    @Override
    public int ao() {
        return this.T;
    }

    @Override
    public void a(aej_2 aej_22) {
        super.a(aej_22);
        if (this.U.q() != null) {
            this.U.q().a(this.F());
        }
    }

    @Override
    public bhn_2 aq() {
        return this.U;
    }

    @Override
    public boolean a(String string) {
        if ("AnimMort".equals(string)) {
            return true;
        }
        if ("AnimAttaque".equals(string)) {
            return true;
        }
        if ("AnimHit".equals(string)) {
            return this.a(eps_0.b);
        }
        return false;
    }

    @Override
    public void e(boolean bl) {
        super.e(bl);
        switch (this.au()) {
            case 1: {
                if (this.v() == azu_0.j().k()) break;
                bwh_0 bwh_02 = apw_0.a().d();
                if (bwh_02 == null) {
                    return;
                }
                ss_0 ss_02 = bwh_02.i();
                if (ss_02 == null) {
                    return;
                }
                ArrayList<eko_0> arrayList = new ArrayList<eko_0>();
                for (sr_0 sr_02 : ss_02.f()) {
                    eko_0 eko_02;
                    if (sr_02.w() != ele_0.b.a() || (eko_02 = (eko_0)sr_02).v() != this.v()) continue;
                    arrayList.add(eko_02);
                }
                for (int k = 0; k < arrayList.size(); ++k) {
                    if (bl) {
                        apw_0.a().a((sr_0)arrayList.get(k), bwh_02);
                        continue;
                    }
                    apw_0.a().c((sr_0)arrayList.get(k));
                }
                apw_0.a().b();
                break;
            }
        }
    }

    @Override
    public void T() {
        super.T();
        bhf_1.a().a(this.a_(), this);
    }

    @Override
    public void U() {
        super.U();
    }

    @Override
    public void b(float f2, float f3) {
    }

    @Override
    public void b(float f2, float f3, float f4) {
    }

    @Override
    public float aj() {
        return 0.0f;
    }

    @Override
    public boolean at() {
        return true;
    }

    @Override
    public String ap() {
        if (this.U != null) {
            return this.U.u();
        }
        return "";
    }

    @Override
    public /* synthetic */ ekl_0 c(elb_0 elb_02) {
        return this.a(elb_02);
    }

    @Override
    public /* synthetic */ ekk_0 b(elb_0 elb_02) {
        return this.a(elb_02);
    }
}

