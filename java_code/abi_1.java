/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aBi
 */
public abstract class abi_1<T extends abh_1> {
    private final int a;
    private final Class b;
    private abj_1 c;

    public abi_1(Class clazz) {
        this.a = abh_1.a(clazz);
        this.b = clazz;
    }

    public final T c() {
        T t = this.b();
        ((abh_1)t).n_();
        return t;
    }

    public final T d() {
        if (this.c == null) {
            this.c = abl_1.b().a(this.a, this.b);
        }
        return (T)this.c.a();
    }

    public abstract T b();

    public final Class e() {
        return this.b;
    }
}

