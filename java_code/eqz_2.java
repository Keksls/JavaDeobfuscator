/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

/*
 * Renamed from eqz
 */
class eqz_2
implements Iterator<abo_2<Integer, Short>> {
    private int b = -1;
    final /* synthetic */ eqy_2 a;

    eqz_2(eqy_2 eqy_22) {
        this.a = eqy_22;
    }

    @Override
    public boolean hasNext() {
        return this.b < this.a.e.size() - 1;
    }

    public abo_2<Integer, Short> a() {
        ++this.b;
        return new abo_2<Integer, Short>(this.a.e.getQuick(this.b), this.a.f.getQuick(this.b));
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public /* synthetic */ Object next() {
        return this.a();
    }
}

