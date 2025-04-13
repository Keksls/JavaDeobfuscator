/*
 * Decompiled with CFR 0.152.
 */
public enum SB implements aqk_2
{
    a(0, "Aucune \u00e9coute"),
    b(1, "Trigger qui se d\u00e9clenche quand le porteur est le lanceur de l'effet d\u00e9clencheur"),
    c(2, "Trigger qui se d\u00e9clenche quand le porteur est la cible de l'effet d\u00e9clencheur"),
    d(3, "Trigger qui se d\u00e9clenche lorsque l'\u00e9coute survient de quelque mani\u00e8re que ce soit");

    private final byte e;
    private final String f;

    private SB(byte by, String string2) {
        this.e = by;
        this.f = string2;
    }

    @Override
    public String d() {
        return Byte.toString(this.e);
    }

    @Override
    public String e() {
        return this.name();
    }

    @Override
    public String f() {
        return this.f;
    }

    public byte a() {
        return this.e;
    }

    public static SB a(byte by) {
        SB[] sBArray = SB.values();
        for (int k = 0; k < sBArray.length; ++k) {
            SB sB = sBArray[k];
            if (sB.e != by) continue;
            return sB;
        }
        return null;
    }
}

