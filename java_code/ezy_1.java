/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ezY
 */
public enum ezy_1 implements aqk_2
{
    a(0, "N'est pas impact\u00e9 par le chaos"),
    b(1, "Chaos mineur"),
    c(2, "Chaos basique"),
    d(3, "Chaos majeur");

    private final byte e;
    private final String f;

    private ezy_1(int n2, String string2) {
        this.e = (byte)n2;
        this.f = string2;
    }

    @Override
    public String d() {
        return String.valueOf(this.e);
    }

    @Override
    public String e() {
        return this.toString();
    }

    @Override
    public String f() {
        return this.f;
    }

    public static ezy_1 a(byte by) {
        ezy_1[] ezy_1Array = ezy_1.values();
        for (int k = 0; k < ezy_1Array.length; ++k) {
            ezy_1 ezy_12 = ezy_1Array[k];
            if (ezy_12.e != by) continue;
            return ezy_12;
        }
        return null;
    }
}

