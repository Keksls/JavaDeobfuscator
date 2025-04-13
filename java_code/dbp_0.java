/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dbP
 */
class dbp_0
implements fzp_0 {
    final /* synthetic */ long a;
    final /* synthetic */ dbO b;

    dbp_0(dbO dbO2, long l) {
        this.b = dbO2;
        this.a = l;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            this.b.d.b(this.a);
        }
    }
}

