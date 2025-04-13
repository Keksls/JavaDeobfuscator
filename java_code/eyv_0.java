/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/*
 * Renamed from eYV
 */
public class eyv_0 {
    private final Map<Long, eyt_0> a = new HashMap<Long, eyt_0>();

    public eyt_0 a(long l) {
        return this.a.get(l);
    }

    public void b(long l, eyt_0 eyt_02) {
        this.a.put(l, eyt_02);
    }

    public void b(long l) {
        this.a.remove(l);
    }

    public void a(BiConsumer<Long, eyt_0> biConsumer) {
        this.a.forEach(biConsumer);
    }

    public Collection<eyt_0> a() {
        return this.a.values();
    }
}

