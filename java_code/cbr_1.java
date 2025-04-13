/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cbR
 */
abstract class cbr_1 {
    protected static final Logger a = Logger.getLogger(cbr_1.class);
    protected boolean b = false;
    protected boolean c = true;
    protected final cbe_1 d = new cbe_1(0.0f);
    private cbs_1 e;

    cbr_1() {
    }

    public void a(cbs_1 cbs_12) {
        this.e = cbs_12;
    }

    public boolean c() {
        return this.c;
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    boolean d() {
        return this.b;
    }

    void b(float f2) {
        this.d.a(f2);
    }

    float e() {
        return this.d.a();
    }

    void a(float f2, int n, long l) {
        this.d.a(f2, n, l);
    }

    void a(long l) {
        this.d.b(l);
    }

    void a(ahg_0 ahg_02) {
        if (this.e != null && !this.b) {
            this.e.a();
        }
    }

    void a() {
        if (this.e != null && this.b) {
            this.e.b();
        }
    }

    abstract void a(ahg_0 var1, float var2, float var3);
}

