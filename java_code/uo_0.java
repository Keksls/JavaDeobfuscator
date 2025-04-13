/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from UO
 */
public class uo_0 {
    protected static final Logger a = Logger.getLogger(uo_0.class);
    private int b;
    private int c;
    private short d;
    private aej_2 e;

    public void a(int n, int n2, short s2, aej_2 aej_22) {
        this.b = n;
        this.c = n2;
        this.d = s2;
        this.e = aej_22;
    }

    public un_0 a(aff_1 aff_12) {
        if (aff_12 == null) {
            a.error((Object)"Cannot compute part in sight from null position", new Throwable());
            return null;
        }
        return this.a(aff_12.d(), aff_12.e(), aff_12.f());
    }

    public un_0 a(int n, int n2, short s2) {
        if (this.e == null) {
            a.error((Object)"direction ou position null : update partLocalisator first");
            return null;
        }
        if (this.b == n && this.c == n2 && this.d == s2) {
            return un_0.d;
        }
        afr_2 afr_22 = new afr_2(this.e.m, this.e.n, 0.0f);
        afr_2 afr_23 = new afr_2(this.b - n, this.c - n2, 0.0f);
        double d2 = (afr_23 = afr_23.g()).g(afr_22);
        if (d2 <= -0.7) {
            return un_0.d;
        }
        if (d2 >= 0.72) {
            return un_0.a;
        }
        return un_0.c;
    }

    public void a() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = null;
    }
}

