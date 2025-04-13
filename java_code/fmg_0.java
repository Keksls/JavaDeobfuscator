/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from fmG
 */
public class fmg_0
implements asu_2 {
    protected short a;
    protected HashMap<Byte, Float> b;

    public short c() {
        return this.a;
    }

    public HashMap<Byte, Float> d() {
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
            byte by = asc_22.b();
            float f2 = asc_22.e();
            this.b.put(by, Float.valueOf(f2));
        }
    }

    @Override
    public final int a() {
        return enK.p.a();
    }
}

