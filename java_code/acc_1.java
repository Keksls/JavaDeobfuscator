/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

/*
 * Renamed from aCc
 */
public class acc_1<E>
implements Iterator<E> {
    private final Iterator<E> a;

    public acc_1(Iterator<E> iterator) {
        this.a = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    public E next() {
        return this.a.next();
    }

    @Override
    @Deprecated
    public void remove() {
        throw new UnsupportedOperationException("Impossible de modifier la collection de base avec cet iterator");
    }
}

