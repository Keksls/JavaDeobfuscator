/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Rectangle;

class fyT
extends Rectangle {
    private final frm_0 a;

    public fyT(int n, int n2, int n3, int n4, frm_0 frm_02) {
        super(n, n2, n3, n4);
        this.a = frm_02;
    }

    public frm_0 a() {
        return this.a;
    }

    public int a(int n) {
        int n2 = (int)this.getX();
        if (this.a == frm_0.c) {
            n2 = (int)((double)n2 + (this.getWidth() - (double)n));
        }
        return n2;
    }

    public int b(int n) {
        int n2 = (int)this.getY();
        if (this.a == frm_0.a) {
            n2 = (int)((double)n2 + (this.getHeight() - (double)n));
        }
        return n2;
    }

    public boolean c(int n) {
        if (this.a == frm_0.c) {
            return (double)n > this.getX();
        }
        return (double)n < this.getX() + this.getWidth();
    }

    public boolean d(int n) {
        if (this.a == frm_0.a) {
            return (double)n > this.getY();
        }
        return (double)n < this.getY() + this.getHeight();
    }

    public int e(int n) {
        if (this.a == frm_0.c) {
            return -n;
        }
        return n;
    }

    public int f(int n) {
        if (this.a == frm_0.a) {
            return -n;
        }
        return n;
    }
}

