/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from eYu
 */
public class eyu_1 {
    protected static final Logger a = Logger.getLogger(eyu_1.class);
    private long b;
    private eyv_1 c;

    public void a(eyv_1 eyv_12) {
        this.c = eyv_12;
        if (this.c != null) {
            this.c.a(this, 0L);
        }
    }

    public long a() {
        return this.b;
    }

    private void e(long l) {
        if (this.c != null) {
            this.c.a(this, l);
        }
    }

    public boolean a(long l) {
        long l2 = this.b + l;
        return l2 >= 0L;
    }

    public boolean b(long l) {
        if (l < 0L) {
            return false;
        }
        long l2 = l - this.b;
        this.b = l;
        this.e(l2);
        return true;
    }

    public boolean c(long l) {
        if (l <= 0L) {
            return false;
        }
        return this.b(this.b + l);
    }

    public boolean d(long l) {
        if (l < 0L) {
            return false;
        }
        return this.b(Math.max(0L, this.b - l));
    }
}

