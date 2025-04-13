/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bWx
 */
public class bwx_2
implements ajh_1 {
    public static final String a = "iconUrl";
    public static final String b = "description";
    private final bmx_0 d;

    public bwx_2(bmx_0 bmx_02) {
        this.d = bmx_02;
    }

    @Override
    public String[] d() {
        return null;
    }

    private boolean a() {
        bhr_1 bhr_12 = azu_0.j().k().eK();
        return !bhr_12.a(this.d.b()) || bhr_12.b(this.d.b());
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.a() ? azs_0.a().a("protectorSecretIconUrl", "defaultIconPath", this.d.d()) : azs_0.a().a("protectorSecretIconUrl", "defaultIconPath", this.d.c());
        }
        if (string.equals(b)) {
            return this.a() ? bae.h().a(95, (long)this.d.a(), new Object[0]) : bae.h().a("protector.secret.notFound", new Object[0]);
        }
        return null;
    }
}

