/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bia
 */
public class bia_2
implements bQA {
    public static final bia_2 a = new bia_2();
    private final ArrayList<biw_2> b = new ArrayList();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(biw_2 biw_22) {
        ArrayList<biw_2> arrayList = this.b;
        synchronized (arrayList) {
            this.b.add(biw_22);
        }
    }

    public void a() {
        bqz_1.a.a(this);
    }

    public void b() {
        bqz_1.a.b(this);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void c() {
        ArrayList<biw_2> arrayList = this.b;
        synchronized (arrayList) {
            bmr_1 bmr_12 = azu_0.j().k();
            if (bmr_12 == null) {
                return;
            }
            bhr_1 bhr_12 = bmr_12.eK();
            wu_0 wu_02 = wc_0.p().a();
            for (int k = this.b.size() - 1; k >= 0; --k) {
                biw_2 biw_22 = this.b.get(k);
                biw_22.z();
                bhj_1 bhj_12 = bhr_12.w(biw_22.i());
                if (bhj_12.e() != null || rl_0.e(bhj_12, wu_02) || rl_0.f(bhj_12, wu_02)) continue;
                this.b.remove(k);
            }
        }
        bhw_2.a.e();
    }

    public String toString() {
        return "QuestTimeManager{m_achievements=" + this.b + "}";
    }
}

