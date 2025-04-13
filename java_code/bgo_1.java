/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * Renamed from bGO
 */
public class bgo_1 {
    public static void a(int ... nArray) {
        Optional<ffd> optional = bhh_1.a(end_0.k);
        if (optional.isEmpty()) {
            return;
        }
        optional.ifPresent(ffd2 -> {
            for (int n : nArray) {
                ffd2.a(n);
            }
        });
    }

    public static boolean a(int n) {
        Optional optional = bhh_1.a(end_0.k);
        return optional.isPresent() && ((ffd)optional.get()).c(n);
    }

    public static String a(Collection<Integer> collection) {
        return collection.stream().map(n -> bae.h().a(15, (long)n.intValue(), new Object[0])).collect(Collectors.joining(", "));
    }
}

