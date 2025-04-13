/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.inject.Module
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Module;
import java.util.ArrayList;
import java.util.Collection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class GA {
    private final Gn a = new Gn(GL.class);
    private final Gn b = new Gn(GK.class);
    private static final Logger c = LoggerFactory.getLogger(GA.class);

    GA() {
    }

    public Iterable<Module> a(Module module) {
        Iterable<Gz> iterable = this.a.a(module);
        return this.a(iterable, Module.class);
    }

    public Iterable<Class<? extends Module>> b(Module module) {
        Iterable<Gz> iterable = this.b.a(module);
        Iterable<Class> iterable2 = this.a(iterable, Class.class);
        return this.a(iterable2);
    }

    private <T> Iterable<T> a(Iterable<Gz> iterable, Class<T> clazz) {
        GM<T> gM = new GM<T>(clazz);
        GB gB = new GB(this, gM);
        return Lists.newArrayList((Iterable)Iterables.concat((Iterable)Iterables.transform(iterable, (Function)gB)));
    }

    private Collection<Class<? extends Module>> a(Iterable<Class> iterable) {
        ArrayList arrayList = Lists.newArrayList();
        for (Class clazz : iterable) {
            if (!this.a(clazz)) continue;
            arrayList.add(this.b(clazz));
        }
        return arrayList;
    }

    private boolean a(Class<?> clazz) {
        if (!clazz.isInterface()) {
            c.warn(String.format("Required module type %s is not an interface.", clazz.getSimpleName()));
            return false;
        }
        if (!Module.class.isAssignableFrom(clazz)) {
            c.warn(String.format("Required module type %s does not extend Module.", clazz.getSimpleName()));
            return false;
        }
        return true;
    }

    private Class<? extends Module> b(Class<?> clazz) {
        return clazz;
    }
}

