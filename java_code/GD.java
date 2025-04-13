/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Functions
 *  com.google.common.base.Preconditions
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.ClassToInstanceMap
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.inject.Module
 */
import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ClassToInstanceMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.inject.Module;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class GD {
    private final GA a;
    private final ClassToInstanceMap<Module> b;
    private final Iterable<Module> c;
    private final Set<Gu> d = Sets.newLinkedHashSet();
    private final Set<Gu> e = Sets.newHashSet();
    private final Map<GJ, Gq> f = Maps.newLinkedHashMap();
    private final List<GJ> g;

    public GD(GA gA, Iterable<Module> iterable, ClassToInstanceMap<Module> classToInstanceMap, List<GJ> list) {
        this.a = gA;
        this.c = iterable;
        this.b = classToInstanceMap;
        this.g = list;
    }

    public GC a() {
        Go go = new Go();
        this.d.add(go);
        for (Object object2 : this.c) {
            this.a((Gu)go, (Module)object2);
        }
        Object object = this.a(Module.class).iterator();
        while (object.hasNext()) {
            Object object2;
            object2 = (GJ)object.next();
            this.a((Gu)go, (GJ)object2);
        }
        this.e.add(go);
        while ((object = (Gu)Iterables.getFirst(this.b(), null)) != null) {
            this.a((Gu)object);
        }
        return new GC(this.d, go, Iterables.filter((Iterable)Lists.transform(this.g, (Function)Functions.forMap(this.f, null)), (Predicate)Predicates.notNull()));
    }

    private List<GJ> a(Class<? extends Module> clazz) {
        return this.g.stream().filter(gJ -> gJ.a() == clazz).collect(Collectors.toList());
    }

    private void a(Gu gu, Module module) {
        GE gE = new GE(module);
        this.a(gu, gE);
    }

    private void a(Gu gu, Gu gu2) {
        this.a(Gt.a, gu, gu2);
    }

    private Gq a(Gt gt, Gu gu, Gu gu2) {
        Preconditions.checkArgument((boolean)this.d.contains(gu), (Object)"Cannot add a link if source is not in graph.");
        this.d.add(gu2);
        Gq gq = new Gq(gt, gu, (Gu)Iterables.find(this.d, (Predicate)Predicates.equalTo((Object)gu2)));
        gu.a(gq);
        return gq;
    }

    private Set<Gu> b() {
        return Sets.difference(this.d, this.e);
    }

    private void a(Gu gu) {
        if (gu instanceof GG) {
            this.a((GG)gu);
        } else if (gu instanceof GE) {
            this.a((GE)gu);
        }
    }

    private void a(GE gE) {
        Module module = gE.b();
        this.a(gE, module);
        this.b(gE, module);
        this.c(gE, module);
        this.e.add(gE);
    }

    private void a(GE gE, Module module) {
        Iterable<Module> iterable = this.a.a(module);
        for (Module module2 : iterable) {
            this.a((Gu)gE, module2);
        }
    }

    private void b(GE gE, Module module) {
        Iterable<Class<? extends Module>> iterable = this.a.b(module);
        for (Class<? extends Module> clazz : iterable) {
            this.a((Gu)gE, new GG(clazz));
        }
    }

    private void c(GE gE, Module module) {
        List<GJ> list = this.a(module.getClass());
        if (list.isEmpty()) {
            return;
        }
        for (GJ gJ : list) {
            this.a((Gu)gE, gJ);
        }
    }

    private void a(GG gG) {
        Class<? extends Module> clazz = gG.b();
        Module module = (Module)this.b.get(clazz);
        if (module == null) {
            throw new IllegalArgumentException("No implementation configured for " + clazz.getName());
        }
        this.a((Gu)gG, module);
        this.e.add(gG);
    }

    private void a(Gu gu, GJ gJ) {
        ImmutableList<Module> immutableList = gJ.b();
        if (immutableList.isEmpty()) {
            return;
        }
        Go go = new Go();
        Gq gq = this.a(Gt.b, gu, go);
        this.f.put(gJ, gq);
        for (Module module : immutableList) {
            this.a(Gt.a, go, new GE(module));
        }
        this.e.add(go);
    }
}

