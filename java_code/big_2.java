/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Ordering
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from big
 */
public class big_2
implements ajh_1 {
    public static final String a = "achievements";
    public static final String b = "filters";
    public static final String d = "selectedFilter";
    private final int e;
    private final Collection<biw_2> f = new ArrayList<biw_2>();
    private final List<biw_2> g = new ArrayList<biw_2>();
    private final List<bij_2> h = new ArrayList<bij_2>();
    private static final Ordering<biw_2> i = Ordering.natural().onResultOf((Function)new bih_2());
    private biw_2 j;
    private bij_2 k;

    public big_2(int n) {
        this.e = n;
        this.j = null;
        this.c();
    }

    private void c() {
        for (bii_2 bii_22 : bii_2.values()) {
            this.h.add(bij_2.a(bii_22));
        }
        this.k = this.h.get(0);
        biu_2 biu_22 = (biu_2)biz_2.a.c(azu_0.j().k().a_(), this.e);
        this.f.addAll(biu_22.k());
        this.e();
    }

    private void e() {
        this.g.clear();
        for (biw_2 biw_22 : this.f) {
            if (!this.k.a().a(biw_22.i())) continue;
            this.g.add(biw_22);
        }
        this.g.sort((Comparator<biw_2>)i);
        fis_1.a().a((ajf_1)this, a);
        if (!this.g.contains(this.j)) {
            this.a(this.g.isEmpty() ? null : this.g.get(0));
        }
    }

    public void a() {
        if (this.j == null) {
            return;
        }
        cld_1 cld_12 = new cld_1(this.j.i(), -1L, true);
        azu_0.j().K().c(cld_12);
    }

    public void a(biw_2 biw_22) {
        if (this.j == biw_22) {
            return;
        }
        this.j = biw_22;
        if (fpm_0.b().q("mercenaryDialog")) {
            fis_1.a().a("displayedAchievement", (Object)this.j, "mercenaryDialog");
        }
    }

    public biw_2 b() {
        return this.j;
    }

    public void a(bij_2 bij_22) {
        if (this.k == bij_22) {
            return;
        }
        this.k = bij_22;
        this.e();
    }

    @Override
    public String[] d() {
        return b_;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return ImmutableList.copyOf(this.g);
        }
        if (string.equals(b)) {
            return ImmutableList.copyOf(this.h);
        }
        if (string.equals(d)) {
            return this.k;
        }
        return null;
    }

    public String toString() {
        return "MercenariesView{m_achievementCategoryId=" + this.e + ", m_views=" + this.f + ", m_filteredViews=" + this.g + ", m_filters=" + this.h + ", m_selectedAchievement=" + this.j + ", m_selectedFilter=" + this.k + "}";
    }
}

