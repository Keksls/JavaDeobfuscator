/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.log4j.Logger;

/*
 * Renamed from aZR
 */
public class azr_0 {
    private static final Logger f = Logger.getLogger(azr_0.class);
    private static final azr_0 g = new azr_0();
    public static final String a = "clientConfig";
    private String h = "clientConfig/%s";
    private String i = "clientConfig/%s/%s";
    private String j = "clientConfig/%s/%s/%s";
    private String k = "clientConfig/%s/%s/%s/%d";
    private String l = "clientConfig/%s/account.xml";
    private String m = "clientConfig/%s/%s/world.xml";
    private String n = "clientConfig/%s/%s/%s/character.xml";
    private String o = "clientConfig/%s/%s/%s/%d/instance.xml";
    public static final byte b = 1;
    public static final byte c = 2;
    public static final byte d = 3;
    public static final byte e = 4;
    private String p = null;
    private String q = null;
    private String r = null;
    private long s = -1L;
    private final Properties t = new Properties();
    private final Properties u = new Properties();
    private final Properties v = new Properties();
    private final Properties w = new Properties();

    private azr_0() {
        Object object = System.getProperty("preferenceStorePath");
        object = Cz.f((String)object) ? "" : (String)object + "/";
        File file = new File((String)object + a);
        if (!file.exists()) {
            file.mkdir();
        }
        this.h = (String)object + "clientConfig/%s";
        this.i = this.h + "/%s";
        this.j = this.i + "/%s";
        this.k = this.j + "/%d";
        this.l = this.h + "/account.xml";
        this.m = this.i + "/world.xml";
        this.n = this.j + "/character.xml";
        this.o = this.k + "/instance.xml";
    }

    public static azr_0 a() {
        return g;
    }

    public void a(String string) {
        if (this.p == string || string != null && string.equals(this.p) || this.p != null && this.p.equals(string)) {
            return;
        }
        if (this.p != null) {
            this.c();
        }
        this.p = string;
        if (this.p != null) {
            this.b();
        } else {
            this.t.clear();
        }
    }

    public void b(String string) {
        if (this.q == string || string != null && string.equals(this.q) || this.q != null && this.q.equals(string)) {
            return;
        }
        if (this.q != null) {
            this.e();
        }
        this.q = string;
        if (this.q != null) {
            this.d();
        } else {
            this.u.clear();
        }
    }

    public void c(String string) {
        if (this.r == string || string != null && string.equals(this.r) || this.r != null && this.r.equals(string)) {
            return;
        }
        if (this.r != null) {
            this.g();
        }
        this.r = string;
        if (this.r != null) {
            this.f();
        } else {
            this.v.clear();
        }
    }

    public void a(long l) {
        if (this.s == l) {
            return;
        }
        if (this.s != -1L) {
            this.i();
        }
        this.s = l;
        if (this.s != -1L) {
            this.h();
        } else {
            this.w.clear();
        }
    }

