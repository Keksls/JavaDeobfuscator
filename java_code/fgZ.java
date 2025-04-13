/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteIntHashMap
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.map.hash.TByteIntHashMap;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;

public final class fgZ
extends eaa_0
implements Vk<fgY> {
    private int h;
    private eac_0 i;
    private int j;
    private int k = -1;
    private fgY l = fgY.a;
    private int m;
    private int n = -1;
    private int o = -1;
    private int p = -1;
    private fgY q = fgY.a;
    private wt_0 r = wt_0.b();
    private short s;
    private short t;
    private boolean u;
    private short v;
    private short w;
    private final TByteIntHashMap x = new TByteIntHashMap();
    private final TByteIntHashMap y = new TByteIntHashMap();
    private boolean z;
    private final abj_2<Long, Integer> A = new abj_2(30);

    public fgZ(long l, int n) {
        this.a = l;
        this.h = n;
    }

    public fgZ(long l, int n, wu_0 wu_02) {
        this.a = l;
        this.h = n;
        this.r.a(wu_02);
    }

    public fgZ(ByteBuffer byteBuffer) {
        this.a(byteBuffer);
    }

    public eac_0 l() {
        return this.i;
    }

    @Override
    public void a(eac_0 eac_02) {
        this.i = eac_02;
    }

    @Override
    public long a() {
        return this.a;
    }

    @Override
    public String j() {
        return this.f;
    }

    @Override
    public int b() {
        return this.j;
    }

    @Override
    public void a(int n) {
        this.j = n;
    }

    public short m() {
        return this.s;
    }

    @Override
    public void a(short s2) {
        this.s = s2;
    }

    public short n() {
        return this.t <= 0 ? this.s : this.t;
    }

    public short o() {
        return this.t;
    }

    public void b(short s2) {
        this.t = s2;
    }

    @Override
    public short g() {
        return this.i.d();
    }

    @Override
    public long i() {
        return this.i.e();
    }

    public boolean p() {
        return this.u;
    }

    @Override
    public void a(boolean bl) {
        this.u = bl;
    }

    public int q() {
        return this.h;
    }

    public void c(int n) {
        this.h = n;
    }

    @Override
    public String f() {
        return this.i.c();
    }

    @Override
    public eb k() {
        return this.i.g();
    }

    public wt_0 r() {
        return this.r;
    }

    @Override
    public void a(wu_0 wu_02) {
        this.r.a(wu_02);
    }

    @Override
    public void a(long l) {
        Integer n = this.A.b(l);
        if (n == null || n == 0) {
            this.A.a(l, 1);
        } else {
            this.A.a(l, n + 1);
        }
    }

    public int b(long l) {
        Integer n = this.A.a(l);
        return n != null ? n : 0;
    }

    public void s() {
        this.A.a();
    }

    @Override
    public int d() {
        return this.k;
    }

    @Override
    public void b(int n) {
        this.k = n;
    }

    public fgY t() {
        return this.l;
    }

    @Override
    public void a(fgY fgY2) {
        this.l = fgY2;
    }

    public int u() {
        return this.m;
    }

    public void d(int n) {
        this.m = n;
    }

    public int v() {
        return this.n;
    }

    public void e(int n) {
        this.n = n;
    }

    public int w() {
        return this.o;
    }

    public void f(int n) {
        this.o = n;
    }

    public int x() {
        return this.p;
    }

    public void g(int n) {
        this.p = n;
    }

    public fgY y() {
        return this.q;
    }

    public void b(fgY fgY2) {
        this.q = fgY2;
    }

    public void z() {
        this.q = this.l;
        this.n = this.k;
        this.m = this.j;
    }

    @Override
    public byte h() {
        return this.i.f();
    }

    public short A() {
        return this.v;
    }

    public void c(short s2) {
        this.v = s2;
    }

    public short B() {
        return this.w;
    }

    public void d(short s2) {
        this.w = s2;
    }

    public int a(fgX fgX2) {
        return this.y.get(fgX2.a()) + this.x.get(fgX2.a());
    }

    public int b(fgX fgX2) {
        return this.x.get(fgX2.a());
    }

    public int c(fgX fgX2) {
        return this.y.get(fgX2.a());
    }

    public void a(fgX fgX2, int n) {
        this.x.put(fgX2.a(), Hw.a(0, n, new int[0]));
    }

    public void b(fgX fgX2, int n) {
        this.y.put(fgX2.a(), Hw.a(0, n, new int[0]));
    }

    public void d(fgX fgX2) {
        this.x.adjustOrPutValue(fgX2.a(), 1, 1);
    }

    public void e(fgX fgX2) {
        this.y.adjustOrPutValue(fgX2.a(), 1, 1);
    }

    public boolean C() {
        return this.z;
    }

    public void b(boolean bl) {
        this.z = bl;
    }

    public void a(abx_2 abx_22, boolean bl) {
        abx_22.a(this.a);
        abx_22.a(this.h);
        abx_22.a(this.j);
        abx_22.a(this.m);
        abx_22.a(this.s);
        abx_22.a(this.i.d());
        abx_22.a(this.i.e());
        boolean bl2 = bl && this.i.g() != null;
        abx_22.a(bl2);
        if (bl2) {
            byte[] objectArray = this.i.g().toByteArray();
            abx_22.a((short)objectArray.length);
            abx_22.b(objectArray);
        }
        abx_22.a(this.k);
        abx_22.a(this.n);
        abx_22.a(this.l.c());
        abx_22.a(this.q.c());
        abx_22.a(this.i.f());
        abx_22.a(this.v);
        abx_22.a(this.w);
        for (fgX fgX2 : fgX.values()) {
            abx_22.a(this.x.get(fgX2.a()));
        }
        for (fgX fgX2 : fgX.values()) {
            abx_22.a(this.y.get(fgX2.a()));
        }
        byte[] byArray = Cz.a(this.i.c());
        abx_22.a(byArray.length);
        abx_22.b(byArray);
        abx_22.a(this.r.h());
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getLong();
        this.i = new eac_0(this.a);
        this.h = byteBuffer.getInt();
        this.j = byteBuffer.getInt();
        this.m = byteBuffer.getInt();
        this.s = byteBuffer.getShort();
        this.i.a(byteBuffer.getShort());
        this.i.b(byteBuffer.getLong());
        if (byteBuffer.get() != 0) {
            byte[] objectArray = new byte[byteBuffer.getShort()];
            byteBuffer.get(objectArray);
            this.i.a(fgZ.a(objectArray));
        }
        this.k = byteBuffer.getInt();
        this.n = byteBuffer.getInt();
        this.l = fgY.a(byteBuffer.get());
        this.q = fgY.a(byteBuffer.get());
        this.i.a(byteBuffer.get());
        this.v = byteBuffer.getShort();
        this.w = byteBuffer.getShort();
        for (fgX fgX2 : fgX.values()) {
            this.x.put(fgX2.a(), byteBuffer.getInt());
        }
        for (fgX fgX2 : fgX.values()) {
            this.y.put(fgX2.a(), byteBuffer.getInt());
        }
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        this.i.a(Cz.a(byArray));
        this.r = wt_0.b(byteBuffer.getLong());
    }

    public int a(@NotNull Vk<fgY> vk) {
        if (vk.b() > this.j) {
            return 1;
        }
        if (vk.b() < this.j) {
            return -1;
        }
        return this.r.f(vk.e());
    }

    public String toString() {
        return "PvpLadderEntry{m_id=" + this.a + ", m_nationId=" + this.h + ", m_strength=" + this.j + ", m_level=" + this.s + ", m_breedId=" + this.c + ", m_canGainPvpPoints=" + this.u + ", m_name='" + this.b + "', m_guildId=" + this.e + ", m_fightOccurences=" + this.A + "}";
    }

    @Override
    public /* synthetic */ wu_0 e() {
        return this.r();
    }

    @Override
    public /* synthetic */ Vi c() {
        return this.t();
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((Vk)object);
    }
}

