/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBasedTable
 *  gnu.trove.list.array.TIntArrayList
 */
import com.google.common.collect.HashBasedTable;
import gnu.trove.list.array.TIntArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from fhe
 */
public class fhe_0 {
    public static final short a = 51;
    public static final long b = TimeUnit.MINUTES.toMillis(60L);
    public static final long c = TimeUnit.MINUTES.toMillis(15L);
    private int d;
    private final fho e;
    private final int f;
    private final fhi g;
    private final wt_0 h;
    private wt_0 i;
    private final TIntArrayList j = new TIntArrayList();
    private final TIntArrayList k = new TIntArrayList();
    private final HashBasedTable<Long, Long, fhf> l = HashBasedTable.create();
    private int m;
    private int n;
    private short o;
    private short p;
    private short q;
    private int r;
    private int s;
    private final Set<fhj> t = new HashSet<fhj>();
    private final long u;
    private final long v;

    public fhe_0(int n, fho fho2, fhi fhi2, int n2, wt_0 wt_02) {
        this.d = n;
        this.e = fho2;
        this.g = fhi2;
        this.f = n2;
        this.h = wt_02;
        this.u = abd_1.c();
        this.v = abd_1.c();
    }

    public int a() {
        return this.d;
    }

    public long b() {
        return this.u;
    }

    public long c() {
        return this.v;
    }

    public void a(int n) {
        this.d = n;
    }

    public fho d() {
        return this.e;
    }

    public fhi e() {
        return this.g;
    }

    public int f() {
        return this.f;
    }

    public wt_0 g() {
        return this.h;
    }

    public wt_0 h() {
        return this.i;
    }

    public void a(wt_0 wt_02) {
        this.i = wt_02;
    }

    public TIntArrayList i() {
        return this.j;
    }

    public TIntArrayList j() {
        return this.k;
    }

    public HashBasedTable<Long, Long, fhf> k() {
        return this.l;
    }

    public int l() {
        return this.m;
    }

    public void b(int n) {
        this.m = n;
        for (fhj fhj2 : this.t) {
            fhj2.a(this, false, this.m);
        }
    }

    public void c(int n) {
        this.m += n;
        for (fhj fhj2 : this.t) {
            fhj2.a(this, false, this.m);
        }
    }

    public int m() {
        return this.n;
    }

    public void d(int n) {
        this.n = n;
        for (fhj fhj2 : this.t) {
            fhj2.a(this, true, this.n);
        }
    }

    public void e(int n) {
        this.n += n;
        for (fhj fhj2 : this.t) {
            fhj2.a(this, true, this.n);
        }
    }

    public short n() {
        return this.o;
    }

    public void a(short s2) {
        this.o = s2;
    }

    public short o() {
        return this.p;
    }

    public void b(short s2) {
        this.p = s2;
    }

    public short p() {
        return this.q;
    }

    public int q() {
        return this.r;
    }

    public void c(short s2) {
        this.q = s2;
    }

    public void f(int n) {
        this.r = n;
    }

    public int r() {
        return this.s;
    }

    public void g(int n) {
        this.s = n;
    }

    public void a(fhj fhj2) {
        this.t.add(fhj2);
    }

    public boolean a(int n, int n2) {
        boolean bl = this.j.contains(n) && this.k.contains(n2);
        return bl |= this.k.contains(n) && this.j.contains(n2);
    }

    public String toString() {
        return "BattlegroundDefinition{m_id=" + this.d + ", m_type=" + this.e + ", m_dataId=" + this.f + ", m_level=" + this.g + ", m_startTime=" + this.h + ", m_ownerId=" + this.s + ", m_winnerId=" + this.r + "}";
    }
}

