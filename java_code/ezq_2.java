/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from ezQ
 */
public final class ezq_2 {
    private static final String a = "~";
    private static final String b = "|";
    private static final String c = "name";
    private static final String d = "value";

    public static Object a(String string, ezs_2 ezs_22, ArrayList<abo_2<String, String>> arrayList) {
        if (string == null) {
            return null;
        }
        String string2 = string;
        if (arrayList != null) {
            for (abo_2<String, String> abo_22 : arrayList) {
                string2 = string2.replaceAll("(?i)(\\$\\$" + abo_22.a() + ")", abo_22.b());
            }
        }
        switch (ezs_22) {
            case c: {
                return Short.parseShort(string2);
            }
            case a: {
                return Integer.parseInt(string2);
            }
            case b: {
                return Long.parseLong(string2);
            }
            case d: {
                return string2;
            }
        }
        throw new IllegalArgumentException("Pas de type connu ? WTF ?");
    }

    public static Object[] a(String[] stringArray, ezs_2 ezs_22, ArrayList<abo_2<String, String>> arrayList) {
        Object[] objectArray;
        if (stringArray == null) {
            return null;
        }
        switch (ezs_22) {
            case c: {
                objectArray = new Short[stringArray.length];
                break;
            }
            case a: {
                objectArray = new Integer[stringArray.length];
                break;
            }
            case b: {
                objectArray = new Long[stringArray.length];
                break;
            }
            case d: {
                objectArray = new String[stringArray.length];
                break;
            }
            default: {
                throw new IllegalArgumentException("Pas de type connu ? WTF ?");
            }
        }
        for (int k = 0; k < stringArray.length; ++k) {
            objectArray[k] = ezq_2.a(stringArray[k], ezs_22, arrayList);
        }
        return objectArray;
    }

    /*
     * WARNING - void declaration
     */
    public static ArrayList<abo_2<String, String>> a(String string) {
        String[] stringArray;
        ArrayList<abo_2<String, String>> arrayList = new ArrayList<abo_2<String, String>>();
        for (String string2 : stringArray = Cz.e(string, a)) {
            void object;
            if (string2.length() == 0) continue;
            if (string2.endsWith(b)) {
                String string3 = string2 + " ";
            }
            String[] stringArray2 = Cz.e((String)object, b);
            abo_2<String, String> abo_22 = new abo_2<String, String>();
            for (int k = 0; k < stringArray2.length; k += 2) {
                if (stringArray2[k].equalsIgnoreCase(c)) {
                    abo_22.a(stringArray2[k + 1] == null ? "" : stringArray2[k + 1]);
                    continue;
                }
                if (!stringArray2[k].equalsIgnoreCase(d)) continue;
                abo_22.b(stringArray2[k + 1] == null ? "" : stringArray2[k + 1]);
            }
            arrayList.add(abo_22);
        }
        return arrayList;
    }
}

