/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from add
 */
abstract class add_0<T> {
    private final ArrayList<ade_0<T>> c = new ArrayList();
    private final acr_0<ade_0<T>> d;
    protected final acy_2<T> a = new acy_2();

    protected add_0(acr_0<ade_0<T>> acr_02) {
        this.d = acr_02;
    }

    public final T a(int n) {
        return this.a.g(n);
    }

    public final void a(int n, T t) {
        this.a.a(n, t);
    }

    public void a() {
        this.a.c();
    }

    public final void a(float f2, float f3, int n, ArrayList<T> arrayList) {
        T t;
        int n2;
        int n3;
        int n4 = this.a.d() - n;
        if (n4 <= 0) {
            return;
        }
        this.d.a(f2, f3);
        this.c.clear();
        for (n3 = this.a.d() - 1; n3 >= 0; --n3) {
            n2 = this.a.e(n3);
            t = this.a.h(n3);
            this.c.add(new ade_0<T>(n2, t));
        }
        this.c.sort(this.d);
        for (n3 = 0; n3 < n4; ++n3) {
            n2 = this.c.get((int)n3).a;
            t = this.c.get((int)n3).b;
            assert (t == this.a.g(n2));
            if (arrayList.contains(t)) continue;
            this.a.f(n2);
            this.a(t);
        }
    }

    protected abstract void a(T var1);
}

