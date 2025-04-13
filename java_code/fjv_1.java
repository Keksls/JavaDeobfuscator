/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fJV
 */
public class fjv_1
implements Cloneable {
    protected static final Logger a = Logger.getLogger(fjv_1.class);
    private double b;

    public fjv_1(int n) {
        this.b = n;
    }

    public fjv_1(double d2) {
        this.b = d2;
    }

    public static fjv_1 a(String string) {
        if (string.charAt(string.length() - 1) != '%') {
            return null;
        }
        double d2 = Double.valueOf(string.substring(0, string.length() - 1));
        return new fjv_1(d2);
    }

    public double a() {
        return this.b;
    }

    public void a(double d2) {
        this.b = d2;
    }

    public boolean a(fjv_1 fjv_12) {
        return fjv_12 != null && fjv_12.b == this.b;
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            a.error((Object)"CloneNotSupportedException during clone", (Throwable)cloneNotSupportedException);
            return null;
        }
    }
}

