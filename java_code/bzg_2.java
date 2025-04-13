/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.Set;

/*
 * Renamed from bzG
 */
public class bzg_2
implements bzc_1 {
    private final Set<exw_1> b;

    public bzg_2(Set<exw_1> set) {
        this.b = Collections.unmodifiableSet(set);
    }

    @Override
    public boolean a(exk_2 exk_22) {
        return this.b.contains(exk_22.G());
    }

    @Override
    public boolean a() {
        return !this.b.isEmpty();
    }

    @Override
    public bzd_1 b() {
        return bzd_1.c;
    }

    public Set<exw_1> d() {
        return this.b;
    }
}

