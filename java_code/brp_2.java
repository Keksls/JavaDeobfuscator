/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/*
 * Renamed from bRp
 */
public final class brp_2 {
    private static final brp_2 a = new brp_2();
    private final Map<Integer, brn_2> b = new HashMap<Integer, brn_2>();
    private final Map<Integer, brm_2> c = new HashMap<Integer, brm_2>();

    private brp_2() {
    }

    public static brp_2 a() {
        return a;
    }

    public Optional<brn_2> a(int n) {
        return Optional.ofNullable(this.b.get(n));
    }

    public Optional<brm_2> b(int n) {
        return Optional.ofNullable(this.c.get(n));
    }

    public void a(brn_2 brn_22) {
        this.b.put(brn_22.a(), brn_22);
    }

    public void a(brm_2 brm_22) {
        this.c.put(brm_22.a(), brm_22);
    }

    public Set<Integer> b() {
        return this.c.keySet();
    }
}

