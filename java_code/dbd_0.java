/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dbD
 */
class dbd_0
implements ans_1 {
    final /* synthetic */ dbA a;

    dbd_0(dbA dbA2) {
        this.a = dbA2;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals("optionsDialog")) {
            azu_0.j().b(dbA.a());
        }
    }
}

