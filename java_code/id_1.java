/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/*
 * Renamed from ID
 */
public class id_1 {
    private final kh_1 a;

    public id_1(kh_1 kh_12) {
        this.a = kh_12;
    }

    public final HashSet<Integer> a() {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        List list = this.a.b().a().stream().filter(arg_0 -> if_1.a(kl_1.w).apply(arg_0)).map(arg_0 -> if_1.a().apply(arg_0)).flatMap(kk_12 -> StreamSupport.stream(((Iterable)if_1.b().apply(kk_12)).spliterator(), false)).filter(arg_0 -> if_1.a(kl_1.x).apply(arg_0)).map(arg_0 -> if_1.c().apply(arg_0)).collect(Collectors.toList());
        for (lw_2 lw_22 : list) {
            hashSet.addAll(id_1.a(lw_22));
        }
        return hashSet;
    }

    private static HashSet<Integer> a(lw_2 lw_22) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        lw_22.b().a().stream().filter(arg_0 -> if_1.a(kl_1.d).apply(arg_0)).map(arg_0 -> if_1.c().apply(arg_0)).filter(Objects::nonNull).map(lp_2::a).collect(Collectors.toCollection(() -> hashSet));
        lw_22.b().a().stream().filter(arg_0 -> if_1.a(kl_1.p).apply(arg_0)).map(arg_0 -> if_1.c().apply(arg_0)).filter(Objects::nonNull).map(lq_2::a).collect(Collectors.toCollection(() -> hashSet));
        List list = lw_22.b().a().stream().filter(arg_0 -> if_1.a(kl_1.x).apply(arg_0)).map(arg_0 -> if_1.c().apply(arg_0)).collect(Collectors.toList());
        for (lw_2 lw_23 : list) {
            hashSet.addAll(id_1.a(lw_23));
        }
        return hashSet;
    }
}

