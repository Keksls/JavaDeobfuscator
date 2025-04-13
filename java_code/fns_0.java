/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from fnS
 */
public class fns_0
implements asu_2 {
    protected short a;
    protected int b;
    protected int[] c;
    protected HashMap<Integer, int[]> d;

    public short c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public int[] e() {
        return this.c;
    }

    public HashMap<Integer, int[]> f() {
        return this.d;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = null;
        this.d = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.d();
        this.b = asc_22.f();
        this.c = asc_22.k();
        int n = asc_22.f();
        this.d = new HashMap(n);
        for (int k = 0; k < n; ++k) {
            int n2 = asc_22.f();
            int[] nArray = asc_22.k();
            this.d.put(n2, nArray);
        }
    }

    @Override
    public final int a() {
        return enK.J.a();
    }
}

