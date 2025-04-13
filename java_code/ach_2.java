/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aCH
 */
public class ach_2<T>
extends aca_2
implements Iterable<T> {
    private T[] c;

    public ach_2() {
        this(10);
    }

    public ach_2(int n) {
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

    public void a(long l, T t) {
        this.a();
        int n = this.b(l);
        if (n < 0) {
            n = -n - 1;
        } else {
            ++this.b;
            this.a[n] = l;
        }
        this.c[n] = t;
    }

    public T d(long l) {
        if (this.b == 0) {
            return null;
        }
        int n = this.a(l);
        if (n < 0) {
            return null;
        }
        return this.d(n);
    }

    private T d(int n) {
        T t = this.c[n];
        if (n < this.b - 1) {
            this.a[n] = this.a[this.b - 1];
            this.c[n] = this.c[this.b - 1];
            this.a[this.b - 1] = 0L;
            this.c[this.b - 1] = null;
        } else {
            this.a[n] = 0L;
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

    public T e(long l) {
        int n = this.a(l);
        if (n < 0) {
            return null;
        }
        return this.c[n];
    }

    public T c(int n) {
        return this.c[n];
    }

    @Override
    @NotNull
    public Iterator<T> iterator() {
        return new aby_1<T>(this.c, false);
    }
}

