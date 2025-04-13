/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

/*
 * Renamed from aBY
 */
public class aby_1<E>
implements Iterator<E> {
    private final E[] a;
    private final int b;
    private final boolean c;
    private int d = -1;

    public aby_1(E[] EArray, boolean bl) {
        this.a = EArray;
        this.b = EArray.length;
        this.c = bl;
        this.a();
    }

    @Override
    public boolean hasNext() {
        return this.d < this.b;
    }

    @Override
    public E next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException("Array end reached. Array Size : " + this.b);
        }
        E e2 = this.a[this.d];
        this.a();
        return e2;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    private void a() {
        if (this.c) {
            ++this.d;
        } else {
            ++this.d;
            while (this.d < this.b && this.a[this.d] == null) {
                ++this.d;
            }
        }
    }
}

