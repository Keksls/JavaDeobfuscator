/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.HashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fjI
 */
public class fji_0 {
    public static boolean a(@NotNull fjh_0 fjh_02, int n) {
        if (fjh_02.a().add(n)) {
            fjh_02.b().add(n);
            return true;
        }
        return false;
    }

    public static Set<Integer> a(@NotNull fjh_0 fjh_02, @NotNull Set<Integer> set) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int n : set) {
            if (!fjh_02.a().add(n)) continue;
            hashSet.add(n);
            fjh_02.b().add(n);
        }
        return hashSet;
    }

    public static Set<Integer> b(@NotNull fjh_0 fjh_02, @NotNull Set<Integer> set) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int n : set) {
            if (!fjh_02.b().remove(n)) continue;
            hashSet.add(n);
        }
        return hashSet;
    }

    public static Set<Integer> c(@NotNull fjh_0 fjh_02, @NotNull Set<Integer> set) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int n : set) {
            if (fjh_02.a().remove(n)) {
                hashSet.add(n);
            }
            fjh_02.b().remove(n);
        }
        return hashSet;
    }

    public static boolean a(@NotNull fjh_0 fjh_02) {
        boolean bl = !fjh_02.a().isEmpty() || !fjh_02.b().isEmpty();
        fjh_02.a().clear();
        fjh_02.b().clear();
        return bl;
    }
}

