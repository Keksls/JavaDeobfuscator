/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bVU
 */
public enum bvu_0 {
    a(0, "options.specificEffectAreaDisplayMode.over"),
    b(1, "options.specificEffectAreaDisplayMode.click");

    private final byte c;
    private final String d;

    private bvu_0(byte by, String string2) {
        this.c = by;
        this.d = string2;
    }

    public byte a() {
        return this.c;
    }

    public String b() {
        return this.d;
    }

    public static bvu_0 a(byte by) {
        for (bvu_0 bvu_02 : bvu_0.values()) {
            if (by != bvu_02.c) continue;
            return bvu_02;
        }
        return null;
    }

    public static bvu_0 a(String string) {
        for (bvu_0 bvu_02 : bvu_0.values()) {
            if (!bae.h().a(bvu_02.d, new Object[0]).equals(string)) continue;
            return bvu_02;
        }
        return null;
    }

    public static bvu_0 c() {
        return bvu_0.a((byte)((bvx_0)ans_0.D().h()).d(bWe.z));
    }
}

