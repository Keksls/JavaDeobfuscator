/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cZm
 */
class czm_0
implements fzp_0 {
    final /* synthetic */ String a;
    final /* synthetic */ cZl b;

    czm_0(cZl cZl2, String string) {
        this.b = cZl2;
        this.a = string;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n != 2) {
            return;
        }
        cns cns2 = new cns(this.a, this.b.d.f());
        azu_0.j().K().c(cns2);
    }
}

