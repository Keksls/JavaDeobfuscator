/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 *  com.jogamp.opengl.GLAutoDrawable
 *  com.jogamp.opengl.GLEventListener
 *  com.jogamp.opengl.GLPipelineFactory
 *  com.jogamp.opengl.GLProfile
 *  com.jogamp.opengl.util.awt.AWTGLReadBufferUtil
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLPipelineFactory;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.util.awt.AWTGLReadBufferUtil;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.imageio.ImageIO;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from azU
 */
public class azu_2
implements GLEventListener,
FocusListener,
KeyListener,
MouseListener,
MouseMotionListener,
MouseWheelListener {
    public static final long a = 2L;
    public static final long b = 20L;
    public static boolean c = false;
    public static boolean d = false;
    public static PrintStream e = null;
    protected static final Logger f = Logger.getLogger(azu_2.class);
    private static final boolean h = ahu_2.a() == ahu_2.c;
    public static final Color g = Color.BLACK;
    private float i;
    private float j;
    private float k;
    private float l;
    private final Object m = new Object();
    private final List<aac_2> n = new ArrayList<aac_2>();
    private final Object o = new Object();
    private final List<aac_2> p = new ArrayList<aac_2>();
    private final ArrayList<aej_1> q;
    private final ArrayList<aei_1> r;
    private final ArrayList<aeh_1> s;
    private final ArrayList<azv_2> t;
    private final ArrayList<azx_2> u;
    private final HashMap<String, String> v = new HashMap();
    private boolean w;
    private boolean x = true;
    private boolean y = !this.x;
    private long z = System.nanoTime();
    private int A;
    private final float[] B = new float[180];
    private boolean C;
    private azw_2 D;
    private int E;
    private int F;
    private final List<azt_2> G = new ArrayList<azt_2>();
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private float L = 1.0f;
    private float M = 1.0f;

    public azu_2() {
        this.a(g);
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = true;
        this.y = true;
        this.u = new ArrayList();
        this.t = new ArrayList();
    }

    public void a(float f2, float f3) {
        this.L = f2;
        this.M = f3;
    }

    public void a(float ... fArray) {
        this.i = fArray[0];
        this.j = fArray[1];
        this.k = fArray[2];
        this.l = fArray[3];
    }

    public void a(Color color) {
        this.i = (float)color.getRed() / 255.0f;
        this.j = (float)color.getGreen() / 255.0f;
        this.k = (float)color.getBlue() / 255.0f;
        this.l = (float)color.getAlpha() / 255.0f;
    }

    public void a(boolean bl) {
        this.I = bl;
    }

    public void b(boolean bl) {
        this.J = bl;
    }

    public boolean a() {
        return this.K;
    }

    public void c(boolean bl) {
        this.K = bl;
    }

    private void a(GLAutoDrawable gLAutoDrawable, boolean bl) {
        GL2 gL2 = gLAutoDrawable.getGL().getGL2();
        if (this.y == bl) {
            return;
        }
        this.y = bl;
        if (this.y) {
            gLAutoDrawable.setAutoSwapBufferMode(true);
            gL2.setSwapInterval(1);
        } else {
            gLAutoDrawable.setAutoSwapBufferMode(false);
            gL2.setSwapInterval(0);
        }
        for (azx_2 azx_22 : this.u) {
            azx_22.a(bl);
        }
    }

    public void d(boolean bl) {
        this.x = bl;
        this.y = !this.x;
    }

    public final boolean b() {
        return this.y;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(aac_2 aac_22, boolean bl) {
        Object object = this.m;
        synchronized (object) {
            Object object2 = this.o;
            synchronized (object2) {
                if (this.n.contains(aac_22)) {
                    return;
                }
                if (bl) {
                    this.n.add(aac_22);
                    this.p.add(aac_22);
                } else {
                    this.n.add(0, aac_22);
                    this.p.add(0, aac_22);
                }
            }
        }
    }

    public void a(aac_2 aac_22) {
        this.n.remove(aac_22);
    }

    public void a(azv_2 azv_22) {
        if (this.t.contains(azv_22)) {
            return;
        }
        this.t.add(azv_22);
    }

    public void b(azv_2 azv_22) {
        this.t.remove(azv_22);
    }

    public void a(azx_2 azx_22) {
        if (this.u.contains(azx_22)) {
            return;
        }
        this.u.add(azx_22);
    }

    public void b(azx_2 azx_22) {
        this.u.remove(azx_22);
    }

    public void init(GLAutoDrawable gLAutoDrawable) {
        f.info((Object)"Renderer.init started");
        GL2 gL2 = gLAutoDrawable.getGL().getGL2();
        if (d) {
            gL2 = gLAutoDrawable.setGL(GLPipelineFactory.create((String)"com.jogamp.opengl.Debug", null, (GL)gL2, null)).getGL2();
        }
        if (e != null) {
            gL2 = gLAutoDrawable.setGL(GLPipelineFactory.create((String)"com.jogamp.opengl.Trace", null, (GL)gL2, (Object[])new Object[]{e})).getGL2();
        }
        avx_2 avx_22 = auj_1.a.a();
        avx_22.a(gL2);
        azr_1.a((GL)gL2);
        azr_1.a((GL)gL2, this.v);
        axr_2 axr_22 = axr_2.a();
        axr_22.b();
        gL2.glClearColor(this.i, this.j, this.k, this.l);
        axu_2.a().a((GL)gL2);
        axr_22.a((GL)gL2, 0, 0, gLAutoDrawable.getSurfaceWidth(), gLAutoDrawable.getSurfaceHeight());
        gL2.glTexParameterf(3553, 10242, 33071.0f);
        gL2.glTexParameterf(3553, 10243, 33071.0f);
        gL2.glTexParameterf(3553, 10240, 9729.0f);
        gL2.glTexParameterf(3553, 10241, 9728.0f);
        gL2.glHint(3152, 4354);
        gL2.glHint(34031, 4354);
        gL2.glHint(33170, 4354);
        gL2.glDisable(2896);
        axr_22.e(false);
        axr_22.g(false);
        axr_22.h(false);
        gL2.glAlphaFunc(517, 0.0f);
        gL2.glEnable(3008);
        gL2.glDisable(2884);
        axr_22.a(false);
        gL2.glShadeModel(7425);
        gL2.glPixelZoom(1.0f, 1.0f);
        axr_22.d(true);
        gL2.glIndexMask(0);
        gL2.glDisable(3024);
        gL2.glDrawBuffer(this.w ? 1029 : 1028);
        this.a(gLAutoDrawable, this.x);
        axr_22.a(gL2);
        for (azv_2 azv_22 : this.t) {
            azv_22.b(gLAutoDrawable);
        }
        avp_2.g();
        this.H = true;
        f.info((Object)"Renderer.init ended");
    }

    public void dispose(GLAutoDrawable gLAutoDrawable) {
    }

    public final HashMap<String, String> c() {
        return this.v;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void display(GLAutoDrawable gLAutoDrawable) {
        GL2 gL2 = gLAutoDrawable.getGL().getGL2();
        this.f();
        if (!this.H) {
            return;
        }
        try {
            int n = this.g();
            this.a(gLAutoDrawable);
            avx_2 avx_22 = auj_1.a.a();
            Object object = this.m;
            synchronized (object) {
                this.a(gLAutoDrawable, this.x);
                this.b(gLAutoDrawable);
                this.a(gL2, n);
                atf_2.a().d();
                ayv_1.a.a(n);
                ayu_2.a().a(gL2);
                this.h();
                azu_2.a(gL2);
                azu_2.a(gL2, avx_22);
                this.b(gL2);
                ayu_2.a().d();
                aud_1.a().a(avx_22);
                axd_2.a(avx_22);
                axd_2.b();
                this.i();
                this.c(gLAutoDrawable);
                ams_1.a().h();
            }
        }
        catch (Throwable throwable) {
            f.error((Object)"Throwable dans le process du renderer : ", throwable);
        }
    }

    private void f() {
        long l;
        float f2;
        if (!(this.I || this.J && !c)) {
            return;
        }
        float f3 = this.I ? 500.0f : 50.0f;
        if (f3 - (f2 = (float)((l = System.nanoTime()) - this.z) / 1000000.0f) <= 0.0f) {
            return;
        }
        try {
            Thread.sleep(Math.round(f3));
        }
        catch (InterruptedException interruptedException) {
            f.error((Object)"Cannot wait in slowed downed mode", (Throwable)interruptedException);
        }
    }

    private int g() {
        long l = System.nanoTime();
        float f2 = (float)(l - this.z) / 1000000.0f;
        int n = this.B.length;
        this.B[++this.A % n] = f2;
        float f3 = 0.0f;
        for (int k = 0; k < n; ++k) {
            f3 += this.B[k];
        }
        float f4 = f3 / (float)n;
        float f5 = f2 / f4;
        float f6 = f5 <= 2.0f ? f2 : f2 / 2.0f;
        this.z = l;
        return Math.round(f6);
    }

    private void a(GLAutoDrawable gLAutoDrawable) {
        if (this.t == null) {
            return;
        }
        int n = this.t.size();
        for (int k = 0; k < n; ++k) {
            this.t.get(k).a(gLAutoDrawable);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void b(GLAutoDrawable gLAutoDrawable) {
        Object object = this.o;
        synchronized (object) {
            int n = gLAutoDrawable.getSurfaceWidth();
            n += n % 2;
            int n2 = gLAutoDrawable.getSurfaceHeight();
            n2 += n2 % 2;
            int n3 = this.p.size();
            for (int k = 0; k < n3; ++k) {
                aac_2 aac_22 = this.p.get(k);
                aac_22.a(gLAutoDrawable);
                aac_22.a(n, n2);
            }
            this.p.clear();
        }
    }

    private void a(GL2 gL2, int n) {
        axd_2.a("process", 0.0f, 0.2f, 0.2f);
        int n2 = this.n.size();
        for (int k = 0; k < n2; ++k) {
            this.n.get(k).a(n);
        }
        axd_2.c();
    }

    private void h() {
        if (this.G.isEmpty()) {
            return;
        }
        azt_2 azt_22 = this.G.get(0);
        if (azt_22.a()) {
            return;
        }
        this.G.remove(0);
    }

    private static void a(GL2 gL2) {
        axr_2 axr_22 = axr_2.a();
        axr_22.h(false);
        axr_22.g(false);
        axr_22.a(gL2);
    }

    private static void a(GL2 gL2, avx_2 avx_22) {
        if (aui_1.a().a(avx_22)) {
            return;
        }
        axu_2.a().a((GL)gL2);
    }

    private void b(GL2 gL2) {
        axd_2.a("display", 0.0f, 0.9f, 0.9f);
        int n = this.n.size();
        for (int k = 0; k < n; ++k) {
            this.n.get(k).b(gL2);
        }
        axd_2.c();
    }

    private void i() {
        if (!this.C) {
            return;
        }
        this.j();
    }

    private void c(GLAutoDrawable gLAutoDrawable) {
        if (!this.w || this.y) {
            return;
        }
        gLAutoDrawable.swapBuffers();
    }

    public boolean a(@NotNull azw_2 azw_22) {
        if (this.C || this.D != null) {
            return false;
        }
        this.C = true;
        this.D = azw_22;
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void j() {
        if (!this.C || this.D == null) {
            return;
        }
        File file = this.D.a();
        try {
            AWTGLReadBufferUtil aWTGLReadBufferUtil = new AWTGLReadBufferUtil(GLProfile.getDefault(), true);
            avx_2 avx_22 = auj_1.a.a();
            GL2 gL2 = avx_22.e();
            BufferedImage bufferedImage = aWTGLReadBufferUtil.readPixelsToBufferedImage((GL)gL2, true);
            ImageIO.write((RenderedImage)bufferedImage, "png", file);
            this.D.b();
        }
        catch (Exception exception) {
            this.D.a(exception);
            f.error((Object)(exception.getMessage() + " Impossible d'enregistrer un ScreenShot dans " + file.getAbsolutePath()));
        }
        finally {
            this.C = false;
            this.D = null;
        }
    }

    public void reshape(GLAutoDrawable gLAutoDrawable, int n, int n2, int n3, int n4) {
        int n5 = n4 + n4 % 2;
        int n6 = n3 + n3 % 2;
        if (this.E == n6 && this.F == n5) {
            return;
        }
        this.E = n6;
        this.F = n5;
        if (gLAutoDrawable.getSurfaceWidth() != 0 && gLAutoDrawable.getSurfaceHeight() != 0) {
            for (aac_2 object : this.n) {
                object.a(n6, n5);
            }
            auj_1.a.a().a(n6, n5);
            aui_1.a().a(n6, n5);
        }
        for (azv_2 azv_22 : this.t) {
            azv_22.a(gLAutoDrawable, n, n2, n6, n5);
        }
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
        try {
            for (aei_1 aei_12 : this.r) {
                if (!aei_12.a(keyEvent)) continue;
                return;
            }
        }
        catch (Throwable throwable) {
            f.error((Object)"Erreur : ", throwable);
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        try {
            for (aei_1 aei_12 : this.r) {
                if (!aei_12.c(keyEvent)) continue;
                return;
            }
        }
        catch (Throwable throwable) {
            f.error((Object)"Erreur : ", throwable);
        }
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        try {
            for (aei_1 aei_12 : this.r) {
                if (!aei_12.b(keyEvent)) continue;
                return;
            }
        }
        catch (Throwable throwable) {
            f.error((Object)"Erreur : ", throwable);
        }
    }

    public void a(aei_1 aei_12, boolean bl) {
        if (this.r.contains(aei_12)) {
            return;
        }
        if (bl) {
            this.r.add(0, aei_12);
        } else {
            this.r.add(aei_12);
        }
    }

    public void a(aei_1 aei_12) {
        this.r.remove(aei_12);
    }

    private static MouseEvent a(MouseEvent mouseEvent) {
        if (!h) {
            return mouseEvent;
        }
        if (mouseEvent.getButton() != 1 || !mouseEvent.isControlDown()) {
            return mouseEvent;
        }
        int n = mouseEvent.getModifiersEx() ^ 0x80;
        return new MouseEvent(mouseEvent.getComponent(), mouseEvent.getID(), mouseEvent.getWhen(), n, mouseEvent.getX(), mouseEvent.getY(), mouseEvent.getClickCount(), mouseEvent.isPopupTrigger(), 3);
    }

    @NotNull
    private MouseEvent b(MouseEvent mouseEvent) {
        int n = (int)((float)mouseEvent.getX() * this.L);
        int n2 = (int)((float)mouseEvent.getY() * this.M);
        return new MouseEvent(mouseEvent.getComponent(), mouseEvent.getID(), mouseEvent.getWhen(), mouseEvent.getModifiersEx(), n, n2, mouseEvent.getClickCount(), mouseEvent.isPopupTrigger(), mouseEvent.getButton());
    }

    @NotNull
    private MouseWheelEvent a(MouseWheelEvent mouseWheelEvent) {
        int n = (int)((float)mouseWheelEvent.getX() * this.L);
        int n2 = (int)((float)mouseWheelEvent.getY() * this.M);
        return new MouseWheelEvent(mouseWheelEvent.getComponent(), mouseWheelEvent.getID(), mouseWheelEvent.getWhen(), mouseWheelEvent.getModifiersEx(), n, n2, mouseWheelEvent.getClickCount(), mouseWheelEvent.isPopupTrigger(), mouseWheelEvent.getScrollType(), mouseWheelEvent.getScrollAmount(), mouseWheelEvent.getWheelRotation());
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        try {
            MouseEvent mouseEvent2 = azu_2.a(this.b(mouseEvent));
            for (aej_1 aej_12 : this.q) {
                if (!aej_12.a(mouseEvent2)) continue;
                return;
            }
        }
        catch (Throwable throwable) {
            f.error((Object)"Erreur : ", throwable);
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        try {
            MouseEvent mouseEvent2 = azu_2.a(this.b(mouseEvent));
            for (aej_1 aej_12 : this.q) {
                if (!aej_12.b(mouseEvent2)) continue;
                return;
            }
        }
        catch (Throwable throwable) {
            f.error((Object)"Erreur : ", throwable);
        }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        try {
            MouseEvent mouseEvent2 = azu_2.a(this.b(mouseEvent));
            for (aej_1 aej_12 : this.q) {
                if (!aej_12.c(mouseEvent2)) continue;
                return;
            }
        }
        catch (Throwable throwable) {
            f.error((Object)"Erreur : ", throwable);
        }
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        try {
            MouseEvent mouseEvent2 = this.b(mouseEvent);
            for (aej_1 aej_12 : this.q) {
                if (!aej_12.d(mouseEvent2)) continue;
                return;
            }
        }
        catch (Throwable throwable) {
            f.error((Object)"Erreur : ", throwable);
        }
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        try {
            MouseEvent mouseEvent2 = this.b(mouseEvent);
            for (aej_1 aej_12 : this.q) {
                if (!aej_12.e(mouseEvent2)) continue;
                return;
            }
        }
        catch (Throwable throwable) {
            f.error((Object)"Erreur : ", throwable);
        }
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        try {
            MouseEvent mouseEvent2 = azu_2.a(this.b(mouseEvent));
            for (aej_1 aej_12 : this.q) {
                if (!aej_12.f(mouseEvent2)) continue;
                return;
            }
        }
        catch (Throwable throwable) {
            f.error((Object)"Erreur : ", throwable);
        }
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        try {
            MouseEvent mouseEvent2 = this.b(mouseEvent);
            for (aej_1 aej_12 : this.q) {
                if (!aej_12.g(mouseEvent2)) continue;
                return;
            }
        }
        catch (Throwable throwable) {
            f.error((Object)"Erreur : ", throwable);
        }
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent mouseWheelEvent) {
        try {
            MouseWheelEvent mouseWheelEvent2 = this.a(mouseWheelEvent);
            for (aej_1 aej_12 : this.q) {
                if (!aej_12.a(mouseWheelEvent2)) continue;
                return;
            }
        }
        catch (Throwable throwable) {
            f.error((Object)"Erreur : ", throwable);
        }
    }

    public void a(aej_1 aej_12, boolean bl) {
        if (this.q.contains(aej_12)) {
            return;
        }
        if (bl) {
            this.q.add(0, aej_12);
        } else {
            this.q.add(aej_12);
        }
    }

    public void a(aej_1 aej_12) {
        this.q.remove(aej_12);
    }

    public void e(boolean bl) {
        this.y = bl;
    }

    public void f(boolean bl) {
        this.w = bl;
    }

    public void a(aeh_1 aeh_12, boolean bl) {
        if (this.s.contains(aeh_12)) {
            return;
        }
        if (bl) {
            this.s.add(0, aeh_12);
        } else {
            this.s.add(aeh_12);
        }
    }

    @Override
    public void focusGained(FocusEvent focusEvent) {
        for (aeh_1 aeh_12 : this.s) {
            if (!aeh_12.a(focusEvent)) continue;
            return;
        }
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        for (aeh_1 aeh_12 : this.s) {
            if (!aeh_12.b(focusEvent)) continue;
            return;
        }
    }

    public int d() {
        return this.E;
    }

    public int e() {
        return this.F;
    }

    public void a(azt_2 azt_22) {
        this.G.add(azt_22);
    }
}

