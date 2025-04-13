/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * Renamed from epO
 */
public class epo_2 {
    private static final ImmutableSet<epn_2> a = ImmutableSet.of((Object)epn_2.j, (Object)epn_2.k, (Object)epn_2.h, (Object)epn_2.c, (Object)epn_2.m, (Object)epn_2.i, (Object[])new epn_2[]{epn_2.f, epn_2.n, epn_2.g, epn_2.d, epn_2.l, epn_2.e, epn_2.o, epn_2.p, epn_2.r, epn_2.t, epn_2.u, epn_2.q});
    private static final ImmutableSet<epn_2> b = ImmutableSet.of();
    private static Set<epn_2> c = null;
    private static Set<epn_2> d = null;

    public static void a() {
        List<Long> list = enp_2.a.h(ens_2.g);
        if (list.isEmpty()) {
            c = Sets.immutableEnumSet(a);
            d = Sets.immutableEnumSet(b);
        } else {
            c = a.stream().filter(epn_22 -> list.contains(epn_22.s())).collect(Collectors.toSet());
            d = b.stream().filter(epn_22 -> list.contains(epn_22.s())).collect(Collectors.toSet());
        }
    }

    public static Set<epn_2> b() {
        return c;
    }

    public static Set<epn_2> c() {
        return d;
    }

    public static boolean a(epn_2 epn_22) {
        if (epn_22 == null) {
            return false;
        }
        return epo_2.a(epn_22.s());
    }

    public static boolean a(int n) {
        epn_2 epn_22 = epn_2.a(n);
        return (c.contains(epn_22) || d.contains(epn_22)) && epn_22.f();
    }

    static {
        epo_2.a();
        enp_2.a.a((ens_22, object) -> {
            if (ens_22 != ens_2.g) {
                return;
            }
            epo_2.a();
        });
    }
}

