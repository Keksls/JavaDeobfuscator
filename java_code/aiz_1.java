/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aIz
 */
public class aiz_1
extends ait_1 {
    private static final Logger a = Logger.getLogger(aiz_1.class);
    private final File b;
    private File c;
    private final boolean d;
    private OutputStream e = null;
    private final boolean f;

    public aiz_1(@NotNull URL uRL, File file, boolean bl, boolean bl2) {
        super(uRL);
        this.b = file;
        this.d = bl2;
        this.f = bl;
    }

    @Override
    OutputStream d() {
        if (this.f) {
            File file;
            try {
                File file2 = this.b.getParentFile();
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file = File.createTempFile(new File(this.e().getFile()).getName(), null, file2);
                file.deleteOnExit();
            }
            catch (IOException iOException) {
                a.error((Object)("Unable to create temporary file for " + this));
                file = null;
            }
            this.c = file == null ? this.b : file;
        } else {
            this.c = this.b;
        }
        if (this.c.exists()) {
            if (!this.d) {
                a.error((Object)("Dest file already exists for " + this));
                throw new IOException("File already exists " + this.b);
            }
        } else {
            this.c.getParentFile().mkdirs();
            this.c.createNewFile();
            if (this.c != this.b) {
                this.c.deleteOnExit();
            }
        }
        this.e = new BufferedOutputStream(new FileOutputStream(this.c, false));
        return this.e;
    }

    @Override
    boolean a(boolean bl) {
        boolean bl2;
        if (this.e == null) {
            return false;
        }
        try {
            this.e.flush();
            this.e.close();
        }
        catch (IOException iOException) {
            a.error((Object)("Error while closing stream for download " + this));
            bl = false;
        }
        finally {
            this.e = null;
        }
        if (!bl) {
            if (this.c != this.b) {
                this.c.delete();
            }
            return false;
        }
        if (this.c == this.b) {
            return true;
        }
        if (this.b.exists()) {
            if (this.d) {
                this.b.delete();
            } else {
                a.error((Object)("Dest file already exists for " + this));
                return false;
            }
        }
        if (!(bl2 = this.c.renameTo(this.b))) {
            a.error((Object)("Unable to rename temporary file " + this.c + "as file " + this.b + " for " + this));
        }
        return bl2;
    }

    public File g() {
        return this.b;
    }

    @Override
    protected String f() {
        return this.b.toString();
    }
}

