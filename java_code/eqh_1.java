/*
 * Decompiled with CFR 0.152.
 */
import java.util.TreeMap;

/*
 * Renamed from eqh
 */
public class eqh_1
extends eps_1 {
    private final TreeMap<Integer, Integer> b = new TreeMap();

    public eqh_1(byte by) {
        super(by);
    }

    public void a(int n, int n2) {
        this.b.put(n2, n);
    }

    @Override
    public int a(int n) {
        int n2 = this.b.headMap(n + 1).lastKey();
        return this.b.get(n2);
    }
}

