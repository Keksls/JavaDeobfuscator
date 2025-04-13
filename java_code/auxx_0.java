/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aUXX
 */
public class auxx_0
implements ajh_1 {
    private final aUn f;
    private final boolean g;
    public static final String a = "name";
    public static final String b = "enabled";
    public static final String d = "color";
    public final String[] e = new String[]{"name", "enabled", "color"};

    public auxx_0(aUn aUn2, boolean bl) {
        this.f = aUn2;
        this.g = bl;
    }

    @Override
    public String[] d() {
        return this.e;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.f.e();
        }
        if (string.equals(b)) {
            return this.g;
        }
        if (string.equals(d)) {
            return this.f.d();
        }
        return null;
    }

    public azj_2 a() {
        return this.f.d();
    }

    public String b() {
        return this.f.e();
    }

    public int c() {
        return this.f.b();
    }

    public int e() {
        return this.f.a().b();
    }
}

