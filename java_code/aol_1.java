/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

/*
 * Renamed from aol
 */
public class aol_1 {
    protected static final Logger a = Logger.getLogger(aol_1.class);
    private final Class<? extends apy_1> e;
    private final boolean f;
    private final String[] g;
    public static final String b = "(\"([^\"\\\\]|\\\\(.|\n))*\")";
    public static final String c = "([a-zA-Z]+)";
    public static final String d = "([0-9]+)";
    private String h = "";

    public aol_1(Class<? extends apy_1> clazz, String ... stringArray) {
        this(clazz, true, stringArray);
    }

    public aol_1(Class<? extends apy_1> clazz, boolean bl, String ... stringArray) {
        this.e = clazz;
        this.g = this.a(stringArray);
        this.f = bl;
        boolean bl2 = true;
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k < stringArray.length; ++k) {
            if (Pattern.matches(c, stringArray[k]) || Pattern.matches(b, stringArray[k]) || Pattern.matches(d, stringArray[k])) continue;
            if (!bl2) {
                stringBuilder.append('|');
            }
            stringBuilder.append(stringArray[k].replaceAll("([^a-zA-Z0-9])", "\\\\$1"));
            bl2 = false;
        }
        this.h = stringBuilder.toString();
        if (!bl2) {
            this.h = "(" + this.h + ")";
        }
    }

    public apy_1 b(String string) {
        apy_1 apy_12 = null;
        try {
            Constructor<? extends apy_1> constructor = this.e.getConstructor(String.class);
            apy_12 = constructor.newInstance(string);
        }
        catch (InstantiationException instantiationException) {
            a.error((Object)"InstantiationException during getLexem", (Throwable)instantiationException);
        }
        catch (IllegalAccessException illegalAccessException) {
            a.error((Object)"IllegalAccessException during getLexem", (Throwable)illegalAccessException);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            a.error((Object)"NoSuchMethodException during getLexem", (Throwable)noSuchMethodException);
        }
        catch (InvocationTargetException invocationTargetException) {
            a.error((Object)"InvocationTargetException during getLexem", (Throwable)invocationTargetException);
        }
        return apy_12;
    }

    public boolean a(String string) {
        for (String string2 : this.g) {
            if ((!this.f || !string2.equalsIgnoreCase(string)) && (this.f || !string2.equals(string))) continue;
            return true;
        }
        return false;
    }

    public String a() {
        return this.h;
    }

    private String[] a(String[] stringArray) {
        return this.a(stringArray, stringArray.length - 1);
    }

    private String[] a(String[] stringArray, int n) {
        if (n > 0) {
            this.a(stringArray, n - 1);
            for (int k = 0; k < n; ++k) {
                if (stringArray[k].length() > stringArray[n].length() || stringArray[k].length() >= stringArray[n].length()) continue;
                String string = stringArray[n];
                stringArray[n] = stringArray[k];
                stringArray[k] = string;
            }
        }
        return stringArray;
    }
}

