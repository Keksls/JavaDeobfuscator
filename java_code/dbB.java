/*
 * Decompiled with CFR 0.152.
 */
class dbB
implements fzp_0 {
    final /* synthetic */ dbA a;

    dbB(dbA dbA2) {
        this.a = dbA2;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            this.a.d();
        }
    }
}

