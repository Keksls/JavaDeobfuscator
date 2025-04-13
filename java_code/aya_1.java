/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 *  com.jogamp.opengl.GLAutoDrawable
 *  com.jogamp.opengl.GLCapabilities
 *  com.jogamp.opengl.GLCapabilitiesImmutable
 *  com.jogamp.opengl.GLEventListener
 *  com.jogamp.opengl.GLProfile
 *  com.jogamp.opengl.awt.GLCanvas
 *  com.jogamp.opengl.util.FPSAnimator
 *  com.jogamp.opengl.util.awt.TextureRenderer
 *  com.jogamp.opengl.util.packrect.BackingStoreManager
 *  com.jogamp.opengl.util.packrect.Rect
 *  com.jogamp.opengl.util.packrect.RectVisitor
 *  com.jogamp.opengl.util.packrect.RectanglePacker
 *  jogamp.opengl.Debug
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLCapabilitiesImmutable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.FPSAnimator;
import com.jogamp.opengl.util.awt.TextureRenderer;
import com.jogamp.opengl.util.packrect.BackingStoreManager;
import com.jogamp.opengl.util.packrect.Rect;
import com.jogamp.opengl.util.packrect.RectVisitor;
import com.jogamp.opengl.util.packrect.RectanglePacker;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.font.LineMetrics;
import java.awt.geom.Rectangle2D;
import java.nio.Buffer;
import java.util.ArrayList;
import jogamp.opengl.Debug;

/*
 * Renamed from aya
 */
