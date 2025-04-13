/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

/*
 * Renamed from aCK
 */
public class ack_2<T>
extends acj_2
implements Iterable<T> {
    private T[] c;

    public ack_2() {
        this(10);
    }

    public ack_2(int n) {
        super(n);
        this.c = new Object[n];
    }

    @Override
    public boolean a(int n) {
        int n2 = this.a.length;
        if (!super.a(n)) {
            return false;
        }
        T[] TArray = this.c;
        this.c = new Object[n];
        System.arraycopy(TArray, 0, this.c, 0, n2);
        return true;
    }

    public void a(short s2, T t) {
        this.a();
        int n = this.b(s2);
        if (n < 0) {
            n = -n - 1;
        } else {
            ++this.b;
            this.a[n] = s2;
        }
        this.c[n] = t;
    }

    public T d(short s2) {
        if (this.b == 0) {
            return null;
        }
        int n = this.a(s2);
        if (n < 0) {
            return null;
        }
        T t = this.c[n];
        if (n < this.b - 1) {
            this.a[n] = this.a[this.b - 1];
            this.c[n] = this.c[this.b - 1];
            this.a[this.b - 1] = 0;
            this.c[this.b - 1] = null;
        } else {
            this.a[n] = 0;
            this.c[n] = null;
        }
        --this.b;
        return t;
    }

    @Override
    public void c() {
        super.c();
        int n = this.c.length;
        for (int k = 0; k < n; ++k) {
            this.c[k] = null;
        }
    }

    public T e(short s2) {
        int n = this.a(s2);
        if (n < 0) {
            return null;
        }
        return this.c[n];
    }

    public final T c(int n) {
        return this.c[n];
    }

    @Override
    public final Iterator<T> iterator() {
        return new aby_1<T>(this.c, false);
    }
}

