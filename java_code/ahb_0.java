/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GLAutoDrawable
 */
import com.jogamp.opengl.GLAutoDrawable;
import javax.swing.JComponent;

/*
 * Renamed from ahb
 */
public class ahb_0
implements ahj,
azv_2 {
    private final ahc_0 a;
    private static final int b = 5;
    private static final long c = 60000000L;
    private final long[] d = new long[5];
    private int e = -1;
    private long f = 0L;

    public ahb_0() {
        this.a = new ahc_0();
    }

    private int a(int n) {
        int n2 = n % 5;
        if (n2 >= 0) {
            return n2;
        }
        return n2 + 5;
    }

    @Override
    public void a(GLAutoDrawable gLAutoDrawable) {
        long l;
        int n = this.a(++this.e);
        this.d[n] = l = System.nanoTime();
        if (l - this.f <= 60000000L) {
            return;
        }
        long l2 = l - this.d[this.a(n + 1)];
        if (l2 == 0L) {
            return;
        }
        long l3 = Math.round(1.0E9 / (double)l2 * 4.0);
        this.a.a.setText(Long.toString(l3));
        this.f = l;
    }

    @Override
    public void a(YK yK) {
        yK.e().a(this);
    }

    @Override
    public void b(YK yK) {
        yK.e().b(this);
    }

    @Override
    public JComponent a() {
        return this.a;
    }

    @Override
    public String b() {
        return "FPS Viewer";
    }

    @Override
    public void b(GLAutoDrawable gLAutoDrawable) {
    }

    @Override
    public void a(GLAutoDrawable gLAutoDrawable, int n, int n2, int n3, int n4) {
    }

    @Override
    public void a(GLAutoDrawable gLAutoDrawable, boolean bl, boolean bl2) {
    }
}

