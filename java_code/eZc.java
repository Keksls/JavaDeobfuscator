/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class eZc {
    public static eyr_1 a(long l, long l2, byte by, exh_2 exh_22, long l3, boolean bl) {
        Object t = euw_2.a.d(l2);
        eZb eZb2 = ((epq_2)t).dB();
        if (eZb2 == null) {
            return eyr_1.y;
        }
        eyz_0 eyz_02 = eZb2.a(by);
        if (eyz_02 == null) {
            return eyr_1.z;
        }
        if (!bl && t.ck() != null && t.ck().e() != elp_0.b) {
            return eyr_1.o;
        }
        eyt_0 eyt_02 = eyx_0.a.a(l, l2);
        if (eyt_02 == null) {
            return eyr_1.w;
        }
        eyr_1 eyr_12 = eZc.a(t, eyt_02, eyz_02, exh_22, l3, true, null);
        if (eyr_12 == eyr_1.a) {
            ((epq_2)t).c(((epq_2)t).cK());
        }
        return eyr_12;
    }

    public eyr_1 a(long l, long l2, byte by, long l3, boolean bl) {
        Object t = euw_2.a.d(l2);
        if (t == null) {
            return eyr_1.u;
        }
        eZb eZb2 = ((epq_2)t).dB();
        if (eZb2 == null) {
            return eyr_1.y;
        }
        eyz_0 eyz_02 = eZb2.a(by);
        if (eyz_02 == null) {
            return eyr_1.z;
        }
        exk_2 exk_22 = eyf_1.a(l, l3);
        if (exk_22 == null) {
            return eyr_1.v;
        }
        if (!bl && t.ck() != null && t.ck().e() != elp_0.b) {
            return eyr_1.o;
        }
        if (eyx_0.a.a(l, l2) == null) {
            return eyr_1.w;
        }
        if (!eyz_02.a(exk_22)) {
            return eyr_1.I;
        }
        exh_2 exh_22 = eyz_02.a((Long)l3);
        if (exh_22 == null) {
            return eyr_1.x;
        }
        eyz_02.a(um_0.e(Ui.c, exk_22, exh_22.a()));
        return eyr_1.a;
    }

    @Deprecated
    public eyr_1 a(long l, long l2, byte by, int n) {
        Object t = euw_2.a.d(l2);
        if (t == null) {
            return eyr_1.u;
        }
        eZb eZb2 = ((epq_2)t).dB();
        if (eZb2 == null) {
            return eyr_1.y;
        }
        emg_0 emg_02 = ((emh_0)t).N_();
        ems_0 ems_02 = emg_02.k().b(emt_0.f);
        int n2 = enp_2.a.b(ens_2.bj);
        long l3 = ems_02 == null ? 0L : ems_02.b();
        long l4 = l3 + (long)n2;
        if ((long)eZb2.b() >= l4) {
            return eyr_1.F;
        }
        if (eZb2.a(Hw.b((long)eZb2.b())) != null) {
            return eyr_1.g;
        }
        if (t.ck() != null && t.ck().e() != elp_0.b) {
            return eyr_1.o;
        }
        eZb2.a((int)by, n);
        return eyr_1.a;
    }

    public eyr_1 a(long l, long l2, int n) {
        Object t = euw_2.a.d(l2);
        if (t == null) {
            return eyr_1.u;
        }
        eZb eZb2 = ((epq_2)t).dB();
        if (eZb2 == null) {
            return eyr_1.y;
        }
        int n2 = eZb2.b();
        if (n >= n2) {
            return eyr_1.i;
        }
        if (n2 <= 1) {
            return eyr_1.r;
        }
        for (ezj_1 ezj_12 : ((epq_2)t).dx().a().values()) {
            if (ezj_12.e() != n) continue;
            return eyr_1.C;
        }
        if (t.ck() != null && t.ck().e() != elp_0.b) {
            return eyr_1.o;
        }
        eZb2.a(n);
        return eyr_1.a;
    }

    public static eyr_1 a(long l, byte n, short s2, boolean bl) {
        int n2;
        Object t = euw_2.a.d(l);
        if (t == null) {
            return eyr_1.u;
        }
        eZb eZb2 = ((epq_2)t).dB();
        if (eZb2 == null) {
            return eyr_1.y;
        }
        eyz_0 eyz_02 = eZb2.a((byte)n);
        if (eyz_02 == null) {
            return eyr_1.z;
        }
        if (eyz_02.c() == s2) {
            return eyr_1.d;
        }
        if (s2 > ((epq_2)t).dt()) {
            return eyr_1.k;
        }
        ezm_1 ezm_12 = ((epq_2)t).dx();
        ezj_1 ezj_12 = ezm_12.d();
        int n3 = n2 = ezj_12 == null ? Integer.MIN_VALUE : ezj_12.e();
        if (n == n2 && !eei_0.a(s2, t)) {
            return eyr_1.m;
        }
        if (t.ck() != null && t.ck().e() != elp_0.b) {
            return eyr_1.o;
        }
        int n4 = ezj_12 == null ? 0 : ezj_12.c();
        for (ezj_1 ezj_13 : ezm_12.a().values()) {
            boolean bl2;
            if (ezj_13.e() != n) continue;
            boolean bl3 = ezj_13.c() > 0 && ezj_13.c() < s2;
            boolean bl4 = bl2 = s2 <= 0 && n4 > 0;
            if (!bl3 && !bl2 || bl) continue;
            return eyr_1.s;
        }
        eyz_02.a(s2);
        if (t instanceof eeg_0) {
            ((eeg_0)t).cC().a(eyz_02);
        }
        return eyr_1.a;
    }

    public static void a(eyz_0 eyz_02, eyt_0 eyt_02) {
        if (eyt_02 == null) {
            return;
        }
        Map<exh_2, Long> map = eyz_02.a();
        for (Map.Entry<exh_2, Long> entry : map.entrySet()) {
            Long l = entry.getValue();
            if (eyt_02.c(l)) continue;
            eyz_02.a(l);
        }
    }

    public static void a(long l) {
        Collection<eZb> collection = eZe.a.c(l);
        eyv_0 eyv_02 = eyx_0.a.b(l);
        for (eZb eZb2 : collection) {
            for (eyz_0 eyz_02 : eZb2.a().values()) {
                eZc.a(eyz_02, eyv_02.a(eZb2.c()));
            }
        }
    }

    public static cc_0<eyr_1, Boolean> a(@NotNull epq_2 epq_22, byte by, eyz_0 eyz_02, @Nullable ezn_0 ezn_02) {
        eZb eZb2 = epq_22.dB();
        if (eZb2 == null) {
            return cc_0.a(eyr_1.y);
        }
        eyz_0 eyz_03 = eZb2.a(by);
        if (eyz_03 == null) {
            return cc_0.a(eyr_1.z);
        }
        if (epq_22.ck() != null && epq_22.ck().e() != elp_0.b) {
            return cc_0.a(eyr_1.o);
        }
        eyt_0 eyt_02 = eyx_0.a.a(epq_22.U_(), epq_22.a_());
        if (eyt_02 == null) {
            return cc_0.a(eyr_1.w);
        }
        boolean bl = true;
        eyz_03.a(eyz_02.c());
        for (exh_2 exh_22 : exh_2.z) {
            Object object;
            Long l;
            Long l2 = eyz_03.a(exh_22);
            if (Objects.equals(l2, l = eyz_02.a(exh_22))) continue;
            if (l == null) {
                object = eyf_1.a(epq_22.U_(), l2);
                if (object == null) {
                    bl = false;
                    continue;
                }
                if (eyz_03.a(l2, ezn_02) != null) {
                    eyz_03.a(um_0.e(Ui.c, object, exh_22.a()));
                    continue;
                }
                bl = false;
                continue;
            }
            object = eZc.a(epq_22, eyt_02, eyz_03, exh_22, l, false, ezn_02);
            if (object == eyr_1.a) continue;
            bl = false;
        }
        epq_22.c(epq_22.cK());
        return cc_0.b(bl);
    }

    private static eyr_1 a(@NotNull epq_2 epq_22, eyt_0 eyt_02, @NotNull eyz_0 eyz_02, exh_2 exh_22, long l, boolean bl, @Nullable ezn_0 ezn_02) {
        exk_2 exk_22 = eyf_1.a(epq_22.U_(), l);
        eyr_1 eyr_12 = eyf_1.a(epq_22, eyz_02, exh_22, exk_22, true, false);
        if (eyr_12 != eyr_1.a) {
            return eyr_12;
        }
        if (bl) {
            boolean bl2;
            boolean bl3 = bl2 = exk_22.T().a(exz_1.c) == null || exk_22.T().a(exz_1.c).b(epq_22, epq_22, exk_22, epq_22.Q_());
            if (!bl2) {
                return eyr_1.j;
            }
        }
        Set<exh_2> set = eyf_1.e(epq_22, eyz_02, exk_22, exh_22);
        for (exh_2 exh_23 : set) {
            Long l2 = eyz_02.a(exh_23);
            if (l2 == null || l2 <= 0L) continue;
            Optional<exk_2> optional = eyt_02.b(l2);
            eyz_02.a(exh_23, ezn_02);
            eyz_02.a(um_0.e(Ui.c, optional.orElse(null), exh_23.a()));
        }
        if (!eyt_02.c(l) && !eyt_02.a(l, ezn_02)) {
            return eyr_1.G;
        }
        eyz_02.a(exh_22, l);
        eyz_02.a(um_0.a(Ui.c, exk_22, exh_22.a()));
        return eyr_1.a;
    }
}

