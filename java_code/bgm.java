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

public class bgm
implements ajh_1,
eEK,
Runnable {
    public static final String a = "name";
    public static final String b = "currentScore";
    public static final String d = "chrono";
    public static final String e = "roundNumber";
    public static final String f = "challenges";
    public static final String g = "rewards";
    public static final String h = "description";
    public static final String[] i = new String[]{"name", "currentScore", "chrono", "roundNumber", "challenges", "rewards", "description"};
    private short j;
    private int k;
    final TIntObjectHashMap<bgq> l = new TIntObjectHashMap();
    private final bgx m;
    private long n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private short u;

    public bgm(bgx bgx2) {
        this.m = bgx2;
        bgx2.a(new bgn(this));
        this.j = 0;
        this.k = 0;
    }

    public void a() {
        this.n = System.currentTimeMillis();
        ado_1.a().a(this, 1000L);
    }

    public void b() {
        ado_1.a().b(this);
    }

    @Override
    public String[] d() {
        return i;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.m.a();
        }
        if (string.equals(b)) {
            return bae.h().a("arcadeDungeon.points", this.k);
        }
        if (string.equals(d)) {
            long l = this.w();
            if (l > 0L) {
                return bgm.a(l);
            }
            return "-";
        }
        if (string.equals(e)) {
            return this.j;
        }
        if (string.equals(f)) {
            Object[] objectArray = this.l.values();
            return objectArray.length == 0 ? null : objectArray;
        }
        if (string.equals(g)) {
            return this.v();
        }
        if (string.equals(h)) {
            return this.m.b();
        }
        return null;
    }

    private ArrayList<bgs> v() {
        bmr_1 bmr_12 = azu_0.j().k();
        int n = cVA.h().n();
        ArrayList<bgs> arrayList = new ArrayList<bgs>();
        this.m.a(new bgo(this, arrayList), n == -1 ? (int)bmr_12.dr() : n);
        return arrayList.size() > 0 ? arrayList : null;
    }

    public int c() {
        bmr_1 bmr_12 = azu_0.j().k();
        int n = cVA.h().n();
        ArrayList arrayList = new ArrayList();
        this.m.a(new bgp(this, arrayList), n == -1 ? (int)bmr_12.dr() : n, this);
        return arrayList.size();
    }

    public static String a(long l) {
        long l2 = l / 60L;
        long l3 = l - 60L * l2;
        return String.format("%d:%s", l2, l3 > 9L ? Long.valueOf(l3) : "0" + l3);
    }

    private long w() {
        return (System.currentTimeMillis() - this.n) / 1000L;
    }

    public void e() {
        this.j = (short)(this.j + 1);
        this.u = 0;
        fis_1.a().a((ajf_1)this, e);
        this.x();
    }

    public int f() {
        return this.j;
    }

    @Override
    public void run() {
        fis_1.a().a((ajf_1)this, d);
    }

    public bgq a(int n) {
        return (bgq)this.l.get(n);
    }

    public void b(int n) {
        ++this.q;
        this.r += n;
    }

    public void c(int n) {
        ++this.s;
        this.t += n;
    }

    public void d(int n) {
        ++this.p;
        this.o += n;
    }

    public void e(int n) {
        this.k = n;
        fis_1.a().a((ajf_1)this, b);
    }

    private void x() {
        TIntObjectIterator tIntObjectIterator = this.l.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            fis_1.a().a((ajf_1)tIntObjectIterator.value(), "score");
        }
    }

    public int g() {
        return this.r + this.t + this.o;
    }

    public int h() {
        return this.o;
    }

    public int i() {
        return this.p;
    }

    public int j() {
        return this.q;
    }

    public int k() {
        return this.r;
    }

    public int l() {
        return this.s;
    }

    public int m() {
        return this.t;
    }

    public int n() {
        return this.m.a(Hw.a(this.j - 1, 0, Short.MAX_VALUE));
    }

    @Override
    public int o() {
        return this.k;
    }

    @Override
    public int p() {
        return this.k();
    }

    @Override
    public int q() {
        return this.h();
    }

    public int r() {
        return this.k;
    }

    public void s() {
        this.u = (short)(this.u + 1);
    }

    public short t() {
        return this.u;
    }

    public eEH u() {
        bmr_1 bmr_12 = azu_0.j().k();
        return this.m.a((int)bmr_12.dr(), this);
    }
}

