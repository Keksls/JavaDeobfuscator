/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from azS
 */
public class azs_1 {
    private final int a;
    private final int b;

    public azs_1(int n, int n2) {
        this.a = n;
        this.b = n2;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int a(azs_1 azs_12, boolean bl) {
        int n = this.a - azs_12.a;
        if (n != 0) {
            return n;
        }
        int n2 = this.b - azs_12.b;
        if (n2 != 0 || !bl) {
            return n2;
        }
        return 0;
    }

    public int a(azs_1 azs_12) {
        return this.a(azs_12, false);
    }
}

