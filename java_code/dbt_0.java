/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dbT
 */
class dbt_0
implements ans_1 {
    final /* synthetic */ dbr_0 a;

    dbt_0(dbr_0 dbr_02) {
        this.a = dbr_02;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals("passportDialog")) {
            azu_0.j().b(dbr_0.a());
        }
    }
}

