/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Op
 */
public enum op_2 {
    a(0),
    b(1);

    private final int c;

    private op_2(int n2) {
        this.c = n2;
    }

    public int a() {
        return this.c;
    }

    public static op_2 a(int n) {
        for (op_2 op_22 : op_2.values()) {
            if (op_22.c != n) continue;
            return op_22;
        }
        return null;
    }
}

