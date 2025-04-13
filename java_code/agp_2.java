/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aGp$aGs
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  org.apache.log4j.Logger
 */
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.concurrent.TimeUnit;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import org.apache.log4j.Logger;

/*
 * Renamed from aGp
 */
public abstract class agp_2<T>
implements agt_2 {
    private static final Logger a = Logger.getLogger(agp_2.class);
    private static final int b = 60;
    private static final TimeUnit c = TimeUnit.SECONDS;
    protected final aGs e = new agq_2(this, null);
    private String d;
    private LoadingCache<String, aGs> g;
    private long h;
    private long i;
    private boolean j;

    protected agp_2(long l, boolean bl) {
        this.i = l;
        this.j = bl;
        this.a();
    }

    public abstract String c();

    public abstract FilenameFilter d();

    protected abstract aGs b(byte[] var1);

    private static byte[] a(String string) {
        byte[] byArray;
        try {
            byArray = gg_0.b(string);
        }
        catch (IOException iOException) {
            a.error((Object)"Exception during readFile", (Throwable)iOException);
            byArray = Cn.b;
        }
        return byArray;
    }

    aGs b(String string) {
        ags_2 ags_22;
        assert (this.d != null);
        assert (string != null);
        String string2 = this.d + string;
        byte[] byArray = agp_2.a(string2);
        if (byArray.length == 0) {
            a.warn((Object)("Unable to open stream for file " + string2));
            ags_22 = this.e;
        } else {
            ags_22 = this.b(byArray);
            this.h += ags_22.a();
            assert (this.h >= 0L);
        }
        return ags_22;
    }

    public final T c(String string) {
        assert (string != null);
        ags_2 ags_22 = this.j ? (ags_2)this.g.get((Object)string) : this.b(string);
        return ags_22 != null ? (T)ags_22.b() : null;
    }

    public final void a(long l) {
        this.i = l;
        this.a();
    }

    public final String e() {
        return this.d;
    }

    public final void d(String string) {
        assert (string != null);
        this.d = string;
    }

    public void f() {
        this.g.cleanUp();
    }

    public void a(long l, float f2) {
        block12: {
            this.a(l);
            assert (this.d != null);
            l = (int)((float)this.i * f2);
            try {
                URL uRL = gg_0.d(this.d);
                if (uRL.getProtocol().equals("file")) {
                    File file = new File(uRL.getPath() + File.separator);
                    String[] stringArray = file.list(this.d());
                    for (int k = 0; k < stringArray.length && this.h < l; ++k) {
                        this.g.get((Object)stringArray[k]);
                    }
                    break block12;
                }
                if (!uRL.getProtocol().equals("jar")) break block12;
                JarFile jarFile = null;
                try {
                    jarFile = new JarFile(uRL.getPath());
                    Enumeration<JarEntry> enumeration = jarFile.entries();
                    while (enumeration.hasMoreElements() && this.h < l) {
                        String string = enumeration.nextElement().getName();
                        if (!string.endsWith(this.c())) continue;
                        this.g.get((Object)string);
                    }
                }
                catch (Exception exception) {
                    a.error((Object)"Exception during preload", (Throwable)exception);
                }
                if (jarFile != null) {
                    jarFile.close();
                }
            }
            catch (Exception exception) {
                a.error((Object)("Unable to preload content of " + this.d + " from URL (try from file)"));
                try {
                    File file = new File(this.d + File.separator);
                    String[] stringArray = file.list(this.d());
                    for (int k = 0; k < stringArray.length && this.h < l; ++k) {
                        this.g.get((Object)stringArray[k]);
                    }
                }
                catch (Exception exception2) {
                    a.error((Object)"Exception during preload", (Throwable)exception2);
                }
            }
        }
        a.info((Object)("PRELOAD " + this));
    }

    public void a(boolean bl) {
        this.j = bl;
    }

    private void a() {
        this.g = CacheBuilder.newBuilder().expireAfterAccess(60L, c).maximumSize(this.i).build((CacheLoader)new agr_2(this));
    }

    @Override
    public void a(agu_2 agu_22) {
    }

    @Override
    public void e(String string) {
    }

    @Override
    public void a(String string, String string2) {
    }

    @Override
    public void f(String string) {
    }

    @Override
    public void b(agu_2 agu_22) {
    }

    public String toString() {
        return this.getClass().getSimpleName() + ": cacheSize=" + this.g.size() + "\t size=" + this.h + "octets/ " + this.i;
    }
}

