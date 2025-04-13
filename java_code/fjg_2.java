/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fJg
 */
public abstract class fjg_2<T> {
    public static final int b = -1;
    protected fjw_2 c;
    protected int d;
    protected int e;
    protected int f = 1;
    protected boolean g = true;
    protected int h = 0;
    protected int i = 0;
    protected T j;
    protected T k;
    protected boolean l = false;
    protected fjt_2 m;
    private ArrayList<fjv_2> a = null;

    public void a(fjv_2 fjv_22) {
        if (this.a == null) {
            this.a = new ArrayList(3);
        }
        this.a.add(fjv_22);
    }

    public void b(fjv_2 fjv_22) {
        if (this.a != null) {
            this.a.remove(fjv_22);
        }
    }

    public boolean d() {
        return this.l;
    }

    public void a(boolean bl) {
        this.l = bl;
    }

    public long e() {
        return this.e;
    }

    public void b(int n) {
        this.e = n;
    }

    public int f() {
        return this.i;
    }

    public void c(int n) {
        this.i = n;
    }

    public boolean g() {
        return this.g;
    }

    public void b(boolean bl) {
        this.g = bl;
    }

    public T h() {
        return this.j;
    }

    public void a(T t) {
        this.j = t;
    }

    public T i() {
        return this.k;
    }

    public void b(T t) {
        this.k = t;
    }

    public int j() {
        return this.f;
    }

    public final void d(int n) {
        assert (n == -1 || n > 0) : "La valeur de repeat d\u00e9finie n'est pas valide ( inf\u00e9rieure ou \u00e9gale \u00e0 0)";
        this.f = n;
    }

    public void a(fjw_2 fjw_22) {
        this.c = fjw_22;
    }

    public void a(fjt_2 fjt_22) {
        this.m = fjt_22;
    }

    public fjt_2 k() {
        return this.m;
    }

    public boolean a(int n) {
        if (this.l) {
            return true;
        }
        if (this.i > 0) {
            this.i -= n;
        }
        if (this.i > 0) {
            return false;
        }
        if (this.i < 0) {
            this.d -= this.i;
            this.i = 0;
        } else {
            this.d += n;
        }
        if (this.d >= this.e) {
            ++this.h;
            if (this.h != this.f) {
                if (this.g) {
                    T t = this.j;
                    this.j = this.k;
                    this.k = t;
                }
                this.d = this.e != 0 ? (this.d %= this.e) : 0;
            } else {
                this.d = this.e;
            }
        }
        if (this.f != -1 && this.h >= this.f) {
            this.m.removeTween(this);
            return false;
        }
        return true;
    }

    public void a() {
        this.l();
        if (this.a != null) {
            for (int k = this.a.size() - 1; k >= 0; --k) {
                this.a.get(k).onTweenEvent(this, fju_2.a);
            }
        }
    }

    public void l() {
    }
}

