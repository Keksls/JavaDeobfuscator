/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.baseImpl.graphics.opengl.FullscreenUtils;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.EventQueue;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Arrays;
import java.util.Objects;
import javax.swing.JFrame;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from ajh
 */
public abstract class ajh_0 {
    private static final Logger f = Logger.getLogger(ajh_0.class);
    private static final int g = 16;
    protected static final int a = 800;
    protected static final int b = 600;
    private static final int h = 1024;
    private static final int i = 768;
    private static final int j = 32;
    private static final int k = 0;
    private static final aiz_0 l = aiz_0.a;
    protected static final int c = 1920;
    protected static final int d = 1080;
    public static final GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
    JFrame m = null;
    ajp_0 n = null;
    private ajg o;
    private azu_2 p;
    private String q = null;
    aiz_0 r;

    protected abstract JFrame a();

    @Nullable
    protected abstract URL q_();

    public abstract void a(ahi var1);

    public abstract void p_();

    public void d() {
        this.a(new ajq_0());
    }

    public void a(ajq_0 ajq_02) {
        Object object;
        f.info((Object)"Initializing GLApplication UI");
        System.setProperty("sun.awt.noerasebackground", "true");
        this.o = new ajg(ajq_02);
        f.info((Object)"GLappUI : Workspace created");
        this.o.setFocusable(true);
        this.p = new azu_2();
        f.info((Object)"GLappUI : Renderer created");
        this.p.f(true);
        this.o.a(this.p);
        this.m = this.a();
        this.m.addComponentListener(new aji_0(this));
        f.info((Object)"GLappUI : Frame created");
        this.m.setVisible(false);
        this.m.setTitle(this.q);
        URL uRL = this.q_();
        if (uRL != null) {
            object = Toolkit.getDefaultToolkit().getImage(uRL);
            this.m.setIconImage((Image)object);
            if (ahu_2.b()) {
                try {
                    Class<?> clazz = Class.forName("com.apple.eawt.Application");
                    Method method = clazz.getMethod("getApplication", new Class[0]);
                    Object object2 = method.invoke(null, new Object[0]);
                    Method method2 = clazz.getMethod("setDockIconImage", Image.class);
                    method2.invoke(object2, object);
                }
                catch (Exception exception) {
                    f.error((Object)("Exception while trying to set dock icon " + (Image)object + " : "), (Throwable)exception);
                }
            }
        }
        this.m.setDefaultCloseOperation(2);
        this.m.addWindowListener(new ajj_0(this));
        if (Desktop.isDesktopSupported()) {
            object = Desktop.getDesktop();
            ((Desktop)object).addAppEventListener(new ajk_0(this));
            ((Desktop)object).addAppEventListener(new ajl_0(this));
        }
    }

    public void e() {
        if (this.n != null) {
            this.n.A();
        }
        if (this.m != null) {
            this.m.dispose();
        } else {
            System.exit(0);
        }
    }

    public ajg f() {
        return this.o;
    }

    public void a(boolean bl) {
        if (!EventQueue.isDispatchThread()) {
            EventQueue.invokeLater(new ajm_0(this, bl));
            return;
        }
        if (this.o != null) {
            this.o.setVisible(bl);
        }
    }

    public void g() {
        if (!EventQueue.isDispatchThread()) {
            EventQueue.invokeLater(new ajn_0(this));
            return;
        }
        if (this.o != null) {
            this.o.setSize(this.o.getSize());
        }
    }

    public Rectangle h() {
        if (this.o != null) {
            return this.o.getBounds();
        }
        return new Rectangle(0, 0, 0, 0);
    }

    public azu_2 i() {
        return this.p;
    }

    public void j() {
        this.b(true);
        if (!this.o.a().isAnimating()) {
            this.o.a().start();
        }
        f.info((Object)"GLappUI : GL Rendering started");
    }

    public void b(String string) {
        this.q = string;
        if (this.m != null) {
            this.m.setTitle(this.q);
        }
    }

    public void a(Cursor cursor) {
        this.m.setCursor(cursor);
    }

    public int k() {
        return this.m.getX();
    }

    public int l() {
        return this.m.getY();
    }

    public Dimension m() {
        return this.m.getSize();
    }

    public int n() {
        return this.m.getWidth();
    }

    public int o() {
        return this.m.getHeight();
    }

    public void b(boolean bl) {
        if (this.m == null) {
            return;
        }
        this.m.setVisible(bl);
    }

    public void a(ajp_0 ajp_02) {
        this.n = ajp_02;
    }

    protected ajp_0 p() {
        return this.n;
    }

