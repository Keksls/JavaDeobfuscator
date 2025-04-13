/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/*
 * Renamed from aCe
 */
public class ace_1<T>
implements Iterator<T> {
    private final SortedSet<? extends T> a;
    private T b = null;
    private SortedSet<? extends T> c;

    public ace_1(SortedSet<? extends T> sortedSet) {
        this.a = sortedSet;
        this.c = this.a;
    }

    @Override
    public boolean hasNext() {
        return !this.c.isEmpty();
    }

    @Override
    public T next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = this.c.last();
        this.a();
        return this.b;
    }

    private void a() {
        this.c = this.a.headSet(this.b);
    }

    @Override
    public void remove() {
        if (this.b == null) {
            throw new NoSuchElementException();
        }
        this.a.remove(this.b);
    }
}

