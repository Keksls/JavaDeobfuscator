/*
 * Decompiled with CFR 0.152.
 */
class fsl
extends fig_2 {
    final /* synthetic */ fsk a;

    fsl(fsk fsk2) {
        this.a = fsk2;
    }

    public boolean a() {
        return false;
    }

    @Override
    public fjf_2 getContentMinSize(fso fso2) {
        return this.a.getContentPrefSize();
    }

    @Override
    public fjf_2 getContentPreferedSize(fso fso2) {
        fjf_2 fjf_22 = this.a.m != null ? this.a.m.getPrefSize() : new fjf_2();
        fjf_2 fjf_23 = this.a.n != null ? this.a.n.getPrefSize() : new fjf_2();
        fjf_22.height = Math.max(fjf_22.height, fjf_23.height);
        fjf_22.width += fjf_23.width;
        return fjf_22;
    }

    @Override
    public void a(fso fso2) {
        int n = 0;
        if (this.a.n != null && this.a.n.getVisible()) {
            this.a.n.setSizeToPrefSize();
            n = this.a.n.getSize().width;
            this.a.n.setPosition(this.a.m_appearance.getContentWidth() - n, (this.a.m_appearance.getContentHeight() - this.a.n.getHeight()) / 2);
        }
        if (this.a.m != null && this.a.m.getVisible()) {
            this.a.m.setPosition(0, 0);
            this.a.m.setSize(new fjf_2(this.a.m_appearance.getContentWidth() - n, this.a.m_appearance.getContentHeight()));
        }
    }
}

