/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  gnu.trove.set.hash.TLongHashSet
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.ImmutableMap;
import gnu.trove.set.hash.TLongHashSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eYf
 */
public class eyf_1 {
    private eyf_1() {
    }

    @Nullable
    public static exk_2 a(long l, long l2) {
        TLongHashSet tLongHashSet;
        eyv_0 eyv_02 = eyx_0.a.b(l);
        if (eyv_02 != null) {
            tLongHashSet = eyv_02.a().iterator();
            while (tLongHashSet.hasNext()) {
                Object object = (eyt_0)tLongHashSet.next();
                Optional<exk_2> optional = ((eyt_0)object).b(l2);
                if (!optional.isPresent()) continue;
                return optional.get();
            }
        }
        tLongHashSet = euw_2.a.e(l);
        for (long l3 : tLongHashSet.toArray()) {
            exk_2 exk_22;
            Object t = euw_2.a.d(l3);
            if (t == null || (exk_22 = ((epq_2)t).dS().i(l2)) == null) continue;
            return exk_22;
        }
        return null;
    }

    private static Optional<exk_2> a(eyz_0 eyz_02, exh_2 exh_22, long l) {
        Long l2 = eyz_02.a(exh_22);
        if (l2 == null) {
            return Optional.empty();
        }
        return Optional.ofNullable(eyf_1.a(l, l2));
    }

    @Nullable
    public static exk_2 a(long l, int n) {
        TLongHashSet tLongHashSet;
        eyv_0 eyv_02 = eyx_0.a.b(l);
        if (eyv_02 != null) {
            tLongHashSet = eyv_02.a().iterator();
            while (tLongHashSet.hasNext()) {
                Object object = (eyt_0)tLongHashSet.next();
                ImmutableMap<Long, exk_2> immutableMap = ((eyt_0)object).a();
                for (Map.Entry entry : immutableMap.entrySet()) {
                    exk_2 exk_22 = (exk_2)entry.getValue();
                    if (exk_22.aT_() != n) continue;
                    return exk_22;
                }
            }
        }
        tLongHashSet = euw_2.a.e(l);
        for (long l2 : tLongHashSet.toArray()) {
            exk_2 exk_23;
            Object t = euw_2.a.d(l2);
            if (t == null || (exk_23 = ((epq_2)t).dS().e(n)) == null) continue;
            return exk_23;
        }
        return null;
    }

    public static eyr_1 a(epq_2 epq_22, eyz_0 eyz_02, exh_2 exh_22, exk_2 exk_22, boolean bl, boolean bl2) {
        eyr_1 eyr_12 = eyf_1.a(epq_22, eyz_02, exh_22, exk_22, bl);
        if (eyr_12 != eyr_1.a) {
            return eyr_12;
        }
        if (!eyz_02.d() && !eyf_1.a(epq_22, eyz_02, exk_22, exh_22)) {
            return eyr_1.k;
        }
        if (eyf_1.b(epq_22, eyz_02, exk_22, exh_22)) {
            return eyr_1.c;
        }
        if (eyf_1.d(epq_22, eyz_02, exk_22, exh_22)) {
            return eyr_1.e;
        }
        if (exk_22.e() > 1) {
            return eyr_1.p;
        }
        if (exk_22.ai()) {
            return eyr_1.q;
        }
        if (bl2 && exk_22.aQ_() && !exk_22.f().p()) {
            return eyr_1.A;
        }
        if (enp_2.a.h(ens_2.aH).contains(exk_22.aT_())) {
            return eyr_1.j;
        }
        return eyr_1.a;
    }

    public static eyr_1 a(epq_2 epq_22, eyz_0 eyz_02, exh_2 exh_22, exk_2 exk_22, boolean bl) {
        if (exk_22 == null) {
            return eyr_1.v;
        }
        if (!exk_22.T().U()) {
            return eyr_1.t;
        }
        if (eyf_1.c(epq_22, eyz_02, exk_22, bl ? null : exh_22)) {
            return eyr_1.b;
        }
        if (!exk_22.T().a(exh_22)) {
            return eyr_1.n;
        }
        if (eyf_1.a(epq_22, eyz_02, (Long)exk_22.a())) {
            return eyr_1.H;
        }
        return eyr_1.a;
    }

    public static boolean b(long l, long l2) {
        Collection<eZb> collection = eZe.a.c(l);
        for (eZb eZb2 : collection) {
            for (eyz_0 eyz_02 : eZb2.a().values()) {
                if (eyz_02.a(l2) == null) continue;
                return true;
            }
        }
        return false;
    }

    public static boolean a(epq_2 epq_22, eyz_0 eyz_02, ezr_0<?> ezr_02, exh_2 exh_22) {
        if (ezr_02.Y() || ezr_02.b(ext_1.k)) {
            return true;
        }
        short s2 = eyz_02.c() <= 0 ? epq_22.dt() : eyz_02.c();
        return ezr_02.G() <= s2;
    }

    public static boolean a(epq_2 epq_22, eyz_0 eyz_02, exk_2 exk_22, exh_2 exh_22) {
        short s2;
        short s3 = s2 = eyz_02.c() <= 0 ? epq_22.dt() : eyz_02.c();
        if (exk_22.w() && exk_22.x().c() > s2) {
            return false;
        }
        return eyf_1.a(epq_22, eyz_02, exk_22.T(), exh_22);
    }

