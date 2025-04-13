/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ClassToInstanceMap
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.collect.MutableClassToInstanceMap
 *  com.google.inject.Module
 */
import com.google.common.collect.ClassToInstanceMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.MutableClassToInstanceMap;
import com.google.inject.Module;
import java.util.Iterator;
import java.util.List;

public final class GH
implements Gx {
    private final ClassToInstanceMap<Module> a = MutableClassToInstanceMap.create();
    private final List<GJ> b = Lists.newArrayList();
    private final GA c = new GA();
    private final Gp d = new Gp();

    public static Gx a() {
        return new GH();
    }

    @Override
    public Module a(Module ... moduleArray) {
        GD gD = new GD(this.c, (Iterable<Module>)ImmutableList.copyOf((Object[])moduleArray), this.a, this.b);
        GC gC = gD.a();
        return this.d.a(gC);
    }

    @Override
    public <T extends Module> Gx a(Class<T> clazz, T t) {
        this.a.put(clazz, t);
        return this;
    }

    @Override
    public Gx b(Module ... moduleArray) {
        this.b.add(new GJ(Module.class, (Iterable<? extends Module>)ImmutableList.copyOf((Object[])moduleArray)));
        return this;
    }

    @Override
    public Gx a(Class<? extends Module> clazz, Module ... moduleArray) {
        this.b.add(new GJ(clazz, (Iterable<? extends Module>)ImmutableList.copyOf((Object[])moduleArray)));
        return this;
    }

    @Override
    public Gx b(Class<? extends Module> clazz, Module ... moduleArray) {
        Iterator<GJ> iterator = this.b.iterator();
        while (iterator.hasNext()) {
            GJ gJ = iterator.next();
            if (gJ.a() != clazz) continue;
            iterator.remove();
        }
        this.a(clazz, moduleArray);
        return this;
    }

    private GH() {
    }
}

