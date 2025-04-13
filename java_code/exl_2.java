/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eXL
 */
public class exl_2 {
    private static final Pattern a = Pattern.compile("(\\d+)(?:;(.*))?");
    private final String b;
    private boolean c;
    private int d;
    private String e;

    private exl_2(String string) {
        this.b = string;
        this.c = false;
    }

    private void a() {
        Matcher matcher = a.matcher(this.b);
        if (matcher.matches()) {
            this.c = true;
            this.d = Integer.parseInt(matcher.group(1));
            this.e = null;
            if (matcher.group(2) != null && !matcher.group(2).isEmpty()) {
                this.e = matcher.group(2);
            }
        }
    }

    @Nullable
    private exk_2 b() {
        if (!this.c) {
            return null;
        }
        exk_2 exk_22 = exk_2.a(eyo_1.g().d(this.d));
        if (!exk_22.c(this.e)) {
            return null;
        }
        return exk_22;
    }

    @Nullable
    public static exk_2 a(String string) {
        exl_2 exl_22 = new exl_2(string);
        exl_22.a();
        return exl_22.b();
    }
}

