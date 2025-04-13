/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cDE
 */
public interface cde_0 {
    default public akr_0 a(aqx_2 aqx_22) {
        aqx_2 aqx_23;
        aqx_2 aqx_24;
        aqx_2 aqx_25;
        aqx_2 aqx_26 = aqx_22.f("id");
        if (aqx_26 == null) {
            return null;
        }
        akr_0 akr_02 = new akr_0();
        akr_02.a(aqx_26.h());
        aqx_2 aqx_27 = aqx_22.f("gain");
        if (aqx_27 != null) {
            akr_02.a((float)aqx_27.g() / 100.0f);
        }
        if ((aqx_25 = aqx_22.f("rollOff")) != null) {
            akr_02.a(aqx_25.g());
        }
        if ((aqx_24 = aqx_22.f("minPitch")) != null) {
            akr_02.b(aqx_24.i());
        }
        if ((aqx_23 = aqx_22.f("maxPitch")) != null) {
            akr_02.c(aqx_23.i());
        }
        return akr_02;
    }
}

