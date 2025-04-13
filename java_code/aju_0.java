/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JComponent;
import javax.swing.border.EmptyBorder;

/*
 * Renamed from aju
 */
public class aju_0
extends JComponent {
    private Image a;

    public aju_0() {
        this(null);
    }

    public aju_0(Image image) {
        this.setBorder(new EmptyBorder(0, 0, 0, 0));
        this.setOpaque(true);
        this.setDoubleBuffered(true);
        this.a = image;
    }

    public void a(Image image) {
        this.a = image;
        this.repaint();
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        if (this.a == null) {
            return;
        }
        graphics.drawImage(this.a, 0, 0, this.getWidth(), this.getHeight(), null);
    }

    @Override
    protected void paintBorder(Graphics graphics) {
    }
}

