/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aGx
 */
public abstract class agx_2
implements abo_1 {
    private agw_2 a = null;
    private int b = 0;
    private boolean c = false;
    private boolean d = true;
    private final Object e = new Object();
    private int f;

    protected agx_2() {
    }

    public agw_2 a() {
        return this.a;
    }

    public void a(agw_2 agw_22) {
        this.a = agw_22;
    }

    public int b() {
        return this.b;
    }

    public void a(int n) {
        this.b = n;
    }

    public boolean c() {
        return this.c;
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    public Object d() {
        return this.e;
    }

    public int e() {
        return this.f;
    }

    public void b(int n) {
        this.f = n;
    }

    public boolean f() {
        return true;
    }

    public boolean g() {
        return this.d;
    }

    public void b(boolean bl) {
        this.d = bl;
    }

    private void h() {
        this.a = null;
        this.b = 0;
        this.c = true;
        this.d = true;
        this.f = -1;
    }

    @Override
    public void onCheckOut() {
        this.h();
    }

    @Override
    public void onCheckIn() {
        this.h();
    }
}