    private void a(Properties properties, String string, String string2) {
        File file = new File(string);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (!(file = new File(string2)).exists()) {
            try {
                file.createNewFile();
            }
            catch (IOException iOException) {
                f.warn((Object)("impossible de cr\u00e9er le fichier de compte " + string2 + " : " + iOException.getMessage()));
            }
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(string2);
            properties.load(fileInputStream);
            ((InputStream)fileInputStream).close();
        }
        catch (IOException iOException) {
            f.warn((Object)("Impossible de charger le fichier de propri\u00e9t\u00e9s de compte " + string2));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(Properties properties, String string) {
        if (string == null) {
            f.warn((Object)"Impossible de sauver les propri\u00e9t\u00e9s d'un fichier inconnu");
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(string);
            properties.store(fileOutputStream, null);
        }
        catch (IOException iOException) {
            f.warn((Object)("Probl\u00e8me \u00e0 l'enregistrement du fichier " + string));
        }
        finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                }
                catch (IOException iOException) {
                    f.warn((Object)("Probl\u00e8me \u00e0 la fermeture du fichier de propri\u00e9t\u00e9s " + string));
                }
            }
        }
    }

    private void o() {
        if (this.p == null) {
            return;
        }
        this.c();
        if (this.q == null) {
            return;
        }
        this.e();
        if (this.r == null) {
            return;
        }
        this.g();
        if (this.s == -1L) {
            return;
        }
        this.i();
    }

    public void b() {
        if (this.p == null) {
            return;
        }
        this.a(this.t, this.j(), String.format(this.l, this.p));
        this.d();
    }

    public void c() {
        if (this.p != null) {
            this.a(this.t, String.format(this.l, this.p));
        }
    }

    public void d() {
        if (this.p != null && this.q != null) {
            this.a(this.u, this.k(), String.format(this.m, this.p, this.q));
            this.f();
        }
    }

    public void e() {
        if (this.p != null && this.q != null) {
            this.a(this.u, String.format(this.m, this.p, this.q));
        }
    }

    public void f() {
        if (this.p != null && this.q != null && this.r != null) {
            this.a(this.v, this.l(), String.format(this.n, this.p, this.q, this.r));
            this.h();
        }
    }

    public void g() {
        if (this.p != null && this.q != null && this.r != null) {
            this.a(this.v, String.format(this.n, this.p, this.q, this.r));
        }
    }

    public void h() {
        if (this.p != null && this.q != null && this.r != null && this.s != -1L) {
            this.a(this.w, this.m(), String.format(this.o, this.p, this.q, this.r, this.s));
        }
    }

    public void i() {
        if (this.p != null && this.q != null && this.r != null && this.s != -1L) {
            this.a(this.w, String.format(this.o, this.p, this.q, this.r, this.s));
        }
    }

    public String j() {
        return String.format(this.h, this.p);
    }

    public String k() {
        return String.format(this.i, this.p, this.q);
    }

    public String l() {
        return String.format(this.j, this.p, this.q, this.r);
    }

    public String m() {
        return this.b(this.s);
    }

    public String b(long l) {
        return String.format(this.k, this.p, this.q, this.r, l);
    }

    public String n() {
        return this.q;
    }

    private Properties a(byte by) {
        switch (by) {
            case 1: {
                return this.t;
            }
            case 2: {
                return this.u;
            }
            case 3: {
                return this.v;
            }
            case 4: {
                return this.w;
            }
        }
        f.warn((Object)("Domaine invalide : " + by));
        return null;
    }

    public void a(byte by, String string, String string2) {
        Properties properties = this.a(by);
        if (properties == null) {
            return;
        }
        properties.setProperty(string, string2);
        this.o();
    }

    public void a(byte by, String string, byte by2) {
        this.a(by, string, String.valueOf(by2));
    }

    public void a(byte by, String string, int n) {
        this.a(by, string, String.valueOf(n));
    }

    public void a(byte by, String string, short s2) {
        this.a(by, string, String.valueOf(s2));
    }

    public void a(byte by, String string, float f2) {
        this.a(by, string, String.valueOf(f2));
    }

    public void a(byte by, String string, double d2) {
        this.a(by, string, String.valueOf(d2));
    }

    public void a(byte by, String string, long l) {
        this.a(by, string, String.valueOf(l));
    }

    public void a(byte by, String string, boolean bl) {
        this.a(by, string, String.valueOf(bl));
    }

    public String a(byte by, String string) {
        Properties properties = this.a(by);
        if (properties == null) {
            return null;
        }
        return properties.getProperty(string);
    }

    public boolean b(byte by, String string) {
        return Co.a(this.a(by, string));
    }

    public byte c(byte by, String string) {
        return Co.g(this.a(by, string));
    }

    public short d(byte by, String string) {
        return Co.h(this.a(by, string));
    }

    public int e(byte by, String string) {
        return Co.c(this.a(by, string));
    }

    public long f(byte by, String string) {
        return Co.f(this.a(by, string));
    }

    public float g(byte by, String string) {
        return Co.e(this.a(by, string));
    }

    public double h(byte by, String string) {
        return Co.d(this.a(by, string));
    }

    public boolean i(byte by, String string) {
        Properties properties = this.a(by);
        return properties != null && properties.containsKey(string);
    }

    public void j(byte by, String string) {
        Properties properties = this.a(by);
        if (properties == null) {
            return;
        }
        properties.remove(string);
    }
}

