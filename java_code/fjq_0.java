/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/*
 * Renamed from fjq
 */
public abstract class fjq_0 {
    private static final fjs a = fjs.a;
    private static final Map<fjv, fju> b = new EnumMap<fjv, fju>(fjv.class);

    public static boolean a(long l, fjv fjv2, int n) {
        switch (fjv2) {
            case a: {
                return fjq_0.a(l, ay_0.a, n);
            }
            case b: {
                return fjq_0.a(l, ay_0.b, n);
            }
        }
        return true;
    }

    public static boolean a(long l, ay_0 ay_02, int n) {
        if (ay_02.equals((Object)ay_0.a) && fjs.a.c().contains(n)) {
            return true;
        }
        Optional<fjn_0> optional = ena_0.a().b(l, end_0.l);
        return optional.map(fjn_02 -> fjn_02.a(ay_02)).map(set -> set.contains(n)).orElse(false);
    }

    public static Set<Integer> a(long l, ay_0 ay_02) {
        Optional<fjn_0> optional = ena_0.a().b(l, end_0.l);
        return optional.map(fjn_02 -> fjn_02.a(ay_02)).orElse(Collections.emptySet());
    }

    public static boolean b(long l, ay_0 ay_02, int n) {
        Optional<fjn_0> optional = ena_0.a().b(l, end_0.l);
        return optional.map(fjn_02 -> fjn_02.a(ay_02).add(n)).orElse(false);
    }

    public static void a(fju ... fjuArray) {
        for (fju fju2 : fjuArray) {
            if (b.containsKey(fju2.a())) {
                throw new IllegalArgumentException("Provider is already registered : " + fju2);
            }
            b.put(fju2.a(), fju2);
        }
    }

    public static fjs a() {
        return a;
    }

    public static <Provider extends fju> Provider a(fjv fjv2) {
        return (Provider)b.get(fjv2);
    }
}

