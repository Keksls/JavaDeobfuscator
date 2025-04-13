/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import org.apache.log4j.Logger;

/*
 * Renamed from aIF
 */
public class aif_2
extends aip_1 {
    protected static final Logger k = Logger.getLogger(aif_2.class);
    public static long l = 0L;
    private long n;
    public static long m = 0L;
    private String o = "";
    private aig_2 p;
    private String q;
    private int r;
    private int s;

    private String[] a(aig_2 aig_22, String string, int n) {
        this.p = aig_22;
        String[] stringArray = new String[3];
        try {
            String string2 = string.substring(0, 6);
            if (string2.compareToIgnoreCase("ftp://") == 0) {
                String[] stringArray2;
                String string3 = string.substring(6);
                String[] stringArray3 = string3.split("/");
                if (stringArray3.length == 2) {
                    stringArray[0] = stringArray3[0];
                    stringArray[1] = stringArray3[1];
                    if (stringArray3[0].contains(":")) {
                        String[] stringArray4 = stringArray3[0].split(":");
                        stringArray[0] = stringArray4[0];
                        stringArray[2] = stringArray4[1];
                    } else {
                        stringArray[2] = String.valueOf(21);
                    }
                    return stringArray;
                }
                if (n == 0) {
                    stringArray[0] = stringArray3[0];
                    if (stringArray3[0].contains(":")) {
                        String[] stringArray5 = stringArray3[0].split(":");
                        stringArray[2] = stringArray5[1];
                        stringArray[0] = stringArray5[0];
                    } else {
                        stringArray[2] = String.valueOf(21);
                    }
                    stringArray[1] = stringArray3[stringArray3.length - 1];
                    return stringArray;
                }
                for (int k = 1; k < stringArray3.length - 1; ++k) {
                    if (this.p.b(stringArray3[k])) continue;
                    aif_2.k.info((Object)("Erreur changement dans : " + string));
                    return null;
                }
                l = this.p.c(this.o);
                if (l == -1L) {
                    this.h.d(this);
                    return null;
                }
                stringArray[0] = stringArray3[0];
                if (stringArray3[0].contains(":")) {
                    stringArray2 = stringArray3[0].split(":");
                    stringArray[2] = stringArray2[1];
                    stringArray[0] = stringArray2[0];
                } else {
                    stringArray[2] = String.valueOf(21);
                }
                stringArray[1] = stringArray3[stringArray3.length - 1];
                if (stringArray3[0].contains(":")) {
                    stringArray2 = stringArray3[0].split(":");
                    stringArray[2] = stringArray2[1];
                    stringArray[0] = stringArray2[0];
                } else {
                    stringArray[2] = String.valueOf(21);
                }
                return stringArray;
            }
            k.error((Object)("Adresse ftp invalide " + string2));
            System.exit(0);
        }
        catch (Exception exception) {
            k.error((Object)("Exception dans FtpClient.acceder() : " + exception.getMessage()));
        }
        return stringArray;
    }

    @Override
    public void a(URL uRL, Properties properties, long l, long l2, long l3) {
        if (this.h != null) {
            this.h.a(this);
        }
        this.r = (int)l;
        this.s = (int)l2;
        if (!uRL.getProtocol().equals("ftp")) {
            throw new ail_2("Le chemin fourni n'est pas une adresse ftp valide");
        }
        this.n = System.currentTimeMillis();
        aig_2 aig_22 = null;
        String string = uRL.toString();
        try {
            String[] stringArray = this.a(aig_22, string, 0);
            aig_22 = new aig_2(false, 0, this);
            String string2 = stringArray[0];
            String string3 = stringArray[2];
            this.q = properties.get("outputFile").toString();
            k.info((Object)("Connection anonyme \u00e0 " + string + " pour le fichier : " + this.q));
            this.o = stringArray[1];
            if (!aig_22.a(string2, Integer.parseInt(string3))) {
                this.notify();
                this.h.d(this);
            }
            aig_22.a((int)l);
            aig_22.b((int)this.j);
            aig_22.a(this.i);
            if (aig_22.a("anonymous", "a.a@a.fr")) {
                this.a(aig_22, string, 1);
                Thread thread = new Thread((Runnable)aig_22, "FTPClient");
                thread.start();
            } else {
                k.info((Object)"Connection impossible :/.");
            }
        }
        catch (Exception exception) {
            if (exception.getMessage().contains("Espace insuffisant sur le disque")) {
                k.error((Object)"Exception dans FtpClient.start() : Espace disque insuffisant");
                this.h.e(this);
            } else {
                k.error((Object)("Exception dans FtpClient.start() : " + exception.getMessage()));
            }
            try {
                aig_22.b();
            }
            catch (NullPointerException nullPointerException) {
                k.error((Object)("Exception NEP dans FtpClient.start() : " + nullPointerException.getMessage()));
                this.h.d(this);
            }
        }
    }

    @Override
    public int n() {
        return 3;
    }

    @Override
    public long a() {
        return l;
    }

    @Override
    public long b() {
        if (this.p != null) {
            return this.p.a();
        }
        return 0L;
    }

    @Override
    public long c() {
        if (this.p != null) {
            return this.p.a();
        }
        return 0L;
    }

    @Override
    public long d() {
        return l - m;
    }

    @Override
    public long e() {
        return 0L;
    }

    @Override
    public long f() {
        return 0L;
    }

    @Override
    public long g() {
        return 0L;
    }

    @Override
    public long h() {
        return System.currentTimeMillis() - this.n;
    }

    @Override
    public void a(URL uRL, Properties properties) {
        k.error((Object)"FTPFile cannot be share");
    }

    @Override
    public void i() {
        try {
            this.p.c();
        }
        catch (IOException iOException) {
            k.error((Object)("Exception d\u00e9connection FtpClient.stop() : " + iOException.getMessage()));
        }
    }

    public boolean a(String string, String string2) {
        aig_2 aig_22 = new aig_2(false, 0, this);
        if (string != null) {
            String[] stringArray = this.a(aig_22, string + string2, 0);
            try {
                if (aig_22.a(stringArray[0], Integer.parseInt(stringArray[2]))) {
                    aig_22.a("anonymous", "a.a@msn.com");
                    String[] stringArray2 = this.a(aig_22, string + string2, 1);
                    if (stringArray2 == null) {
                        aig_22.b();
                        return false;
                    }
                    aig_22.b();
                    return true;
                }
                aig_22.b();
                return false;
            }
            catch (IOException iOException) {
                k.error((Object)"IOException during testServer", (Throwable)iOException);
                aig_22.b();
            }
        }
        aig_22.b();
        return false;
    }

    @Override
    public String j() {
        return this.q;
    }

    public String p() {
        return this.o;
    }

    public int q() {
        return this.r;
    }

    public int r() {
        return this.s;
    }

    public long s() {
        return l;
    }

    public aio_1 t() {
        return this.h;
    }
}

