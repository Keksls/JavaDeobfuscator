/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bze
 */
public class bze_2
implements ajh_1 {
    public static final String a = "filteredList";
    public static final String b = "hasPreviousPage";
    public static final String d = "hasNextPage";
    public static final String e = "currentPageText";
    public static final String f = "isOpenedFilter";
    public static final String g = "isGuildFilter";
    public static final String[] h = new String[]{"filteredList", "hasPreviousPage", "hasNextPage", "currentPageText", "isOpenedFilter", "isGuildFilter"};
    private int i;
    private int j = 1;
    private String k = "";
    private List<bzd_2> l;
    private boolean m = true;
    private boolean n = true;

    @Override
    public String[] d() {
        return h;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (a.equals(string)) {
            return this.l;
        }
        if (string.equals(b)) {
            return this.j > 1;
        }
        if (string.equals(d)) {
            return this.j < this.i;
        }
        if (string.equals(e)) {
            if (this.l.isEmpty()) {
                return bae.h().a("haven.world.no.result", new Object[0]);
            }
            return this.j + "/" + this.i;
        }
        return null;
    }

    public void a(List<bzd_2> list) {
        this.l = new ArrayList<bzd_2>(list);
        fis_1.a().a((ajf_1)this, b, d, a, e);
    }

    public void a(String string) {
        this.k = string;
        this.j = 1;
        this.m();
    }

    @Nullable
    public bzd_2 a() {
        return this.l == null || this.l.isEmpty() ? null : this.l.get(0);
    }

    public void b() {
        this.j = 1;
        this.m();
    }

    public void c() {
        if (this.j <= 1) {
            return;
        }
        --this.j;
        this.m();
    }

    public void e() {
        if (this.j > this.i) {
            return;
        }
        ++this.j;
        this.m();
    }

    public void f() {
        this.j = this.i;
        this.m();
    }

    public void a(int n) {
        this.i = n;
        fis_1.a().a((ajf_1)this, b, d, a, e);
    }

    public int g() {
        return this.j;
    }

    public String h() {
        return this.k;
    }

    public void i() {
        this.m = !this.m;
        fis_1.a().a((ajf_1)this, f);
    }

    public boolean j() {
        return this.m;
    }

    public void k() {
        this.n = !this.n;
        fis_1.a().a((ajf_1)this, g);
    }

    public boolean l() {
        return this.n;
    }

    private void m() {
        azu_0.j().K().c(new czo_2(this.k, this.j, this.m, this.n));
    }
}

