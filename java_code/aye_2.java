/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GLAutoDrawable
 *  com.jogamp.opengl.GLEventListener
 *  com.jogamp.opengl.awt.GLCanvas
 *  com.jogamp.opengl.glu.GLU
 *  com.jogamp.opengl.util.awt.TextureRenderer
 */
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.awt.TextureRenderer;
import java.awt.EventQueue;
import java.awt.Frame;

/*
 * Renamed from aye
 */
class aye_2
implements GLEventListener {
    Frame b;
    final GLCanvas c;
    final /* synthetic */ aya_1 a;

    aye_2(aya_1 aya_12, Frame frame, GLCanvas gLCanvas) {
        this.a = aya_12;
        this.b = frame;
        this.c = gLCanvas;
    }

    public void display(GLAutoDrawable gLAutoDrawable) {
        GL gL = GLU.getCurrentGL();
        gL.glClear(16640);
        if (this.a.E == null) {
            return;
        }
        TextureRenderer textureRenderer = this.a.q();
        int n = textureRenderer.getWidth();
        int n2 = textureRenderer.getHeight();
        textureRenderer.beginOrthoRendering(n, n2);
        textureRenderer.drawOrthoRect(0, 0);
        textureRenderer.endOrthoRendering();
        if (this.c.getWidth() != n || this.c.getHeight() != n2) {
            EventQueue.invokeLater(new ayf_1(this, n, n2));
        }
    }

    public void dispose(GLAutoDrawable gLAutoDrawable) {
        this.b = null;
    }

    public void init(GLAutoDrawable gLAutoDrawable) {
    }

    public void reshape(GLAutoDrawable gLAutoDrawable, int n, int n2, int n3, int n4) {
    }
}

