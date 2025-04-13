/*
 * Decompiled with CFR 0.152.
 */
class eGj
implements rv_0 {
    int a = 0;
    int b = 0;
    int c = 0;
    Su d;

    eGj() {
    }

    @Override
    public void a(rs_0 rs_02) {
        int n = rs_02.c();
        int n2 = rs_02.a();
        int n3 = n - this.a;
        int n4 = n2 - this.b;
        this.c += n3;
        this.a = n;
        this.b = n2;
        rs_0 rs_03 = this.d.b(eps_0.d);
        rs_03.b(rs_03.a() + n4);
        rs_03.g(rs_03.d() + n3);
    }
}

