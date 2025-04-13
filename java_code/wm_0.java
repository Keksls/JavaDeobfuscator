/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Pattern;

/*
 * Renamed from WM
 */
public class wm_0 {
    public static boolean a(String string, String string2) {
        return wo_0.b.matcher(string).matches() && Pattern.compile(wm_0.a(string)).matcher(string2).matches();
    }

    static String a(String string) {
        String string2 = string;
        for (WQ wQ : WQ.values()) {
            string2 = string2.replaceAll(String.valueOf(WQ.a.a()) + wQ.a(), wQ.b());
        }
        return string2;
    }
}