    public void a(aiy_0 aiy_02) {
        Object object;
        if (aiy_02.i()) {
            aiy_02 = this.s();
        }
        f.info((Object)("Applying resolution : " + aiy_02));
        switch (aiy_02.e()) {
            case c: {
                boolean bl = this.a(aiy_02.a(), aiy_02.b(), aiy_02.c(), aiy_02.d(), aiy_02.f());
                if (bl) break;
                this.a(aiy_02.f());
                break;
            }
            case b: {
                this.a(aiy_02.f());
                break;
            }
            case a: {
                this.a(aiy_02.a(), aiy_02.b(), aiy_02.f(), aiy_02.g(), aiy_02.h());
                object = this.d(aiy_02.f());
                if (((Rectangle)object).contains(this.m.getLocation())) break;
                this.m.setLocation(((Rectangle)object).x, ((Rectangle)object).y);
            }
        }
        float[] fArray = this.o.getCurrentSurfaceScale(new float[2]);
        this.p.a(fArray[0], fArray[1]);
        f.info((Object)("Surface scale : " + Arrays.toString(fArray)));
        object = this.q();
        if (!((aiy_0)object).equals(aiy_02)) {
            f.info((Object)("Resolution applied : " + (aiy_0)object));
        }
        if (this.n != null) {
            this.n.a((aiy_0)object);
        }
    }

    public aiy_0 q() {
        GraphicsDevice graphicsDevice = this.m.getGraphicsConfiguration().getDevice();
        DisplayMode displayMode = graphicsDevice.getDisplayMode();
        int n = displayMode.getBitDepth();
        return new aiy_0(this.n(), this.o(), n, displayMode.getRefreshRate(), this.r, graphicsDevice.getIDstring(), this.k(), this.l());
    }

    protected GraphicsDevice c(@Nullable String string) {
        if (string != null) {
            return Arrays.stream(e.getScreenDevices()).filter(graphicsDevice -> string.equals(graphicsDevice.getIDstring())).findFirst().orElse(e.getDefaultScreenDevice());
        }
        return e.getDefaultScreenDevice();
    }

    protected void a(@Nullable String string) {
        this.r = aiz_0.b;
        GraphicsDevice graphicsDevice = this.c(string);
        if (graphicsDevice.getFullScreenWindow() == this.m) {
            graphicsDevice.setFullScreenWindow(null);
        }
        if (ahu_2.b()) {
            try {
                FullscreenUtils.a.showMenuAndDock(false);
            }
            catch (Throwable throwable) {
                f.error((Object)"Impossible de cacher le menu et le doc Mac", throwable);
            }
        }
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        this.m.setBounds(0, 0, dimension.width, dimension.height);
        this.m.setExtendedState(6);
        this.m.setVisible(true);
        this.m.setResizable(false);
    }

    protected void a(int n, int n2, @Nullable String string, int n3, int n4) {
        int n5;
        int n6;
        this.r = aiz_0.a;
        GraphicsDevice graphicsDevice = e.getDefaultScreenDevice();
        if (graphicsDevice.getFullScreenWindow() == this.m) {
            graphicsDevice.setFullScreenWindow(null);
        }
        if (ahu_2.b()) {
            try {
                FullscreenUtils.a.showMenuAndDock(true);
            }
            catch (Throwable throwable) {
                f.error((Object)"Impossible d'afficher le menu et le doc Mac", throwable);
            }
        }
        GraphicsDevice graphicsDevice2 = this.m.getGraphicsConfiguration().getDevice();
        Rectangle rectangle = graphicsDevice2.getDefaultConfiguration().getBounds();
        int n7 = Hw.a(n, 800, rectangle.width);
        int n8 = Hw.a(n2, 600, rectangle.height);
        this.m.setSize(n7, n8);
        Rectangle rectangle2 = this.m.getBounds();
        Rectangle rectangle3 = this.d(string);
        if (!Objects.equals(rectangle2, rectangle3)) {
            n6 = Hw.a(n, 800, rectangle3.width);
            n5 = Hw.a(n2, 600, rectangle3.height);
            this.m.setSize(n6, n5);
        } else {
            n6 = n7;
            n5 = n8;
        }
        if (n6 == rectangle3.width && n5 == rectangle3.height) {
            int n9 = Math.min(1024, rectangle3.width);
            int n10 = Math.min(768, rectangle3.height);
            this.m.setSize(n9, n10);
            this.m.setExtendedState(6);
        } else {
            this.m.setExtendedState(0);
        }
        this.m.setLocation(n3, n4);
        this.m.setResizable(true);
        this.m.setVisible(true);
    }

