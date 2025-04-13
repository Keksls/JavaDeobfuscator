/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aBL
 */
public class abl_2
implements Iterable<Long> {
    private static final int e = 10;
    protected long[] a;
    protected int b;
    protected int c;
    protected int d;

    public abl_2() {
        this.a = new long[10];
        this.b = 10;
        this.c = 0;
        this.d = 10;
    }

    public abl_2(abl_2 abl_22) {
        this.b = this.c = abl_22.c;
        this.a = new long[abl_22.c];
        this.d = abl_22.d;
    }

    public abl_2(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("La taille du tableau doit \u00eatre >= 0");
        }
        this.a = new long[n];
        this.b = n;
        this.c = 0;
        this.d = 10;
    }

    public abl_2(int n, int n2) {
        if (n < 0) {
            throw new IllegalArgumentException("La taille du tableau doit \u00eatre >= 0");
        }
        if (n2 < 1) {
            throw new IllegalArgumentException("L'incr\u00e9ment de taille growth doit \u00eatre >= 1");
        }
        this.a = new long[n];
        this.b = n;
        this.c = 0;
        this.d = n2;
    }

    public void a(long l) {
        this.b(this.c + 1);
        this.a[this.c] = l;
        ++this.c;
    }

    public void a(long[] lArray) {
        int n = lArray.length;
        this.b(this.c + n);
        System.arraycopy(lArray, 0, this.a, this.c, n);
        this.c += n;
    }

    public void a(long[] lArray, int n) {
        this.b(this.c + n);
        System.arraycopy(lArray, 0, this.a, this.c, n);
        this.c += n;
    }

    public void a(long[] lArray, int n, int n2) {
        this.b(this.c + n2);
        System.arraycopy(lArray, n, this.a, this.c, n2);
        this.c += n2;
    }

    public void a(abl_2 abl_22) {
        this.a(abl_22.a, 0, abl_22.c);
    }

    public boolean b(long l) {
        for (int k = 0; k < this.c; ++k) {
            if (this.a[k] != l) continue;
            if (k < this.c - 1) {
                System.arraycopy(this.a, k + 1, this.a, k, this.c - k - 1);
            }
            --this.c;
            return true;
        }
        return false;
    }

    public long a(int n) {
        if (n >= this.c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.a[n];
    }

    public int a() {
        return this.c;
    }

    public boolean b() {
        return this.c == 0;
    }

    public boolean c(long l) {
        for (int k = this.c - 1; k >= 0; --k) {
            if (this.a[k] != l) continue;
            return true;
        }
        return false;
    }

    public long[] c() {
        return this.a;
    }

    public long[] d() {
        long[] lArray = new long[this.c];
        System.arraycopy(this.a, 0, lArray, 0, this.c);
        return lArray;
    }

    private void b(int n) {
        if (n > this.b) {
            this.b = n + this.d;
            long[] lArray = new long[this.b];
            System.arraycopy(this.a, 0, lArray, 0, this.c);
            this.a = lArray;
        }
    }

    @Override
    @NotNull
    public Iterator<Long> iterator() {
        return new abm_2(this);
    }
}

