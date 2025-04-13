/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Zz
 */
public class zz_0
implements ZD {
    private final int a;
    private final int b;

    public zz_0(int n, int n2) {
        this.a = n;
        this.b = n2;
    }

    @Override
    public void a(zu_0 zu_02, int n) {
        float f2;
        float f3;
        int n2 = zu_0.d(zu_02);
        int n3 = zu_02.g();
        azf_2 azf_22 = zu_02.n().g();
        azf_22.b(zu_0.c(n2, 1.5f, -1.6f, n3));
        zu_02.n().a(azf_22.q(), azf_22.r(), azf_22.s(), azf_22.p());
        float f4 = 100.0f;
        if ((float)n2 < 100.0f) {
            f3 = 0.75f;
        } else {
            f2 = Hw.b(((float)n2 - 100.0f) / ((float)n3 - 100.0f) * 4.0f, 0.0f, 1.0f);
            f3 = Math.max(0.0f, 0.75f - f2);
        }
        f2 = Math.min(1.0f, (float)n2 / (float)n3 * 4.0f);
        zu_02.a((int)((float)this.a * f2));
        double d2 = Math.PI * (double)f2;
        zu_02.b((int)((double)this.b * Math.abs(Math.sin(d2))) + 60);
        zu_02.n().b(f3);
    }
}

