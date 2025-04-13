/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cfS
 */
class cfs_2
implements fzp_0 {
    final /* synthetic */ fcu_0 a;
    final /* synthetic */ cfq_1 b;

    cfs_2(cfq_1 cfq_12, fcu_0 fcu_02) {
        this.b = cfq_12;
        this.a = fcu_02;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        bmr_1 bmr_12 = azu_0.j().k();
        faX faX2 = bmr_12.fE().m();
        byte by = n == 8 ? (byte)1 : 2;
        faX2.a(bmr_12.a_(), by, this.a.a());
    }
}

