/*
 * Decompiled with CFR 0.152.
 */
public class fyc
implements fzd<fdg_1> {
    private final Class<fdg_1> a = fdg_1.class;

    public fdg_1 a(String string) {
        return this.a(this.a, string);
    }

    public fdg_1 a(Class<? extends fdg_1> clazz, String string) {
        return this.a(clazz, string, null);
    }

    public fdg_1 a(Class<? extends fdg_1> clazz, String string, fyy_0 fyy_02) {
        if (string == null) {
            return null;
        }
        if (clazz.equals(fdg_1.class)) {
            fdg_1 fdg_12 = new fdg_1();
            fyy_0 fyy_03 = fpm_0.b().h().b();
            fdg_12.b(string, fyy_03);
            return fdg_12;
        }
        return null;
    }

    @Override
    public Class<fdg_1> a() {
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
    public String a(fkr_2 fkr_22, fyw_0 fyw_02, Class<? extends fdg_1> clazz, String string, fya_0 fya_02) {
        if (string == null) {
            return "null";
        }
        if (clazz.equals(fdg_1.class)) {
            fkr_22.a(fdg_1.class);
            fkr_22.a(fya_0.class);
            String string2 = fkr_22.b();
            fkr_22.a(new fkw_1(fdg_1.class, string2, "new DropValidateCallBack()"));
            fkr_22.a(new fkv_1(null, "setFunc", string2, "\"" + string + "\"", "env.getCurrentElementMap()"));
            return string2;
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

