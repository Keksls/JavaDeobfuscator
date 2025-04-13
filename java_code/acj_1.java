/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.Iterator;

/*
 * Renamed from aCj
 */
public class acj_1<T>
implements Iterator<T> {
    private final TLongObjectIterator<T> a;

    public acj_1(TLongObjectHashMap<T> tLongObjectHashMap) {
        this.a = tLongObjectHashMap.iterator();
    }

    public acj_1(TLongObjectIterator<T> tLongObjectIterator) {
        this.a = tLongObjectIterator;
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    public T next() {
        this.a.advance();
        return (T)this.a.value();
    }

    @Override
    public void remove() {
        this.a.remove();
    }

    public String toString() {
        return "TroveIterator{m_iterator=" + this.a + "}";
    }
}

