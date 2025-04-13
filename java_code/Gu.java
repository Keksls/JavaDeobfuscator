/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 */
import com.google.common.base.Function;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

abstract class Gu {
    public static final Function<Gu, Iterable<Gq>> a = new Gv();
    public static final Function<Gu, Iterable<Gu>> b = new Gw();
    private final Set<Gq> c = Sets.newLinkedHashSet();

    Gu() {
    }

    public boolean a(Gq gq) {
        return this.c.add(gq);
    }

    public Set<Gq> a() {
        return ImmutableSet.copyOf(this.c);
    }
}

