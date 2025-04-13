/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;

/*
 * Renamed from bhW
 */
public class bhw_2
implements ajh_1 {
    public static final bhw_2 a = new bhw_2();
    public static final String b = "fightChallenge";
    public static final String d = "environmentQuest";
    public static final String e = "almanaxQuest";
    public static final String f = "regularQuests";
    private int g = -1;
    private int h = -1;
    private int i = -1;
    private long j;

    public void a() {
        this.j = azu_0.j().k().a_();
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.g();
        fis_1.a().a("followedAchievements", this);
        fis_1.a().a("canFollowMoreAchievements", true);
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(e)) {
            return this.g == -1 ? null : biz_2.a.b(this.j, this.g);
        }
        if (string.equals(d)) {
            return this.h == -1 ? null : blj_2.a.a(this.h);
        }
        if (string.equals(f)) {
            ArrayList<biw_2> arrayList = new ArrayList<biw_2>();
            TIntArrayList tIntArrayList = azu_0.j().k().eK().a();
            int n = tIntArrayList.size();
            for (int k = 0; k < n; ++k) {
                biw_2 biw_22 = this.b(tIntArrayList.get(k), true);
                if (biw_22 == null) continue;
                arrayList.add(biw_22);
            }
            return arrayList;
        }
        if (string.equals(b)) {
            return bxs_2.a.b();
        }
        return null;
    }

    private void g() {
        int n = -1;
        bmr_1 bmr_12 = azu_0.j().k();
        bhr_1 bhr_12 = bmr_12.eK();
        TIntObjectIterator<bhj_1> tIntObjectIterator = bhr_12.d();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            bhj_1 bhj_12 = (bhj_1)tIntObjectIterator.value();
            if (!bhr_12.d(bhj_12.a()) || bhr_12.e(bhj_12.a()) || !bhr_12.p(bhj_12.a())) continue;
            n = bhj_12.a();
            break;
        }
        if (n != this.g) {
            bhr_12.a(n, true);
            biz_2.a.b(bmr_12.a_(), this.g).s();
        }
    }

    private biw_2 b(int n, boolean bl) {
        bia_1 bia_12;
        bmr_1 bmr_12;
        bmr_1 bmr_13 = bzf_1.a();
        bmr_1 bmr_14 = bmr_12 = bmr_13 == null ? azu_0.j().k() : bmr_13;
        if (bmr_12 == null) {
            return null;
        }
        bhj_1 bhj_12 = bmr_12.eK().w(n);
        if (bhj_12 == null) {
            return null;
        }
        if (bmr_12.eK().p(n)) {
            int n2 = this.g = bl ? n : -1;
        }
        if ((bia_12 = biz_2.a.d(this.j, bhj_12.a())) == null) {
            return null;
        }
        bin_2 bin_22 = bia_12.b(bhj_12.o().a());
        if (bin_22 == null || bin_22.f()) {
            return null;
        }
        biu_2 biu_22 = (biu_2)bin_22;
        return biu_22.b(n);
    }

    private boolean a(bhj_1 bhj_12) {
        return bhj_12 != null && bhj_12.m() && bhj_12.n();
    }

    private void h() {
        if (!this.i()) {
            cVh.a(false);
        } else if (!cVh.f()) {
            cVh.a(true);
        }
    }

    private boolean i() {
        if (this.i != -1) {
            return false;
        }
        bhr_1 bhr_12 = azu_0.j().k().eK();
        return this.g != -1 || this.h != -1 || bhr_12 != null && !bhr_12.a().isEmpty();
    }

    public void b() {
        fis_1.a().a((ajf_1)this, b);
    }

    public void a(int n) {
        this.h = n;
        fis_1.a().a((ajf_1)this, d);
        this.h();
    }

    public void a(int n, boolean bl) {
        this.b(n, bl);
        this.c();
    }

    public void c() {
        fis_1.a().a((ajf_1)this, e);
        fis_1.a().a((ajf_1)this, f);
        TIntArrayList tIntArrayList = azu_0.j().k().eK().a();
        fis_1.a().a("canFollowMoreAchievements", tIntArrayList.size() < 4);
        this.h();
    }

    public void b(int n) {
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 == null || !this.a(bmr_12.eK().w(n))) {
            return;
        }
        op_0 op_02 = OQ.a.b(n);
        if (op_02 != null) {
            biw_2 biw_22 = biz_2.a.b(bmr_12.a_(), n);
            this.i = op_02.a();
            cVh.e().b((bim_2)biw_22);
        }
        this.h();
    }

    public void c(int n) {
        int n2;
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 == null || !this.a(bmr_12.eK().w(n))) {
            return;
        }
        op_0 op_02 = OQ.a.b(n);
        if (op_02 != null && n == (n2 = op_02.a(op_02.b() - 1))) {
            this.i = -1;
            cVh.e().g();
        }
        this.h();
    }

    public void e() {
        if (this.h != -1) {
            bll_2 bll_22 = blj_2.a.a(this.h);
            bll_22.p();
        }
    }

    public void f() {
        TIntArrayList tIntArrayList = azu_0.j().k().eK().a();
        int n = tIntArrayList.size();
        for (int k = 0; k < n; ++k) {
            biw_2 biw_22 = this.b(tIntArrayList.get(k), true);
            if (biw_22 == null) continue;
            biw_22.s();
        }
    }
}

