/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fJU
 */
public class fju_1 {
    private static final Logger a = Logger.getLogger(fju_1.class);

    public static boolean a(Method method, Object object) {
        Class<?>[] classArray = method.getParameterTypes();
        if (classArray.length != 1) {
            return false;
        }
        Class<?> clazz = classArray[0];
        if (object == null) {
            return !clazz.isPrimitive();
        }
        Class<?> clazz2 = object.getClass();
        return !(clazz.isArray() && !clazz2.isArray() || !clazz.isArray() && clazz2.isArray());
    }

    public static boolean a(Method method, Object ... objectArray) {
        Class<?>[] classArray = method.getParameterTypes();
        if (objectArray.length != classArray.length) {
            return false;
        }
        for (int k = 0; k < classArray.length; ++k) {
            if (!(objectArray[k] == null ? classArray[k].isPrimitive() : !classArray[k].isAssignableFrom(objectArray[k].getClass()))) continue;
            return false;
        }
        return true;
    }

    public static void a(Method method, Object object, Object[] objectArray) {
        Serializable serializable;
        if (method == null || objectArray == null) {
            return;
        }
        Class<?>[] classArray = method.getParameterTypes();
        if (classArray.length != objectArray.length) {
            throw new Exception("nombre de param\u00e8tres attendus : " + classArray.length + ". Trouv\u00e9s : " + objectArray.length);
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (int k = 0; k < classArray.length; ++k) {
            serializable = classArray[k];
            Object object2 = objectArray[k];
            if (object2 == null && !((Class)serializable).isPrimitive() || object2 != null && ((Class)serializable).isAssignableFrom(object2.getClass())) {
                arrayList.add(object2);
                continue;
            }
            if (serializable.equals(String.class)) {
                arrayList.add(Co.a(object2));
                continue;
            }
            if (serializable.equals(Boolean.TYPE) || serializable.equals(Boolean.class)) {
                arrayList.add(Co.b(object2));
                continue;
            }
            if (serializable.equals(Integer.TYPE) || serializable.equals(Integer.class)) {
                arrayList.add(Co.c(object2));
                continue;
            }
            if (serializable.equals(Float.TYPE) || serializable.equals(Float.class)) {
                arrayList.add(Float.valueOf(Co.e(object2)));
                continue;
            }
            if (serializable.equals(Double.TYPE) || serializable.equals(Double.class)) {
                arrayList.add(Co.d(object2));
                continue;
            }
            if (serializable.equals(Long.TYPE) || serializable.equals(Long.class)) {
                arrayList.add(Co.f(object2));
                continue;
            }
            if (object2.getClass().equals(String.class)) {
                arrayList.add(fze.a().a(serializable, (String)object2));
                continue;
            }
            throw new Exception("Impossible de convertir la valeur donn\u00e9e");
        }
        try {
            method.invoke(object, arrayList.toArray());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append("IllegalArgumentException : method=").append(method).append(", parametres=");
            for (int k = 0; k < arrayList.size(); ++k) {
                ((StringBuilder)serializable).append(arrayList.get(k));
                if (k == arrayList.size() - 1) break;
                ((StringBuilder)serializable).append(", ");
            }
            a.error((Object)serializable);
        }
    }

    public static void a(String string, fyb_0 fyb_02, fiq_1 fiq_12, int n, String string2, fak_2 fak_22) {
        Object object;
        Object object2 = null;
        Object object3 = null;
        if ((object3 == null || fak_22 != null) && fiq_12 != null) {
            object2 = string2 != null ? fiq_12.a(string2) : fiq_12.a();
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        if (fak_22 != null) {
            object3 = fak_22.getResult(object2);
        }
        Object object4 = object = object3 != null ? object3 : object2;
        if (object instanceof String && 3556653 != n ? fyb_02.setXMLAttribute(n, (String)object, fze.a()) : fyb_02.setPropertyAttribute(n, object)) {
            return;
        }
        fzy<?> fzy2 = fay_2.c().a(fyb_02.getClass());
        Method method = object3 != null ? fzy2.a(string, object3.getClass()) : (object2 != null ? fzy2.a(string, object2.getClass()) : fzy2.b(string));
        if (method == null) {
            return;
        }
        Class<?>[] classArray = method.getParameterTypes();
        if (classArray.length != 1) {
            throw new Exception("La m\u00e9thode prend " + classArray.length + " param\u00e8tres");
        }
        Class<?> clazz = classArray[0];
        if (clazz.isPrimitive()) {
            clazz = fyl.a(clazz);
        }
        if (object3 != null && clazz.isAssignableFrom(object3.getClass())) {
            arrayList.add(object3);
        } else if (object2 == null || object2 != null && clazz.isAssignableFrom(object2.getClass())) {
            arrayList.add(object2);
        } else if (clazz.equals(String.class)) {
            arrayList.add(Co.a(object2));
        } else if (clazz.equals(Boolean.class) || clazz.equals(Boolean.TYPE)) {
            arrayList.add(Co.b(object2));
        } else if (clazz.equals(Integer.class) || clazz.equals(Integer.TYPE)) {
            arrayList.add(Co.c(object2));
        } else if (clazz.equals(Float.class) || clazz.equals(Float.TYPE)) {
            arrayList.add(Float.valueOf(Co.e(object2)));
        } else if (clazz.equals(Double.class) || clazz.equals(Double.TYPE)) {
            arrayList.add(Co.d(object2));
        } else if (clazz.equals(Long.class) || clazz.equals(Long.TYPE)) {
            arrayList.add(Co.f(object2));
        } else if (object2.getClass().equals(String.class)) {
            arrayList.add(fze.a().a(clazz, (String)object2));
        } else {
            throw new Exception("Impossible de convertir la valeur donn\u00e9e (attendu = " + clazz + ", eu = " + object2.getClass() + ")");
        }
        try {
            method.invoke((Object)fyb_02, arrayList.toArray());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("IllegalArgumentException : method=").append(method).append(", parametres=");
            for (int k = 0; k < arrayList.size(); ++k) {
                stringBuilder.append(arrayList.get(k));
                if (k == arrayList.size() - 1) break;
                stringBuilder.append(", ");
            }
            a.error((Object)stringBuilder);
        }
    }
}

