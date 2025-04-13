/*
 * Decompiled with CFR 0.152.
 */
public class amI
extends anh_1<amJ> {
    private final int g;
    private final int h;
    private final int i;
    private final boolean j;

    public amI(amJ amJ2, float f2, int n, int n2, int n3, boolean bl) {
        this(amJ2, f2, 1.0f, 1.0f, n, n2, n3, bl);
    }

    public amI(amJ amJ2, float f2, float f3, float f4, int n, int n2, int n3, boolean bl) {
        super(amJ2, f2, f3, f4);
        this.g = n;
        this.h = n2;
        this.i = n3;
        this.j = bl;
    }

    public int a() {
        return this.g;
    }

    public int b() {
        return this.h;
    }

    public int e() {
        return this.i;
    }

    public boolean f() {
        return this.j;
    }
}

