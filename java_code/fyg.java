/*
 * Decompiled with CFR 0.152.
 */
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fyg
implements fzd<azj_2> {
    private final Class<azj_2> e = azj_2.class;
    public static final Pattern a = Pattern.compile("[0-9A-Fa-f][0-9A-Fa-f]");
    public static final Pattern b = Pattern.compile("(([0-9\\.\\s]+),){2,}([0-9\\.\\s]+)");
    public static final String c = "@";
    public static final fyg d = new fyg();

    private fyg() {
    }

    public azj_2 a(String string) {
        return this.a(this.e, string);
    }

    public azj_2 a(Class<? extends azj_2> clazz, String string) {
        return this.a(this.e, string, null);
    }

    public azj_2 a(Class<? extends azj_2> clazz, String string, fyy_0 fyy_02) {
        if (string == null) {
            return null;
        }
        if (!clazz.equals(this.e)) {
            return null;
        }
        if (string.charAt(0) == '#') {
            String string2 = string.substring(1);
            Matcher matcher = a.matcher(string2);
            float f2 = 0.0f;
            if (matcher.find()) {
                f2 = (float)Integer.parseInt(matcher.group(), 16) / 255.0f;
            }
            float f3 = 0.0f;
            if (matcher.find()) {
                f3 = (float)Integer.parseInt(matcher.group(), 16) / 255.0f;
            }
            float f4 = 0.0f;
            if (matcher.find()) {
                f4 = (float)Integer.parseInt(matcher.group(), 16) / 255.0f;
            }
            float f5 = 1.0f;
            if (matcher.find()) {
                f5 = (float)Integer.parseInt(matcher.group(), 16) / 255.0f;
            }
            return new azf_2(f2, f3, f4, f5);
        }
        if (b.matcher(string).matches()) {
            StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
            float f6 = 0.0f;
            if (stringTokenizer.hasMoreTokens()) {
                f6 = Float.parseFloat(stringTokenizer.nextToken().trim());
            }
            float f7 = 0.0f;
            if (stringTokenizer.hasMoreTokens()) {
                f7 = Float.parseFloat(stringTokenizer.nextToken().trim());
            }
            float f8 = 0.0f;
            if (stringTokenizer.hasMoreTokens()) {
                f8 = Float.parseFloat(stringTokenizer.nextToken().trim());
            }
            float f9 = 1.0f;
            if (stringTokenizer.hasMoreTokens()) {
                f9 = Float.parseFloat(stringTokenizer.nextToken().trim());
            }
            return new azf_2(f6, f7, f8, f9);
        }
        String[] stringArray = string.split(c);
        if (stringArray.length > 1) {
            String string3 = stringArray[0].trim();
            float f10 = Float.parseFloat(stringArray[1].trim());
            return new fyr_0(string3, f10);
        }
        return new fyr_0(string);
    }

    @Override
    public Class<azj_2> a() {
        return this.e;
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public boolean c() {
        return true;
    }

    @Override
    public String a(fkr_2 fkr_22, fyw_0 fyw_02, Class<? extends azj_2> clazz, String string, fya_0 fya_02) {
        if (string == null) {
            return "null";
        }
        if (!clazz.equals(this.e)) {
            return "null";
        }
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 1.0f;
        if (string.charAt(0) == '#') {
            String string2 = string.substring(1);
            Matcher matcher = a.matcher(string2);
            if (matcher.find()) {
                f2 = (float)Integer.parseInt(matcher.group(), 16) / 255.0f;
            }
            if (matcher.find()) {
                f3 = (float)Integer.parseInt(matcher.group(), 16) / 255.0f;
            }
            if (matcher.find()) {
                f4 = (float)Integer.parseInt(matcher.group(), 16) / 255.0f;
            }
            if (matcher.find()) {
                f5 = (float)Integer.parseInt(matcher.group(), 16) / 255.0f;
            }
        } else if (b.matcher(string).matches()) {
            StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
            if (stringTokenizer.hasMoreTokens()) {
                f2 = Float.parseFloat(stringTokenizer.nextToken().trim());
            }
            if (stringTokenizer.hasMoreTokens()) {
                f3 = Float.parseFloat(stringTokenizer.nextToken().trim());
            }
            if (stringTokenizer.hasMoreTokens()) {
                f4 = Float.parseFloat(stringTokenizer.nextToken().trim());
            }
            if (stringTokenizer.hasMoreTokens()) {
                f5 = Float.parseFloat(stringTokenizer.nextToken().trim());
            }
        } else {
            fkr_22.a(fyr_0.class);
            String[] stringArray = string.split(c);
            if (stringArray.length > 1) {
                String string3 = stringArray[0].trim();
                float f6 = Float.parseFloat(stringArray[1].trim());
                return String.format("new %s(\"%s\", %sf)", fyr_0.class.getSimpleName(), string3, Float.valueOf(Hw.a(f6, 2)));
            }
            return String.format("new %s(\"%s\")", fyr_0.class.getSimpleName(), string);
        }
        fkr_22.a(azf_2.class);
        return "new " + azf_2.class.getSimpleName() + "(" + f2 + "f, " + f3 + "f, " + f4 + "f, " + f5 + "f)";
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

