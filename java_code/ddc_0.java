/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ddc
 */
class ddc_0
implements ans_1 {
    final /* synthetic */ ddb_0 a;

    ddc_0(ddb_0 ddb_02) {
        this.a = ddb_02;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals(this.a.b)) {
            this.a.b = null;
        }
    }
}

