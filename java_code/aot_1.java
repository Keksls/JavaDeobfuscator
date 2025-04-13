/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aot
 */
public abstract class aot_1
extends apc_2 {
    public static void a(aot_2 ... aot_2Array) {
        if (aot_2Array.length != 2) {
            throw new aos_2("On essaie d'appliquer un op\u00e9rateur bool\u00e9en au mauvais nombre d'arguments ");
        }
        for (aot_2 aot_22 : aot_2Array) {
            if (aot_22.t_() == aov_1.c) continue;
            throw new aos_2("On essaie d'appliquer un op\u00e9rateur bool\u00e9en \u00e0 autre chose que des bool\u00e9ens...");
        }
    }
}

