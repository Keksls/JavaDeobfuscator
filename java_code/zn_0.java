/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Zn
 */
public abstract class zn_0
implements za_0 {
    public static final int a = -1;
    private int e;
    protected int b = 0;
    protected int c = -1;

    public void f(int n) {
        this.c = n;
    }

    @Override
    public int g() {
        return this.c;
    }

    protected int n() {
        return this.b;
    }

    @Override
    public boolean h() {
        if (this.c == -1) {
            return true;
        }
        return this.b <= this.c + this.e;
    }

    @Override
    public void c(int n) {
        if (this.e > 0) {
            this.e -= n;
            if (this.e <= 0) {
                this.a(true);
            }
        } else {
            this.b += n;
        }
    }

    public void g(int n) {
        assert (n >= 0);
        this.e = n;
        if (this.e > 0) {
            this.a(false);
        }
    }

    public abstract void a(boolean var1);
}

