/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.File;
import java.io.IOException;
import java.net.URL;
import org.apache.log4j.Logger;

/*
 * Renamed from atc
 */
public class atc_1
implements atb_1 {
    private static final Logger b = Logger.getLogger(atc_1.class);
    public static final atc_1 a = new atc_1();
    private asy_1 c = null;
    private final URL d = null;
    private final File e = null;
    private atd_1 f = atd_1.a;
    private asm_1 g = null;

    private atc_1() {
    }

    public atd_1 a(URL uRL, String string) {
        File file;
        if (this.c != null && this.c.isAlive()) {
            b.error((Object)"News are already downloading (thread still running)");
            this.f = atd_1.d;
            return this.f;
        }
        try {
            file = new File(string).getCanonicalFile();
        }
        catch (IOException iOException) {
            b.error((Object)("Invalid news cached directory : " + new File(string)), (Throwable)iOException);
            this.f = atd_1.d;
            return this.f;
        }
        if (uRL == this.d && this.e == file) {
            return this.f;
        }
        if (!this.a(uRL, file)) {
            this.f = atd_1.d;
            return this.f;
        }
        this.c = new asy_1(uRL, file, this);
        this.f = atd_1.b;
        this.c.start();
        return this.f;
    }

    public atd_1 b() {
        return this.f;
    }

    public boolean a(long l) {
        if (this.f == atd_1.c || this.f == atd_1.b) {
            return this.c.a(l);
        }
        return false;
    }

    @Override
    public void a(asm_1 asm_12) {
        if (asm_12 != null) {
            this.g = asm_12;
            this.f = atd_1.c;
        } else {
            this.f = atd_1.d;
            this.c = null;
        }
    }

    @Override
    public void a() {
        if (this.f != atd_1.c) {
            b.error((Object)"We receive an 'images loaded' event, but we are not expecting it");
        }
        this.f = atd_1.e;
    }

    private boolean a(URL uRL, File file) {
        if (uRL == null || file == null) {
            b.error((Object)"No News URL or no cache directory : NewsManager not succesfully initialized");
            return false;
        }
        if (!file.exists()) {
            if (!file.mkdirs()) {
                b.error((Object)("Unable to create news cache directory : " + file));
                return false;
            }
        } else if (!file.isDirectory()) {
            b.error((Object)("Unable to create news cache directory : " + file + " : a file with this name already exists"));
            return false;
        }
        return true;
    }

    public asm_1 c() {
        return this.g;
    }
}

