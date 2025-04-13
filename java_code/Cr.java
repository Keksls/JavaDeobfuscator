/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class Cr {
    static final Logger r = Logger.getLogger(Cr.class);
    public static final Pattern a = Pattern.compile("\\{((\\[[^\\[\\]\\{\\}?:]*\\])+)\\s*\\?([^\\{\\}]*):([^\\{\\}]*)\\}");
    public static final Pattern b = Pattern.compile("\\[([^\\[\\]]*)([~\\*\\+\\-><!=])([^\\[\\]]*)\\]");
    public static final Pattern c = Pattern.compile("\\[((,)*[\\\u00a3#])([0-9]+)(?:.([0-9]+))?\\]");
    public static final Pattern d;
    public static final Pattern e;
    private static final String s = "(\\s*:\\s*(west|east|center))?(\\s*:\\s*([0-9]+)x([0-9]+))?";
    protected static final Pattern f;
    protected static final Pattern g;
    public static final byte h = 0;
    protected static byte i;
    public static final String j = "Unknown";
    protected static String k;
    protected static String l;
    protected static String m;
    protected static Callable<String> n;
    protected static Callable<String> o;
    protected static Callable<String> p;
    public static cb_0 q;

    public static byte a() {
        return i;
    }

    public static String a(String string, Object ... objectArray) {
        String string2;
        boolean bl;
        Object object;
        Object object2;
        do {
            object2 = new StringBuilder();
            object = a.matcher(string);
            while (((Matcher)object).find()) {
                bl = true;
                String string3 = ((Matcher)object).group(1);
                Matcher matcher = b.matcher(string3);
                block16: while (matcher.find()) {
                    string2 = matcher.group(1);
                    int n = 1;
                    if (string2.length() > 0) {
                        n = Co.c(string2);
                    }
                    int n2 = matcher.group(2).charAt(0);
                    String string4 = matcher.group(3);
                    int n3 = -1;
                    if (string4.length() > 0) {
                        n3 = Co.c(string4);
                    }
                    switch (n2) {
                        case 60: {
                            if (objectArray.length < n3) continue block16;
                            bl &= Cr.b(objectArray[n3 - 1], n);
                            continue block16;
                        }
                        case 62: {
                            if (objectArray.length < n3) continue block16;
                            bl &= Cr.a(objectArray[n3 - 1], n);
                            continue block16;
                        }
                        case 61: {
                            if (objectArray.length < n3) continue block16;
                            bl &= Cr.c(objectArray[n3 - 1], n);
                            continue block16;
                        }
                        case 126: {
                            bl &= objectArray.length >= n3 && (objectArray[n3 - 1] != null && !Cr.c(objectArray[n3 - 1], 0) || objectArray[n3 - 1] instanceof String && !Cr.a((String)objectArray[n3 - 1], ""));
                            continue block16;
                        }
                        case 33: {
                            bl &= objectArray.length < n3 || objectArray[n3 - 1] == null || Cr.c(objectArray[n3 - 1], 0) || objectArray[n3 - 1] instanceof String && Cr.a((String)objectArray[n3 - 1], "");
                            continue block16;
                        }
                        case 43: {
                            bl &= objectArray.length >= n3 && objectArray[n3 - 1] != null && Cr.b(objectArray[n3 - 1], 0, false);
                            continue block16;
                        }
                        case 45: {
                            bl &= objectArray.length >= n3 && objectArray[n3 - 1] != null && !Cr.b(objectArray[n3 - 1], 0, false);
                            continue block16;
                        }
                        case 42: {
                            bl &= Cr.a(n);
                            continue block16;
                        }
                    }
                    r.error((Object)("Impossible de formatter l'expression : " + string));
                }
                if (bl) {
                    ((Matcher)object).appendReplacement((StringBuilder)object2, ((Matcher)object).group(3));
                    continue;
                }
                ((Matcher)object).appendReplacement((StringBuilder)object2, ((Matcher)object).group(4));
            }
            ((Matcher)object).appendTail((StringBuilder)object2);
        } while (a.matcher(string = ((StringBuilder)object2).toString()).find());
        object2 = c.matcher(string);
        object = new StringBuilder();
        while (((Matcher)object2).find()) {
            bl = ((Matcher)object2).group(1).charAt(0) == '\u00a3';
            int n = Co.c(((Matcher)object2).group(3)) - 1;
            int n4 = ((Matcher)object2).groupCount() == 4 ? Co.c(((Matcher)object2).group(4)) : 0;
            if (objectArray.length <= n || objectArray[n] == null) continue;
            string2 = Cr.a(objectArray[n], bl, n4);
            ((Matcher)object2).appendReplacement((StringBuilder)object, string2);
        }
        ((Matcher)object2).appendTail((StringBuilder)object);
        object2 = d.matcher(((StringBuilder)object).toString());
        object = new StringBuilder();
        while (((Matcher)object2).find()) {
            String string5 = ((Matcher)object2).group(1);
            Cs cs = Cs.a(string5);
            if (cs == null) {
                r.error((Object)("Tag inconnu : " + string5));
                continue;
            }
            ((Matcher)object2).appendReplacement((StringBuilder)object, cs.b());
        }
        ((Matcher)object2).appendTail((StringBuilder)object);
        String string6 = ((StringBuilder)object).toString();
        object2 = e.matcher(string6);
        object = new StringBuilder();
        while (((Matcher)object2).find()) {
            String[] stringArray = ((Matcher)object2).group(1).split("\\|");
            int n = ((Matcher)object2).end();
            if (string6.length() <= n) continue;
            boolean bl2 = false;
            for (String string7 : stringArray) {
                if (!string6.substring(n).startsWith(string7)) continue;
                ((Matcher)object2).appendReplacement((StringBuilder)object, ((Matcher)object2).group(3));
                bl2 = true;
                break;
            }
            if (bl2) continue;
            ((Matcher)object2).appendReplacement((StringBuilder)object, ((Matcher)object2).group(4));
        }
        ((Matcher)object2).appendTail((StringBuilder)object);
        if (q != null) {
            object2 = f.matcher(((StringBuilder)object).toString());
            object = new StringBuilder();
            while (((Matcher)object2).find()) {
                String string8 = ((Matcher)object2).group(2);
                String string9 = ((Matcher)object2).group(4);
                int n = Co.a((Object)((Matcher)object2).group(6), -1);
                int n5 = Co.a((Object)((Matcher)object2).group(7), -1);
                try {
                    ((Matcher)object2).appendReplacement((StringBuilder)object, q.a(CC.a, string8, string9, n, n5));
                }
                catch (Exception exception) {
                    r.warn((Object)exception.getMessage());
                }
            }
            ((Matcher)object2).appendTail((StringBuilder)object);
            object2 = g.matcher(((StringBuilder)object).toString());
            object = new StringBuilder();
            while (((Matcher)object2).find()) {
                String string10 = ((Matcher)object2).group(2);
                String string11 = ((Matcher)object2).group(4);
                int n = Co.a((Object)((Matcher)object2).group(6), -1);
                int n6 = Co.a((Object)((Matcher)object2).group(7), -1);
                try {
                    ((Matcher)object2).appendReplacement((StringBuilder)object, q.a(CC.b, string10, string11, n, n6));
                }
                catch (Exception exception) {
                    r.warn((Object)exception.getMessage());
                }
            }
            ((Matcher)object2).appendTail((StringBuilder)object);
        }
        return ((StringBuilder)object).toString();
    }

    protected static boolean a(int n) {
        if (n > 127) {
            r.error((Object)("Constante trop grande pour le test du sex de l'interlocuteur : " + n));
            return false;
        }
        return (byte)n == i;
    }

    protected static boolean a(Object object, int n) {
        return Cr.b(object, n, true);
    }

    protected static boolean b(Object object, int n) {
        return Cr.a(object, n, true);
    }

    public static boolean a(Object object, int n, boolean bl) {
        Number number = Cr.a(object);
        if (number == null) {
            return false;
        }
        if (bl) {
            number = Math.ceil(number.doubleValue());
        }
        return number.doubleValue() < (double)n;
    }

    public static boolean b(Object object, int n, boolean bl) {
        Number number = Cr.a(object);
        if (number == null) {
            return false;
        }
        if (bl) {
            number = Math.ceil(number.doubleValue());
        }
        return number.doubleValue() > (double)n;
    }

    public static boolean c(Object object, int n) {
        Number number = Cr.a(object);
        if (number == null) {
            return false;
        }
        return number.doubleValue() == (double)n;
    }

    protected static boolean a(String string, String string2) {
        return string.equals(string2);
    }

    protected static String a(Object object, boolean bl, int n) {
        if (object instanceof String) {
            if (bl || n > 0) {
                object = Co.d(object);
            } else if (Cz.g((String)object)) {
                object = Co.f(object);
            } else {
                return object.toString();
            }
        }
        if (!(object instanceof Number)) {
            return object.toString();
        }
        double d2 = ((Number)object).doubleValue();
        if (n > 0 && object instanceof Hz) {
            d2 = ((Hz)object).a();
        }
        if (n == 0) {
            d2 = Hw.b(d2);
        } else if (n > 0) {
            d2 = Hw.a(d2, n);
        }
        if (bl) {
            d2 = Math.abs(d2);
        }
        return Oy.d().a(d2);
    }

    public static void a(byte by) {
        i = by;
    }

    public static void a(String string) {
        k = string;
    }

    public static void b(String string) {
        l = string;
    }

    public static void c(String string) {
        m = string;
    }

    public static void a(Callable<String> callable) {
        n = callable;
    }

    public static void b(Callable<String> callable) {
        o = callable;
    }

    public static void c(Callable<String> callable) {
        p = callable;
    }

    protected static Number a(Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof Number) {
            return (Number)object;
        }
        if (object instanceof String) {
            return Co.a(object, 0.0);
        }
        return null;
    }

    static {
        e = Pattern.compile("((\\|.*)+)\\?([^\\|]*):([^\\|]*)\\|");
        Object object = "\\[#(";
        for (Cs cs : Cs.values()) {
            if (cs != Cs.values()[0]) {
                object = (String)object + "|";
            }
            object = (String)object + cs.a();
        }
        object = (String)object + ")\\]";
        d = Pattern.compile((String)object);
        f = Pattern.compile("\\[(#icon)\\s*([0-9]+)(\\s*:\\s*(west|east|center))?(\\s*:\\s*([0-9]+)x([0-9]+))?\\]");
        g = Pattern.compile("\\[(#charac)\\s*([^:\\]\\s]+)(\\s*:\\s*(west|east|center))?(\\s*:\\s*([0-9]+)x([0-9]+))?\\]");
        i = 0;
        k = j;
        l = j;
        m = j;
        n = () -> j;
        o = () -> j;
        p = () -> j;
        q = null;
    }
}

