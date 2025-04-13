/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.google.common.collect.Iterables
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import com.google.common.base.Preconditions;
import com.google.common.collect.Iterables;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class GM<T> {
    private final Class<T> a;
    private static final Logger b = LoggerFactory.getLogger(GM.class);

    GM(Class<T> clazz) {
        this.a = clazz;
    }

    public Iterable<T> a(Gz gz) {
        Preconditions.checkArgument((boolean)gz.b(), (Object)"'method' must be a property.");
        if (this.b(gz)) {
            return this.c(gz);
        }
        if (this.d(gz)) {
            return this.e(gz);
        }
        if (this.f(gz)) {
            return this.g(gz);
        }
        this.h(gz);
        return Collections.emptyList();
    }

    private boolean b(Gz gz) {
        return this.a.isAssignableFrom(gz.a());
    }

    private Iterable<T> c(Gz gz) {
        return Collections.singleton(this.a.cast(gz.d()));
    }

    private boolean d(Gz gz) {
        return Iterable.class.isAssignableFrom(gz.a());
    }

    private Iterable<T> e(Gz gz) {
        return Iterables.filter((Iterable)((Iterable)gz.d()), this.a);
    }

    private boolean f(Gz gz) {
        Class<?> clazz = Array.newInstance(this.a, 0).getClass();
        return clazz.equals(gz.a());
    }

    private List<T> g(Gz gz) {
        return Arrays.asList((Object[])gz.d());
    }

    private void h(Gz gz) {
        b.warn(String.format("The method %s must have a return type of %s, Iterable, or %s[]", gz.toString(), this.a.getSimpleName(), this.a.getSimpleName()));
    }
}

