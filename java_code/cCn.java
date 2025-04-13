/*
 * Decompiled with CFR 0.152.
 */
class cCn
implements abb_0 {
    final /* synthetic */ ccm_0 a;

    cCn(ccm_0 ccm_02) {
        this.a = ccm_02;
    }

    @Override
    public void animationEnded(abu abu2) {
        pj_0 pj_02 = ((ph_0)((Object)abu2)).d();
        if (pj_02 != null) {
            ccm_0.a(pj_02, false);
            ccm_1.g().a(pj_02);
        }
        abu2.b(this);
    }
}

