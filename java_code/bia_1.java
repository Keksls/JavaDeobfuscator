/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;

/*
 * Renamed from biA
 */
public abstract class bia_1
implements ajh_1,
bio_2 {
    public static final String a = "totalProgressionText";
    public static final String b = "totalProgressionValue";
    public static final String d = "lastCompletedAchievement";
    public static final String e = "rootCategories";
    public static final String f = "selectedFilter";
    public static final String g = "filters";
    public static final String h = "selectedRootCategory";
    public static final String i = "isQuestView";
    public static final String j = "questInventory";
    public static final String[] k = new String[]{"totalProgressionText", "totalProgressionValue", "lastCompletedAchievement", "rootCategories", "selectedFilter", "filters", "selectedRootCategory", "isQuestView", "questInventory"};
    protected final TIntObjectHashMap<bin_2> l = new TIntObjectHashMap();
    protected final ArrayList<bin_2> m = new ArrayList();
    protected bin_2 n;
    protected bhr_1 o;
    protected bix_2 p;
    protected final long q;

    protected bia_1(long l) {
        this.q = l;
    }

    @Override
    public String[] d() {
        return k;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.b() + "/" + this.a();
        }
        if (string.equals(b)) {
            return Float.valueOf((float)this.b() / (float)this.a());
        }
        if (string.equals(d)) {
            return this.e();
        }
        if (string.equals(e)) {
            return this.m;
        }
        if (string.equals(g)) {
            return cvo_0.values();
        }
        if (string.equals(f)) {
            return cVh.e().i();
        }
        if (string.equals(h)) {
            return this.n;
        }
        return null;
    }

    public abstract boolean c();

    public biw_2 e() {
        if (this.p == null) {
            return null;
        }
        ArrayList<biw_2> arrayList = this.p.i();
        return arrayList.size() > 0 ? arrayList.get(arrayList.size() - 1) : null;
    }

    @Override
    public int a() {
        int n = 0;
        TIntObjectIterator<bhj_1> tIntObjectIterator = this.o.d();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            bhj_1 bhj_12 = (bhj_1)tIntObjectIterator.value();
            boolean bl = biz_2.a.e(this.q, bhj_12.a());
            if (bl || !bhj_12.a(azu_0.j().k())) continue;
            ++n;
        }
        return n;
    }

    @Override
    public int b() {
        int n = 0;
        TIntObjectIterator<bhj_1> tIntObjectIterator = this.o.d();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            bhj_1 bhj_12 = (bhj_1)tIntObjectIterator.value();
            boolean bl = biz_2.a.e(this.q, bhj_12.a());
            if (bl || !bhj_12.a(azu_0.j().k()) || !this.o.e(bhj_12.a())) continue;
            ++n;
        }
        return n;
    }

    @Override
    public boolean a(biw_2 biw_22) {
        return false;
    }

    public bix_2 f() {
        return this.p;
    }

    public bin_2 a(int n) {
        return (bin_2)this.l.get(n);
    }

    public bin_2 g() {
        return this.n;
    }

    public void a(bin_2 bin_22) {
        if (this.n == bin_22) {
            return;
        }
        this.n = bin_22;
        fis_1.a().a((ajf_1)this, h);
    }

    public bin_2 b(int n) {
        return this.a(n, this.l);
    }

    public bin_2 a(int n, TIntObjectHashMap tIntObjectHashMap) {
        if (tIntObjectHashMap == null) {
            return null;
        }
        TIntObjectIterator tIntObjectIterator = tIntObjectHashMap.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            bin_2 bin_22 = (bin_2)tIntObjectIterator.value();
            if (bin_22.g() == n) {
                return bin_22;
            }
            bin_2 bin_23 = this.a(n, bin_22.h());
            if (bin_23 == null) continue;
            return bin_23;
        }
        return null;
    }
}

