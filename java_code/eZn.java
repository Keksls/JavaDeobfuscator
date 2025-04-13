/*
 * Decompiled with CFR 0.152.
 */
public class eZn
implements eZk {
    private final int a;
    private final short b;
    private final short c;
    private final short d;
    private final double e;
    private final int f;
    private final apc_2 g;
    private boolean h;
    private boolean i;
    private short j;
    private long k;

    public eZn(eZk eZk2) {
        this.a = eZk2.a();
        this.b = eZk2.b();
        this.c = eZk2.d();
        this.d = eZk2.e();
        this.e = eZk2.a();
        this.f = eZk2.a();
        this.g = eZk2.i();
    }

    public eZn(int n, short s2, boolean bl) {
        this.a = n;
        this.j = s2;
        this.h = bl;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0.0;
        this.f = 0;
        this.g = null;
    }

    @Override
    public int a() {
        return this.a;
    }

    @Override
    public short b() {
        return this.b;
    }

    @Override
    public short d() {
        return this.c;
    }

    @Override
    public short e() {
        return this.d;
    }

    @Override
    public double c() {
        return this.e;
    }

    @Override
    public int f() {
        return this.f;
    }

    @Override
    public short g() {
        return 0;
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public apc_2 i() {
        return this.g;
    }

    public void a(boolean bl) {
        this.h = bl;
    }

    public boolean j() {
        return this.h;
    }

    public void b(boolean bl) {
        this.i = bl;
    }

    public boolean k() {
        return this.i;
    }

    public void a(short s2) {
        this.j = s2;
    }

    public short l() {
        return this.j;
    }

    public long m() {
        return this.k;
    }

    public void a(long l) {
        this.k = l;
    }
}

