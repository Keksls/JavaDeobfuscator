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
 * Renamed from aCh
 */
public class ach_1
implements Iterator<Integer> {
    private final TIntObjectIterator a;

    public ach_1(TIntObjectHashMap tIntObjectHashMap) {
        this.a = tIntObjectHashMap.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    public Integer a() {
        this.a.advance();
        return this.a.key();
    }

    @Override
    public void remove() {
        this.a.remove();
    }

    @Override
    public /* synthetic */ Object next() {
        return this.a();
    }
}

