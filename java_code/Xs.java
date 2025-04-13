/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class Xs
implements adx_1<Xr> {
    private final Logger a = Logger.getLogger(Xs.class);

    @Override
    public boolean a(Xr xr) {
        Runnable runnable = xr.b();
        if (runnable == null) {
            this.a.error((Object)("Missing runnable inside " + Xr.class));
            return false;
        }
        try {
            runnable.run();
        }
        catch (Exception exception) {
            this.a.error((Object)("Following exception occured with following runnable " + runnable.getClass() + " inside " + Xr.class), (Throwable)exception);
        }
        return false;
    }

    @Override
    public int a() {
        return 398;
    }
}

