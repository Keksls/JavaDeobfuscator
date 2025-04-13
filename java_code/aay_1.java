/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aAy
 */
final class aay_1
extends aav_1 {
    @Override
    public aaq_1 a(int n, int n2, aaq_1 aaq_12, aas_1 aas_12, aas_1 aas_13) {
        aaq_1 aaq_13 = new aaq_1(n, n);
        int n3 = aaq_13.c;
        int n4 = aaq_13.d;
        this.b(n3, n2, aaq_12, aas_12, aas_13);
        int n5 = aaq_13.e;
        int n6 = aaq_13.f;
        double d2 = Math.PI * 2;
        int n7 = n * n;
        for (int k = 0; k < n3; ++k) {
            int n8 = k - n5;
            int n9 = Math.abs(n8);
            n9 *= n9;
            for (int i2 = 0; i2 < n4; ++i2) {
                int n10;
                int n11 = i2 - n6;
                int n12 = Math.abs(n11);
                if ((n10 = n9 + (n12 *= n12)) > n7) continue;
                double d3 = (Math.atan2(n11, n8) + Math.PI * 2) % (Math.PI * 2) / (Math.PI * 2);
                int n13 = (int)(d3 * (double)n2);
                n10 = Hw.d(n10);
                aaq_13.b[k][i2] = this.a(n10, n13);
            }
        }
        return aaq_13;
    }
}

