/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from aPK
 */
class apk_0<RE extends sd_0<efh_0, efi_0>, EC extends efi_0>
extends apj_0<RE, EC> {
    final /* synthetic */ aph_0 b;

    apk_0(aph_0 aph_02) {
        this.b = aph_02;
        super(aph_02);
    }

    @Override
    protected void b(blx_1 blx_12, aff_1 aff_12, efh_0 efh_02, short s2, List<efi_0> list) {
        aej_2 aej_22 = new afs_2(blx_12.P_(), aff_12).h();
        Iterable<int[]> iterable = this.a(efh_02, list).a(aff_12.d(), aff_12.e(), aff_12.f(), blx_12.G(), blx_12.H(), blx_12.I(), aej_22);
        aff_1 aff_13 = new aff_1();
        tg_0 tg_02 = blx_12.bz().g();
        for (int[] nArray : iterable) {
            int n = nArray[0];
            int n2 = nArray[1];
            aff_13.c(n, n2, aff_12.f());
            if (!tg_02.c(n, n2)) continue;
            this.b.a(list, blx_12, aff_13, s2);
        }
    }
}

