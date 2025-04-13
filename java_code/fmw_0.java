/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from fmw
 */
public class fmw_0
implements asu_2 {
    protected short a;
    protected HashMap<Integer, fmx_0[]> b;

    public short c() {
        return this.a;
    }

    public HashMap<Integer, fmx_0[]> d() {
        return this.b;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.d();
        int n = asc_22.f();
        this.b = new HashMap(n);
        for (int k = 0; k < n; ++k) {
            int n2 = asc_22.f();
            int n3 = asc_22.f();
            fmx_0[] fmx_0Array = new fmx_0[n3];
            for (int i2 = 0; i2 < n3; ++i2) {
                fmx_0Array[i2] = new fmx_0();
                fmx_0Array[i2].a(asc_22);
            }
            this.b.put(n2, fmx_0Array);
        }
    }

    @Override
    public final int a() {
        return enK.k.a();
    }
}

