/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.map.hash.TLongIntHashMap
 *  gnu.trove.procedure.TLongProcedure
 *  gnu.trove.set.hash.TLongHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.map.hash.TLongIntHashMap;
import gnu.trove.procedure.TLongProcedure;
import gnu.trove.set.hash.TLongHashSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from UU
 */
public class uu_0 {
    private static final Logger z = Logger.getLogger(uu_0.class);
    private final List<uv_0> A = new ArrayList<uv_0>();
    private static final ys_0[] B = new ys_0[32];
    private static final boolean C = false;
    private static final int D = 80;
    public static final int a = -1;
    private static final int E = 12;
    protected final ys_0[] b;
    protected final TLongArrayList c = new TLongArrayList();
    protected final TLongHashSet d = new TLongHashSet();
    protected final TLongHashSet e = new TLongHashSet();
    protected final TLongIntHashMap f = new TLongIntHashMap();
    protected short g;
    protected short h;
    protected int i;
    protected int j;
    protected int k;
    protected int l;
    protected int m;
    protected int n;
    protected yv_0 o = null;
    protected yx_0 p;
    private final long F;
    private final short G;
    private final up_0 H;
    protected boolean q;
    public static final byte r = 0;
    public static final byte s = -1;
    public static final byte t = -2;
    public static final byte u = 1;
    protected static final int v = 0;
    protected static final int w = 1;
    protected static final int x = 2;

    public uu_0(boolean bl, long l, short s2, up_0 up_02, ys_0[] ys_0Array) {
        this.F = l;
        this.G = s2;
        this.b = ys_0Array;
        this.q = bl;
        this.H = up_02;
    }

    public uu_0(long l, short s2, up_0 up_02, ys_0[] ys_0Array) {
        this(false, l, s2, up_02, ys_0Array);
    }

    public short a() {
        return this.g;
    }

    public short b() {
        return this.h;
    }

    public int c() {
        return this.i;
    }

    public int d() {
        return this.j;
    }

    public int e() {
        return this.k;
    }

    public int f() {
        return this.l;
    }

    public int g() {
        return this.m;
    }

    public int h() {
        return this.n;
    }

    public final TLongArrayList i() {
        return this.c;
    }

    public final int j() {
        return this.c.size();
    }

    public final long a(int n) {
        return this.c.getQuick(n);
    }

    public void a(TLongProcedure tLongProcedure) {
        this.e.forEach(tLongProcedure);
    }

    private boolean a(int n, int n2, int n3, int n4) {
        long l = (long)(n + 131071) << 34 | (long)(n2 + 131071) << 16;
        if (this.d.contains(l)) {
            return false;
        }
        byte by = this.a(n3, n4, n, n2, l);
        if (by != 1) {
            this.d.add(l);
        }
        return by == 0;
    }

