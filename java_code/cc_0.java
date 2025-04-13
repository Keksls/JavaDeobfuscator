/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Iterables
 */
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;

/*
 * Renamed from Cc
 */
public abstract class cc_0<E, D> {
    public static <E, D> cc_0<E, D> a(E e2) {
        return new Ce(e2);
    }

    public static <E, D> cc_0<E, D> b(D d2) {
        return new Cf(d2);
    }

    public static <E, D> Iterable<E> a(Iterable<cc_0<E, D>> iterable) {
        return Iterables.transform((Iterable)Iterables.filter(iterable, (Predicate)Predicates.instanceOf(Ce.class)), (Function)new Cd());
    }

    public abstract <E1> cc_0<E1, D> a(Function<? super E, ? extends E1> var1);

    public abstract <D1> cc_0<E, D1> b(Function<? super D, ? extends D1> var1);

    public abstract cc_0<E, D> a(cc_0<E, D> var1);

    public abstract boolean a();

    public boolean b() {
        return !this.a();
    }

    public abstract D c();

    public abstract E d();
}

