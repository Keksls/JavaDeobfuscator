/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.awt.geom.Rectangle2D;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aMN
 */
public class amn_2<T> {
    private static final Logger a = Logger.getLogger(amn_2.class);
    private static final float b = 2.0f;
    private final amo_2<T> c;
    private final int d;

    public amn_2(int n, int n2, int n3, int n4, int n5) {
        this.c = new amo_2(null, n, n2, n3, n4, 0);
        this.d = n5;
    }

    public int a() {
        return this.a(this.c);
    }

    public int a(@NotNull amo_2<T> amo_22) {
        int n = 1;
        for (int k = 0; k < amo_22.b.length; ++k) {
            if (amo_22.b[k] == null) continue;
            n += this.a(amo_22.b[k]);
        }
        return n;
    }

    public int a(@NotNull T t, @NotNull Rectangle2D rectangle2D) {
        return this.a(this.c, t, rectangle2D);
    }

    private int a(@NotNull amo_2<T> amo_22, @NotNull T t, @NotNull Rectangle2D rectangle2D) {
        if (amo_22.d + 1 < this.d) {
            float f2 = (float)(this.c.c.getWidth() / (double)(2 << amo_22.d) / 2.0);
            float f3 = (float)(this.c.c.getHeight() / (double)(2 << amo_22.d) / 2.0);
            float f4 = 2.0f * f2;
            float f5 = 2.0f * f3;
            int n = rectangle2D.getCenterX() <= (double)amo_22.a() ? 0 : 1;
            int n2 = rectangle2D.getCenterY() <= (double)amo_22.b() ? 0 : 1;
            float f6 = n2 == 0 ? -1.0f : 1.0f;
            Rectangle2D.Float float_ = new Rectangle2D.Float();
            ((Rectangle2D)float_).setRect(amo_22.a() + (f2 *= n == 0 ? -1.0f : 1.0f) - f4, amo_22.b() + (f3 *= f6) - f5, f4 * 2.0f, f5 * 2.0f);
            if (float_.contains(rectangle2D)) {
                amo_2 amo_23 = amo_22.b[n | n2 << 1];
                if (amo_23 == null) {
                    amo_22.b[n | n2 << 1] = amo_23 = new amo_2<T>(amo_22, float_, amo_22.d + 1);
                }
                return this.a(amo_23, t, rectangle2D);
            }
        }
        amo_22.e.add(t);
        return amo_22.d;
    }

    public void b() {
        this.c.c();
    }

    public amo_2<T> c() {
        return this.c;
    }
}

