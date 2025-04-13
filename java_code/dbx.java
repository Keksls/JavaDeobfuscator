/*
 * Decompiled with CFR 0.152.
 */
class dbx
implements fac_2 {
    final /* synthetic */ dbv_0 a;

    dbx(dbv_0 dbv_02) {
        this.a = dbv_02;
    }

    @Override
    public void a() {
        if (this.a.b) {
            this.a.a.b(true);
        } else {
            this.a.c = true;
        }
        this.a.f.removeListContentLoadListener(this);
    }
}

