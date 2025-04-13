/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class fxV
implements fxx_0 {
    private fxx_0 b = null;
    private ArrayList<fxx_0> c;
    protected boolean a = false;
    private boolean d = false;
    private int e = 0;
    private Object f;

    public fxV(Object object) {
        this.f = object;
    }

    public void a(fxV fxV2) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        if (!this.c.contains(fxV2)) {
            this.c.add(fxV2);
            fxV2.b = this;
            fxV2.a(this.e + 1);
        }
    }

    @Override
    public boolean a() {
        return this.c != null && !this.c.isEmpty();
    }

    @Override
    public ArrayList<fxx_0> b() {
        return this.c;
    }

    @Override
    public fxx_0 c() {
        return this.b;
    }

    @Override
    public void a(Object object) {
        this.f = object;
    }

    @Override
    public Object d() {
        return this.f;
    }

    @Override
    public void a(boolean bl) {
        this.a = bl;
    }

    @Override
    public boolean e() {
        return this.a;
    }

    @Override
    public void b(boolean bl) {
        this.d = bl;
    }

    @Override
    public boolean f() {
        return this.d;
    }

    @Override
    public int g() {
        return this.e;
    }

    @Override
    public void a(int n) {
        if (this.e == n) {
            return;
        }
        this.e = n;
        if (this.c != null) {
            for (int k = this.c.size() - 1; k >= 0; --k) {
                this.c.get(k).a(this.e + 1);
            }
        }
    }
}

