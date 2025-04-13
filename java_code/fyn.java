/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  org.apache.log4j.Logger
 */
import com.google.common.base.Strings;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.log4j.Logger;

public class fyn
implements fzd<ays_2> {
    private static final Logger a = Logger.getLogger(fyn.class);
    private final Class<ays_2> b = ays_2.class;
    private boolean c = false;

    public ays_2 a(String string) {
        return this.a(this.b, string);
    }

    public ays_2 a(Class<? extends ays_2> clazz, String string) {
        return this.a(clazz, string, null);
    }

    public ays_2 a(Class<? extends ays_2> clazz, String string, fyy_0 fyy_02) {
        if (Strings.isNullOrEmpty((String)string) || "null".equalsIgnoreCase(string) || !clazz.equals(this.b)) {
            return null;
        }
        ays_2 ays_22 = fpm_0.b().g().c(string);
        if (ays_22 != null) {
            return ays_22;
        }
        ays_22 = fdo_2.b().b(string);
        if (ays_22 != null) {
            return ays_22;
        }
        try {
            URL uRL = gg_0.d(string);
            if (!cd_0.a(uRL)) {
                a.warn((Object)("Impossible de lire l'image " + string));
                return null;
            }
            return fdo_2.b().a(uRL);
        }
        catch (MalformedURLException malformedURLException) {
            URL uRL = this.getClass().getClassLoader().getResource(string);
            if (uRL != null) {
                return fdo_2.b().a(uRL);
            }
            File file = new File(string);
            if (file.exists()) {
                try {
                    return fdo_2.b().a(file.toURI().toURL());
                }
                catch (MalformedURLException malformedURLException2) {
                    a.error((Object)"MalformedURLException during convert", (Throwable)malformedURLException2);
                }
            }
            a.error((Object)("pas de texture " + string));
            return null;
        }
    }

    @Override
    public Class<ays_2> a() {
        return this.b;
    }

    @Override
    public boolean b() {
        return this.c;
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public String a(fkr_2 fkr_22, fyw_0 fyw_02, Class<? extends ays_2> clazz, String string, fya_0 fya_02) {
        if (string == null || !clazz.equals(this.b)) {
            return "null";
        }
        StringBuilder stringBuilder = new StringBuilder();
        fkr_22.a(this.b);
        ays_2 ays_22 = fpm_0.b().g().c(string);
        if (ays_22 != null) {
            return stringBuilder.append("doc.getTexture(\"").append(string).append("\")").toString();
        }
        ays_22 = fdo_2.b().b(string);
        if (ays_22 != null) {
            fkr_22.a(fdo_2.class);
            return stringBuilder.append("TextureLoader.getInstance().loadTextureDirect(\"").append(string).append("\")").toString();
        }
        if (cd_0.b(string)) {
            String string2 = fkr_22.b();
            fkr_22.a(MalformedURLException.class);
            fkr_22.a(fdo_2.class);
            fkr_22.a(new fkw_1(this.b, string2, "null"));
            fkr_22.a(new fkz_1("try {"));
            fkr_22.a(new fkz_1("\tURL url = ContentFileHelper.getURL(\"" + string + "\""));
            fkr_22.a(new fkw_1(null, string2, "TextureLoader.getInstance().loadTexture(url)", true));
            fkr_22.a(new fkz_1("} catch (MalformedURLException e) {}"));
            return string2;
        }
        URL uRL = this.getClass().getClassLoader().getResource(string);
        if (uRL != null) {
            fkr_22.a(fdo_2.class);
            String string3 = fkr_22.b();
            fkr_22.a(new fkw_1(this.b, string3, "null"));
            fkr_22.a(new fkz_1("{"));
            fkr_22.a(new fkz_1("\tURL url = getClass().getClassLoader().getResource(\"" + string + "\""));
            fkr_22.a(new fkw_1(null, string3, "TextureLoader.getInstance().loadTexture(url)", true));
            fkr_22.a(new fkz_1("}"));
            return string3;
        }
        File file = new File(string);
        if (file.exists()) {
            try {
                fkr_22.a(fdo_2.class);
                fkr_22.a(File.class);
                fkr_22.a(MalformedURLException.class);
                fdo_2.b().a(file.toURI().toURL());
                String string4 = fkr_22.b();
                fkr_22.a(new fkw_1(this.b, string4, "null"));
                fkr_22.a(new fkz_1("try {"));
                fkr_22.a(new fkz_1("\tFile f = new File(\"" + string + "\""));
                fkr_22.a(new fkw_1(null, string4, "TextureLoader.getInstance().loadTexture(f.toURI().toURL())", true));
                fkr_22.a(new fkz_1("} catch (MalformedURLException e) {}"));
                return string4;
            }
            catch (MalformedURLException malformedURLException) {
                a.error((Object)"MalformedURLException during toJavaCommandLine", (Throwable)malformedURLException);
            }
        }
        a.error((Object)("pas de texture " + string));
        return "null";
    }

    @Override
    public /* synthetic */ Object b(String string) {
        return this.a(string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string) {
        return this.a(clazz, string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string, fyy_0 fyy_02) {
        return this.a(clazz, string, fyy_02);
    }
}

