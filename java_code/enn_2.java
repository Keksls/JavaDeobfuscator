/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.google.common.collect.Lists
 *  org.apache.commons.lang3.StringUtils
 */
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/*
 * Renamed from enN
 */
public final class enn_2 {
    private static final String a = "";

    public static Object a(ent_2 ent_22, String string) {
        switch (ent_22) {
            case a: {
                return Boolean.valueOf(string);
            }
            case b: {
                return Long.valueOf(string);
            }
            case c: {
                return string;
            }
            case d: {
                return Lists.newArrayList((Object[])string.split("\\|"));
            }
            case e: {
                String[] stringArray;
                ArrayList<Long> arrayList = new ArrayList<Long>();
                if (Strings.isNullOrEmpty((String)string)) {
                    return arrayList;
                }
                for (String string2 : stringArray = string.split("\\|")) {
                    arrayList.add(Long.valueOf(string2));
                }
                return arrayList;
            }
            case f: {
                int[] nArray = new int[4];
                String[] stringArray = string.split("\\|");
                for (int k = 0; k < stringArray.length; ++k) {
                    int n;
                    String string3 = stringArray[k];
                    if (string3.isEmpty() || (n = Co.a((Object)string3, Integer.MIN_VALUE)) == Integer.MIN_VALUE) continue;
                    nArray[k] = n;
                }
                return new ww_0(nArray[0], nArray[1], nArray[2], nArray[3]);
            }
            case g: {
                return Float.valueOf(Co.a((Object)string, 0.0f));
            }
        }
        return null;
    }

    public static String a(String string) {
        ens_2 ens_22 = ens_2.a(string);
        if (ens_22 == null) {
            return a;
        }
        ent_2 ent_22 = ens_22.e();
        switch (ent_22) {
            case a: {
                return enn_2.e(ens_22);
            }
            case b: {
                return enn_2.d(ens_22);
            }
            case c: {
                return enn_2.c(ens_22);
            }
            case d: {
                return enn_2.b(ens_22);
            }
            case e: {
                return enn_2.a(ens_22);
            }
            case f: {
                return enn_2.a(ens_22);
            }
            case g: {
                return enn_2.f(ens_22);
            }
        }
        return a;
    }

    private static String a(ens_2 ens_22) {
        List<Long> list = enp_2.a.h(ens_22);
        return StringUtils.join(list, (String)"|");
    }

    private static String b(ens_2 ens_22) {
        ArrayList<String> arrayList = enp_2.a.f(ens_22);
        return StringUtils.join(arrayList, (String)"|");
    }

    private static String c(ens_2 ens_22) {
        return enp_2.a.e(ens_22);
    }

    private static String d(ens_2 ens_22) {
        long l = enp_2.a.c(ens_22);
        return Long.toString(l);
    }

    private static String e(ens_2 ens_22) {
        boolean bl = enp_2.a.d(ens_22);
        return Boolean.toString(bl);
    }

    private static String f(ens_2 ens_22) {
        double d2 = enp_2.a.i(ens_22);
        return Double.toString(d2);
    }
}

