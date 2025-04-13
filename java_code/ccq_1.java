/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ccq
 */
class ccq_1
implements aei_0 {
    private final avi_2 b;
    final /* synthetic */ ccp_1 a;

    ccq_1(ccp_1 ccp_12) {
        this.a = ccp_12;
        this.b = this.a.b;
    }

    @Override
    public void b(int n) {
        this.b.a(n);
    }

    @Override
    public int e() {
        return 0;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public void a(int n, int n2, int n3, int n4, float[] fArray) {
        fArray[0] = fArray[0] * this.b.a();
        fArray[1] = fArray[1] * this.b.b();
        fArray[2] = fArray[2] * this.b.c();
    }
}

