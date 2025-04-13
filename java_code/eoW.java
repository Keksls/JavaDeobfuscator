/*
 * Decompiled with CFR 0.152.
 */
public enum eoW {
    a("default", null, false),
    b("steam", "STEAM", true),
    c("speedybird", "SPEEDYBIRD", false);

    private final String d;
    private final String e;
    private final boolean f;
    private static eoW g;

    public static eoW a() {
        return g;
    }

    private eoW(String string2, String string3, boolean bl) {
        this.d = string2;
        this.e = string3;
        this.f = bl;
    }

    public static void a(String string) {
        for (eoW eoW2 : eoW.values()) {
            if (!eoW2.d.equals(string)) continue;
            g = eoW2;
            return;
        }
        g = a;
    }

    public String b() {
        return this.d;
    }

    public String c() {
        return this.e;
    }

    public boolean d() {
        return this.f;
    }

    static {
        g = a;
    }
}

