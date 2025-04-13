/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cdq
 */
class cdq_1 {
    private final long a;
    private final byte[] b = new byte[4];

    cdq_1(long l) {
        this.a = l;
        this.c();
    }

    private void c() {
        for (int k = 0; k < 6; ++k) {
            for (int i2 = 0; i2 < 6; ++i2) {
                int n = cdp_1.a(i2, k, 6);
                int n2 = cdp_1.a(cdp_1.h(i2), cdp_1.h(k), 2);
                if (!Hw.b(this.a, n)) continue;
                int n3 = n2;
                this.b[n3] = (byte)(this.b[n3] + 1);
            }
        }
    }

    public byte a(int n, int n2) {
        if (this.a == 0L) {
            return 0;
        }
        n = (n % 2 + 2) % 2;
        n2 = (n2 % 2 + 2) % 2;
        int n3 = cdp_1.a(n2, n, 2);
        return this.b[n3];
    }

    public byte b(int n, int n2) {
        if (this.a == 0L) {
            return 0;
        }
        int n3 = cdp_1.a(cdp_1.g(n2), cdp_1.g(n), 2);
        return this.b[n3];
    }

    public boolean c(int n, int n2) {
        if (this.a == 0L) {
            return false;
        }
        n = (n % 6 + 6) % 6;
        n2 = (n2 % 6 + 6) % 6;
        int n3 = cdp_1.a(n2, n, 6);
        return Hw.b(this.a, n3);
    }

    public boolean a() {
        return this.a != 0L;
    }

    public void b() {
        for (int k = 0; k < 6; ++k) {
            for (int i2 = 0; i2 < 6; ++i2) {
                int n = cdp_1.a(i2, k, 6);
                System.out.print(Hw.b(this.a, n) ? "R " : "x ");
            }
            System.out.println("");
        }
    }
}

