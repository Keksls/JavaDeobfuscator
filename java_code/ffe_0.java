/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ffE
 */
public enum ffe_0 {
    a(0),
    b(1);

    private final short c;

    private ffe_0(short s2) {
        this.c = s2;
    }

    public static ffe_0 a(short s2) {
        for (ffe_0 ffe_02 : ffe_0.values()) {
            if (ffe_02.c != s2) continue;
            return ffe_02;
        }
        return null;
    }

    public short a() {
        return this.c;
    }
}

