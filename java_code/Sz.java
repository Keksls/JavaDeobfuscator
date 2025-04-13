/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.BitSet;
import org.apache.log4j.Logger;

public abstract class Sz
implements Sl {
    protected static final Logger a = Logger.getLogger(Sl.class);
    private final int d;
    private final int e;
    private final aqd_1 f;
    private final apt_2<Su> g;
    private final long h;
    private short i;
    private final boolean j;
    protected final boolean b = true;
    private BitSet k;
    private BitSet l;
    private BitSet m;
    private BitSet n;
    private BitSet o;
    private BitSet p;
    private BitSet q;
    protected SB c = SB.c;
    private boolean r = false;
    private boolean s = false;
    private int t;
    private boolean u = false;
    private final boolean v;
    private boolean w = false;

    public Sz(int n, int n2, aqd_1 aqd_12, int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4, int[] nArray5, int[] nArray6, int[] nArray7, long l, apt_2<Su> apt_22, boolean bl, boolean bl2, short s2, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        this.d = n;
        this.e = n2;
        this.f = aqd_12;
        this.h = l;
        this.g = apt_22;
        if (nArray.length > 0) {
            this.k = new BitSet();
            this.a(nArray, this.k);
        }
        if (nArray2.length > 0) {
            this.l = new BitSet();
            this.a(nArray2, this.l);
        }
        if (nArray3.length > 0) {
            this.p = new BitSet();
            this.a(nArray3, this.p);
        }
        if (nArray4.length > 0) {
            this.m = new BitSet();
            this.a(nArray4, this.m);
        }
        if (nArray5.length > 0) {
            this.n = new BitSet();
            this.a(nArray5, this.n);
        }
        if (nArray6.length > 0) {
            this.o = new BitSet();
            this.a(nArray6, this.o);
        }
        if (nArray7.length > 0) {
            this.q = new BitSet();
            this.a(nArray7, this.q);
        }
        this.v = bl;
        if (bl2) {
            this.c = SB.b;
        }
        this.s = bl3;
        this.u = bl5;
        this.r = bl4;
        this.i = s2;
        this.j = bl6;
    }

    private void a(int[] nArray, BitSet bitSet) {
        if (nArray == null || bitSet == null) {
            return;
        }
        for (int k = 0; k < nArray.length; ++k) {
            int n = nArray[k];
            if (n < 0) continue;
            bitSet.set(n);
        }
    }

    public void f_(int n) {
        this.t = n;
    }

    @Override
    public int r() {
        return this.t;
    }

    @Override
    public boolean a() {
        return this.c == SB.b;
    }

    @Override
    public boolean b() {
        return this.c == SB.d;
    }

    @Override
    public boolean c() {
        return this.r;
    }

    @Override
    public boolean d() {
        return this.s;
    }

    @Override
    public sc_0 A() {
        return null;
    }

    @Override
    public SA B() {
        return null;
    }

    @Override
    public boolean e() {
        return this.u;
    }

    @Override
    public boolean f() {
        return this.j;
    }

    @Override
    public boolean g() {
        return false;
    }

    protected Sz(int n, int n2, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, BitSet bitSet3, BitSet bitSet4, BitSet bitSet5, BitSet bitSet6, BitSet bitSet7, long l, apt_2<Su> apt_22, boolean bl, boolean bl2, short s2, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        int n3;
        this.d = n;
        this.e = n2;
        this.f = aqd_12;
        this.h = l;
        this.g = apt_22;
        if (bitSet != null) {
            for (n3 = 0; n3 < bitSet.size(); ++n3) {
                if (n3 <= 0 || !bitSet.get(n3)) continue;
                this.k = new BitSet();
                this.k.set(n3);
            }
        }
        if (bitSet2 != null) {
            for (n3 = 0; n3 < bitSet2.size(); ++n3) {
                if (n3 <= 0 || !bitSet2.get(n3)) continue;
                this.l = new BitSet();
                this.l.set(n3);
            }
        }
        if (bitSet3 != null) {
            for (n3 = 0; n3 < bitSet3.size(); ++n3) {
                if (n3 <= 0 || !bitSet3.get(n3)) continue;
                this.p = new BitSet();
                this.p.set(n3);
            }
        }
        if (bitSet4 != null) {
            for (n3 = 0; n3 < bitSet4.size(); ++n3) {
                if (n3 <= 0 || !bitSet4.get(n3)) continue;
                this.m = new BitSet();
                this.m.set(n3);
            }
        }
        if (bitSet5 != null) {
            for (n3 = 0; n3 < bitSet5.size(); ++n3) {
                if (n3 <= 0 || !bitSet5.get(n3)) continue;
                this.n = new BitSet();
                this.n.set(n3);
            }
        }
        if (bitSet6 != null) {
            for (n3 = 0; n3 < bitSet6.size(); ++n3) {
                if (n3 <= 0 || !bitSet6.get(n3)) continue;
                this.o = new BitSet();
                this.o.set(n3);
            }
        }
        if (bitSet7 != null) {
            for (n3 = 0; n3 < bitSet7.size(); ++n3) {
                if (n3 <= 0 || !bitSet7.get(n3)) continue;
                this.q = new BitSet();
                this.q.set(n3);
            }
        }
        this.v = bl;
        if (bl2) {
            this.c = SB.b;
        }
        this.s = bl3;
        this.r = bl4;
        this.u = bl5;
        this.i = s2;
        this.j = bl6;
    }

    @Override
    public int i() {
        return this.d;
    }

    @Override
    public int j() {
        return this.e;
    }

    @Override
    public boolean a(long l) {
        return (this.h & l) == l;
    }

    @Override
    public apt_2<Su> k() {
        return this.g;
    }

    @Override
    public BitSet l() {
        return this.k;
    }

    @Override
    public BitSet m() {
        return this.l;
    }

    @Override
    public BitSet n() {
        return this.p;
    }

    @Override
    public BitSet o() {
        return this.m;
    }

    @Override
    public BitSet p() {
        return this.n;
    }

    @Override
    public BitSet q() {
        return this.o;
    }

    @Override
    public boolean s() {
        if (this.l != null && !this.l.isEmpty()) {
            return true;
        }
        if (this.k != null && !this.k.isEmpty()) {
            return true;
        }
        if (this.m != null && !this.m.isEmpty()) {
            return true;
        }
        if (this.n != null && !this.n.isEmpty()) {
            return true;
        }
        return this.o != null && !this.o.isEmpty();
    }

    @Override
    public BitSet t() {
        return this.q;
    }

    @Override
    public Ss a(Sm sm, Su su, So so, xb_0<? extends si_0> xb_02, int n, int n2, short s2, Su su2, Sr sr, boolean bl) {
        si_0 si_02 = xb_02.b(this.j());
        Ss ss = si_02.a(this, sm, so, su, n, n2, s2, su2, sr);
        if (!bl) {
            ss.f();
            return null;
        }
        return ss;
    }

    @Override
    public aqd_1 u() {
        return this.f;
    }

    @Override
    public boolean v() {
        return this.v;
    }

    @Override
    public long w() {
        return this.h;
    }

    @Override
    public short x() {
        return this.i;
    }

    public boolean bl_() {
        return true;
    }

    @Override
    public void b_(short s2) {
        this.i = s2;
    }

    protected void d_(boolean bl) {
        this.w = bl;
    }

    @Override
    public boolean y() {
        return this.w;
    }

    @Override
    public boolean z() {
        return !this.w;
    }

    public String toString() {
        return "StandardEffect{m_effectId=" + this.d + ", m_actionId=" + this.e + "}";
    }
}

