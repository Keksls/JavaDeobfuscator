/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aUH
 */
class auh_0
implements fzp_0 {
    final /* synthetic */ aUK a;

    auh_0(aUK aUK2) {
        this.a = aUK2;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            PK pK = new PK();
            pK.a(this.a.i());
            azu_0.j().K().c(pK);
            PE pE = new PE();
            pE.a(this.a.j());
            azu_0.j().K().c(pE);
        }
    }
}

