/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class b {
    private final Set<e> a = new HashSet<e>();

    public b(c c2) {
        this.a.addAll(Arrays.asList(c2.b()));
    }

    public Set<e> a() {
        return this.a;
    }

    public void a(e ... eArray) {
        this.a.addAll(Arrays.asList(eArray));
    }

    public void b(e ... eArray) {
        this.a.removeAll(Arrays.asList(eArray));
    }

    public b a(d ... dArray) {
        for (d d2 : dArray) {
            d2.b(this, d2);
        }
        return this;
    }

    public b b(d ... dArray) {
        for (d d2 : dArray) {
            d2.a(this, d2);
        }
        return this;
    }
}

