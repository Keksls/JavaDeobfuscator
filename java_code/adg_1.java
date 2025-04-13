/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GLException
 *  com.jogamp.opengl.Threading
 *  org.apache.log4j.Logger
 */
import com.jogamp.opengl.GLException;
import com.jogamp.opengl.Threading;
import org.apache.log4j.Logger;

/*
 * Renamed from aDG
 */
class adg_1
implements Runnable {
    private static final Logger a = Logger.getLogger(adg_1.class);
    private final Runnable b;

    adg_1(Runnable runnable) {
        this.b = runnable;
    }

    @Override
    public void run() {
        try {
            if (!Threading.isOpenGLThread()) {
                Threading.invokeOnOpenGLThread((boolean)false, (Runnable)this);
                return;
            }
        }
        catch (GLException gLException) {
            Threading.invokeOnOpenGLThread((boolean)false, (Runnable)this);
            a.error((Object)"Exception lev\u00e9e", (Throwable)gLException);
        }
        catch (Throwable throwable) {
            Threading.invokeOnOpenGLThread((boolean)false, (Runnable)this);
            a.error((Object)"Exception lev\u00e9e", throwable);
            return;
        }
        axd_2.a("Worker", 1.0f, 0.0f, 0.0f);
        this.b.run();
        axd_2.c();
    }

    public String toString() {
        return "WorkerOGLRunner{m_runner=" + this.b + "}";
    }
}

