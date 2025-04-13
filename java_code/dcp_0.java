/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dcp
 */
class dcp_0
implements ans_1 {
    final /* synthetic */ dce a;

    dcp_0(dce dce2) {
        this.a = dce2;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals("protectorManagementDialog")) {
            azu_0.j().b(dce.a());
        }
    }
}

