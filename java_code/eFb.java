/*
 * Decompiled with CFR 0.152.
 */
public enum eFb {
    a(0),
    b(1),
    c(2),
    d(3);

    public final int e;

    private eFb(int n2) {
        this.e = n2;
    }

    public static eFb a(int n) {
        for (eFb eFb2 : eFb.values()) {
            if (eFb2.e != n) continue;
            return eFb2;
        }
        return a;
    }
}

