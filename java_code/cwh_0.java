/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cWh
 */
class cwh_0
implements ans_1 {
    final /* synthetic */ cwg_0 a;

    cwh_0(cwg_0 cwg_02) {
        this.a = cwg_02;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals("battlegroundListDialog")) {
            azu_0.j().b(cwg_0.a());
        }
    }
}

