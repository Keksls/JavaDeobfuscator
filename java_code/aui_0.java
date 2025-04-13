/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aUI
 */
class aui_0
implements fzp_0 {
    final /* synthetic */ aUK a;

    aui_0(aUK aUK2) {
        this.a = aUK2;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            PJ pJ = new PJ();
            pJ.a(this.a.i());
            azu_0.j().K().c(pJ);
            PF pF = new PF();
            pF.a(this.a.j());
            azu_0.j().K().c(pF);
        }
    }
}

