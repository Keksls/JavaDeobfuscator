/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ahZ
 */
public class ahz_0
implements ahy_0 {
    private static final Logger a = Logger.getLogger(ahz_0.class);
    private ahv_0 b;
    private int c;
    private int d;
    private final int e;
    private final int f;
    private final float g;
    private final float h;

    public ahz_0(abY abY2, int n, int n2) {
        this.g = abY2.g_();
        this.h = abY2.h_();
        this.e = n;
        this.f = n2;
        this.a(n, n2);
    }

    public void a(ahv_0 ahv_02) {
        this.b = ahv_02;
    }

    public void a(int n, int n2) {
        this.c = n;
        this.d = n2;
    }

    @Override
    public afd_1 a(ahg_0 ahg_02, ahq_0 ahq_02) {
        float f2 = 1.0f / ahq_02.f();
        afd_1 afd_12 = this.a(f2);
        float f3 = 500.0f;
        afd_12.a = Hw.b(afd_12.a, -500.0f, 500.0f);
        afd_12.b = Hw.b(afd_12.b, -500.0f, 500.0f);
        afd_12.a += this.g;
        afd_12.b += this.h;
        return afd_12;
    }

    private afd_1 a(float f2) {
        float f3 = this.c - this.e;
        float f4 = -(this.d - this.f);
        f3 = -f3;
        f4 = -f4;
        return new afd_1(f3 *= f2, f4 *= f2);
    }
}

