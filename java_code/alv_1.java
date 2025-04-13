/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aLV
 */
public class alv_1
extends alw_1 {
    public alv_1(amj_1 amj_12, alo_1 alo_12, float f2, boolean bl, float f3) {
        super(amj_12, alo_12, f2, bl, f3);
    }

    @Override
    public void a(afr_2 afr_22) {
        float f2 = afr_22.a();
        float f3 = f2 > 2.0f ? f2 - 2.0f : (f2 < -2.0f ? f2 + 2.0f : 0.0f);
        float f4 = afr_22.b();
        float f5 = f4 > 2.0f ? f4 - 2.0f : (f4 < -2.0f ? f4 + 2.0f : 0.0f);
        float f6 = afr_22.c();
        float f7 = f6 > 2.0f ? f6 - 2.0f : (f6 < -2.0f ? f6 + 2.0f : 1.0f);
        this.b.a(f3, f5, f7);
    }
}

