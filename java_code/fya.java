/*
 * Decompiled with CFR 0.152.
 */
import java.util.StringTokenizer;
import java.util.regex.Matcher;

public class fya
implements fzd<azf_2> {
    private final Class<azf_2> a = azf_2.class;

    public azf_2 a(String string) {
        return this.a(this.a, string);
    }

    public azf_2 a(Class<? extends azf_2> clazz, String string) {
        return this.a(this.a, string, null);
    }

    public azf_2 a(Class<? extends azf_2> clazz, String string, fyy_0 fyy_02) {
        if (string == null) {
            return null;
        }
        if (!clazz.equals(this.a)) {
            return null;
        }
        azj_2 azj_22 = fyg.d.a(clazz, string, fyy_02);
        if (azj_22 == null) {
            return null;
        }
        return azj_22 instanceof azf_2 ? (azf_2)azj_22 : new azf_2(azj_22);
    }

    @Override
    public Class<azf_2> a() {
        return this.a;
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
    public String a(fkr_2 fkr_22, fyw_0 fyw_02, Class<? extends azf_2> clazz, String string, fya_0 fya_02) {
        if (string == null) {
            return "null";
        }
        if (!clazz.equals(this.a)) {
            return "null";
        }
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 1.0f;
        if (string.charAt(0) == '#') {
            String string2 = string.substring(1);
            Matcher matcher = fyg.a.matcher(string2);
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
        } else if (fyg.b.matcher(string).matches()) {
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
            String string3;
            fkr_22.a(fys_0.class);
            String[] stringArray = string.split("@");
            if (stringArray.length > 1) {
                String string4 = stringArray[0].trim();
                float f6 = Float.parseFloat(stringArray[1].trim());
                string3 = String.format("%s.INSTANCE.getColor(\"%s\", %sf)", fys_0.class.getSimpleName(), string4, Float.valueOf(Hw.a(f6, 2)));
            } else {
                string3 = String.format("%s.INSTANCE.getColor(\"%s\")", fys_0.class.getSimpleName(), string);
            }
            return String.format("%s instanceof %s ? (%s) %s : new %s(%s)", string3, this.a.getSimpleName(), this.a.getSimpleName(), string3, this.a.getSimpleName(), string3);
        }
        fkr_22.a(this.a);
        return "new " + this.a.getSimpleName() + "(" + f2 + "f, " + f3 + "f, " + f4 + "f, " + f5 + "f)";
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

