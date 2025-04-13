/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bwX
 */
abstract class bwx_1
implements bww_1 {
    final bwh_0 a;
    final bmr_1 b;
    final byte c;

    bwx_1(bwh_0 bwh_02, bmr_1 bmr_12, byte by) {
        this.a = bwh_02;
        this.b = bmr_12;
        this.c = by;
    }

    @Override
    public ema_1 a() {
        return this.a.a(this.b, this.c);
    }
}

