/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Component;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ajf
extends MouseAdapter
implements MouseMotionListener {
    private final JFrame a;
    private Dimension b;
    private Component c;
    private boolean d = false;
    private boolean e = false;
    private final ArrayList<JComponent> f = new ArrayList();
    private Point g;
    private Dimension h;
    private boolean i = true;

    public ajf(JFrame jFrame, Component ... componentArray) {
        this.a = jFrame;
        for (Component component : componentArray) {
            this.a(component);
        }
    }

    public void a(Dimension dimension) {
        this.b = dimension;
    }

    public void a(JComponent ... jComponentArray) {
        for (JComponent jComponent : jComponentArray) {
            if (this.f.contains(jComponent)) continue;
            this.f.add(jComponent);
        }
    }

    public void a(Component ... componentArray) {
        for (Component component : componentArray) {
            component.removeMouseListener(this);
        }
    }

    public void a(boolean bl) {
        this.i = bl;
    }

    public void a(Component component) {
        component.addMouseListener(this);
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        if (!this.i) {
            return;
        }
        this.a(mouseEvent);
    }

    private void a(MouseEvent mouseEvent) {
        if (!this.a.isResizable()) {
            return;
        }
        if (this.a.getExtendedState() == 6) {
            return;
        }
        this.c = mouseEvent.getComponent();
        this.c.addMouseMotionListener(this);
        this.g = new Point(mouseEvent.getPoint());
        Point point = SwingUtilities.convertPoint(this.c, this.g, this.a);
        this.d = point.x >= this.a.getWidth() - 10;
        this.e = point.y >= this.a.getHeight() - 10;
        SwingUtilities.convertPointToScreen(this.g, this.c);
        this.h = this.a.getSize();
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        if (this.c == null) {
            return;
        }
        PointerInfo pointerInfo = MouseInfo.getPointerInfo();
        if (pointerInfo == null) {
            return;
        }
        Point point = pointerInfo.getLocation();
        int n = this.h.width;
        int n2 = this.h.height;
        if (this.d) {
            n += point.x - this.g.x;
        }
        if (this.e) {
            n2 += point.y - this.g.y;
        }
        if (this.b != null) {
            if (n < this.b.width) {
                n = this.b.width;
            }
            if (n2 < this.b.height) {
                n2 = this.b.height;
            }
        }
        this.a.setSize(n, n2);
        this.a.setVisible(true);
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        if (this.c != null) {
            this.c.removeMouseMotionListener(this);
        }
        this.c = null;
    }
}