    public void a(int n, int n2, short s2, int n3, uw_0 uw_02, yx_0 yx_02) {
        long l;
        yv_0 yv_02;
        uw_02.a(n, n2, s2);
        this.g = this.h = s2;
        this.c.ensureCapacity(n3 + 80);
        this.d.ensureCapacity(n3 + 80);
        this.o = yv_02 = yx_02.a();
        this.p = yx_02;
        short s3 = ys_0.a(this.b, yv_02, n, n2, s2);
        assert (s3 != -1) : "Unable to find a valid z position for the cell (" + n + "; " + n2 + "; " + s2 + ")";
        if (s3 < 0 || this.b[s3].z == -1) {
            z.error((Object)("On essaye de cr\u00e9er une bulle sur une position non valide (" + n + "; " + n2 + "; " + s2 + ")"));
            return;
        }
        short s4 = s3;
        this.c.add(uu_0.a(n, n2, s3));
        this.d.add(uu_0.b(n, n2));
        this.i = n;
        this.k = n;
        this.j = n2;
        this.l = n2;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 1;
        while (true) {
            l = this.c.getQuick(n4);
            int n8 = (int)(l >>> 34) - 131071;
            int n9 = (int)(l >>> 16 & 0x3FFFFL) - 131071;
            s3 = (short)(l & 0xFFFFL);
            if (!this.o.b(n8, n9)) {
                yx_02 = yz_0.a(this.F, n8, n9, this.G);
                this.o = yx_02.a();
                this.p = yx_02;
            }
            yv_02 = this.o;
            int n10 = yv_02.a(n8, n9, this.b, 0);
            ys_0 ys_02 = this.b[s3];
            int n11 = ys_02.a;
            int n12 = ys_02.b;
            int n13 = n11 - 1;
            if (n7 < n3 && uw_02.a(n13, n12) && this.a(n13, n12, s3, n10)) {
                if (n13 < this.i) {
                    this.i = n13;
                }
                ++n7;
            }
            n13 = n12 - 1;
            if (n7 < n3 && uw_02.a(n11, n13) && this.a(n11, n13, s3, n10)) {
                if (n13 < this.j) {
                    this.j = n13;
                }
                ++n7;
            }
            n13 = n11 + 1;
            if (n7 < n3 && uw_02.a(n13, n12) && this.a(n13, n12, s3, n10)) {
                if (n13 > this.k) {
                    this.k = n13;
                }
                ++n7;
            }
            n13 = n12 + 1;
            if (n7 < n3 && uw_02.a(n11, n13) && this.a(n11, n13, s3, n10)) {
                if (n13 > this.l) {
                    this.l = n13;
                }
                ++n7;
            }
            if (n7 >= n3) break;
            if (++n4 < n7) continue;
            if (n6 >= n7) break;
            uw_02.a();
            int n14 = n4;
            n4 = n5;
            n5 = n6;
            n6 = n14;
        }
        if (!uw_02.a(n, n2)) {
            l = uu_0.a(n, n2, s3);
            this.f.put(l, (int)s4);
        }
        int n15 = this.q ? this.l() : -1;
        this.m = this.k - this.i + 1;
        this.n = this.l - this.j + 1;
        this.b(n15);
    }

    private int l() {
        int n = this.c.size();
        TLongHashSet tLongHashSet = this.d;
        TLongIntHashMap tLongIntHashMap = this.f;
        for (int k = 0; k < n; ++k) {
            Object object;
            long l = this.c.getQuick(k);
            int n2 = (int)(l >>> 34) - 131071;
            int n3 = (int)(l >>> 16 & 0x3FFFFL) - 131071;
            byte by = 0;
            long l2 = (long)(n2 - 1 + 131071) << 34 | (long)(n3 + 131071) << 16;
            if (!tLongHashSet.contains(l2)) {
                tLongHashSet.add(l2);
                by = (byte)(by | 1);
            } else if (tLongIntHashMap.contains(l2)) {
                if (n2 - 1 < this.i) {
                    this.i = n2 - 1;
                }
                this.a(l2, tLongIntHashMap.get(l2));
            } else if (n2 - 1 < this.i) {
                this.e.remove(l2);
            }
            long l3 = (long)(n2 + 1 + 131071) << 34 | (long)(n3 + 131071) << 16;
            if (!tLongHashSet.contains(l3)) {
                tLongHashSet.add(l3);
                by = (byte)(by | 2);
            } else if (tLongIntHashMap.contains(l3)) {
                if (n2 + 1 > this.k) {
                    this.k = n2 + 1;
                }
                this.a(l3, tLongIntHashMap.get(l3));
            } else if (n2 + 1 > this.k) {
                this.e.remove(l3);
            }
            long l4 = (long)(n2 + 131071) << 34 | (long)(n3 - 1 + 131071) << 16;
            if (!tLongHashSet.contains(l4)) {
                tLongHashSet.add(l4);
                by = (byte)(by | 4);
            } else if (tLongIntHashMap.contains(l4)) {
                if (n3 - 1 < this.j) {
                    this.j = n3 - 1;
                }
                this.a(l4, tLongIntHashMap.get(l4));
            } else if (n3 - 1 < this.j) {
                this.e.remove(l4);
            }
            long l5 = (long)(n2 + 131071) << 34 | (long)(n3 + 1 + 131071) << 16;
            if (!tLongHashSet.contains(l5)) {
                tLongHashSet.add(l5);
                by = (byte)(by | 8);
            } else if (tLongIntHashMap.contains(l5)) {
                if (n3 + 1 > this.l) {
                    this.l = n3 + 1;
                }
                this.a(l5, tLongIntHashMap.get(l5));
            } else if (n3 + 1 > this.l) {
                this.e.remove(l5);
            }
            if (by == 0) continue;
            short s2 = (short)(l & 0xFFFFL);
            if (!this.o.b(n2, n3)) {
                object = yz_0.a(this.F, n2, n3, this.G);
                this.o = ((yx_0)object).a();
                this.p = object;
            }
            object = this.o;
            int n4 = ((yv_0)object).a(n2, n3, this.b, 0);
            if ((by & 1) == 1) {
                if (this.a(s2, n4, n2 - 1, n3, l2) == 0) {
                    if (n2 - 1 < this.i) {
                        this.i = n2 - 1;
                    }
                } else {
                    this.e.remove(l2);
                }
            }
            if ((by & 2) == 2) {
                if (this.a(s2, n4, n2 + 1, n3, l3) == 0) {
                    if (n2 + 1 > this.k) {
                        this.k = n2 + 1;
                    }
                } else {
                    this.e.remove(l3);
                }
            }
            if ((by & 4) == 4) {
                if (this.a(s2, n4, n2, n3 - 1, l4) == 0) {
                    if (n3 - 1 < this.j) {
                        this.j = n3 - 1;
                    }
                } else {
                    this.e.remove(l4);
                }
            }
            if ((by & 8) != 8) continue;
            if (this.a(s2, n4, n2, n3 + 1, l5) == 0) {
                if (n3 + 1 <= this.l) continue;
                this.l = n3 + 1;
                continue;
            }
            this.e.remove(l5);
        }
        return n;
    }

