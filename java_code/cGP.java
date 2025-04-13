/*
 * Decompiled with CFR 0.152.
 */
class cGP
implements fzp_0 {
    final /* synthetic */ exk_2 a;

    cGP(exk_2 exk_22) {
        this.a = exk_22;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            cgo_0.b.info((Object)("[MIMISYMBIC] Demande de retrait de skin sur l'item " + this.a));
            cpu_0 cpu_02 = new cpu_0(this.a.a());
            azu_0.j().K().c(cpu_02);
        }
    }
}

