/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;
import java.util.Set;

/*
 * Renamed from bRl
 */
public class brl_2 {
    public static void a(int n) {
        Optional optional = bhh_1.a(end_0.m);
        if (optional.isEmpty()) {
            return;
        }
        if (fji_0.a((fjh_0)optional.get(), n)) {
            clc_1 clc_12 = new clc_1();
            clc_12.a(true);
            clc_12.b(n);
            azu_0.j().K().c(clc_12);
        }
    }

    public static void a(Set<Integer> set) {
        Optional optional = bhh_1.a(end_0.m);
        if (optional.isEmpty()) {
            return;
        }
        Set<Integer> set2 = fji_0.b((fjh_0)optional.get(), set);
        clc_1 clc_12 = new clc_1();
        clc_12.a(false);
        clc_12.a(set2);
        azu_0.j().K().c(clc_12);
    }

    public static boolean b(int n) {
        Optional<emy_0> optional = bhh_1.a(end_0.m);
        if (optional.isEmpty()) {
            return false;
        }
        fjh_0 fjh_02 = optional.map(emy_02 -> (fjh_0)emy_02).get();
        return fjh_02.a().contains(n);
    }
}

