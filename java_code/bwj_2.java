/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from bwJ
 */
class bwj_2
implements ena_1<epq_2> {
    final /* synthetic */ int a;
    final /* synthetic */ ss_0 b;
    final /* synthetic */ bmr_1 c;

    bwj_2(int n, ss_0 ss_02, bmr_1 bmr_12) {
        this.a = n;
        this.b = ss_02;
        this.c = bmr_12;
    }

    @Override
    public void a(epq_2 epq_22, fin_0 fin_02, aff_1 aff_12) {
        if (fin_02 == null || fin_02.i() != this.a) {
            return;
        }
        List<sr_0> list = this.b.c(aff_12);
        if (list.isEmpty()) {
            return;
        }
        for (sr_0 sr_02 : list) {
            this.b.b(sr_02);
        }
    }

    @Override
    public void a(epq_2 epq_22) {
        if (!this.c.equals(epq_22)) {
            return;
        }
        this.c.a_(eps_0.d).g(0);
    }

    @Override
    public void d() {
        this.c.bk();
    }
}

