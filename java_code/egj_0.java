/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eGJ
 */
public class egj_0
extends egl_0 {
    public egj_0() {
    }

    public egj_0(ru_0 ru_02) {
        super(ru_02);
    }

    public egj_0 aD() {
        egj_0 egj_02 = new egj_0();
        egj_02.v = this.v;
        return egj_02;
    }

    @Override
    protected void a(rs_0 rs_02) {
        rs_02.g(rs_02.c() + this.m);
    }

    @Override
    protected void b(rs_0 rs_02) {
        if (rs_02.c() - this.m < rs_02.e()) {
            rs_02.g(rs_02.e());
            this.m = rs_02.c() - rs_02.e();
        } else {
            rs_02.g(rs_02.c() - this.m);
        }
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

