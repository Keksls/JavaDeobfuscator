/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aMO
 */
public class amo_2<T> {
    final amo_2<T> a;
    final amo_2<T>[] b;
    final Rectangle2D c;
    final int d;
    final Collection<T> e;

    amo_2(amo_2<T> amo_22, float f2, float f3, float f4, float f5, int n) {
        this(amo_22, new Rectangle2D.Float(f2, f3, f4, f5), n);
    }

    amo_2(amo_2<T> amo_22, @NotNull Rectangle2D rectangle2D, int n) {
        this.a = amo_22;
        this.c = rectangle2D;
        this.d = n;
        this.b = new amo_2[4];
        this.e = new ArrayList<T>();
    }

    float a() {
        return (int)this.c.getCenterX();
    }

    float b() {
        return (int)this.c.getCenterY();
    }

    void c() {
        for (int k = this.b.length - 1; k >= 0; --k) {
            this.b[k] = null;
        }
        this.e.clear();
    }

    public Iterator<T> d() {
        return this.e.iterator();
    }

    public amo_2 e() {
        return this.a;
    }

    public amo_2<T>[] f() {
        return this.b;
    }

    public Rectangle2D g() {
        return this.c;
    }

    public int h() {
        return this.d;
    }
}

