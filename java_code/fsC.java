/*
 * Decompiled with CFR 0.152.
 */
class fsC
extends fig_2 {
    final /* synthetic */ fsy_0 a;

    fsC(fsy_0 fsy_02) {
        this.a = fsy_02;
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
        return this.a.l != null ? this.a.l.getPrefSize() : new fjf_2();
    }

    @Override
    public void a(fso fso2) {
        if (this.a.l != null && this.a.l.getVisible()) {
            this.a.l.setPosition(0, 0);
            this.a.l.setSize(new fjf_2(this.a.m_appearance.getContentWidth(), this.a.m_appearance.getContentHeight()));
        }
    }
}

