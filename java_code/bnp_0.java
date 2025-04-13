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
 * Renamed from bNp
 */
public class bnp_0
implements ajh_1 {
    public static final int a = 10;
    public static final bnp_0 b = new bnp_0();
    public static final String d = "entries";
    public static final String e = "pageDescription";
    public static final String f = "canGoBack";
    public static final String g = "canGoForward";
    public static final String h = "currentNation";
    public static final String i = "nations";
    public static final String j = "currentBreed";
    public static final String k = "breeds";
    public static final String l = "currentFilter";
    public static final String m = "filters";
    private final ArrayList<bno_0> n = new ArrayList();
    private int o;
    private int p;
    private final ArrayList<bVn> q = new ArrayList();
    private final ArrayList<bnq_0> r = new ArrayList();
    private final ArrayList<bnr_0> s = new ArrayList();
    private bVn t;
    private bnq_0 u;
    private bnr_0 v;
    private fhx w;

    private bnp_0() {
        this.q.add(new bVn(30));
        this.q.add(new bVn(31));
        this.q.add(new bVn(32));
        this.q.add(new bVn(33));
        this.r.add(new bnq_0(epn_2.b));
        for (epn_2 epn_22 : epn_2.values()) {
            if (!epo_2.a(epn_22)) continue;
            this.r.add(new bnq_0(epn_22));
        }
        this.s.add(new bnr_0(true));
        this.s.add(new bnr_0(false));
    }

    @Override
    public String[] d() {
        return b_;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(d)) {
            return this.n;
        }
        if (string.equals(e)) {
            return this.h();
        }
        if (string.equals(f)) {
            return this.i();
        }
        if (string.equals(g)) {
            return this.j();
        }
        if (string.equals(k)) {
            return this.r;
        }
        if (string.equals(j)) {
            return this.u;
        }
        if (string.equals(i)) {
            return this.q;
        }
        if (string.equals(h)) {
            return this.t;
        }
        if (string.equals(m)) {
            return this.s;
        }
        if (string.equals(l)) {
            return this.v;
        }
        return null;
    }

    private String h() {
        int n = Math.max(0, this.o);
        return n + 1 + "/" + this.p;
    }

    public void a() {
        this.a(true);
    }

    public void a(boolean bl) {
        this.a(azu_0.j().k().bM(), bl);
    }

    private void a(int n, boolean bl) {
        int n2 = this.q.size();
        for (int k = 0; k < n2; ++k) {
            bVn bVn2 = this.q.get(k);
            if (bVn2.g() != n) continue;
            this.t = bVn2;
            break;
        }
        this.v = this.s.get(0);
        this.o = -1;
        this.p = 1;
        if (bl) {
            this.u = this.r.get(0);
            this.w = new fhr(this.o, 10);
        } else if (this.w == null || this.w.a() != fhu.b) {
            this.w = new fhr(this.o, 10);
        }
        this.n.clear();
        this.k();
        fis_1.a().a((ajf_1)this, d, f, g, e, l, j, h);
    }

    public void a(int n, int n2, List<fgZ> list) {
        this.o = Hw.a(n, 0, n2 - 1);
        this.p = n2;
        this.n.clear();
        int n3 = list.size();
        for (int k = 0; k < n3; ++k) {
            this.n.add(bno_0.a(list.get(k), false));
        }
        fzw_0.a.a("nationPvpLadderLock", true);
        fis_1.a().a((ajf_1)this, d, f, g, e);
    }

    private boolean i() {
        return this.o > 0;
    }

    private boolean j() {
        return this.o + 1 < this.p;
    }

    public void a(String string) {
        cAi cAi2 = new cAi(string);
        azu_0.j().K().c(cAi2);
    }

    public void a(bVn bVn2) {
        if (this.t == bVn2) {
            return;
        }
        this.a(bVn2.g(), false);
    }

    public void a(bnq_0 bnq_02) {
        if (this.u == bnq_02) {
            return;
        }
        this.u = bnq_02;
        this.o = 0;
        if (bnq_02 == this.r.get(0)) {
            this.b();
        } else {
            this.a(bnq_02.a().s());
        }
        fis_1.a().a((ajf_1)this, j);
    }

    public void a(bnr_0 bnr_02) {
        if (this.v == bnr_02) {
            return;
        }
        this.v = bnr_02;
        if (bnr_02.f) {
            this.b();
        } else {
            this.a(azu_0.j().k().fc());
        }
        fis_1.a().a((ajf_1)this, l);
    }

    public void b() {
        if (this.w.a() == fhu.a) {
            return;
        }
        this.o = -1;
        this.w = new fhr(this.o, 10);
        this.k();
    }

    public void a(long l) {
        fht_0 fht_02;
        if (this.w.a() == fhu.c && (fht_02 = (fht_0)this.w).b() == l) {
            return;
        }
        this.o = -1;
        this.w = new fht_0(this.o, 10, l);
        this.k();
    }

    public void a(short s2) {
        fhs fhs2;
        if (this.w.a() == fhu.b && (fhs2 = (fhs)this.w).b() == s2) {
            return;
        }
        this.o = -1;
        this.w = new fhs(this.o, 10, s2);
        this.k();
    }

    public void c() {
        this.o = 0;
        this.k();
    }

    public void e() {
        if (!this.i()) {
            return;
        }
        --this.o;
        this.k();
    }

    public void f() {
        if (!this.j()) {
            return;
        }
        ++this.o;
        this.k();
    }

    public void g() {
        this.o = this.p - 1;
        this.k();
    }

    private void k() {
        this.w.a(this.o);
        fzw_0.a.a("nationPvpLadderLock", false);
        azu_0.j().K().c(new cAj(this.t.g(), this.w));
    }
}

