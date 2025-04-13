/*
 * Decompiled with CFR 0.152.
 */
public final class TC {
    private static final long a = 0x3FFFFFFFFFFFFFFFL;
    private static long b = -1L;
    private static long c = 0L;

    public static void a(long l) {
        if (l >= 0L) {
            throw new IndexOutOfBoundsException("L'id de base pour la g\u00e9n\u00e9ration dynamique doit etre n\u00e9gatif.");
        }
        c = l;
    }

    public static long b(long l) {
        if (l < 0L) {
            return l;
        }
        if (l >= 0x3FFFFFFFFFFFFFFFL) {
            throw new IndexOutOfBoundsException("L'ID sp\u00e9cifi\u00e9 \u00e9crase une plage d'ID existante id=" + l + " >= 4611686018427387903");
        }
        return 0x3FFFFFFFFFFFFFFFL + l;
    }

    public static long c(long l) {
        if (l > 0x3FFFFFFFFFFFFFFFL) {
            return l - 0x3FFFFFFFFFFFFFFFL;
        }
        return l;
    }

    public static boolean d(long l) {
        return l >= 0x3FFFFFFFFFFFFFFFL;
    }

    public static boolean e(long l) {
        return l < 0L;
    }

    public static long a() {
        return c - b--;
    }
}

