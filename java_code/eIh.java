/*
 * Decompiled with CFR 0.152.
 */
public final class eIh
extends eib_0 {
    public eIh() {
        this.M();
    }

    public eIh aK() {
        return new eIh();
    }

    @Override
    public efn_0 a(ejh_0 ejh_02, boolean bl) {
        int n;
        efn_0 efn_02 = super.a(ejh_02, bl);
        Su su = this.G ? this.e : this.f;
        if (su == null) {
            return efn_02;
        }
        rs_0 rs_02 = su.b(eps_0.b);
        rs_0 rs_03 = su.b(eps_0.T);
        int n2 = 0;
        int n3 = 0;
        if (rs_02 != null) {
            n2 = rs_02.c();
            n3 = rs_02.a();
        }
        if (rs_03 != null) {
            n2 += rs_03.c();
            n3 += rs_03.a();
        }
        int n4 = rs_02 != null || rs_03 != null ? (this.L == 1 ? n2 : (this.L == 2 ? n3 * 100 / n2 : (this.L == 3 ? (n2 - n3) * 100 / n2 : (this.L == 4 ? n2 - n3 : n3)))) : 0;
        if (this.H) {
            n = this.I == 0 ? n4 : (int)Math.floor((float)n4 / (float)this.I);
        } else {
            switch (this.M) {
                case d: {
                    n = (int)Math.ceil(this.J + this.K * (float)n4);
                    break;
                }
                case c: {
                    n = (int)Math.floor(this.J + this.K * (float)n4);
                    break;
                }
                default: {
                    n = Math.round(this.J + this.K * (float)n4);
                }
            }
        }
        efn_02.a(n);
        return efn_02;
    }

    @Override
    public /* synthetic */ eib_0 aD() {
        return this.aK();
    }

    @Override
    public /* synthetic */ eHV aE() {
        return this.aK();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aK();
    }
}

