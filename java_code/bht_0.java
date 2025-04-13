/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bHt
 */
public class bht_0
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "icon";
    public static final String d = "mode";
    public final String[] e = new String[]{"name", "icon", "mode"};
    private final bhs_0 f;

    public bht_0(bhs_0 bhs_02) {
        this.f = bhs_02;
    }

    @Override
    public String[] d() {
        return this.e;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return bae.h().a(this.f.name(), new Object[0]);
        }
        if (string.equals(d)) {
            return this.f;
        }
        if (string.equals(b)) {
            return azs_0.a().a(this.f.e);
        }
        return null;
    }

    public bhs_0 a() {
        return this.f;
    }
}

