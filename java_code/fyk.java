/*
 * Decompiled with CFR 0.152.
 */
public final class fyk
implements fzd<fjv_1> {
    public static final Class<fjv_1> a = fjv_1.class;

    public fjv_1 a(String string) {
        return this.a(a, string);
    }

    public fjv_1 a(Class<? extends fjv_1> clazz, String string) {
        return this.a(clazz, string, null);
    }

    public fjv_1 a(Class<? extends fjv_1> clazz, String string, fyy_0 fyy_02) {
        if (string != null) {
            return fjv_1.a(string);
        }
        return null;
    }

    @Override
    public Class<fjv_1> a() {
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
    public String a(fkr_2 fkr_22, fyw_0 fyw_02, Class<? extends fjv_1> clazz, String string, fya_0 fya_02) {
        if (string != null) {
            fkr_22.a(a);
            StringBuilder stringBuilder = new StringBuilder();
            fjv_1 fjv_12 = fjv_1.a(string);
            double d2 = fjv_12.a();
            stringBuilder.append("new Percentage(").append(d2).append(")");
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

