/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bUr
 */
public enum bur_0 implements aqk_2
{
    a(0, "Statiques"),
    b(1, "Elements Interactifs"),
    c(2, "Dungeons"),
    d(3, "Protecteurs");

    private final byte e;
    private final String f;

    private bur_0(byte by, String string2) {
        this.e = by;
        this.f = string2;
    }

    public static bur_0 a(byte by) {
        for (bur_0 bur_02 : bur_0.values()) {
            if (bur_02.e != by) continue;
            return bur_02;
        }
        return null;
    }

    public byte a() {
        return this.e;
    }

    public String b() {
        return this.f;
    }

    @Override
    public String d() {
        return String.valueOf(this.e);
    }

    @Override
    public String e() {
        return this.f;
    }

    @Override
    public String f() {
        return null;
    }
}

