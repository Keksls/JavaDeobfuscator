/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from Yy
 */
public class yy_0 {
    protected final ArrayList<yx_0> y = new ArrayList();
    protected int z;
    protected int A;
    protected int B;
    protected int C;
    protected int D;
    protected int E;

    public yy_0() {
        this.F();
    }

    public yv_0 n(int n, int n2) {
        if (n < this.z || n >= this.z + this.D) {
            return null;
        }
        if (n2 < this.A || n2 >= this.A + this.E) {
            return null;
        }
        yx_0 yx_02 = this.p(n, n2);
        if (yx_02 != null) {
            return yx_02.a();
        }
        return null;
    }

    public boolean o(int n, int n2) {
        return n >= this.z && n < this.z + this.D && n2 >= this.A && n2 < this.A + this.E;
    }

    public yx_0 p(int n, int n2) {
        int n3 = this.m(n, n2);
        if (n3 < 0 || n3 >= this.y.size()) {
            return null;
        }
        return this.y.get(n3);
    }

    public boolean a(int n, int n2, short s2) {
        yx_0 yx_02 = this.p(n, n2);
        return yx_02 == null || yx_02.a(n, n2, s2);
    }

    public boolean b(int n, int n2, short s2) {
        yx_0 yx_02 = this.p(n, n2);
        return yx_02 == null || yx_02.a(n, n2, s2);
    }

    public int z() {
        return this.z;
    }

    public int A() {
        return this.A;
    }

    public int B() {
        return this.D;
    }

    public int C() {
        return this.E;
    }

    public int D() {
        return this.z() + this.B() - 1;
    }

    public int E() {
        return this.A() + this.C() - 1;
    }

    public void F() {
        this.y.clear();
        this.z = Integer.MAX_VALUE;
        this.A = Integer.MAX_VALUE;
        this.B = Integer.MIN_VALUE;
        this.C = Integer.MIN_VALUE;
        this.D = 0;
        this.E = 0;
    }

    public void a(yx_0 yx_02, int n, int n2) {
        this.y.add(yx_02);
        n2 *= 18;
        if ((n *= 18) < this.z) {
            this.z = n;
        }
        if (n > this.B) {
            this.B = n;
        }
        if (n2 < this.A) {
            this.A = n2;
        }
        if (n2 > this.C) {
            this.C = n2;
        }
        this.D = 18 + this.B - this.z;
        this.E = 18 + this.C - this.A;
        assert (this.y.size() < 100) : "C'est pas un peu abus\u00e9, comme taille : " + this.y.size() + " ?????";
        assert (this.m(n, n2) == this.y.size() - 1) : " Map ajout\u00e9e non valide. index : " + this.m(n, n2) + " attendu : " + (this.y.size() - 1);
    }

    protected int m(int n, int n2) {
        if (n < this.z) {
            return -1;
        }
        if (n2 < this.A) {
            return -1;
        }
        int n3 = (n - this.z) / 18;
        int n4 = (n2 - this.A) / 18;
        assert (n3 >= 0);
        assert (n4 >= 0);
        return n4 * (this.D / 18) + n3;
    }
}