    protected void b(int n) {
    }

    protected final byte a(int n, int n2, int n3, int n4, long l) {
        if (!this.o.b(n3, n4)) {
            yx_0 yx_02 = yz_0.a(this.F, n3, n4, this.G);
            if (yx_02 == null) {
                return -1;
            }
            this.p = yx_02;
            this.o = yx_02.a();
        }
        switch (this.a(n3, n4)) {
            case 0: {
                break;
            }
            case 2: {
                this.e.add(l);
                return -1;
            }
            case 1: {
                return -2;
            }
            default: {
                z.error((Object)("BlockingState inconnu : " + this.a(n3, n4)));
            }
        }
        int n5 = this.o.a(n3, n4, B, 0);
        if (n5 == 0) {
            return -2;
        }
        if (this.c(n5)) {
            return -2;
        }
        int n6 = this.H.a(n, 0, n2, this.b, 0, n5, B);
        if (n6 <= 0) {
            return 1;
        }
        short s2 = (short)this.H.a[0];
        if (!this.a(B[s2])) {
            return -2;
        }
        this.a(l, (int)s2);
        return 0;
    }

    private boolean c(int n) {
        for (int k = 0; k < n; ++k) {
            if (uu_0.B[k].z == -1) continue;
            return false;
        }
        return true;
    }

    protected boolean a(ys_0 ys_02) {
        return true;
    }

    private void a(long l, int n) {
        this.c.add(l | (long)n);
        short s2 = uu_0.B[n].c;
        if (s2 < this.g) {
            this.g = s2;
        } else if (s2 > this.h) {
            this.h = s2;
        }
        this.b(B[n]);
    }

    private void b(ys_0 ys_02) {
        for (uv_0 uv_02 : this.A) {
            try {
                uv_02.a(ys_02);
            }
            catch (Exception exception) {
                z.error((Object)"Exception raised", (Throwable)exception);
            }
        }
    }

    protected int a(int n, int n2) {
        return this.p.b(n, n2) ? 1 : 0;
    }

    public static long a(int n, int n2, short s2) {
        return (long)(n + 131071) << 34 | (long)(n2 + 131071) << 16 | (long)s2;
    }

    protected static long b(int n, int n2) {
        return (long)(n + 131071) << 34 | (long)(n2 + 131071) << 16;
    }

    public static int a(long l) {
        return (int)(l >>> 34) - 131071;
    }

    public static int b(long l) {
        return (int)(l >>> 16 & 0x3FFFFL) - 131071;
    }

    public void k() {
        this.c.reset();
        this.d.clear();
        this.f.clear();
    }

    public boolean a(uv_0 uv_02) {
        return !this.A.contains(uv_02) && this.A.add(uv_02);
    }

    public boolean b(uv_0 uv_02) {
        return this.A.remove(uv_02);
    }

    public String toString() {
        return "boundingBox={(" + this.i + ", " + this.j + ") => (" + this.k + ", " + this.l + ")}, numCells=" + this.j() + ", width=" + this.m + ", height=" + this.n;
    }

    static {
        for (int k = 0; k < B.length; ++k) {
            uu_0.B[k] = new ys_0();
        }
    }
}

