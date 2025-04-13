/*
 * Decompiled with CFR 0.152.
 */
public enum ffp {
    a(0),
    b(1);

    public final byte c;

    private ffp(int n2) {
        this.c = Hw.b((long)n2);
    }

    public static ffp a(byte by) {
        for (ffp ffp2 : ffp.values()) {
            if (ffp2.c != by) continue;
            return ffp2;
        }
        throw new IllegalArgumentException("Impossible de r\u00e9cup\u00e9rer le GroupType d'Id " + by);
    }
}

