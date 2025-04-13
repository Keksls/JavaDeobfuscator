/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Zv
 */
public class zv_0
implements ZD {
    public static final float a = 0.5f;
    private int b;
    private int c;
    private float d;

    public zv_0() {
    }

    public zv_0(int n, int n2) {
        this(n, n2, 0.5f);
    }

    public zv_0(int n, int n2, float f2) {
        this.b = n;
        this.c = n2;
        this.d = f2;
    }

    @Override
    public void a(zu_0 zu_02, int n) {
        int n2 = zu_0.a(zu_02);
        int n3 = zu_02.g();
        zu_02.a(this.b);
        zu_02.b((int)zu_0.c(n2, 60.0f, 50.0f, n3) + this.c);
        azf_2 azf_22 = zu_02.n().g();
        azf_22.b(zu_0.c(n2, 1.5f, -1.6f, n3));
        zu_02.n().a(azf_22.q(), azf_22.r(), azf_22.s(), azf_22.p());
        zu_02.n().b(this.d);
    }
}

