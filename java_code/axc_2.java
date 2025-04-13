/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
import com.jogamp.opengl.GL2;

/*
 * Renamed from axc
 */
class axc_2 {
    final String a;
    float[] b = null;
    long c;
    final axb_2 d = new axb_2();
    final axb_2 e = new axb_2();
    long f;

    axc_2(String string) {
        this.a = string;
        this.d.a(axd_2.h);
        this.e.a(axd_2.h);
    }

    public final void a() {
        this.e.a(1);
        this.c = System.nanoTime();
    }

    public final void a(long l) {
        this.d.a(l);
        this.e.a(l);
    }

    public final void b(long l) {
        this.d.a((int)(l - this.c));
    }

    public String a(String string) {
        return String.format("%15s|% 6.1f|% 6.1f|% 6.1f|% 6.1f|%3d", this.a + string, (double)this.d.b / 1000000.0 / (double)this.e.b, (double)this.d.b / 1000000.0, (double)this.d.d / 1000000.0, (double)this.d.e / 1000000.0, this.e.b);
    }

    public void a(GL2 gL2) {
        axc_2.a(gL2, this.d, this.b, 2.0E-5);
    }

    public static void a(GL2 gL2, axb_2 axb_22, float[] fArray, double d2) {
        if (fArray == null) {
            return;
        }
        gL2.glColor4fv(fArray, 0);
        gL2.glBegin(1);
        int n = (int)Math.min(axd_2.h, 500L);
        int[] nArray = axb_22.g;
        float f2 = -500.0f;
        int n2 = (int)(axd_2.h % 500L);
        for (int k = 0; k < n - 1; ++k) {
            gL2.glVertex2f((float)k * 2.0f + -500.0f, (float)((double)nArray[(k + n2) % 500] * d2) - 300.0f);
            gL2.glVertex2f((float)(k + 1) * 2.0f + -500.0f, (float)((double)nArray[(k + 1 + n2) % 500] * d2) - 300.0f);
        }
        gL2.glEnd();
    }
}

