/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Component;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.Insets;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ajd
extends MouseAdapter
implements MouseMotionListener {
    private final JFrame a;
    private Component b;
    private Point c;
    private Point d;
    private aje[] e;

    public ajd(JFrame jFrame, Component ... componentArray) {
        this.a = jFrame;
        this.b(componentArray);
    }

    public void a(Component ... componentArray) {
        for (Component component : componentArray) {
            component.removeMouseListener(this);
        }
    }

    public void b(Component ... componentArray) {
        for (Component component : componentArray) {
            component.addMouseListener(this);
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        this.a(mouseEvent);
    }

    private void a(MouseEvent mouseEvent) {
        if (this.a.getExtendedState() == 6) {
            return;
        }
        this.b = mouseEvent.getComponent();
        this.b.addMouseMotionListener(this);
        GraphicsDevice[] graphicsDeviceArray = ajh_0.e.getScreenDevices();
        this.e = new aje[graphicsDeviceArray.length];
        for (int k = 0; k < graphicsDeviceArray.length; ++k) {
            GraphicsDevice graphicsDevice = graphicsDeviceArray[k];
            GraphicsConfiguration graphicsConfiguration = graphicsDevice.getDefaultConfiguration();
            Rectangle rectangle = graphicsConfiguration.getBounds();
            Insets insets = Toolkit.getDefaultToolkit().getScreenInsets(graphicsConfiguration);
            aje aje2 = new aje();
            aje2.a = (int)rectangle.getMinX();
            aje2.b = (int)rectangle.getMaxX();
            aje2.c = (int)rectangle.getMinY() + insets.top;
            aje2.d = (int)rectangle.getMaxY() - insets.bottom;
            this.e[k] = aje2;
        }
        this.c = new Point(mouseEvent.getPoint());
        SwingUtilities.convertPointToScreen(this.c, this.b);
        this.d = this.a.getLocation();
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        if (this.b == null || this.e == null) {
            return;
        }
        PointerInfo pointerInfo = MouseInfo.getPointerInfo();
        if (pointerInfo == null) {
            return;
        }
        this.a(pointerInfo.getLocation());
    }

    private void a(Point point) {
        int n = point.x;
        int n2 = point.y;
        int n3 = n - this.c.x;
        int n4 = n2 - this.c.y;
        int n5 = this.d.x + n3;
        int n6 = this.d.y + n4;
        for (aje aje2 : this.e) {
            if (n < aje2.a || n >= aje2.b) continue;
            n6 = Math.max(Math.min(n6, aje2.d), aje2.c);
        }
        this.a.setLocation(n5, n6);
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        if (this.b != null) {
            this.b.removeMouseMotionListener(this);
            this.b = null;
        }
        this.e = null;
    }
}

