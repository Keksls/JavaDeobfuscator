/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Map;

/*
 * Renamed from eYL
 */
public class eyl_2 {
    public static boolean a(epq_2 epq_22, fhy_0 fhy_02, fhy_0 fhy_03) {
        ead_0 ead_02 = epq_22.fl();
        if (ead_02 == null || ead_02.ac_() != 30) {
            return false;
        }
        if (fhy_02.b() == fhz_0.f) {
            return false;
        }
        exk_2 exk_22 = fhy_02.a();
        if (exk_22.e() <= 0) {
            return false;
        }
        if (!exk_22.y()) {
            return false;
        }
        if (exk_22.A() <= 0) {
            return false;
        }
        boolean bl = fhy_03 != null && (fhy_03.b() == fhz_0.c || fhy_03.b() == fhz_0.a);
        byte by = exk_22.C().d();
        if (!bl && by <= 0) {
            return false;
        }
        if (by <= 0) {
            exk_2 exk_23 = fhy_03.a();
            if (exk_23.e() <= 0) {
                return false;
            }
            if (exk_22.aT_() != exk_23.aT_()) {
                return false;
            }
            return exk_22.a() != exk_23.a();
        }
        return true;
    }

    public static <T extends Collection<ezb_0>> eyn_2 a(fhy_0 fhy_02, int n, Map<Byte, T> map) {
        eyn_2 eyn_22 = new eyn_2();
        if (fhy_02 == null || fhy_02.b() == fhz_0.f) {
            eyn_22.a(eyo_2.c);
            return eyn_22;
        }
        long l = fhy_02.d();
        Object t = euw_2.a.d(l);
        if (t == null) {
            eyn_22.a(eyo_2.o);
            return eyn_22;
        }
        Object t2 = euu_2.a(((epq_2)t).U_());
        if (t2 == null) {
            eyn_22.a(eyo_2.o);
            return eyn_22;
        }
        if (t2.ck() != null) {
            eyn_22.a(eyo_2.r);
            return eyn_22;
        }
        exk_2 exk_22 = fhy_02.a();
        ead_0 ead_02 = ((epq_2)t2).fl();
        if (Ua.a().a(l, exk_22.a()) || ead_02 != null && ead_02.ac_() == 24) {
            eyn_22.a(eyo_2.s);
            return eyn_22;
        }
        if (!exk_22.y()) {
            eyn_22.a(eyo_2.f);
            return eyn_22;
        }
        eZw eZw2 = exk_22.C();
        eZw eZw3 = eZw2.p();
        boolean bl = map.keySet().stream().anyMatch(by -> eZw3.b((byte)by) == null);
        if (bl) {
            eyn_22.a(eyo_2.h);
            return eyn_22;
        }
        int n2 = 0;
        for (Map.Entry<Byte, T> entry : map.entrySet()) {
            byte by2 = entry.getKey();
            Collection collection = (Collection)entry.getValue();
            eze_0 eze_02 = eZw3.b(by2);
            for (ezb_0 ezb_02 : collection) {
                eyp_2 eyp_22 = eyl_2.a(t2, exk_22.c(), eze_02, ezb_02);
                if (eyp_22.a() != eyo_2.b) {
                    eyn_22.a(eyp_22.a());
                    return eyn_22;
                }
                if (eyp_22.c()) {
                    n2 += eyp_22.b();
                    continue;
                }
                n2 -= eyp_22.b();
            }
        }
        if (n2 < 0) {
            n2 = (int)Math.ceil((double)n2 - (double)n2 * 0.1);
        }
        eyn_22.a(n2);
        if (n < n2) {
            eyn_22.a(eyo_2.g);
            return eyn_22;
        }
        eyn_22.a(eZw3);
        eyn_22.a(eyo_2.b);
        return eyn_22;
    }

    private static eyp_2 a(epq_2 epq_22, int n, eze_0 eze_02, ezb_0 ezb_02) {
        ead_0 ead_02 = epq_22.fl();
        if (ead_02 == null || ead_02.ac_() != 30) {
            if (ezb_02.a() == ezc_0.c || ezb_02.a() == ezc_0.d) {
                return new eyp_2(eyo_2.p);
            }
            if (eze_02.a() > 0 && ezb_02.a().a()) {
                return new eyp_2(eyo_2.p);
            }
        }
        if (ezb_02.a().a()) {
            int n2;
            int n3 = ezb_02.c();
            if (n3 <= 0) {
                return new eyp_2(eyo_2.i);
            }
            eZu eZu2 = eZv.a.a(n3);
            if (eZu2 == null) {
                return new eyp_2(eyo_2.j);
            }
            int n4 = eZu2.c(0);
            if (n4 < 0 || n4 > n) {
                return new eyp_2(eyo_2.q);
            }
            if (eze_02.c() != tc_0.e && eze_02.c() != eZu2.c()) {
                return new eyp_2(eyo_2.k);
            }
            if (eze_02.g()) {
                n2 = 0;
            } else {
                n2 = eZu2.a(1);
                eze_02.b(n2);
            }
            eze_02.a(n3);
            return new eyp_2(eyo_2.b, n2, true);
        }
        if (ezb_02.a() == ezc_0.c) {
            int n5 = eze_02.d();
            eze_02.b();
            return new eyp_2(eyo_2.b, n5, false);
        }
        if (!eze_02.g()) {
            return new eyp_2(eyo_2.l);
        }
        int n6 = eze_02.a();
        eZu eZu3 = eZv.a.a(n6);
        if (eZu3 == null) {
            return new eyp_2(eyo_2.i);
        }
        if (ezb_02.a() == ezc_0.d) {
            int n7 = eze_02.d();
            short s2 = eZu3.b(n7);
            if (s2 == 0) {
                return new eyp_2(eyo_2.n);
            }
            int n8 = eZu3.a(s2);
            eze_02.d(n8);
            return new eyp_2(eyo_2.b, n8, false);
        }
        if (ezb_02.a() == ezc_0.e) {
            int n9;
            int n10 = eze_02.d();
            short s3 = eZu3.b(n10);
            if (s3 == (n9 = eZu3.d())) {
                return new eyp_2(eyo_2.m);
            }
            int n11 = Math.min(s3 + 1, n9);
            int n12 = eZu3.c(n11 - 1);
            if (n12 < 0 || n12 > n) {
                return new eyp_2(eyo_2.q);
            }
            int n13 = eZu3.a(n11);
            eze_02.c(n13);
            return new eyp_2(eyo_2.b, n13, true);
        }
        return new eyp_2(eyo_2.a);
    }
}

