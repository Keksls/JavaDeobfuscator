/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from epF
 */
class epf_2 {
    private final acn_2<String, Runnable> a = new acn_2();

    epf_2() {
    }

    public void a(String string, Runnable runnable) {
        if (!this.a.c(string)) {
            this.a.a(string, runnable);
        }
    }

    void a() {
        int n = this.a.d();
        for (int k = 0; k < n; ++k) {
            this.a.c(k).run();
        }
    }
}

