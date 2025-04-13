/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ajG
 */
public class ajg_0
extends ajf_0 {
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;

    public ajg_0(float f2, float f3, byte by, int n, int n2, int n3, int n4) {
        super(f2, f3, by);
        this.e = n;
        this.f = n2;
        this.h = n3;
        this.g = n4;
        this.i = true;
    }

    public ajg_0(int n, int n2, int n3, int n4) {
        super(0.0f, 0.0f, (byte)1);
        this.g = n4;
        this.e = n;
        this.f = n2;
        this.h = n3;
    }

    public void a(int n) {
        this.g = n;
    }

    public void b(int n) {
        this.h = n;
    }

    public void c(int n) {
        this.e = n;
    }

    public void d(int n) {
        this.f = n;
    }

    @Override
    public int b(int n, int n2) {
        if (this.i) {
            return super.b(n, n2);
        }
        return this.g;
    }

    @Override
    public int c(int n, int n2) {
        if (this.i) {
            return super.c(n, n2);
        }
        return this.e;
    }

    @Override
    public int d(int n, int n2) {
        if (this.i) {
            return super.d(n, n2);
        }
        return this.f;
    }

    @Override
    public int a(int n, int n2) {
        if (this.i) {
            return super.a(n, n2);
        }
        return this.h;
    }

    public void b(boolean bl) {
        this.i = bl;
    }
}

