/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bCA
 */
final class bca_2
extends bcy_2 {
    @Override
    public boolean a(bcx_2 bcx_22, TF tF) {
        boolean bl;
        if (!(tF instanceof bmr_1)) {
            return false;
        }
        bmr_1 bmr_12 = (bmr_1)tF;
        long l = bmr_12.T_();
        bos_2 bos_22 = (bos_2)((erp_1)((Object)tF)).fm();
        bsx_2 bsx_22 = bmr_12.di();
        boolean bl2 = bl = bsx_22 != null && bsx_22.q() == bmr_12.a_();
        if (bl) {
            return true;
        }
        boolean bl3 = bsx_22 != null && bos_22.a(bsx_22.q()) != null;
        boolean bl4 = bcy_2.a(l, bos_22);
        return bl4 || bl3;
    }
}

