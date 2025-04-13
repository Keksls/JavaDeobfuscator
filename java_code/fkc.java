/*
 * Decompiled with CFR 0.152.
 */
public enum fkc {
    a(200),
    b(201),
    c(202),
    d(203);

    private final int e;

    private fkc(int n2) {
        this.e = n2;
    }

    public int a() {
        return this.e;
    }

    public static fkc a(int n) {
        for (fkc fkc2 : fkc.values()) {
            if (fkc2.e != n) continue;
            return fkc2;
        }
        return null;
    }
}

