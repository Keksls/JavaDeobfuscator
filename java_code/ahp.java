/*
 * Decompiled with CFR 0.152.
 */
public abstract class ahp {
    private static ahp a;

    public static ahp a() {
        if (a == null) {
            throw new UnsupportedOperationException("Le provider n'est pas initialis\u00e9");
        }
        return a;
    }

    public static void a(ahp ahp2) {
        if (a != null) {
            throw new UnsupportedOperationException("Le provider a d\u00e9j\u00e0 \u00e9t\u00e9 initialis\u00e9");
        }
        a = ahp2;
    }

    public abstract ahn a(int var1);

    public abstract String b();
}

