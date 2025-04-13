/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;
import java.awt.Rectangle;

/*
 * Renamed from fJs
 */
public class fjs_2
extends fjh_2<Rectangle> {
    private final boolean a;

    public fjs_2(Rectangle rectangle, Rectangle rectangle2, fvE fvE2, boolean bl, int n, int n2, fjw_2 fjw_22) {
        super(rectangle, rectangle2, fvE2, n, n2, fjw_22);
        if (rectangle == null) {
            this.a(new Rectangle(new Point(0, 0), fvE2.getSize()));
        }
        this.a = bl;
    }

    @Override
    public boolean a(int n) {
        if (!super.a(n)) {
            return false;
        }
        if (this.c == null) {
            return true;
        }
        Rectangle rectangle = (Rectangle)this.j;
        Rectangle rectangle2 = (Rectangle)this.k;
        int n2 = (int)this.c.a(rectangle.x, rectangle2.x, this.d, this.e);
        int n3 = (int)this.c.a(rectangle.y, rectangle2.y, this.d, this.e);
        int n4 = (int)this.c.a(rectangle.width, rectangle2.width, this.d, this.e);
        int n5 = (int)this.c.a(rectangle.height, rectangle2.height, this.d, this.e);
        this.c().setScissor(new Rectangle(n2, n3, n4, n5));
        return true;
    }

    @Override
    public void a() {
        if (this.a) {
            this.c().setScissor(null);
        } else {
            this.c().setScissor((Rectangle)this.k);
        }
        super.a();
    }

    public String toString() {
        return "[" + this.getClass().getSimpleName() + "]" + this.j + " -> " + this.k;
    }
}

