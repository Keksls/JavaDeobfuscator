/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bxL
 */
public class bxl_1
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "checked";
    public static final String d = "canBeEdited";
    public static final String[] e = new String[]{"name", "checked", "canBeEdited"};
    private final eQt f;
    private boolean g;

    public bxl_1(eQt eQt2) {
        this.f = eQt2;
    }

    @Override
    public String[] d() {
        return e;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return bae.h().a(this.f.name(), new Object[0]);
        }
        if (string.equals(b)) {
            return this.g;
        }
        if (string.equals(d)) {
            return this.c();
        }
        return null;
    }

    private boolean c() {
        bmr_1 bmr_12 = azu_0.j().k();
        bos_2 bos_22 = bmr_12.eV();
        ern_1 ern_12 = bos_22.c(bos_22.a(bmr_12.a_()).d());
        if (ern_12 == null) {
            return false;
        }
        return ern_12.a(this.f);
    }

    public void a(boolean bl) {
        this.g = bl;
        fis_1.a().a((ajf_1)this, b);
    }

    public boolean a() {
        return this.g;
    }

    public eQt b() {
        return this.f;
    }
}

