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
 * Renamed from aMP
 */
public class amp_2
implements aqy_2 {
    public static final amp_2 a = new amp_2();
    protected static final Logger b = Logger.getLogger(amp_2.class);
    private static final Pattern c = Pattern.compile("(\\$\\{[a-zA-Z0-9\\._-]*\\})+");

    @Override
    public String a(String string) {
        if (string != null && string.length() > 0) {
            try {
                Matcher matcher = c.matcher(string);
                if (matcher.find()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    int n = 0;
                    do {
                        int n2 = matcher.start();
                        int n3 = matcher.end();
                        stringBuilder.append(string.substring(n, n2));
                        n = n3;
                        if (n3 - n2 <= 3) continue;
                        String string2 = string.substring(n2 + 2, n3 - 1);
                        String string3 = System.getProperty(string2);
                        if (string3 != null) {
                            stringBuilder.append(string3);
                            continue;
                        }
                        b.error((Object)("Property not found : " + string2));
                    } while (matcher.find());
                    if (n < string.length()) {
                        stringBuilder.append(string.substring(n));
                    }
                    return stringBuilder.toString();
                }
            }
            catch (Exception exception) {
                b.error((Object)"Parse error : ", (Throwable)exception);
            }
        }
        return null;
    }
}

