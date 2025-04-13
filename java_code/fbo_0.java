/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.SortedSet;
import java.util.TreeSet;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fbO
 */
public final class fbo_0 {
    private static final fbo_0 b = new fbo_0();
    public static final fbm_0 a = new fbt_0();
    private SortedSet<fbm_0> c = new TreeSet<fbm_0>(new fbp_0(this));
    private fbm_0[] d;
    private int e;
    private int f;

    public static fbo_0 a() {
        return b;
    }

    private fbo_0() {
    }

    @NotNull
    public fbm_0 a(int n) {
        if (this.d == null || this.d.length == 0) {
            return a;
        }
        for (int k = 0; k < this.d.length; ++k) {
            fbm_0 fbm_02 = this.d[k];
            if (n > fbm_02.b()) continue;
            return fbm_02;
        }
        return this.d[this.d.length - 1];
    }

    public fbm_0 a(fbm_0 fbm_02) {
        if (this.d == null || this.d.length == 0) {
            return a;
        }
        for (int k = this.d.length - 1; k >= 0; --k) {
            fbm_0 fbm_03 = this.d[k];
            if (fbm_03.b() >= fbm_02.b()) continue;
            return fbm_03;
        }
        return null;
    }

    public fbm_0 b(fbm_0 fbm_02) {
        if (this.d == null || this.d.length == 0) {
            return a;
        }
        for (int k = 0; k < this.d.length; ++k) {
            fbm_0 fbm_03 = this.d[k];
            if (fbm_02.b() >= fbm_03.b()) continue;
            return fbm_03;
        }
        return null;
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.f;
    }

    public void a(int n, int n2, int n3, String string, String string2, fbs_0[] fbs_0Array) {
        fbn_0 fbn_02 = new fbn_0(n, n2, n3, string, string2, fbs_0Array);
        this.c.add(fbn_02);
    }

    public void d() {
        this.d = new fbm_0[this.c.size()];
        this.c.toArray(this.d);
        this.e = this.c.first().b();
        this.f = this.c.last().b();
        this.c = null;
    }

    void a(SortedSet<fbm_0> sortedSet) {
        if (this.c == null) {
            this.c = sortedSet;
        } else {
            this.c.clear();
            this.c.addAll(sortedSet);
        }
    }

    public fbm_0 b(int n) {
        for (int k = 0; k < this.d.length; ++k) {
            fbm_0 fbm_02 = this.d[k];
            if (fbm_02.e() != n) continue;
            return fbm_02;
        }
        return null;
    }
}

