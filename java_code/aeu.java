/*
 * Decompiled with CFR 0.152.
 */
public class aeu {
    final int a;
    final int b;
    final int c;
    final int d;

    public aeu(int n, int n2, int n3, int n4) {
        this.a = n * 18;
        this.b = n2 * 18;
        this.c = n3;
        this.d = n4;
    }

    public final int a(int n, int n2, int n3) {
        return n - this.a + (n2 - this.b + n3 * this.d) * this.c;
    }
}

