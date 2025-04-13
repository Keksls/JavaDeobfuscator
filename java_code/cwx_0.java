/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cWX
 */
class cwx_0
implements ans_1 {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ cww_0 c;

    cwx_0(cww_0 cww_02, String string, int n) {
        this.c = cww_02;
        this.a = string;
        this.b = n;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (this.a.equals(string)) {
            this.c.d(this.b);
            fpm_0.b().b(this);
        }
    }
}

