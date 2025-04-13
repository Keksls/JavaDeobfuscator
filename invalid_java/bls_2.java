/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TByteLongIterator
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.map.hash.TByteLongHashMap
 *  gnu.trove.map.hash.TIntByteHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TByteLongIterator;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.hash.TByteLongHashMap;
import gnu.trove.map.hash.TIntByteHashMap;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bls
 */
public class bls_2 {
    private static final Logger b = Logger.getLogger(bls_2.class);
    private final TByteLongHashMap c = new TByteLongHashMap();
    private final TIntByteHashMap d = new TIntByteHashMap();
    private aff_1 e;
    private byte f;
    private blt_2 g;
    private wu_0 h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private blf_2 o;
    private blf_2[] p;
    private blf_2[] q;
    private blf_2 r;
    private short s = (short)-1;
    private String t;
    private int u;
    private int v;
    private int w;
    private int x;
    private bll_2 y;

    public bls_2 a() {
        bls_2 bls_22 = new bls_2();
        TByteLongIterator tByteLongIterator = this.c.iterator();
        while (tByteLongIterator.hasNext()) {
            tByteLongIterator.advance();
            bls_22.c.put(tByteLongIterator.key(), tByteLongIterator.value());
        }
        tByteLongIterator = this.d.iterator();
        while (tByteLongIterator.hasNext()) {
            tByteLongIterator.advance();
            bls_22.d.put(tByteLongIterator.key(), tByteLongIterator.value());
        }
        bls_22.e = this.e;
        bls_22.f = this.f;
        bls_22.g = this.g;
        bls_22.h = this.h;
        bls_22.i = this.i;
        bls_22.j = this.j;
        bls_22.k = this.k;
        bls_22.l = this.l;
        bls_22.m = this.m;
        bls_22.n = this.n;
        bls_22.o = this.o;
        if (this.p != null) {
            bls_22.p = new blf_2[this.p.length];
            for (blf_2 bls_22.p[var2_3] : this.p) {
            }
        }
        if (this.q != null) {
            bls_22.q = new blf_2[this.q.length];
            for (blf_2 bls_22.q[var2_4] : this.q) {
            }
        }
        bls_22.r = this.r;
        bls_22.s = this.s;
        bls_22.t = this.t;
        bls_22.u = this.u;
        bls_22.v = this.v;
        bls_22.w = this.w;
        bls_22.x = this.x;
        return bls_22;
    }

    public blt_2 b() {
        return this.g;
    }

    public int c() {
        return this.g.g();
    }

    public blr_2 d() {
        return this.g.h();
    }

    blh_2 e() {
        return this.g.i();
    }

    public byte f() {
        return this.f;
    }

    public void a(byte by) {
        this.f = by;
    }

    boolean g() {
        return this.i;
    }

    void a(boolean bl) {
        this.i = bl;
    }

    boolean h() {
        return this.k;
    }

    public void b(boolean bl) {
        this.k = bl;
    }

    public boolean i() {
        return this.j;
    }

    public void c(boolean bl) {
        if (this.j == bl) {
            return;
        }
        this.j = bl;
    }

    blf_2 j() {
        return this.o;
    }

    void a(blf_2 blf_22) {
        this.o = blf_22;
    }

    static bls_2 a(blt_2 blt_22) {
        bls_2 bls_22 = new bls_2();
        bls_22.g = blt_22;
        ArrayList<blg_2> arrayList = bls_22.g.k();
        bls_22.p = new blf_2[arrayList.size()];
        for (int k = 0; k < arrayList.size(); ++k) {
            bls_22.p[k] = new blf_2(arrayList.get(k));
        }
        ArrayList<blg_2> arrayList2 = bls_22.g.l();
        if (arrayList2 != null) {
            bls_22.q = new blf_2[arrayList2.size()];
            for (int k = 0; k < arrayList2.size(); ++k) {
                bls_22.q[k] = new blf_2(arrayList2.get(k));
            }
        } else {
            bls_22.q = null;
        }
        bls_22.y = blj_2.a.a(blt_22.g());
        return bls_22;
    }

    byte a(bla_2 bla_22) {
        assert (bla_22 != null) : "On essaye de r\u00e9cup\u00e9rer le status d'un goal null";
        return this.d.get(bla_22.d());
    }

    public blf_2[] k() {
        return this.p;
    }

    public blf_2[] l() {
        return this.q;
    }

    void a(TIntArrayList tIntArrayList) {
        for (int k = 0; k < tIntArrayList.size(); ++k) {
            int n = tIntArrayList.get(k);
            if (this.d.get(n) == 1) continue;
            this.d.put(n, (byte)1);
        }
        if (this.y != null) {
            this.y.q();
        }
    }

