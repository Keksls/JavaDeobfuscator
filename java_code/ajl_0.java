/*
 * Decompiled with CFR 0.152.
 */
import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.desktop.AppHiddenEvent;
import java.awt.desktop.AppHiddenListener;

/*
 * Renamed from ajl
 */
class ajl_0
implements AppHiddenListener {
    private aiy_0 b;
    private boolean c = false;
    final /* synthetic */ ajh_0 a;

    ajl_0(ajh_0 ajh_02) {
        this.a = ajh_02;
    }

    @Override
    public void appHidden(AppHiddenEvent appHiddenEvent) {
        if (this.c) {
            return;
        }
        this.c = true;
        if (this.a.r == aiz_0.c) {
            this.b = this.a.q();
            GraphicsDevice graphicsDevice = ajh_0.e.getDefaultScreenDevice();
            if (graphicsDevice.getFullScreenWindow() == this.a.m) {
                graphicsDevice.setFullScreenWindow(null);
            }
        }
        if (this.a.n != null) {
            this.a.n.a(true);
        }
    }

    @Override
    public void appUnhidden(AppHiddenEvent appHiddenEvent) {
        if (!this.c) {
            return;
        }
        this.c = false;
        if (this.a.r == aiz_0.c) {
            DisplayMode displayMode;
            GraphicsDevice graphicsDevice = ajh_0.e.getDefaultScreenDevice();
            if (graphicsDevice.getFullScreenWindow() == null) {
                graphicsDevice.setFullScreenWindow(this.a.m);
            }
            if ((displayMode = ajh_0.a(graphicsDevice, this.b.a(), this.b.b(), this.b.c(), this.b.d())) != null) {
                graphicsDevice.setDisplayMode(displayMode);
            }
        }
        if (this.a.n != null) {
            this.a.n.a(false);
        }
    }
}

