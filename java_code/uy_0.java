/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from UY
 */
public class uy_0
implements uw_0 {
    private int b;
    private int c;
    private short d;
    private float e;
    private float f;
    private float g;

    public uy_0(int n, int n2) {
        this.b(n, n2);
    }

    @Override
    public void a(int n, int n2, short s2) {
        this.b = n;
        this.c = n2;
        this.d = s2;
    }

    @Override
    public boolean a(int n, int n2) {
        if ((float)(n -= this.b) <= -this.e / 2.0f || (float)n > this.e / 2.0f) {
            return false;
        }
        return !((float)(n2 -= this.c) <= -this.f / 2.0f) && !((float)n2 > this.f / 2.0f);
    }

    @Override
    public void a() {
        this.e += 1.0f;
        this.f += this.g;
    }

    @Override
    public int b() {
        return (int)this.e * (int)this.f;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public ArrayList<aff_1> b(int n, int n2, short s2) {
        assert (false) : "Use flood fill algorithm to fill the shape";
        return null;
    }

    public void b(int n, int n2) {
        assert (n >= 1);
        assert (n2 >= 1);
        this.e = n;
        this.f = n2;
        this.g = this.f / this.e;
    }

    public int d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public short f() {
        return this.d;
    }

    public int g() {
        return (int)this.e;
    }

    public int h() {
        return (int)this.f;
    }
}

