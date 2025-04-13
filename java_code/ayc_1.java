/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.util.FPSAnimator
 */
import com.jogamp.opengl.util.FPSAnimator;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * Renamed from ayc
 */
class ayc_1
extends WindowAdapter {
    final /* synthetic */ FPSAnimator a;
    final /* synthetic */ aya_1 b;

    ayc_1(aya_1 aya_12, FPSAnimator fPSAnimator) {
        this.b = aya_12;
        this.a = fPSAnimator;
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        new Thread(new ayd_2(this)).start();
    }
}

