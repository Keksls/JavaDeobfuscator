/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ezF
 */
public enum ezf_2 implements aqk_2
{
    a(0),
    b(1);

    private final byte c;

    public static ezf_2 a(byte by) {
        for (ezf_2 ezf_22 : ezf_2.values()) {
            if (ezf_22.c != by) continue;
            return ezf_22;
        }
        return a;
    }

    private ezf_2(byte by) {
        this.c = by;
    }

    @Override
    public String d() {
        return Byte.toString(this.c);
    }

    @Override
    public String e() {
        return this.toString();
    }

    @Override
    public String f() {
        return null;
    }
}

