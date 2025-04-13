/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aIw
 */
class aiw_1
implements Callable<ait_1> {
    private static final Logger b = Logger.getLogger(aiw_1.class);
    public static final int a = 1024;
    private static final String c = "Wakfu/1.x";
    @NotNull
    private final ait_1 d;

    aiw_1(@NotNull ait_1 ait_12) {
        this.d = ait_12;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ait_1 a() {
        BufferedInputStream bufferedInputStream;
        Object object;
        OutputStream outputStream;
        if (this.d.b()) {
            this.d.a(aiv_1.c);
            return this.d;
        }
        b.debug((Object)("Downloading " + this.d));
        this.d.a(aiv_1.b);
        try {
            outputStream = this.d.d();
        }
        catch (IOException iOException) {
            b.error((Object)("Unable to create outputStream for download " + this.d), (Throwable)iOException);
            this.d.a(aiv_1.d);
            return this.d;
        }
        try {
            URL uRL = this.d.e();
            object = this.a(uRL);
            bufferedInputStream = new BufferedInputStream(((URLConnection)object).getInputStream(), 8192);
        }
        catch (FileNotFoundException fileNotFoundException) {
            b.error((Object)("Unable to download " + this.d + " : file not found (404)"));
            this.d.a(false);
            this.d.a(aiv_1.d);
            return this.d;
        }
        catch (IOException iOException) {
            b.error((Object)("Unable to open url connection for " + this.d), (Throwable)iOException);
            this.d.a(false);
            this.d.a(aiv_1.d);
            return this.d;
        }
        try {
            int n;
            object = new byte[1024];
            while ((n = ((InputStream)bufferedInputStream).read((byte[])object, 0, 1024)) != -1) {
                outputStream.write((byte[])object, 0, n);
            }
            if (this.d.a(true)) {
                this.d.a(aiv_1.c);
                b.debug((Object)("Download finished : " + this.d));
            } else {
                this.d.a(aiv_1.d);
                b.error((Object)("Error while closing stream for " + this.d));
            }
        }
        catch (IOException iOException) {
            b.error((Object)("Error while downloading " + this.d), (Throwable)iOException);
            this.d.a(false);
            this.d.a(aiv_1.d);
            object = this.d;
            return object;
        }
        catch (Throwable throwable) {
            b.error((Object)("Error while downloading " + this.d), throwable);
        }
        finally {
            ((InputStream)bufferedInputStream).close();
        }
        return this.d;
    }

    private HttpURLConnection a(URL uRL) {
        HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
        httpURLConnection.addRequestProperty("User-Agent", c);
        if (aiw_1.a(httpURLConnection)) {
            String string = httpURLConnection.getHeaderField("Location");
            httpURLConnection = (HttpURLConnection)new URL(string).openConnection();
            httpURLConnection.addRequestProperty("User-Agent", c);
        }
        return httpURLConnection;
    }

    private static boolean a(HttpURLConnection httpURLConnection) {
        boolean bl = false;
        int n = httpURLConnection.getResponseCode();
        if (n != 200 && (n == 302 || n == 301 || n == 303)) {
            bl = true;
        }
        return bl;
    }

    @Override
    public /* synthetic */ Object call() {
        return this.a();
    }
}

