/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from fnt
 */
public class fnt_0
implements asu_2 {
    protected int a;
    protected HashMap<Integer, Short> b;
    protected HashMap<Short, Short> c;

    public int c() {
        return this.a;
    }

    public HashMap<Integer, Short> d() {
        return this.b;
    }

    public HashMap<Short, Short> e() {
        return this.c;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = null;
        this.c = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        int n;
        this.a = asc_22.f();
        int n2 = asc_22.f();
        this.b = new HashMap(n2);
        for (n = 0; n < n2; ++n) {
            int n3 = asc_22.f();
            short s2 = asc_22.d();
            this.b.put(n3, s2);
        }
        n = asc_22.f();
        this.c = new HashMap(n);
        for (int k = 0; k < n; ++k) {
            short s3 = asc_22.d();
            short s4 = asc_22.d();
            this.c.put(s3, s4);
        }
    }

    @Override
    public final int a() {
        return enK.F.a();
    }
}

