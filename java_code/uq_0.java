/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.map.hash.TLongByteHashMap
 *  gnu.trove.map.hash.TLongIntHashMap
 *  gnu.trove.map.hash.TLongShortHashMap
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.map.hash.TLongByteHashMap;
import gnu.trove.map.hash.TLongIntHashMap;
import gnu.trove.map.hash.TLongShortHashMap;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from UQ
 */
public class uq_0
implements abq_1 {
    private static final Logger m = Logger.getLogger(uq_0.class);
    private static final boolean n = false;
    private static final Logger o = Logger.getLogger((String)"debug");
    public static final int a = -1;
    public static final int b = 128;
    public static int c = 1024;
    public static final int d = 3;
    public static int e = c * 3;
    private static final float p = 1.4f;
    private static final float[] q = new float[]{0.0f, 0.0f, 0.5f, 2.5f, 3.5f};
    private static final float r = 0.9f;
    private static final float s = 10.0f;
    public static final apl_1 f = apl_1.a;
    private static final int[][] t = new int[][]{{1, 0, 1}, {-1, 0, 4}, {0, 1, 2}, {0, -1, 8}, {1, 1, 3}, {-1, 1, 6}, {-1, -1, 12}, {1, -1, 9}};
    private static final int[][] u = new int[][]{{0, 1, 2}, {0, -1, 8}, {1, 0, 1}, {-1, 0, 4}, {1, 1, 3}, {-1, 1, 6}, {-1, -1, 12}, {1, -1, 9}};
    private int v;
    private short w;
    protected byte g;
    protected final TLongArrayList h = new TLongArrayList();
    protected long i;
    private yy_0 x;
    private ut_0 y;
    private final up_0 z = new up_0();
    protected short j;
    protected long[] k = new long[128];
    private final us_0[] A;
    private short B;
    private final ys_0[] C;
    private short D;
    private final us_0[] E = new us_0[c];
    private short F = (short)-1;
    private short G = (short)-1;
    private final TLongIntHashMap H = new TLongIntHashMap();
    private final TLongByteHashMap I = new TLongByteHashMap();
    private final TLongShortHashMap J = new TLongShortHashMap();
    private static final ObjectPool K = new abm_1(new ur_0());

    protected uq_0() {
        int n;
        this.A = new us_0[c];
        for (n = 0; n < c; ++n) {
            this.A[n] = new us_0();
        }
        this.C = new ys_0[e];
        for (n = 0; n < e; ++n) {
            this.C[n] = new ys_0();
        }
    }

    public static uq_0 a(int n) {
        c = n;
        e = c * 3;
        return uq_0.a();
    }

    public static uq_0 a() {
        try {
            return (uq_0)K.borrowObject();
        }
        catch (Exception exception) {
            m.error((Object)"Exception during PathFinder checkout", (Throwable)exception);
            return null;
        }
    }

    @Override
    public void release() {
        try {
            K.returnObject((Object)this);
        }
        catch (Exception exception) {
            m.error((Object)"Exception during PathFinder release", (Throwable)exception);
        }
    }

    @Override
    public void onCheckOut() {
    }

    @Override
    public void onCheckIn() {
        this.v = 0;
        this.w = 0;
        this.g = 0;
        this.B = 0;
        this.D = 0;
        this.F = (short)-1;
        this.G = (short)-1;
        this.H.clear();
        this.I.clear();
        this.J.clear();
        this.h.reset();
        this.x = null;
        this.j = (short)-1;
        this.i = -1L;
        this.z.a(0, (byte)-1, -1, true);
        this.y = null;
    }

    public final void a(yy_0 yy_02) {
        this.x = yy_02;
    }

    public void a(ut_0 ut_02) {
        this.y = ut_02;
    }

    public void a(int n, byte by, short s2) {
        this.v = n;
        this.w = s2;
        this.g = by;
        this.z.a(n, by, s2, true);
    }

    public void b() {
        this.h.reset();
    }

    public void a(int n, int n2, short s2) {
        this.h.add(uq_0.c(n, n2, s2));
    }

    public void a(aff_1 aff_12) {
        this.h.add(uq_0.c(aff_12.d(), aff_12.e(), aff_12.f()));
    }

    public void b(int n, int n2, short s2) {
        this.i = uq_0.c(n, n2, s2);
    }

    public void b(aff_1 aff_12) {
        assert (aff_12 != null) : "can't define a null cell as the destination";
        this.i = uq_0.c(aff_12.d(), aff_12.e(), aff_12.f());
    }

    public short c() {
        return this.j;
    }

    public long[] d() {
        return this.k;
    }

    public final apl_1 e() {
        if (this.j == -1) {
            return f;
        }
        apl_1 apl_12 = new apl_1(this.j);
        for (int k = 0; k < this.j; ++k) {
            long l = this.k[this.j - 1 - k];
            int n = uq_0.a(l);
            int n2 = uq_0.b(l);
            short s2 = uq_0.c(l);
            apl_12.a(k, n, n2, s2);
        }
        return apl_12;
    }

    public final apl_1 f() {
        if (this.j == -1) {
            return f;
        }
        apl_1 apl_12 = new apl_1(this.j);
        for (int k = 0; k < this.j; ++k) {
            long l = this.k[k];
            int n = uq_0.a(l);
            int n2 = uq_0.b(l);
            short s2 = uq_0.c(l);
            apl_12.a(k, n, n2, s2);
        }
        return apl_12;
    }

    public int g() {
        int n;
        assert (this.x != null) : "no TopologyMapInstanceSet defined";
        assert (this.v > 0) : "invalid m_moverHeight";
        assert (this.w >= 0) : "invalid m_moverJumpCapacity";
        assert (this.g >= 0) : "invalid m_moverPhysicalRadius : " + this.g;
        assert (this.y != null) : "no PathFinderParameters defined";
        assert (this.i != -1L) : "stop cell not defined";
        assert (!this.h.isEmpty()) : "start cells not defined";
        assert (this.y.b > 0) : "search limit not defined in the path find parameters";
        assert (this.y.e || !this.y.f) : "stopping before the end and asking for the end cell to be removed assumes the last cell of the path will be known";
        this.J.clear();
        this.B = 0;
        this.H.clear();
        this.D = 0;
        this.F = (short)-1;
        this.G = (short)-1;
        us_0 us_02 = this.d(this.i);
        if (us_02 == null) {
            return -1;
        }
        if (!yu_0.a(us_02.b + us_02.c, (int)us_02.b, us_02.a, this.C, this.v)) {
            return -1;
        }
        int n2 = uq_0.a(this.i);
        int n3 = uq_0.b(this.i);
        short s2 = uq_0.c(this.i);
        if (!this.y.f && this.a(n2, n3, s2, n2, n3, s2)) {
            return -1;
        }
        if (this.g > 0) {
            for (n = -this.g; n <= this.g; ++n) {
                for (int k = -this.g; k <= this.g; ++k) {
                    if (!this.a(n2 + n, n3 + k, s2, n2 + n, n3 + k, s2)) continue;
                    return -1;
                }
            }
        }
        for (n = this.h.size() - 1; n >= 0; --n) {
            long l = this.h.get(n);
            if (l == this.i) {
                this.j = 0;
                return this.j;
            }
            us_0 us_03 = this.d(l);
            if (us_03 == null) {
                m.info((Object)("Invalid start cell for pathfind search : doesn't exist. HASHCODE : " + l));
                continue;
            }
            int n4 = uq_0.a(l);
            int n5 = uq_0.b(l);
            short s3 = uq_0.c(l);
            if (this.g > 0 && s2 != s3) {
                if (!this.y.i) continue;
                s3 = s2;
            }
            if (!yu_0.a(us_03.b + us_03.c, (int)us_03.b, us_03.a, this.C, this.v)) {
                if (this.y.i) {
                    if ((s3 = yu_0.a((int)us_03.b, (int)us_03.a, this.C, (short)(s3 + this.w), this.v)) == Short.MIN_VALUE) {
                        continue;
                    }
                } else {
                    m.info((Object)("Invalid start cell (" + n4 + ", " + n5 + ", " + s3 + ") for pathfind search : not a suitable position for the mover. "));
                    continue;
                }
            }
            us_03.e = this.a(n4, n5, n2, n3);
            if (this.y.c > 0 && (float)this.y.c < us_03.e) continue;
            us_03.d = 0.0f;
            us_03.f = us_03.e;
            us_03.i = true;
            us_03.h = (byte)-1;
            this.b(us_03);
        }
        if (this.F == -1) {
            return -1;
        }
        n = this.y.a ? 1 : 0;
        if (this.g > 0 && !this.y.a) {
            this.y.a = true;
        }
        int n6 = this.g == 0 ? this.a(n2, n3, us_02) : this.a(n2, n3, uq_0.c(this.i), us_02);
        this.y.a = n;
        return n6;
    }

    public boolean a(aff_1 aff_12, aff_1 aff_13) {
        if (aff_12.e(aff_13) != 1) {
            m.error((Object)("Unable to checkMovementOnNextCell if cells are not adjacent :" + aff_12 + ", " + aff_13));
            return false;
        }
        int n = aff_12.d();
        int n2 = aff_12.e();
        short s2 = aff_12.f();
        int n3 = aff_13.d();
        int n4 = aff_13.e();
        short s3 = aff_13.f();
        if (this.g == 0) {
            int n5;
            int n6;
            if (this.a(n3, n4, s3, n, n2, s2)) {
                return false;
            }
            int n7 = this.d(n, n2);
            if (n7 == 0) {
                return false;
            }
            int n8 = uq_0.b(n7);
            short s4 = yu_0.a(n8, n6 = uq_0.c(n7), this.C, aff_12.f());
            if (s4 == Short.MIN_VALUE) {
                return false;
            }
            int n9 = this.d(n3, n4);
            if (n9 == 0) {
                return false;
            }
            int n10 = uq_0.b(n9);
            short s5 = yu_0.a(n10, n5 = uq_0.c(n9), this.C, aff_13.f());
            if (s5 == Short.MIN_VALUE) {
                return false;
            }
            return this.z.a(n8 + s4, n8, n6, this.C, n10 + s5, n10, n5, this.C);
        }
        for (int k = -this.g; k <= this.g; ++k) {
            for (int i2 = -this.g; i2 <= this.g; ++i2) {
                if (!this.x.o(n3 + k, n4 + i2)) {
                    return false;
                }
                if (this.a(n3 + k, n4 + i2, s3, n + k, n2 + i2, s2)) {
                    return false;
                }
                boolean bl = this.a(n + k, n2 + i2, aff_13.f(), n3 + k, n4 + i2);
                if (bl) continue;
                return false;
            }
        }
        return true;
    }

    private int a(int n, int n2, us_0 us_02) {
        us_0 us_03;
        int n3 = 0;
        while ((us_03 = this.i()) != null) {
            if (this.y.b < ++n3) {
                return -1;
            }
            if (us_03 == us_02) {
                return this.c(us_03);
            }
            ys_0 ys_02 = this.C[us_03.b + us_03.c];
            int[][] nArray = this.a(ys_02, n, n2);
            int n4 = 0;
            byte by = this.h();
            for (byte by2 = 0; by2 < by; by2 = (byte)(by2 + 1)) {
                yx_0 yx_02;
                int n5;
                boolean bl = by2 > 3;
                int[] nArray2 = nArray[by2];
                if (bl && (n4 & nArray2[2]) != nArray2[2]) continue;
                int n6 = ys_02.a + nArray2[0];
                int n7 = ys_02.b + nArray2[1];
                short s2 = ys_02.c;
                if (this.y.f && !this.y.g && n6 == n && n7 == n2) {
                    return this.c(us_03);
                }
                int n8 = this.d(n6, n7);
                if (n8 == 0) continue;
                int n9 = uq_0.b(n8);
                int n10 = uq_0.c(n8);
                if (this.a(n6, n7, s2, ys_02.a, ys_02.b, ys_02.c) && (!this.y.f || n6 != n || n7 != n2) || (n5 = this.z.a(us_03.b + us_03.c, us_03.b, us_03.a, this.C, n9, n10, this.C)) == 0 || (yx_02 = this.x.p(n6, n7)) == null) continue;
                for (int k = 0; k < n5; ++k) {
                    ys_0 ys_03 = this.C[this.z.a[k]];
                    assert (ys_03.a == n6 && ys_03.b == n7) : "Pathchecker.getValidIndexes returned a CellPathData not corresponding to the given bounds";
                    if (yx_02.a(n6, n7, ys_03.c) && (!this.y.f || n6 != n || n7 != n2)) continue;
                    us_0 us_04 = this.d(n6, n7, ys_03.c);
                    if (us_04 == null) {
                        System.out.println("Node inexistant ou trop de nodes. nodes testes : " + n3 + "/" + this.y.b);
                        continue;
                    }
                    if (us_04 == us_03.g || !this.y.l && ys_03.i() || ys_03.l() && (!this.y.m || !ys_02.o()) || this.y.m && ys_02.l() && !ys_03.o() || !this.y.o && ys_02.n() || !this.y.n && ys_02.m() && ys_03.m() || !this.a(ys_02, ys_03, bl)) continue;
                    if (this.y.f && us_04 == us_02) {
                        return this.c(us_03);
                    }
                    if (bl) {
                        if (!this.a(us_04, n6, ys_02.b) || !this.a(us_04, ys_02.a, n7)) {
                            continue;
                        }
                    } else {
                        n4 = (byte)(n4 | nArray[by2][2]);
                    }
                    float f2 = us_03.d + this.a(us_03, ys_02, us_04, ys_03, by2);
                    byte by3 = (byte)(us_03.j + 1);
                    if (us_04.d < f2 || us_04.d == f2 && us_04.h < by2 || this.y.c > 0 && by3 > this.y.c) continue;
                    us_04.d = f2;
                    if (us_04.e == 0.0f) {
                        us_04.e = this.b(n6, n7, n, n2);
                    }
                    us_04.f = us_04.d + us_04.e;
                    us_04.g = us_03;
                    us_04.h = by2;
                    us_04.j = by3;
                    if (us_04.i) {
                        this.a(us_04);
                    }
                    this.b(us_04);
                    us_04.i = true;
                }
            }
            us_03.i = false;
        }
        return -1;
    }

    private boolean a(ys_0 ys_02, ys_0 ys_03, boolean bl) {
        if (this.y.p) {
            boolean bl2;
            boolean bl3 = bl2 = ys_02.q() || ys_02.p() && !bl;
            if (ys_03.q() && !bl2) {
                return false;
            }
        } else if (ys_03.q()) {
            return false;
        }
        if (ys_02.q() && ys_03.p() && bl) {
            return false;
        }
        return !ys_02.q() || ys_03.p() || ys_03.q();
    }

    private boolean a(us_0 us_02, int n, int n2) {
        int n3;
        int n4 = this.d(n, n2);
        if (n4 == 0) {
            return false;
        }
        int n5 = uq_0.b(n4);
        int n6 = this.z.a(us_02.b + us_02.c, us_02.b, us_02.a, this.C, n5, n3 = uq_0.c(n4), this.C);
        return n6 != 0;
    }

    private int[][] a(ys_0 ys_02, int n, int n2) {
        if (this.y.k) {
            int n3;
            int n4 = Math.abs(n - ys_02.a);
            if (n4 >= (n3 = Math.abs(n2 - ys_02.b))) {
                return t;
            }
            return u;
        }
        return t;
    }

    private int a(int n, int n2, short s2, us_0 us_02) {
        us_0 us_03;
        this.I.clear();
        int n3 = 0;
        while ((us_03 = this.i()) != null) {
            if (this.y.b < ++n3) {
                return -1;
            }
            if (us_03 == us_02) {
                return this.c(us_03);
            }
            ys_0 ys_02 = this.C[us_03.b + us_03.c];
            int[][] nArray = this.a(ys_02, n, n2);
            byte by = this.h();
            block1: for (byte by2 = 0; by2 < by; by2 = (byte)(by2 + 1)) {
                byte by3;
                int[] nArray2 = nArray[by2];
                int n4 = ys_02.a + nArray2[0];
                int n5 = ys_02.b + nArray2[1];
                short s3 = ys_02.c;
                if (this.y.f && !this.y.g && n4 == n && n5 == n2) {
                    return this.c(us_03);
                }
                for (int k = -this.g; k <= this.g; ++k) {
                    for (int i2 = -this.g; i2 <= this.g; ++i2) {
                        if (!this.x.o(n4 + k, n5 + i2) || this.a(n4 + k, n5 + i2, s3, n4 + k, n5 + i2, s3) && (!this.y.f || n4 + k != n || n5 + i2 != n2) || (by3 = (byte)(this.a(ys_02.a + k, ys_02.b + i2, s2, n4 + k, n5 + i2) ? 1 : 0)) == 0) continue block1;
                    }
                }
                us_0 us_04 = this.d(n4, n5, s2);
                if (us_04 == null) {
                    System.out.println("Node inexistant ou trop de nodes. nodes testes : " + n3 + "/" + this.y.b);
                    continue;
                }
                if (us_04 == us_03.g) continue;
                if (this.y.f && us_04 == us_02) {
                    return this.c(us_03);
                }
                float f2 = us_03.d + this.a(us_03, ys_02, us_04, this.C[us_03.b + us_03.c], by2);
                by3 = (byte)(us_03.j + 1);
                if (us_04.d <= f2 || this.y.c > 0 && by3 > this.y.c) continue;
                us_04.d = f2;
                if (us_04.e == 0.0f) {
                    us_04.e = this.b(n4, n5, n, n2);
                }
                us_04.f = us_04.d + us_04.e;
                us_04.g = us_03;
                us_04.h = by2;
                us_04.j = by3;
                if (us_04.i) {
                    this.a(us_04);
                }
                this.b(us_04);
                us_04.i = true;
            }
            us_03.i = false;
        }
        return -1;
    }

    private boolean a(int n, int n2, short s2, int n3, int n4) {
        int n5;
        int n6 = this.d(n, n2);
        if (n6 == 0) {
            return false;
        }
        int n7 = uq_0.b(n6);
        short s3 = yu_0.a(n7, n5 = uq_0.c(n6), this.C, s2);
        if (s3 == Short.MIN_VALUE) {
            return false;
        }
        int n8 = this.d(n3, n4);
        if (n8 == 0) {
            return false;
        }
        int n9 = uq_0.b(n8);
        long l = this.b(n7, n9);
        byte by = this.I.get(l);
        if (by != 0) {
            return by > 0;
        }
        int n10 = uq_0.c(n8);
        int n11 = this.z.a(n7 + s3, n7, n5, this.C, n9, n10, this.C);
        if (n11 == 0) {
            this.I.put(l, (byte)-1);
            return false;
        }
        for (int k = 0; k < n11; ++k) {
            ys_0 ys_02 = this.C[this.z.a[k]];
            if (ys_02.c != s2) continue;
            this.I.put(l, (byte)1);
            return true;
        }
        this.I.put(l, (byte)-1);
        return false;
    }

    private long b(int n, int n2) {
        if (n < n2) {
            return (long)n << 32 & 0xFFFFFFFF00000000L | (long)n2 & 0xFFFFFFFFL;
        }
        return (long)n2 << 32 & 0xFFFFFFFF00000000L | (long)n & 0xFFFFFFFFL;
    }

    private byte h() {
        return this.y.a ? (byte)4 : 8;
    }

    protected boolean a(int n, int n2, short s2, int n3, int n4, short s3) {
        if (this.x.a(n, n2, s2)) {
            return true;
        }
        if (yz_0.a(n, n2, (int)s2)) {
            if (!yz_0.b(n3, n4, (int)s3)) {
                return true;
            }
            if (n3 != n && n4 != n2) {
                return true;
            }
        }
        if (yz_0.a(n3, n4, (int)s3) && n3 != n && n4 != n2) {
            return true;
        }
        int n5 = uq_0.a(this.i);
        int n6 = uq_0.b(this.i);
        short s4 = uq_0.c(this.i);
        return yz_0.a(n, n2, (int)s2) && n == n5 && n2 == n6 && s2 == s4;
    }

    protected float a(us_0 us_02, ys_0 ys_02, us_0 us_03, ys_0 ys_03, byte by) {
        int n;
        float f2 = by >= 4 ? 1.4f : 1.0f;
        if (this.y.j) {
            n = Math.abs(ys_02.c - ys_03.c);
            f2 = n >= q.length ? (f2 += q[q.length - 1]) : (f2 += q[n]);
        }
        int n2 = n = us_02.h != -1 && us_02.h != by ? 1 : 0;
        if (n != 0) {
            if (!this.y.a) {
                f2 += 0.9f;
            } else if (this.y.h) {
                f2 += 10.0f;
            }
        }
        return f2;
    }

    private float a(int n, int n2, int n3, int n4) {
        int n5 = Math.abs(n - n3);
        int n6 = Math.abs(n2 - n4);
        if (this.y.a) {
            return n5 + n6;
        }
        if (n5 < n6) {
            return (float)n5 * 1.4f + (float)Math.abs(n5 - n6);
        }
        return (float)n6 * 1.4f + (float)Math.abs(n5 - n6);
    }

    private float b(int n, int n2, int n3, int n4) {
        int n5 = Math.abs(n - n3);
        int n6 = Math.abs(n2 - n4);
        if (this.y.a) {
            if (n5 == 0 && n6 == 0) {
                return 0.0f;
            }
            float f2 = afq_2.b(n5, n6) * 0.01f;
            return (float)(n5 + n6) + f2;
        }
        if (n5 < n6) {
            return (float)n5 * 1.4f + (float)Math.abs(n5 - n6);
        }
        return (float)n6 * 1.4f + (float)Math.abs(n5 - n6);
    }

    private static int c(int n, int n2) {
        return (n & 0xFFFF) << 16 | n2 & 0xFFFF;
    }

    private static int b(int n) {
        return n >>> 16 & 0xFFFF;
    }

    private static int c(int n) {
        return n & 0xFFFF;
    }

    protected static long a(int n, int n2) {
        return (long)(n + 131071 & 0x3FFFF) << 18 | (long)(n2 + 131071 & 0x3FFFF);
    }

    private static long c(int n, int n2, short s2) {
        return (long)(n + 131071 & 0x3FFFF) << 34 | (long)(n2 + 131071 & 0x3FFFF) << 16 | (long)(s2 + Short.MAX_VALUE & 0xFFFF);
    }

    public static int a(long l) {
        return (int)((l >>> 34 & 0x3FFFFL) - 131071L);
    }

    public static int b(long l) {
        return (int)((l >>> 16 & 0x3FFFFL) - 131071L);
    }

    public static short c(long l) {
        return (short)((l & 0xFFFFL) - 32767L);
    }

    private us_0 i() {
        if (this.F < 0) {
            return null;
        }
        us_0 us_02 = this.E[this.F];
        this.F = (short)(this.F + 1);
        if (this.F > this.G) {
            this.G = (short)-1;
            this.F = (short)-1;
        }
        return us_02;
    }

    private void a(us_0 us_02) {
        if (us_02 == null) {
            return;
        }
        if (this.F == -1) {
            return;
        }
        int n = this.F;
        int n2 = this.G;
        if (this.E[n] == us_02) {
            this.F = (short)(this.F + 1);
            if (this.F > this.G) {
                this.G = (short)-1;
                this.F = (short)-1;
            }
            return;
        }
        if (this.E[n2] == us_02) {
            this.G = (short)(this.G - 1);
            if (this.G < this.F) {
                this.G = (short)-1;
                this.F = (short)-1;
            }
            return;
        }
        while (n < n2) {
            int n3 = (n + n2) / 2;
            if (this.E[n3] == us_02) {
                System.arraycopy(this.E, n3 + 1, this.E, n3, this.G - n3);
                this.G = (short)(this.G - 1);
                return;
            }
            if (us_02.f >= this.E[n3].f) {
                n = n3 + 1;
                continue;
            }
            n2 = n3 - 1;
        }
    }

    private void b(us_0 us_02) {
        assert (us_02 != null) : "'can't insert a null PathFinderNode";
        if (this.F == -1) {
            this.E[0] = us_02;
            this.G = 0;
            this.F = 0;
            return;
        }
        for (int k = this.F; k <= this.G; ++k) {
            if (!(us_02.f < this.E[k].f)) continue;
            if (this.F > 0) {
                if (k == this.F) {
                    this.F = (short)(this.F - 1);
                    this.E[this.F] = us_02;
                    return;
                }
                System.arraycopy(this.E, this.F, this.E, this.F - 1, k - this.F);
                this.F = (short)(this.F - 1);
                this.E[k - 1] = us_02;
                return;
            }
            System.arraycopy(this.E, k, this.E, k + 1, this.G - k + 1);
            this.E[k] = us_02;
            this.G = (short)(this.G + 1);
            return;
        }
        this.G = (short)(this.G + 1);
        this.E[this.G] = us_02;
    }

    private us_0 d(long l) {
        return this.d(uq_0.a(l), uq_0.b(l), uq_0.c(l));
    }

    private us_0 d(int n, int n2, short s2) {
        long l = uq_0.c(n, n2, s2);
        short s3 = this.J.get(l);
        if (s3 != 0) {
            return this.A[s3];
        }
        if (this.B >= c - 1) {
            m.error((Object)"No more free nodes. Ceel can't be added to open nodes. Think about increasing PathFinder.MAX_NODES");
            return null;
        }
        int n3 = this.d(n, n2);
        if (n3 == 0) {
            return null;
        }
        int n4 = uq_0.b(n3);
        int n5 = uq_0.c(n3);
        for (int k = n4; k < n4 + n5; ++k) {
            if (this.C[k].c != s2) continue;
            us_0 us_02 = this.A[this.B + 1];
            us_02.b = (short)n4;
            us_02.c = (byte)(k - n4);
            us_02.a = (byte)n5;
            us_02.g = null;
            us_02.j = 0;
            us_02.i = false;
            us_02.f = 0.0f;
            us_02.d = Float.MAX_VALUE;
            us_02.e = 0.0f;
            this.B = (short)(this.B + 1);
            this.J.put(l, this.B);
            return us_02;
        }
        return null;
    }

    private int d(int n, int n2) {
        long l = uq_0.a(n, n2);
        int n3 = this.H.get(l);
        if (n3 != 0) {
            return n3;
        }
        yv_0 yv_02 = this.x.n(n, n2);
        if (yv_02 == null) {
            return 0;
        }
        if (!yv_02.b(n, n2)) {
            m.error((Object)"Map pas pr\u00e9sente pour ces coordonn\u00e9es... Probl\u00e8me de topologyMapInstanceSet mal charg\u00e9/initialis\u00e9 ?");
            return 0;
        }
        int n4 = yv_02.a(n, n2, this.C, (int)this.D);
        assert (n4 != 0) : "no data for a specific cell " + n + "," + n2 + "@?";
        n3 = uq_0.c(this.D, n4);
        this.H.put(l, n3);
        this.D = (short)(this.D + n4);
        return n3;
    }

    private int c(us_0 us_02) {
        assert (us_02 != null) : "can't compute a path with a null end node";
        this.j = 0;
        us_0 us_03 = us_02;
        if (!this.y.e && us_03.g != null) {
            us_03 = us_03.g;
        }
        if (!this.y.d) {
            while (us_03.g != null && this.j < 128) {
                ys_0 ys_02 = this.C[us_03.b + us_03.c];
                short s2 = this.j;
                this.j = (short)(s2 + 1);
                this.k[s2] = uq_0.c(ys_02.a, ys_02.b, ys_02.c);
                us_03 = us_03.g;
            }
            if (us_03.g == null) {
                return this.j;
            }
        } else {
            while (us_03 != null && this.j < 128) {
                ys_0 ys_03 = this.C[us_03.b + us_03.c];
                short s3 = this.j;
                this.j = (short)(s3 + 1);
                this.k[s3] = uq_0.c(ys_03.a, ys_03.b, ys_03.c);
                us_03 = us_03.g;
            }
            if (us_03 == null) {
                return this.j;
            }
        }
        return -1;
    }

    public boolean b(aff_1 aff_12, aff_1 aff_13) {
        return this.a(aff_12, aff_13, false);
    }

    public boolean a(aff_1 aff_12, aff_1 aff_13, boolean bl) {
        int n;
        int n2;
        int n3;
        int n4;
        if (aff_12 == null || aff_13 == null) {
            m.error((Object)("IMpossible de savoir si un chemin en ligne droite existe: " + aff_12 + "/" + aff_13));
            return false;
        }
        if (aff_13.equals(aff_12)) {
            return true;
        }
        if (aff_12.d() != aff_13.d() && aff_12.e() != aff_13.e()) {
            m.info((Object)"Cellules non align\u00e9es : impossible d'avoir un chemin en ligne droite");
            return false;
        }
        int n5 = aff_12.d();
        int n6 = aff_13.d();
        int n7 = aff_12.e();
        int n8 = aff_13.e();
        if (n5 == n6) {
            n4 = 0;
            n3 = n8 > n7 ? 1 : -1;
            n2 = Math.abs(n8 - n7);
        } else {
            n4 = n6 > n5 ? 1 : -1;
            n3 = 0;
            n2 = Math.abs(n6 - n5);
        }
        int n9 = n5;
        int n10 = n7;
        int n11 = this.d(n9, n10);
        if (n11 == 0) {
            m.info((Object)("IMpossible de r\u00e9cup\u00e9rer les informations de la cellule " + n9 + ", " + n10));
            return false;
        }
        int n12 = uq_0.b(n11);
        int n13 = yu_0.a(n12, n = uq_0.c(n11), this.C, aff_12.f());
        if (n13 == Short.MIN_VALUE) {
            m.error((Object)("Position en z non valide pour cette cellule : " + aff_12));
            return false;
        }
        try {
            for (int k = 0; k < n2; ++k) {
                int n14;
                int n15 = n9 + n4;
                int n16 = n10 + n3;
                int n17 = this.d(n15, n16);
                if (n17 == 0) {
                    m.debug((Object)("Une cellule du mouvement en ligne droite n'existe pas : " + n15 + ", " + n16));
                    return false;
                }
                int n18 = uq_0.b(n17);
                int n19 = this.z.a(n13 + n12, n12, n, this.C, n18, n14 = uq_0.c(n17), this.C);
                if (n19 == 0) {
                    m.debug((Object)("Cellule " + n15 + ", " + n16 + " emp\u00eache le mouvement"));
                    return false;
                }
                if (bl && this.x instanceof tg_0 && ((tg_0)this.x).k(n9, n10)) {
                    return false;
                }
                n9 = n15;
                n10 = n16;
                n12 = n18;
                n = n14;
                n13 = this.z.a[0] - n12;
            }
        }
        catch (Throwable throwable) {
            m.error((Object)"Exception pendant le check pour savoir s'il y a un chemin en ligne droite : ", throwable);
            return false;
        }
        return true;
    }
}

