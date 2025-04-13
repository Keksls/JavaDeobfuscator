/*
 * Decompiled with CFR 0.152.
 */
import java.util.StringTokenizer;

public final class fyb
implements fzd<fjf_2> {
    public static final Class<fjf_2> a = fjf_2.class;

    public fjf_2 a(String string) {
        return this.a(a, string);
    }

    public fjf_2 a(Class<? extends fjf_2> clazz, String string) {
        return this.a(clazz, string, null);
    }

    public fjf_2 a(Class<? extends fjf_2> clazz, String string, fyy_0 fyy_02) {
        if (string != null) {
            String string2;
            StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
            fjf_2 fjf_22 = new fjf_2();
            if (stringTokenizer.hasMoreTokens()) {
                string2 = stringTokenizer.nextToken().trim();
                if (string2.endsWith("%")) {
                    fjf_22.b(Float.parseFloat(string2.substring(0, string2.length() - 1)));
                } else {
                    fjf_22.b(Integer.parseInt(string2));
                }
            }
            if (stringTokenizer.hasMoreTokens()) {
                string2 = stringTokenizer.nextToken().trim();
                if (string2.endsWith("%")) {
                    fjf_22.a(Float.parseFloat(string2.substring(0, string2.length() - 1)));
                } else {
                    fjf_22.a(Integer.parseInt(string2));
                }
            }
            return fjf_22;
        }
        return null;
    }

    @Override
    public Class<fjf_2> a() {
        return a;
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
    public String a(fkr_2 fkr_22, fyw_0 fyw_02, Class<? extends fjf_2> clazz, String string, fya_0 fya_02) {
        if (string != null) {
            String string2;
            fkr_22.a(a);
            StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("new Dimension(");
            if (stringTokenizer.hasMoreTokens()) {
                string2 = stringTokenizer.nextToken().trim();
                if (string2.endsWith("%")) {
                    stringBuilder.append(string2.substring(0, string2.length() - 1)).append("f");
                } else {
                    stringBuilder.append(string2);
                }
            } else {
                stringBuilder.append(0);
            }
            stringBuilder.append(", ");
            if (stringTokenizer.hasMoreTokens()) {
                string2 = stringTokenizer.nextToken().trim();
                if (string2.endsWith("%")) {
                    stringBuilder.append(string2.substring(0, string2.length() - 1)).append("f");
                } else {
                    stringBuilder.append(string2);
                }
            } else {
                stringBuilder.append(0);
            }
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
        return "null";
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

