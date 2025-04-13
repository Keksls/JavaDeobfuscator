/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eCW
 */
public class ecw_0
extends aen_2 {
    private static final double e = 30.0;

    public ecw_0(short s2, eCQ eCQ2) {
        super(ecw_0.a(s2, eCQ2), (double)eCQ2.f() / 8.0);
    }

    public static double a(short s2, eCQ eCQ2) {
        double d2 = Hw.b((double)(eCQ2.e() - s2), 0.0, 30.0);
        return d2 * (double)(eCQ2.f() - 1) / 30.0;
    }
}

