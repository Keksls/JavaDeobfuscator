/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

/*
 * Renamed from aVm
 */
public final class avm_0 {
    private static final Pattern a = Pattern.compile("<mob id=\"(\\d+)\"/>");

    private avm_0() {
    }

    public static String a(String string) {
        String string2 = avm_0.b(string);
        return string2;
    }

    private static String b(String string) {
        String string2 = string;
        Matcher matcher = a.matcher(string2);
        while (matcher.find()) {
            String string3 = matcher.group(1);
            if (!StringUtils.isNumeric((CharSequence)string3)) continue;
            String string4 = bae.h().a(7, (long)Integer.parseInt(string3), new Object[0]).trim();
            string2 = StringUtils.replace((String)string2, (String)matcher.group(), (String)(string3 + " (" + string4 + ")"));
        }
        return string2;
    }
}

