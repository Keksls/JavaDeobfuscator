/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class fgd {
    public static final fgd a = new fgd();
    private final Map<Integer, fgb> b = new HashMap<Integer, fgb>();
    private final Map<Integer, fgb> c = new HashMap<Integer, fgb>();

    private fgd() {
    }

    public fgb a(Integer n, fgb fgb2) {
        int n2 = fgb2.c();
        if (this.b.containsKey(fgb2.a())) {
            fgb fgb3 = this.b.get(fgb2.a());
            throw new IllegalArgumentException("We can't have two skins with the same id : " + fgb3 + ", " + fgb2);
        }
        if (n2 > 0 && this.c.containsKey(n2)) {
            fgb fgb4 = this.c.get(n2);
            throw new IllegalArgumentException("We can't have two skins with the same refId : " + fgb4 + ", " + fgb2);
        }
        fgb fgb5 = this.b.put(n, fgb2);
        if (n2 > 0) {
            this.c.put(n2, fgb2);
        }
        return fgb5;
    }

    public fgb a(Integer n) {
        return this.b.get(n);
    }

    public fgb b(Integer n) {
        return this.c.get(n);
    }

    public void a(BiConsumer<? super Integer, ? super fgb> biConsumer) {
        this.b.forEach(biConsumer);
    }

    public boolean a(int n) {
        return this.c.containsKey(n);
    }
}

