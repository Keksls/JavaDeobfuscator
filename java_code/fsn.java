/*
 * Decompiled with CFR 0.152.
 */
class fsn
extends fig_2 {
    final /* synthetic */ fsm_0 a;

    fsn(fsm_0 fsm_02) {
        this.a = fsm_02;
    }

    @Override
    public fjf_2 getContentPreferedSize(fso fso2) {
        fjf_2 fjf_22 = this.a.h.getPrefSize();
        return new fjf_2(fjf_22.width * 3, fjf_22.height * 3);
    }

    @Override
    public fjf_2 getContentMinSize(fso fso2) {
        return this.getContentPreferedSize(fso2);
    }

    @Override
    public void a(fso fso2) {
        int n = fso2.getAppearance().getContentWidth();
        int n2 = fso2.getAppearance().getContentHeight();
        this.a.f.setPosition(0, 0);
        this.a.f.setSize(n, n2);
        this.a.h.setSizeToPrefSize();
        this.a.g.setSizeToPrefSize();
        int n3 = n / 2 - this.a.h.getWidth() / 2;
        int n4 = n / 2 + (int)((float)n3 * Hw.i(this.a.i));
        int n5 = n2 / 2 + (int)((float)n3 * Hw.h(this.a.i));
        this.a.h.setPosition(n4 - this.a.h.getWidth() / 2, n5 - this.a.h.getHeight() / 2);
        this.a.g.setPosition(n4 - this.a.g.getWidth() / 2, n5 - this.a.g.getHeight() / 2);
    }
}

