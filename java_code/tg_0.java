/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.set.hash.TByteHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.set.hash.TByteHashSet;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from Tg
 */
public class tg_0
extends yy_0 {
    protected short[] a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected short f;
    protected boolean g;
    protected short h;
    protected short i;
    protected short j;
    protected short k;
    private final TByteHashSet G = new TByteHashSet();
    private final TByteHashSet H = new TByteHashSet();
    private boolean I = false;
    private final ti_0[] J = new ti_0[127];
    protected final tj_0 l = new tj_0();
    private boolean K;
    private byte[] L;
    private final tl_0 M = new tl_0();
    protected byte m = 0;
    protected byte n = 0;
    private acp_2<int[]> N;
    protected static final int o = 512;
    protected static final int p = 256;
    protected static final int q = 128;
    protected static final int r = 63;
    protected static final int s = 10;
    protected static final int t = 0;
    protected static final int u = 65279;
    protected static final boolean v = false;
    private static final Logger O = Logger.getLogger((String)"debug");
    protected static final ys_0[] w = new ys_0[32];
    private static final Logger P = Logger.getLogger(tg_0.class);
    private List<int[]> Q;

    @Override
    public boolean a(int n, int n2, short s2) {
        int n3 = this.h(n, n2);
        if (n3 < 0 || n3 >= this.b) {
            P.info((Object)"trying to get information in a fightmap on a out of bounds cell");
            return true;
        }
        short s3 = this.a[n3];
        if ((s3 & 0x300) != 0) {
            return true;
        }
        if (this.I) {
            return false;
        }
        TByteHashSet tByteHashSet = this.f(n, n2);
        if (tByteHashSet == null || tByteHashSet.isEmpty()) {
            return false;
        }
        for (byte by : tByteHashSet) {
            boolean bl;
            ti_0 ti_02 = this.J[by];
            if (ti_02 == null || !(bl = ti_02.ab()) || this.G.contains(by)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean b(int n, int n2, short s2) {
        int n3 = this.h(n, n2);
        if (n3 < 0 || n3 >= this.b) {
            P.info((Object)"trying to get information in a fightmap on an out-of-bounds cell");
            return true;
        }
        short s3 = this.a[n3];
        if ((s3 & 0x100) == 256) {
            return true;
        }
        TByteHashSet tByteHashSet = this.f(n, n2);
        if (tByteHashSet == null || tByteHashSet.isEmpty()) {
            return false;
        }
        for (byte by : tByteHashSet) {
            ti_0 ti_02 = this.J[by];
            if (ti_02 == null) {
                return false;
            }
            boolean bl = ti_02.ac();
            if (!bl || this.H.contains(by)) continue;
            return true;
        }
        return false;
    }

    public short[] a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public byte d() {
        return this.m;
    }

    public byte e() {
        return this.n;
    }

    public boolean f() {
        return this.K;
    }

    public byte[] g() {
        return this.L;
    }

    public boolean a(aqd_1 aqd_12, int n, int n2, short s2, int n3, int n4, short s3, aej_2 aej_22) {
        if (aqd_12 == null) {
            return true;
        }
        Iterable<int[]> iterable = aqd_12.a(n, n2, s2, n3, n4, s3, aej_22);
        if (iterable == null) {
            return true;
        }
        for (int[] nArray : iterable) {
            if (!this.c(nArray[0], nArray[1])) {
                return false;
            }
            if (this.g(nArray[0], nArray[1]) == null) continue;
            return false;
        }
        return true;
    }

    public boolean a(int n, int n2) {
        if (!this.o(n, n2)) {
            return false;
        }
        int n3 = this.h(n, n2);
        return this.a[n3] != -257 && (this.a[n3] & 0x80) != 0;
    }

    public boolean b(int n, int n2) {
        if (!this.o(n, n2)) {
            return false;
        }
        int n3 = this.h(n, n2);
        return this.i(n3);
    }

    private boolean i(int n) {
        return (this.a[n] & 0x80) == 0;
    }

    public boolean c(int n, int n2) {
        if (!this.o(n, n2)) {
            return false;
        }
        int n3 = this.h(n, n2);
        return this.j(n3);
    }

    private boolean j(int n) {
        return (this.a[n] & 0xFFFFFEFF) != -257;
    }

    public ti_0[] h() {
        return this.J;
    }

    public ti_0 a(byte by) {
        if (!this.c(by)) {
            return null;
        }
        return this.J[by];
    }

    public boolean d(int n, int n2) {
        if (!this.o(n, n2)) {
            return false;
        }
        return this.c(n, n2) || this.b(n - 1, n2) || this.b(n, n2 - 1) || this.b(n + 1, n2) || this.b(n, n2 + 1);
    }

    public byte e(int n, int n2) {
        if (n < this.z || n >= this.z + this.D || n2 < this.A || n2 >= this.A + this.E) {
            return -1;
        }
        TByteHashSet tByteHashSet = this.l.a(this.h(n, n2));
        if (tByteHashSet == null || tByteHashSet.isEmpty()) {
            return -1;
        }
        return tByteHashSet.iterator().next();
    }

    public TByteHashSet f(int n, int n2) {
        TByteHashSet tByteHashSet = new TByteHashSet();
        if (n < this.z || n >= this.z + this.D || n2 < this.A || n2 >= this.A + this.E) {
            return tByteHashSet;
        }
        return this.l.a(this.h(n, n2));
    }

    public int b(byte by) {
        return this.l.c(by);
    }

    public byte[] i() {
        return this.l.a();
    }

    protected int a(ti_0 ti_02) {
        return this.h(ti_02.G(), ti_02.H());
    }

    @Nullable
    public ti_0 g(int n, int n2) {
        byte by = this.e(n, n2);
        if (by < 0) {
            return null;
        }
        return this.J[by];
    }

    public void b(ti_0 ti_02) {
        assert (ti_02 != null) : "can't work on a null obstacle";
        this.G.add(ti_02.Z());
    }

    public void c(ti_0 ti_02) {
        assert (ti_02 != null) : "can't work on a null obstacle";
        this.G.remove(ti_02.Z());
    }

    public void j() {
        this.G.clear();
    }

    public boolean k() {
        return this.I;
    }

    public void a(boolean bl) {
        this.I = bl;
    }

    public void d(ti_0 ti_02) {
        assert (ti_02 != null) : "can't work on a null obstacle";
        this.H.add(ti_02.Z());
    }

    public void e(ti_0 ti_02) {
        assert (ti_02 != null) : "can't work on a null obstacle";
        this.H.remove(ti_02.Z());
    }

    public void l() {
        this.H.clear();
    }

    public void f(ti_0 ti_02) {
        if (ti_02 == null) {
            return;
        }
        if (!ti_02.aa()) {
            return;
        }
        this.j(ti_02);
        if (this.o(ti_02.G(), ti_02.H())) {
            this.b(ti_02, ti_02.G(), ti_02.H());
        }
    }

    public void a(byte by, int n) {
        this.l.a(by, n);
    }

    public void g(ti_0 ti_02) {
        if (ti_02 == null) {
            return;
        }
        if (!ti_02.aa()) {
            return;
        }
        if (!this.c(ti_02.Z())) {
            return;
        }
        if (this.J[ti_02.Z()] == ti_02) {
            if (this.o(ti_02.G(), ti_02.H())) {
                this.i(ti_02);
            }
            this.J[ti_02.Z()] = null;
        }
        ti_02.a((byte)-1);
    }

    public void a(@NotNull ti_0 ti_02, boolean bl) {
        int n;
        assert (ti_02.aa());
        assert (this.J[ti_02.Z()] == ti_02) : "This obstacle must have been added with addObstacle";
        int n2 = ti_02.G();
        if (!this.o(n2, n = ti_02.H())) {
            return;
        }
        if (bl) {
            this.b(ti_02, n2, n);
        } else {
            this.i(ti_02);
        }
    }

    public void a(ti_0 ti_02, int n, int n2) {
        assert (ti_02 != null) : "can't work on a null obstacle";
        if (!ti_02.aa()) {
            return;
        }
        if (this.o(ti_02.G(), ti_02.H())) {
            this.i(ti_02);
        }
        if (this.o(n, n2)) {
            this.b(ti_02, n, n2);
        }
    }

    private void b(ti_0 ti_02, int n, int n2) {
        byte by;
        if (ti_02 == null) {
            P.error((Object)"On passe un obstacle null");
            return;
        }
        if (!this.c(ti_02.Z())) {
            P.error((Object)(" l'id de l'obstacle est invalide : " + ti_02.Z() + " : " + ti_02));
            return;
        }
        byte by2 = ti_02.Z();
        ti_0 ti_03 = this.J[by2];
        if (ti_03 != null && ti_03 != ti_02) {
            this.g(ti_03);
        }
        if ((by = ti_02.X()) <= 0 && !this.o(n, n2)) {
            P.error((Object)"Les coordonn\u00e9es doivent etre dans la FightMap");
            return;
        }
        this.J[by2] = ti_02;
        this.l.a(by2, this.h(n, n2));
        if (by <= 0) {
            return;
        }
        for (int k = n - by; k <= n + by; ++k) {
            for (int i2 = n2 - by; i2 <= n2 + by; ++i2) {
                if (!this.o(k, i2) || k == n && i2 == n2) continue;
                int n3 = this.h(k, i2);
                this.l.b(by2, n3);
            }
        }
    }

    private void i(ti_0 ti_02) {
        if (ti_02 == null) {
            return;
        }
        if (ti_02.X() <= 0) {
            this.l.a(ti_02.Z());
        } else if (ti_02.X() > 0) {
            this.l.b(ti_02.Z());
        }
    }

    protected int h(int n, int n2) {
        return (n2 - this.A) * this.D + (n - this.z);
    }

    public int a(int n) {
        return n / this.D + this.A;
    }

    public int b(int n) {
        return n % this.D + this.z;
    }

    public void h(ti_0 ti_02) {
        if (ti_02 == null) {
            return;
        }
        byte by = ti_02.Z();
        if (this.J[by] != ti_02) {
            this.i(this.J[by]);
            this.b(ti_02, ti_02.G(), ti_02.H());
        }
        this.J[by] = ti_02;
    }

    private byte j(ti_0 ti_02) {
        assert (ti_02 != null);
        byte by = this.J.length;
        for (byte by2 = 0; by2 < by; by2 = (byte)((byte)(by2 + 1))) {
            if (this.J[by2] != null) continue;
            this.J[by2] = ti_02;
            ti_02.a(by2);
            return by2;
        }
        P.warn((Object)"Max obstacle per fight reached");
        return -1;
    }

    public void a(boolean bl, boolean bl2) {
        for (int k = this.z; k < this.z + this.D; ++k) {
            for (int i2 = this.A; i2 < this.A + this.E; ++i2) {
                yx_0 yx_02;
                if (!this.c(k, i2) || (yx_02 = yz_0.a((long)this.j, k, i2, bl2 ? this.k : (short)0)) == null) continue;
                yx_02.b(k, i2, bl);
            }
        }
    }

    public boolean c(byte by) {
        return by >= 0;
    }

    public short i(int n, int n2) {
        assert (n >= this.z && n < this.z + this.D && n2 >= this.A && n2 < this.A + this.E) : "Coords must be in the fightMap, you can call isInMap to do make sure that's the case";
        int n3 = this.h(n, n2);
        int n4 = (this.a[n3] & 0x3F) >>> 0;
        int n5 = this.y.size();
        for (int k = 0; k < n5; ++k) {
            yx_0 yx_02 = (yx_0)this.y.get(k);
            yv_0 yv_02 = yx_02.a();
            if (!yv_02.b(n, n2)) continue;
            int n6 = yv_02.a(n, n2, w, 0);
            if (n4 >= n6) {
                return Short.MIN_VALUE;
            }
            return tg_0.w[n4].c;
        }
        return Short.MIN_VALUE;
    }

    public short m() {
        return this.h;
    }

    public short n() {
        return this.i;
    }

    public boolean o() {
        return this.g;
    }

    public short p() {
        return this.j;
    }

    public void a(short s2) {
        this.j = s2;
    }

    public short q() {
        return this.k;
    }

    public void b(short s2) {
        this.k = s2;
    }

    public void d(byte by) {
        this.m = by;
    }

    public void e(byte by) {
        this.n = by;
    }

    public void c(short s2) {
        this.i = s2;
    }

    public void d(short s2) {
        this.h = s2;
    }

    public void a(byte[] byArray) {
        this.L = byArray;
    }

    public void b(boolean bl) {
        this.K = bl;
    }

    public void c(int n) {
        this.z = n;
    }

    public void d(int n) {
        this.A = n;
    }

    public void e(int n) {
        this.b = n;
    }

    public void a(short[] sArray) {
        this.a = sArray;
    }

    public void f(int n) {
        this.D = n;
    }

    public void g(int n) {
        this.E = n;
    }

    public TLongArrayList f(byte by) {
        return this.M.a(by);
    }

    public void r() {
        for (int k = this.z; k < this.B; ++k) {
            for (int i2 = this.A; i2 < this.C; ++i2) {
                byte by = this.j(k, i2);
                if (by == -1) continue;
                this.M.a(by, k, i2);
            }
        }
    }

    public void h(int n) {
        int n2;
        int n3;
        this.L = new byte[this.b];
        TIntArrayList tIntArrayList = new TIntArrayList();
        for (int k = this.z; k < this.B; ++k) {
            for (n3 = this.A; n3 < this.C; ++n3) {
                n2 = this.j(k, n3);
                if (n2 == -1) continue;
                tIntArrayList.add(this.h(k, n3));
            }
        }
        if (tIntArrayList.size() < n * 2) {
            return;
        }
        aff_1[][] aff_1Array = new aff_1[2][n];
        for (n3 = 0; n3 < n; ++n3) {
            n2 = tIntArrayList.removeAt(Hw.a(tIntArrayList.size()));
            aff_1Array[0][n3] = new aff_1(this.b(n2), this.a(n2));
            n2 = tIntArrayList.removeAt(Hw.a(tIntArrayList.size()));
            aff_1Array[1][n3] = new aff_1(this.b(n2), this.a(n2));
        }
        for (n3 = 0; n3 < aff_1Array.length; ++n3) {
            aff_1[] aff_1Array2 = aff_1Array[n3];
            this.a(aff_1Array2, (byte)n3);
        }
    }

    public void a(aff_1[] aff_1Array, byte by) {
        int n;
        assert (by != -1) : "Id can't be equal to -1 since this value is used when the cell is not a valid position";
        assert (this.b != 0) : "The fight map must be created before custom teams are added";
        if (!this.K) {
            this.K = true;
            this.L = new byte[this.b];
            this.N = new acp_2(2);
            for (n = 0; n < this.L.length; ++n) {
                this.L[n] = -1;
            }
        }
        n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = aff_1Array.length;
        for (int k = 0; k < n7; ++k) {
            aff_1 aff_12 = aff_1Array[k];
            if (aff_12 == null) continue;
            int n8 = aff_12.d();
            int n9 = aff_12.e();
            assert (this.b(n8, n9)) : "The start position (" + n8 + "; " + n9 + ") is not in the fightMap";
            if (k == 0) {
                n = n8;
                n2 = n9;
                n3 = n8;
                n4 = n9;
                n5 = n8;
                n6 = n9;
            } else {
                if (n8 < n3) {
                    n3 = n8;
                }
                if (n9 < n4) {
                    n4 = n9;
                }
                if (n8 > n5) {
                    n5 = n8;
                }
                if (n9 > n6) {
                    n6 = n9;
                }
                int n10 = n5 - (n5 - n3) / 2;
                int n11 = n6 - (n6 - n4) / 2;
                if (Math.abs(n8 - n10) + Math.abs(n9 - n11) < Math.abs(n - n10) + Math.abs(n2 - n11)) {
                    n = n8;
                    n2 = n9;
                }
            }
            this.L[this.h((int)n8, (int)n9)] = by;
            this.M.a(by, n8, n9);
        }
        this.N.a(by, new int[]{n, n2});
    }

    public byte j(int n, int n2) {
        if (!this.b(n, n2)) {
            return -1;
        }
        if (this.K) {
            return this.L[this.h(n, n2)];
        }
        if (this.D >= this.E) {
            int n3 = this.D / 2;
            return n < this.z + n3 ? this.m : (byte)(1 - this.m);
        }
        int n4 = this.E / 2;
        return n2 < this.A + n4 ? this.n : (byte)(1 - this.n);
    }

    public byte a(aff_1 aff_12, aff_1 aff_13) {
        if (this.D >= this.E) {
            return aff_12.d() <= aff_13.d() ? (byte)0 : 1;
        }
        return aff_12.e() <= aff_13.e() ? (byte)0 : 1;
    }

    public aff_1 s() {
        return new aff_1(this.D / 2 + this.z, this.E / 2 + this.A, 0);
    }

    public final ys_0 c(int n, int n2, short s2) {
        if (!this.o(n, n2)) {
            return null;
        }
        int n3 = this.h(n, n2);
        int n4 = (this.a[n3] & 0x3F) >>> 0;
        int n5 = this.y.size();
        for (int k = 0; k < n5; ++k) {
            yx_0 yx_02 = (yx_0)this.y.get(k);
            yv_0 yv_02 = yx_02.a();
            if (!yv_02.b(n, n2)) continue;
            int n6 = yv_02.a(n, n2, w, 0);
            if (n4 >= n6) {
                return null;
            }
            if (s2 != tg_0.w[n4].c) {
                return null;
            }
            return w[n4];
        }
        return null;
    }

    public final boolean d(int n, int n2, short s2) {
        ys_0 ys_02 = this.c(n, n2, s2);
        if (ys_02 == null) {
            return false;
        }
        return ys_02.z != -1;
    }

    public final boolean k(int n, int n2) {
        int n3 = this.h(n, n2);
        if (n3 < 0 || n3 >= this.b) {
            return false;
        }
        short s2 = this.a[n3];
        return (s2 & 0x300) != 0;
    }

    public short l(int n, int n2) {
        int n3 = this.z + this.D - n > n - this.z ? this.z + this.D - n : n - this.z;
        int n4 = this.A + this.E - n > n2 - this.A ? this.A + this.E - n2 : n2 - this.A;
        return (short)(n3 > n4 ? n3 : n4);
    }

    public aej_2 g(byte by) {
        if (this.D >= this.E) {
            return by == 0 ? aej_2.b : aej_2.f;
        }
        return by == 0 ? aej_2.d : aej_2.h;
    }

    public void t() {
        this.b = 0;
        this.y.clear();
        this.L = null;
    }

    public void u() {
        boolean bl;
        boolean bl2 = bl = this.k == 0;
        if (!yz_0.c() && !bl) {
            afk_2 afk_22 = XY.a(this.z, this.A, this.D, this.E);
            for (int k = afk_22.d; k < afk_22.e; ++k) {
                for (int i2 = afk_22.b; i2 < afk_22.c; ++i2) {
                    yz_0.b((long)this.j, (int)((short)i2), (int)((short)k), this.k);
                }
            }
        }
    }

    public int v() {
        int n = 0;
        n += 4;
        n += 16;
        n += 4;
        n += 2;
        n += this.b * 2;
        ++n;
        if (this.K) {
            n += this.L.length;
        }
        return n += 2;
    }

    public void a(ByteBuffer byteBuffer) {
        int n = byteBuffer.position();
        this.j = byteBuffer.getShort();
        this.k = byteBuffer.getShort();
        this.z = byteBuffer.getInt();
        this.A = byteBuffer.getInt();
        this.D = byteBuffer.getInt();
        this.E = byteBuffer.getInt();
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getShort();
        this.b = byteBuffer.getShort();
        assert (byteBuffer.remaining() > this.b * 2);
        this.a = new short[this.b];
        for (int k = 0; k < this.b; ++k) {
            this.a[k] = byteBuffer.getShort();
        }
        boolean bl = this.K = byteBuffer.get() == 1;
        if (this.K) {
            this.L = new byte[this.b];
            byteBuffer.get(this.L);
        }
        afk_2 afk_22 = XY.a(this.z, this.A, this.D, this.E);
        if (yz_0.c()) {
            for (int k = afk_22.d; k < afk_22.e; ++k) {
                for (int i2 = afk_22.b; i2 < afk_22.c; ++i2) {
                    yx_0 yx_02 = yz_0.d((short)i2, (short)k);
                    if (yx_02 == null) continue;
                    this.y.add(yx_02);
                }
            }
        } else {
            for (int k = afk_22.d; k < afk_22.e; ++k) {
                for (int i3 = afk_22.b; i3 < afk_22.c; ++i3) {
                    try {
                        yz_0.a((long)this.j, (short)i3, (short)k);
                        yx_0 yx_03 = yz_0.b((long)this.j, (short)i3, (short)k, this.k);
                        if (yx_03 == null) continue;
                        this.y.add(yx_03);
                        continue;
                    }
                    catch (IOException iOException) {
                        P.error((Object)("Unable to load map (" + (short)i3 + "; " + (short)k + ")"));
                    }
                }
            }
        }
        this.m = byteBuffer.get();
        this.n = byteBuffer.get();
        assert (byteBuffer.position() - n == this.v()) : "Unserialized data don't have the right size";
    }

    public boolean a(apq_2 apq_22, aff_1 aff_12) {
        int n;
        int n2 = aff_12.d();
        if (!this.o(n2, n = aff_12.e())) {
            return false;
        }
        byte by = apq_22.X();
        short s2 = aff_12.f();
        if (by == 0) {
            if (apq_22 instanceof ti_0) {
                this.b((ti_0)((Object)apq_22));
            }
            boolean bl = this.a(n2, n, s2);
            if (apq_22 instanceof ti_0) {
                this.j();
            }
            return !bl;
        }
        if (apq_22 instanceof ti_0) {
            this.b((ti_0)((Object)apq_22));
        }
        for (int k = n2 - by; k <= n2 + by; ++k) {
            for (int i2 = n - by; i2 <= n + by; ++i2) {
                if (this.o(n2, n) && !this.a(k, i2, s2)) continue;
                if (apq_22 instanceof ti_0) {
                    this.j();
                }
                return false;
            }
        }
        if (apq_22 instanceof ti_0) {
            this.b((ti_0)((Object)apq_22));
        }
        return true;
    }

    public String toString() {
        return "boundingBox={(" + this.z + ", " + this.A + ") => (" + this.B + ", " + this.C + ")}, numCells=" + this.b + ", width=" + this.D + ", height=" + this.E + ", center=(" + this.d + ", " + this.e + ", " + this.f + ")";
    }

    @Override
    protected int m(int n, int n2) {
        int n3 = this.y.size();
        for (int k = 0; k < n3; ++k) {
            yv_0 yv_02 = ((yx_0)this.y.get(k)).a();
            int n4 = yv_02.d;
            int n5 = yv_02.e;
            if (n < n4 || n >= n4 + 18 || n2 < n5 || n2 >= n5 + 18) continue;
            return k;
        }
        return -1;
    }

    public void a(yx_0 yx_02) {
        this.y.add(yx_02);
    }

    public aff_1 w() {
        this.G();
        int[] nArray = this.Q.get(Hw.a(this.Q.size()));
        return new aff_1(nArray);
    }

    private void G() {
        if (this.Q != null) {
            return;
        }
        this.Q = new ArrayList<int[]>();
        for (int k = 0; k < this.a.length; ++k) {
            if (!this.i(k)) continue;
            int n = k % this.D + this.z;
            int n2 = k / this.D + this.A;
            this.Q.add(new int[]{n, n2});
        }
    }

    public List<int[]> x() {
        this.G();
        return new ArrayList<int[]>(this.Q);
    }

    public void y() {
        for (int k = 0; k < this.a.length; ++k) {
            short s2 = this.a[k];
            if ((s2 & 0x80) == 0) continue;
            int n = k;
            this.a[n] = (short)(this.a[n] | 0x200);
        }
    }

    static {
        for (int k = 0; k < w.length; ++k) {
            tg_0.w[k] = new ys_0();
        }
    }
}

