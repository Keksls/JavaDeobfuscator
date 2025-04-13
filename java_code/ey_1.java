/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Ey
 */
public final class ey_1 {
    private static final int a = 65535;
    private static final float b = 65535.0f;

    private ey_1() {
    }

    public static void a(FU fU, eg_1 eg_12) {
        fU.a(eg_12.b());
        fU.b(eg_12.b());
        fU.a((float)(eg_12.b() & 0xFFFF) / 65535.0f);
        fU.b((float)(eg_12.b() & 0xFFFF) / 65535.0f);
        fU.c((float)(eg_12.b() & 0xFFFF) / 65535.0f);
        fU.d((float)(eg_12.b() & 0xFFFF) / 65535.0f);
        fU.c(eg_12.b());
        fU.d(eg_12.b());
        fU.e(eg_12.d());
        fU.f(eg_12.d());
    }
}

