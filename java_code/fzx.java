/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.log4j.Logger;

public class fzx<T extends fyo>
implements fzy {
    private static final Logger h = Logger.getLogger(fzx.class);
    public static final boolean a = true;
    public static final String b = "checkOut";
    private final ArrayList<Method> i = new ArrayList();
    private final ArrayList<Method> j = new ArrayList();
    private final ArrayList<Method> k = new ArrayList();
    private final ArrayList<Method> l = new ArrayList();
    private final Class m;
    private Method n = null;
    protected final Class[] c = new Class[]{Object.class, String.class, Float.TYPE, Double.TYPE, Boolean.TYPE, Character.TYPE, Long.TYPE, Byte.TYPE, Integer.TYPE};

    public fzx(Class clazz) {
        this.m = clazz;
        this.c();
        this.a();
        this.d();
        this.e();
        this.b();
    }

    protected int a(Class<?> clazz) {
        for (int k = 0; k < this.c.length; ++k) {
            if (!clazz.isAssignableFrom(this.c[k])) continue;
            return k;
        }
        return -1;
    }

    protected void a() {
        Method[] methodArray = this.m.getMethods();
        for (int k = 0; k < methodArray.length; ++k) {
            String string = methodArray[k].getName();
            if (!string.startsWith("get")) continue;
            this.j.add(methodArray[k]);
        }
    }

    protected void b() {
        try {
            this.n = this.m.getDeclaredMethod(b, new Class[0]);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    protected void c() {
        this.c(this.i, "set");
    }

    protected void d() {
        this.c(this.k, "prepend");
    }

    protected void e() {
        this.c(this.l, "append");
    }

    public T f() {
        fyo fyo2;
        if (this.n != null) {
            fyo2 = (fyo)this.n.invoke(null, new Object[0]);
        } else {
            fyo2 = (fyo)this.m.newInstance();
            fyo2.onCheckOut();
        }
        return (T)fyo2;
    }

    public T a(fku_1 fku_12, String string) {
        fyo fyo2;
        fku_12.a(this.m);
        if (this.n != null) {
            fyo2 = (fyo)this.n.invoke(null, new Object[0]);
            fku_12.a(new fkw_1(this.m, string, this.m.getSimpleName() + ".checkOut()"));
        } else {
            fyo2 = (fyo)this.m.newInstance();
            fku_12.a(new fkw_1(this.m, string, "new " + this.m.getSimpleName() + "()"));
            if (fyo2 instanceof abo_1) {
                fku_12.a(new fkv_1(null, "onCheckOut", string, new String[0]));
                fyo2.onCheckOut();
            }
        }
        return (T)fyo2;
    }

    public T a(Object object) {
        Class<?> clazz = object.getClass();
        Constructor<?>[] constructorArray = this.m.getConstructors();
        for (int k = 0; k < constructorArray.length; ++k) {
            Class<?>[] classArray = constructorArray[k].getParameterTypes();
            if (classArray.length <= 0 || !classArray[0].isAssignableFrom(clazz)) continue;
            return (T)((fyo)constructorArray[k].newInstance(object));
        }
        return (T)((fyo)this.m.newInstance());
    }

    public T a(Object ... objectArray) {
        if (objectArray == null) {
            return (T)((fyo)this.m.newInstance());
        }
        Object[] objectArray2 = new Class[objectArray.length];
        Constructor<?>[] constructorArray = this.m.getConstructors();
        for (int k = 0; k < objectArray2.length; ++k) {
            objectArray2[k] = objectArray[k].getClass();
        }
        Constructor<?> constructor = null;
        for (int k = 0; constructor == null && k < constructorArray.length; ++k) {
            Class<?>[] classArray = constructorArray[k].getParameterTypes();
            if (classArray.length != objectArray2.length) continue;
            constructor = constructorArray[k];
            for (int i2 = 0; constructor != null && i2 < classArray.length; ++i2) {
                if (classArray[i2].equals(Object.class)) {
                    if (classArray[i2].equals(objectArray2[i2])) continue;
                    constructor = null;
                    continue;
                }
                if (classArray[i2].isAssignableFrom((Class<?>)objectArray2[i2])) continue;
                constructor = null;
            }
        }
        if (constructor != null) {
            return (T)((fyo)constructor.newInstance(objectArray));
        }
        throw new IllegalArgumentException("Impossible de trouver de constructeur pour les types : " + Arrays.toString(objectArray2));
    }

    public Class g() {
        return this.m;
    }

    public Method b(Class clazz) {
        Method method = null;
        int n = this.i.size();
        for (int k = 0; k < n; ++k) {
            Method method2 = this.i.get(k);
            Class<?>[] classArray = method2.getParameterTypes();
            if (classArray == null || classArray.length <= 0 || !clazz.equals(classArray[0])) continue;
            method = method2;
            break;
        }
        return method;
    }

    @Override
    public Method a(String string) {
        return this.a(this.i, string);
    }

    @Override
    public Method b(String string) {
        return this.a(this.i, string, "set");
    }

    public Method a(String string, Class clazz) {
        return this.a(this.i, string, "set", clazz, null);
    }

    public Method a(String string, Class clazz, Class clazz2) {
        return this.a(this.i, string, "set", clazz, clazz2);
    }

    @Override
    public Method c(String string) {
        return this.a(this.j, string, "get");
    }

    public Method b(String string, Class clazz) {
        return this.a(this.j, string, "get", clazz, null);
    }

    @Override
    public Method d(String string) {
        return this.a(this.l, string, "append");
    }

    public Method c(String string, Class clazz) {
        return this.a(this.l, string, "append", clazz, null);
    }

    @Override
    public Method e(String string) {
        return this.a(this.k, string, "prepend");
    }

    public Method d(String string, Class clazz) {
        return this.a(this.k, string, "prepend", clazz, null);
    }

    private Method a(ArrayList<Method> arrayList, String string) {
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            Method method = arrayList.get(k);
            if (!method.getName().equals(string)) continue;
            return method;
        }
        return null;
    }

    private ArrayList<Method> b(ArrayList<Method> arrayList, String string) {
        ArrayList<Method> arrayList2 = new ArrayList<Method>();
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            Method method = arrayList.get(k);
            if (!method.getName().equalsIgnoreCase(string)) continue;
            arrayList2.add(method);
        }
        return arrayList2;
    }

    private Method a(ArrayList<Method> arrayList, String object, String string) {
        object = string + (String)object;
        int n = arrayList.size();
        Method method = null;
        for (int k = 0; k < n; ++k) {
            Method method2 = arrayList.get(k);
            if (!method2.getName().equalsIgnoreCase((String)object)) continue;
            method = method2;
            break;
        }
        return method;
    }

    private Method a(ArrayList<Method> arrayList, String object, String string, Class<?> clazz, Class<?> clazz2) {
        object = string + (String)object;
        int n = arrayList.size();
        Method method = null;
        for (int k = 0; k < n; ++k) {
            Method method2 = arrayList.get(k);
            if (!method2.getName().equalsIgnoreCase((String)object)) continue;
            Class<?>[] classArray = method2.getParameterTypes();
            if (classArray.length > 0) {
                Class<?> clazz3 = classArray[0];
                if (clazz2 != null && clazz2.isAssignableFrom(clazz3)) continue;
                if (clazz == null) {
                    return method2;
                }
                if (clazz3.isAssignableFrom(clazz)) {
                    return method2;
                }
            }
            method = method2;
        }
        return method;
    }

    private void c(ArrayList<Method> arrayList, String string) {
        Method[] methodArray = this.m.getMethods();
        for (int k = 0; k < methodArray.length; ++k) {
            Method method = methodArray[k];
            String string2 = method.getName();
            if (!string2.startsWith(string) || method.getParameterTypes().length != 1) continue;
            int n = arrayList.size();
            if (fze.a().a(method.getParameterTypes()[0])) {
                n = 0;
            }
            if (arrayList.contains(method)) {
                h.warn((Object)("La classe " + this.m.getSimpleName() + " poss\u00e8de plusieurs fonctions poss\u00e9dant le nom " + method.getName()));
            }
            arrayList.add(n, method);
        }
    }

    public /* synthetic */ Object b(Object[] objectArray) {
        return this.a(objectArray);
    }

    public /* synthetic */ Object b(Object object) {
        return this.a(object);
    }

    public /* synthetic */ Object h() {
        return this.f();
    }

    public /* synthetic */ Object b(fku_1 fku_12, String string) {
        return this.a(fku_12, string);
    }
}

