/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dbi
 */
class dbi_0
implements ans_1 {
    final /* synthetic */ dbd a;

    dbi_0(dbd dbd2) {
        this.a = dbd2;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals("nationDialog")) {
            azu_0.j().b(dbd.a());
        }
    }
}

