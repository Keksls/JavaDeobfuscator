/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Iterator;

/*
 * Renamed from aqR
 */
public abstract class aqr_2
implements Iterable<aqq_2> {
    private final HashMap<Integer, aqq_2> a = new HashMap();

    protected aqr_2(aqq_2 ... aqq_2Array) {
        for (aqq_2 aqq_22 : aqq_2Array) {
            if (this.a.containsKey(aqq_22.b())) {
                throw new RuntimeException("D\u00e9finition des listes de param\u00e8tres impossibles : liste \u00e0 " + aqq_22.b() + " param\u00e8tres d\u00e9j\u00e0 d\u00e9finie");
            }
            this.a.put(aqq_22.b(), aqq_22);
        }
    }

    public aqq_2 b(int n) {
        return this.a.get(n);
    }

    public int a() {
        int n = 0;
        for (aqq_2 aqq_22 : this.a.values()) {
            n = Math.max(n, aqq_22.b());
        }
        return n;
    }

    @Override
    public final Iterator<aqq_2> iterator() {
        return this.a.values().iterator();
    }

    public final boolean c(int n) {
        if (n > 0) {
            return this.a.containsKey(n);
        }
        return this.a.isEmpty() || this.a.containsKey(0);
    }

    public int b() {
        return this.a.size();
    }

    public abstract boolean a(int var1);
}

