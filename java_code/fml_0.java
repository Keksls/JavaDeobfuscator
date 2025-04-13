/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from fml
 */
public class fml_0
implements asu_2 {
    protected int a;
    protected fmm[] b;
    protected fmm[] c;
    protected HashMap<Short, Byte> d;
    protected HashMap<Short, Byte> e;

    public int c() {
        return this.a;
    }

    public fmm[] d() {
        return this.b;
    }

    public fmm[] e() {
        return this.c;
    }

    public HashMap<Short, Byte> f() {
        return this.d;
    }

    public HashMap<Short, Byte> g() {
        return this.e;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        int n;
        int n2;
        int n3;
        this.a = asc_22.f();
        int n4 = asc_22.f();
        this.b = new fmm[n4];
        for (n3 = 0; n3 < n4; ++n3) {
            this.b[n3] = new fmm();
            this.b[n3].a(asc_22);
        }
        n3 = asc_22.f();
        this.c = new fmm[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.c[n2] = new fmm();
            this.c[n2].a(asc_22);
        }
        n2 = asc_22.f();
        this.d = new HashMap(n2);
        for (n = 0; n < n2; ++n) {
            short s2 = asc_22.d();
            byte by = asc_22.b();
            this.d.put(s2, by);
        }
        n = asc_22.f();
        this.e = new HashMap(n);
        for (int k = 0; k < n; ++k) {
            short s3 = asc_22.d();
            byte by = asc_22.b();
            this.e.put(s3, by);
        }
    }

    @Override
    public final int a() {
        return enK.bj.a();
    }
}

