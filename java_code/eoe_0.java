/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableSet;
import java.util.HashSet;
import java.util.Set;

/*
 * Renamed from eoE
 */
public final class eoe_0 {
    public static final long a = 9L;
    public static final long b = 862L;
    public static final long c = 1225L;
    public static final long d = 1226L;
    public static final long e = 1227L;
    public static final long f = 1228L;
    public static final long g = 1334L;
    public static final aff_1 h = new aff_1(13, -11, -12);
    public static final long i = 725L;
    public static final Set<Long> j = ImmutableSet.of((Object)1361L, (Object)1385L, (Object)1387L, (Object)1388L);
    public static final Set<Long> k = ImmutableSet.of((Object)1361L);
    public static final Set<Long> l = ImmutableSet.of((Object)1225L, (Object)1226L, (Object)1227L, (Object)1228L, (Object)1334L);
    public static final Set<Long> m = ImmutableSet.of((Object)337L, (Object)343L, (Object)348L);
    public static final Set<Long> n = ImmutableSet.of((Object)1225L, (Object)1226L, (Object)1227L, (Object)1228L, (Object)487L, (Object)725L, (Object[])new Long[]{1334L});
    public static final Set<Long> o = ImmutableSet.of((Object)1225L, (Object)1226L, (Object)1227L, (Object)1228L, (Object)487L, (Object)725L, (Object[])new Long[]{1334L});
    public static final Set<Long> p;

    private eoe_0() {
    }

    static {
        HashSet<Long> hashSet = new HashSet<Long>(l);
        hashSet.add(862L);
        hashSet.addAll(j);
        hashSet.addAll(k);
        hashSet.addAll(m);
        p = ImmutableSet.copyOf(hashSet);
    }
}

