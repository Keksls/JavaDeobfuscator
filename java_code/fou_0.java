/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from fou
 */
public class fou_0
implements asu_2 {
    protected int a;
    protected int[] b;
    protected HashMap<Integer, Integer> c;
    protected int[] d;

    public int c() {
        return this.a;
    }

    public int[] d() {
        return this.b;
    }

    public HashMap<Integer, Integer> e() {
        return this.c;
    }

    public int[] f() {
        return this.d;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.k();
        int n = asc_22.f();
        this.c = new HashMap(n);
        for (int k = 0; k < n; ++k) {
            int n2 = asc_22.f();
            int n3 = asc_22.f();
            this.c.put(n2, n3);
        }
        this.d = asc_22.k();
    }

    @Override
    public final int a() {
        return enK.S.a();
    }
}

