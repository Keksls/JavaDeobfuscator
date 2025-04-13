/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class fzr {
    public static final String[] e = new String[0];
    private static final Pattern a = Pattern.compile("(^([a-zA-Z.]+):)?([a-zA-Z]+)(\\(([!]?([_a-zA-Z0-9\\-\\.~#]+([,]?[\\s]*[!]?[_a-zA-Z0-9\\-\\.~#]+)*)*)\\))?");
    public static final String f = ";";
    public static final String g = "!";
    protected static final Logger h = Logger.getLogger(fzr.class);
    protected String[] i;
    protected String j = null;
    protected fyy_0 k = null;

    public void a(String string) {
        this.j = string;
        this.i = Cz.e(string, f);
    }

    public void a(String string, fyy_0 fyy_02) {
        this.j = string;
        this.i = Cz.e(string, f);
        this.k = fyy_02;
    }

    public void a(fyy_0 fyy_02) {
        this.k = fyy_02;
    }

    public Object b() {
        Object object = null;
        for (String string : this.i) {
            Matcher matcher = a.matcher(string);
            if (!matcher.matches()) {
                h.error((Object)("Erreur de syntaxe : '" + string + "' n'est pas du type 'package:method(param1,param2,...)'."));
                continue;
            }
            String string2 = matcher.group(2);
            String string3 = matcher.group(3);
            String string4 = matcher.group(5);
            String[] stringArray = string4 != null ? Cz.a(string4, ',') : e;
            object = this.a(string2, string3, stringArray);
        }
        return object;
    }

    private Object a(String string, String string2, String[] stringArray) {
        Method[] methodArray;
        ArrayList arrayList = new ArrayList();
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        this.a(stringArray, arrayList, arrayList2);
        Class<?> clazz = fpm_0.b().f(string);
        if (clazz == null) {
            String string3 = (String)(string != null ? string + ":" : "") + string2 + "(" + fzr.a(arrayList) + ")";
            h.warn((Object)String.format("La m\u00e9thode : %s est inconnue !", string3), (Throwable)new fzw(string3));
            return null;
        }
        for (Method method : methodArray = clazz.getMethods()) {
            if (!method.getName().equals(string2)) continue;
            boolean bl = false;
            Class<?>[] classArray = method.getParameterTypes();
            if (classArray.length > arrayList.size()) continue;
            for (int exception = 0; exception < classArray.length; ++exception) {
                Class<?> clazz2 = classArray[exception];
                if (arrayList.size() <= exception) {
                    bl = false;
                } else if (clazz2.isArray()) {
                    if (clazz2.isAssignableFrom((Class)arrayList.get(exception))) {
                        bl = true;
                    } else {
                        int n = 0;
                        int n2 = arrayList.size();
                        for (int object = exception; object < n2 && clazz2.getComponentType().isAssignableFrom((Class)arrayList.get(object)); ++object) {
                            ++n;
                        }
                        if (n > 0) {
                            Object object = Array.newInstance(clazz2.getComponentType(), n);
                            for (int k = 0; k < n; ++k) {
                                arrayList.remove(exception);
                                Array.set(object, k, arrayList2.remove(exception));
                            }
                            arrayList2.add(exception, object);
                            arrayList.add(exception, clazz2);
                        } else {
                            bl = false;
                        }
                    }
                } else {
                    bl = classArray[exception].isAssignableFrom((Class)arrayList.get(exception));
                }
                if (!bl) break;
            }
            if (classArray.length != arrayList.size()) {
                bl = false;
            }
            if (!bl) continue;
            try {
                return method.invoke(null, arrayList2.toArray());
            }
            catch (Exception exception) {
                h.error((Object)("Erreur lors du invokeCallBack sur la m\u00e9thode " + method.getName() + " de la classe " + clazz.getName()), (Throwable)exception);
                if (exception.getCause() != null) {
                    h.error((Object)"Raison : ", exception.getCause());
                }
                return null;
            }
        }
        String string3 = (String)(string != null ? string + ":" : "") + string2 + "(" + fzr.a(arrayList) + ")";
        h.warn((Object)String.format("La m\u00e9thode : %s est inconnue !", string3), (Throwable)new fzw(string3));
        return null;
    }

    protected void a(String[] stringArray, List<Class<?>> list, List<Object> list2) {
        for (int k = 0; k < stringArray.length; ++k) {
            Object object;
            fyb_0 fyb_03 = null;
            boolean bl = stringArray[k].startsWith(g);
            String string = stringArray[k].replace(g, "");
            if (this.k != null) {
                if (bl) {
                    fyb_03 = this.k.a(string, (fyb_0 fyb_02) -> !fyb_02.isATemplate());
                    if (fyb_03 == null) {
                        object = this.k;
                        while (fyb_03 == null && ((fyy_0)object).e() != null) {
                            object = ((fyy_0)object).e();
                            fyb_03 = ((fyy_0)object).a(string, (fyb_0 fyb_02) -> !fyb_02.isATemplate());
                        }
                    }
                } else {
                    fyb_03 = this.k.a(string);
                }
            }
            if (fyb_03 != null) {
                object = fyb_03.getElementValue();
                if (object == null) continue;
                list.add(object.getClass());
                list2.add(object);
                continue;
            }
            if (string.isEmpty()) continue;
            list.add(String.class);
            list2.add(string);
        }
    }

    private static String a(List<Class<?>> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Class<?> clazz : list) {
            stringBuilder.append(',').append(clazz.getName());
        }
        return stringBuilder.toString().substring(1);
    }
}

