/*
 * Decompiled with CFR 0.152.
 */
class cXk
implements anm_2 {
    private final Runnable b = new cxl_0(this);
    final /* synthetic */ cXj a;

    cXk(cXj cXj2) {
        this.a = cXj2;
    }

    @Override
    public void a() {
    }

    @Override
    public void b() {
    }

    @Override
    public void c() {
    }

    @Override
    public void a(float f2) {
        if (this.a.d == f2) {
            return;
        }
        this.a.d = f2;
        if (this.a.d == 0.0f) {
            ado_1.a().a(this.b, 50L);
        } else if (this.a.d == 100.0f) {
            ado_1.a().b(this.b);
            fis_1.a().a((ajf_1)this.a, "bufferingDesc");
        }
    }
}

