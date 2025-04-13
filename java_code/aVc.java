/*
 * Decompiled with CFR 0.152.
 */
public final class aVc {
    private aVc() {
    }

    public static String a(long l) {
        long l2 = azu_0.j().n().u();
        if (l < l2) {
            return String.format("DM_%d_%d", l, l2);
        }
        return String.format("DM_%d_%d", l2, l);
    }
}

