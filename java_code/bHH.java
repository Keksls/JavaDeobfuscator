/*
 * Decompiled with CFR 0.152.
 */
public class bHH
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "iconUrl";
    public static final String d = "itemType";
    protected final bhg_0 e;
    public final String[] f = new String[]{"name", "iconUrl", "itemType"};

    public bHH(bhg_0 bhg_02) {
        this.e = bhg_02;
    }

    @Override
    public String[] d() {
        return this.f;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.e == null ? bae.h().a("all", new Object[0]) : this.e.a();
        }
        if (string.equals(b)) {
            return azs_0.a().a(this.e == null ? (short)-1 : this.e.d());
        }
        if (string.equals(d)) {
            return this.e;
        }
        return null;
    }

    public bhg_0 a() {
        return this.e;
    }

    public boolean equals(Object object) {
        if (!(object instanceof bHH)) {
            return false;
        }
        return this.e == ((bHH)object).a();
    }
}

