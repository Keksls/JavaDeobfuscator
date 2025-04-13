/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cWv
 */
class cwv_0
implements fac_2 {
    private final fsQ a;
    private final fvk_0 b;
    private float c;

    cwv_0(fsQ fsQ2, fvk_0 fvk_02) {
        this.a = fsQ2;
        this.b = fvk_02;
    }

    @Override
    public void a() {
        fkm_1.a(this.b);
        if (this.c == -1.0f) {
            this.c = this.a.getOffset();
        } else {
            this.a.setOffset(this.c);
        }
    }

    public void a(float f2) {
        this.c = f2;
    }
}

