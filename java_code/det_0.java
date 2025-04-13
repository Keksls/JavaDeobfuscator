/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from deT
 */
class det_0
implements fzp_0 {
    final /* synthetic */ erl_1 a;
    final /* synthetic */ des_0 b;

    det_0(des_0 des_02, erl_1 erl_12) {
        this.b = des_02;
        this.a = erl_12;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n != 2) {
            return;
        }
        byp_2.a().e(this.a.a());
    }
}

