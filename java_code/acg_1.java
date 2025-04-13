/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 */
import gnu.trove.iterator.TLongObjectIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from aCg
 */
public class acg_1<T>
implements Iterator<T> {
    private final List<TLongObjectIterator<T>> a = new ArrayList<TLongObjectIterator<T>>(2);
    private TLongObjectIterator<T> b = null;
    private int c = 0;

    public acg_1() {
    }

    public acg_1(TLongObjectIterator<? extends T> ... tLongObjectIteratorArray) {
        for (TLongObjectIterator<? extends T> tLongObjectIterator : tLongObjectIteratorArray) {
            this.a.add(tLongObjectIterator);
        }
        if (this.b == null && tLongObjectIteratorArray.length > 0) {
            this.b = tLongObjectIteratorArray[0];
        }
    }

    public acg_1(TLongObjectIterator<T> tLongObjectIterator) {
        this.a.add(tLongObjectIterator);
        this.b = tLongObjectIterator;
    }

    public acg_1(TLongObjectIterator<T> tLongObjectIterator, TLongObjectIterator<T> tLongObjectIterator2) {
        this.a.add(tLongObjectIterator);
        this.a.add(tLongObjectIterator2);
        this.b = tLongObjectIterator;
    }

    public void a(TLongObjectIterator<T> tLongObjectIterator) {
        this.a.add(tLongObjectIterator);
        if (this.b == null) {
            this.b = tLongObjectIterator;
        }
    }

    @Override
    public boolean hasNext() {
        return this.b != null && this.b.hasNext();
    }

    @Override
    public T next() {
        this.b.advance();
        Object object = this.b.value();
        if (!this.b.hasNext()) {
            while (!this.b.hasNext()) {
                ++this.c;
                if (this.c >= this.a.size()) {
                    this.b = null;
                    break;
                }
                this.b = this.a.get(this.c);
            }
        }
        return (T)object;
    }

    @Override
    public void remove() {
    }
}

