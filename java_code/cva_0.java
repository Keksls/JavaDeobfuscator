/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cVa
 */
public class cva_0
implements YP {
    private int b;
    private int c;
    private int d;
    private YO e;
    private boolean f;

    cva_0() {
    }

    @Override
    public void d(int n) {
        this.b = n;
    }

    @Override
    public void e(int n) {
        this.c = n;
    }

    public boolean a() {
        return this.f;
    }

    public void a(boolean bl) {
        this.f = bl;
    }

    @Override
    public void f(int n) {
        this.d = n;
    }

    @Override
    public int i() {
        return this.b;
    }

    @Override
    public int j() {
        return this.c;
    }

    @Override
    public int k() {
        return this.d;
    }

    @Override
    public void a(YR yR) {
    }

    @Override
    public void b(YR yR) {
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public float J() {
        return 0.0f;
    }

    @Override
    public float K() {
        return 0.0f;
    }

    @Override
    public float L() {
        return 0.0f;
    }

    @Override
    public int G() {
        return 0;
    }

    @Override
    public int H() {
        return 0;
    }

    @Override
    public short I() {
        return 0;
    }

    @Override
    public int f() {
        return this.e.f();
    }

    @Override
    public String g() {
        return this.e.g();
    }

    @Override
    public azj_2 h() {
        return this.e.h();
    }

    @Override
    public void a(boolean bl, YU yU) {
    }

    @Override
    public void a(YT yT) {
    }

    @Override
    public void b(YT yT) {
    }

    public void a(YO yO) {
        this.e = yO;
    }

    public YO b() {
        return this.e;
    }

    public String toString() {
        return "OverHeadContainer{m_screenX=" + this.b + ", m_screenY=" + this.c + ", m_screenHeight=" + this.d + ", m_overHead=" + this.e + ", m_isDisplayed=" + this.f + "}";
    }
}

