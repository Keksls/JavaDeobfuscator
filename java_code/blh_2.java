/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from blH
 */
public enum blh_2 implements aqk_2
{
    a(0, 0, 0, "Choisissez un type de challenge !", false),
    b(1, 800336, 800337, "Solo", false),
    c(2, 800599, 800600, "Course", false),
    d(3, 800334, 800335, "Comp\u00e9titif", true),
    e(4, 800163, 800164, "Collaboratif", false);

    private final byte f;
    private final String g;
    private final int h;
    private final int i;
    private final boolean j;

    private blh_2(byte by, int n2, int n3, String string2, boolean bl) {
        this.f = by;
        this.g = string2;
        this.h = n2;
        this.i = n3;
        this.j = bl;
    }

    @Override
    public String d() {
        return String.valueOf(this.f);
    }

    @Override
    public String e() {
        return this.g;
    }

    @Override
    public String f() {
        return null;
    }

    public static blh_2 a(byte by) {
        for (blh_2 blh_22 : blh_2.values()) {
            if (blh_22.f != by) continue;
            return blh_22;
        }
        return null;
    }

    public String a() {
        return bae.h().a("challenge.userType." + this.ordinal(), new Object[0]);
    }

    public byte b() {
        return this.f;
    }

    public int c() {
        return this.h;
    }

    public int g() {
        return this.i;
    }

    public boolean h() {
        return this.j;
    }
}

