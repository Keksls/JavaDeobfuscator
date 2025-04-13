/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntIntIterator
 *  gnu.trove.map.hash.TIntIntHashMap
 */
import gnu.trove.iterator.TIntIntIterator;
import gnu.trove.map.hash.TIntIntHashMap;
import java.util.Arrays;

/*
 * Renamed from eUW
 */
public class euw_1
extends evk_1 {
    private final short a;
    private final boolean b;
    private final int c;
    private final TIntIntHashMap e = new TIntIntHashMap();

    public euw_1(int n, int n2, short s2, boolean bl, int n3) {
        super(n, n2, ezy_1.a, 0);
        this.a = s2;
        this.b = bl;
        this.c = n3;
    }

    public short a() {
        return this.a;
    }

    public boolean d() {
        return this.b;
    }

    public void a(int n, int n2) {
        this.e.put(n, n2);
    }

    public TIntIntIterator e() {
        return this.e.iterator();
    }

    public boolean f() {
        return this.c != 0 || !this.e.isEmpty();
    }

    public int a(int n) {
        return this.e.get(n);
    }

    public int g() {
        return this.c;
    }

    public String toString() {
        return "IECollectParameter{m_capacity=" + this.a + ", m_locked=" + this.b + ", m_items=" + Arrays.toString(this.e.keys()) + "}";
    }
}

