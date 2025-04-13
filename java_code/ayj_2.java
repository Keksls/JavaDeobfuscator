/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.util.awt.TextureRenderer
 *  com.jogamp.opengl.util.packrect.BackingStoreManager
 *  com.jogamp.opengl.util.packrect.Rect
 */
import com.jogamp.opengl.util.awt.TextureRenderer;
import com.jogamp.opengl.util.packrect.BackingStoreManager;
import com.jogamp.opengl.util.packrect.Rect;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Image;

/*
 * Renamed from ayj
 */
class ayj_2
implements BackingStoreManager {
    private Graphics2D b;
    final /* synthetic */ aya_1 a;

    ayj_2(aya_1 aya_12) {
        this.a = aya_12;
    }

    public Object allocateBackingStore(int n, int n2) {
        TextureRenderer textureRenderer = this.a.G.a() ? TextureRenderer.createAlphaOnlyRenderer((int)n, (int)n2, (boolean)this.a.D) : new TextureRenderer(n, n2, true, this.a.D);
        textureRenderer.setSmoothing(this.a.R);
        if (aya_1.r) {
            System.err.println(" TextRenderer allocating backing store " + n + " x " + n2);
        }
        return textureRenderer;
    }

    public void deleteBackingStore(Object object) {
        ((TextureRenderer)object).dispose();
    }

    public boolean preExpand(Rect rect, int n) {
        if (n == 0) {
            if (aya_1.r) {
                System.err.println("Clearing unused entries in preExpand(): attempt number " + n);
            }
            this.a.t();
            return true;
        }
        return false;
    }

    public boolean additionFailed(Rect rect, int n) {
        this.a.E.clear();
        this.a.K.a();
        if (aya_1.r) {
            System.err.println(" *** Cleared all text because addition failed ***");
        }
        return true;
    }

    public boolean canCompact() {
        return true;
    }

    public void beginMovement(Object object, Object object2) {
        TextureRenderer textureRenderer = (TextureRenderer)object2;
        this.b = textureRenderer.createGraphics();
    }

    public void move(Object object, Rect rect, Object object2, Rect rect2) {
        TextureRenderer textureRenderer = (TextureRenderer)object;
        TextureRenderer textureRenderer2 = (TextureRenderer)object2;
        if (textureRenderer == textureRenderer2) {
            this.b.setComposite(AlphaComposite.Src);
            this.b.copyArea(rect.x(), rect.y(), rect.w(), rect.h(), rect2.x() - rect.x(), rect2.y() - rect.y());
        } else {
            Image image = textureRenderer.getImage();
            this.b.setComposite(AlphaComposite.Clear);
            this.b.drawRect(rect2.x(), rect2.y(), rect2.w(), rect2.h());
            this.b.setComposite(AlphaComposite.Src);
            this.b.drawImage(image, rect2.x(), rect2.y(), rect2.x() + rect2.w(), rect2.y() + rect2.h(), rect.x(), rect.y(), rect.x() + rect.w(), rect.y() + rect.h(), null);
        }
    }

    public void endMovement(Object object, Object object2) {
        this.b.dispose();
        TextureRenderer textureRenderer = (TextureRenderer)object2;
        textureRenderer.markDirty(0, 0, textureRenderer.getWidth(), textureRenderer.getHeight());
    }
}

