/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bnN
 */
class bnn_1
implements fzi {
    final /* synthetic */ bnl_2 a;

    bnn_1(bnl_2 bnl_22) {
        this.a = bnl_22;
    }

    @Override
    public fzh onDialogCloseRequest(String string) {
        if (string.startsWith("questActivationDialog")) {
            return fzh.d;
        }
        return fzh.a;
    }
}

