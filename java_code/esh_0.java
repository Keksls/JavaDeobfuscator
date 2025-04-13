/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from esh
 */
public class esh_0 {
    public static byte a(String string, List<aov_1[]> list, List<aot_2> list2) {
        if (list2 == null) {
            return -1;
        }
        for (byte by = 0; by < list.size(); by = (byte)(by + 1)) {
            aov_1[] aov_1Array = list.get(by);
            boolean bl = true;
            boolean bl2 = false;
            int n = 0;
            int n2 = aov_1Array.length - 1;
            for (int n3 = 0; n3 < list2.size(); n3 = (int)((byte)(n3 + 1))) {
                boolean bl3;
                if (n > n2) {
                    bl2 = true;
                    break;
                }
                aov_1 aov_12 = list2.get(n3).t_();
                if (aov_1Array[n] == aov_1.d && aov_12 != aov_1.d) {
                    bl = false;
                    bl3 = true;
                    while (n3 < list2.size()) {
                        if (aov_12 != aov_1.b) {
                            bl3 = false;
                            break;
                        }
                        n3 = (byte)(n3 + 1);
                    }
                    if (bl3) {
                        if (n != n2) {
                            bl2 = true;
                            break;
                        }
                        return by;
                    }
                    n3 = (byte)(n3 - 1);
                    n = (byte)(n + 1);
                    continue;
                }
                if (aov_1Array[n] == aov_1.e) {
                    bl = false;
                    bl3 = true;
                    while (n3 < list2.size()) {
                        if (aov_12 != aov_1.a) {
                            bl3 = false;
                            break;
                        }
                        n3 = (byte)(n3 + 1);
                    }
                    if (bl3) {
                        if (n != n2) {
                            bl2 = true;
                            break;
                        }
                        return by;
                    }
                    n3 = (byte)(n3 - 1);
                    n = (byte)(n + 1);
                    continue;
                }
                if (aov_12 != aov_1Array[n]) {
                    bl2 = true;
                    break;
                }
                n = (byte)(n + 1);
            }
            if (bl2 || bl && list2.size() != aov_1Array.length) continue;
            return by;
        }
        String string2 = "La fonction " + string + " n'est pas utilis\u00e9e avec le bon nombre (ou type) d'arguments. \n";
        string2 = string2 + "Les arguments possibles sont :";
        string2 = string2 + esh_0.a(list);
        throw new aos_2(string2);
    }

    private static String a(Iterable<aov_1[]> iterable) {
        StringBuilder stringBuilder = new StringBuilder();
        for (aov_1[] aov_1Array : iterable) {
            stringBuilder.append("\n (");
            esh_0.a(stringBuilder, aov_1Array);
            stringBuilder.append(')');
        }
        return stringBuilder.toString();
    }

    private static void a(StringBuilder stringBuilder, aov_1 ... aov_1Array) {
        int n = aov_1Array.length;
        if (n == 0) {
            return;
        }
        stringBuilder.append(aov_1Array[0].name());
        for (int n2 = 1; n2 < n; n2 = (int)((byte)(n2 + 1))) {
            stringBuilder.append(", ").append(aov_1Array[n2].name());
        }
    }
}

