/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fiD
 */
public enum fid_0 implements aqk_2
{
    a(0),
    b(1),
    c(2),
    d(3),
    e(4);

    private final byte f;

    public static fid_0 a(byte by) {
        for (fid_0 fid_02 : fid_0.values()) {
            if (fid_02.f != by) continue;
            return fid_02;
        }
        return a;
    }

    private fid_0(byte by) {
        this.f = by;
    }

    @Override
    public String d() {
        return Byte.toString(this.f);
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

