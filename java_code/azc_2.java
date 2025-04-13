/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from azc
 */
public class azc_2 {
    protected final aby_2 a;
    protected final int b;
    protected byte c = 1;

    public azc_2(azc_2 azc_22) {
        this.a = new aby_2(azc_22.a);
        this.b = azc_22.b;
        this.c = azc_22.c;
    }

    public azc_2(azr_2 azr_22, int n) {
        int n2 = azr_22.a() * azr_22.b();
        this.a = new aby_2(n2);
        int n3 = azr_22.a();
        int n4 = azr_22.b();
        for (int k = 0; k < n3; ++k) {
            for (int i2 = 0; i2 < n4; ++i2) {
                this.a.a(i2 * n3 + k, azr_22.a(k, n4 - 1 - i2) >= n);
            }
        }
        this.b = n3;
    }

    public azc_2(byte[] byArray, int n, byte by) {
        this.b = Hw.d((float)n / (float)by);
        this.a = aby_2.a(byArray);
        this.c = by;
    }

    public boolean a(int n, int n2) {
        return this.a.a(n2 / this.c * this.b + n / this.c);
    }
}

