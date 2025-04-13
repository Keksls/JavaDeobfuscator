/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ftr
 */
class ftr_0
implements ans_1 {
    final /* synthetic */ ftn_0 a;

    ftr_0(ftn_0 ftn_02) {
        this.a = ftn_02;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (this.a.f == null) {
            return;
        }
        if (string.equals(this.a.h)) {
            this.a.setClient(null);
            this.a.setContent(null);
        }
    }
}

