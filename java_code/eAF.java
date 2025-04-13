/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

class eAF {
    private final Map<Integer, Integer> a = new HashMap<Integer, Integer>();

    eAF() {
    }

    int a(int n) {
        Integer n2 = this.a.get(n);
        if (n2 == null) {
            return 0;
        }
        return n2;
    }

    void a(int n, int n2) {
        Integer n3 = this.a.get(n);
        if (n3 == null) {
            this.a.put(n, n2);
        } else {
            this.a.put(n, n3 + n2);
        }
    }
}

