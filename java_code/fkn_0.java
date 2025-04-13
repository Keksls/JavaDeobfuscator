/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fkn
 */
public class fkn_0 {
    private static final Logger c = Logger.getLogger(fkn_0.class);
    public static final int a = -1;
    private final int d;
    private final enI e = new enI();

    public fkn_0(int n) {
        this.d = n;
    }

    public boolean a(int n, int n2) {
        return this.e.b(n, n2);
    }

    public boolean b(int n, int n2) {
        return this.e.b(n, n2) && !this.e.d(n, n2);
    }

    public final int a(int n, int n2, ys_0[] ys_0Array, int n3) {
        if (!this.b(n, n2)) {
            return -1;
        }
        return this.e.a(n, n2, ys_0Array, n3);
    }

    public int a(int n, int n2, yt_0[] yt_0Array, int n3) {
        if (!this.b(n, n2)) {
            return -1;
        }
        return this.e.a(n, n2, yt_0Array, n3);
    }

    public int d() {
        return this.e.a();
    }

    public int e() {
        return this.e.b();
    }

    public void a(arf_1 arf_12) {
        byte by = arf_12.a();
        this.e.a(arf_12);
    }

    public boolean c(int n, int n2) {
        return this.b(n, n2);
    }

    public int f() {
        return this.d;
    }

    public boolean d(int n, int n2) {
        assert (this.e.b(n, n2));
        return this.e.a(n, n2);
    }

    public boolean e(int n, int n2) {
        assert (this.e.b(n, n2));
        return this.e.d(n, n2) || this.e.e(n, n2);
    }
}

