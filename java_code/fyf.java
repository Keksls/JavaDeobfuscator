/*
 * Decompiled with CFR 0.152.
 */
public class fyf
implements fzd<fzA> {
    private final Class<fzA> a = fzA.class;

    public fzA a(String string) {
        return this.a(this.a, string);
    }

    public fzA a(Class<? extends fzA> clazz, String string) {
        return this.a(clazz, string, null);
    }

    public fzA a(Class<? extends fzA> clazz, String string, fyy_0 fyy_02) {
        if (string == null) {
            return null;
        }
        if (clazz.equals(fzA.class)) {
            fzA fzA2 = new fzA();
            fya_0 fya_02 = fpm_0.b().h();
            fyy_0 fyy_03 = fya_02.b();
            fzz fzz2 = fya_02.d();
            fzA2.a(string, fyy_03, fzz2);
            return fzA2;
        }
        return null;
    }

    @Override
    public Class<fzA> a() {
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
    public String a(fkr_2 fkr_22, fyw_0 fyw_02, Class<? extends fzA> clazz, String string, fya_0 fya_02) {
        if (string == null) {
            return null;
        }
        if (clazz.equals(fzA.class)) {
            String string2 = fkr_22.b();
            fkr_22.a(clazz);
            fkr_22.a(fya_0.class);
            fkr_22.a(new fkw_1(clazz, string2, "new " + clazz.getSimpleName() + "()"));
            fkr_22.a(new fkv_1(null, "setFunc", string2, "\"" + string + "\"", "env.getCurrentElementMap()", "env.getCurrentForm()"));
            return string2;
        }
        return null;
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

