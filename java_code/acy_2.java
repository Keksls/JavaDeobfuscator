/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aCy
 */
public class acy_2<T>
extends acq_2
implements Iterable<T> {
    private T[] c;

    public acy_2() {
        this(10);
    }

    public acy_2(int n) {
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

    public void a(int n, T t) {
        this.a();
        int n2 = this.c(n);
        if (n2 < 0) {
            n2 = -n2 - 1;
        } else {
            ++this.b;
            this.a[n2] = n;
        }
        this.c[n2] = t;
    }

    public T f(int n) {
        if (this.b == 0) {
            return null;
        }
        int n2 = this.b(n);
        if (n2 < 0) {
            return null;
        }
        T t = this.c[n2];
        if (n2 < this.b - 1) {
            this.a[n2] = this.a[this.b - 1];
            this.c[n2] = this.c[this.b - 1];
            this.a[this.b - 1] = 0;
            this.c[this.b - 1] = null;
        } else {
            this.a[n2] = 0;
            this.c[n2] = null;
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

    public T g(int n) {
        int n2 = this.b(n);
        if (n2 < 0) {
            return null;
        }
        return this.c[n2];
    }

    public T h(int n) {
        return this.c[n];
    }

    @Override
    @NotNull
    public Iterator<T> iterator() {
        return new aby_1<T>(this.c, false);
    }

    @Override
    public void e() {
        super.e();
        T[] TArray = this.c;
        this.c = new Object[this.b];
        System.arraycopy(TArray, 0, this.c, 0, this.b);
    }
}

