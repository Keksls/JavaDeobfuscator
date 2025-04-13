/*
 * Decompiled with CFR 0.152.
 */
import java.util.Hashtable;

/*
 * Renamed from aMu
 */
public class amu_1 {
    private static final Hashtable<String, amt_1> a = new Hashtable();

    public static void a(String string, byte by) {
        for (amt_1 amt_12 : a.values()) {
            amt_12.a(new abo_2<Byte, String>(by, string));
        }
    }

    public static void a(Class clazz) {
        a.remove(clazz.getName());
    }

    public static amt_1 a(Class clazz, amt_1 amt_12) {
        String string = clazz.getName();
        if (a.containsKey(string)) {
            return a.get(string);
        }
        return a.put(string, amt_12);
    }
}

