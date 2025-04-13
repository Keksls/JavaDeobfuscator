/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dcO
 */
class dco_0
implements fzi {
    final /* synthetic */ dcl_0 a;

    dco_0(dcl_0 dcl_02) {
        this.a = dcl_02;
    }

    @Override
    public fzh onDialogCloseRequest(String string) {
        if (string.equals("shukruteRewardDialog")) {
            this.a.c();
            return fzh.d;
        }
        return fzh.a;
    }
}

