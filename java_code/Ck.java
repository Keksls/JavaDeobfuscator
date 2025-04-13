/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.TestOnly
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageV3;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

@TestOnly
public final class Ck<T> {
    private static final String e = "newBuilder";
    private static final String f = "set";
    private static final String g = "setUnknownFields";
    private static final String h = "build";
    public static final int a = 16;
    public static final int b = 0;
    public static final int c = 5;
    public static final int d = 8;
    private static final List<Class<?>> i = List.of(Boolean.class, Byte.class, Character.class, Short.class, Integer.class, Long.class, Float.class, Double.class, String.class);
    private final Class<T> j;
    private final Cp k;
    private int l = 16;
    private int m = 0;
    private int n = 5;
    private int o = 8;
    private Cl p = Cl.a;
    private final Map<String, Supplier<Object>> q = new HashMap<String, Supplier<Object>>();
    private final Map<Class<?>, Class<?>> r = new HashMap();

    public Ck(Class<T> clazz, Cp cp) {
        this.j = clazz;
        this.k = cp;
    }

    public Ck<T> a(int n) {
        this.l = n;
        return this;
    }

    public Ck<T> b(int n) {
        this.m = n;
        return this;
    }

    public Ck<T> c(int n) {
        this.n = n;
        return this;
    }

    public Ck<T> d(int n) {
        this.o = n;
        return this;
    }

    public Ck<T> a(Cl cl) {
        this.p = cl;
        return this;
    }

    public Ck<T> a(String string, Supplier<Object> supplier) {
        this.q.put(string, supplier);
        return this;
    }

    public Ck<T> a(String string, Object object) {
        this.q.put(string, () -> object);
        return this;
    }

    public <U> Ck<T> a(Class<U> clazz, Class<? extends U> clazz2) {
        this.r.put(clazz, clazz2);
        return this;
    }

    private static void a(AccessibleObject accessibleObject) {
        if (!accessibleObject.isAccessible()) {
            accessibleObject.setAccessible(true);
        }
    }

    public T a() {
        try {
            if (GeneratedMessageV3.class.isAssignableFrom(this.j)) {
                return this.a(this.j, 0);
            }
            Object object = this.c(this.j, 0);
            this.a(object);
            return (T)object;
        }
        catch (Exception exception) {
            throw new RuntimeException("Error while creating instance of " + this.j, exception);
        }
    }

    private void a(Object object) {
        this.a(object, 0);
    }

    private void a(Object object, int n) {
        Class<?> clazz = object.getClass();
        do {
            Field[] fieldArray = clazz.getDeclaredFields();
            this.a(object, fieldArray, n);
        } while ((clazz = clazz.getSuperclass()) != null);
    }

    private void a(Object object, Field[] fieldArray, int n) {
        for (Field field : fieldArray) {
            if (Modifier.isStatic(field.getModifiers()) || Modifier.isFinal(field.getModifiers()) || Modifier.isTransient(field.getModifiers()) || Modifier.isVolatile(field.getModifiers())) continue;
            Ck.a(field);
            field.set(object, this.a(field.getName(), field.getType(), field.getGenericType(), n));
        }
    }

    private <T extends GeneratedMessageV3> T a(Class<T> clazz, int n) {
        Method method = clazz.getMethod(e, new Class[0]);
        Object object = method.invoke(clazz, new Object[0]);
        Class<?> clazz2 = object.getClass();
        for (Method method2 : clazz2.getMethods()) {
            Parameter[] parameterArray;
            if (method2.getReturnType() != clazz2 || !method2.getName().startsWith(f) || method2.getName().equals(g) || (parameterArray = method2.getParameters()).length != 1 || GeneratedMessageV3.Builder.class.isAssignableFrom(parameterArray[0].getType())) continue;
            method2.invoke(object, this.a(Ck.a(method2), parameterArray[0].getType(), null, n));
        }
        return (T)((GeneratedMessageV3)clazz2.getMethod(h, new Class[0]).invoke(object, new Object[0]));
    }

    private static String a(Method method) {
        String string = method.getName().substring(f.length());
        return string.substring(0, 1).toLowerCase() + string.substring(1);
    }

    private <T> T b(Class<T> clazz, int n) {
        return this.a(clazz, null, n);
    }

    private <T> T a(String string, Class<T> clazz, @Nullable Type type, int n) {
        if (this.q.containsKey(string)) {
            return (T)this.q.get(string).get();
        }
        return this.a(clazz, type, n);
    }

