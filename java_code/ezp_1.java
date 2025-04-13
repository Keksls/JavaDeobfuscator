/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from ezP
 */
public final class ezp_1 {
    private static final Logger b = Logger.getLogger(ezp_1.class);
    public static final long a = -1L;

    private ezp_1() {
    }

    public static int a() {
        return enp_2.a.b(ens_2.cG);
    }

    public static int b() {
        return Hw.b(1, 41);
    }

    public static boolean a(epq_2 epq_22) {
        return ezp_1.a(epq_22.U_());
    }

    public static boolean a(long l) {
        return flC.a(l) || eLG.a(l);
    }

    @Contract(pure=true)
    public static int a(@NotNull epq_2 epq_22, int n) {
        fiR fiR2 = epq_22.dw();
        ezy_2 ezy_22 = epq_22.dA();
        return Hw.a(ezp_1.a(epq_22, epq_22.d(n)), fiR2 == null ? 0 : ezp_1.a(fiR2.b(n)), new int[]{ezy_22 == null ? 0 : ezp_1.a(ezy_22.a(n))});
    }

    @Contract(pure=true)
    public static int a(@NotNull epq_2 epq_22, @Nullable eyz_0 eyz_02) {
        if (eyz_02 == null) {
            return 0;
        }
        int n = 0;
        for (Long l : eyz_02.a().values()) {
            if (l == null) continue;
            Optional<exk_2> optional = epq_22.dC().b(l);
            if (optional.isEmpty()) {
                b.error((Object)("[Build] Item " + l + " is in equipment sheet of player " + epq_22.a_() + " / " + epq_22.U_() + " but not in its equipment inventory."));
                continue;
            }
            exk_2 exk_22 = optional.get();
            short s2 = exk_22.F() == null ? exk_22.T().G() : exk_22.F().shortValue();
            n = Math.max(n, s2);
        }
        return n;
    }

    @Contract(pure=true)
    public static int a(@Nullable fiO fiO2) {
        if (fiO2 == null) {
            return 0;
        }
        int n = 0;
        for (Cm<Integer, Integer> cm : ezp_1.b(fiO2)) {
            Integer n2 = cm.a();
            int n3 = cm.b();
            if (n2 == null || n2 == 0) continue;
            Object Spell = fip_0.d().b(n2);
            if (Spell == null) {
                b.error((Object)("[Builds] Unknown spell " + n2 + " in deck " + fiO2));
                continue;
            }
            int n4 = ((fin_0)Spell).w() ? fiK.b[n3] : fiK.a[n3];
            n = Hw.a(n, (int)((fin_0)Spell).m(), new int[]{n4});
        }
        return n;
    }

    @Contract(pure=true)
    public static int a(@Nullable ezx_2 ezx_22) {
        if (ezx_22 == null) {
            return 0;
        }
        AtomicInteger atomicInteger = new AtomicInteger(0);
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        ezx_22.d().forEach((n, s2) -> {
            int n2 = ezi_2.a.b((int)n);
            hashMap.merge(n2, Integer.valueOf(s2.shortValue()), Integer::sum);
        });
        hashMap.forEach((n, n2) -> {
            int n3 = ezi_2.a.c((int)n).a((int)n2);
            atomicInteger.set(Math.max(atomicInteger.get(), n3));
        });
        return atomicInteger.get();
    }

    @Contract(pure=true)
    public static List<Cm<Integer, Integer>> b(fiO fiO2) {
        ArrayList<Cm<Integer, Integer>> arrayList = new ArrayList<Cm<Integer, Integer>>();
        ArrayList<Integer> arrayList2 = fiO2.d();
        for (int k = 0; k < arrayList2.size(); ++k) {
            arrayList.add(new Cm<Integer, Integer>(arrayList2.get(k), k));
        }
        ArrayList<Integer> arrayList3 = fiO2.f();
        for (int k = 0; k < arrayList3.size(); ++k) {
            arrayList.add(new Cm<Integer, Integer>(arrayList3.get(k), k));
        }
        return arrayList;
    }

    @Contract(pure=true)
    private static List<Long> a(epq_2 epq_22, int n, @Nullable eyz_0 eyz_02, boolean bl) {
        if (eyz_02 == null) {
            return Collections.emptyList();
        }
        if (epq_22.dB() == null) {
            return List.of(Long.valueOf(-1L));
        }
        long l = epq_22.U_();
        eyt_0 eyt_02 = eyx_0.a.a(l, epq_22.a_());
        if (eyt_02 == null) {
            return List.of(Long.valueOf(-1L));
        }
        ArrayList<Long> arrayList = new ArrayList<Long>();
        for (Map.Entry<exh_2, Long> entry : eyz_02.a().entrySet()) {
            long l2;
            exk_2 exk_22;
            exh_2 exh_22 = entry.getKey();
            eyr_1 eyr_12 = eyf_1.a(epq_22, eyz_02, exh_22, exk_22 = eyf_1.a(l, l2 = entry.getValue().longValue()), false, false);
            if (eyr_12 != eyr_1.a) {
                arrayList.add(l2);
                continue;
            }
            apc_2 apc_22 = exk_22.T().a(exz_1.c);
            if (!bl || apc_22 == null || apc_22.b(epq_22, epq_22, exk_22, eyz_02)) continue;
            arrayList.add(l2);
        }
        return arrayList;
    }

