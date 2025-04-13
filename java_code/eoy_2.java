/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eOy
 */
public enum eoy_2 implements aqk_2
{
    a(1, "bonus positif"),
    b(2, "bonus negatif");

    private final int c;
    private final String d;

    private eoy_2(int n2, String string2) {
        this.c = n2;
        this.d = string2;
    }

    @Override
    public String d() {
        return String.valueOf(this.c);
    }

    @Override
    public String e() {
        return this.d;
    }

    @Override
    public String f() {
        return null;
    }

    public static eoy_2 a(int n) {
        eoy_2[] eoy_2Array = eoy_2.values();
        for (int k = 0; k < eoy_2Array.length; ++k) {
            eoy_2 eoy_22 = eoy_2Array[k];
            if (eoy_22.c != n) continue;
            return eoy_22;
        }
        return null;
    }
}

