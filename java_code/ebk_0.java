/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eBK
 */
public class ebk_0 {
    public static final ft_1[] a = ft_1.values();

    public static boolean b(ft_1 ft_12, int n) {
        switch (ft_12) {
            case o: {
                return ffc.a.a().contains(n);
            }
        }
        return false;
    }

    public static boolean a(ft_1 ft_12, int n, ebo_0 ebo_02) {
        if (ebk_0.b(ft_12, n)) {
            return true;
        }
        return ebo_02.a(ft_12, (long)n);
    }
}

