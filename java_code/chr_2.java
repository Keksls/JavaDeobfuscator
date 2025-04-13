/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from chr
 */
final class chr_2
extends chd_1<ctx_2, bvx_2> {
    chr_2() {
    }

    @Override
    public boolean a(ctx_2 ctx_22) {
        bvx_2 bvx_22 = azu_0.j().k().cP();
        boolean bl = bvx_22 != null && bvx_22.c() == ctx_22.d();
        apl_1 apl_12 = ctx_22.i();
        ban ban2 = null;
        emu_2 emu_22 = ctx_22.j();
        if (emu_22 == null) {
            emu_22 = emu_2.a;
        }
        switch (emu_22) {
            case a: 
            case e: 
            case f: {
                ban2 = new bbx_0(ctx_22.e(), ctx_22.c().a(), ctx_22.b(), ctx_22.d(), ctx_22.g(), emu_22, apl_12, aej_2.a(ctx_22.h()), bl);
                break;
            }
            case b: {
                int[] nArray = apl_12.d();
                aff_1 aff_12 = new aff_1(nArray);
                ban2 = new bbs_0(ctx_22.e(), ctx_22.c().a(), ctx_22.b(), ctx_22.d(), ctx_22.g(), aff_12);
                break;
            }
            case c: {
                int[] nArray = apl_12.d();
                aff_1 aff_13 = new aff_1(nArray);
                ban2 = new bbt_0(ctx_22.e(), ctx_22.c().a(), ctx_22.b(), ctx_22.d(), ctx_22.g(), aff_13);
                break;
            }
            case d: {
                int[] nArray = apl_12.d();
                aff_1 aff_14 = new aff_1(nArray);
                ban2 = new bbV(ctx_22.e(), ctx_22.c().a(), ctx_22.b(), ctx_22.d(), ctx_22.g(), aff_14);
            }
        }
        baa_0.a().a(ctx_22.d(), ban2);
        return false;
    }
}

