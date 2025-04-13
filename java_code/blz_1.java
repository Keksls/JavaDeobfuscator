/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from blZ
 */
class blz_1
implements abb_0 {
    final /* synthetic */ erc_2 a;
    final /* synthetic */ biI b;
    final /* synthetic */ blx_1 c;

    blz_1(blx_1 blx_12, erc_2 erc_22, biI biI2) {
        this.c = blx_12;
        this.a = erc_22;
        this.b = biI2;
    }

    @Override
    public void animationEnded(abu abu2) {
        afv afv2 = ((afa_0)((Object)this.a)).e();
        if (this.b.c() != afv2 || afv2 == null) {
            return;
        }
        afv2.b(this.b.be(), (float)this.b.bf(), (float)(this.b.bg() + this.b.af()));
        this.b.b(this);
    }
}

