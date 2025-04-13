/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bkC
 */
public enum bkc_2 implements aqk_2
{
    a("Texte seul", 1),
    b("Image seule", 2),
    c("Chapeau Texte+Image puis texte", 3),
    d("Texte pui chapeau Texte+Image", 4);

    private final String e;
    private final short f;

    private bkc_2(String string2, short s2) {
        this.e = string2;
        this.f = s2;
    }

    @Override
    public String d() {
        return Integer.toString(this.f);
    }

    @Override
    public String e() {
        return this.e;
    }

    @Override
    public String f() {
        return null;
    }

    public short a() {
        return this.f;
    }
}

