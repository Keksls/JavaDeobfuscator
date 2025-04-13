/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from aCn
 */
public class acn_2<K, V> {
    protected K[] a;
    private V[] c;
    protected int b;

    public acn_2() {
        this(10);
    }

    public acn_2(int n) {
        this.a = new Object[n];
        this.c = new Object[n];
        this.b = 0;
    }

    public boolean a(int n) {
        if (n > this.a.length) {
            K[] KArray = this.a;
            this.a = new Object[n];
            System.arraycopy(KArray, 0, this.a, 0, KArray.length);
            V[] VArray = this.c;
            this.c = new Object[n];
            System.arraycopy(VArray, 0, this.c, 0, VArray.length);
            return true;
        }
        return false;
    }

    protected final int a(K k) {
        for (int i2 = this.b - 1; i2 >= 0; --i2) {
            if (!k.equals(this.a[i2])) continue;
            return i2;
        }
        return -1;
    }

    protected final int b(K k) {
        for (int i2 = this.b - 1; i2 >= 0; --i2) {
            if (k != this.a[i2]) continue;
            return -i2 - 1;
        }
        return this.b;
    }

    protected final void a() {
        if (this.b == this.a.length) {
            this.a(this.a.length * 2);
        }
    }

    public final boolean c(K k) {
        return this.a(k) != -1;
    }

    public final void b() {
        this.b = 0;
    }

    public void c() {
        this.b = 0;
        int n = this.c.length;
        for (int k = 0; k < n; ++k) {
            this.c[k] = null;
        }
    }

    public final int d() {
        return this.b;
    }

    public final K b(int n) {
        return this.a[n];
    }

    public void a(K k, V v) {
        this.a();
        int n = this.b(k);
        if (n < 0) {
            n = -n - 1;
        } else {
            ++this.b;
            this.a[n] = k;
        }
        this.c[n] = v;
    }

    public V d(K k) {
        if (this.b == 0) {
            return null;
        }
        int n = this.a(k);
        if (n < 0) {
            return null;
        }
        V v = this.c[n];
        if (n < this.b - 1) {
            this.a[n] = this.a[this.b - 1];
            this.c[n] = this.c[this.b - 1];
            this.a[this.b - 1] = null;
            this.c[this.b - 1] = null;
        } else {
            this.a[n] = null;
            this.c[n] = null;
        }
        --this.b;
        return v;
    }

    public V e(K k) {
        int n = this.a(k);
        if (n < 0) {
            return null;
        }
        return this.c[n];
    }

    public final V c(int n) {
        return this.c[n];
    }

    public final void a(TObjectProcedure<V> tObjectProcedure) {
        for (int k = 0; k < this.b; ++k) {
            tObjectProcedure.execute(this.c[k]);
        }
    }

    public static void a(String[] stringArray) {
        acn_2<String, Integer> acn_22 = new acn_2<String, Integer>();
        acn_22.a("id", 10);
        acn_22.a("craft_id", 20);
        int n = (Integer)acn_22.e("craft_id");
        System.out.println(n);
    }
}

