/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public final class eQa {
    private final Map<Long, eet_0> a = Maps.newHashMap();

    public void a(long l, eet_0 eet_02) {
        this.a.put(l, eet_02);
    }

    public void a(long l) {
        this.a.remove(l);
    }

    public void a() {
        this.a.clear();
    }

    public Set<Map.Entry<Long, eet_0>> b() {
        return this.a.entrySet();
    }

    public void a(eQa eQa2) {
        this.a.putAll(eQa2.a);
    }

    public boolean c() {
        return this.a.isEmpty();
    }

    public Optional<eet_0> b(long l) {
        return Optional.ofNullable(this.a.get(l));
    }
}

