/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

public class ahk
extends JPanel {
    private Graphics a;
    private Image b;

    public ahk(int n, int n2) {
        Dimension dimension = new Dimension(n, n2);
        this.setSize(dimension);
        this.setPreferredSize(dimension);
        this.setMaximumSize(dimension);
        this.setMinimumSize(dimension);
        this.a();
    }

    private boolean a() {
        this.b = this.createImage(this.getWidth(), this.getHeight());
        if (this.b == null) {
            return false;
        }
        this.a = this.b.getGraphics();
        this.a.clearRect(0, 0, this.getWidth(), this.getHeight());
        this.a.setColor(Color.GRAY);
        this.a.drawLine(this.getWidth() / 2, 0, this.getWidth() / 2, this.getHeight());
        return true;
    }

    @Override
    public void paint(Graphics graphics) {
        if (!this.a()) {
            super.paint(graphics);
        }
        graphics.drawImage(this.b, 0, 0, null);
    }

    @Override
    public void update(Graphics graphics) {
        this.paint(graphics);
    }
}

