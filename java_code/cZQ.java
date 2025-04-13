/*
 * Decompiled with CFR 0.152.
 */
class cZQ
implements fzi {
    final /* synthetic */ czn_0 a;

    cZQ(czn_0 czn_02) {
        this.a = czn_02;
    }

    @Override
    public fzh onDialogCloseRequest(String string) {
        if (string.equals("infoDialog")) {
            this.a.c();
            return fzh.d;
        }
        return fzh.a;
    }
}

