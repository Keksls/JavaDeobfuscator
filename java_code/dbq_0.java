/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dbq
 */
class dbq_0
implements ans_1 {
    final /* synthetic */ dbp a;

    dbq_0(dbp dbp2) {
        this.a = dbp2;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals("informationMessageDialog")) {
            azu_0.j().b(this.a);
        }
    }
}

