/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableTable
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableTable;

/*
 * Renamed from eoY
 */
public class eoy_0 {
    private static final short l = 1;
    private static final short m = 2;
    private static final short n = 4;
    private static final short o = 8;
    private static final short p = 16;
    private static final short q = 32;
    private static final short r = 64;
    private static final short s = 128;
    public static final short a = 0;
    public static final short b = 2;
    public static final short c = 4;
    public static final short d = 12;
    public static final short e = 13;
    public static final short f = 125;
    public static final short g = 127;
    public static final short h = 189;
    public static final short i = 32;
    public static final ImmutableMap<Short, Integer> j = ImmutableMap.of((Object)13, (Object)10067002);
    public static final ImmutableTable<Short, Short, Integer> k = ImmutableTable.builder().put((Object)epn_2.r.s(), (Object)13, (Object)10078000).put((Object)epn_2.f.s(), (Object)13, (Object)10079000).put((Object)epn_2.g.s(), (Object)13, (Object)10080000).put((Object)epn_2.t.s(), (Object)13, (Object)10080000).put((Object)epn_2.n.s(), (Object)13, (Object)10080000).put((Object)epn_2.c.s(), (Object)13, (Object)10080000).put((Object)epn_2.i.s(), (Object)13, (Object)10081000).put((Object)epn_2.e.s(), (Object)13, (Object)10085001).build();

    public static boolean a(short s2) {
        return eoy_0.a(s2, (short)1);
    }

    public static boolean b(short s2) {
        return eoy_0.a(s2, (short)2);
    }

    public static boolean c(short s2) {
        return eoy_0.a(s2, (short)16);
    }

    public static boolean d(short s2) {
        return eoy_0.a(s2, (short)4);
    }

    public static boolean e(short s2) {
        return eoy_0.a(s2, (short)8);
    }

    public static boolean f(short s2) {
        return eoy_0.a(s2, (short)32);
    }

    public static boolean g(short s2) {
        return eoy_0.a(s2, (short)128);
    }

    private static boolean a(short s2, short s3) {
        return (s2 & s3) == s3;
    }
}