    @Contract(pure=true)
    public static List<Long> a(epq_2 epq_22, int n, @Nullable eyz_0 eyz_02) {
        return ezp_1.a(epq_22, n, eyz_02, true);
    }

    public static List<Long> b(epq_2 epq_22, int n, @Nullable eyz_0 eyz_02) {
        return ezp_1.a(epq_22, n, eyz_02, false);
    }

    @Contract(pure=true)
    public static List<Integer> a(epq_2 epq_22, @Nullable fiO fiO2) {
        if (fiO2 == null) {
            return Collections.emptyList();
        }
        fiz<? extends fio_0> fiz2 = epq_22.aZ();
        if (fiz2 == null) {
            return List.of(Integer.valueOf(-1));
        }
        int n = fiO2.c() ? epq_22.dt() : fiO2.b();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (Cm<Integer, Integer> cm : ezp_1.b(fiO2)) {
            int n2 = cm.a();
            int n3 = cm.b();
            if (n2 == 0) continue;
            Object Spell = fip_0.d().b(n2);
            if (Spell == null) {
                arrayList.add(n2);
                continue;
            }
            if (fiz2.c(n2) == null) {
                arrayList.add(n2);
                continue;
            }
            if (((fin_0)Spell).m() > n) {
                arrayList.add(n2);
                continue;
            }
            if ((!((fin_0)Spell).w() || fiK.b[n3] <= n) && (((fin_0)Spell).w() || fiK.a[n3] <= n)) continue;
            arrayList.add(n2);
        }
        return arrayList;
    }

    @Contract(pure=true)
    public static List<Integer> a(epq_2 epq_22, @Nullable ezx_2 ezx_22) {
        if (ezx_22 == null) {
            return Collections.emptyList();
        }
        short s2 = ezx_22.e() == -1 ? epq_22.dt() : ezx_22.e();
        return ezp_1.a(ezx_22, s2);
    }

    @Contract(pure=true)
    public static List<Integer> a(@NotNull ezx_2 ezx_22, short s2) {
        ezj_2 ezj_22 = ezi_2.a.b(s2);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (Map.Entry<Integer, Short> entry : ezx_22.d().entrySet()) {
            int n = entry.getKey();
            short s3 = entry.getValue();
            if (!ezi_2.a.a(n)) {
                arrayList.add(n);
                continue;
            }
            int n2 = ezi_2.a.b(n);
            if (s3 < 0) {
                arrayList.add(n);
                continue;
            }
            if (s3 > ezj_22.a(n2)) {
                arrayList.add(n);
                continue;
            }
            Object t = ezh_2.a.a(n);
            if (((ezv_2)t).d() == 0 || s3 <= ((ezv_2)t).d()) continue;
            arrayList.add(n);
        }
        Iterator<Object> iterator = ezi_2.a.a().iterator();
        while (iterator.hasNext()) {
            int n = (Integer)iterator.next();
            if (ezx_22.b(n) <= ezj_22.a(n)) continue;
            arrayList.add(-n);
        }
        return arrayList;
    }

    @Contract(pure=true)
    public static List<Cm<Integer, Integer>> b(@NotNull epq_2 epq_22, @NotNull fiO fiO2) {
        int n = fiO2.b() == -1 ? epq_22.dt() : fiO2.b();
        return ezp_1.a(n, fiK.a, fiO2.d());
    }

    @Contract(pure=true)
    public static List<Cm<Integer, Integer>> c(@NotNull epq_2 epq_22, @NotNull fiO fiO2) {
        int n = fiO2.b() == -1 ? epq_22.dt() : fiO2.b();
        return ezp_1.a(n, fiK.b, fiO2.f());
    }

    @Contract(pure=true)
    private static List<Cm<Integer, Integer>> a(int n, int[] nArray, List<Integer> list) {
        ArrayList<Cm<Integer, Integer>> arrayList = new ArrayList<Cm<Integer, Integer>>();
        for (int k = 0; k < list.size(); ++k) {
            int n2 = list.get(k);
            if (n2 == 0 || nArray[k] <= n) continue;
            arrayList.add(new Cm<Integer, Integer>(n2, k));
        }
        return arrayList;
    }
}

