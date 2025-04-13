/*
 * Decompiled with CFR 0.152.
 */
public class fyl
implements fzd<Object> {
    public static final Class<Object> a = Object.class;

    @Override
    public Object b(String string) {
        return null;
    }

    @Override
    public Object b(Class<? extends Object> clazz, String string) {
        return this.b(clazz, string, (fyy_0)null);
    }

    @Override
    public Object b(Class<? extends Object> clazz, String string, fyy_0 fyy_02) {
        if (Boolean.TYPE.equals(clazz) || Boolean.class.equals(clazz)) {
            return Co.a(string);
        }
        if (Integer.TYPE.equals(clazz) || Integer.class.equals(clazz)) {
            return Co.c(string);
        }
        if (Long.TYPE.equals(clazz) || Long.class.equals(clazz)) {
            return Co.f(string);
        }
        if (Float.TYPE.equals(clazz) || Float.class.equals(clazz)) {
            return Float.valueOf(Co.e(string));
        }
        if (Double.TYPE.equals(clazz) || Double.class.equals(clazz)) {
            return Co.d(string);
        }
        if (Byte.TYPE.equals(clazz) || Byte.class.equals(clazz)) {
            return Co.g(string);
        }
        if (Short.TYPE.equals(clazz) || Short.class.equals(clazz)) {
            return Co.h(string);
        }
        return null;
    }

    @Override
    public Class<Object> a() {
        return a;
    }

    public static Class<?> a(Class<?> clazz) {
        if (clazz.equals(Boolean.TYPE)) {
            return Boolean.class;
        }
        if (clazz.equals(Double.TYPE)) {
            return Double.class;
        }
        if (clazz.equals(Float.TYPE)) {
            return Float.class;
        }
        if (clazz.equals(Short.TYPE)) {
            return Short.class;
        }
        if (clazz.equals(Integer.TYPE)) {
            return Integer.class;
        }
        if (clazz.equals(Long.TYPE)) {
            return Long.class;
        }
        if (clazz.equals(Character.TYPE)) {
            return Character.class;
        }
        if (clazz.equals(Byte.TYPE)) {
            return Byte.class;
        }
        if (clazz.equals(Void.TYPE)) {
            return Void.class;
        }
        return null;
    }

    public static Class<?> b(Class<?> clazz) {
        if (clazz.equals(Boolean.class)) {
            return Boolean.TYPE;
        }
        if (clazz.equals(Double.class)) {
            return Double.TYPE;
        }
        if (clazz.equals(Float.class)) {
            return Float.TYPE;
        }
        if (clazz.equals(Short.class)) {
            return Short.TYPE;
        }
        if (clazz.equals(Integer.class)) {
            return Integer.TYPE;
        }
        if (clazz.equals(Long.class)) {
            return Long.TYPE;
        }
        if (clazz.equals(Character.class)) {
            return Character.TYPE;
        }
        if (clazz.equals(Byte.class)) {
            return Byte.TYPE;
        }
        if (clazz.equals(Void.class)) {
            return Void.TYPE;
        }
        return null;
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public boolean c() {
        return true;
    }

    @Override
    public String a(fkr_2 fkr_22, fyw_0 fyw_02, Class<? extends Object> clazz, String object, fya_0 fya_02) {
        Object object2 = this.b(clazz, (String)object);
        if (object2 instanceof Number) {
            object = "(" + clazz.getName() + ")" + String.valueOf(object2);
            if (clazz.equals(Float.class) || clazz.equals(Float.TYPE)) {
                object = (String)object + "f";
            }
        } else {
            object = clazz.equals(Character.class) ? "'" + (String)object + "'" : (object2 == null ? "null" : object2.toString());
        }
        fkr_22.a(clazz);
        return object;
    }
}

