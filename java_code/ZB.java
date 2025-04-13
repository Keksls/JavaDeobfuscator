/*
 * Decompiled with CFR 0.152.
 */
public class ZB
implements ZD {
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final float f;
    private final int g;
    private final int h;
    public static final int a = 100;

    public ZB(int n, int n2, int n3, int n4, float f2, int n5) {
        this.b = n;
        this.c = n2;
        this.d = n3;
        this.e = n4;
        this.f = f2;
        this.g = n5;
        this.h = 0;
    }

    public ZB(int n, int n2, int n3, int n4, float f2, int n5, int n6) {
        this.b = n;
        this.c = n2;
        this.d = n3;
        this.e = n4;
        this.f = f2;
        this.g = n5;
        this.h = n6;
    }

    @Override
    public void a(zu_0 zu_02, int n) {
        int n2 = zu_0.g(zu_02);
        int n3 = zu_02.g();
        azf_2 azf_22 = zu_02.n().g();
        if (n2 > n3 - 500) {
            azf_22.b(zu_0.c(n2 - n3 + 500, 1.5f, -1.6f, 500.0f));
        }
        zu_02.n().a(azf_22.q(), azf_22.r(), azf_22.s(), azf_22.p());
        float f2 = n2 < this.g ? (float)n2 / (float)this.g : 1.0f;
        int n4 = (int)((float)this.b * f2) + this.d;
        int n5 = (int)((float)this.c * f2) + this.e;
        if (n2 < this.h) {
            float f3 = 1.0f - (float)n2 / (float)this.h;
            n4 += (int)Hw.a(-10.0f * f3, 10.0f * f3);
            n5 += (int)Hw.a(-10.0f * f3, 10.0f * f3);
        }
        zu_02.a(n4);
        zu_02.b(n5);
        zu_02.n().b(this.f * f2);
    }
}

