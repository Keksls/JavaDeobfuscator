/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from adw
 */
public class adw_0
extends aej_0 {
    private static final int d = 64;
    private final float[] e = new float[4096];
    private ahq_0 f;
    private float g;
    private float h;
    private float i = 0.0f;
    private float j = 0.0f;
    private int k;
    private int l;
    private int m;
    private int n;
    private final afr_2 o = new afr_2(-1.0f, 0.5f, 0.0f);
    private boolean p = false;
    float a = 0.5f;
    float b = 0.5f;
    float c = 0.1f;
    private int q = Integer.MIN_VALUE;
    private int r = Integer.MIN_VALUE;
    private float s;
    private float t;
    private float u;
    private float v;
    private final aey_2 w = new adx_0(this);
    private final adt_0 x = new adt_0("cloud.tga", this.w);
    private final adv_0 y = this.x;

    public adw_0() {
        this.m = Integer.MAX_VALUE;
        this.n = Integer.MAX_VALUE;
        Arrays.fill(this.e, 1.0f);
    }

    public void a(String string) {
        if (this.y == this.x) {
            this.x.a(string);
        }
    }

    public void a(ahq_0 ahq_02) {
        this.f = ahq_02;
    }

    public void a(float f2, float f3) {
        this.o.a(f2, f3, 0.0f);
    }

    public void a(float f2) {
        if (!Hw.d(f2, this.b)) {
            this.b = f2;
            this.p = true;
        }
    }

    public void b(float f2) {
        if (!Hw.d(f2, this.a)) {
            this.a = f2;
            this.p = true;
        }
    }

    public void c(float f2) {
        if (!Hw.d(f2 = Hw.b(f2, 0.0f, 1.0f), this.c)) {
            this.c = f2;
            this.p = true;
        }
    }

    @Override
    public void a() {
        ahq_0 ahq_02 = this.f;
        if (ahq_02 == null) {
            return;
        }
        this.m = Hw.c(ahq_02.e_()) - 32;
        this.n = Hw.c(ahq_02.f_()) - 32;
        this.b();
        int n = this.m + this.k;
        int n2 = this.n + this.l;
        if (this.q != n || this.r != n2 || this.p) {
            this.y.a(this.e, 64, 64, n, n2);
        }
        this.p = false;
        this.q = n;
        this.r = n2;
    }

    @Override
    public void b(int n) {
        float f2 = (float)n / 1000.0f;
        this.g = this.o.a() * f2;
        this.h = this.o.b() * f2;
    }

    private void b() {
        this.i -= this.g;
        this.j -= this.h;
        int n = Hw.c(this.i);
        this.k += n;
        this.i -= (float)n;
        int n2 = Hw.c(this.j);
        this.l += n2;
        this.j -= (float)n2;
        float f2 = this.i;
        float f3 = this.j;
        this.s = (1.0f - f2) * (1.0f - f3);
        this.t = (1.0f - f2) * f3;
        this.u = f2 * (1.0f - f3);
        this.v = f2 * f3;
    }

    @Override
    public int e() {
        return 100;
    }

    @Override
    public boolean d() {
        return this.a == 0.0f && this.b == 0.0f;
    }

    @Override
    public void a(int n, int n2, int n3, int n4, float[] fArray) {
        try {
            float[] fArray2 = this.e;
            int n5 = n - this.m;
            if ((n5 %= 64) < 0) {
                n5 += 64;
            }
            int n6 = (n5 + 1) % 64;
            int n7 = n2 - this.n;
            if ((n7 %= 64) < 0) {
                n7 += 64;
            }
            int n8 = (n7 + 1) % 64;
            int n9 = n5 + n7 * 64;
            int n10 = n5 + n8 * 64;
            int n11 = n6 + n7 * 64;
            int n12 = n6 + n8 * 64;
            float f2 = this.s * fArray2[n9] + this.t * fArray2[n10] + this.u * fArray2[n11] + this.v * fArray2[n12];
            fArray[0] = fArray[0] * f2;
            fArray[1] = fArray[1] * f2;
            fArray[2] = fArray[2] * f2;
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

