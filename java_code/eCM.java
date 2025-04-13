/*
 * Decompiled with CFR 0.152.
 */
public enum eCM implements aqk_2
{
    a(0),
    b(1),
    c(2),
    d(3);

    private final byte e;

    private eCM(byte by) {
        this.e = by;
    }

    @Override
    public String d() {
        return Integer.toString(this.e);
    }

    @Override
    public String e() {
        return this.toString();
    }

    @Override
    public String f() {
        return null;
    }

    public static eCM a(byte by) {
        for (eCM eCM2 : eCM.values()) {
            if (eCM2.e != by) continue;
            return eCM2;
        }
        return null;
    }

    public byte a() {
        return this.e;
    }
}

