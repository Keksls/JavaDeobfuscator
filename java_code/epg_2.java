/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from epG
 */
public abstract class epg_2<C extends epq_2>
implements eqi_2<C> {
    protected boolean a;
    protected boolean b;
    protected boolean c;
    protected final uo_0 d = new uo_0();
    private boolean f;
    private boolean g;
    private boolean h;
    private eqy_1 i;
    private vw_0 j;
    private byte k = (byte)-1;
    private boolean l;
    private boolean m;
    private final fia_0 n = new fia_0();

    @Override
    public boolean a() {
        return !this.b && this.a && !this.f;
    }

    @Override
    public boolean b() {
        return this.a;
    }

    @Override
    public void a(boolean bl) {
        this.a = bl;
    }

    @Override
    public boolean c() {
        return this.b;
    }

    @Override
    public void b(boolean bl) {
        this.b = bl;
    }

    @Override
    public boolean d() {
        return this.c;
    }

    @Override
    public void c(boolean bl) {
        this.c = bl;
    }

    @Override
    public boolean e() {
        return this.f;
    }

    @Override
    public void d(boolean bl) {
        this.f = bl;
    }

    @Override
    public uo_0 f() {
        return this.d;
    }

    @Override
    public void a(eqy_1 eqy_12) {
        this.i = eqy_12;
    }

    @Override
    public eqy_1 g() {
        return this.i;
    }

    @Override
    public void e(boolean bl) {
        this.h = bl;
    }

    @Override
    public boolean h() {
        return this.h;
    }

    @Override
    public void f(boolean bl) {
        if (this.i != null) {
            this.i.a(bl);
        }
    }

    @Override
    public boolean i() {
        return this.i != null && this.i.p();
    }

    @Override
    public byte j() {
        return this.k;
    }

    @Override
    public void a(byte by) {
        this.k = by;
    }

    @Override
    public boolean k() {
        return this.g;
    }

    @Override
    public void g(boolean bl) {
        this.g = bl;
    }

    @Override
    public boolean l() {
        return this.l;
    }

    @Override
    public void h(boolean bl) {
        this.l = bl;
    }

    @Override
    public fia_0 m() {
        return this.n;
    }

    @Override
    public boolean n() {
        return this.m;
    }

    @Override
    public void i(boolean bl) {
        this.m = bl;
    }

    @Override
    public vw_0 o() {
        return this.j;
    }

    @Override
    public void a(vw_0 vw_02) {
        this.j = vw_02;
    }
}

