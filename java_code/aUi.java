/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class aUi {
    private static final Logger a = Logger.getLogger(aUi.class);
    private static final aUi b = new aUi();
    private static final Pattern c = Pattern.compile("\\[([^\\[|]+)\\|(.+?)\\]");
    private static final Pattern d = Pattern.compile("<O(?:(=(\\d+))|((\\d+);(.*?)))>");
    private static final int e = 5;
    private static final int f = 501;
    private int g = 0;
    private final List<auk_0> h = new ArrayList<auk_0>();
    private final Map<String, exk_2> i = new HashMap<String, exk_2>();
    private static final int j = 501;

    private static String c() {
        return "(" + bae.h().a("chat.unknownObject", new Object[0]) + ")";
    }

    private aUi() {
    }

    public static aUi a() {
        return b;
    }

    public static void a(Object object) {
        aUi.a((auc_0)aUxx.a().f().h(), object);
    }

    public static void a(auc_0 auc_02, Object object) {
        if (!(object instanceof eAM)) {
            return;
        }
        aUi.a(auc_02, (eAM)object);
    }

    public static void a(eAM eAM2) {
        aUi.a((auc_0)aUxx.a().f().h(), eAM2);
    }

    public static void a(auc_0 auc_02, eAM eAM2) {
        boolean bl;
        if (auc_02 == null) {
            return;
        }
        String string = (String)auc_02.b("input");
        boolean bl2 = bl = string != null && !string.isEmpty() && string.charAt(string.length() - 1) != ' ';
        if (eAM2.q() == null || eAM2.r() == null) {
            return;
        }
        auk_0 auk_02 = b.b(eAM2);
        if (auk_02 == null) {
            return;
        }
        int n = auk_02.a() + 1;
        String string2 = String.format("%s[%s|%s] ", bl ? " " : "", auk_02.c(), n);
        auc_02.c("input", string2);
        fis_1.a().a((ajf_1)auc_02, "input");
    }

    @Nullable
    private auk_0 b(eAM eAM2) {
        return this.a(eAN.a(eAM2.p(), eAM2.q()), eAM2.r());
    }

    private auk_0 a(String string, String string2) {
        for (int k = 0; k < this.h.size(); ++k) {
            if (!this.h.get(k).b().equals(string)) continue;
            return this.h.get(k);
        }
        if (this.g >= 501) {
            this.g = 0;
        }
        auk_0 auk_02 = new auk_0(this.g, string, string2);
        if (this.g >= this.h.size()) {
            this.h.add(auk_02);
        } else {
            this.h.set(this.g, auk_02);
        }
        ++this.g;
        return auk_02;
    }

    @Nullable
    public String a(String string) {
        String string2 = string;
        Matcher matcher = c.matcher(string2);
        int n = 0;
        while (matcher.find()) {
            if (!StringUtils.isNumeric((CharSequence)matcher.group(2))) {
                aUh.a("error.chat.cannotRetrieveItems", new Object[0]);
                return null;
            }
            int n2 = Integer.parseInt(matcher.group(2)) - 1;
            if (n2 < 0 || n2 >= this.h.size()) {
                aUh.a("error.chat.cannotRetrieveItems", new Object[0]);
                return null;
            }
            auk_0 auk_02 = this.h.get(n2);
            if (auk_02 == null || !auk_02.c().equals(matcher.group(1))) {
                aUh.a("error.chat.cannotRetrieveItems", new Object[0]);
                return null;
            }
            if (n >= 5) {
                aUh.a("error.chat.tooManyItemsInOneMessage", 5);
                return null;
            }
            string2 = string2.replace(matcher.group(), aUi.c(auk_02.b()));
            ++n;
        }
        return string2.trim();
    }

    private static String c(@NotNull String string) {
        return String.format("<%s id=\"%s\"/>", "o", string);
    }

    public void b() {
        this.h.clear();
        this.g = 0;
    }

    public static String b(String string) {
        if (string == null) {
            return null;
        }
        String string2 = string;
        ArrayList<String> arrayList = new ArrayList<String>();
        Matcher matcher = d.matcher(string2);
        while (matcher.find()) {
            String string3 = matcher.group();
            if (matcher.group(1) == null) {
                eAN eAN2 = eAN.a(Integer.parseInt(matcher.group(4)));
                if (eAN2 == null || matcher.group(5) == null) {
                    string2 = aUi.a(string2, string3, aUi.c(), arrayList);
                    continue;
                }
                String string4 = aUi.b(eAN2, matcher.group(5));
                if (string4 == null) {
                    string2 = aUi.a(string2, string3, aUi.c(), arrayList);
                    continue;
                }
                string2 = aUi.a(string2, string3, string4, arrayList);
                continue;
            }
            int n = Integer.parseInt(matcher.group(2));
            string2 = StringUtils.replace((String)string2, (String)string3, (String)((String)arrayList.get(n)));
        }
        return string2;
    }

    @Nullable
    private static String a(String string, String string2, String string3, ArrayList<String> arrayList) {
        arrayList.add(string3);
        return StringUtils.replace((String)string, (String)string2, (String)string3);
    }

    private static String b(eAN eAN2, String string) {
        switch (eAN2) {
            case a: {
                return aUi.d(string);
            }
            case b: {
                return aUi.f(string);
            }
            case c: {
                return aUi.g(string);
            }
            case d: {
                return aUi.h(string);
            }
        }
        return null;
    }

    private static String d(String string) {
        String[] stringArray = string.split(";");
        if (stringArray.length < 1) {
            return null;
        }
        return aUi.a(eAN.a, Integer.parseInt(stringArray[0]), string, aUi.e(string));
    }

    private static short e(String string) {
        exk_2 exk_22 = exl_2.a(string);
        if (exk_22 == null || exk_22.e() <= 1) {
            return 0;
        }
        return exk_22.e();
    }

    private static String f(String string) {
        String[] stringArray = string.split(";");
        if (stringArray.length < 2) {
            return null;
        }
        return aUi.a(eAN.b, Integer.parseInt(stringArray[0]), string, 1);
    }

    private static String g(String string) {
        String[] stringArray = string.split(";");
        if (stringArray.length < 2) {
            return null;
        }
        return aUi.a(eAN.c, Integer.parseInt(stringArray[0]), string, Integer.parseInt(stringArray[1]));
    }

    private static String h(String string) {
        String[] stringArray = string.split(";");
        if (stringArray.length < 1) {
            return null;
        }
        return aUi.a(eAN.d, Integer.parseInt(stringArray[0]), string, 1);
    }

    private static String a(eAN eAN2, int n, String string, int n2) {
        String string2 = bae.h().a(15, (long)n, new Object[0]);
        return String.format("<u id=\"%s_%s\">%s%s</u> ", eAN2.b(), string, string2, aUi.b(n2));
    }

    private static String b(int n) {
        if (n <= 1) {
            return "";
        }
        return " (x" + n + ")";
    }

    public static String a(@NotNull exk_2 exk_22) {
        return "<u id=\"" + eAN.a.b() + "_" + exk_22.aT_() + ";" + exk_22.aq() + "\">" + bae.h().a(15, (long)exk_22.m(), new Object[0]) + "</u>";
    }

    public static String a(int n) {
        return "<u id=\"" + eAN.a.b() + "_" + n + "\">" + bae.h().a(15, (long)n, new Object[0]) + "</u>";
    }

    public static String a(long l) {
        return "<u id=\"" + eAN.e.b() + "_" + l + "\">" + bae.h().a("fight.open.report", new Object[0]) + "</u>";
    }

    public exk_2 a(eAN eAN2, String string) {
        exk_2 exk_22;
        String string2 = eAN.a(eAN2, string);
        if (this.i.containsKey(string2)) {
            return this.i.get(string2);
        }
        switch (eAN2) {
            case a: {
                exk_22 = aUi.i(string);
                break;
            }
            case b: {
                exk_22 = aUi.j(string);
                break;
            }
            case c: {
                exk_22 = aUi.k(string);
                break;
            }
            case d: {
                exk_22 = aUi.l(string);
                break;
            }
            default: {
                return null;
            }
        }
        if (this.i.size() > 501) {
            this.i.clear();
        }
        this.i.put(string2, exk_22);
        return exk_22;
    }

    private static exk_2 i(String string) {
        return exl_2.a(string);
    }

    private static exk_2 j(String string) {
        String[] stringArray = string.split(";");
        if (stringArray.length < 2) {
            return null;
        }
        Object r2 = eyo_1.g().d(Integer.parseInt(stringArray[0]));
        exk_2 exk_22 = new exk_2(Long.parseLong(stringArray[1]));
        exk_22.b((ezr_0)r2);
        return exk_22;
    }

    private static exk_2 k(String string) {
        String[] stringArray = string.split(";");
        if (stringArray.length < 1) {
            return null;
        }
        Object r2 = eyo_1.g().d(Integer.parseInt(stringArray[0]));
        return exk_2.a(r2);
    }

    private static exk_2 l(String string) {
        String[] stringArray = string.split(";");
        if (stringArray.length < 1) {
            return null;
        }
        Object r2 = eyo_1.g().d(Integer.parseInt(stringArray[0]));
        return exk_2.a(r2);
    }

    public static boolean a(fck_2 fck_22) {
        return fck_22.r() && fck_22.x() == 3;
    }
}

