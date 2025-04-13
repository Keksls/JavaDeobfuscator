/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

public class fgl {
    public static final fgl a = new fgl();
    private final Map<Integer, fgj> b = new HashMap<Integer, fgj>();
    private final Map<Integer, fgj> c = new HashMap<Integer, fgj>();

    private fgl() {
    }

    public fgj a(Integer n, fgj fgj2) {
        int n2 = fgj2.b();
        if (this.b.containsKey(fgj2.a())) {
            fgj fgj3 = this.b.get(fgj2.a());
            throw new IllegalArgumentException("We can't have two skins with the same id : " + fgj3 + ", " + fgj2);
        }
        if (n2 > 0 && this.c.containsKey(n2)) {
            fgj fgj4 = this.c.get(n2);
            throw new IllegalArgumentException("We can't have two skins with the same refId : " + fgj4 + ", " + fgj2);
        }
        fgj fgj5 = this.b.put(n, fgj2);
        if (n2 > 0) {
            this.c.put(n2, fgj2);
        }
        return fgj5;
    }

    public fgj a(Integer n) {
        return this.b.get(n);
    }

    public fgj b(Integer n) {
        return this.c.get(n);
    }

    public void a(BiConsumer<? super Integer, ? super fgj> biConsumer) {
        this.b.forEach(biConsumer);
    }

    public Optional<fgj> a(int n) {
        for (fgj fgj2 : this.b.values()) {
            if (fgj2.d() != n) continue;
            return Optional.of(fgj2);
        }
        return Optional.empty();
    }

    public boolean b(int n) {
        return this.c.containsKey(n);
    }
}

