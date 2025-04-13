/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aoP
 */
public abstract class aop_2
extends aoq_1 {
    private boolean a = false;

    @Override
    public void s_() {
        this.a = !this.a;
    }

    protected boolean f() {
        return this.a;
    }

    public static void a(aot_2 ... aot_2Array) {
        if (aot_2Array.length != 2) {
            throw new aos_2("On essaie d'appliquer un op\u00e9rateur num\u00e9rique au mauvais nombre d'arguments ");
        }
        for (aot_2 aot_22 : aot_2Array) {
            if (aot_22.t_() == aov_1.b) continue;
            throw new aos_2("On essaie d'appliquer un op\u00e9rateur num\u00e9rique \u00e0 autre chose que des nombres...");
        }
    }
}

