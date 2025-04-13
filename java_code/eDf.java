/*
 * Decompiled with CFR 0.152.
 */
public class eDf {
    private static float b(ecz_0 ecz_02) {
        eCQ eCQ2 = eCO.a.c(ecz_02.b());
        float f2 = eCQ2.i();
        eDg eDg2 = new eDg(f2);
        ecz_02.a(eDg2);
        return eDg2.a();
    }

    public static boolean a(ecz_0 ecz_02) {
        float f2 = eDf.b(ecz_02);
        return Hw.f().nextDouble() * 100.0 < (double)f2;
    }
}

