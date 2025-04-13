/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  org.apache.log4j.Logger
 */
import com.jogamp.opengl.GL;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from axu
 */
public class axu_2 {
    private static final Logger b = Logger.getLogger(axu_2.class);
    private final axv_2 c = new axv_2();
    private final ArrayList<axv_2> d = new ArrayList(3);
    private static final axu_2 e = new axu_2();

    public void a(GL gL) {
        if (this.d.size() > 0) {
            this.a(gL, this.c, this.d.get(this.d.size() - 1));
            this.d.clear();
        }
        gL.glDisable(2960);
        gL.glStencilMask(-1);
        gL.glClearStencil(0);
        gL.glClear(17408);
    }

    public static axu_2 a() {
        return e;
    }

    private axu_2() {
    }

    public void a(GL gL, axv_2 axv_22) {
        int n = this.d.size();
        if (n == 0) {
            this.a(gL, axv_22, this.c);
        } else {
            this.a(gL, axv_22, this.d.get(n - 1));
        }
        this.d.add(axv_22);
    }

    public void b(GL gL) {
        this.a(gL, 1);
    }

    public void a(GL gL, int n) {
        assert (n > 0);
        int n2 = this.d.size();
        if (n2 == 0) {
            return;
        }
        axv_2 axv_22 = null;
        for (int k = 0; k < n; ++k) {
            axv_22 = this.d.remove(--n2);
        }
        assert (n2 == this.d.size());
        if (n2 == 0) {
            this.a(gL, this.c, axv_22);
        } else {
            axv_2 axv_23 = this.d.get(n2 - 1);
            this.a(gL, axv_23, axv_22);
        }
    }

    private void a(GL gL, axv_2 axv_22, axv_2 axv_23) {
        if (axv_22.a != axv_23.a) {
            gL.glStencilMask(axv_22.a);
        }
        if (axv_22.g != axv_23.g) {
            gL.glColorMask(axv_22.g, axv_22.g, axv_22.g, axv_22.g);
        }
        if (axv_22.b != axv_23.b) {
            if (axv_22.b) {
                gL.glEnable(2960);
            } else {
                gL.glDisable(2960);
            }
        }
        if (axv_22.c != axv_23.c) {
            gL.glStencilOp(axv_22.c, 7680, 7680);
        }
        if (axv_22.d != axv_23.d || axv_22.e != axv_23.e || axv_22.f != axv_23.f) {
            gL.glStencilFunc(axv_22.d, axv_22.e, axv_22.f);
        }
        gL.glFlush();
    }
}

