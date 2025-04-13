/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from chT
 */
final class cht_1
extends chd_1<ctn_2, bvx_2> {
    cht_1() {
    }

    @Override
    public boolean a(ctn_2 ctn_22) {
        chv_1.d.a = true;
        if (!ctn_22.j()) {
            ((bvx_2)this.a).a(ctn_22.h());
            ((bvx_2)this.a).b(ctn_22.g());
        }
        bbg bbg2 = new bbg(ctn_22.e(), ctn_22.c().a(), ctn_22.b(), ((bvx_2)this.a).c(), ctn_22.j());
        if (ctn_22.j()) {
            baa_0.a().a((bvx_2)this.a, (aku_1)bbg2);
            baa_0.a().a(this.a);
        } else {
            ((bvx_2)this.a).s().a(bbg2);
        }
        return false;
    }
}

