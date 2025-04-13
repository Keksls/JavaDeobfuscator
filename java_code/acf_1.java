/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

/*
 * Renamed from aCf
 */
public class acf_1<T>
implements Iterator<T> {
    private T a = null;

    public acf_1(T t) {
        this.a = t;
    }

    public void a(T t) {
        if (this.a != null) {
            throw new UnsupportedOperationException("Can't initialize an already initialized iterator");
        }
        this.a = t;
    }

    @Override
    public void remove() {
        if (this.a == null) {
            throw new NoSuchElementException();
        }
        this.a = null;
    }

    @Override
    public boolean hasNext() {
        return this.a != null;
    }

    @Override
    public T next() {
        if (this.a != null) {
            T t = this.a;
            this.a = null;
            return t;
        }
        throw new NoSuchElementException();
    }
}

