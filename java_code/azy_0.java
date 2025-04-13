/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

/*
 * Renamed from aZY
 */
public class azy_0 {
    private static final Logger b = Logger.getLogger(azy_0.class);
    private static final boolean c = true;
    private static final Pattern d = Pattern.compile("(\\\\\\$([a-zA-Z_]+)\\$)|([^(\\\\\\$([a-zA-Z_]+)\\$)]*)");
    private static final azy_0 e = new azy_0();

    private azy_0() {
    }

    public static azy_0 a() {
        return e;
    }

    private static String b(String string) {
        assert (string != null);
        try {
            return "<b>" + azz_0.valueOf(string).a() + "</b>";
        }
        catch (Exception exception) {
            b.error((Object)("la variable est inconnu " + string), (Throwable)exception);
            return string;
        }
    }

    public static String a(String string) {
        Matcher matcher = d.matcher(string);
        StringBuilder stringBuilder = new StringBuilder(string.length());
        while (matcher.find()) {
            String string2 = matcher.group(2);
            if (string2 == null) {
                stringBuilder.append(matcher.group(3));
                continue;
            }
            stringBuilder.append(azy_0.b(string2));
        }
        return stringBuilder.toString();
    }
}

