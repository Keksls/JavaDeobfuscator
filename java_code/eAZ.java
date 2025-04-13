/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public abstract class eAZ<Checker extends eBf, Observer extends eba_0> {
    protected static final Logger a = Logger.getLogger(eAZ.class);
    @Deprecated
    protected final Checker b;
    protected Observer c;
    protected final eyu_1 d = new eyu_1();

    protected eAZ(Checker Checker) {
        this.b = Checker;
    }

    public long c() {
        return Hw.e(this.d.a());
    }

    public boolean a(long l) {
        return this.c(l) && this.d.c(l);
    }

    public boolean b(long l) {
        return this.d(l) && this.d.d(l);
    }

    public void a(Observer Observer) {
        if (this.c != null) {
            throw new UnsupportedOperationException("Listener already SET");
        }
        this.c = Observer;
        this.d.a((eyv_1)Observer);
    }

    public void d() {
        this.c = null;
        this.d.a(null);
    }

    public boolean c(long l) {
        return ((eBf)this.b).a(this.d, l);
    }

    public boolean d(long l) {
        return ((eBf)this.b).b(this.d, l);
    }

    public void a() {
        this.d.b(0L);
    }

    public abstract boolean e();
}

