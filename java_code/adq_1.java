/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GLAutoDrawable
 *  com.jogamp.opengl.GLEventListener
 *  org.jetbrains.annotations.NotNull
 */
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aDq
 */
public final class adq_1 {
    public static void a(add_2 add_22, GLAutoDrawable gLAutoDrawable) {
        if (add_22.h()) {
            return;
        }
        gLAutoDrawable.addGLEventListener((GLEventListener)new adr_1(add_22));
    }

    @NotNull
    static Runnable a(add_2 add_22) {
        return add_22.a();
    }

    @NotNull
    static Runnable a(Runnable runnable) {
        return new ads_1(runnable);
    }
}

