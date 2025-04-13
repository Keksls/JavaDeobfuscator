/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 *  com.jogamp.opengl.GLAutoDrawable
 */
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

/*
 * Renamed from azY
 */
public class azy_2
implements aac_2 {
    public static final int A = 1320;
    public static final int B = 950;
    private static final int a = 1965;
    private static final int b = 1148;
    private final aad_2 c = new aad_2(0, 0, 0, 0);
    protected GLAutoDrawable C;
    protected float D;
    protected float E;
    protected float F = 1.0f;
    protected float G = 1.0f;
    protected boolean H;
    private boolean d;

    public azy_2() {
        this.k(false);
    }

    public final aad_2 D() {
        return this.c;
    }

    public float E() {
        return this.D;
    }

    public float F() {
        return this.E;
    }

    @Override
    public void a(int n, int n2) {
        this.D = n;
        this.E = n2;
        this.c.a(0, 0, n, n2);
        float f2 = (n < 1320 ? (float)n / 1320.0f : 1.0f) * this.G;
        float f3 = (n2 < 950 ? (float)n2 / 950.0f : 1.0f) * this.G;
        this.j(Math.min(f2, f3));
    }

    public void j(float f2) {
        this.F = f2;
    }

    public float G() {
        return this.F;
    }

    public boolean H() {
        return this.F != 1.0f && this.G != 1.0f;
    }

    public float I() {
        return this.G;
    }

    @Override
    public void a(GLAutoDrawable gLAutoDrawable) {
        this.C = gLAutoDrawable;
        this.a(gLAutoDrawable.getSurfaceWidth(), gLAutoDrawable.getSurfaceHeight());
    }

    @Override
    public void a(int n) {
    }

    @Override
    public void b(GL2 gL2) {
    }

    public void e() {
        this.j(false);
        this.H = true;
    }

    public boolean J() {
        return this.d;
    }

    public void j(boolean bl) {
        this.d = bl;
    }

    public void k(boolean bl) {
        this.H = bl;
    }

    public boolean K() {
        return this.H;
    }

    public void L() {
        if (!this.J()) {
            this.j(true);
            this.H = true;
        }
    }

    public void M() {
        if (this.J()) {
            this.e();
        }
    }
}

