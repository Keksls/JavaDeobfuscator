/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Renamed from aNh
 */
public class anh_2 {
    private static final Pattern a = Pattern.compile("&#([0-9]+);");

    private anh_2() {
    }

    public static String a(String string) {
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = a.matcher(string);
        int n = 0;
        while (matcher.find()) {
            String string2 = matcher.group(1);
            char c2 = (char)Co.c(string2);
            matcher.appendReplacement(stringBuffer, String.valueOf(c2));
            n = matcher.end();
        }
        stringBuffer.append(string.substring(n));
        return stringBuffer.toString();
    }
}

