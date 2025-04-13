/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from UX
 */
public class ux_0
implements uw_0 {
    private int b;
    private int c;
    private short d;
    private int e;
    private int f;

    public ux_0(int n) {
        this.a(n);
    }

    @Override
    public void a(int n, int n2, short s2) {
        this.b = n;
        this.c = n2;
        this.d = s2;
    }

    @Override
    public boolean a(int n, int n2) {
        return (this.b - n) * (this.b - n) + (this.c - n2) * (this.c - n2) <= this.f;
    }

    @Override
    public void a() {
        this.a(this.e + 1);
    }

    @Override
    public int b() {
        return (int)Math.ceil((double)this.f * Math.PI);
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

    public void a(int n) {
        this.e = n;
        this.f = n * n;
    }

    public int d() {
        return this.e;
    }

    public short e() {
        return this.d;
    }

    public int f() {
        return this.c;
    }

    public int g() {
        return this.b;
    }
}

