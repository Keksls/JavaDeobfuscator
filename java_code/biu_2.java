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
import java.util.stream.Collectors;

/*
 * Renamed from biu
 */
public class biu_2
extends bin_2
implements bio_2,
fwo {
    public static final String l = "iconUrl";
    public static final String m = "backgroundImageStyle";
    public static final String n = "progressionText";
    public static final String o = "progressionValue";
    public static final String p = "isFollowed";
    public static final String q = "isCompleted";
    public static final String r = "isVisible";
    public static final String[] s = new String[]{"name", "achievements", "iconUrl", "progressionText", "progressionValue", "isHistory", "achievementsQuickList"};
    public static final String t = "achievementsManager";
    private final bhq_1 u;
    private final TIntObjectHashMap<biu_2> v = new TIntObjectHashMap();
    private final ArrayList<biw_2> w = new ArrayList();
    private final int x;

    public biu_2(long l, bhq_1 bhq_12, int n) {
        super(l);
        this.u = bhq_12;
        this.h = bhq_12.a();
        this.x = n;
    }

    public void b(biw_2 biw_22) {
        if (!this.w.contains(biw_22)) {
            this.w.add(biw_22);
        }
    }

    public ArrayList<biw_2> k() {
        return this.w;
    }

    @Override
    public String[] d() {
        return s;
    }

    @Override
    public Object b(String string) {
        if (string.equals(l)) {
            return azs_0.a().s(this.u.a());
        }
        if (string.equals(m)) {
            return String.format("%s%s", "achievementCategory", this.u.a());
        }
        if (string.equals(n)) {
            return this.b() + "/" + this.a();
        }
        if (string.equals(o)) {
            return Float.valueOf((float)this.b() / (float)this.a());
        }
        if (string.equals(p)) {
            return this.p();
        }
        if (string.equals(q)) {
            for (int k = this.w.size() - 1; k >= 0; --k) {
                if (this.j.e(this.w.get(k).i())) continue;
                return false;
            }
            return true;
        }
        if (string.equals("categories")) {
            return this.m();
        }
        return super.b(string);
    }

    private boolean p() {
        for (int k = this.w.size() - 1; k >= 0; --k) {
            if (!this.w.get(k).c()) continue;
            return true;
        }
        return false;
    }

    protected bin_2 l() {
        return (bin_2)this.v.get(this.h);
    }

    @Override
    protected String e() {
        return this.u == null ? bae.h().a("achievement.rootName", new Object[0]) : bae.h().a(61, (long)this.u.a(), new Object[0]);
    }

    protected ArrayList<biu_2> m() {
        ArrayList<biu_2> arrayList = new ArrayList<biu_2>();
        TIntObjectIterator tIntObjectIterator = this.v.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            biu_2 biu_22 = (biu_2)tIntObjectIterator.value();
            if (biu_22.i().isEmpty()) continue;
            arrayList.add(biu_22);
        }
        arrayList.sort(new biv_2(this));
        return arrayList;
    }

    @Override
    public boolean f() {
        return false;
    }

    protected boolean n() {
        return this.v != null && this.v.size() > 0;
    }

    @Override
    public void a(biu_2 biu_22) {
        this.v.put(biu_22.g(), (Object)biu_22);
    }

    @Override
    public TIntObjectHashMap<biu_2> h() {
        return this.v;
    }

    @Override
    protected ArrayList<biw_2> i() {
        fwl fwl2 = biu_2.q();
        ArrayList<biw_2> arrayList = new ArrayList<biw_2>();
        for (biw_2 biw_22 : this.w) {
            int n = biw_22.i();
            biu_2 biu_22 = (biu_2)this.v.get(this.h);
            if (biu_22 != null && !biu_22.equals(this) && !biu_22.a(biw_22)) continue;
            boolean bl = this.j.d(n);
            boolean bl2 = this.j.e(n);
            cvo_0 cvo_02 = cVh.e().i();
            if (!cvo_02.a(bl, bl2) || !biw_22.t()) continue;
            if (fwl2 != null) {
                if (!fwl2.a(biw_22::f)) continue;
            }
            arrayList.add(biw_22);
        }
        return arrayList;
    }

    private static fwl q() {
        fit_1 fit_12 = fis_1.a().f(t);
        if (fit_12 == null || !(fit_12.f() instanceof bia_1)) {
            return null;
        }
        return ((bia_1)fit_12.f()).g().k;
    }

    public int o() {
        return this.x;
    }

    @Override
    public int a() {
        int n = 0;
        for (int k = this.w.size() - 1; k >= 0; --k) {
            biw_2 biw_22 = this.w.get(k);
            if (!biw_22.n()) continue;
            ++n;
        }
        return n;
    }

    @Override
    public int b() {
        int n = 0;
        for (biw_2 biw_22 : this.w) {
            if (!this.j.e(biw_22.i())) continue;
            ++n;
        }
        return n;
    }

    @Override
    public boolean a(biw_2 biw_22) {
        return this.w.contains(biw_22);
    }

    @Override
    public int g() {
        return this.u.a();
    }

    public biw_2 b(int n) {
        fis_1.a().a((ajf_1)this, p);
        int n2 = this.w.size();
        for (int k = 0; k < n2; ++k) {
            biw_2 biw_22 = this.w.get(k);
            if (biw_22.i() != n) continue;
            biw_22.w();
            return biw_22;
        }
        return null;
    }

    @Override
    public String getFilterableStringValue() {
        return this.i().stream().map(biw_2::f).collect(Collectors.joining(""));
    }
}

