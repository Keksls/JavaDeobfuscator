/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;

/*
 * Renamed from bin
 */
public abstract class bin_2
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "categories";
    public static final String d = "achievements";
    public static final String e = "isHistory";
    public static final String f = "achievementsQuickList";
    public static final String g = "listFilter";
    protected int h;
    protected final long i;
    protected final bhr_1 j;
    protected fwl k = new fwl();

    protected bin_2(long l) {
        this.i = l;
        this.j = bhl_1.a.b(l);
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.e();
        }
        if (string.equals(e)) {
            return this.f();
        }
        if (string.equals(d)) {
            return this.i();
        }
        if (string.equals(f)) {
            return this.c();
        }
        if (g.equals(string)) {
            return this.k;
        }
        return null;
    }

    public biw_2 L_() {
        ArrayList<biw_2> arrayList = this.i();
        biw_2 biw_22 = (biw_2)fis_1.a().e("selectedAchievement");
        if (biw_22 == null) {
            return null;
        }
        int n = arrayList.indexOf(biw_22) - 1;
        if (n < 0) {
            n = arrayList.size() - 1;
        }
        return arrayList.get(n);
    }

    public biw_2 M_() {
        ArrayList<biw_2> arrayList = this.i();
        biw_2 biw_22 = (biw_2)fis_1.a().e("selectedAchievement");
        if (biw_22 == null) {
            return null;
        }
        int n = arrayList.indexOf(biw_22) + 1;
        if (n > arrayList.size() - 1) {
            n = 0;
        }
        return arrayList.get(n);
    }

    public ArrayList<biw_2> c() {
        ArrayList<biw_2> arrayList = this.i();
        biw_2 biw_22 = (biw_2)fis_1.a().e("selectedAchievement");
        if (biw_22 == null) {
            return null;
        }
        int n = arrayList.indexOf(biw_22);
        if (n == -1) {
            return null;
        }
        ArrayList<biw_2> arrayList2 = new ArrayList<biw_2>();
        int n2 = Math.min(3, arrayList.size());
        if (n2 < 1) {
            return null;
        }
        for (int k = n - n2; k <= n + n2; ++k) {
            int n3 = k < 0 ? arrayList.size() + k : (k >= arrayList.size() ? k % arrayList.size() : k);
            arrayList2.add(arrayList.get(n3));
        }
        return arrayList2;
    }

    protected abstract String e();

    public abstract boolean f();

    public abstract int g();

    public abstract void a(biu_2 var1);

    public abstract TIntObjectHashMap<biu_2> h();

    protected abstract ArrayList<biw_2> i();

    public void a(int n) {
        this.h = n;
        fis_1.a().a((ajf_1)this, d, f);
    }

    public void j() {
        fis_1.a().a((ajf_1)this, d, f);
    }
}

