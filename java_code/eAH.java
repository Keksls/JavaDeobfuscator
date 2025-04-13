/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

class eAH {
    private final Map<Integer, eAF> a = new HashMap<Integer, eAF>();
    private final Map<Integer, Integer> b = new HashMap<Integer, Integer>();

    eAH() {
    }

    int a(int n, int n2) {
        int n3 = this.c(n, n2);
        return n3 += this.a(n2);
    }

    private int c(int n, int n2) {
        eAF eAF2 = this.a.get(n);
        if (eAF2 == null) {
            return 0;
        }
        return eAF2.a(n2);
    }

    private int a(int n) {
        Integer n2 = this.b.get(n);
        if (n2 == null) {
            return 0;
        }
        return n2;
    }

    void b(int n, int n2) {
        Integer n3 = this.b.get(n);
        if (n3 == null) {
            this.b.put(n, n2);
        } else {
            this.b.put(n, n3 + n2);
        }
    }

    void a(int n, int n2, int n3) {
        eAF eAF2 = this.a.get(n);
        if (eAF2 == null) {
            eAF2 = new eAF();
            this.a.put(n, eAF2);
        }
        eAF2.a(n2, n3);
    }
}

