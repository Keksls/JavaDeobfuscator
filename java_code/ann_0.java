/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.geom.AffineTransform;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aNn
 */
class ann_0
extends ajw_0 {
    private static final Logger j = Logger.getLogger(ann_0.class);
    private final Dimension k = new Dimension(800, 600);
    public static final String i = "sun.java2d.uiScale.enabled";

    ann_0() {
        try {
            String string = azs_0.a().a("appSkinPath");
            String string2 = fyu.a().b() + "theme/appSkin/";
            aja_0 aja_02 = new aja_0(string, string2);
            aja_0 aja_03 = new aja_0(string, "Off", aja_02, string2);
            this.b(bae.h().a("desc.wakfu", new Object[0]));
            this.a(aja_02, aja_03);
            int n = azs_0.a().a("resolution.min.width", 800);
            int n2 = azs_0.a().a("resolution.min.height", 600);
            this.k.setSize(n, n2);
        }
        catch (gm_0 gm_02) {
            j.error((Object)"Unable to create skinPath", (Throwable)gm_02);
        }
    }

    public void a(int n, @NotNull GraphicsDevice graphicsDevice) {
        j.info((Object)("UI scale option value = " + n));
        float f2 = ann_0.a(graphicsDevice);
        j.info((Object)("OS screen scale = " + f2));
        fpm_0.b().j().a(f2, n);
    }

    private static float a(GraphicsDevice graphicsDevice) {
        try {
            String string = System.getProperty(i);
            if (Boolean.FALSE.toString().equalsIgnoreCase(string)) {
                return 1.0f;
            }
            Dimension dimension = graphicsDevice.getDefaultConfiguration().getBounds().getSize();
            AffineTransform affineTransform = graphicsDevice.getDefaultConfiguration().getDefaultTransform();
            if (Math.round(dimension.getWidth() * affineTransform.getScaleX()) <= 1920L || Math.round(dimension.getHeight() * affineTransform.getScaleY()) <= 1080L) {
                return 1.0f;
            }
            return (float)affineTransform.getScaleX();
        }
        catch (Exception exception) {
            j.error((Object)"Error when trying to get default screen scale", (Throwable)exception);
            return 1.0f;
        }
    }

    @Override
    public void o_() {
        fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("question.quit", new Object[0]), cfn_0.a(0), 2073L, 102, 1);
        fzm_02.a(new ano_0(this));
    }

    @Override
    @Nullable
    protected URL q_() {
        try {
            return new File("icon.png").toURI().toURL();
        }
        catch (IOException iOException) {
            j.error((Object)"Error: Cannot load icon file", (Throwable)iOException);
            return null;
        }
    }

    @Override
    public Dimension t() {
        return this.k;
    }

    public String toString() {
        return "WakfuApplicationUI{m_minDimensions=" + this.k + "} ";
    }

    static /* synthetic */ void a(ann_0 ann_02) {
        super.o_();
    }
}

