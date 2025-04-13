/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;

/*
 * Renamed from bxs
 */
public class bxs_2
implements eom_1 {
    public static final bxs_2 a = new bxs_2();
    final acy_2<bic_2> b = new acy_2();
    private final ArrayList<bik_2> c = new ArrayList();
    final Object d = new Object();

    private bxs_2() {
    }

    @Override
    public void a() {
        this.c.clear();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(int n) {
        bua_0.a.a(new bud_1());
        Object object = this.d;
        synchronized (object) {
            this.b.a(n, new bic_2(n));
        }
        bhw_2.a.b();
        ado_1.a().a(new bxt_2(this), 500L, 1);
    }

    @Override
    public void b(int n) {
        ado_1.a().a(new bxu_2(this, n), 2500L, 1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(int n, eos_1 eos_12) {
        Object object = this.d;
        synchronized (object) {
            bic_2 bic_22 = this.b.g(n);
            bic_22.n();
            this.b(n, eos_12);
            if (eos_12 == eos_1.b) {
                cdw_0.n().c(600074L);
                this.c(n);
            } else if (eos_12 == eos_1.c) {
                cdw_0.n().c(600125L);
                this.c(n);
            }
            this.c.add(new bhv_2(n, eos_12, bic_22.c()));
        }
    }

    private void c(int n) {
        fyy_0 fyy_02 = fpm_0.b().h().d("tutorialMessageDialog");
        fsQ fsQ2 = (fsQ)fyy_02.a("fightChallengesList");
        int n2 = fsQ2.size();
        for (int k = 0; k < n2; ++k) {
            bic_2 bic_22 = (bic_2)fsQ2.getValue(k);
            if (bic_22.i() != n) continue;
            ftj_0 ftj_02 = (ftj_0)fsQ2.getWidget(null, k);
            deu.a(ftj_02.getInnerElementMap());
            return;
        }
    }

    private void b(int n, eos_1 eos_12) {
        String string;
        ani_2 ani_22 = new ani_2().a().a(aug_0.g);
        ani_22.a((CharSequence)bae.h().a(140, (long)n, new Object[0]));
        String string2 = ani_22.r();
        if (eos_12 == eos_1.b) {
            string = bae.h().a("fightChallenges.success", string2);
        } else if (eos_12 == eos_1.c) {
            string = bae.h().a("fightChallenges.failure", string2);
        } else {
            return;
        }
        ani_22 = new ani_2().i().a(aug_0.f);
        ani_22.a((CharSequence)string);
        aul_0.a().c(ani_22.r());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Collection<bic_2> b() {
        Object object = this.d;
        synchronized (object) {
            if (this.b.g()) {
                return null;
            }
            ArrayList<bic_2> arrayList = new ArrayList<bic_2>();
            for (bic_2 bic_22 : this.b) {
                arrayList.add(bic_22);
            }
            return arrayList;
        }
    }

    public Collection<bik_2> c() {
        ArrayList<bik_2> arrayList = new ArrayList<bik_2>();
        arrayList.addAll(this.c);
        return arrayList;
    }
}

