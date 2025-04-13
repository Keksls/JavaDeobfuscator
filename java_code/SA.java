/*
 * Decompiled with CFR 0.152.
 */
public enum SA implements aqk_2
{
    a(0, "L'effet n'est pas d\u00e9clench\u00e9"),
    b(1, "Le caster sera le caster original de l'effet"),
    c(2, "Le caster sera le porteur cet effet"),
    d(3, "Le caster sera la cible de cet effet"),
    e(4, "Le caster sera le caster de l'effet declencheur"),
    f(5, "Le caster sera la cible de l'effet declencheur");

    private final byte g;
    private final String h;

    private SA(byte by, String string2) {
        this.g = by;
        this.h = string2;
    }

    @Override
    public String d() {
        return Byte.toString(this.g);
    }

    @Override
    public String e() {
        return this.name();
    }

    @Override
    public String f() {
        return this.h;
    }

    public byte a() {
        return this.g;
    }

    public static SA a(byte by) {
        SA[] sAArray = SA.values();
        for (int k = 0; k < sAArray.length; ++k) {
            SA sA = sAArray[k];
            if (sA.g != by) continue;
            return sA;
        }
        return null;
    }
}

