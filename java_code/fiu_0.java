/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fiu
 */
public final class fiu_0 {
    public static int a(fiy fiy2, epq_2 epq_22) {
        int n = fiy2.a(eps_0.al);
        if (n == 0) {
            return 0;
        }
        int n2 = 0;
        if (n >= 0 && epq_22.a(eps_0.an)) {
            n2 = epq_22.c(eps_0.an);
        } else if (epq_22.a(eps_0.am)) {
            n2 = epq_22.c(eps_0.am);
        }
        return fiu_0.a(n, n2);
    }

    private static int a(int n, int n2) {
        float f2 = (float)(n * n2) / 100.0f;
        int n3 = n;
        n3 = n2 > 0 ? (n3 += Hw.c(f2)) : (n3 += Hw.d(f2));
        return n3;
    }
}