    boolean a(byte by, long l) {
        boolean bl = this.c.containsKey(by) && this.c.get(by) != l;
        this.c.put(by, l);
        if (this.y != null) {
            this.y.q();
        }
        return bl;
    }

    long a(String string) {
        return this.c.get(this.g.a(string));
    }

    public String m() {
        return this.g.c();
    }

    void a(int n) {
        if (this.d.get(n) != 1) {
            b.error((Object)("On essaie de terminer une action pas encore commenc\u00e9e, dans le scenario " + this.c() + " action d'id " + n));
        }
        this.d.put(n, (byte)2);
        if (this.y != null) {
            this.y.q();
        }
    }

    void b(TIntArrayList tIntArrayList) {
        if (!(this.o == null || tIntArrayList != null && tIntArrayList.contains(this.o.h()))) {
            this.o = null;
        }
        for (blf_2 blf_22 : this.p) {
            if (tIntArrayList != null && tIntArrayList.contains(blf_22.h())) {
                blf_22.a(true);
                if (this.o != null) continue;
                this.o = blf_22;
                continue;
            }
            blf_22.a(false);
        }
    }

    boolean n() {
        wu_0 wu_02 = this.g.n();
        wu_0 wu_03 = wc_0.p().a();
        if (wu_02 != null && wu_02.b(wu_03)) {
            return true;
        }
        if (this.h == null) {
            return false;
        }
        short s2 = this.g.j();
        if (s2 > 0) {
            wt_0 wt_02 = new wt_0(this.h);
            wt_02.a(ww_0.a(s2));
            if (wt_02.b(wu_03)) {
                return true;
            }
        }
        return false;
    }

    public short o() {
        if (this.m || this.j) {
            return 0;
        }
        if (this.g.j() == 0) {
            return -1;
        }
        if (this.h == null) {
            return this.g.j();
        }
        wt_0 wt_02 = new wt_0(this.h);
        wt_02.a(ww_0.a(this.g.j()));
        ww_0 ww_02 = wc_0.p().a().g(wt_02);
        return ww_02.e() ? Hw.c(ww_02.g()) : (short)0;
    }

    public void d(boolean bl) {
        this.l = bl;
    }

    public void a(wu_0 wu_02) {
        this.h = wu_02;
    }

    public boolean p() {
        return this.g.a();
    }

    public boolean q() {
        return this.n;
    }

    public void e(boolean bl) {
        this.n = bl;
    }

    boolean r() {
        return this.g.j() > 0;
    }

    public boolean s() {
        return this.l;
    }

    boolean t() {
        for (blf_2 blf_22 : this.p) {
            if (!blf_22.i()) continue;
            return false;
        }
        return true;
    }

    public void a(aff_1 aff_12) {
        if (this.e != null && aff_12 == null) {
            ble_1.E().G();
        } else if (aff_12 != null) {
            ble_1.E().a(aff_12.d(), aff_12.e(), aff_12.f(), azu_0.j().k().T_(), this, true);
        }
        this.e = aff_12;
    }

    public void f(boolean bl) {
        this.m = bl;
    }

    public boolean u() {
        return this.m;
    }

    public short v() {
        return this.g.j();
    }

    public wu_0 w() {
        return this.h;
    }

    public int x() {
        return this.x;
    }

    public void b(int n) {
        this.x = n;
    }

    public short y() {
        return this.s;
    }

    public void a(short s2) {
        this.s = s2;
        if (this.y != null) {
            this.y.r();
        }
    }

    public String toString() {
        return this.g.c();
    }

    @Nullable
    public blf_2 c(int n) {
        if (this.p.length > n) {
            return this.p[n];
        }
        return null;
    }

    public void d(int n) {
        blf_2 blf_22 = this.r = n >= 0 && n < this.p.length ? this.p[n] : null;
        if (this.y != null) {
            this.y.c();
        }
    }

    blf_2 z() {
        return this.r;
    }

    String A() {
        return this.t;
    }

    public void b(String string) {
        this.t = string;
        if (this.y != null) {
            this.y.n();
        }
    }

    int B() {
        return this.u;
    }

    public void e(int n) {
        this.u = n;
        if (this.y != null) {
            this.y.t();
        }
    }

    int C() {
        return this.v;
    }

    public void f(int n) {
        this.v = n;
    }

    int D() {
        return this.w;
    }

    public void g(int n) {
        this.w = n;
    }

    void b(wu_0 wu_02) {
        if (!wu_02.c()) {
            this.h = wu_02;
            this.l = true;
            adi_2.a().a(cWF.a(), 1000L, this.c());
        }
    }
}

