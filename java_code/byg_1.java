/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ContiguousSet
 *  com.google.common.collect.DiscreteDomain
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Range
 */
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Range;

/*
 * Renamed from byG
 */
public enum byg_1 {
    a(0, (ImmutableSet<Integer>)ContiguousSet.create((Range)Range.closed((Comparable)Integer.valueOf(0), (Comparable)Integer.valueOf(59)), (DiscreteDomain)DiscreteDomain.integers())),
    b(1, (ImmutableSet<Integer>)ImmutableSet.of((Object)103, (Object)113, (Object)114, (Object)130, (Object)134, (Object)135, (Object[])new Integer[]{136, 137, 138, 164, 165, 166, 167, 168, 169, 170, 175, 177, 180, 181, 182, 184, 185, 188, 189, 192, 193, 194, 196, 197, 198, 199, 202, 203, 204, 206, 208, 209, 210, 211, 216, 225, 231, 232, 237, 238, 239, 240, 244, 245, 249, 253, 254, 258, 259, 266, 267, 271, 96, 97, 98})),
    c(2, (ImmutableSet<Integer>)ImmutableSet.of((Object)60, (Object)61, (Object)62, (Object)63, (Object)64, (Object)65, (Object[])new Integer[]{66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77})),
    d(3, (ImmutableSet<Integer>)ContiguousSet.create((Range)Range.closed((Comparable)Integer.valueOf(273), (Comparable)Integer.valueOf(376)), (DiscreteDomain)DiscreteDomain.integers())),
    e(4, (ImmutableSet<Integer>)ImmutableSet.of((Object)139, (Object)141, (Object)142, (Object)143, (Object)144, (Object)145, (Object[])new Integer[]{146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 241, 246, 247, 272})),
    f(5, (ImmutableSet<Integer>)ImmutableSet.of((Object)104, (Object)105, (Object)106, (Object)107, (Object)108, (Object)109, (Object[])new Integer[]{110, 111, 112, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 140, 213, 214, 215, 218, 219, 220, 221, 236, 257, 268})),
    g(6, (ImmutableSet<Integer>)ImmutableSet.of((Object)190, (Object)191, (Object)200, (Object)201, (Object)233, (Object)248, (Object[])new Integer[]{262, 265, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95})),
    h(7, (ImmutableSet<Integer>)ImmutableSet.of((Object)100, (Object)101, (Object)102, (Object)78, (Object)79, (Object)80, (Object[])new Integer[]{81, 82, 83})),
    i(8, (ImmutableSet<Integer>)ImmutableSet.of((Object)178, (Object)224, (Object)234, (Object)250, (Object)251, (Object)252, (Object[])new Integer[]{255, 256, 261, 263, 269})),
    j(9, (ImmutableSet<Integer>)ImmutableSet.of((Object)176, (Object)179, (Object)187, (Object)205, (Object)222, (Object)223, (Object[])new Integer[]{226, 227, 228, 229, 230, 242, 243, 264, 99})),
    k(10, (ImmutableSet<Integer>)ImmutableSet.of((Object)183, (Object)186, (Object)195, (Object)207, (Object)217, (Object)235, (Object[])new Integer[]{260})),
    l(11, (ImmutableSet<Integer>)ImmutableSet.of((Object)129, (Object)171, (Object)172, (Object)173, (Object)174)),
    m(12, (ImmutableSet<Integer>)ImmutableSet.of((Object)131, (Object)132, (Object)133, (Object)212, (Object)270));

    private final int n;
    private final ImmutableSet<Integer> o;

    private byg_1(int n2, ImmutableSet<Integer> immutableSet) {
        this.n = n2;
        this.o = immutableSet;
    }

    public int a() {
        return this.n;
    }

    public ImmutableSet<Integer> b() {
        return this.o;
    }

    public static byg_1 a(int n) {
        for (byg_1 byg_12 : byg_1.values()) {
            if (byg_12.o == null || !byg_12.o.contains((Object)n)) continue;
            return byg_12;
        }
        return null;
    }

    public boolean b(int n) {
        return this.o != null && this.o.contains((Object)n);
    }
}

