/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from SR
 */
public abstract class sr_0<FX extends Sl, P extends st_0>
implements sq_0,
sz_0,
Sm<FX>,
Su,
ti_0,
abo_1,
app_2 {
    protected static final Logger a = Logger.getLogger(sr_0.class);
    public static final int b = 45;
    protected BitSet c;
    protected BitSet d;
    protected abc_2<FX> e;
    protected long f;
    protected long g;
    private byte w = (byte)-1;
    protected final aff_1 h = new aff_1();
    protected aqd_1 i;
    protected So j;
    protected ObjectPool k;
    protected Su l;
    protected int m;
    protected final ArrayList<apq_2> n = new ArrayList();
    protected float[] o;
    private su_0 x;
    protected int p;
    protected float[] q;
    protected boolean r = false;
    protected boolean s = false;
    protected boolean t = true;
    protected boolean u = false;
    private boolean y = true;
    private boolean z = true;
    protected Iterable<int[]> v;
    private int A;
    private boolean B = false;
    private boolean C = false;

    protected sr_0() {
    }

    public int x() {
        return 8;
    }

    @Override
    public void a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a(byteBuffer);
    }

    public void a(ByteBuffer byteBuffer) {
        long l = byteBuffer.getLong();
        if (this.j != null && l != 0L) {
            this.d(this.j.f().f_(l));
        } else {
            a.error((Object)"contexte non initialis\u00e9");
        }
    }

    @Override
    public byte[] i() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(this.x());
        byteBuffer.putLong(this.l != null ? this.l.a_() : 0L);
        return byteBuffer.array();
    }

    public sr_0(int n, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        this.onCheckOut();
        this.f = n;
        this.i = aqd_12;
        this.c = bitSet;
        this.d = bitSet2;
        this.m = n2;
        this.p = n3;
        this.o = fArray;
        this.q = fArray2;
        this.r = bl;
        this.t = bl2;
        this.A = n4;
    }

    public sr_0 a(P p2) {
        sr_0 sr_02 = this.y();
        sr_02.i = this.i;
        sr_02.c = this.c;
        sr_02.d = this.d;
        sr_02.e = this.e;
        sr_02.f = this.f;
        sr_02.m = this.m;
        sr_02.o = this.o;
        sr_02.p = this.p;
        sr_02.q = this.q;
        sr_02.r = this.r;
        sr_02.s = this.s;
        sr_02.y = this.y;
        sr_02.t = this.t;
        sr_02.A = this.A;
        if (p2 != null) {
            sr_02.g = ((st_0)p2).a();
            sr_02.a(((st_0)p2).b(), ((st_0)p2).c(), ((st_0)p2).d());
            sr_02.j = ((st_0)p2).e();
            sr_02.d(((st_0)p2).f());
        }
        sr_02.n.clear();
        return sr_02;
    }

    protected abstract sr_0 y();

    @Override
    public abstract int w();

    @Override
    public void onCheckOut() {
        this.e = new abc_2();
        this.g = 0L;
        this.h.b(0);
        this.h.c(0);
        this.h.a((short)0);
        this.i = null;
        this.j = null;
        this.l = null;
        this.m = 0;
        this.x = null;
        this.u = false;
        this.n.clear();
        this.B = false;
        this.A = -1;
        this.w = (byte)-1;
    }

    @Override
    public void onCheckIn() {
        this.e = null;
        this.g = 0L;
        this.h.b(0);
        this.h.c(0);
        this.h.a((short)0);
        this.i = null;
        this.j = null;
        this.l = null;
        this.m = 0;
        this.x = null;
        this.u = false;
        this.n.clear();
        this.v = null;
        this.A = -1;
    }

    public void z() {
        if (this.k != null) {
            try {
                this.k.returnObject((Object)this);
            }
            catch (Exception exception) {
                a.error((Object)"impossible");
            }
            this.k = null;
        } else {
            this.onCheckIn();
        }
    }

    public long A() {
        return this.f;
    }

    public void a(su_0 su_02) {
        this.x = su_02;
    }

    public abc_2<FX> B() {
        return this.e;
    }

    public abstract boolean C();

    public abstract boolean D();

    protected byte E() {
        return 1;
    }

    @Override
    public boolean a(BitSet bitSet, sd_0 sd_02, byte by) {
        if (this.x_() != null) {
            this.x_().a(bitSet, sd_02, by);
        }
        if (sd_02 == null) {
            return false;
        }
        byte by2 = this.E();
        if (by == by2) {
            aff_1 aff_12;
            boolean bl = true;
            if (sd_02.f() == null && !this.h.equals(aff_12 = sd_02.j())) {
                bl = false;
            }
            if (bl && this.a(bitSet, (apq_2)sd_02.h())) {
                this.a(bitSet, sd_02, (apq_2)sd_02.h());
                return true;
            }
        }
        return false;
    }

    @Override
    public Su v() {
        return this.l;
    }

    @Override
    public rs_0 b(ru_0 ru_02) {
        return null;
    }

    @Override
    public boolean a(ru_0 ru_02) {
        return false;
    }

    @Override
    public int c(ru_0 ru_02) {
        rs_0 rs_02 = this.b(ru_02);
        if (rs_02 != null) {
            return rs_02.a();
        }
        throw new UnsupportedOperationException("caract\u00e9ristique inexistante " + ru_02);
    }

    @Override
    public aej_2 F() {
        return this.l == null ? aej_2.h : this.l.F();
    }

    @Override
    public void a(aej_2 aej_22) {
    }

    @Override
    public aej_2 j() {
        return null;
    }

    @Override
    public void b(aej_2 aej_22) {
    }

    @Override
    public uo_0 k() {
        return null;
    }

    @Override
    public boolean m() {
        return this.m == 0 && !this.B;
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public boolean F_() {
        return true;
    }

    @Override
    public long a_() {
        return this.g;
    }

    @Override
    public long aS_() {
        return this.g;
    }

    @Override
    public int G() {
        return this.h.d();
    }

    @Override
    public int H() {
        return this.h.e();
    }

    @Override
    public short I() {
        return this.h.f();
    }

    @Override
    public float J() {
        return this.h.d();
    }

    @Override
    public float K() {
        return this.h.e();
    }

    @Override
    public float L() {
        return this.h.f();
    }

    public int M() {
        return this.A;
    }

    @Override
    public void a(int n, int n2, short s2) {
        this.h.b(n);
        this.h.c(n2);
        this.h.a(s2);
        if (this.x != null) {
            this.x.d(this);
        }
    }

    @Override
    public final void a(aff_1 aff_12) {
        this.a(aff_12.d(), aff_12.e(), aff_12.f());
    }

    public boolean N() {
        return true;
    }

    public So O() {
        return this.j;
    }

    @Override
    public void b(int n, int n2, short s2) {
        throw new UnsupportedOperationException("Teleport de BasicEffectArea non impl\u00e9ment\u00e9");
    }

    public void b(aff_1 aff_12) {
        throw new UnsupportedOperationException("Teleport de BasicEffectArea non impl\u00e9ment\u00e9");
    }

    @Override
    public int G_() {
        return 3;
    }

    public void a(FX FX) {
        this.e.a(FX);
    }

    public void a(FX[] FXArray) {
        this.e.a(FXArray);
    }

    @Override
    @NotNull
    public Iterator<FX> iterator() {
        return this.e.iterator();
    }

    public void a(aqd_1 aqd_12) {
        this.i = aqd_12;
    }

    public aqd_1 P() {
        return this.i;
    }

    public void a(ObjectPool objectPool) {
        this.k = objectPool;
    }

    public boolean c(aff_1 aff_12) {
        if (aff_12 == null) {
            return false;
        }
        return this.c(aff_12.d(), aff_12.e(), aff_12.f());
    }

    public boolean c(int n, int n2, short s2) {
        if (this.i != null) {
            if (this.v != null) {
                for (int[] nArray : this.v) {
                    if (nArray[0] != n || nArray[1] != n2) continue;
                    return true;
                }
                return false;
            }
            return this.i.a(this.G(), this.H(), this.I(), this.G(), this.H(), this.I(), n, n2, s2);
        }
        a.error((Object)("m_area is null for area " + this), new Throwable());
        return false;
    }

    public boolean a(Su su, int n, int n2, short s2) {
        if (this.c(n, n2, s2)) {
            return true;
        }
        int n3 = su.X();
        if (n3 == 0) {
            return false;
        }
        for (int k = -n3; k <= n3; ++k) {
            for (int i2 = -n3; i2 <= n3; ++i2) {
                if (!this.c(n + k, n2 + i2, s2)) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public void a(Su su) {
        this.b((apq_2)null);
        this.n();
        this.u = true;
    }

    @Override
    public void b(Su su) {
    }

    public boolean a(int n, apq_2 apq_22) {
        BitSet bitSet = new BitSet();
        bitSet.set(n);
        return this.a(bitSet, apq_22);
    }

    public boolean b_(int n) {
        return this.c.get(n);
    }

    public boolean a(BitSet bitSet, apq_2 apq_22) {
        if (this.c.intersects(bitSet)) {
            return true;
        }
        return this.d.intersects(bitSet);
    }

    public void a(int n, sd_0 sd_02, apq_2 apq_22) {
        BitSet bitSet = new BitSet();
        bitSet.set(n);
        this.a(bitSet, sd_02, apq_22);
    }

    @Deprecated
    public void b(BitSet bitSet, apq_2 apq_22) {
        this.a(bitSet, null, apq_22);
    }

    public void a(BitSet bitSet, @Nullable sd_0 sd_02, apq_2 apq_22) {
        if (this.c.intersects(bitSet)) {
            this.a(sd_02, apq_22);
        }
        if (this.d.intersects(bitSet)) {
            this.g(apq_22);
        }
    }

    public boolean b(int n) {
        BitSet bitSet = new BitSet();
        bitSet.set(n);
        return this.c.intersects(bitSet) || this.d.intersects(bitSet);
    }

    public void a(apq_2 apq_22) {
        if (apq_22 != null) {
            this.n.remove(apq_22);
        }
        this.j(apq_22);
    }

    public void b(apq_2 apq_22) {
        if (apq_22 != null && !this.n.contains(apq_22)) {
            this.n.add(apq_22);
        }
        this.k(apq_22);
    }

    public void b(boolean bl) {
        this.y = bl;
    }

    protected boolean Q() {
        return this.y;
    }

    public boolean R() {
        return this.t;
    }

    public boolean a(@Nullable sd_0 sd_02, apq_2 apq_22) {
        if (this.e(apq_22) && this.m != 0 && !this.B) {
            if (this.D()) {
                this.b(apq_22);
                this.f(apq_22);
            }
            this.h(apq_22);
            if (this.Q()) {
                if (!this.C() && this.m > 0) {
                    --this.m;
                }
                if (this.x != null) {
                    try {
                        this.x.c(this, apq_22);
                    }
                    catch (Exception exception) {
                        a.error((Object)"Exception levee", (Throwable)exception);
                    }
                }
                long[] lArray = this.c(apq_22);
                this.B = true;
                if (lArray != null) {
                    for (int k = lArray.length - 1; k >= 0; --k) {
                        long l = lArray[k];
                        try {
                            this.a(apb_2.b(l), apb_2.c(l), apb_2.d(l), sd_02);
                            continue;
                        }
                        catch (Exception exception) {
                            a.error((Object)"Exception levee lors de l'execution des effets d'une zone", (Throwable)exception);
                        }
                    }
                }
                this.B = false;
            }
            if (this.x != null) {
                try {
                    this.x.c(this);
                }
                catch (Exception exception) {
                    a.error((Object)"Exception levee", (Throwable)exception);
                }
            }
            return true;
        }
        return false;
    }

    public abstract long[] c(apq_2 var1);

    public abstract List<apq_2> d(apq_2 var1);

    public abstract void a(int var1, int var2, short var3, sd_0 var4);

    public abstract boolean e(apq_2 var1);

    public abstract void f(apq_2 var1);

    public float c(int n) {
        if (this.q == null || n >= this.q.length) {
            a.error((Object)("appel d'un param\u00e8tre inexistant : " + n));
            return -1.0f;
        }
        return this.q[n];
    }

    public int S() {
        if (this.q == null) {
            return 0;
        }
        return this.q.length;
    }

    public void g(apq_2 apq_22) {
        List<apq_2> list = this.d(apq_22);
        if (list == null) {
            return;
        }
        for (apq_2 apq_23 : list) {
            if (apq_23 != null && apq_23 instanceof Su && ((Su)apq_23).x_() != null) {
                ((Su)apq_23).x_().a(this, true);
            }
            this.i(apq_23);
        }
    }

    @Override
    public boolean a(rx_0 rx_02) {
        return false;
    }

    @Override
    public void c(rx_0 rx_02) {
    }

    @Override
    public byte b(rx_0 rx_02) {
        return 0;
    }

    @Override
    public void a(rx_0 rx_02, byte by) {
    }

    @Override
    public void d(rx_0 rx_02) {
    }

    @Override
    public void e(rx_0 rx_02) {
    }

    @Override
    public boolean o() {
        return !this.u;
    }

    @Override
    public boolean p() {
        return this.u;
    }

    @Override
    public void n() {
    }

    @Override
    public boolean ax_() {
        return this.p();
    }

    @Override
    public boolean t() {
        return this.p();
    }

    @Override
    public void s() {
    }

    @Override
    public void q() {
    }

    @Override
    public void c(Su su) {
    }

    public void h(apq_2 apq_22) {
        this.x.a(this, apq_22);
    }

    public void i(apq_2 apq_22) {
        if (this.x != null) {
            this.x.b(this, apq_22);
        } else {
            a.warn((Object)"Can't call listener, can be a problem ?");
        }
    }

    public void j(apq_2 apq_22) {
    }

    public void k(apq_2 apq_22) {
    }

    public void T() {
    }

    public void U() {
    }

    public boolean V() {
        return false;
    }

    @Override
    public byte W() {
        return 0;
    }

    @Override
    public byte X() {
        return 0;
    }

    @Override
    public boolean u() {
        return !this.C;
    }

    @Override
    public void a(boolean bl) {
        this.C = bl;
    }

    @Override
    public byte Y() {
        if (this.l != null) {
            return ((app_2)((Object)this.l)).Y();
        }
        return 0;
    }

    @Override
    public byte Z() {
        return this.w;
    }

    @Override
    public void a(byte by) {
        this.w = by;
    }

    protected void d(Su su) {
        this.l = su;
    }

    @Override
    public boolean aa() {
        return false;
    }

    @Override
    public boolean ab() {
        return false;
    }

    @Override
    public boolean ac() {
        return false;
    }

    public boolean ad() {
        return this.r;
    }

    public boolean ae() {
        return this.s;
    }

    public void c(boolean bl) {
        this.s = bl;
    }

    public void af() {
        int n = this.ag();
        int n2 = this.ah();
        short s2 = this.ai();
        aej_2 aej_22 = this.F();
        this.v = this.i.a(this.h.d(), this.h.e(), this.h.f(), n, n2, s2, aej_22);
    }

    public int ag() {
        return this.l == null ? this.h.d() : this.l.G();
    }

    public int ah() {
        return this.l == null ? this.h.e() : this.l.H();
    }

    public short ai() {
        return this.l == null ? this.h.f() : this.l.I();
    }

    public Iterable<int[]> K_() {
        return this.v;
    }

    public boolean H_() {
        return this.z;
    }

    public void d(boolean bl) {
        this.z = bl;
    }

    public boolean al() {
        return true;
    }

    @Override
    public aff_1 P_() {
        return this.h;
    }

    @Override
    public sr_0 am() {
        return this;
    }

    public String toString() {
        return "BasicEffectArea{m_baseId=" + this.f + ", m_id=" + this.g + ", m_obstacleId=" + this.w + ", m_position=" + this.h + "}";
    }
}

