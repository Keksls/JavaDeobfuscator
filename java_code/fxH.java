/*
 * Decompiled with CFR 0.152.
 */
public abstract class fxH
extends fxA {
    private fxI c = fxI.a;
    protected fxQ a;
    private int d = 0;
    private int e = 0;
    protected fro_0 b = null;

    public abstract int f();

    public fxI g() {
        return this.c;
    }

    protected void a(fxI fxI2) {
        this.c = fxI2;
    }

    public fxQ h() {
        return this.a;
    }

    public void a(fxQ fxQ2) {
        this.a = fxQ2;
    }

    public int i() {
        return this.d;
    }

    public void c(int n) {
        this.d = n;
    }

    public int j() {
        return this.e;
    }

    public void d(int n) {
        this.e = n;
    }

    public fro_0 k() {
        if (this.b == null && this.a != null) {
            return this.a.e();
        }
        return this.b;
    }

    public void a(fro_0 fro_02) {
        this.b = fro_02;
    }

    public abstract int a(ayf_2 var1, int var2);

    public abstract int b(ayf_2 var1, int var2);

    public abstract int c(ayf_2 var1, int var2);
}

