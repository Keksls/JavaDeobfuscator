/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from fov
 */
public class fov_0
implements asu_2 {
    protected int a;
    protected int b;
    protected HashMap<Integer, Float> c;

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public HashMap<Integer, Float> e() {
        return this.c;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.f();
        int n = asc_22.f();
        this.c = new HashMap(n);
        for (int k = 0; k < n; ++k) {
            int n2 = asc_22.f();
            float f2 = asc_22.e();
            this.c.put(n2, Float.valueOf(f2));
        }
    }

    @Override
    public final int a() {
        return enK.T.a();
    }
}

