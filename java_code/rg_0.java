/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from Rg
 */
public abstract class rg_0 {
    private static final Logger a = Logger.getLogger(rg_0.class);
    private static int b = 1;
    private final int c = b++;
    private boolean d = false;
    private boolean e = false;

    protected abstract boolean a(String var1);

    public abstract ri_0 a();

    public int b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public void a(boolean bl) {
        this.d = bl;
    }

    public void b(boolean bl) {
        this.e = bl;
    }

    public boolean d() {
        return this.e;
    }

    public static rg_0 b(String string) {
        String[] stringArray = string.split("\\|", -1);
        if (stringArray.length % 2 != 0) {
            a.error((Object)("HMI error : Nombre de param\u00e8tres d\u00e9cod\u00e9s: " + stringArray.length + " Attendu: pair "));
            return null;
        }
        Byte by = 0;
        String string2 = "";
        boolean bl = false;
        for (int k = 0; k < stringArray.length; k += 2) {
            String string3 = stringArray[k];
            String string4 = stringArray[k + 1];
            if (string3.equals("type")) {
                by = Byte.parseByte(string4);
                continue;
            }
            if (string3.equals("data")) {
                string2 = string4;
                continue;
            }
            if (!string3.equals("broadcast")) continue;
            bl = Boolean.parseBoolean(string4);
        }
        rh_0.a();
        return rh_0.a(ri_0.a(by), string2, bl);
    }

    public String toString() {
        return "HMIAction{m_id=" + this.c + ", m_targetOnly=" + this.d + ", m_isInstant=" + this.e + "} ";
    }
}

