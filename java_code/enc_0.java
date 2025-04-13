/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/*
 * Renamed from enc
 */
public enum enc_0 {
    a(end_0.a, end_0.b, end_0.d, end_0.c, end_0.f, end_0.g, end_0.i, end_0.j, end_0.k, end_0.n, end_0.e, end_0.l, end_0.m, end_0.o),
    b(end_0.values()),
    c(end_0.f),
    d(end_0.a, end_0.b),
    e(end_0.b),
    f(end_0.g),
    g(end_0.h),
    h(end_0.i),
    i(end_0.j),
    j(end_0.k),
    k(end_0.l),
    l(end_0.m),
    m(end_0.e),
    n(end_0.p);

    private final EnumSet<end_0> o = EnumSet.noneOf(end_0.class);

    private enc_0(end_0 ... end_0Array) {
        this.o.addAll(Arrays.asList(end_0Array));
    }

    Set<end_0> a() {
        return Collections.unmodifiableSet(this.o);
    }
}

