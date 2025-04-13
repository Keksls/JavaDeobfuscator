/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from aKU
 */
public abstract class aku_1 {
    protected static final Logger a = Logger.getLogger(aku_1.class);
    public static final long b = Long.MIN_VALUE;
    public static final int c = -1;
    protected final ArrayList<akw_2> d = new ArrayList();
    private int e;
    private int f;
    private int g;
    private long h = Long.MIN_VALUE;
    private long i = Long.MIN_VALUE;
    private boolean j = false;
    private int k = -1;
    private akx_1 l;

    public aku_1(int n, int n2, int n3) {
        this.e = n;
        this.f = n2;
        this.g = n3;
    }

    public abstract void a();

    public void a(akw_2 akw_22) {
        this.d.add(akw_22);
    }

    public void b(akw_2 akw_22) {
        this.d.remove(akw_22);
    }

    public int c() {
        return this.e;
    }

    public void a(int n) {
        this.e = n;
    }

    public int d() {
        return this.f;
    }

    public void b(int n) {
        this.f = n;
    }

    public int e() {
        return this.g;
    }

    public void c(int n) {
        this.g = n;
    }

    public long f() {
        return this.h;
    }

    public void b(long l) {
        this.h = l;
    }

    public int g() {
        return this.k;
    }

    public void d(int n) {
        this.k = n;
    }

    public long h() {
        return this.i;
    }

    public void c(long l) {
        this.i = l;
    }

    public void a(akx_1 akx_12) {
        this.l = akx_12;
    }

    public akx_1 i() {
        return this.l;
    }

    protected void j() {
        try {
            this.l();
        }
        catch (Exception exception) {
            a.error((Object)"Exception levee", (Throwable)exception);
        }
        for (akw_2 akw_22 : this.d.toArray(new akw_2[this.d.size()])) {
            try {
                akw_22.a(this);
            }
            catch (Exception exception) {
                a.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    public boolean k() {
        return this.j;
    }

    public void a(boolean bl) {
        this.j = bl;
    }

    protected abstract void l();

    public String toString() {
        return "{Action UID=" + this.c() + " id=" + this.e() + " type=" + this.d() + "}";
    }

    public int m() {
        return -1;
    }
}

