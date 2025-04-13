/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eIF
 */
public class eif_0
extends eGH {
    private static final aqr_2 z = new eFw(new aqq_2[0]);

    @Override
    public aqr_2 c_() {
        return z;
    }

    private eif_0() {
    }

    public eif_0(ru_0 ru_02) {
        this.w = ru_02;
        this.y = false;
        this.M();
    }

    public eif_0 aF() {
        eif_0 eif_02 = new eif_0();
        eif_02.w = this.w;
        eif_02.y = false;
        return eif_02;
    }

    @Override
    public void j(sd_0 sd_02) {
        Su su = this.aM();
        if (!su.a(this.w)) {
            this.m = 0;
            return;
        }
        rs_0 rs_02 = su.b(this.w);
        this.m = rs_02.c() - rs_02.a();
    }

    @Override
    public /* synthetic */ eGH aG() {
        return this.aF();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aF();
    }
}

