/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.Iterator;

/*
 * Renamed from aCi
 */
public class aci_1<T>
implements Iterator<T> {
    private final TIntObjectIterator<T> a;

    public aci_1(TIntObjectHashMap<T> tIntObjectHashMap) {
        this.a = tIntObjectHashMap.iterator();
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

