/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cXf
 */
class cxf_0
implements ans_1 {
    final /* synthetic */ cxe_0 a;

    cxf_0(cxe_0 cxe_02) {
        this.a = cxe_02;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals("chestLootDialog")) {
            azu_0.j().b(cxe_0.a());
        }
    }
}

