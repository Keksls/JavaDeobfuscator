/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.json.JSONException
 */
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.Future;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/*
 * Renamed from asY
 */
class asy_1
extends Thread
implements asu_1 {
    private static final Logger b = Logger.getLogger(asy_1.class);
    final atb_1 c;
    @NotNull
    private final URL d;
    @NotNull
    private final File e;
    @NotNull
    final aiq_1 f;
    private final ArrayList<ast_1> g = new ArrayList();

    asy_1(@NotNull URL uRL, @NotNull File file, atb_1 atb_12) {
        this.setDaemon(true);
        this.d = uRL;
        this.e = file;
        this.c = atb_12;
        this.f = new aiq_1("News-Downloader");
    }

    @Override
    public void run() {
        asm_1 asm_12;
        String string;
        aic_2 aic_22 = new aic_2(this.d);
        Future<ait_1> future = this.f.a(aic_22);
        try {
            future.get();
        }
        catch (Exception exception) {
            b.error((Object)"Error while downloading news stream", (Throwable)exception);
            this.f.b();
            if (this.c != null) {
                this.c.a(null);
            }
            return;
        }
        if (aic_22.c() != aiv_1.c) {
            b.error((Object)("Error while downloading news stream, bad state" + aic_22));
            if (this.c != null) {
                this.c.a(null);
            }
            this.f.b();
            return;
        }
        try {
            string = aic_22.h();
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            b.error((Object)"Error while parsing news stream : bad encoding", (Throwable)unsupportedEncodingException);
            if (this.c != null) {
                this.c.a(null);
            }
            this.f.b();
            return;
        }
        try {
            asm_12 = asx_1.a(string, (asu_1)this);
        }
        catch (JSONException jSONException) {
            b.error((Object)"Error while parsing news stream : bad format", (Throwable)jSONException);
            if (this.c != null) {
                this.c.a(null);
            }
            this.f.b();
            return;
        }
        this.c.a(asm_12);
        if (this.g.isEmpty()) {
            if (this.c != null) {
                this.c.a();
            }
        } else {
            asm_12.a(this.g.size());
            asz_1 asz_12 = new asz_1(this, asm_12);
            for (ast_1 ast_12 : this.g) {
                this.f.a(new aiz_1(ast_12.c(), ast_12.a(), true, true), asz_12);
            }
        }
    }

    boolean a(long l) {
        return this.f.a(l);
    }

    @Override
    public ast_1 a(@Nullable URL uRL, @Nullable String string, long l) {
        int n;
        String string2;
        Object object;
        if (uRL == null) {
            return null;
        }
        String string3 = Long.toHexString(l);
        File file = null;
        if (string != null && string.length() > 0) {
            object = "";
            String string4 = uRL.getFile().toLowerCase();
            if (string4.endsWith(".jpg") || string4.endsWith(".jpeg")) {
                object = ".jpg";
            } else if (string4.endsWith(".png")) {
                object = ".png";
            }
            file = new File(this.e, string + "_" + string3 + (String)object);
            if (!this.a(file)) {
                file = null;
            }
        }
        if (file == null && !this.a(file = new File(this.e, string2 = (n = ((String)(object = new File(uRL.getFile()).getName())).lastIndexOf(".")) == -1 ? (String)object + "_" + string3 : ((String)object).substring(0, n) + "_" + string3 + ((String)object).substring(n)))) {
            b.error((Object)("Unable to get a valid local file for remote file " + uRL + " (" + string2 + ")"));
            return null;
        }
        object = new ast_1(uRL, file);
        if (!file.exists() || file.length() == 0L) {
            this.g.add((ast_1)object);
        }
        return object;
    }

    private boolean a(File file) {
        if (!file.exists()) {
            File file2 = file.getParentFile();
            if (!file2.exists()) {
                if (!file2.mkdirs()) {
                    b.error((Object)("Unable to create parent directories for local file " + file));
                    return false;
                }
            } else if (!file2.isDirectory()) {
                b.error((Object)("Unable to create file : parent directory is not a directory : " + file2));
                return false;
            }
            try {
                file.createNewFile();
            }
            catch (IOException iOException) {
                b.error((Object)("Unable to create local file " + file), (Throwable)iOException);
                return false;
            }
            file.delete();
            return true;
        }
        if (!file.isFile()) {
            b.error((Object)("Invalid local file : " + file + " is a directory"));
            return false;
        }
        return true;
    }
}

