/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aMQ
 */
public abstract class amq_2 {
    public static final byte a = 1;
    public static final byte b = 2;
    protected static final Logger c = Logger.getLogger(amq_2.class);
    private amr_2 d = new amr_2();
    private String e = "<undefined>";
    private ams_2 f;
    private boolean g = false;

    protected amq_2() {
    }

    public void a(ams_2 ams_22) {
        this.f = ams_22;
    }

    public final void a(amr_2 amr_22) {
        this.d = amr_22;
    }

    public final amr_2 a() {
        return this.d;
    }

    public final void a(String string) {
        if (string != null && !string.isEmpty()) {
            this.e = string;
        }
    }

    public final String b() {
        return this.e;
    }

    public byte c() {
        return 1;
    }

    public abstract void d();

    public final void e() {
        this.g = true;
        this.f.a(this);
    }

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract boolean i();

    public abstract boolean j();

    public final boolean k() {
        return this.g;
    }

    public abstract boolean l();

    public abstract boolean m();

    public abstract void a(aqv_2 var1);
}

