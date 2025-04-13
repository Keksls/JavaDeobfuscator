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
 * Renamed from aCk
 */
public class ack_1
implements Iterator<Long> {
    private final TLongObjectIterator a;

    public ack_1(TLongObjectHashMap tLongObjectHashMap) {
        this.a = tLongObjectHashMap.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    public Long a() {
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

