/*
 * Decompiled with CFR 0.152.
 */
public class ZC
implements ZD {
    private final int a;
    private final int b;
    private final float c;

    public ZC(int n, int n2, float f2) {
        this.a = n;
        this.b = n2;
        this.c = f2;
    }

    public ZC(int n, int n2) {
        this(n, n2, 1.0f);
    }

    @Override
    public void a(zu_0 zu_02, int n) {
        zu_02.a(this.a);
        zu_02.b(this.b);
        azf_2 azf_22 = zu_02.n().g();
        zu_02.n().a(azf_22.q(), azf_22.r(), azf_22.s(), azf_22.p());
        zu_02.n().b(this.c);
    }
}

