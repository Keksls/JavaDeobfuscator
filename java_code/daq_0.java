/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from daq
 */
class daq_0
implements ans_1 {
    final /* synthetic */ dao a;

    daq_0(dao dao2) {
        this.a = dao2;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals("fleaDialog") || string.equals("inventoryDialog")) {
            azu_0.j().b(dao.d());
        }
    }
}

