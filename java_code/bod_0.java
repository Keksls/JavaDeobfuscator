/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;

/*
 * Renamed from bOd
 */
public class bod_0 {
    private final TLongObjectHashMap<bNK> a = new TLongObjectHashMap();
    private final long b;
    private final int c;
    private final int d;

    public bod_0(int n, int n2) {
        this.c = XY.a(n);
        this.d = XY.b(n2);
        this.b = Hw.c(this.c, this.d);
    }

    public void a(bNK bNK2) {
        this.a.put(bNK2.a(), (Object)bNK2);
    }

    public void b(bNK bNK2) {
        this.a.remove(Hw.c(bNK2.G(), bNK2.H()));
    }

    public boolean a(int n, int n2) {
        long l = Hw.c(n, n2);
        return this.a.get(l) != null;
    }

    public void a() {
        TLongObjectIterator tLongObjectIterator = this.a.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            bNK bNK2 = (bNK)tLongObjectIterator.value();
            bNK2.c();
        }
        this.a.clear();
    }

    public long b() {
        return this.b;
    }

    public bNK b(int n, int n2) {
        long l = Hw.c(n, n2);
        return (bNK)this.a.get(l);
    }

    public TLongObjectHashMap<bNK> c() {
        return this.a;
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.d;
    }
}

