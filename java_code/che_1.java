/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from chE
 */
final class che_1
extends chd_1<cui_2, bvx_2> {
    che_1() {
    }

    @Override
    public boolean a(cui_2 cui_22) {
        blx_1 blx_12 = (blx_1)((bvx_2)this.a).n(cui_22.g());
        if (blx_12 != null) {
            bwa_0.a(cui_22.e(), cui_22.b(), cui_22.d(), blx_12);
        }
        this.b(cui_22);
        return false;
    }

    private void b(cui_2 cui_22) {
        bbL bbL2 = new bbL(cui_22.e(), cui_22.c().a(), cui_22.b(), cui_22.d(), cui_22.h(), cui_22.o(), cui_22.p(), cui_22.g(), cui_22.i(), cui_22.j(), cui_22.k());
        akx_1 akx_12 = baa_0.a().a(cui_22.d(), (aku_1)bbL2);
        bbL2.a(new bZR(akx_12), new alb_1(akx_12));
    }
}