public class aya_1
extends ayf_2 {
    static final boolean r = Debug.debug((String)"jogl.debug.TextRenderer");
    private static final boolean s = false;
    private static final long t = 10000L;
    static final int a = 256;
    static final int b = 128;
    private static final int u = 1000;
    private static final float v = 0.7f;
    static final int c = 100;
    static final int d = 3;
    static final int e = 2;
    static final int f = 4;
    static final int g = 400;
    static final int h = 1200;
    static final int i = 800;
    static final int j = 4800;
    static final int k = 3200;
    static final int l = 12;
    static final int m = 8;
    final Font w;
    private final boolean x;
    private final boolean y;
    private final int z;
    private final int A;
    long B = 0L;
    axt_1 C;
    boolean D;
    RectanglePacker E;
    private boolean F;
    final aye_1 G;
    private TextureRenderer H;
    private Graphics2D I;
    private FontRenderContext J;
    final ayh_2 K;
    private int L;
    float n;
    float o;
    private Frame M;
    private boolean N;
    ayk_2 p;
    boolean O = true;
    boolean P;
    private boolean Q;
    boolean R = true;
    private final ayk_1 S;
    static final VertexBufferPCT T;
    static final float[] U;

    public aya_1(Font font, boolean bl, boolean bl2, int n, int n2) {
        this(font, bl, bl2, null, false, n, n2);
    }

    public aya_1(Font font, boolean bl, boolean bl2, aye_1 aye_12, int n, int n2) {
        this(font, bl, bl2, aye_12, false, n, n2);
    }

    public aya_1(Font font, boolean bl, boolean bl2, aye_1 aye_12, boolean bl3, int n, int n2) {
        this.w = font;
        this.x = bl;
        this.y = bl2;
        this.D = bl3;
        this.z = n;
        this.A = n2;
        this.E = new RectanglePacker((BackingStoreManager)new ayj_2(this), 256, 128);
        if (aye_12 == null) {
            aye_12 = new aym_2();
        }
        this.G = aye_12;
        this.K = new ayh_2(this);
        this.S = ayk_1.a();
    }

    public Rectangle2D d(String string) {
        return this.a((CharSequence)string);
    }

    public Rectangle2D a(CharSequence charSequence) {
        return this.b(this.G.a(charSequence, this.w, this.j()));
    }

    public FontRenderContext j() {
        if (this.J == null) {
            this.J = this.r().getFontRenderContext();
        }
        return this.J;
    }

    @Override
    public void a(int n, int n2) {
        this.a((float)(-n / 2), (float)(-n2 / 2));
    }

    @Override
    public void h() {
        this.a(0.0f, 0.0f);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5) {
        this.q().setColor(1.0f, 1.0f, 1.0f, 1.0f);
        aya_1.U[0] = f2 * f5;
        aya_1.U[1] = f3 * f5;
        aya_1.U[2] = f4 * f5;
        aya_1.U[3] = f5;
    }

    public void k() {
        this.u();
    }

    @Override
    public void g() {
        this.s();
    }

    @Override
    public void i() {
        this.s();
    }

    public void l() {
        this.E.dispose();
        this.E = null;
        this.H = null;
        this.I = null;
        this.J = null;
        if (this.M != null) {
            this.M.dispose();
        }
    }

    static Rectangle2D a(Rectangle2D rectangle2D) {
        int n = (int)Math.floor(rectangle2D.getMinX()) - 1;
        int n2 = (int)Math.floor(rectangle2D.getMinY()) - 1;
        int n3 = (int)Math.ceil(rectangle2D.getMaxX()) + 1;
        int n4 = (int)Math.ceil(rectangle2D.getMaxY()) + 1;
        return new Rectangle2D.Double(n, n2, n3 - n, n4 - n2);
    }

    Rectangle2D b(Rectangle2D rectangle2D) {
        int n = (int)Math.max(1.0, 0.015 * (double)this.w.getSize());
        return new Rectangle2D.Double((int)Math.floor(rectangle2D.getMinX() - (double)n), (int)Math.floor(rectangle2D.getMinY() - (double)n), (int)Math.ceil(rectangle2D.getWidth() + (double)(2 * n)), (int)Math.ceil(rectangle2D.getHeight()) + 2 * n);
    }

    TextureRenderer q() {
        TextureRenderer textureRenderer = (TextureRenderer)this.E.getBackingStore();
        if (textureRenderer != this.H) {
            if (this.I != null) {
                this.I.dispose();
                this.I = null;
                this.J = null;
            }
            this.H = textureRenderer;
        }
        return this.H;
    }

    Graphics2D r() {
        TextureRenderer textureRenderer = this.q();
        if (this.I == null) {
            this.I = textureRenderer.createGraphics();
            this.I.setComposite(AlphaComposite.Src);
            this.I.setColor(Color.WHITE);
            this.I.setFont(this.w);
            this.I.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, this.x ? RenderingHints.VALUE_TEXT_ANTIALIAS_ON : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
            this.I.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, this.y ? RenderingHints.VALUE_FRACTIONALMETRICS_ON : RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
        }
        return this.I;
    }

    private void a(float f2, float f3) {
        avx_2 avx_22 = auj_1.a.a();
        GL2 gL2 = avx_22.e();
        this.B = System.currentTimeMillis();
        if (r && !this.N) {
            this.a((GL)gL2);
        }
        this.n = f2;
        this.o = f3;
        avx_22.i.a(13);
        axr_2.a().a(axn_2.e, axn_2.f);
        axr_2.a().a(gL2);
        this.q().begin3DRendering();
        if (!this.F) {
            int[] nArray = new int[1];
            gL2.glGetIntegerv(3379, nArray, 0);
            this.E.setMaxSize(nArray[0], nArray[0]);
            this.F = true;
        }
        if (this.D && !this.q().isUsingAutoMipmapGeneration()) {
            if (r) {
                System.err.println("Disabled mipmapping in TextRenderer");
            }
            this.D = false;
        }
    }

    private void s() {
        this.u();
        this.q().end3DRendering();
        if (++this.L >= 1000) {
            this.L = 0;
            if (r) {
                System.err.println("Clearing unused entries in endRendering()");
            }
            this.t();
        }
    }

    void t() {
        ArrayList arrayList = new ArrayList();
        this.E.visit((RectVisitor)new ayb_2(this, arrayList));
        for (Rect rect : arrayList) {
            this.E.remove(rect);
            String string = ((ayl_2)rect.getUserData()).a();
            if (string == null) continue;
            this.K.a(string);
        }
        float f2 = this.E.verticalFragmentationRatio();
        if (!arrayList.isEmpty() && f2 > 0.7f) {
            if (r) {
                System.err.println("Compacting TextRenderer backing store due to vertical fragmentation " + f2);
            }
            this.E.compact();
        }
        if (r) {
            this.q().markDirty(0, 0, this.q().getWidth(), this.q().getHeight());
        }
    }

    private void u() {
        if (this.p != null) {
            this.p.a();
        }
    }

    private void a(GL gL) {
        this.M = new Frame("TextRenderer Debug Output");
        GLCanvas gLCanvas = new GLCanvas((GLCapabilitiesImmutable)new GLCapabilities(GLProfile.getDefault()));
        gLCanvas.addGLEventListener((GLEventListener)new aye_2(this, this.M, gLCanvas));
        this.M.add((Component)gLCanvas);
        FPSAnimator fPSAnimator = new FPSAnimator((GLAutoDrawable)gLCanvas, 10);
        this.M.addWindowListener(new ayc_1(this, fPSAnimator));
        this.M.setSize(256, 128);
        this.M.setVisible(true);
        fPSAnimator.start();
        this.N = true;
    }

    public void a(boolean bl) {
        this.O = bl;
    }

    public final boolean m() {
        return this.O;
    }

    public void b(boolean bl) {
        this.R = bl;
        this.q().setSmoothing(bl);
    }

    public boolean n() {
        return this.R;
    }

    boolean b(GL gL) {
        if (!this.Q) {
            this.P = gL.isExtensionAvailable("GL_VERSION_1_5");
            this.Q = true;
        }
        return this.P;
    }

    @Override
    public String a() {
        if (this.w == null) {
            return null;
        }
        String string = this.w.isBold() ? (this.w.isItalic() ? "bolditalic" : "bold") : (this.w.isItalic() ? "italic" : "plain");
        return this.w.getFamily() + "-" + string + "-" + this.w.getSize();
    }

    @Override
    public int b() {
        int n = 0;
        if (this.w.isBold()) {
            n |= 1;
        }
        if (this.w.isItalic()) {
            n |= 2;
        }
        return n;
    }

    @Override
    public ayn_2 c() {
        if (this.w == null) {
            return null;
        }
        this.o();
        return this.C;
    }

    public void o() {
        if (this.C == null) {
            this.C = new axt_1(this.w, true, this.p());
            this.C.a(this.z, this.A);
        }
    }

    @Override
    public ayn_2 a(int n, float f2) {
        if (this.w == null) {
            return null;
        }
        Font font = this.w.deriveFont(n, f2);
        return new axt_1(font, true, ayr_1.a);
    }

    @Override
    public int a(char c2) {
        FontRenderContext fontRenderContext = this.j();
        Rectangle2D rectangle2D = this.w.getStringBounds(String.valueOf(c2), fontRenderContext);
        return (int)rectangle2D.getWidth();
    }

    @Override
    public int b(char c2) {
        return this.a(c2);
    }

    @Override
    public int c(char c2) {
        FontRenderContext fontRenderContext = this.j();
        Rectangle2D rectangle2D = this.w.getStringBounds(String.valueOf(c2), fontRenderContext);
        return (int)rectangle2D.getHeight();
    }

    @Override
    public int d() {
        FontRenderContext fontRenderContext = this.j();
        Rectangle2D rectangle2D = this.w.getMaxCharBounds(fontRenderContext);
        return (int)rectangle2D.getWidth();
    }

    @Override
    public int e() {
        FontRenderContext fontRenderContext = this.j();
        Rectangle2D rectangle2D = this.w.getMaxCharBounds(fontRenderContext);
        return (int)rectangle2D.getHeight();
    }

    @Override
    public int a(String string, int n, int n2) {
        for (int k = Math.min(string.length() - 1, n - 1); k >= 0; --k) {
            if (this.a(string.substring(0, k + 1)) > n2) continue;
            return k + 1;
        }
        return 0;
    }

    @Override
    public int a(String string) {
        Rectangle2D rectangle2D = this.w.getStringBounds(string, this.j());
        return (int)rectangle2D.getWidth();
    }

    @Override
    public int b(String string) {
        Rectangle2D rectangle2D = this.w.getStringBounds(string, this.j());
        return (int)rectangle2D.getHeight();
    }

    @Override
    public int c(String string) {
        LineMetrics lineMetrics = this.w.getLineMetrics(string, this.j());
        return (int)Math.ceil(lineMetrics.getDescent());
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public void a(char[] cArray, float f2, float f3) {
        this.a(cArray, f2, f3, 1.0f);
    }

    @Override
    public void a(char[] cArray, float f2, float f3, float f4) {
        this.a(cArray, f2, cArray.length, f3, f4);
    }

    @Override
    public void a(char[] cArray, float f2, int n, float f3, float f4) {
        this.a(cArray, f2, n, f3, f4, 0.0f);
    }

    @Override
    public void a(char[] cArray, float f2, int n, float f3, float f4, float f5) {
        int n2;
        if (this.C == null) {
            return;
        }
        float f6 = f2;
        float f7 = f3;
        f6 += this.n - (float)this.G.b();
        f7 += this.o;
        avx_2 avx_22 = auj_1.a.a();
        GL2 gL2 = avx_22.e();
        T.n();
        int n3 = Math.min(cArray.length, n);
        for (n2 = 0; n2 < n3; ++n2) {
            int n4 = 1;
            while (n2 + n4 < n3 && this.S.a(cArray[n2 + n4])) {
                ++n4;
            }
            String string = new String(cArray, n2, n4);
            ayg_1 ayg_12 = this.K.b(string);
            if (ayg_12 == null) continue;
            if (string.equals(" ")) {
                f6 += (ayg_12.b() + f5) * f4;
                continue;
            }
            ayg_12.a(f6, f7, 0.0f, f4);
            f6 += ayg_12.b() * f4;
            n2 += n4 - 1;
        }
        T.o();
        n2 = T.j();
        gL2.glVertexPointer(2, 5126, 0, (Buffer)T.b());
        gL2.glColorPointer(4, 5126, 0, (Buffer)T.c());
        gL2.glTexCoordPointer(2, 5126, 0, (Buffer)T.d());
        gL2.glDrawArrays(7, 0, n2);
    }

    static {
        U = new float[4];
        int n = 4096;
        T = VertexBufferPCT.d.a(4096);
    }
}

