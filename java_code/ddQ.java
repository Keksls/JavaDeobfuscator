/*
 * Decompiled with CFR 0.152.
 */
class ddQ
implements ans_1 {
    final /* synthetic */ String a;
    final /* synthetic */ bss_0 b;
    final /* synthetic */ ddO c;

    ddQ(ddO ddO2, String string, bss_0 bss_02) {
        this.c = ddO2;
        this.a = string;
        this.b = bss_02;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (!this.a.equals(string)) {
            return;
        }
        if (this.c.m != null) {
            this.c.m.c(this.b);
        }
        fpm_0.b().b(this);
    }
}

