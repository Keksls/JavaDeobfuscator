/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cid
 */
final class cid_2
extends chd_1<cub_2, bvx_2> {
    cid_2() {
    }

    @Override
    public boolean a(cub_2 cub_22) {
        bbm bbm2 = new bbm(cub_22.e(), cub_22.c().a(), cub_22.b(), ((bvx_2)this.a).c());
        bbm2.b(cub_22.g());
        bbm2.d(wc_0.p().getTimeInMillis() + cub_22.h());
        if (((bvx_2)this.a).X() || !chv_1.d.b) {
            baa_0.a().a((bvx_2)this.a, (aku_1)bbm2);
            baa_0.a().a(this.a);
        } else {
            chv_1.d.c.a(bbm2);
        }
        return false;
    }
}