    private <T> T a(Class<T> clazz, @Nullable Type type, int n) {
        if (clazz.isPrimitive() || i.contains(clazz)) {
            return (T)this.b(clazz);
        }
        if (clazz.isEnum()) {
            T[] TArray = clazz.getEnumConstants();
            return this.k.a(TArray);
        }
        if (clazz.isArray()) {
            return (T)this.d(clazz.getComponentType(), n);
        }
        if (Collection.class.isAssignableFrom(clazz)) {
            Class clazz2 = (Class)((ParameterizedType)type).getActualTypeArguments()[0];
            Object object = this.d(clazz2, n);
            ArrayList<Object> arrayList = new ArrayList<Object>();
            for (int k = 0; k < Array.getLength(object); ++k) {
                arrayList.add(Array.get(object, k));
            }
            if (Set.class.isAssignableFrom(clazz)) {
                return (T)new HashSet(arrayList);
            }
            return (T)arrayList;
        }
        if (Map.class.isAssignableFrom(clazz)) {
            Class clazz3 = (Class)((ParameterizedType)type).getActualTypeArguments()[0];
            Class clazz4 = (Class)((ParameterizedType)type).getActualTypeArguments()[1];
            Object object = this.d(clazz3, n);
            Object object2 = this.d(clazz4, n);
            HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
            for (int k = 0; k < Math.min(Array.getLength(object), Array.getLength(object2)); ++k) {
                hashMap.put(Array.get(object, k), Array.get(object2, k));
            }
            return (T)hashMap;
        }
        if (GeneratedMessageV3.class.isAssignableFrom(clazz)) {
            return this.a(clazz, n + 1);
        }
        if (ByteString.class.isAssignableFrom(clazz)) {
            return (T)ByteString.copyFromUtf8((String)this.k.b(this.l));
        }
        Object object = this.c(this.r.getOrDefault(clazz, clazz), n);
        if (n >= this.o) {
            return null;
        }
        this.a(object, n + 1);
        return (T)object;
    }

    @NotNull
    private <T> Object c(Class<T> clazz, int n) {
        Constructor<T> constructor = this.a(clazz);
        Class<?>[] classArray = constructor.getParameterTypes();
        Object[] objectArray = new Object[constructor.getParameterCount()];
        for (int k = 0; k < objectArray.length; ++k) {
            objectArray[k] = this.b(classArray[k], n);
        }
        return constructor.newInstance(objectArray);
    }

    private Constructor<?> a(Class<?> clazz) {
        Constructor<?> constructor2;
        Constructor<?>[] constructorArray = clazz.getDeclaredConstructors();
        if (constructorArray.length == 0) {
            throw new IllegalArgumentException("type " + clazz + " does not have any constructor");
        }
        Arrays.sort(constructorArray, Comparator.comparing(constructor -> constructor.getParameterTypes().length));
        if (this.p == Cl.a) {
            constructor2 = constructorArray[0];
        } else if (this.p == Cl.b) {
            constructor2 = constructorArray[constructorArray.length - 1];
        } else if (this.p == Cl.c) {
            constructor2 = this.k.a(constructorArray);
        } else {
            throw new IllegalArgumentException("Constructor selection " + this.p + " is invalid");
        }
        Ck.a(constructor2);
        return constructor2;
    }

    @NotNull
    private Object d(Class<?> clazz, int n) {
        ArrayList arrayList = new ArrayList();
        for (int k = 0; k < this.k.a(this.m, this.n); ++k) {
            Object obj = this.b(clazz, n);
            if (obj == null) continue;
            arrayList.add(obj);
        }
        Object object = Array.newInstance(clazz, arrayList.size());
        for (int k = 0; k < arrayList.size(); ++k) {
            Array.set(object, k, arrayList.get(k));
        }
        return object;
    }

    private Object b(Class<?> clazz) {
        if (clazz == Boolean.TYPE || clazz == Boolean.class) {
            return this.k.e();
        }
        if (clazz == Byte.TYPE || clazz == Byte.class) {
            return this.k.d();
        }
        if (clazz == Character.TYPE || clazz == Character.class) {
            return Character.valueOf((char)this.k.a(0L, 65535L));
        }
        if (clazz == Short.TYPE || clazz == Short.class) {
            return this.k.c();
        }
        if (clazz == Integer.TYPE || clazz == Integer.class) {
            return this.k.b();
        }
        if (clazz == Long.TYPE || clazz == Long.class) {
            return this.k.a();
        }
        if (clazz == Float.TYPE || clazz == Float.class) {
            return Float.valueOf(this.k.b());
        }
        if (clazz == Double.TYPE || clazz == Double.class) {
            return (double)this.k.a();
        }
        if (clazz == String.class) {
            return this.k.b(this.l);
        }
        throw new IllegalArgumentException("Unknown simple type: " + clazz);
    }
}

