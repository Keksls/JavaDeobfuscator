/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eUs
 */
final class eus_2
extends eul_2 {
    @Override
    public enX a(euk_2 euk_22) {
        if (!enp_2.a.d(ens_2.bc)) {
            return enX.a;
        }
        ebe_0 ebe_02 = euk_22.a();
        if (ebe_02 == null) {
            return enX.j;
        }
        int n = ebe_02.b();
        boolean bl = n == euk_22.g();
        boolean bl2 = n == euk_22.h();
        return bl && bl2 ? enX.a : enX.g;
    }
}

