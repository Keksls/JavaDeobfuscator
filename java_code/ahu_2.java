/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aHU
 */
public enum ahu_2 {
    a("unknown", "UNKNOWN", 0),
    b("windows", "WINDOWS", 3),
    c("mac", "MACOS", 4),
    d("sunos", "SUNOS", 5),
    e("linux", "LINUX", 5);

    private static ahu_2 f;
    private final String g;
    private final String h;
    private final byte i;

    private ahu_2(String string2, String string3, byte by) {
        this.g = string2;
        this.h = string3;
        this.i = by;
    }

    public static ahu_2 a() {
        return f;
    }

    public static boolean b() {
        return f == c;
    }

    public static boolean c() {
        return f == b;
    }

    public String d() {
        return this.g;
    }

    public String e() {
        return this.h;
    }

    public byte f() {
        return this.i;
    }

    static {
        String string = System.getProperty("os.name").toLowerCase();
        for (ahu_2 ahu_22 : ahu_2.values()) {
            if (!string.startsWith(ahu_22.d())) continue;
            f = ahu_22;
        }
        if (f == null) {
            f = a;
        }
    }
}

