/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 */
import gnu.trove.iterator.TLongObjectIterator;
import java.util.ArrayList;
import java.util.stream.Collectors;

/*
 * Renamed from bvO
 */
public class bvo_1
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "id";
    public static final String d = "description";
    public static final String e = "contentList";
    public static final String f = "containsLearnableItems";
    public static final String g = "listFilter";
    public static final String h = "usable";
    public static final String i = "isAffordableFiltered";
    public static final String j = "isLearnableFiltered";
    public static final String k = "listType";
    public static final String l = "typeSelected";
    private static final String[] m = new String[]{"name", "id", "description", "contentList", "containsLearnableItems", "usable", "isAffordableFiltered", "isLearnableFiltered", "listType", "typeSelected"};
    private final long n;
    private final String o;
    private final String p;
    private final boolean q;
    private final ArrayList<bvk_1> r = new ArrayList();
    final ArrayList<bvk_1> s = new ArrayList();
    private final ArrayList<bvt_1> t = new ArrayList();
    private bvt_1 u = bvt_1.a;
    private final ewy_2 v = new bvs_1(this);
    private final Uo w = new bvr_1(this);
    private final int x;
    private final fwl y;
    private boolean z = false;
    private boolean A = false;
    private final eox B;

    public bvo_1(long l, String string, String string2, boolean bl, evd_1 evd_12) {
        this.n = l;
        this.o = string;
        this.p = string2;
        this.q = bl;
        this.x = evd_12.m();
        this.y = new fwl();
        evd_12.a(new bvp_1(this));
        this.B = evd_12.a();
        this.r.addAll(this.s);
        this.h();
        this.t.add(bvt_1.a);
        for (bvk_1 bvk_12 : this.r) {
            bvt_1 bvt_12 = bvt_1.a(bvk_12.k());
            if (this.t.contains(bvt_12)) continue;
            this.t.add(bvt_12);
        }
    }

    private void h() {
        switch (this.B) {
            case b: {
                this.r.sort(bvh_1.a);
                break;
            }
            default: {
                this.r.sort(bvh_1.b);
            }
        }
    }

    public void a() {
        if (!this.z && !this.A && this.u.a() == null) {
            this.r.clear();
            this.r.addAll(this.s);
        } else {
            this.r.removeIf(bvk_12 -> {
                if (this.z && !bvk_12.b()) {
                    return true;
                }
                if (this.A && !bvk_12.e()) {
                    return true;
                }
                return this.u.a() != null && bvk_12.k() != this.u.a();
            });
            this.r.addAll(this.s.stream().filter(bvk_12 -> {
                if (this.r.contains(bvk_12)) {
                    return false;
                }
                if (this.z && !bvk_12.b()) {
                    return false;
                }
                if (this.A && !bvk_12.e()) {
                    return false;
                }
                return this.u.a() == null || bvk_12.k() == this.u.a();
            }).collect(Collectors.toList()));
        }
        this.h();
        fis_1.a().a((ajf_1)this, e);
    }

    public void b() {
        this.z = !this.z;
        this.a();
        fis_1.a().a((ajf_1)this, i);
    }

    public void c() {
        this.A = !this.A;
        this.a();
        fis_1.a().a((ajf_1)this, j);
    }

    public void a(bvt_1 bvt_12) {
        this.u = bvt_12;
        this.a();
        fis_1.a().a((ajf_1)this, l);
    }

    public void a(bmr_1 bmr_12) {
        ewx_2 ewx_22 = (ewx_2)bmr_12.a(ewl_1.a);
        ewx_22.a(this.v);
        TLongObjectIterator<exg_2> tLongObjectIterator = bmr_12.da().i();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            exg_2 exg_22 = (exg_2)tLongObjectIterator.value();
            exg_22.b(this.w);
        }
        fis_1.a().a((ajf_1)this, h, e);
    }

    public void e() {
        bmr_1 bmr_12 = azu_0.j().k();
        ewx_2 ewx_22 = (ewx_2)bmr_12.a(ewl_1.a);
        ewx_22.b(this.v);
        TLongObjectIterator<exg_2> tLongObjectIterator = bmr_12.da().i();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            exg_2 exg_22 = (exg_2)tLongObjectIterator.value();
            exg_22.a(this.w);
        }
    }

    @Override
    public String[] d() {
        return m;
    }

    @Override
    public Object b(String string) {
        if (string.equals(e)) {
            return this.r;
        }
        if (string.equals(f)) {
            return this.r.stream().anyMatch(bvk_1::f);
        }
        if (g.equals(string)) {
            return this.y;
        }
        if (string.equals(a)) {
            return this.o;
        }
        if (b.equals(string)) {
            return String.format("(%s)", this.n);
        }
        if (d.equals(string)) {
            return this.p;
        }
        if (string.equals(h)) {
            return this.q;
        }
        if (i.equals(string)) {
            return this.z;
        }
        if (j.equals(string)) {
            return this.A;
        }
        if (k.equals(string)) {
            return this.t;
        }
        if (l.equals(string)) {
            return this.u;
        }
        return null;
    }

    public long f() {
        return this.n;
    }

    public int g() {
        return this.x;
    }
}

