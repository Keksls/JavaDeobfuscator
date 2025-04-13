/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringEscapeUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.HashMap;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aNj
 */
public class anj_2 {
    private static final Logger a = Logger.getLogger(anj_2.class);

    public static ani_2 a(@NotNull String string) {
        arb_1 arb_12;
        ani_2 ani_22 = new ani_2();
        arm_2 arm_22 = new arm_2(new arj_2(new StringBuilder(string)));
        while ((arb_12 = arm_22.b()) != null) {
            Object object;
            String string2;
            Object object2;
            if (arb_12 instanceof arg_2) {
                object2 = ((arg_2)arb_12).f();
                string2 = StringEscapeUtils.unescapeHtml4((String)object2);
                string2 = StringUtils.replaceChars((String)string2, (char)'\u2019', (char)'\'');
                ani_22.a((CharSequence)string2);
                continue;
            }
            if (!(arb_12 instanceof arf_2)) continue;
            object2 = (arf_2)arb_12;
            string2 = object2.f();
            if ("b".equalsIgnoreCase(string2) || "strong".equalsIgnoreCase(string2)) {
                if (object2.h()) {
                    ani_22.b();
                    continue;
                }
                ani_22.a();
                continue;
            }
            if ("i".equalsIgnoreCase(string2)) {
                if (object2.h()) {
                    ani_22.f();
                    continue;
                }
                ani_22.e();
                continue;
            }
            if ("u".equalsIgnoreCase(string2)) {
                if (object2.h()) {
                    ani_22.h();
                    continue;
                }
                ani_22.g();
                continue;
            }
            if ("s".equalsIgnoreCase(string2)) {
                if (object2.h()) {
                    ani_22.d();
                    continue;
                }
                ani_22.c();
                continue;
            }
            if ("font".equalsIgnoreCase(string2)) {
                if (object2.h()) {
                    ani_22.j();
                    continue;
                }
                boolean bl = false;
                for (ara_1 ara_12 : object2.i()) {
                    object = ara_12.b();
                    if ("size".equalsIgnoreCase((String)object)) {
                        ani_22.a(Integer.parseInt(ara_12.a()));
                        bl = true;
                        continue;
                    }
                    if ("color".equalsIgnoreCase((String)object)) {
                        String string3 = anj_2.b(ara_12.a());
                        if (string3 == null) continue;
                        ani_22.a(string3);
                        bl = true;
                        continue;
                    }
                    if (!"face".equalsIgnoreCase((String)object)) continue;
                    ani_22.b(ara_12.a());
                    bl = true;
                }
                if (bl) continue;
                ani_22.i();
                continue;
            }
            if ("br".equalsIgnoreCase(string2)) {
                ani_22.a('\n');
                continue;
            }
            if ("p".equalsIgnoreCase(string2)) {
                ani_22.a('\n');
                continue;
            }
            if (!"span".equalsIgnoreCase(string2)) continue;
            if (object2.h()) {
                ani_22.j();
                continue;
            }
            ani_22.i();
            for (ara_1 ara_13 : object2.i()) {
                String string4 = ara_13.b();
                if (!"style".equalsIgnoreCase(string4)) continue;
                object = anj_2.c(ara_13.a());
                for (String string5 : ((HashMap)object).keySet()) {
                    String string6;
                    if ("color".equalsIgnoreCase(string5)) {
                        string6 = anj_2.b((String)((HashMap)object).get(string5));
                        if (string6 == null) continue;
                        ani_22.a(string6);
                        continue;
                    }
                    if ("font-family".equalsIgnoreCase(string5)) {
                        string6 = (String)((HashMap)object).get(string5);
                        String string7 = string6.contains(",") ? StringUtils.split((String)string6, (char)',')[0].trim() : string6;
                        ani_22.b(string7);
                        continue;
                    }
                    if ("font-size".equalsIgnoreCase(string5)) {
                        string6 = (String)((HashMap)object).get(string5);
                        if (!string6.endsWith("px")) continue;
                        try {
                            int n = Integer.parseInt(string6.substring(0, string6.length() - 2));
                            ani_22.a(n);
                        }
                        catch (NumberFormatException numberFormatException) {
                            a.error((Object)("Error while reading font size : invalid size " + string6));
                        }
                        continue;
                    }
                    if (!"text-align".equalsIgnoreCase(string5)) continue;
                    string6 = (String)((HashMap)object).get(string5);
                    if ("center".equalsIgnoreCase(string6)) {
                        ani_22.n();
                        continue;
                    }
                    if ("right".equalsIgnoreCase(string6)) {
                        ani_22.o();
                        continue;
                    }
                    if (!"left".equalsIgnoreCase(string6)) continue;
                    ani_22.p();
                }
            }
        }
        return ani_22;
    }

    private static String b(String string) {
        if (string == null) {
            return null;
        }
        if (string.startsWith("#")) {
            string = string.substring(1);
        }
        if (string.length() < 6) {
            return null;
        }
        return string.substring(0, 6);
    }

    private static HashMap<String, String> c(String string) {
        String[] stringArray;
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (String string2 : stringArray = StringUtils.split((String)string, (char)';')) {
            String[] stringArray2 = StringUtils.split((String)string2, (char)':');
            if (stringArray2.length < 2) {
                a.error((Object)("Invalid css property : '" + string2 + "' in css string : '" + string + "'"));
                continue;
            }
            String string3 = stringArray2[0].trim();
            String string4 = stringArray2[1].trim();
            hashMap.put(string3, string4);
        }
        return hashMap;
    }

    public static void a(String[] stringArray) {
        int n = 8217;
        int n2 = 8217;
        int n3 = 326;
        System.out.println(true);
        System.out.println(false);
    }
}

