/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntIntIterator
 *  gnu.trove.map.hash.TIntIntHashMap
 */
import gnu.trove.iterator.TIntIntIterator;
import gnu.trove.map.hash.TIntIntHashMap;

public abstract class eBh
extends eAZ<eBg, eBi> {
    protected final TIntIntHashMap e = new TIntIntHashMap();
    private final euw_1 f;

    protected eBh(euw_1 euw_12) {
        super(new eBg(euw_12));
        this.f = euw_12;
    }

    public void a(int n, int n2) {
        if (this.c != null) {
            ((eBi)this.c).a(n, n2);
        }
    }

    public boolean b(int n, int n2) {
        if (!this.c(n, n2)) {
            return false;
        }
        this.e.adjustOrPutValue(n, n2, n2);
        this.a(n, n2);
        return true;
    }

    public int a(int n) {
        return this.e.get(n);
    }

    @Override
    public boolean e() {
        if (this.d.a() < (long)this.f.g()) {
            return false;
        }
        TIntIntIterator tIntIntIterator = this.f.e();
        while (tIntIntIterator.hasNext()) {
            tIntIntIterator.advance();
            if (this.a(tIntIntIterator.key()) >= tIntIntIterator.value()) continue;
            return false;
        }
        return true;
    }

    @Override
    public void a() {
        super.a();
        this.e.clear();
    }

    public boolean c(int n, int n2) {
        return ((eBg)this.b).a(this, n, n2);
    }

    public int d(int n, int n2) {
        return ((eBg)this.b).b(this, n, n2);
    }
}

