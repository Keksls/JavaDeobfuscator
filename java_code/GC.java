/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

class GC {
    private final ImmutableSet<Gu> a;
    private final Gu b;
    private final ImmutableList<Gq> c;

    GC(Set<Gu> set, Gu gu, Iterable<Gq> iterable) {
        this.b = gu;
        this.a = ImmutableSet.copyOf(set);
        this.c = ImmutableList.copyOf(iterable);
    }

    public Gu a() {
        return this.b;
    }

    public ImmutableSet<Gu> b() {
        return this.a;
    }

    public ImmutableList<Gq> c() {
        return this.c;
    }
}

