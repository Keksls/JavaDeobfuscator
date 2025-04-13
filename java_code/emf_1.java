/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eMF
 */
public final class emf_1 {
    public static boolean a(epq_2 epq_22, fio_0 fio_02, fin_0 fin_02) {
        int n = fin_02.g(fio_02, (Object)epq_22, null, epq_22.ge());
        int n2 = epq_22.a_(eps_0.d).a();
        if (n > 0) {
            if (epq_22.a(eoz_1.H)) {
                n2 = -1;
            } else if (epq_22.a(eoz_1.G)) {
                n2 -= 2;
            } else if (epq_22.a(eoz_1.F)) {
                --n2;
            }
        }
        return n <= n2;
    }

    public static boolean b(epq_2 epq_22, fio_0 fio_02, fin_0 fin_02) {
        int n = fin_02.e(fio_02, (Object)epq_22, null, epq_22.ge());
        int n2 = epq_22.a_(eps_0.e).a();
        if (n > 0) {
            if (epq_22.a(eoz_1.y)) {
                n2 = -1;
            } else if (epq_22.a(eoz_1.x)) {
                n2 -= 2;
            } else if (epq_22.a(eoz_1.w)) {
                --n2;
            }
        }
        return n <= n2;
    }

    public static boolean c(epq_2 epq_22, fio_0 fio_02, fin_0 fin_02) {
        int n = fin_02.h(fio_02, epq_22, null, epq_22.ge());
        int n2 = epq_22.a_(eps_0.c).a();
        if (n > 0) {
            if (epq_22.a(eoz_1.X)) {
                return false;
            }
            if (epq_22.a(eoz_1.E)) {
                n2 = -1;
            } else if (epq_22.a(eoz_1.D)) {
                n2 -= 2;
            } else if (epq_22.a(eoz_1.C)) {
                --n2;
            }
        }
        return n <= n2;
    }

    public static boolean a(epq_2 epq_22, eps_0 eps_02, fio_0 fio_02, fin_0 fin_02) {
        fiy fiy2 = fin_02.g(fio_02, epq_22, null, epq_22.ge());
        int n = fiy2.a(eps_02);
        if (n == 0) {
            return true;
        }
        int n2 = epq_22.a_(eps_02).a();
        return n <= n2;
    }

    public static boolean d(epq_2 epq_22, fio_0 fio_02, fin_0 fin_02) {
        fiy fiy2 = fin_02.g(fio_02, epq_22, null, epq_22.ge());
        int n = fiu_0.a(fiy2, epq_22);
        if (n >= 0) {
            return true;
        }
        int n2 = epq_22.a_(eps_0.al).a();
        return Math.abs(n) <= n2;
    }

    public static boolean a(fin_0 fin_02) {
        return fin_02.w();
    }

    public static boolean a(epq_2 epq_22, fin_0 fin_02) {
        return !epq_22.hg() || fin_02.A();
    }

    public static boolean e(epq_2 epq_22, fio_0 fio_02, fin_0 fin_02) {
        int n;
        int n2 = fin_02.f(fio_02, (Object)epq_22, null, epq_22.ge());
        return n2 <= (n = epq_22.a_(eps_0.ax).a());
    }
}

