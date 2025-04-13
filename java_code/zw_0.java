/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Zw
 */
public class zw_0
implements ZD {
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final float f;
    private final int g;
    public static final int a = 100;

    public zw_0(int n, int n2, int n3, int n4, float f2, int n5) {
        this.b = n;
        this.c = n2;
        this.d = n3;
        this.e = n4;
        this.f = f2;
        this.g = n5;
    }

    @Override
    public void a(zu_0 zu_02, int n) {
        float f2;
        zu_02.n().a(ayc_2.e);
        int n2 = zu_0.f(zu_02);
        int n3 = zu_02.g();
        azf_2 azf_22 = zu_02.n().g();
        if (n2 > n3 - 500) {
            azf_22.b(zu_0.c(n2 - n3 + 500, 1.5f, -1.6f, 500.0f));
        }
        zu_02.n().a(azf_22.q(), azf_22.r(), azf_22.s(), azf_22.p());
        int n4 = this.d;
        int n5 = this.e;
        if (n2 < this.g) {
            f2 = zu_0.a(this.f * 3.0f, this.f, n2, this.g);
        } else if (n2 > this.g + 350) {
            f2 = this.f;
            int n6 = n3 - this.g - 350;
            int n7 = n2 - this.g - 350;
            float f3 = zu_0.a(0.0f, 1.0f, n7, n6);
            n4 += (int)((float)this.b * f3);
            n5 += (int)((float)this.c * f3);
        } else {
            f2 = this.f;
        }
        zu_02.a(n4);
        zu_02.b(n5);
        zu_02.n().b(f2);
    }
}

