/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fzG
 */
class fzg_0
implements fzc_0<fzi_0> {
    final /* synthetic */ fzd_0 a;

    fzg_0(fzd_0 fzd_02) {
        this.a = fzd_02;
    }

    @Override
    public fvE a(fzi_0 fzi_02) {
        if (fzi_02 == null) {
            return null;
        }
        if (fzi_02.b() == null || fzi_02.a() == null) {
            return null;
        }
        return this.a.b(fzi_02.a(), fzi_02.b());
    }

    @Override
    public void a(fvE fvE2) {
        fvE2.destroySelfFromParent();
    }
}

