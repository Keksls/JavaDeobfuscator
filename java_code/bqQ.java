/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntIntIterator
 *  gnu.trove.map.hash.TIntIntHashMap
 */
import gnu.trove.iterator.TIntIntIterator;
import gnu.trove.map.hash.TIntIntHashMap;
import java.util.ArrayList;

public class bqQ
extends bqN {
    private ArrayList<bqR> k;

    public bqQ(bqI bqI2) {
        super(bqI2);
    }

    @Override
    public Object b(String string) {
        if (string.equals("content")) {
            return this.f();
        }
        if (string.equals("kama")) {
            if (this.j == null) {
                this.j = new bqS(this);
            }
            return this.j;
        }
        return super.b(string);
    }

    @Override
    protected boolean b() {
        if (this.j.g() > 0L) {
            return true;
        }
        for (bqR bqR2 : this.k) {
            if (bqR2.g() <= 0L) continue;
            return true;
        }
        return false;
    }

    @Override
    public void c() {
        TIntIntHashMap tIntIntHashMap = new TIntIntHashMap();
        for (bqR bqR2 : this.k) {
            tIntIntHashMap.put(bqR2.i(), Hw.e(bqR2.g()));
        }
        ((bpf_2)azu_0.j().k().eE()).a(tIntIntHashMap, this.j.g());
    }

    @Override
    public long e() {
        return this.j.g();
    }

    private ArrayList<bqR> f() {
        if (this.k == null) {
            this.k = new ArrayList();
            TIntIntIterator tIntIntIterator = this.a().a().e();
            while (tIntIntIterator.hasNext()) {
                tIntIntIterator.advance();
                int n = tIntIntIterator.key();
                this.k.add(new bqR(this, n));
            }
        }
        return this.k;
    }
}

