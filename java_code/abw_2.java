/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from aBW
 */
abstract class abw_2<T> {
    final Comparator<T> a;

    abw_2(Comparator<T> comparator) {
        this.a = comparator;
    }

    public final int a(T t, T t2) {
        return this.a.compare(t, t2);
    }

    public abstract int a(abq_2<T> var1, T var2);
}