    protected boolean a(int n, int n2, int n3, int n4, @Nullable String string) {
        DisplayMode displayMode;
        GraphicsDevice graphicsDevice;
        if (ahu_2.b()) {
            try {
                FullscreenUtils.a.showMenuAndDock(true);
            }
            catch (Throwable throwable) {
                f.error((Object)"Impossible d'afficher le menu et le doc Mac", throwable);
            }
        }
        if (!(graphicsDevice = this.c(string)).isFullScreenSupported()) {
            f.debug((Object)"Fullscreen mode not supported, defaulting to simulated fullscreen");
        }
        if ((displayMode = ajh_0.a(graphicsDevice, n, n2, n3, n4)) == null) {
            f.warn((Object)("No available displayMode corresponding to " + n + "x" + n2 + "x" + n3));
            return false;
        }
        if (graphicsDevice.getFullScreenWindow() != this.m) {
            graphicsDevice.setFullScreenWindow(this.m);
        }
        if (graphicsDevice.getDisplayMode() == displayMode) {
            this.r = aiz_0.c;
            return true;
        }
        if (!graphicsDevice.isDisplayChangeSupported()) {
            f.warn((Object)"Unable to change display mode. Defaulting to windowed mode");
            graphicsDevice.setFullScreenWindow(null);
            return false;
        }
        try {
            graphicsDevice.setDisplayMode(displayMode);
        }
        catch (Exception exception) {
            f.error((Object)("Unable to set mode " + ajh_0.a(displayMode) + ". Defaulting to windowed mode"), (Throwable)exception);
            graphicsDevice.setFullScreenWindow(null);
            return false;
        }
        DisplayMode displayMode2 = graphicsDevice.getDisplayMode();
        this.r = aiz_0.c;
        this.m.setBounds(0, 0, displayMode2.getWidth(), displayMode2.getHeight());
        return true;
    }

    public Rectangle r() {
        GraphicsDevice graphicsDevice = e.getDefaultScreenDevice();
        return this.a(graphicsDevice);
    }

    public Rectangle d(@Nullable String string) {
        if (this.m == null) {
            return this.r();
        }
        Rectangle rectangle = this.m.getBounds();
        GraphicsDevice graphicsDevice = null;
        int n = -1;
        boolean bl = false;
        for (GraphicsDevice graphicsDevice2 : e.getScreenDevices()) {
            Rectangle rectangle2 = graphicsDevice2.getDefaultConfiguration().getBounds();
            if (rectangle.height > rectangle2.height || rectangle.width > rectangle2.width) continue;
            int n2 = rectangle2.width * rectangle2.height;
            if (string != null && string.equals(graphicsDevice2.getIDstring())) {
                graphicsDevice = graphicsDevice2;
                n = n2;
                bl = true;
                continue;
            }
            if (bl || n2 <= n) continue;
            graphicsDevice = graphicsDevice2;
            n = n2;
        }
        if (graphicsDevice != null) {
            return this.a(graphicsDevice);
        }
        return this.r();
    }

    private Rectangle a(GraphicsDevice graphicsDevice) {
        GraphicsConfiguration graphicsConfiguration = graphicsDevice.getDefaultConfiguration();
        Insets insets = Toolkit.getDefaultToolkit().getScreenInsets(graphicsConfiguration);
        Rectangle rectangle = graphicsConfiguration.getBounds();
        rectangle.x += insets.left;
        rectangle.width -= insets.left + insets.right;
        rectangle.y += insets.top;
        rectangle.height -= insets.top + insets.bottom;
        return rectangle;
    }

    static DisplayMode a(GraphicsDevice graphicsDevice, int n, int n2, int n3, int n4) {
        DisplayMode displayMode;
        int n5 = n3;
        if (n3 == -1) {
            n5 = 32;
        }
        if ((displayMode = ajh_0.b(graphicsDevice, n, n2, n5, n4)) != null) {
            return displayMode;
        }
        return ajh_0.b(graphicsDevice, n, n2, graphicsDevice.getDisplayMode().getBitDepth(), n4);
    }

    private static DisplayMode b(GraphicsDevice graphicsDevice, int n, int n2, int n3, int n4) {
        boolean bl = n4 != 0;
        DisplayMode displayMode = null;
        for (DisplayMode displayMode2 : graphicsDevice.getDisplayModes()) {
            int n5 = displayMode2.getBitDepth();
            if (n5 == -1) {
                n5 = n3;
            }
            if (displayMode2.getWidth() != n || displayMode2.getHeight() != n2 || n5 != n3 || bl && n4 != displayMode2.getRefreshRate()) continue;
            if (displayMode == null) {
                displayMode = displayMode2;
                continue;
            }
            int n6 = displayMode.getRefreshRate();
            int n7 = displayMode2.getRefreshRate();
            if (n7 < 50 || n7 >= n6) continue;
            displayMode = displayMode2;
        }
        return displayMode;
    }

    public aiy_0 s() {
        return this.a(null, 0, 0);
    }

    public aiy_0 a(@Nullable String string, int n, int n2) {
        return new aiy_0(1024, 768, 32, 0, l, string, n, n2);
    }

    public Dimension t() {
        return new Dimension(800, 600);
    }

    public int u() {
        return 16;
    }

    public JFrame v() {
        return this.m;
    }

    private static String a(DisplayMode displayMode) {
        return "{Mode " + displayMode.getWidth() + "x" + displayMode.getHeight() + "x" + displayMode.getBitDepth() + " " + displayMode.getRefreshRate() + "Hz}";
    }
}

