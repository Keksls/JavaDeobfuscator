/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cfn
 */
class cfn_2
implements fzp_0 {
    final /* synthetic */ caw_0 a;
    final /* synthetic */ cfm_1 b;

    cfn_2(cfm_1 cfm_12, caw_0 caw_02) {
        this.b = cfm_12;
        this.a = caw_02;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        czj_1 czj_12 = new czj_1();
        czj_12.a(n == 8 ? (byte)8 : 7);
        czj_12.a(this.a.d());
        azu_0.j().K().c(czj_12);
    }
}

