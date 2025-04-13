/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cXl
 */
class cxl_0
implements Runnable {
    private float b = 0.0f;
    private boolean c = true;
    final /* synthetic */ cXk a;

    cxl_0(cXk cXk2) {
        this.a = cXk2;
    }

    @Override
    public void run() {
        ani_2 ani_22 = new ani_2();
        this.a.a.f = "1.0,1.0,1.0," + this.b;
        ani_22.a((CharSequence)bae.h().a("videoLoading", new Object[0]));
        this.a.a.e = ani_22.r();
        fis_1.a().a((ajf_1)this.a.a, "bufferingDesc", "modulationColor");
        if (this.c) {
            this.b += 0.04f;
            if (this.b >= 1.0f) {
                this.b = 1.0f;
                this.c = false;
            }
        } else {
            this.b -= 0.04f;
            if (this.b <= 0.0f) {
                this.b = 0.0f;
                this.c = true;
            }
        }
    }
}

