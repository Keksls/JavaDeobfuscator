/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/*
 * Renamed from aCb
 */
public class acb_1<E>
implements Iterator<E> {
    private final List<E> a;
    private final E[] b;
    private int c;
    private boolean d;

    public acb_1(List<E> list) {
        this.a = list;
        this.b = list.toArray();
        for (int k = this.b.length - 1; 0 < k; --k) {
            acb_1.a(this.b, k, acb_1.a(this.b, Hw.a(k + 1), this.b[k]));
        }
        this.c = this.b.length;
        this.d = true;
    }

    private static <E> E a(E[] EArray, int n, E e2) {
        E e3 = EArray[n];
        EArray[n] = e2;
        return e3;
    }

    @Override
    public boolean hasNext() {
        return 0 < this.c;
    }

    @Override
    public E next() {
        boolean bl = this.d = this.c == 0;
        if (this.d) {
            throw new NoSuchElementException();
        }
        return this.b[--this.c];
    }

    @Override
    public void remove() {
        if (this.d) {
            throw new IllegalStateException();
        }
        this.d = true;
        this.a.remove(this.b[this.c]);
    }
}

