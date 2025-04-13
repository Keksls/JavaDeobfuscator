/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GLAnimatorControl
 *  com.jogamp.opengl.GLAutoDrawable
 *  com.jogamp.opengl.GLCapabilities
 *  com.jogamp.opengl.GLCapabilitiesImmutable
 *  com.jogamp.opengl.GLProfile
 *  com.jogamp.opengl.awt.GLCanvas
 *  com.jogamp.opengl.util.Animator
 */
import com.jogamp.opengl.GLAnimatorControl;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLCapabilitiesImmutable;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.Animator;
import java.awt.event.InputMethodListener;
import java.awt.im.InputMethodRequests;

public class ajg
extends GLCanvas {
    private InputMethodRequests a;
    private azu_2 b;
    private final Animator c = new Animator((GLAutoDrawable)this);

    private static GLCapabilities a(ajq_0 ajq_02) {
        GLCapabilities gLCapabilities = new GLCapabilities(GLProfile.getDefault());
        gLCapabilities.setHardwareAccelerated(true);
        gLCapabilities.setDoubleBuffered(ajq_02.a);
        gLCapabilities.setSampleBuffers(false);
        gLCapabilities.setDepthBits(ajq_02.c);
        gLCapabilities.setStencilBits(ajq_02.d);
        switch (ajq_02.b) {
            case 16: {
                gLCapabilities.setRedBits(4);
                gLCapabilities.setGreenBits(4);
                gLCapabilities.setBlueBits(4);
                gLCapabilities.setAlphaBits(4);
                break;
            }
            case 32: {
                gLCapabilities.setAlphaBits(8);
            }
            case 24: {
                gLCapabilities.setRedBits(8);
                gLCapabilities.setGreenBits(8);
                gLCapabilities.setBlueBits(8);
            }
        }
        return gLCapabilities;
    }

    public ajg(ajq_0 ajq_02) {
        super((GLCapabilitiesImmutable)ajg.a(ajq_02));
    }

    public Animator a() {
        return this.c;
    }

    public azu_2 b() {
        return this.b;
    }

    public void a(azu_2 azu_22) {
        if (azu_22 != this.b && azu_22 != null) {
            if (this.b != null) {
                this.removeGLEventListener(this.b);
                this.removeMouseListener(this.b);
                this.removeMouseMotionListener(this.b);
                this.removeKeyListener(this.b);
                this.removeFocusListener(this.b);
            }
            this.b = azu_22;
            this.addGLEventListener(this.b);
            this.addMouseListener(this.b);
            this.addMouseMotionListener(this.b);
            this.addMouseWheelListener(this.b);
            this.addKeyListener(this.b);
            this.addFocusListener(this.b);
        }
    }

    public synchronized void addInputMethodListener(InputMethodListener inputMethodListener) {
        super.addInputMethodListener(inputMethodListener);
        this.enableInputMethods(true);
    }

    public synchronized void removeInputMethodListener(InputMethodListener inputMethodListener) {
        super.removeInputMethodListener(inputMethodListener);
        this.enableInputMethods(false);
    }

    public InputMethodRequests c() {
        return this.a;
    }

    public void a(InputMethodRequests inputMethodRequests) {
        this.a = inputMethodRequests;
    }

    public InputMethodRequests getInputMethodRequests() {
        return this.a;
    }

    public /* synthetic */ GLAnimatorControl getAnimator() {
        return this.a();
    }
}

