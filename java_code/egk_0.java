/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eGK
 */
public class egk_0
extends egl_0 {
    public egk_0() {
    }

    public egk_0(ru_0 ru_02) {
        super(ru_02);
    }

    public egk_0 aD() {
        egk_0 egk_02 = new egk_0();
        egk_02.v = this.v;
        return egk_02;
    }

    @Override
    protected void a(rs_0 rs_02) {
        if (rs_02.c() - this.m < rs_02.e()) {
            rs_02.g(rs_02.e());
            this.m = rs_02.c() - rs_02.e();
        } else {
            rs_02.g(rs_02.c() - this.m);
        }
    }

    @Override
    protected void b(rs_0 rs_02) {
        rs_02.g(rs_02.c() + this.m);
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

