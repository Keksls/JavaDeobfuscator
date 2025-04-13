/*
 * Decompiled with CFR 0.152.
 */
public enum eEC {
    a(0),
    b(1);

    private final int c;

    private eEC(int n2) {
        this.c = n2;
    }

    public int a() {
        return this.c;
    }

    public static eEC a(int n) {
        for (eEC eEC2 : eEC.values()) {
            if (eEC2.c != n) continue;
            return eEC2;
        }
        return null;
    }
}

