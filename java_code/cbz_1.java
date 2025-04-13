/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cbZ
 */
public enum cbz_1 {
    a(0),
    b(1),
    c(2);

    private final byte d;

    private cbz_1(byte by) {
        this.d = by;
    }

    public String a() {
        try {
            return String.format(azs_0.a().a("windForceIconsPath"), this.ordinal());
        }
        catch (gm_0 gm_02) {
            return null;
        }
    }

    public byte b() {
        return this.d;
    }
}

