/*
 * Decompiled with CFR 0.152.
 */
public final class bOE {
    private bOE() {
    }

    public static boolean a(fii fii2) {
        return fii2 == null || fii2.b().isEmpty();
    }

    public static void a(afe_0 afe_02, fii fii2) {
        bOE.a(afe_02, fii2, true);
    }

    public static void b(afe_0 afe_02, fii fii2) {
        bOE.a(afe_02, fii2, false);
    }

    private static void a(afe_0 afe_02, fii fii2, boolean bl) {
        Object object;
        Object object2 = object = bl ? fii2.b() : bOE.b(fii2) + "-Fin";
        if (((String)object).isEmpty()) {
            return;
        }
        afe_02.e((String)object);
        afe_02.m(fii2.f());
    }

    public static String b(fii fii2) {
        String string = fii2.b();
        int n = string.lastIndexOf("-Debut");
        return n == -1 ? string : string.substring(0, n);
    }
}

