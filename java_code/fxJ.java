/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Rectangle;

public class fxJ {
    private fxH a;
    private final Rectangle b = new Rectangle();
    private int c = 0;

    public fxH a() {
        return this.a;
    }

    public void a(fxH fxH2) {
        this.a = fxH2;
    }

    public Rectangle b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public void a(int n) {
        this.c = n;
    }

    public String toString() {
        return this.getClass().getSimpleName() + " bounds=" + this.b.toString();
    }
}

