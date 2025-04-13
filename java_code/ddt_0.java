/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ddt
 */
class ddt_0
implements ans_1 {
    final /* synthetic */ dds_0 a;

    ddt_0(dds_0 dds_02) {
        this.a = dds_02;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals("temporaryTransferInventoryDialog")) {
            azu_0.j().b(dds_0.a());
        }
    }
}

