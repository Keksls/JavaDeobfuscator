/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Zx
 */
public class zx_0
implements ZD {
    private final int a;
    private final int b;

    public zx_0(int n, int n2) {
        this.a = n;
        this.b = n2;
    }

    @Override
    public void a(zu_0 zu_02, int n) {
        int n2 = zu_0.b(zu_02);
        int n3 = zu_02.g();
        zu_02.b((int)zu_0.c(n2, 60.0f, 60.0f, n3) + this.b);
        zu_02.a(this.a);
        azf_2 azf_22 = zu_02.n().g();
        float f2 = (float)n3 * 0.8f;
        azf_22.b(Hw.b(zu_0.c(Math.min((float)n2, f2), 20.0f, -20.1f, f2), 0.0f, 1.0f));
        zu_02.n().a(azf_22.q(), azf_22.r(), azf_22.s(), azf_22.p());
    }

    private float a(float f2, float f3, int n) {
        boolean bl;
        float f4 = f2 * (float)n / f3;
        int n2 = (int)Math.floor(f4);
        float f5 = f4 - (float)n2;
        boolean bl2 = bl = n2 % 2 == 0;
        if (bl) {
            return f5;
        }
        return 1.0f - f5;
    }
}

