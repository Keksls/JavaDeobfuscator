/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.glu.GLU
 *  com.jogamp.opengl.glu.GLUquadric
 */
import com.jogamp.opengl.GL;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.glu.GLUquadric;

/*
 * Renamed from axo
 */
public final class axo_2
extends axq_2 {
    private boolean a = false;
    private int b;
    private int c;
    private int d;
    private int e;
    private static final GLU f = new GLU();
    private GLUquadric g = f.gluNewQuadric();

    public final void a(boolean bl) {
        this.a = bl;
    }

    public final boolean a() {
        return this.a;
    }

    public final void a(int n, int n2, int n3, int n4) {
        if (this.b == n && this.c == n2 && this.d == n3 && this.e == n4) {
            return;
        }
        this.b = n;
        this.c = n2;
        this.d = n3 < 0 ? 0 : n3;
        this.e = n4 < 0 ? 0 : n4;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    @Override
    public final void a(GL gL) {
    }

    @Override
    public axs_2 f() {
        return null;
    }
}

