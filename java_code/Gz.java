/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Gz {
    private final Method a;
    private final Object b;
    private final cc_0<String, Void> c;

    Gz(Method method, Object object) {
        this.a = method;
        this.b = object;
        this.c = this.e();
    }

    public Class<?> a() {
        return this.a.getReturnType();
    }

    public boolean b() {
        return this.c.a();
    }

    public String c() {
        if (this.b()) {
            throw new IllegalStateException(String.format("Method %s is a property", this));
        }
        return this.c.d();
    }

    public Object d() {
        boolean bl = this.a.isAccessible();
        try {
            this.a.setAccessible(true);
            Object object = this.f();
            return object;
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            throw new RuntimeException("Invoke exception for " + this.a, reflectiveOperationException);
        }
        finally {
            this.a.setAccessible(bl);
        }
    }

    public String toString() {
        return String.format("%s.%s", this.a.getDeclaringClass().getSimpleName(), this.a.getName());
    }

    private cc_0<String, Void> e() {
        if (this.a.getParameterTypes().length > 0) {
            return cc_0.a(String.format("Method %s has more than 0 parameters.", this));
        }
        return cc_0.b(null);
    }

    private Object f() {
        if (!this.b()) {
            throw new IllegalStateException(String.format("Method %s is not a property.", this));
        }
        return this.a.invoke(this.b, new Object[0]);
    }
}

