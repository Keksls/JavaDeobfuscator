/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.util.texture.TextureCoords
 */
import com.jogamp.opengl.util.texture.TextureCoords;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/*
 * Renamed from abQ
 */
public final class abq_0 {
    public static final abq_0 a = new abq_0();
    private boolean b;
    JFrame c;
    private float d;
    private float e;
    private afq_2 f;
    private afq_2 g;
    private aft_2 h;
    private ays_2 i;
    private TextureCoords j;
    private int k;
    private int l;
    private boolean m;
    private BufferedImage n;
    private final ArrayList<aft_2[]> o = new ArrayList();
    private final ArrayList<abs_0> p = new ArrayList();

    private abq_0() {
    }

    public void a() {
        SwingUtilities.invokeLater(new abr_0(this));
        this.b = true;
    }

    public void a(float f2, float f3, afq_2 afq_22, afq_2 afq_23, aft_2 aft_22) {
        this.d = f2;
        this.e = f3;
        this.f = afq_22;
        this.g = afq_23;
        this.h = aft_22;
    }

    private void a(Graphics graphics, aft_2[] aft_2Array, int n, int n2) {
        graphics.drawLine((int)((float)n + aft_2Array[0].a()), (int)((float)n2 - aft_2Array[0].b()), (int)((float)n + aft_2Array[1].a()), (int)((float)n2 - aft_2Array[1].b()));
        graphics.drawLine((int)((float)n + aft_2Array[1].a()), (int)((float)n2 - aft_2Array[1].b()), (int)((float)n + aft_2Array[2].a()), (int)((float)n2 - aft_2Array[2].b()));
        graphics.drawLine((int)((float)n + aft_2Array[2].a()), (int)((float)n2 - aft_2Array[2].b()), (int)((float)n + aft_2Array[3].a()), (int)((float)n2 - aft_2Array[3].b()));
        graphics.drawLine((int)((float)n + aft_2Array[3].a()), (int)((float)n2 - aft_2Array[3].b()), (int)((float)n + aft_2Array[0].a()), (int)((float)n2 - aft_2Array[0].b()));
    }

    public void b() {
        if (!this.b) {
            return;
        }
        if (this.c == null) {
            return;
        }
        Container container = this.c.getContentPane();
        Graphics graphics = container.getGraphics();
        int n = container.getWidth() / 2;
        int n2 = container.getHeight() / 2;
        graphics.clearRect(0, 0, container.getWidth(), container.getHeight());
        graphics.setColor(Color.GRAY);
        for (aft_2[] aft_2Array : this.o) {
            this.a(graphics, aft_2Array, n, n2);
        }
        int n3 = (int)((float)n + this.d);
        int n4 = (int)((float)n2 - this.e);
        for (abs_0 abs_02 : this.p) {
            abs_02.a(graphics, n3, n4);
        }
        if (this.n != null) {
            graphics.drawImage(this.n, 0, 0, null);
            if (this.m) {
                graphics.setColor(Color.YELLOW);
            } else {
                graphics.setColor(new Color(64, 64, 64));
            }
            graphics.drawOval(this.k, this.l, 1, 1);
        }
        if (this.f != null) {
            graphics.setColor(Color.RED);
            graphics.drawLine(n3, n4, (int)((float)n3 + this.f.a()), (int)((float)n4 - this.f.b()));
        }
        if (this.g != null) {
            graphics.setColor(Color.PINK);
            graphics.drawLine(n3, n4, (int)((float)n3 + this.g.a()), (int)((float)n4 - this.g.b()));
        }
        graphics.setColor(Color.BLUE);
        if (this.h != null) {
            graphics.drawLine(n3, n4, (int)((float)n3 + this.h.a()), (int)((float)n4 - this.h.b()));
        }
    }

    public void a(abs_0 abs_02) {
        this.p.add(abs_02);
    }

    public void a(aft_2[] aft_2Array) {
        this.o.add(aft_2Array);
    }

    public void a(ays_2 ays_22, TextureCoords textureCoords) {
        if (this.i == ays_22 && abq_0.a(textureCoords, this.j)) {
            return;
        }
        this.i = ays_22;
        this.j = textureCoords;
        azr_2 azr_22 = this.i.a(0);
        int n = azr_22.a();
        int n2 = azr_22.b();
        this.n = new BufferedImage(n, n2, 2);
        azc_2 azc_22 = azr_22.l();
        int n3 = new Color(128, 20, 128).getRGB();
        int n4 = new Color(192, 192, 192).getRGB();
        try {
            for (int k = 0; k < n2; ++k) {
                for (int i2 = 0; i2 < n; ++i2) {
                    this.n.setRGB(i2, k, azc_22.a(i2, k) ? n3 : n4);
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private static boolean a(TextureCoords textureCoords, TextureCoords textureCoords2) {
        if (textureCoords == null || textureCoords2 == null) {
            return true;
        }
        return textureCoords.left() == textureCoords2.left() && textureCoords.bottom() == textureCoords2.bottom() && textureCoords.right() == textureCoords2.right() && textureCoords.top() == textureCoords2.left();
    }

    public void a(int n, int n2, boolean bl) {
        this.k = n;
        this.l = n2;
        this.m = bl;
    }

    public void c() {
        this.o.clear();
        this.p.clear();
    }

    static {
        if (!abq_0.a.b) {
            a.a();
        }
    }
}

