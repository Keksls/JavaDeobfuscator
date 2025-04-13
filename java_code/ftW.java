/*
 * Decompiled with CFR 0.152.
 */
public class ftW
extends fig_2 {
    final /* synthetic */ ftv_0 a;

    public ftW(ftv_0 ftv_02) {
        this.a = ftv_02;
    }

    public boolean a() {
        return false;
    }

    @Override
    public fjf_2 getContentMinSize(fso fso2) {
        return new fjf_2(this.a.m_appearance.getContentWidth(), this.a.m_appearance.getContentHeight());
    }

    @Override
    public fjf_2 getContentPreferedSize(fso fso2) {
        return new fjf_2(this.a.m_appearance.getContentWidth(), this.a.m_appearance.getContentHeight());
    }

    @Override
    public void a(fso fso2) {
        this.a.c.setSize(this.a.getAppearance().getContentWidth(), this.a.getAppearance().getContentHeight());
        this.a.c.setPosition(0, 0);
        this.a.a.setSize(this.a.getAppearance().getContentWidth(), this.a.getAppearance().getContentHeight());
        this.a.a.setPosition(0, 0);
    }
}

