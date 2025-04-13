/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from fpG
 */
public class fpg_0
implements asu_2 {
    protected int a;
    protected boolean b;
    protected HashMap<Integer, fpH> c;

    public int c() {
        return this.a;
    }

    public boolean d() {
        return this.b;
    }

    public HashMap<Integer, fpH> e() {
        return this.c;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = false;
        this.c = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.c();
        int n = asc_22.f();
        this.c = new HashMap(n);
        for (int k = 0; k < n; ++k) {
            int n2 = asc_22.f();
            fpH fpH2 = new fpH();
            fpH2.a(asc_22);
            this.c.put(n2, fpH2);
        }
    }

    @Override
    public final int a() {
        return enK.au.a();
    }
}

