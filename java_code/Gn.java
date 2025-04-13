/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Gn {
    private final Class<? extends Annotation> a;
    private static final Logger b = LoggerFactory.getLogger(Gn.class);

    Gn(Class<? extends Annotation> clazz) {
        this.a = clazz;
    }

    public Iterable<Gz> a(Object object) {
        TreeMap treeMap = Maps.newTreeMap();
        Collection<Class<?>> collection = this.a(object.getClass());
        for (Class<?> clazz : collection) {
            treeMap.putAll(this.a(object, clazz));
        }
        return treeMap.values();
    }

    private Collection<Class<?>> a(Class<?> clazz) {
        LinkedList linkedList = Lists.newLinkedList();
        for (Class<?> clazz2 = clazz; clazz2 != Object.class; clazz2 = clazz2.getSuperclass()) {
            linkedList.addFirst(clazz2);
        }
        return Lists.reverse((List)linkedList);
    }

    private Map<String, Gz> a(Object object, Class<?> clazz) {
        HashMap hashMap = Maps.newHashMap();
        for (Method method : clazz.getDeclaredMethods()) {
            if (!method.isAnnotationPresent(this.a)) continue;
            Gz gz = new Gz(method, object);
            if (!gz.b()) {
                b.warn(String.format("Method with @%s is not a property: %s", this.a.getSimpleName(), gz.c()));
                continue;
            }
            hashMap.put(method.getName(), gz);
        }
        return hashMap;
    }
}

