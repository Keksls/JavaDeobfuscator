/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public abstract class cLm<T extends fkt_0> {
    private final ArrayList<fkN> b = new ArrayList();
    protected final T a;

    protected cLm(T t) {
        this.a = t;
    }

    public boolean c() {
        return !this.b.isEmpty();
    }

    public ArrayList<fkN> d() {
        return this.b;
    }

    public void a(ArrayList<fkN> arrayList) {
        this.b.addAll(arrayList);
    }

    public T e() {
        return this.a;
    }

    public abstract cLn a();

    public abstract void a(fkj_0 var1);

    public abstract void b(cks_2 var1);

    public abstract void a(cks_2 var1);

    public final void d(cks_2 cks_22) {
        this.a(cks_22);
    }

    protected void c(cks_2 cks_22) {
        this.a(cks_22);
    }

    public void e(cks_2 cks_22) {
        this.c(cks_22);
        for (fkN fkN2 : this.d()) {
            if (fkN2.a() != fkO.a) continue;
            cks_22.f(fkN2.c());
        }
    }

    public afe_1 f() {
        return this.a.b();
    }

    public etl_2 g() {
        return this.a.f();
    }
}

