/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ddN
 */
class ddn_0
implements ans_1 {
    final /* synthetic */ ddm_0 a;

    ddn_0(ddm_0 ddm_02) {
        this.a = ddm_02;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals("weatherInfoSmallDialog")) {
            azu_0.j().b(ddm_0.a());
        }
    }
}

