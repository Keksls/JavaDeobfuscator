/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TObjectIntHashMap
 *  gnu.trove.procedure.TIntProcedure
 */
import gnu.trove.map.hash.TObjectIntHashMap;
import gnu.trove.procedure.TIntProcedure;

/*
 * Renamed from ffY
 */
public abstract class ffy_0
implements fge {
    protected final int a;
    protected final int b;
    protected final int c;
    protected final short d;
    protected final short e;
    protected final acv_1 f = new acv_1();
    protected final fgi g;
    private final TObjectIntHashMap<ffz_0> h = new TObjectIntHashMap();

    ffy_0(int n, int n2, int n3, long l, long l2, byte by, short s2, short s3) {
        this.a = n;
        this.b = n2;
        this.c = n3;
        this.g = new fgi(l, l2, by);
        this.d = s2;
        this.e = s3;
    }

    @Override
    public void a(ffz_0 ffz_02, int n) {
        this.h.put((Object)ffz_02, n);
    }

    @Override
    public int a(ffz_0 ffz_02) {
        return this.h.get((Object)ffz_02);
    }

    @Override
    public void a(int n, int n2) {
        this.f.a(n, n2);
    }

    @Override
    public boolean a(int n) {
        return this.f.d(n);
    }

    @Override
    public void a(int n, boolean bl) {
        this.g.a(n, bl);
    }

    @Override
    public boolean b(int n) {
        return this.g.a(n);
    }

    @Override
    public void a(TIntProcedure tIntProcedure) {
        this.g.a(tIntProcedure);
    }

    @Override
    public int a(short s2) {
        return Math.min(this.e, s2) * this.d;
    }

    @Override
    public int[] a() {
        return this.f.f();
    }

    @Override
    public int c(int n) {
        return this.f.g(n);
    }

    @Override
    public int b() {
        return this.a;
    }

    @Override
    public int c() {
        return this.b;
    }

    @Override
    public int d() {
        return this.c;
    }

    @Override
    public wx_0 e() {
        return this.g.a();
    }

    @Override
    public wx_0 f() {
        return this.g.b();
    }

    @Override
    public byte g() {
        return this.g.c();
    }

    @Override
    public short h() {
        return this.d;
    }

    @Override
    public short i() {
        return this.e;
    }
}

