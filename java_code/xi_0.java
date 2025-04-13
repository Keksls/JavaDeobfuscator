/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from XI
 */
public abstract class xi_0 {
    protected static final Logger a = Logger.getLogger(xi_0.class);
    private static xi_0 b;

    protected xi_0() {
        b = this;
    }

    public static boolean a(byte[] byArray) {
        if (b != null) {
            return b.b(byArray);
        }
        a.error((Object)"Le v\u00e9rificateur de version n'a pas \u00e9t\u00e9 d\u00e9finit");
        return false;
    }

    public static byte[] a() {
        if (b != null) {
            return b.b();
        }
        a.error((Object)"Le v\u00e9rificateur de version n'a pas \u00e9t\u00e9 d\u00e9finit");
        return new byte[0];
    }

    protected abstract boolean b(byte[] var1);

    protected abstract byte[] b();
}

