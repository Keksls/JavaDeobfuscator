/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bPR {
    private bPR() {
    }

    public static String a(int n) {
        return bae.h().a(157, (long)n, new Object[0]);
    }

    public static int a(evv_1 evv_12, int n) {
        for (evb_1 evb_12 : evv_12.i()) {
            if (evb_12.b() != n) continue;
            return evb_12.d();
        }
        return 0;
    }

    public static int a(evv_1 evv_12, Ae ae) {
        int n = 0;
        for (int n2 : ae.g()) {
            evx_1 evx_12 = bPR.a(evv_12.g(), n2);
            if (evx_12 == null) continue;
            n += evx_12.b();
        }
        return n;
    }

    private static evx_1 a(List<evx_1> list, int n) {
        for (evx_1 evx_12 : list) {
            if (evx_12.a() != n) continue;
            return evx_12;
        }
        return null;
    }

    public static int a(evv_1 evv_12, List<Integer> list) {
        return evv_12.g().stream().filter(evx_12 -> list.contains(evx_12.a())).map(evx_1::b).mapToInt(Integer::intValue).sum();
    }

    public static Map<Integer, Integer> a(evv_1 evv_12, List<bPU> list, List<Integer> list2) {
        return bPR.a(bPR.a(evv_12, list2), list).filter(bPU2 -> bPR.a(evv_12, bPU2.e()) > bPU2.b().size()).collect(Collectors.toMap(bPU::e, bPU2 -> bPR.a(bPU2, evv_12), (n, n2) -> n2));
    }

    private static int a(bPU bPU2, evv_1 evv_12) {
        return bPR.a(evv_12, bPU2.e()) - bPU2.b().size();
    }

    public static Stream<bPU> a(int n, List<bPU> list) {
        return list.stream().filter(bPU2 -> bPU2.a() <= n);
    }
}

