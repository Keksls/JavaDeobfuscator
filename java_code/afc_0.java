/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from afC
 */
public final class afc_0 {
    public static final float a = UL.a.b();
    public static final float b = 1760.0f;
    public static final float c = 400.0f;
    public static final float d = 600.0f;
    public static final float e = 700.0f;
    public static final float f = UL.b.b();
    public static final float g = 1300.0f;
    private static float h = 1.0f;

    private afc_0() {
    }

    public static float a() {
        return h;
    }

    public static void a(float f2) {
        h = f2;
    }

    public static afd_0 a(int[] nArray, int[] nArray2) {
        int n = nArray[2];
        int n2 = nArray2[2];
        boolean bl = yz_0.c(nArray[0], nArray[1], n);
        boolean bl2 = yz_0.c(nArray2[0], nArray2[1], n2);
        boolean bl3 = yz_0.a(nArray[0], nArray[1], n);
        boolean bl4 = yz_0.a(nArray2[0], nArray2[1], n2);
        boolean bl5 = yz_0.d(nArray[0], nArray[1], n);
        boolean bl6 = yz_0.d(nArray2[0], nArray2[1], n2);
        boolean bl7 = yz_0.e(nArray[0], nArray[1], n);
        boolean bl8 = yz_0.e(nArray2[0], nArray2[1], n2);
        if (bl && bl2 && Math.abs(n - n2) == 10) {
            return afd_0.c;
        }
        if (bl3 || bl4) {
            return afd_0.g;
        }
        if (bl5 && bl8) {
            return afd_0.f;
        }
        if (bl7 && bl6) {
            return afd_0.d;
        }
        if (bl7 && bl8) {
            return afd_0.e;
        }
        return Math.abs(n - n2) > 2 ? afd_0.b : afd_0.a;
    }
}

