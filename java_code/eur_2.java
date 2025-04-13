/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eUr
 */
final class eur_2
extends eul_2 {
    @Override
    public enX a(euk_2 euk_22) {
        boolean bl;
        if (!enp_2.a.d(ens_2.bc)) {
            return enX.a;
        }
        ebe_0 ebe_02 = euk_22.a();
        if (ebe_02 == null) {
            return enX.j;
        }
        long l = ebe_02.c();
        boolean bl2 = bl = l == euk_22.e() || euk_22.e() == 0L;
        if (!bl) {
            return enX.i;
        }
        long l2 = euk_22.f();
        if (l2 == 0L) {
            return enX.a;
        }
        boolean bl3 = l == l2;
        return bl3 ? enX.a : enX.f;
    }
}

