/*
 * Decompiled with CFR 0.152.
 */
public enum eEF {
    a(131, 0, 499),
    b(181, 0, 499),
    c(204, 0, 499);

    private final int d;
    private final int e;
    private final int f;

    private eEF(int n2, int n3, int n4) {
        this.d = n2;
        this.e = n3;
        this.f = n4;
    }

    public static eEF a(int n) {
        for (eEF eEF2 : eEF.values()) {
            if (eEF2.d != n) continue;
            return eEF2;
        }
        return null;
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.f;
    }

    public static boolean b(int n) {
        for (eEF eEF2 : eEF.values()) {
            if (eEF2.d != n) continue;
            return true;
        }
        return false;
    }
}

