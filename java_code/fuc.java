/*
 * Decompiled with CFR 0.152.
 */
class fuc
extends fig_2 {
    final /* synthetic */ ftx_0 a;

    fuc(ftx_0 ftx_02) {
        this.a = ftx_02;
    }

    public boolean a() {
        return false;
    }

    @Override
    public fjf_2 getContentMinSize(fso fso2) {
        fjf_2 fjf_22 = this.a.v.getMinSize();
        fjf_2 fjf_23 = this.a.w.getMinSize();
        fjf_2 fjf_24 = this.a.x.getMinSize();
        if (this.a.t) {
            return new fjf_2(fjf_22.width + fjf_23.width + fjf_24.width, Math.max(fjf_22.height, Math.max(fjf_23.height, fjf_24.height)));
        }
        return new fjf_2(Math.max(fjf_22.width, Math.max(fjf_23.width, fjf_24.width)), fjf_22.height + fjf_23.height + fjf_24.height);
    }

    @Override
    public fjf_2 getContentPreferedSize(fso fso2) {
        fjf_2 fjf_22 = this.a.v.getPrefSize();
        fjf_2 fjf_23 = this.a.w.getPrefSize();
        fjf_2 fjf_24 = this.a.x.getPrefSize();
        if (this.a.t) {
            return new fjf_2(fjf_22.width + fjf_23.width + fjf_24.width, Math.max(fjf_22.height, Math.max(fjf_23.height, fjf_24.height)));
        }
        return new fjf_2(Math.max(fjf_22.width, Math.max(fjf_23.width, fjf_24.width)), fjf_22.height + fjf_23.height + fjf_24.height);
    }

    @Override
    public void a(fso fso2) {
        if (this.a.t) {
            int n = this.a.getAppearance().getContentHeight();
            this.a.v.setSize((int)this.a.v.getPrefSize().getWidth(), n);
            this.a.w.setSize((int)this.a.w.getPrefSize().getWidth(), n);
            this.a.x.setSize(this.a.getAppearance().getContentWidth() - this.a.v.getWidth() - this.a.w.getWidth(), n);
        } else {
            int n = this.a.getAppearance().getContentWidth();
            this.a.v.setSize(n, (int)this.a.v.getPrefSize().getHeight());
            this.a.w.setSize(n, (int)this.a.w.getPrefSize().getHeight());
            this.a.x.setSize(n, this.a.getAppearance().getContentHeight() - this.a.v.getHeight() - this.a.w.getHeight());
        }
        this.a.a();
    }
}

