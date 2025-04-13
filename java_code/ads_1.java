/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.Threading
 */
import com.jogamp.opengl.Threading;

/*
 * Renamed from aDs
 */
class ads_1
implements Runnable {
    final /* synthetic */ Runnable a;

    ads_1(Runnable runnable) {
        this.a = runnable;
    }

    @Override
    public void run() {
        Threading.invokeOnOpenGLThread((boolean)false, (Runnable)this.a);
    }
}

