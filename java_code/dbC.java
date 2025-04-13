/*
 * Decompiled with CFR 0.152.
 */
class dbC
implements fzi {
    final /* synthetic */ dbA a;

    dbC(dbA dbA2) {
        this.a = dbA2;
    }

    @Override
    public fzh onDialogCloseRequest(String string) {
        cIi.cancel(null);
        return fzh.d;
    }
}

