/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.Rectangle2D;

/*
 * Renamed from ayA
 */
public class aya_2
implements aye_1 {
    public static final aya_2 a = new aya_2();
    private static Color b = new Color(0.0f, 0.0f, 0.0f, 0.7f);

    @Override
    public void a(Graphics2D graphics2D, String string, int n, int n2) {
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        graphics2D.setColor(b);
        graphics2D.drawString(string, ++n + 1, ++n2);
        graphics2D.drawString(string, n + 1, n2 + 1);
        graphics2D.drawString(string, n, n2 + 1);
        graphics2D.setColor(Color.WHITE);
        graphics2D.drawString(string, n, n2);
    }

    @Override
    public void a(Graphics2D graphics2D, GlyphVector glyphVector, int n, int n2) {
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        graphics2D.setColor(b);
        graphics2D.drawGlyphVector(glyphVector, ++n + 1, ++n2);
        graphics2D.drawGlyphVector(glyphVector, n + 1, n2 + 1);
        graphics2D.drawGlyphVector(glyphVector, n, n2 + 1);
        graphics2D.setColor(Color.WHITE);
        graphics2D.drawGlyphVector(glyphVector, n, n2);
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public Rectangle2D a(CharSequence charSequence, Font font, FontRenderContext fontRenderContext) {
        GlyphVector glyphVector = ayv_1.a.a(charSequence.toString(), font, fontRenderContext);
        return this.a(glyphVector, fontRenderContext);
    }

    @Override
    public Rectangle2D a(String string, Font font, FontRenderContext fontRenderContext) {
        GlyphVector glyphVector = ayv_1.a.a(string, font, fontRenderContext);
        return this.a(glyphVector, fontRenderContext);
    }

    @Override
    public Rectangle2D a(GlyphVector glyphVector, FontRenderContext fontRenderContext) {
        Rectangle2D rectangle2D = glyphVector.getLogicalBounds();
        rectangle2D.setRect(rectangle2D.getX(), rectangle2D.getY(), rectangle2D.getWidth() + 2.0, rectangle2D.getHeight() + 2.0);
        return rectangle2D;
    }

    @Override
    public int b() {
        return 1;
    }

    @Override
    public ayr_1 c() {
        return ayr_1.c;
    }
}

