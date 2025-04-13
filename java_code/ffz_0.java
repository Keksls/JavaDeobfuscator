/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ffZ
 */
public enum ffz_0 implements aqk_2
{
    a(1),
    b(2),
    c(3),
    d(4);

    private final byte e;

    private ffz_0(int n2) {
        this.e = (byte)n2;
    }

    public byte a() {
        return this.e;
    }

    public static ffz_0 a(byte by) {
        for (ffz_0 ffz_02 : ffz_0.values()) {
            if (ffz_02.e != by) continue;
            return ffz_02;
        }
        return null;
    }

    @Override
    public String d() {
        return Byte.toString(this.a());
    }

    @Override
    public String e() {
        return this.name();
    }

    @Override
    public String f() {
        return this.name();
    }
}

