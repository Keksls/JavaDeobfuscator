/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dae
 */
class dae_0
implements fzp_0 {
    final /* synthetic */ long a;
    final /* synthetic */ byte b;
    final /* synthetic */ long c;
    final /* synthetic */ dab_0 d;

    dae_0(dab_0 dab_02, long l, byte by, long l2) {
        this.d = dab_02;
        this.a = l;
        this.b = by;
        this.c = l2;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            cmh cmh2 = new cmh(this.a, this.b, this.c);
            azu_0.j().K().c(cmh2);
        }
    }
}

