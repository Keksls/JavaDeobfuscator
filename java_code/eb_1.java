/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from EB
 */
public final class eb_1 {
    private eb_1() {
    }

    public static void a(FW fW, eg_1 eg_12) {
        int n;
        short s2 = eg_12.b();
        fW.a(s2);
        fW.a(eg_12.a());
        if (!fW.h(64)) {
            fW.a(0);
            fW.b(0);
        } else {
            fW.a(eg_12.e());
            fW.a(fW.b().hashCode());
            n = fW.b().indexOf(95) + 1;
            fW.b(fW.b().substring(n).hashCode());
        }
        eg_12.c();
        eg_12.c();
        n = eg_12.b() & 0xFFFF;
        fW.a(eg_12.c(n));
        n = eg_12.b() & 0xFFFF;
        fW.a(eg_12.b(n));
        n = eg_12.b() & 0xFFFF;
        fW.b(n == 0 ? null : eg_12.b(n));
        fW.a(ea_1.a(eg_12));
        short[] sArray = fW.l();
        for (int k = 0; k < sArray.length; ++k) {
            if (sArray[k] > fW.g()) {
                fW.c(sArray[k]);
            }
            k += sArray[k];
        }
    }
}

