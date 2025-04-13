/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 */
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;

/*
 * Renamed from aeF
 */
public class aef_0
extends axt_2 {
    private final boolean a;

    public aef_0(boolean bl) {
        this.a = bl;
    }

    @Override
    public void a(GL2 gL2) {
        axv_2 axv_22 = new axv_2();
        axv_22.a(true);
        axv_22.a(0);
        if (this.a) {
            axv_22.a(514, 1, 1);
        } else {
            axv_22.a(517, 1, 1);
        }
        axv_22.b(7680);
        axu_2.a().a((GL)gL2, axv_22);
    }
}