    public static boolean a(epq_2 epq_22, eyz_0 eyz_02, exk_2 exk_22, exh_2 exh_22, So so, boolean bl) {
        if (eyf_1.a(epq_22, eyz_02, exh_22, exk_22, bl, true) != eyr_1.a) {
            return false;
        }
        return exk_22.T().a(exz_1.c) == null || exk_22.T().a(exz_1.c).b(epq_22, epq_22, exk_22, so);
    }

    public static boolean b(epq_2 epq_22, eyz_0 eyz_02, exk_2 exk_22, exh_2 exh_22) {
        if (exk_22 == null) {
            return false;
        }
        Set<exh_2> set = eyz_02.a().keySet();
        for (exh_2 exh_23 : set) {
            exk_2 exk_23;
            Optional<exk_2> optional;
            if (exh_22 != null && exh_23 == exh_22 || (optional = eyf_1.a(eyz_02, exh_23, epq_22.U_())).isEmpty() || (exk_23 = optional.get()).a() == exk_22.a()) continue;
            if (exk_23.aT_() == exk_22.aT_()) {
                return true;
            }
            if (!ecn_0.a.a(exk_22.aT_(), exk_23.aT_()) && !ecn_0.a.a(exk_23.aT_(), exk_22.aT_())) continue;
            return true;
        }
        return false;
    }

    public static boolean c(epq_2 epq_22, eyz_0 eyz_02, exk_2 exk_22, exh_2 exh_22) {
        Set<exh_2> set = eyz_02.a().keySet();
        for (exh_2 exh_23 : set) {
            Long l;
            if (exh_22 != null && exh_23 == exh_22 || (l = eyz_02.a(exh_23)) == null || l.longValue() != exk_22.a()) continue;
            return true;
        }
        return false;
    }

    public static boolean d(epq_2 epq_22, eyz_0 eyz_02, exk_2 exk_22, exh_2 exh_22) {
        exw_1 exw_12 = exk_22.G();
        if (exw_12 != exw_1.f && exw_12 != exw_1.h) {
            return false;
        }
        Set<exh_2> set = eyz_02.a().keySet();
        for (exh_2 exh_23 : set) {
            Optional<exk_2> optional;
            if (exh_23 == exh_22 || !(optional = eyf_1.a(eyz_02, exh_23, epq_22.U_())).isPresent() || optional.get().G() != exw_12) continue;
            return true;
        }
        return false;
    }

    public static boolean a(epq_2 epq_22, eyz_0 eyz_02, Long l) {
        Collection<eZb> collection = eZe.a.c(epq_22.U_());
        for (eZb eZb2 : collection) {
            long l2 = eZb2.c();
            if (l2 == epq_22.a_()) continue;
            for (eyz_0 eyz_03 : eZb2.a().values()) {
                exh_2 exh_22 = eyz_03.a((long)l);
                if (exh_22 == null) continue;
                return true;
            }
        }
        return false;
    }

    public static Set<exh_2> e(@NotNull epq_2 epq_22, @NotNull eyz_0 eyz_02, @NotNull exk_2 exk_22, @NotNull exh_2 exh_22) {
        eyt_0 eyt_02 = eyx_0.a.a(epq_22.U_(), epq_22.a_());
        EnumSet<exh_2> enumSet = EnumSet.noneOf(exh_2.class);
        for (exh_2 exh_23 : eyz_02.a().keySet()) {
            exk_2 exk_23 = eyz_02.a(eyt_02, exh_23);
            if (exk_23 == null) continue;
            Object[] objectArray = exk_23.U().j();
            if (exh_23 == exh_22) {
                enumSet.addAll(Arrays.asList(objectArray));
                continue;
            }
            if (!ahi_2.a(objectArray, exh_22)) continue;
            enumSet.add(exh_23);
        }
        exh_2[] exh_2Array = exk_22.U().j();
        enumSet.addAll(Arrays.asList(exh_2Array));
        enumSet.add(exh_22);
        return enumSet;
    }

    public static Set<exh_2> a(@NotNull exq_2 exq_22, @NotNull exk_2 exk_23, @NotNull exh_2 exh_22) {
        EnumSet<exh_2> enumSet = EnumSet.noneOf(exh_2.class);
        exq_22.a((exk_22, n) -> {
            Object[] objectArray = exk_22.U().j();
            exh_2 exh_23 = exh_2.a(n.byteValue());
            if (exh_23 == exh_22) {
                enumSet.addAll(Arrays.asList(objectArray));
            } else if (ahi_2.a(objectArray, exh_22)) {
                enumSet.add(exh_23);
            }
        });
        exh_2[] exh_2Array = exk_23.U().j();
        enumSet.addAll(Arrays.asList(exh_2Array));
        enumSet.add(exh_22);
        return enumSet;
    }

    @NotNull
    public static exh_2 a(eyz_0 eyz_02, exk_2 exk_22) {
        exh_2[] exh_2Array;
        for (exh_2 exh_22 : exh_2Array = exk_22.T().F().h()) {
            if (eyz_02.a(exh_22) != null) continue;
            return exh_22;
        }
        return exh_2Array[0];
    }

    @NotNull
    public static exh_2 a(exq_2 exq_22, exk_2 exk_22) {
        exh_2[] exh_2Array;
        for (exh_2 exh_22 : exh_2Array = exk_22.T().F().h()) {
            if (exq_22.e(exh_22.A) != null) continue;
            return exh_22;
        }
        return exh_2Array[0];
    }
}

