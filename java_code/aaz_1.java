/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aAz
 */
final class aaz_1
extends aav_1 {
    @Override
    public aaq_1 a(int n, int n2, aaq_1 aaq_12, aas_1 aas_12, aas_1 aas_13) {
        aaq_1 aaq_13 = new aaq_1(n, n2);
        int n3 = aaq_13.c;
        int n4 = aaq_13.d;
        this.b(n3, n4, aaq_12, aas_12, aas_13);
        for (int k = 0; k < n3; ++k) {
            for (int i2 = 0; i2 < n4; ++i2) {
                aaq_13.b[k][i2] = this.a(k, i2);
            }
        }
        return aaq_13;
    }
}

