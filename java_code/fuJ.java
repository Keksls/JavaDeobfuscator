/*
 * Decompiled with CFR 0.152.
 */
class fuJ
extends fig_2 {
    final /* synthetic */ fuh_0 a;

    fuJ(fuh_0 fuh_02) {
        this.a = fuh_02;
    }

    @Override
    public fjf_2 getContentMinSize(fso fso2) {
        fjf_2 fjf_22 = this.a.h.getMinSize();
        return new fjf_2(fjf_22.width + this.a.h.getAppearance().getInsetWidth() + this.a.getClearButtonFullWidth() + this.a.getSearchButtonFullWidth(), Math.max(fjf_22.height + this.a.h.getAppearance().getInsetHeight(), Math.max(this.a.getClearButtonHeight(), this.a.getSearchButtonHeight())));
    }

    @Override
    public fjf_2 getContentPreferedSize(fso fso2) {
        fjf_2 fjf_22 = this.a.h.getPrefSize();
        return new fjf_2(fjf_22.width + this.a.h.getAppearance().getInsetWidth() + this.a.getClearButtonFullWidth() + this.a.getSearchButtonFullWidth(), Math.max(fjf_22.height + this.a.h.getAppearance().getInsetHeight(), Math.max(this.a.getClearButtonHeight(), this.a.getSearchButtonHeight())));
    }

    @Override
    public void a(fso fso2) {
        int n = fso2.getAppearance().getContentWidth();
        int n2 = fso2.getAppearance().getContentHeight();
        if (n <= 0 || n2 <= 0) {
            return;
        }
        if (!this.a.al) {
            return;
        }
        int n3 = this.a.getSearchButtonFullWidth();
        boolean bl = this.a.aw;
        int n4 = bl ? this.a.getClearButtonFullWidth() : 0;
        boolean bl2 = false;
        boolean bl3 = false;
        this.a.h.setPosition(0 + n3, 0);
        this.a.h.setSize(n - (n3 + n4), n2);
        boolean bl4 = this.a.f && bl;
        this.a.j.setVisible(bl4);
        if (bl4) {
            this.a.j.setPosition(n - this.a.j.getWidth(), n2 / 2 - this.a.j.getHeight() / 2);
        }
        if (this.a.e) {
            this.a.i.setPosition(0, n2 / 2 - this.a.i.getHeight() / 2);
        }
        this.a.al = false;
    }
}

