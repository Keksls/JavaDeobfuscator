/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GLDrawable
 *  com.jogamp.opengl.glu.GLU
 *  com.jogamp.opengl.glu.GLUquadric
 */
import com.jogamp.opengl.GLDrawable;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.glu.GLUquadric;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from fDN
 */
public class fdn_2 {
    private static final fdn_2 a = new fdn_2();
    private final GLU b = new GLU();
    private final GLUquadric c = this.b.gluNewQuadric();
    private int d;
    private int e;
    private final Point f = new Point();
    private azt_1 g;
    private final List<azt_1> h = new ArrayList<azt_1>();

    public static fdn_2 a() {
        return a;
    }

    private fdn_2() {
    }

    public void a(GLDrawable gLDrawable) {
        this.d = gLDrawable.getSurfaceWidth();
        this.e = gLDrawable.getSurfaceHeight();
    }

    public final Point b() {
        return this.f;
    }

    public azt_1 c() {
        return this.g;
    }

    public void a(azt_1 azt_12) {
        if (!this.h.isEmpty()) {
            azt_1 azt_13 = this.h.get(this.h.size() - 1);
            if (azt_13.d(azt_12)) {
                azt_12.a(azt_13, azt_12);
            } else {
                azt_12.b(0, 0, 0, 0);
            }
        }
        this.h.add(azt_12);
        this.g = azt_12;
    }

    public void d() {
        if (!this.h.isEmpty()) {
            this.h.remove(this.h.size() - 1).release();
            this.g = this.e();
        }
    }

    public azt_1 e() {
        if (!this.h.isEmpty()) {
            return this.h.get(this.h.size() - 1);
        }
        return null;
    }

    public void a(int n, int n2) {
        this.d = n;
        this.e = n2;
        this.g = azt_1.a(0, 0, n, n2);
        this.f.setLocation(-n / 2, -n2 / 2);
    }

    public fjf_2 f() {
        return new fjf_2(this.d, this.e);
    }
}

