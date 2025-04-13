/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * Renamed from ajD
 */
public class ajd_0
extends JPanel {
    private static final int a = 17;
    private static final int b = 17;
    private final JButton c;
    private aja_0 d;

    public ajd_0() {
        super(new aje_0());
        this.setFocusable(false);
        this.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
        this.setOpaque(true);
        this.setDoubleBuffered(true);
        this.c = this.a();
        this.add((Component)this.c, new ajf_0(-2.0f, -2.0f, 3));
    }

    private JButton a() {
        Dimension dimension = new Dimension(17, 17);
        JButton jButton = new JButton();
        jButton.setBorder(BorderFactory.createEmptyBorder());
        jButton.setBorderPainted(false);
        jButton.setFocusable(false);
        jButton.setFocusPainted(false);
        jButton.setMinimumSize(dimension);
        jButton.setSize(dimension);
        jButton.setPreferredSize(dimension);
        jButton.setMaximumSize(dimension);
        return jButton;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        if (this.d == null) {
            return;
        }
        Image image = this.d.c();
        Image image2 = this.d.g();
        Image image3 = this.d.e();
        int n = this.getHeight();
        int n2 = this.getWidth();
        int n3 = image.getHeight(null);
        int n4 = image3.getHeight(null);
        graphics.drawImage(image, 0, 0, n2, n3, null);
        graphics.drawImage(image2, 0, n3, n2, n - n3 - n4, null);
        graphics.drawImage(image3, 0, n - n4, n2, n4, null);
    }

    public void a(aja_0 aja_02) {
        this.d = aja_02;
        this.c.setIcon(aja_02.x());
        this.c.setRolloverIcon(aja_02.y());
        this.repaint();
    }

    public void a(ActionListener actionListener) {
        this.c.addActionListener(actionListener);
    }
}

