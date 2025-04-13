/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/*
 * Renamed from aCa
 */
public class aca_1<T>
implements Iterator<T> {
    private final List<Iterator<? extends T>> a = new ArrayList<Iterator<? extends T>>(2);
    private Iterator<? extends T> b;
    private int c = -1;

    public aca_1(Collection<? extends Iterator<? extends T>> collection) {
        this.a.addAll(collection);
        if (!this.a.isEmpty()) {
            this.b = this.a.get(0);
            this.c = 0;
        }
    }

    public aca_1() {
        this(Collections.emptyList());
    }

    public aca_1(Iterator<? extends T> ... iteratorArray) {
        this(Arrays.asList(iteratorArray));
    }

    public aca_1(Iterator<? extends T> iterator) {
        this(Collections.singletonList(iterator));
    }

    public aca_1(Iterator<? extends T> iterator, Iterator<? extends T> iterator2) {
        this(Arrays.asList(iterator, iterator2));
    }

    public void a(Iterator<? extends T> iterator) {
        if (this.b == null) {
            this.b = iterator;
            this.c = this.a.size();
        }
        this.a.add(iterator);
    }

    @Override
    public boolean hasNext() {
        if (this.b == null) {
            return false;
        }
        if (this.b.hasNext()) {
            return true;
        }
        int n = this.a.size();
        for (int k = this.c + 1; k < n; ++k) {
            if (!this.a.get(k).hasNext()) continue;
            return true;
        }
        return false;
    }

    @Override
    public T next() {
        if (this.b.hasNext()) {
            return this.b.next();
        }
        int n = this.a.size();
        for (int k = this.c + 1; k < n; ++k) {
            this.c = k;
            this.b = this.a.get(k);
            if (!this.b.hasNext()) continue;
            return this.b.next();
        }
        throw new NoSuchElementException();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

