/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;
import java.awt.geom.Rectangle2D;

/*
 * Renamed from ayl
 */
class ayl_2 {
    private final String b;
    private final Point c;
    private final Rectangle2D d;
    private long e;
    final /* synthetic */ aya_1 a;

    ayl_2(aya_1 aya_12, String string, Point point, Rectangle2D rectangle2D) {
        this.a = aya_12;
        this.b = string;
        this.c = point;
        this.d = rectangle2D;
        this.e = aya_12.B;
    }

    String a() {
        return this.b;
    }

    Point b() {
        return this.c;
    }

    int c() {
        return (int)(-this.d.getMinX());
    }

    int d() {
        return (int)(-this.d.getMinY());
    }

    Rectangle2D e() {
        return this.d;
    }

    boolean f() {
        return this.a.B - this.e < 10000L;
    }

    void g() {
        this.e = this.a.B;
    }

    void h() {
        this.e = 0L;
    }
}

