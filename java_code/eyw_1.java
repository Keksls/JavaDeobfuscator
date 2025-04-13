/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eYw
 */
public abstract class eyw_1
implements gr_0 {
    protected final int b;
    protected boolean c;
    protected boolean d;
    protected boolean e;
    protected apc_2 f;
    private boolean a;
    private boolean g;

    protected eyw_1(int n) {
        this.b = n;
    }

    public int j() {
        return this.b;
    }

    public boolean k() {
        return this.g;
    }

    public void a(boolean bl) {
        this.g = bl;
    }

    public void b(boolean bl) {
        this.c = bl;
    }

    public boolean l() {
        return this.c;
    }

    public void c(boolean bl) {
        this.d = bl;
    }

    public boolean m() {
        return this.d;
    }

    public void a(apc_2 apc_22) {
        this.f = apc_22;
    }

    public apc_2 n() {
        return this.f;
    }

    public boolean o() {
        return this.e;
    }

    public void d(boolean bl) {
        this.e = bl;
    }

    public boolean p() {
        return this.a;
    }

    public void e(boolean bl) {
        this.a = bl;
    }

    public abstract eyx_1 f();
}

