/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cXd
 */
class cxd_0
implements ans_1 {
    final /* synthetic */ cxb_0 a;

    cxd_0(cxb_0 cxb_02) {
        this.a = cxb_02;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals("chatOptionsDialog")) {
            azu_0.j().b(cxb_0.a());
        }
    }
}

