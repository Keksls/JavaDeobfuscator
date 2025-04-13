/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * Renamed from aCd
 */
public class acd_1<T>
implements Iterator<T> {
    private final ListIterator<? extends T> a;

    public acd_1(List<? extends T> list) {
        this.a = list.listIterator(list.size());
    }

    @Override
    public boolean hasNext() {
        return this.a.hasPrevious();
    }

    @Override
    public T next() {
        return this.a.previous();
    }

    @Override
    public void remove() {
        this.a.remove();
    }
}

