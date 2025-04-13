/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from aQA
 */
public class aqa_0
implements asu_2 {
    protected int a;
    protected aqb_0[] b;
    protected aqb_0[] c;
    protected aqc_0 d;
    protected aqc_0 e;
    protected HashMap<Short, Byte> f;
    protected HashMap<Short, Byte> g;

    public int c() {
        return this.a;
    }

    public aqb_0[] d() {
        return this.b;
    }

    public aqb_0[] e() {
        return this.c;
    }

    public aqc_0 f() {
        return this.d;
    }

    public aqc_0 g() {
        return this.e;
    }

    public HashMap<Short, Byte> h() {
        return this.f;
    }

    public HashMap<Short, Byte> i() {
        return this.g;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        int n;
        int n2;
        int n3;
        this.a = asc_22.f();
        int n4 = asc_22.f();
        this.b = new aqb_0[n4];
        for (n3 = 0; n3 < n4; ++n3) {
            this.b[n3] = new aqb_0();
            this.b[n3].a(asc_22);
        }
        n3 = asc_22.f();
        this.c = new aqb_0[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.c[n2] = new aqb_0();
            this.c[n2].a(asc_22);
        }
        this.d = new aqc_0();
        this.d.a(asc_22);
        this.e = new aqc_0();
        this.e.a(asc_22);
        n2 = asc_22.f();
        this.f = new HashMap(n2);
        for (n = 0; n < n2; ++n) {
            short s2 = asc_22.d();
            byte by = asc_22.b();
            this.f.put(s2, by);
        }
        n = asc_22.f();
        this.g = new HashMap(n);
        for (int k = 0; k < n; ++k) {
            short s3 = asc_22.d();
            byte by = asc_22.b();
            this.g.put(s3, by);
        }
    }

    @Override
    public final int a() {
        return enK.bj.a();
    }
}

