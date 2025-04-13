/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cXt
 */
class cxt_0
implements ans_1 {
    final /* synthetic */ cxs_0 a;

    cxt_0(cxs_0 cxs_02) {
        this.a = cxs_02;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals("contactListDialog")) {
            azu_0.j().b(cxs_0.a());
        }
    }
}

