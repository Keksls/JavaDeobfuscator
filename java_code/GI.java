/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.Sets
 *  com.google.inject.Module
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.inject.Module;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

class GI {
    private final GC a;
    private final Set<Gu> b = Sets.newHashSet();

    public List<Set<Module>> a() {
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.add(this.a(this.a(this.a.a())));
        for (Gq gq : this.a.c()) {
            builder.add(this.a(this.a(gq.c())));
        }
        return builder.build();
    }

    private Set<Module> a(Iterable<GE> iterable) {
        return StreamSupport.stream(iterable.spliterator(), false).map(GE.c).collect(Collectors.toSet());
    }

    GI(GC gC) {
        this.a = gC;
    }

    private Set<GE> a(Gu gu) {
        HashSet hashSet = Sets.newHashSet();
        this.a(hashSet, gu);
        return hashSet;
    }

    private void a(Set<GE> set, Gu gu) {
        if (this.b.contains(gu)) {
            return;
        }
        if (gu instanceof GE) {
            set.add((GE)gu);
        }
        this.b.add(gu);
        for (Gq gq : gu.a()) {
            if (gq.a() != Gt.a) continue;
            this.a(set, gq.c());
        }
    }
}

