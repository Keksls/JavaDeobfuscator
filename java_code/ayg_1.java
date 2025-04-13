/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.util.awt.TextureRenderer
 *  com.jogamp.opengl.util.packrect.Rect
 *  com.jogamp.opengl.util.texture.TextureCoords
 */
import com.jogamp.opengl.util.awt.TextureRenderer;
import com.jogamp.opengl.util.packrect.Rect;
import com.jogamp.opengl.util.texture.TextureCoords;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.font.GlyphVector;
import java.awt.geom.Rectangle2D;

/*
 * Renamed from ayg
 */
class ayg_1 {
    private final String b;
    private final ayh_2 c;
    private float d;
    private GlyphVector e;
    private Rect f;
    private boolean g;
    final /* synthetic */ aya_1 a;

    public ayg_1(aya_1 aya_12, String string, GlyphVector glyphVector, ayh_2 ayh_22) {
        this.a = aya_12;
        this.b = string;
        for (int k = 0; k < glyphVector.getNumGlyphs(); ++k) {
            this.d += glyphVector.getGlyphMetrics(k).getAdvance();
        }
        this.e = glyphVector;
        this.c = ayh_22;
    }

    public String a() {
        return this.b;
    }

    public float b() {
        return this.d;
    }

    public float a(float f2, float f3, float f4, float f5) {
        if (this.f == null) {
            this.d();
        }
        try {
            TextureRenderer textureRenderer = this.a.q();
            TextureCoords textureCoords = textureRenderer.getTexture().getImageTexCoords();
            float f6 = textureCoords.right();
            float f7 = textureCoords.bottom();
            Rect rect = this.f;
            ayl_2 ayl_22 = (ayl_2)rect.getUserData();
            ayl_22.g();
            Rectangle2D rectangle2D = ayl_22.e();
            float f8 = f2 - f5 * (float)(ayl_22.c() - this.a.C.g());
            float f9 = f3 - f5 * ((float)rectangle2D.getHeight() - (float)ayl_22.d() - (float)this.a.C.h());
            int n = rect.x() + ayl_22.b().x - ayl_22.c();
            int n2 = textureRenderer.getHeight() - rect.y() - (int)rectangle2D.getHeight() - (ayl_22.b().y - ayl_22.d());
            int n3 = (int)rectangle2D.getWidth();
            int n4 = (int)rectangle2D.getHeight();
            float f10 = f6 * (float)n / (float)textureRenderer.getWidth();
            float f11 = f7 * (1.0f - (float)n2 / (float)textureRenderer.getHeight());
            float f12 = f6 * (float)(n + n3) / (float)textureRenderer.getWidth();
            float f13 = f7 * (1.0f - (float)(n2 + n4) / (float)textureRenderer.getHeight());
            aya_1.T.a(f8, f9, f10, f11, aya_1.U);
            aya_1.T.a(f8 + (float)n3 * f5, f9, f12, f11, aya_1.U);
            aya_1.T.a(f8 + (float)n3 * f5, f9 + (float)n4 * f5, f12, f13, aya_1.U);
            aya_1.T.a(f8, f9 + (float)n4 * f5, f10, f13, aya_1.U);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return this.d;
    }

    public void c() {
        this.f = null;
    }

    private void d() {
        GlyphVector glyphVector = this.e();
        Rectangle2D rectangle2D = aya_1.a(this.a.G.a(this.b, this.a.w, this.a.j()));
        Rectangle2D rectangle2D2 = this.a.b(rectangle2D);
        Point point = new Point((int)(-rectangle2D2.getMinX()), (int)(-rectangle2D2.getMinY()));
        Rect rect = new Rect(0, 0, (int)rectangle2D2.getWidth(), (int)rectangle2D2.getHeight(), (Object)new ayl_2(this.a, this.b, point, rectangle2D));
        this.a.E.add(rect);
        this.f = rect;
        Graphics2D graphics2D = this.a.r();
        int n = rect.x() + point.x;
        int n2 = rect.y() + point.y;
        graphics2D.setComposite(AlphaComposite.Clear);
        graphics2D.fillRect(rect.x(), rect.y(), rect.w(), rect.h());
        graphics2D.setComposite(AlphaComposite.Src);
        this.a.G.a(graphics2D, glyphVector, n, n2);
        this.a.q().markDirty(rect.x(), rect.y(), rect.w(), rect.h());
    }

    private GlyphVector e() {
        if (this.e != null) {
            GlyphVector glyphVector = this.e;
            this.e = null;
            return glyphVector;
        }
        return ayv_1.a.a(this.b, this.a.w, this.a.j());
    }
}

