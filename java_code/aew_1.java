/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from aEw
 */
public class aew_1 {
    protected static final Logger a = Logger.getLogger(aew_1.class);
    private static aea_1 b;
    static final abj_2<URL, aew_1> c;
    static final ArrayList<aew_1> d;
    private static final int e = 0x400000;
    private final URL f;
    private byte[] g;
    int h;
    final ArrayList<aeb_1> i = new ArrayList();
    private final boolean j;
    private boolean k;
    private InputStream l;
    private static final byte[] m;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static aew_1 a(URL uRL, aeb_1 aeb_12, boolean bl) {
        aew_1 aew_12 = null;
        if (bl) {
            aew_12 = c.a(uRL);
        }
        if (aew_12 == null) {
            Iterable iterable;
            aew_12 = new aew_1(uRL, aeb_12, bl);
            if (bl) {
                iterable = c;
                synchronized (iterable) {
                    c.a(uRL, aew_12);
                }
            }
            iterable = d;
            synchronized (iterable) {
                d.add(aew_12);
            }
        }
        if (!aew_12.a()) {
            if (!aew_12.i.contains(aeb_12)) {
                aew_12.i.add(aeb_12);
            }
        } else {
            aeb_1 aeb_13 = aeb_12;
            aew_1 aew_13 = aew_12;
            ado_1.a().a(new aex_1(aeb_13, aew_13));
        }
        return aew_12;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static aew_1 a(URL uRL, boolean bl) {
        aew_1 aew_12 = null;
        if (bl) {
            aew_12 = c.a(uRL);
        }
        if (aew_12 == null) {
            aew_12 = new aew_1(uRL, null, bl);
            while (!aew_12.a()) {
                aew_12.g();
            }
            if (bl) {
                abj_2<URL, aew_1> abj_22 = c;
                synchronized (abj_22) {
                    c.a(uRL, aew_12);
                }
            }
        } else {
            while (!aew_12.a()) {
                Thread.yield();
            }
        }
        return aew_12;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(aew_1 aew_12, aeb_1 aeb_12) {
        ArrayList<aew_1> arrayList = d;
        synchronized (arrayList) {
            abj_2<URL, aew_1> abj_22 = c;
            synchronized (abj_22) {
                if (aeb_12 != null) {
                    aew_12.i.remove(aeb_12);
                } else {
                    aew_12.i.clear();
                }
                if (aew_12.i.size() == 0) {
                    c.b(aew_12.f);
                    d.remove(aew_12);
                }
            }
        }
    }

    private aew_1(URL uRL, aeb_1 aeb_12, boolean bl) {
        if (b == null) {
            b = new aea_1();
            b.setPriority(10);
            b.start();
        }
        this.j = bl;
        this.f = uRL;
        this.i.add(aeb_12);
    }

    void a(Exception exception) {
        aew_1 aew_12 = this;
        ado_1.a().a(new aey_1(this, aew_12, exception));
    }

    void f() {
        aew_1 aew_12 = this;
        ado_1.a().a(new aez_1(this, aew_12));
    }

    void g() {
        if (!this.k) {
            int n;
            if (this.l == null) {
                this.l = new BufferedInputStream(this.f.openStream());
                this.g = new byte[this.l.available()];
                this.h = 0;
            }
            if ((n = this.l.read(m)) > 0) {
                if (this.h + n > this.g.length) {
                    byte[] byArray = new byte[this.g.length + n];
                    System.arraycopy(this.g, 0, byArray, 0, this.g.length);
                    System.arraycopy(m, 0, byArray, this.g.length, n);
                    this.g = byArray;
                } else {
                    System.arraycopy(m, 0, this.g, this.h, n);
                    this.h += n;
                }
            } else if (n < 0) {
                this.l.close();
                this.k = true;
                this.l = null;
            }
        }
    }

    public boolean a() {
        return this.k;
    }

    public URL b() {
        return this.f;
    }

    public boolean c() {
        return this.j;
    }

    public byte[] d() {
        if (this.k) {
            return this.g;
        }
        return null;
    }

    public InputStream e() {
        if (this.k) {
            return new ByteArrayInputStream(this.g);
        }
        return null;
    }

    static {
        c = new abj_2(30);
        d = new ArrayList();
        m = new byte[0x200000];
    }
}

