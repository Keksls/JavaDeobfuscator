/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from aEo
 */
public final class aeo_1 {
    protected static final Logger a = Logger.getLogger(aeo_1.class);
    private static aeu_1 b;
    private static final abj_2<String, aeo_1> c;
    static final ArrayList<aeo_1> d;
    private final String e;
    private aef_1 f;
    private aee_1 g;
    final ArrayList<aev_1> h = new ArrayList();
    private byte[] i;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static aeo_1 a(String string, aev_1 aev_12) {
        aeo_1 aeo_12 = c.a(string);
        if (aeo_12 == null) {
            aeo_12 = new aeo_1(string);
            aeo_12.a(new aee_1(aeo_12));
            if (aev_12 != null) {
                aeo_12.h.add(aev_12);
            }
            ArrayList<aeo_1> arrayList = d;
            synchronized (arrayList) {
                d.add(aeo_12);
                d.notify();
            }
        } else {
            aee_1 aee_12 = aeo_12.g();
            if (!aee_12.a()) {
                aeo_12.h.add(aev_12);
            } else {
                aeo_1 aeo_13 = aeo_12;
                ado_1.a().a(new aep_1(aev_12, aeo_13));
            }
        }
        return aeo_12;
    }

    public static aeo_1 a(String string) {
        aeo_1 aeo_12 = c.a(string);
        if (aeo_12 == null) {
            aeo_12 = new aeo_1(string);
            aee_1 aee_12 = new aee_1(aeo_12);
            while (!aee_12.a()) {
                aee_12.b();
            }
            c.a(string, aeo_12);
        } else {
            aee_1 aee_13 = aeo_12.g();
            if (aee_13 != null) {
                while (!aee_13.a()) {
                    Thread.yield();
                }
            }
        }
        return aeo_12;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static aeo_1 a(String string, byte[] byArray, aev_1 aev_12) {
        aeo_1 aeo_12 = c.a(string);
        if (aeo_12 == null) {
            aeo_12 = new aeo_1(string);
            aeo_12.a(byArray);
            aeo_12.a(new aef_1(aeo_12));
            c.a(string, aeo_12);
            ArrayList<aeo_1> arrayList = d;
            synchronized (arrayList) {
                d.add(aeo_12);
                d.notify();
            }
        } else {
            aee_1 aee_12 = aeo_12.g();
            if (aee_12 == null || aee_12.a()) {
                aef_1 aef_12 = aeo_12.f();
                if (aef_12 == null || aef_12.a()) {
                    aeo_12.a(new aef_1(aeo_12));
                    aeo_12.a(byArray);
                    ArrayList<aeo_1> arrayList = d;
                    synchronized (arrayList) {
                        d.add(aeo_12);
                        d.notify();
                    }
                }
            } else {
                throw new aec_1("Loading in progress");
            }
        }
        return aeo_12;
    }

    public static aeo_1 a(String string, byte[] byArray) {
        aeo_1 aeo_12 = c.a(string);
        if (aeo_12 == null) {
            aeo_12 = new aeo_1(string);
            aeo_12.a(byArray);
            aef_1 aef_12 = new aef_1(aeo_12);
            while (!aef_12.a()) {
                aef_12.b();
            }
            c.a(string, aeo_12);
        } else {
            aee_1 aee_12 = aeo_12.g();
            if (aee_12 == null || aee_12.a()) {
                aef_1 aef_13 = aeo_12.f();
                if (aef_13 == null || aef_13.a()) {
                    aeo_12.a(byArray);
                    aef_13 = new aef_1(aeo_12);
                    aeo_12.a(aef_13);
                    while (!aef_13.a()) {
                        aef_13.b();
                    }
                }
            } else {
                throw new aec_1("Loading in progress");
            }
        }
        return aeo_12;
    }

    private aeo_1(String string) {
        if (b == null) {
            b = new aeu_1();
            b.start();
        }
        this.e = string;
    }

    public byte[] a() {
        return this.i;
    }

    public InputStream b() {
        if (this.i != null) {
            return new ByteArrayInputStream(this.i);
        }
        return null;
    }

    void a(byte[] byArray) {
        this.i = byArray;
    }

    public String c() {
        return this.e;
    }

    private void a(aef_1 aef_12) {
        this.f = aef_12;
    }

    private void a(aee_1 aee_12) {
        this.g = aee_12;
    }

    aef_1 f() {
        return this.f;
    }

    aee_1 g() {
        return this.g;
    }

    void d() {
        aeo_1 aeo_12 = this;
        ado_1.a().a(new aeq_1(this, aeo_12));
    }

    void a(IOException iOException) {
        aeo_1 aeo_12 = this;
        ado_1.a().a(new aer_1(this, aeo_12, iOException));
    }

    void e() {
        aeo_1 aeo_12 = this;
        ado_1.a().a(new aes_1(this, aeo_12));
    }

    void b(IOException iOException) {
        aeo_1 aeo_12 = this;
        ado_1.a().a(new aet_1(this, aeo_12, iOException));
    }

    static {
        c = new abj_2(30);
        d = new ArrayList();
    }
}

