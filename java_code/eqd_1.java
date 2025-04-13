/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eqd
 */
class eqd_1
extends eqe_1 {
    private final byte b;
    private final float c;

    eqd_1(byte by, float f2) {
        this.b = by;
        this.c = f2;
    }

    public int a(short s2) {
        return (int)Math.floor((float)s2 * this.c);
    }

    @Override
    protected void a(eov_1<epa_1> eov_12, short s2, short s3) {
        epa_1 epa_12 = eov_12.b(eps_0.a(this.b));
        int n = this.a(s3) - this.a(s2);
        epa_12.e(n);
        epa_12.c(n);
    }

    @Override
    public int a(eps_0 eps_02, short s2, short s3) {
        if (this.b != eps_02.a()) {
            return 0;
        }
        return this.a(s3) - this.a(s2);
    }
}

