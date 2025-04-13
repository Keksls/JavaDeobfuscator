/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.log4j.Logger
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

public class fym
implements fzd<String> {
    protected static final Logger a = Logger.getLogger(fym.class);
    public static final Class<String> b = String.class;
    private static final Pattern c = Pattern.compile("(%([^%]*)%)");
    private static final Pattern d = Pattern.compile("(\\$([A-Za-z0-9_\\-]+)(:([^\\$]+))*\\$)");

    public static void a(String[] stringArray) {
        String string = "$pouet:meuh$";
        Matcher matcher = d.matcher("$pouet:meuh$");
        if (matcher.matches()) {
            System.out.println(matcher.group(0));
        }
    }

    public String a(String string) {
        return this.a(b, string);
    }

    public String a(Class<? extends String> clazz, String string) {
        return this.a(clazz, string, null);
    }

    public String a(Class<? extends String> clazz, String string, fyy_0 fyy_02) {
        Object object;
        if (string == null) {
            return null;
        }
        Matcher matcher = c.matcher(string);
        String string2 = string;
        while (matcher.find()) {
            try {
                object = fpm_0.b().c(matcher.group(2));
                string2 = StringUtils.replace((String)string2, (String)matcher.group(1), (String)object);
            }
            catch (Exception exception) {
                a.error((Object)"Exception during convert", (Throwable)exception);
            }
        }
        if (fyy_02 != null && ((Matcher)(object = d.matcher(string2))).matches()) {
            String string3 = ((Matcher)object).group(2);
            String string4 = ((Matcher)object).group(4);
            string2 = fyy_02.c(string3, string4);
        }
        return string2;
    }

    @Override
    public Class<String> a() {
        return b;
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public String a(fkr_2 fkr_22, fyw_0 fyw_02, Class<? extends String> clazz, String string, fya_0 fya_02) {
        fkr_22.a(b);
        Matcher matcher = c.matcher(string);
        if (matcher.find()) {
            matcher.reset();
            String string2 = fkr_22.b();
            fkr_22.a(new fkw_1(clazz, string2, "\"" + string + "\""));
            while (matcher.find()) {
                fkr_22.a(new fkw_1(clazz, string2, string2 + ".replace(\"" + matcher.group(1) + "\", Xulor.getInstance().getTranslatedString(\"" + matcher.group(2) + "\"))"));
            }
            return string2;
        }
        Matcher matcher2 = d.matcher(string);
        if (matcher2.matches()) {
            String string3 = "\"" + matcher2.group(2) + "\"";
            String string4 = matcher2.group(4) == null ? "null" : "\"" + matcher2.group(4) + "\"";
            String string5 = fkr_22.b();
            fkr_22.a(new fkw_1(clazz, string5, "elementMap.getEnvironmentProperty(" + string3 + ", " + string4 + ")"));
            return string5;
        }
        return "\"" + StringUtils.replace((String)string, (String)"\\", (String)"\\\\") + "\"";
    }

    @Override
    public /* synthetic */ Object b(String string) {
        return this.a(string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string) {
        return this.a(clazz, string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string, fyy_0 fyy_02) {
        return this.a(clazz, string, fyy_02);
    }
}

