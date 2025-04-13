/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Graphics;

/*
 * Renamed from abS
 */
public class abs_0 {
    private final afq_2 a;
    private final Color b;

    public abs_0(afq_2 afq_22, Color color) {
        this.a = afq_22;
        this.b = color;
    }

    public abs_0(float f2, float f3, Color color) {
        this.a = new afq_2(f2, f3);
        this.b = color;
    }

    void a(Graphics graphics, int n, int n2) {
        graphics.setColor(this.b);
        graphics.drawOval(Math.round(this.a.a() + (float)n - 2.5f), Math.round(-this.a.b() + (float)n2 - 2.5f), 5, 5);
    }
}

