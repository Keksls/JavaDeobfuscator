/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from btD
 */
public enum btd_0 implements aqk_2
{
    a(0, "Bestiaire"),
    b(1, "Famille de Monstre"),
    c(2, "Monstre"),
    d(3, "Territoire"),
    e(4, "Objets");

    private final short f;
    private final String g;

    private btd_0(short s2, String string2) {
        this.f = s2;
        this.g = string2;
    }

    public short a() {
        return this.f;
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
        return "";
    }

    public long a(int n) {
        return Hw.c((int)this.f, n);
    }

    public static btd_0 a(short s2) {
        for (btd_0 btd_02 : btd_0.values()) {
            if (btd_02.f != s2) continue;
            return btd_02;
        }
        return null;
    }
}

