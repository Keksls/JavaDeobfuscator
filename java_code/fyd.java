/*
 * Decompiled with CFR 0.152.
 */
public class fyd
implements fzd<Enum> {
    private final Class<Enum> a = Enum.class;

    public Enum a(String string) {
        return null;
    }

    public Enum a(Class<? extends Enum> clazz, String string) {
        return this.a(clazz, string, null);
    }

    public Enum a(Class<? extends Enum> clazz, String string, fyy_0 fyy_02) {
        Enum enum_ = null;
        try {
            enum_ = Enum.valueOf(clazz, string.toUpperCase());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
        if (enum_ != null) {
            return enum_;
        }
        if (clazz.getEnumConstants().length > 0) {
            return clazz.getEnumConstants()[0];
        }
        return null;
    }

    @Override
    public Class<Enum> a() {
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
    public String a(fkr_2 fkr_22, fyw_0 fyw_02, Class<? extends Enum> clazz, String string, fya_0 fya_02) {
        fkr_22.a(clazz);
        Enum enum_ = null;
        try {
            enum_ = Enum.valueOf(clazz, string.toUpperCase());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
        if (enum_ == null && clazz.getEnumConstants().length > 0) {
            enum_ = clazz.getEnumConstants()[0];
        }
        Enum enum_2 = enum_;
        return clazz.getSimpleName() + "." + enum_2.toString();
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

