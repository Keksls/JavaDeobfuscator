/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aoO
 */
public abstract class aoo_2
extends apc_2 {
    public static void a(aot_2 ... aot_2Array) {
        if (aot_2Array.length != 2) {
            throw new aos_2("On essaie d'appliquer un op\u00e9rateur num\u00e9rique au mauvais nombre d'arguments ");
        }
        if (aot_2Array[0] == null || aot_2Array[1] == null) {
            throw new aos_2("Un des 2 param\u00e8tres a \u00e9t\u00e9 impossible \u00e0 parser");
        }
        for (aot_2 aot_22 : aot_2Array) {
            if (aot_22.t_() == aov_1.b || aot_22.t_() == aov_1.f) continue;
            throw new aos_2("On essaie d'appliquer un op\u00e9rateur num\u00e9rique \u00e0 autre chose que des nombres...");
        }
    }
}

