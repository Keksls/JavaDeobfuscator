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
 * Renamed from aCl
 */
public class acl_2
implements Iterator<Short> {
    private final TShortObjectIterator a;

    public acl_2(TShortObjectHashMap tShortObjectHashMap) {
        this.a = tShortObjectHashMap.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    public Short a() {
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

