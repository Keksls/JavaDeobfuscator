/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.event.MouseInputAdapter;

/*
 * Renamed from aCS
 */
public class acs_1
extends MouseInputAdapter {
    private final JTable a;
    private boolean b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private static final int g = 5;
    private Cursor h;
    private static final Cursor i = Cursor.getPredefinedCursor(9);

    public acs_1(JTable jTable) {
        this.a = jTable;
        this.a.addMouseListener(this);
        this.a.addMouseMotionListener(this);
        this.d = -1;
    }

    public void a() {
        if (this.a == null) {
            return;
        }
        this.a.removeMouseListener(this);
        this.a.removeMouseMotionListener(this);
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        Point point = mouseEvent.getPoint();
        if (this.a(point)) {
            if (this.h == null) {
                this.h = this.a.getCursor();
            }
            this.a.setCursor(i);
        } else {
            this.a.setCursor(this.h);
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        Point point = mouseEvent.getPoint();
        if (this.a(point)) {
            this.b = true;
            this.e = point.y;
            this.f = this.a.getRowHeight(this.d);
            this.c = this.a.getRowSelectionAllowed();
            this.a.setRowSelectionAllowed(false);
        }
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        if (!this.b) {
            return;
        }
        int n = this.f + mouseEvent.getY() - this.e;
        n = Math.max(1, n);
        this.a.setRowHeight(this.d, n);
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        if (!this.b) {
            return;
        }
        this.a.setRowSelectionAllowed(this.c);
        this.b = false;
        this.d = -1;
    }

    private boolean a(Point point) {
        if (!this.a.isEnabled()) {
            return false;
        }
        this.d = this.a.rowAtPoint(point);
        int n = this.a.columnAtPoint(point);
        if (this.d == -1 || n == -1) {
            return false;
        }
        Rectangle rectangle = this.a.getCellRect(this.d, n, true);
        return point.y >= rectangle.y + rectangle.height - 5;
    }
}

