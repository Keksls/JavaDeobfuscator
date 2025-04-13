/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;
import java.util.Set;

public class eZu {
    private final Set<exh_2> a = new HashSet<exh_2>();
    private tc_0 b;
    private int[] c;
    private int[] d;
    private boolean e = false;

    public eZu a(boolean bl) {
        this.e = bl;
        return this;
    }

    public eZu a(tc_0 tc_02) {
        this.b = tc_02;
        return this;
    }

    public eZu a(exh_2 exh_22) {
        this.a.add(exh_22);
        return this;
    }

    public eZu a(int[] nArray) {
        this.c = nArray;
        return this;
    }

    public eZu b(int[] nArray) {
        this.d = nArray;
        return this;
    }

    public boolean a() {
        return this.e;
    }

    public boolean b(exh_2 exh_22) {
        return this.a.contains(exh_22);
    }

    public Set<exh_2> b() {
        return this.a;
    }

    public tc_0 c() {
        return this.b;
    }

    public int d() {
        return this.c.length;
    }

    public int a(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Invalid level : " + n);
        }
        if (n - 1 >= this.c.length) {
            return 0;
        }
        return this.c[n - 1];
    }

    public short b(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Invalid amount : " + n);
        }
        if (this.c.length <= 0) {
            return -1;
        }
        if (this.c[0] > n) {
            return 0;
        }
        int n2 = 0;
        for (int k = 0; k < this.c.length; ++k) {
            if ((n2 += this.c[k]) < n) continue;
            return (short)(k + 1);
        }
        return -1;
    }

    public int[] e() {
        return this.d;
    }

    public int c(int n) {
        if (n < 0 || n >= this.d.length) {
            return -1;
        }
        return this.d[n];
    }
}

