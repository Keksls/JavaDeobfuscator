/*
 * Decompiled with CFR 0.152.
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * Renamed from ajx
 */
class ajx_0
extends JPanel {
    private static final int a = 17;
    private static final int b = 17;
    final ajc_0 c;
    private final JButton d;
    private final JButton e;
    private final JButton f;
    private aja_0 g;
    private boolean h = false;

    ajx_0(ajc_0 ajc_02) {
        super(new BorderLayout(1, 3));
        this.c = ajc_02;
        this.setFocusable(false);
        this.setBorder(BorderFactory.createEmptyBorder());
        this.setOpaque(true);
        this.setDoubleBuffered(true);
        JPanel jPanel = new JPanel(new FlowLayout(3, 1, 3));
        jPanel.setOpaque(false);
        this.add((Component)jPanel, "Before");
        int n = 20;
        Container container = new Container();
        container.setSize(new Dimension(20, 1));
        container.setMinimumSize(new Dimension(20, 1));
        container.setMaximumSize(new Dimension(20, 1));
        container.setPreferredSize(new Dimension(20, 1));
        jPanel.add(container);
        JPanel jPanel2 = new JPanel(new FlowLayout(4, 1, 3));
        jPanel2.setOpaque(false);
        this.add((Component)jPanel2, "After");
        this.d = this.c();
        jPanel2.add(this.d);
        if (this.c != null) {
            this.d.addActionListener(new ajy_0(this));
        }
        this.e = this.c();
        jPanel2.add(this.e);
        if (this.c != null) {
            this.e.addActionListener(new ajz_0(this));
        }
        this.f = this.c();
        jPanel2.add(this.f);
        this.f.addActionListener(new ajA(this));
        Container container2 = new Container();
        container2.setSize(new Dimension(2, 1));
        container2.setMinimumSize(new Dimension(2, 1));
        container2.setMaximumSize(new Dimension(2, 1));
        container2.setPreferredSize(new Dimension(2, 1));
        jPanel2.add(container2);
        if (this.c != null) {
            this.addMouseListener(new ajb_0(this));
        }
    }

    public void a(boolean bl) {
        this.h = bl;
        this.a(this.g);
    }

    private JButton c() {
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
        jButton.setContentAreaFilled(false);
        return jButton;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        if (this.g == null) {
            return;
        }
        int n = this.g.i().getWidth(null);
        int n2 = this.g.m().getWidth(null);
        int n3 = this.getHeight();
        int n4 = this.getWidth();
        graphics.drawImage(this.g.i(), 0, 0, n, n3, null);
        graphics.drawImage(this.g.m(), n4 - n2, 0, n2, n3, null);
        graphics.drawImage(this.g.k(), n, 0, n4 - n - n2, n3, null);
    }

    void a(aja_0 aja_02) {
        this.g = aja_02;
        if (!this.h) {
            this.e.setIcon(aja_02.B());
            this.e.setRolloverIcon(aja_02.C());
        } else {
            this.e.setIcon(aja_02.D());
            this.e.setRolloverIcon(aja_02.E());
        }
        this.d.setIcon(aja_02.z());
        this.d.setRolloverIcon(aja_02.A());
        this.f.setIcon(aja_02.x());
        this.f.setRolloverIcon(aja_02.y());
        this.repaint();
    }

    Component a() {
        return this.e;
    }

    Component b() {
        return this.d;
    }
}

