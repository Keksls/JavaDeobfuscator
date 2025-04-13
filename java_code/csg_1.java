/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Renamed from cSG
 */
public final class csg_1 {
    private static final List<? extends rx_0> a = ImmutableList.of((Object)erl_2.E, (Object)erl_2.aL);
    private static final Map<rx_0, List<Integer>> b = new HashMap<rx_0, List<Integer>>();

    private csg_1() {
    }

    public static boolean a(rx_0 rx_02) {
        return a.contains(rx_02);
    }

    public static boolean a(int n) {
        for (List<Integer> list : b.values()) {
            if (!list.contains(n)) continue;
            return true;
        }
        return false;
    }

    public static int b(rx_0 rx_02) {
        if (b.containsKey(rx_02)) {
            return b.get(rx_02).size();
        }
        throw new IllegalArgumentException("La propri\u00e9t\u00e9 ne correspond pas \u00e0 un type d'encapuchonn\u00e9" + rx_02);
    }

    public static int a(int n, rx_0 rx_02) {
        if (b.containsKey(rx_02)) {
            return b.get(rx_02).get(n);
        }
        throw new IllegalArgumentException("La propri\u00e9t\u00e9 ne correspond pas \u00e0 un type d'encapuchonn\u00e9" + rx_02);
    }

    static {
        b.put(erl_2.E, (List<Integer>)ImmutableList.of((Object)129402237, (Object)129402238, (Object)129402239));
        b.put(erl_2.aL, (List<Integer>)ImmutableList.of((Object)180103927, (Object)180103928, (Object)180103929));
    }
}

