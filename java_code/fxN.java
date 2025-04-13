/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;

public class fxN
extends fxP {
    public static final Pattern a = Pattern.compile("(<(\\p{Alpha}+?)( ([^<>]*))*>(.*?)</(\\2)>)|([^<>]+)", 32);

    @Override
    public String a() {
        StringBuilder stringBuilder = new StringBuilder();
        for (fxQ fxQ2 : this) {
            stringBuilder.append(fxQ2.g());
        }
        return stringBuilder.toString();
    }

    @Override
    public boolean a(@NotNull String string) {
        int n = string.length();
        if (n > 0 && this.l()) {
            return false;
        }
        boolean bl = false;
        for (fxQ fxQ2 : this) {
            String string2 = fxQ2.g();
            int n2 = 0 + string2.length();
            if (n2 > n) {
                return false;
            }
            if (string2.equals(string.substring(0, n2))) continue;
            return false;
        }
        return 0 == n;
    }

    @Override
    public void b(String string) {
        this.d();
        this.B();
        this.c(string);
    }

    @Override
    public void c(String string) {
        Matcher matcher = a.matcher(string);
        matcher.reset();
        ArrayList<fxQ> arrayList = new ArrayList<fxQ>();
        while (matcher.find()) {
            fxQ fxQ2 = this.a(matcher, null, true);
            fxQ2.a(matcher, arrayList);
        }
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            this.a(arrayList.get(k));
        }
    }

    public fxQ a(Matcher matcher, fxQ fxQ2, boolean bl) {
        ane_2 ane_22 = fxQ.b(matcher.group(2));
        if (ane_22 == ane_2.c) {
            return new fxR(this, fxQ2);
        }
        return new fxS(this, fxQ2, false);
    }

    public static String d(String string) {
        Matcher matcher = a.matcher(string);
        matcher.reset();
        StringBuilder stringBuilder = new StringBuilder();
        while (matcher.find()) {
            String string2 = matcher.group(0);
            if (string2 == null || string2.isEmpty()) continue;
            String string3 = matcher.group(5);
            if (Cz.f(string3)) {
                stringBuilder.append(string2);
                continue;
            }
            stringBuilder.append(string3);
        }
        return stringBuilder.toString();
    }
}

