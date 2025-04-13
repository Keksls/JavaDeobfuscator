/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TShortObjectIterator
 *  gnu.trove.map.hash.TShortObjectHashMap
 */
import gnu.trove.iterator.TShortObjectIterator;
import gnu.trove.map.hash.TShortObjectHashMap;
import java.util.Iterator;

/*
 * Renamed from aCm
 */
public class acm_2<T>
implements Iterator<T> {
    private final TShortObjectIterator<T> a;

    public acm_2(TShortObjectHashMap<T> tShortObjectHashMap) {
        this.a = tShortObjectHashMap.iterator();
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
}

