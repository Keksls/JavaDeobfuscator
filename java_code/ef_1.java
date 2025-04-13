/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from EF
 */
public final class ef_1 {
    private ef_1() {
    }

    public static void a(ga_0 ga_02, fy_0 fy_02, boolean bl, eg_1 eg_12) {
        try {
            int n = eg_12.b() & 0xFFFF;
            gc_0[] gc_0Array = new gc_0[n];
            for (int k = 0; k < n; ++k) {
                gc_0 gc_02;
                gc_0Array[k] = gc_02 = ei_2.a(fy_02, eg_12);
                if (gc_02 == null || gc_02.i() == 0 || !bl || !ef_1.a(gc_02.b())) continue;
                gc_0Array[k] = null;
            }
            ga_02.a(gc_0Array);
        }
        catch (IOException iOException) {
            throw new IllegalStateException("unable to load sprite definitions", iOException);
        }
        ef_1.a(ga_02);
    }

    private static void a(ga_0 ga_02) {
        ga_02.b().forEach(gc_02 -> {
            if (gc_02 == null || gc_02.b() == null) {
                return;
            }
            for (String string : cg_0.b) {
                if (!gc_02.b().contains(string)) continue;
                cg_0.c.add(gc_02.d());
                return;
            }
        });
    }

    private static boolean a(String string) {
        if (string == null || string.trim().isEmpty() || "null".equals(string)) {
            return false;
        }
        if (!string.startsWith("_Anim", 1)) {
            return false;
        }
        char c2 = string.charAt(0);
        return c2 == '3' || c2 == '4' || c2 == '7';
    }
}

