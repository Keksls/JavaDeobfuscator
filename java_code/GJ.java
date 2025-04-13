/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.inject.Module
 */
import com.google.common.collect.ImmutableList;
import com.google.inject.Module;

class GJ {
    private final Class<? extends Module> a;
    private final ImmutableList<Module> b;

    GJ(Class<? extends Module> clazz, Iterable<? extends Module> iterable) {
        this.a = clazz;
        this.b = ImmutableList.copyOf(iterable);
    }

    public Class<? extends Module> a() {
        return this.a;
    }

    public ImmutableList<Module> b() {
        return this.b;
    }
}

