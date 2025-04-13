/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from blr
 */
public enum blr_2 implements aqk_2
{
    a(0),
    b(1),
    c(2),
    d(4),
    e(5),
    f(6),
    g(7),
    h(8);

    private final byte i;

    public static blr_2 a(byte by) {
        for (blr_2 blr_22 : blr_2.values()) {
            if (blr_22.i != by) continue;
            return blr_22;
        }
        return null;
    }

    private blr_2(byte by) {
        this.i = by;
    }

    public byte a() {
        return this.i;
    }

    @Override
    public String d() {
        return Byte.toString(this.i);
    }

    @Override
    public String e() {
        return this.toString();
    }

    public String b() {
        return bae.h().a("challenge.type." + this.ordinal(), new Object[0]);
    }

    @Override
    public String f() {
        return null;
    }
}

