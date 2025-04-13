/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aUE
 */
public enum aue_0 {
    a(1),
    b(2),
    c(4),
    d(8);

    private final short e;

    private aue_0(short s2) {
        this.e = s2;
    }

    public String a() {
        switch (this) {
            case a: {
                return bae.h().a("chat.friendList", new Object[0]);
            }
            case b: {
                return bae.h().a("chat.ignoreList", new Object[0]);
            }
        }
        return this.name();
    }

    public short b() {
        return this.e;
    }

    public static aue_0 a(short s2) {
        for (aue_0 aue_02 : aue_0.values()) {
            if (aue_02.b() != s2) continue;
            return aue_02;
        }
        return null;
    }
}

