/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.IOException;
import org.apache.log4j.Logger;

/*
 * Renamed from azK
 */
public abstract class azk_1 {
    private static final Logger a = Logger.getLogger(azk_1.class);
    protected byte[] b;

    public afe_1 a(String string) {
        string = string.replace('\\', '/');
        try {
            return this.a(gg_0.a(string, this.a()));
        }
        catch (IOException iOException) {
            a.error((Object)("Erreur au chargement de l'image " + string), (Throwable)iOException);
            return null;
        }
    }

    public afe_1 a(byte[] byArray) {
        try {
            return this.b(arf_1.a(byArray));
        }
        catch (IOException iOException) {
            a.error((Object)"Erreur au chargement de l'image", (Throwable)iOException);
            return null;
        }
    }

    public azk_2 b(String string) {
        string = string.replace('\\', '/');
        try {
            return this.b(gg_0.b(string));
        }
        catch (IOException iOException) {
            a.error((Object)("Erreur au chargement de l'image " + string), (Throwable)iOException);
        }
        catch (ClassCastException classCastException) {
            a.error((Object)("Erreur au chargement de l'image " + string), (Throwable)classCastException);
        }
        return null;
    }

    public final azk_2 b(byte[] byArray) {
        try {
            return this.a(arf_1.a(byArray));
        }
        catch (IOException iOException) {
            a.error((Object)"Erreur au chargement de l'image", (Throwable)iOException);
        }
        catch (ClassCastException classCastException) {
            a.error((Object)"Erreur au chargement de l'image", (Throwable)classCastException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            a.error((Object)"Erreur au chargement de l'image", (Throwable)illegalArgumentException);
        }
        return null;
    }

    protected abstract azk_2 a(arf_1 var1);

    protected abstract afe_1 b(arf_1 var1);

    protected abstract int a();

    public final byte[] b() {
        return this.b;
    }

    protected final byte[] a(arf_1 arf_12, int n, int n2, int n3) {
        int n4 = azk_1.a(n, n3);
        int n5 = (n4 + 3) / 4 * 4;
        int n6 = n5 - n4;
        byte[] byArray = new byte[n2 * n4];
        for (int k = byArray.length - n4; k >= 0; k -= n4) {
            if (arf_12.a(byArray, k, n4) != n4) {
                a.error((Object)"read error");
            }
            if (arf_12.e(n6) == n6) continue;
            a.error((Object)"skip error");
        }
        return byArray;
    }

    protected final byte[] b(arf_1 arf_12, int n, int n2, int n3) {
        int n4 = azk_1.a(n, n3);
        byte[] byArray = new byte[n2 * n4];
        for (int k = byArray.length - n4; k >= 0; k -= n4) {
            if (arf_12.a(byArray, k, n4) == n4) continue;
            a.error((Object)"read error");
        }
        return byArray;
    }

    protected final byte[] a(int n, int n2, int n3, int n4) {
        assert (this.b != null);
        int n5 = azk_1.a(n, n3);
        int n6 = (n5 + 3) / 4 * 4;
        byte[] byArray = new byte[n2 * n5];
        int n7 = n4 + n6 * (n2 - 1);
        for (int k = 0; k < byArray.length; k += n5) {
            System.arraycopy(this.b, n7, byArray, k, n5);
            n7 -= n6;
        }
        return byArray;
    }

    protected final byte[] b(int n, int n2, int n3, int n4) {
        assert (this.b != null);
        int n5 = azk_1.a(n, n3);
        byte[] byArray = new byte[n2 * n5];
        int n6 = n4 + n5 * (n2 - 1);
        for (int k = 0; k < byArray.length; k += n5) {
            System.arraycopy(this.b, n6, byArray, k, n5);
            n6 -= n5;
        }
        return byArray;
    }

    protected static float a(int n) {
        return (float)n / 8.0f;
    }

    protected static int a(int n, int n2) {
        return (int)((float)n * azk_1.a(n2));
    }
}

