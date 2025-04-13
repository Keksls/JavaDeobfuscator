/*
 * Decompiled with CFR 0.152.
 */
public class ZA
implements ZD {
    private final int a;

    public ZA(int n) {
        this.a = n;
    }

    @Override
    public void a(zu_0 zu_02, int n) {
        int n2 = zu_0.c(zu_02);
        int n3 = zu_02.g();
        int n4 = 0;
        int n5 = (int)zu_0.c(Math.max(0, n2 - this.a), 80.0f, 100.0f, n3);
        if (n2 < this.a) {
            float f2 = 1.0f - (float)n2 / (float)this.a;
            n4 += (int)Hw.a(-5.0f * f2, 5.0f * f2);
        }
        zu_02.b(n5);
        zu_02.a(n4);
        azf_2 azf_22 = zu_02.n().g();
        azf_22.b(zu_0.c(n2, 1.5f, -1.6f, n3));
        zu_02.n().a(azf_22.q(), azf_22.r(), azf_22.s(), azf_22.p());
    }
}

