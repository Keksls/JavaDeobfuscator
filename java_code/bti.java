/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public final class bti {
    public static final bti a = new bti();
    private final Map<Integer, bth> b = new HashMap<Integer, bth>();

    private bti() {
    }

    public void a(int n, int n2, boolean bl) {
        this.b.put(n, new bth(n2, bl));
    }

    public Optional<bth> a(int n) {
        return Optional.ofNullable(this.b.get(n));
    }

    public void a() {
        this.b.clear();
    }
}

