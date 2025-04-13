/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

/*
 * Renamed from aIA
 */
public class aia_2 {
    private static final Logger b = Logger.getLogger(aia_2.class);
    private static final int c = 0;
    public static final aia_2 a = new aia_2();
    private final HashMap<String, String> d = new HashMap();
    private String e;
    private final Object f = new Object();

    public void a(String string) {
        this.e = string;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(String string, String string2) {
        Object object = this.f;
        synchronized (object) {
            this.d.put(string, string2);
            this.b();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String b(String string) {
        Object object = this.f;
        synchronized (object) {
            return this.d.get(string);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a() {
        Object object = this.f;
        synchronized (object) {
            this.d.clear();
            try {
                arf_1 arf_12 = arf_1.a(gi_0.b(this.e));
                int n = arf_12.c();
                int n2 = arf_12.c();
                for (int k = 0; k < n2; ++k) {
                    this.d.put(arf_12.e(), arf_12.e());
                }
                arf_12.close();
            }
            catch (FileNotFoundException fileNotFoundException) {
                b.info((Object)"No cache data file");
            }
            catch (IOException iOException) {
                b.warn((Object)("Probl\u00e8me \u00e0 l'ouverture des donn\u00e9es de cache : " + iOException.getMessage()), (Throwable)iOException);
            }
            catch (RuntimeException runtimeException) {
                b.error((Object)"Runtime exception during fill of ETagMap", (Throwable)runtimeException);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b() {
        Object object = this.f;
        synchronized (object) {
            try {
                FileOutputStream fileOutputStream = gi_0.o(this.e);
                gk_0 gk_02 = new gk_0(fileOutputStream);
                gk_02.a(0);
                gk_02.a(this.d.size());
                for (Map.Entry<String, String> entry : this.d.entrySet()) {
                    gk_02.a(entry.getKey());
                    gk_02.a(entry.getValue());
                }
                gk_02.d();
                fileOutputStream.close();
            }
            catch (IOException iOException) {
                b.warn((Object)("Probl\u00e8me \u00e0 la sauvegarde des donn\u00e9es de cache :" + iOException.getMessage()));
            }
        }
    }
}

