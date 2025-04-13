/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.set.hash.TIntHashSet;
import org.apache.log4j.Logger;

/*
 * Renamed from bCu
 */
public class bcu_1
extends bfr_0 {
    private final TIntHashSet al = new TIntHashSet();

    @Override
    public void e() {
        super.e();
        if (this.ad == null) {
            return;
        }
        bcf_1 bcf_12 = (bcf_1)this.ad;
        bsx_2 bsx_22 = bcf_12.Z();
        if (bsx_22 == null) {
            return;
        }
        bso_1 bso_12 = bsx_22.v();
        if (bso_12 == null) {
            return;
        }
        int n = bso_12.p();
        if (this.al.contains(n)) {
            n = 408;
        }
        if (this.b() == n) {
            return;
        }
        bcf_12.d(this);
        ahs.d().b(this);
        ph_0 ph_02 = bfv_0.b().a(n);
        if (!(ph_02 instanceof bcu_1)) {
            Y.error((Object)("la vue " + n + " n'est pas du type DimensionalBagView"));
            ph_02 = bfv_0.b().a(408);
            if (ph_02 == null) {
                Y.error((Object)"aucun effort: la vue 408 n'est pas du type DimensionalBagView");
            }
            this.al.add(n);
        }
        bcu_1 bcu_12 = (bcu_1)ph_02;
        bcf_12.a(bcu_12);
        ahs.d().a(bcu_12);
        bcu_12.Q();
        aiI.a(bcu_12);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.h(this.aI());
        bai_0 bai_02 = azu_0.j().n();
        this.f(bai_02 != null && emp_0.b(bai_02.v(), emq_0.bk));
    }

    public boolean aK() {
        bcf_1 bcf_12 = (bcf_1)this.ad;
        return bcf_12.u();
    }

    @Override
    public boolean aI() {
        return false;
    }

    static /* synthetic */ void a(bcu_1 bcu_12, abm_1 abm_12) {
        bcu_12.a(abm_12);
    }

    static /* synthetic */ Logger aL() {
        return Y;
    }
}

