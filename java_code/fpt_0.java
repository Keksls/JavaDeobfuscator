/*
 * Decompiled with CFR 0.152.
 */
import java.net.MalformedURLException;
import java.net.URL;

/*
 * Renamed from fpT
 */
public class fpt_0 {
    public final Class<? extends fyq> a;
    public final URL b;
    public fyq c;

    private fpt_0(Class<? extends fyq> clazz) {
        this.a = clazz;
        try {
            this.c = this.a.newInstance();
        }
        catch (InstantiationException instantiationException) {
            fpm_0.C.error((Object)"", (Throwable)instantiationException);
        }
        catch (IllegalAccessException illegalAccessException) {
            fpm_0.C.error((Object)"", (Throwable)illegalAccessException);
        }
        this.b = null;
    }

    private fpt_0(URL uRL) {
        this.a = null;
        this.b = uRL;
    }

    public static fpt_0 a(String string) {
        try {
            Class<?> clazz = Class.forName(string);
            return new fpt_0(clazz);
        }
        catch (ClassNotFoundException classNotFoundException) {
            try {
                URL uRL = gg_0.d(string);
                return new fpt_0(uRL);
            }
            catch (MalformedURLException malformedURLException) {
                fpm_0.C.error((Object)("Le chemin '" + string + "' vers le fichier de d\u00e9finition des dialog est invalide !"));
                return null;
            }
        }
    }
}

