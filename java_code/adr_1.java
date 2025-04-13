/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  com.jogamp.opengl.GLAutoDrawable
 *  com.jogamp.opengl.GLEventListener
 */
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from aDr
 */
class adr_1
implements GLEventListener {
    final /* synthetic */ add_2 a;

    adr_1(add_2 add_22) {
        this.a = add_22;
    }

    public void init(GLAutoDrawable gLAutoDrawable) {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryBuilder().setNameFormat("Worker-%d").build());
        scheduledExecutorService.scheduleWithFixedDelay(adq_1.a(adq_1.a(this.a)), 0L, 100L, TimeUnit.MILLISECONDS);
    }

    public void dispose(GLAutoDrawable gLAutoDrawable) {
    }

    public void display(GLAutoDrawable gLAutoDrawable) {
    }

    public void reshape(GLAutoDrawable gLAutoDrawable, int n, int n2, int n3, int n4) {
    }
}

